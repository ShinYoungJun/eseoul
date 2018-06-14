package main.java.gapan.jumyong.web;


import main.java.common.util.BoardUtil;
import main.java.common.util.Globals;

import java.text.SimpleDateFormat;
import java.util.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import org.springframework.validation.BindException;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;
import org.springframework.web.bind.ServletRequestUtils;


import main.java.gapan.jumyong.model.ConfBean;
import main.java.gapan.jumyong.service.*;

public class ConfBoardFormControl extends SimpleFormController {	
	
  	/**
  	 * conf ����Ʈ ��ȸ 
	 * @param HttpServletRequest request
	 * @param HttpServletResponce responce
	 * @return ModelAndView
	 */
	
	private IJumyongService objJumyongService = null;
		
	
	public void setGapan_jumyongService(IJumyongService newObjJumyongService) {
		this.objJumyongService = newObjJumyongService;
	}
	
	public ConfBoardFormControl() {
		setBindOnNewForm(true);
	}
	
	protected Object formBackingObject(HttpServletRequest request)
	throws ServletException {
		
		String strFormView = null;
		
		String adminNo = ServletRequestUtils.getStringParameter(request,"no");		
		String mode = ServletRequestUtils.getStringParameter(request,"mode");
		String seq = ServletRequestUtils.getStringParameter(request,"seq");
		String section = ServletRequestUtils.getStringParameter(request,"SECTION");		
		String gp_typ = ServletRequestUtils.getStringParameter(request,"gp_typ");	
		String strCurrentPage = ServletRequestUtils.getStringParameter(request, "currentPage", Globals.DEFAULT_CURRENT_PAGE);
		String strCountPerPage = ServletRequestUtils.getStringParameter(request, "countPerPage", "4");
		
		
		
		if(mode == null)
			mode = "view";
		
		request.setAttribute("no", adminNo);
		request.setAttribute("gp_typ", gp_typ);
		request.setAttribute("SECTION", section);	
		request.setAttribute("mode", mode);		
		request.setAttribute("currentPage", strCurrentPage);
		request.setAttribute("countPerPage", strCountPerPage);
		
		ConfBean cb = new ConfBean();
		
		
		
		
		//��� ����Ʈ ȭ��
		List ConfList = objJumyongService.retrieveConfList(Integer.parseInt(strCurrentPage),4,adminNo, gp_typ);
		int listSize = ConfList.size();	
		request.setAttribute("listSize", String.valueOf((listSize)));
		
		

//		����Ʈ�� ����¡ html 
		String strPageDivideForm = BoardUtil.getDividePageForm(Integer.parseInt(strCurrentPage)
				,Integer.parseInt(strCountPerPage), "", "no="+adminNo+"&gp_typ="+gp_typ, "/gapan/jumyong/confEdit.do",objJumyongService.getConfListCount(adminNo));
		request.setAttribute("strPageDivideForm", strPageDivideForm);
		
		
		
		
		if(!mode.equals("add"))			//confinspectInfo �� ������ �־�� �ɶ�(�߰��� �ƴҶ�)
		{
			if(listSize > 0)
			{	
				
//				 seq�� ������ ����Ʈ�� ù��° ���� info ������ �ֱ�
				if(seq == null || seq.equals("")||seq.equals("null"))
				{					
					seq = String.valueOf(((ConfBean)ConfList.get(0)).getSEQ());
				}				
				System.out.println("adminNo:"+adminNo+"! seq:"+seq+"!");
				List ConfInfoList = objJumyongService.ConfInfo(adminNo, seq, gp_typ);
				cb= (ConfBean)ConfInfoList.get(0);		
				seq = String.valueOf(cb.getSEQ());
				
				// ��¥�� '-' ǥ��
				String strConf_date = cb.getCONF_DATE();
				if(strConf_date != null)
					cb.setCONF_DATE(addDash(strConf_date));

//				��� ����Ʈ ���� ���ڼ� �̻� �ڸ���		
					int textLength = 20;			
					for(int i=0;i<ConfList.size();i++)
			  		{
			  			String confComment = ((ConfBean)ConfList.get(i)).getCONF_COMMENT();
			  			
			  			
			  			if(confComment != null && confComment.length()>=textLength)
			  				((ConfBean)ConfList.get(i)).setCONF_COMMENT((confComment.substring(0,textLength)+".."));	  			
			  		}
						
					
				
			}else // list�� �������� �߰��̹Ƿ� mode ������ �ٷ� return
			{
				mode = "add";
				request.setAttribute("mode", mode);							
			}
		}
		
		request.setAttribute("CList", ConfList);
		//�߰� �϶� �������� ���� ��¥��.
		if(mode.equals("add"))
		{
		//			���� ��¥ , 7���� ��¥ ���ϱ�
			Calendar cal = Calendar.getInstance();
			
			SimpleDateFormat  sdf  =  new SimpleDateFormat("yyyyMMdd");      // ������ ��� ���� ����
			cb.setCONF_DATE(addDash(sdf.format (cal.getTime())));      // ���� ��¥ ������ ����
		}		
		
		request.setAttribute("seq",  seq);
		setSuccessView("redirect:/gapan/jumyong/confEdit.do?no="+adminNo+"&seq="+seq+"&gp_typ="+gp_typ);
		return cb;
	}
	
		
	protected ModelAndView onSubmit(HttpServletRequest request
			, HttpServletResponse response, Object command
			, BindException errors) throws Exception	 {

		try
		{
			ConfBean objConfBean = (ConfBean)command;
			String adminNo = ServletRequestUtils.getStringParameter(request,"no");
			String mode = ServletRequestUtils.getStringParameter(request,"mode");
			String seq = ServletRequestUtils.getStringParameter(request,"seq");
			String gp_typ = ServletRequestUtils.getStringParameter(request,"gp_typ");	
			
			objConfBean.setADMIN_NO(adminNo);
			objConfBean.setCONF_DATE(removeDash(objConfBean.getCONF_DATE()));
			objConfBean.setGP_TYP(gp_typ);
			
			if( !seq.equals(""))
				objConfBean.setSEQ(Integer.parseInt(seq));
			
			if(mode.equals("add"))
				objJumyongService.insertConf(objConfBean);
			
			else if(mode.equals("edit"))			
				objJumyongService.updateConf(objConfBean);			
		
		}catch(Exception err)
		{
			System.out.println(err.toString());
		}
		return new ModelAndView(getSuccessView());
	}
	

	public String removeDash(String val1)
	{			
		String[] components = val1.split("-");		
		String returnVal = "";		
		for(int i=0;i<components.length;i++)
			returnVal = returnVal + components[i].toString();
		
		return returnVal;		
	}


	public String addDash(String val1)
	{	
		if(val1.length() >= 8)
			val1 = val1.substring(0,4)+"-"+val1.substring(4,6)+"-"+val1.substring(6,8);
		else if(val1.length() >= 6)
			val1 = val1.substring(0,4)+"-"+val1.substring(4,6);
		
		return val1;
	}
}