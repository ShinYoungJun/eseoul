
package main.java.jumyong.junggi.web;


import main.java.common.util.BoardUtil;
import main.java.common.util.Globals;



import java.text.SimpleDateFormat;
import java.util.*;
import java.net.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.validation.BindException;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;
import org.springframework.web.bind.ServletRequestUtils;

import main.java.common.util.*;
import main.java.jumyong.jumyong.service.IJumyongService;



import main.java.jumyong.jumyong.model.ProductBean;
import main.java.jumyong.jumyong.model.jumyongBean;
import main.java.jumyong.saewe.model.TaxationBean;


import main.java.jumyong.junggi.service.*;

public class productSubtractBeforeTaxBoardFormControl extends SimpleFormController {	
	
  	/**
  	 * CALCULATION ����Ʈ ��ȸ
	 * @param HttpServletRequest request
	 * @param HttpServletResponce responce
	 * @return ModelAndView
	 */
	
	private IJunggiService objImpositionService = null;
	
	private IJumyongService objJumyongService = null;
	
	
	
		
	
	public void setImpositionService (JunggiService newObjImpositionService)
	{
		this.objImpositionService = newObjImpositionService;
	}
	
	public void setJumyongService(IJumyongService newObjJumyongService) {
		this.objJumyongService = newObjJumyongService;
	}
	
	
	
	public productSubtractBeforeTaxBoardFormControl() {
		setBindOnNewForm(true);
	}
	
	protected Object formBackingObject(HttpServletRequest request)
	throws ServletException {
		
		HttpSession session = request.getSession();		
		String 		userId	= (String)session.getAttribute("sessionUserId");							
		
		try{
			if(userId != null){
		
				String mode = ServletRequestUtils.getStringParameter(request,"mode");
				String adminNo = ServletRequestUtils.getStringParameter(request,"no");			
				String strSeq = ServletRequestUtils.getStringParameter(request,"SEQ","");			
				String strCurrentPage = ServletRequestUtils.getStringParameter(request, "currentPage", Globals.DEFAULT_CURRENT_PAGE);			
				String strCountPerPage = ServletRequestUtils.getStringParameter(request, "countPerPage", "4");
				String area_sub = ServletRequestUtils.getStringParameter(request, "area", "");		//���ҵ� ����
				
				int countPerPage = Integer.parseInt(strCountPerPage);
				
				request.setAttribute("no", adminNo);
				request.setAttribute("area", area_sub);
				request.setAttribute("currentPage", strCurrentPage);
				request.setAttribute("mode", mode);
				
				
	//			���� ����Ʈ
				List productList2 = objJumyongService.ProductList(Integer.parseInt(strCurrentPage),4,adminNo);
				
				request.setAttribute("productList", productList2);
	//			����Ʈ�� ����¡ html 
				String strPageDivideForm = BoardUtil.getDividePageForm(Integer.parseInt(strCurrentPage)
						,4, "", "no="+adminNo, "/jumyong/productInsert.do", objJumyongService.getProductListCount(adminNo));			
				request.setAttribute("strPageDivideForm", strPageDivideForm);
				
				
	////////////info	
				
				//info����
				ProductBean pb = objImpositionService.impositionInfo(strSeq);
				float area = objImpositionService.getProductAreaSum(pb.getFIRST_SEQ());
				
				pb.setAREA_AFTER(area);
				
				//��¥�� �뽬(-) �߰�
				if(pb.getFROMDATE() != null) pb.setFROMDATE(addDash(pb.getFROMDATE()));			
				if(pb.getTODATE() != null) pb.setTODATE(addDash(pb.getTODATE()));		
				
				//��¥�� �뽬(-) �߰� ��
	
				request.setAttribute("seq", strSeq);
				
				
	////////////			
				//forwview ����
				String strFormView = "/jumyong/junggi/info_productSub";
				setFormView(strFormView);
			
				
				if(mode.equals("add"))
				{
					
					String yearVal1  = String.valueOf(Integer.parseInt(pb.getYEAR())+1);
					if(pb.getUSE_SECTION().trim().equals("2")) //����
					{	
						double sum_lastYear = pb.getAREA_AFTER()*pb.getPRICE()*pb.getRATE();	
						
						sum_lastYear = Math.floor( sum_lastYear);
						pb.setSUM_LASTYEAR((int)sum_lastYear);
						request.setAttribute("old_form", pb.getAREA_AFTER()+"�� * " +pb.getRATE()+" * "+pb.getPRICE()+" * 12/12");
					}else
					{
						pb.setSUM_LASTYEAR(pb.getSUM_ADJUST());
						
						request.setAttribute("old_form",pb.getYEAR()+"�⵵ �����");
					}
					
					pb.setSUM_YEAR(0);
					pb.setSUM_ADJUST(0);
					
					pb.setFORM("");
					pb.setFORM_ADJUST("");
					
					pb.setFROMDATE(yearVal1+"0101");
					
					
					pb.setTODATE(yearVal1+"1231");
					
					request.setAttribute("old_use_section",pb.getUSE_SECTION());				
					request.setAttribute("old_price",String.valueOf(pb.getPRICE()));
					request.setAttribute("old_rate",String.valueOf(pb.getRATE()));
					
					request.setAttribute("old_area_after",String.valueOf(pb.getAREA_AFTER()));
					
					pb.setPRICE(0);
					
					pb.setRATE(  Float.valueOf(objJumyongService.getYoyul(adminNo)).floatValue());
					
					pb.setPERIOD(12);
					
					pb.setYEAR( yearVal1 );
					
					pb.setAREA_AFTER(Float.valueOf(area_sub).floatValue());
					
					
					
				}
				
				
				//System.out.println("1111159");
				
				
				//������ ������ ���ư� ������
				setSuccessView("redirect:/jumyong/productInsert.do?no="+adminNo);			
				
				//��¥�� �뽬(-) �߰�						
				//if(pb.getINDATE() != null) pb.setINDATE(  addDash(pb.getINDATE()) );			
				//if(pb.getOVERDATE() != null) pb.setOVERDATE(addDash(pb.getOVERDATE()));			
				//if(pb.getTAX_DATE() != null) pb.setTAX_DATE(addDash(pb.getTAX_DATE()));			
				if(pb.getFROMDATE() != null) pb.setFROMDATE(addDash(pb.getFROMDATE()));			
				if(pb.getTODATE() != null) pb.setTODATE(addDash(pb.getTODATE()));			
				//if(pb.getLASTFROMDATE() != null) pb.setLASTFROMDATE(addDash(pb.getLASTFROMDATE()));			
				//if(pb.getLASTTODATE() != null) pb.setLASTTODATE(addDash(pb.getLASTTODATE()));			
				//��¥�� �뽬(-) �߰� ��			
				
				return pb;
			}
		}catch(Exception err)
		{
			System.out.println("error:"+err.toString());
		}
		
		ProductBean pb2 = new ProductBean();
		
		
				
		return pb2;
		
	}	
		
	protected ModelAndView onSubmit(HttpServletRequest request
			, HttpServletResponse response, Object command
			, BindException errors) throws Exception	 {
		try
		{
			//�Է� ���� ���� mode�� ������ ��		
			String mode = ServletRequestUtils.getStringParameter(request,"mode");
			String adminNo = ServletRequestUtils.getStringParameter(request,"no");
			
			
			ProductBean objProductBean = (ProductBean)command;
			
			objProductBean.setFROMDATE( removeDash(objProductBean.getFROMDATE()));
			objProductBean.setTODATE(removeDash(objProductBean.getTODATE()));
			objProductBean.setUSE_SECTION("2");
			
			
			if(mode.equals("add"))
			{
				
////			cal_sum_info �� �Է�
				ProductBean pb2 = objProductBean;
				//cal_sum_info seq ����
				int cal_sum_seq = objJumyongService.getCal_Sum_Seq();
				pb2.setSEQ(String.valueOf(cal_sum_seq));
				//use_section 2				
				
				//// calculation_info �� �Է�
				//cal_sum_seq ����
				objProductBean.setCAL_SUM_SEQ(String.valueOf(cal_sum_seq));				
				objJumyongService.insertProduct(objProductBean);
				
				
//				cal_sum_info �Է�				
				pb2.setFORM_ADJUST(objJumyongService.FormAdjustList(cal_sum_seq));				
				objJumyongService.Cal_Sum_InfoInsert(pb2);			
				
				///////////////////////////////////////////////////////////////////////////////////////////////////
				
				
				
				
				
				objJumyongService.SetCheckYn(objProductBean.getADMIN_NO());
				objJumyongService.SetTaxYn(objProductBean.getADMIN_NO());
				
				
				
				
				
			}
			else if(mode.equals("edit"))
			{
				
				
				//calculation ���� ����
				objJumyongService.updateProduct(objProductBean);
				//���� �̰��� -> ����� ���� , �ΰ� , �̺ΰ� -> �̺ΰ��� ����					
				objJumyongService.SetCheckYn(objProductBean.getADMIN_NO());
				objJumyongService.SetTaxYn(objProductBean.getADMIN_NO());
			}
			
		
		}catch(Exception err)
		{
			System.out.println("�Է�,��������="+err.toString());
		}
		
		return new ModelAndView(getSuccessView());
	}
	
	public String addDash(String val1)
	{
		if(val1.length() > 8)
		return val1.substring(0,4)+"-"+val1.substring(4,6)+"-"+val1.substring(6,8);
		else return val1;
	}
	
	public String removeDash(String val1)
	{			
		String[] components = val1.split("-");		
		String returnVal = "";		
		for(int i=0;i<components.length;i++)
			returnVal = returnVal + components[i].toString();
		
		return returnVal;		
	}
	
	
	public String removeDash1(String val1)
	{			
		String[] components = val1.split(".");		
		String returnVal = "";		
		for(int i=0;i<components.length;i++)
			returnVal = returnVal + components[i].toString();
		
		return returnVal;		
	}
	
	
	
	
	
}
