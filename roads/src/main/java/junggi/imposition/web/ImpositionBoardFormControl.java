
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
  	 * CALCULATION 리스트 조회
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
			
			//현년도 계산								
			Date date = new Date();
			Calendar cal = Calendar.getInstance();
			SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd");
				  
			String thisDate = formatter.format(cal.getTime());			
			String thisYear = thisDate.substring(0,4);
			
			
			//현년도 로 추가 가능 변수 설정			
			if(  Integer.parseInt(objImpositionService.getLastYear(adminNo)) < Integer.parseInt(thisYear))   // 가장 나중 년도 가 현년도 와 다르면 보여준다.
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

			
			
				//forwview 설정
				String strFormView = "/junggi/imposition/info_product";
				setFormView(strFormView);
			
				if(listSize > 0) // 리스트가 있을때
				{	
					
					//화면에 제일 처음 들어올경우 strYear가 없을시 리스트의 제일 상단 년도 가져옴
					if(strYear == null || strYear.equals("")||strYear.equals("null"))  
					{						
						strYear = String.valueOf(((impositionBean)impositionList.get(0)).getYEAR());						
					}					
					
					//info에 맞는 정보 가져옴
					ib = objImpositionService.impositionInfo(adminNo,strYear);
					if(ib == null)	ib = new impositionBean();
					
					//info 에 작년도 점용료, 작년도 점용기간 표시
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
					
					// 작년도 점욜료,기간 표시 끝
					
					
					
					
				
				request.setAttribute("impositionList", impositionList);
				}else	// add로 설정해줌
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
				
			//페이지 성공후 돌아갈 페이지ADMIN_NO=200911680107-1-0001&year=2009
			setSuccessView("redirect:/junggi/imposition/imposition.do?ADMIN_NO="+adminNo);			
			
			
			
			request.setAttribute("seq", ib.getSEQ());
			
			if(objImpositionService.getTaxYn(ib.getTSEQ()).toString().equals("0")) // 0(미부과)이면 보여주고 그외에는 안보여준다.
				request.setAttribute("showEdit", "true");
			else
				request.setAttribute("showEdit", "false");
			
			
			
			//날짜에 대쉬(-) 추가						
			if(ib.getINDATE() != null) ib.setINDATE(  addDash(ib.getINDATE()) );			
			if(ib.getOVERDATE() != null) ib.setOVERDATE(addDash(ib.getOVERDATE()));			
			if(ib.getTAX_DATE() != null) ib.setTAX_DATE(addDash(ib.getTAX_DATE()));			
			if(ib.getFROMDATE() != null) ib.setFROMDATE(addDash(ib.getFROMDATE()));			
			if(ib.getTODATE() != null) ib.setTODATE(addDash(ib.getTODATE()));			
			if(ib.getLASTFROMDATE() != null) ib.setLASTFROMDATE(addDash(ib.getLASTFROMDATE()));			
			if(ib.getLASTTODATE() != null) ib.setLASTTODATE(addDash(ib.getLASTTODATE()));			
			//날짜에 대쉬(-) 추가 끝			
			
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
			//입력 수정 위해 mode를 가지고 옴		
			String mode = ServletRequestUtils.getStringParameter(request,"mode");

			//command -> impositionBean에 넣음
			impositionBean objInspectBean = (impositionBean)command;
			
			//calculation_info 입력 위해 product bean 에 입력
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
			
			//Taxation 입력 위해 해당 seq로 taxation info를 찾음	//add일때는 taxation 에관한 정보는 1년전것이 들어감	//수시에서 정기로 넘어가기 때문에 1년
			//전 데이타가 항상 있음.
			String 	TSEQ			= objInspectBean.getTSEQ();			
			TaxationBean	objTaxationBean	= new TaxationBean();
			List list1 = iSaeweService.executeBugwa_View(objInspectBean.getADMIN_NO(), TSEQ);
			
			if(list1.size() > 0)
			{	
				//값이 있을때 taxation 에  바뀔 데이타를 입력함
				objTaxationBean = (TaxationBean)list1.get(0);			
				objTaxationBean.setINDATE(removeDash(objInspectBean.getINDATE()));
				objTaxationBean.setOVERDATE(removeDash(objInspectBean.getOVERDATE()));
				objTaxationBean.setTAX_DATE(removeDash(objInspectBean.getTAX_DATE()));
				objTaxationBean.setBONSE(String.valueOf(objInspectBean.getSUM_ADJUST()));
				objTaxationBean.setVAT(String.valueOf(objInspectBean.getSUM_ADJUST()/10));
				objTaxationBean.setINTAX(String.valueOf(objInspectBean.getSUM_ADJUST()));
				objTaxationBean.setFORM1(objInspectBean.getFORM());
				objTaxationBean.setFORM2(objInspectBean.getFORM_ADJUST());
				
				//tax_ym은 tax_date 의 앞 6자리
				if(objTaxationBean.getTAX_DATE() != null)
					objTaxationBean.setTAX_YM(objTaxationBean.getTAX_DATE().substring(0,6));

				//product의 seq를 taxationbean에 넣어줌 (수정용) (add시는 다시 입력)
				objTaxationBean.setSEQ(objProductBean.getSEQ());
				
				System.out.println("objProductBean"+objProductBean.getADJUSTMENT());
				
				if(mode.equals("add"))
				{
					//과세번호 없앰
					objTaxationBean.setTAX_NO(" ");
					//calculation 에 입력
					objJumyongService.insertProduct(objProductBean);
					//입력된 seq 번호를 taxation에 입력하기 위해 set
					objTaxationBean.setSEQ( String.valueOf(objImpositionService.getProductSeq(objProductBean.getADMIN_NO(),objProductBean.getYEAR())) );
					//taxation에 입력
					iSaeweService.executeBugwa_Register(objTaxationBean);					
					//검토 미검토 -> 검토로 수정 , 부과 , 미부과 -> 미부과로 수정
					objJumyongService.SetCheckYn(objProductBean.getADMIN_NO());
					objJumyongService.SetTaxYn(objProductBean.getADMIN_NO());
				}
				else if(mode.equals("edit"))
				{
					//taxation 정보 수정
					iSaeweService.executeBugwa_Modify(objTaxationBean);
					//calculation 정보 수정
					objJumyongService.updateProduct(objProductBean);					
					//검토 미검토 -> 검토로 수정 , 부과 , 미부과 -> 미부과로 수정					
					objJumyongService.SetCheckYn(objProductBean.getADMIN_NO());
					objJumyongService.SetTaxYn(objProductBean.getADMIN_NO());
				}
			}
		
		}catch(Exception err)
		{
			System.out.println("입력,수정에러="+err.toString());
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
