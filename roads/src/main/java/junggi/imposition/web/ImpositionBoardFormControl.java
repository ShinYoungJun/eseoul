
package main.java.junggi.imposition.web;


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
import main.java.jumyong.saewe.service.ISaeweService;

import main.java.junggi.imposition.model.impositionBean;
import main.java.jumyong.jumyong.model.ProductBean;
import main.java.jumyong.jumyong.model.jumyongBean;
import main.java.jumyong.saewe.model.TaxationBean;


import main.java.junggi.imposition.service.*;

public class ImpositionBoardFormControl extends SimpleFormController {	
	
  	/**
  	 * CALCULATION ����Ʈ ��ȸ
	 * @param HttpServletRequest request
	 * @param HttpServletResponce responce
	 * @return ModelAndView
	 */
	
	private IImpositionService objImpositionService = null;
	
	private IJumyongService objJumyongService = null;
	
	private	ISaeweService		iSaeweService	= null;
	
		
	
	public void setImpositionService (ImpositionService newObjImpositionService)
	{
		this.objImpositionService = newObjImpositionService;
	}
	
	public void setJumyongService(IJumyongService newObjJumyongService) {
		this.objJumyongService = newObjJumyongService;
	}
	
	public void setSaeweService(ISaeweService saeweService) 
	{
		this.iSaeweService = saeweService;
	}
	
	public ImpositionBoardFormControl() {
		setBindOnNewForm(true);
	}
	
	protected Object formBackingObject(HttpServletRequest request)
	throws ServletException {
		
		try
		{
			
			String adminNo = ServletRequestUtils.getStringParameter(request,"ADMIN_NO");		
			String mode = ServletRequestUtils.getStringParameter(request,"mode");					
			String strCurrentPage = ServletRequestUtils.getStringParameter(request, "currentPage", Globals.DEFAULT_CURRENT_PAGE);
			String strCountPerPage = ServletRequestUtils.getStringParameter(request, "countPerPage", "4");
			String strYear = ServletRequestUtils.getStringParameter(request,"year");
			
			//���⵵ ���								
			Date date = new Date();
			Calendar cal = Calendar.getInstance();
			SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd");
				  
			String thisDate = formatter.format(cal.getTime());			
			String thisYear = thisDate.substring(0,4);
			
			
			//���⵵ �� �߰� ���� ���� ����			
			if(  Integer.parseInt(objImpositionService.getLastYear(adminNo)) < Integer.parseInt(thisYear))   // ���� ���� �⵵ �� ���⵵ �� �ٸ��� �����ش�.
				request.setAttribute("showAdd", "true");
			else
				request.setAttribute("showAdd", "false");
			
			if(mode == null)
				mode = "view";
			
			request.setAttribute("no", adminNo);
			request.setAttribute("mode", mode);
			request.setAttribute("currentPage", strCurrentPage);
			request.setAttribute("countPerPage", strCountPerPage);			
						
			request.setAttribute("year", strYear);
			request.setAttribute("no", adminNo);
			
			String checkYn="";
			
			
			impositionBean ib = new impositionBean();
			
			
			
			List impositionList = objImpositionService.impositionList(adminNo,Integer.parseInt(strCurrentPage),4);
	
			
			int listSize = impositionList.size();	
			request.setAttribute("listSize", String.valueOf((listSize)));
			
			
			
			
			String strPageDivideForm = BoardUtil.getDividePageForm(Integer.parseInt(strCurrentPage)
					,4, "", "ADMIN_NO="+adminNo, "/junggi/imposition/imposition.do", objImpositionService.getProductListCount(adminNo));
			
			System.out.println(strPageDivideForm);
			
			
			request.setAttribute("strPageDivideForm", strPageDivideForm);		

			
			
				//forwview ����
				String strFormView = "/junggi/imposition/info_product";
				setFormView(strFormView);
			
				if(listSize > 0) // ����Ʈ�� ������
				{	
					
					//ȭ�鿡 ���� ó�� ���ð�� strYear�� ������ ����Ʈ�� ���� ��� �⵵ ������
					if(strYear == null || strYear.equals("")||strYear.equals("null"))  
					{						
						strYear = String.valueOf(((impositionBean)impositionList.get(0)).getYEAR());						
					}					
					
					//info�� �´� ���� ������
					ib = objImpositionService.impositionInfo(adminNo,strYear);
					if(ib == null)	ib = new impositionBean();
					
					//info �� �۳⵵ �����, �۳⵵ ����Ⱓ ǥ��
					String mapYear = "";
					if(mode.equals("add")  )			 
					{	
						mapYear = String.valueOf(Integer.parseInt(thisYear) -1 );
					}else mapYear = String.valueOf(Integer.parseInt(strYear) -1 );					
					Map lastInfo = objImpositionService.getSum_LastYear(adminNo, mapYear );				
					
					if(!lastInfo.get("FROMDATE").equals(" "))
					{					
						int sum_lastyear = Integer.valueOf(lastInfo.get("SUM_ADJUST").toString()).intValue();
						String lastFromDate = lastInfo.get("FROMDATE").toString();
						String lastToDate = lastInfo.get("TODATE").toString();	
						ib.setLAST_SUM(sum_lastyear);
						ib.setLASTFROMDATE(lastFromDate);
						ib.setLASTTODATE(lastToDate);
					}
					
					// �۳⵵ �����,�Ⱓ ǥ�� ��
					
					
					
					
				
				request.setAttribute("impositionList", impositionList);
				}else	// add�� ��������
				{
					request.setAttribute("mode", "add");
					
					String yoyul = objJumyongService.getYoyul(adminNo);

					if( !yoyul.equals(""))
						ib.setRATE( Float.valueOf(yoyul).floatValue());
				}
				
				
				
				if(mode.equals("add"))			 
				{
					ib.setYEAR(thisYear);
					ib.setFROMDATE(thisYear+"0101");
					ib.setTODATE(thisYear+"1231");
					ib.setINDATE(thisYear+"0331");
					ib.setOVERDATE(thisYear+"0430");
					ib.setTAX_DATE(thisDate);
				}
						
				request.setAttribute("year",  strYear);
				
			//������ ������ ���ư� ������ADMIN_NO=200911680107-1-0001&year=2009
			setSuccessView("redirect:/junggi/imposition/imposition.do?ADMIN_NO="+adminNo);			
			
			
			
			request.setAttribute("seq", ib.getSEQ());
			
			if(objImpositionService.getTaxYn(ib.getTSEQ()).toString().equals("0")) // 0(�̺ΰ�)�̸� �����ְ� �׿ܿ��� �Ⱥ����ش�.
				request.setAttribute("showEdit", "true");
			else
				request.setAttribute("showEdit", "false");
			
			
			
			//��¥�� �뽬(-) �߰�						
			if(ib.getINDATE() != null) ib.setINDATE(  addDash(ib.getINDATE()) );			
			if(ib.getOVERDATE() != null) ib.setOVERDATE(addDash(ib.getOVERDATE()));			
			if(ib.getTAX_DATE() != null) ib.setTAX_DATE(addDash(ib.getTAX_DATE()));			
			if(ib.getFROMDATE() != null) ib.setFROMDATE(addDash(ib.getFROMDATE()));			
			if(ib.getTODATE() != null) ib.setTODATE(addDash(ib.getTODATE()));			
			if(ib.getLASTFROMDATE() != null) ib.setLASTFROMDATE(addDash(ib.getLASTFROMDATE()));			
			if(ib.getLASTTODATE() != null) ib.setLASTTODATE(addDash(ib.getLASTTODATE()));			
			//��¥�� �뽬(-) �߰� ��			
			
			return ib;
		}catch(Exception err)
		{
			System.out.println(err.toString());
		}
		
		impositionBean ib2 = new impositionBean();
				
		return ib2;
		
	}	
		
	protected ModelAndView onSubmit(HttpServletRequest request
			, HttpServletResponse response, Object command
			, BindException errors) throws Exception	 {
		try
		{
			//�Է� ���� ���� mode�� ������ ��		
			String mode = ServletRequestUtils.getStringParameter(request,"mode");

			//command -> impositionBean�� ����
			impositionBean objInspectBean = (impositionBean)command;
			
			//calculation_info �Է� ���� product bean �� �Է�
			ProductBean objProductBean = new ProductBean();
			objProductBean.setADMIN_NO(objInspectBean.getADMIN_NO());
			objProductBean.setYEAR(objInspectBean.getYEAR());						//year
			objProductBean.setPRICE(objInspectBean.getPRICE());						//price
			objProductBean.setFROMDATE(removeDash(objInspectBean.getFROMDATE()));	//fromdate
			objProductBean.setTODATE(removeDash(objInspectBean.getTODATE()));		//todate
			objProductBean.setAREA_AFTER(objInspectBean.getAREA_AFTER());			//area_after
			objProductBean.setRATE( objInspectBean.getRATE());						//rate
			objProductBean.setSUM_LASTYEAR( objInspectBean.getSUM_LASTYEAR());		//sum_lastyear
			objProductBean.setSUM_YEAR( objInspectBean.getSUM_YEAR());				//sum_year
			objProductBean.setSUM_ADJUST( objInspectBean.getSUM_ADJUST());			//sum_adjust			
			objProductBean.setFORM_ADJUST(objInspectBean.getFORM_ADJUST());			//form_adjust
			objProductBean.setFORM(objInspectBean.getFORM()); 						// form
			objProductBean.setPERIOD( objInspectBean.getPERIOD());					//period
			objProductBean.setADJUSTMENT( objInspectBean.getADJUSTMENT());			//adjustment
			objProductBean.setLICENSE_TAX(0);										//license_tax
			objProductBean.setSEQ(objInspectBean.getCSEQ());						//seq
			
			//Taxation �Է� ���� �ش� seq�� taxation info�� ã��	//add�϶��� taxation ������ ������ 1�������� ��	//���ÿ��� ����� �Ѿ�� ������ 1��
			//�� ����Ÿ�� �׻� ����.
			String 	TSEQ			= objInspectBean.getTSEQ();			
			TaxationBean	objTaxationBean	= new TaxationBean();
			List list1 = iSaeweService.executeBugwa_View(objInspectBean.getADMIN_NO(), TSEQ);
			
			if(list1.size() > 0)
			{	
				//���� ������ taxation ��  �ٲ� ����Ÿ�� �Է���
				objTaxationBean = (TaxationBean)list1.get(0);			
				objTaxationBean.setINDATE(removeDash(objInspectBean.getINDATE()));
				objTaxationBean.setOVERDATE(removeDash(objInspectBean.getOVERDATE()));
				objTaxationBean.setTAX_DATE(removeDash(objInspectBean.getTAX_DATE()));
				objTaxationBean.setBONSE(String.valueOf(objInspectBean.getSUM_ADJUST()));
				objTaxationBean.setVAT(String.valueOf(objInspectBean.getSUM_ADJUST()/10));
				objTaxationBean.setINTAX(String.valueOf(objInspectBean.getSUM_ADJUST()));
				objTaxationBean.setFORM1(objInspectBean.getFORM());
				objTaxationBean.setFORM2(objInspectBean.getFORM_ADJUST());
				
				//tax_ym�� tax_date �� �� 6�ڸ�
				if(objTaxationBean.getTAX_DATE() != null)
					objTaxationBean.setTAX_YM(objTaxationBean.getTAX_DATE().substring(0,6));

				//product�� seq�� taxationbean�� �־��� (������) (add�ô� �ٽ� �Է�)
				objTaxationBean.setSEQ(objProductBean.getSEQ());
				
				System.out.println("objProductBean"+objProductBean.getADJUSTMENT());
				
				if(mode.equals("add"))
				{
					//������ȣ ����
					objTaxationBean.setTAX_NO(" ");
					//calculation �� �Է�
					objJumyongService.insertProduct(objProductBean);
					//�Էµ� seq ��ȣ�� taxation�� �Է��ϱ� ���� set
					objTaxationBean.setSEQ( String.valueOf(objImpositionService.getProductSeq(objProductBean.getADMIN_NO(),objProductBean.getYEAR())) );
					//taxation�� �Է�
					iSaeweService.executeBugwa_Register(objTaxationBean);					
					//���� �̰��� -> ����� ���� , �ΰ� , �̺ΰ� -> �̺ΰ��� ����
					objJumyongService.SetCheckYn(objProductBean.getADMIN_NO());
					objJumyongService.SetTaxYn(objProductBean.getADMIN_NO());
				}
				else if(mode.equals("edit"))
				{
					//taxation ���� ����
					iSaeweService.executeBugwa_Modify(objTaxationBean);
					//calculation ���� ����
					objJumyongService.updateProduct(objProductBean);					
					//���� �̰��� -> ����� ���� , �ΰ� , �̺ΰ� -> �̺ΰ��� ����					
					objJumyongService.SetCheckYn(objProductBean.getADMIN_NO());
					objJumyongService.SetTaxYn(objProductBean.getADMIN_NO());
				}
			}
		
		}catch(Exception err)
		{
			System.out.println("�Է�,��������="+err.toString());
		}
		
		return new ModelAndView(getSuccessView());
	}
	
	public String addDash(String val1)
	{	
		return val1.substring(0,4)+"-"+val1.substring(4,6)+"-"+val1.substring(6,8);
	}
	
	public String removeDash(String val1)
	{			
		String[] components = val1.split("-");		
		String returnVal = "";		
		for(int i=0;i<components.length;i++)
			returnVal = returnVal + components[i].toString();
		
		return returnVal;		
	}
	
	
	
}
