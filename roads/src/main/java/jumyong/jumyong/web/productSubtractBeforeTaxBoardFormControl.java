
package main.java.jumyong.jumyong.web;


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
import org.springframework.web.bind.RequestUtils;
import org.springframework.web.bind.ServletRequestUtils;

import main.java.common.util.*;
import main.java.jumyong.jumyong.model.ConfBean;
import main.java.jumyong.jumyong.model.ProductBean;
import main.java.jumyong.jumyong.service.*;

public class productSubtractBeforeTaxBoardFormControl extends SimpleFormController {	
	
  	/**
  	 * CALCULATION 리스트 조회
	 * @param HttpServletRequest request
	 * @param HttpServletResponce responce
	 * @return ModelAndView
	 */
	
	private IJumyongService objJumyongService = null;
		
	
	public void setJumyongService(IJumyongService newObjJumyongService) {
		this.objJumyongService = newObjJumyongService;
	}
	
	public productSubtractBeforeTaxBoardFormControl() {
		setBindOnNewForm(true);
	}
	
	protected Object formBackingObject(HttpServletRequest request)
	throws ServletException {
//		 삭제 세션
		HttpSession session = request.getSession();		
		String 		userId	= (String)session.getAttribute("sessionUserId");				
		ProductBean pb = new ProductBean();
		
		try{
			if(userId != null){
				String adminNo = ServletRequestUtils.getStringParameter(request,"no");		
				String mode = ServletRequestUtils.getStringParameter(request,"mode");
				String seq = ServletRequestUtils.getStringParameter(request,"SEQ");		
				String strCurrentPage = ServletRequestUtils.getStringParameter(request, "currentPage", Globals.DEFAULT_CURRENT_PAGE);
				String strCountPerPage = ServletRequestUtils.getStringParameter(request, "countPerPage", "5");
				String area = ServletRequestUtils.getStringParameter(request, "area", "");			
				String year = ServletRequestUtils.getStringParameter(request, "year", "");
				
				if(seq == null)
					seq = ServletRequestUtils.getStringParameter(request,"seq");		
				
				
				
				request.setAttribute("no", adminNo);
				
				request.setAttribute("mode", mode);
				request.setAttribute("currentPage", strCurrentPage);
				request.setAttribute("countPerPage", strCountPerPage);
				request.setAttribute("seq", seq);
				request.setAttribute("year", year);
				request.setAttribute("area", area);
				
				String strFormView = "/jumyong/jumyong/info_product_subtractBeforeTax";
				setFormView(strFormView);
				//상위 리스트
				List productList = objJumyongService.ProductList(Integer.parseInt(strCurrentPage),5,adminNo);
				request.setAttribute("productList", productList);
				
				//리스트의 페이징 html 
				String strPageDivideForm = BoardUtil.getDividePageForm(Integer.parseInt(strCurrentPage)
						,5, "", "no="+adminNo, "/jumyong/productInsert.do", objJumyongService.getProductListCount(adminNo));			
				request.setAttribute("strPageDivideForm", strPageDivideForm);
											
				if(mode.equals("add"))
				{	
					pb.setAREA_AFTER(Float.valueOf(area).floatValue());
					pb.setFORM_ADJUST("");
					pb.setPREV_SEQ(seq);
					pb.setSUM_ADJUST(0);
					pb.setYEAR(year);
					//add 일때 요율 구하기	
						
					String yoyul = objJumyongService.getYoyul(adminNo);
					if( !yoyul.equals(""))
						pb.setRATE( Float.valueOf(yoyul).floatValue());
					else
						pb.setRATE(400);
					
				}else if(mode.equals("edit"))
				{
					pb = objJumyongService.productInfo(seq);
					String old_seq = pb.getPREV_SEQ();
					ProductBean pb2 = objJumyongService.productInfo(old_seq);
					request.setAttribute("old_area_after", String.valueOf(pb2.getAREA_AFTER()));
					request.setAttribute("old_sum_adjust",String.valueOf(pb2.getSUM_ADJUST()));
					request.setAttribute("old_period", String.valueOf(pb2.getPERIOD() ));
				}
				
				//페이지 성공후 돌아갈 페이지
				setSuccessView("redirect:/jumyong/productInsert.do?no="+adminNo);		
				
				//날짜형식에 - 추가
				if(pb.getFROMDATE() != null)
					pb.setFROMDATE(addDash(pb.getFROMDATE()));
				if(pb.getTODATE() != null)
					pb.setTODATE(addDash(pb.getTODATE()));	
			}
		}catch(Exception e){	
			System.out.println(e.toString());	
		}		
			return pb;
	}	
		
	protected ModelAndView onSubmit(HttpServletRequest request
			, HttpServletResponse response, Object command
			, BindException errors) throws Exception	 {
		try	{	
			
			ProductBean objProductBean = (ProductBean)command;
			System.out.println("부과전 감소"+objProductBean.getFIRST_SEQ());
			String adminNo = ServletRequestUtils.getStringParameter(request,"no");
			
			String mode = ServletRequestUtils.getStringParameter(request,"mode");
			
			String seq =  ServletRequestUtils.getStringParameter(request,"SEQ");
			
			System.out.println(objProductBean.getSUM_ADJUST());
			
			objProductBean.setADMIN_NO(adminNo);
			objProductBean.setFIRST_SEQ(seq);
			//날짜에서 - 지우기
			objProductBean.setFROMDATE(removeDash(objProductBean.getFROMDATE()));	//fromdate
			objProductBean.setTODATE(removeDash(objProductBean.getTODATE()));		//todate
			
			
			//use_section 수시로 설정
			objProductBean.setUSE_SECTION("2");
			System.out.println("ffist_seq="+objProductBean.getFIRST_SEQ());
			System.out.println("들어오냐  "+objProductBean.getUSE_SECTION()+" "+mode);
			
			if(mode.equals("add"))
			{
				////	cal_sum_info 에 입력
				ProductBean pb2 = objProductBean;
				//cal_sum_info seq 생성
				int cal_tax_seq = objJumyongService.getCal_Sum_Seq();
				
				pb2.setSEQ(String.valueOf(cal_tax_seq));
				//use_section 2				
				//입력
				objJumyongService.Cal_Sum_InfoInsert(pb2);
				
				//// calculation_info 에 입력
				//cal_sum_seq 설정
				
				objProductBean.setCAL_SUM_SEQ(String.valueOf(cal_tax_seq));
				
				///////////////////////////////////////////////////////////////////////////////////////////////////
				objJumyongService.insertProduct(objProductBean);
				objJumyongService.SetCheckYn(adminNo);
				objJumyongService.SetTaxYn(adminNo);
			}
			else if(mode.equals("edit"))				
			{	
				
				ProductBean pb2 = objJumyongService.CalSumInfoInfo(Integer.valueOf(objProductBean.getCAL_SUM_SEQ()).intValue()); 
				
				pb2.setSUM(objProductBean.getSUM_ADJUST());				
				pb2.setSUM_ADJUST(objProductBean.getSUM_ADJUST());
				
				pb2 = objProductBean;
				
				
				objJumyongService.CalSumUpdate(pb2);				
				objJumyongService.updateProduct(objProductBean);				
				objJumyongService.SetCheckYn(adminNo);				
				objJumyongService.SetTaxYn(adminNo);
			}
		}catch(Exception err)
		{
			System.out.println("입력,수정에러="+err.toString());
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