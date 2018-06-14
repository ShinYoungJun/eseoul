/***********************************
 * ������ : 2007.9.27
 * ���������� : ������
 * �������� :
 ***********************************/

package main.java.facility.junggi.web;


import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import main.java.common.commonCode.model.UserBean;
import main.java.common.commonCode.service.CommonCodeService;
import main.java.common.util.BoardUtil;
import main.java.common.util.Globals;
import main.java.common.util.catUtil.Pageing;
import main.java.common.util.catUtil.Util;
import main.java.facility.jumyong.model.Equip_ProductBean;
import main.java.facility.jumyong.service.IJumyongService;
import main.java.facility.junggi.service.IJunggiService;

import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;


public class JunggiBoardControl extends MultiActionController {
	
  	/**
  	 * QABoard ����Ʈ ��ȸ (login ���ѻ��¿� ���̴� ����Ʈ)
	 * @param HttpServletRequest request
	 * @param HttpServletResponce responce
	 * @return ModelAndView
	 */
		
	private IJunggiService objJunggiService = null;
	private IJumyongService objJumyongService = null;
	private	CommonCodeService	commonCode		= null;	
	private	Util				util			= new Util();
	private	Pageing				pageing			= new Pageing();
	
	public void setJunggiService_facility(IJunggiService newObjJunggiService) {
		this.objJunggiService = newObjJunggiService;
	}
	
	public void setJumyongService_facility(IJumyongService newObjJumyongService) {
		this.objJumyongService = newObjJumyongService;
	}	
	
	public void setCommonCodeService(CommonCodeService commonCode) 
	{
		this.commonCode 	= commonCode;
	}
	

////////////////////////////////////////////////////////////////////////////////////////////////////////
// ���� ��ȸ
	public ModelAndView search(HttpServletRequest request,HttpServletResponse response) throws Exception {
		HttpSession session = request.getSession();
		String userId	= (String)session.getAttribute("sessionUserId");		
		List JunggiList	=	null;
		
		try{
			if(userId != null)
			{
				String strYear = ServletRequestUtils.getStringParameter(request, "year", "");
				String strReq_nm = ServletRequestUtils.getStringParameter(request, "req_nm", "");
				String strCurrentPage = ServletRequestUtils.getStringParameter(request, "currentPage", Globals.DEFAULT_CURRENT_PAGE);
				String strCountPerPage = ServletRequestUtils.getStringParameter(request, "countPerPage", "4");
				
				
				/*request.setAttribute("year", strYear);
				request.setAttribute("req_nm", strReq_nm);
				request.setAttribute("currentPage", strCurrentPage);
				request.setAttribute("countPerPage", strCountPerPage);*/
				
				//		������ �����͸� �����´�.
				UserBean	userBean	= new UserBean();
				userBean	= commonCode.executeUserSearch(util.getSessionID(request, "sessionUserId"));
				
				//���� ��¥ , 7���� ��¥ ���ϱ�
				Calendar  cal  =  Calendar.getInstance();
				SimpleDateFormat  sdf  =  new SimpleDateFormat("yyyy");      // ������ ��� ���� ����
				String  toDate  =  sdf.format (cal.getTime());      // ���� ��¥ ������ ����
				
				if(strYear.length()<1)
				strYear = toDate;
				
				request.setAttribute("year", strYear);
				request.setAttribute("req_nm", strReq_nm);
				request.setAttribute("currentPage", strCurrentPage);
				request.setAttribute("countPerPage", strCountPerPage);
				
				//toDate = "2010";

				int searchListCount = objJunggiService.getsearhListCount(strYear, userBean.getSIGU_CD(), strReq_nm);
				
				request.setAttribute("searchlistCount",String.valueOf(searchListCount));
				
				String strPageDivideForm = BoardUtil.getDividePageForm(	Integer.parseInt(strCurrentPage),10, "&year="+strYear+"&req_nm="+strReq_nm, "", "/facility/junggi/search.do", searchListCount);
				request.setAttribute("strPageDivideForm",strPageDivideForm);
				JunggiList = objJunggiService.searhList(strReq_nm, userBean.getSIGU_CD(), strYear,Integer.valueOf(strCurrentPage).intValue());
			}
		}catch(Exception e){
			System.out.println(e.toString());
		}
		
		return new ModelAndView("/facility/junggi/search","searchList",JunggiList);
	}
	
////////////////////////////////////////////////////////////////////////////////////////////////////////
//	 ���� view
		public ModelAndView view(HttpServletRequest request,HttpServletResponse response) throws Exception {
			
			String corp_cd = ServletRequestUtils.getStringParameter(request, "corp_cd", "");
			String gu_code = ServletRequestUtils.getStringParameter(request, "gu_code", "");			
			String admin_no = ServletRequestUtils.getStringParameter(request, "admin_no", "");
			
			
			// 2009.8.17 �߰� start
			// ���⵵ ���
			Calendar cal = Calendar.getInstance();
			SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd");			  
			String thisDate = formatter.format(cal.getTime());			
			String thisYear = thisDate.substring(0,4);
			String year = ServletRequestUtils.getStringParameter(request, "year", thisYear);
			String tax_set = ServletRequestUtils.getStringParameter(request, "tax_set", "");
			
			request.setAttribute("year", year);
		//	request.setAttribute("tax_set", tax_set);
			// 2009.8.17 �߰� end
			
			request.setAttribute("corp_cd", corp_cd);
			request.setAttribute("gu_code", gu_code);			
			request.setAttribute("admin_no", admin_no);
			request.setAttribute("tax_set", tax_set);
			
			return new ModelAndView("/facility/junggi/view");
		}
////////////////////////////////////////////////////////////////////////////////////////////////////////
//		 ����  product_view
		public ModelAndView product_view(HttpServletRequest request,HttpServletResponse response) throws Exception {
			HttpSession session 	= request.getSession();
			String 	userId	= (String)session.getAttribute("sessionUserId");		
			//List		list		= null;
			Equip_ProductBean pb = new Equip_ProductBean();
			
			try{
				if(userId != null){
					//������ �����͸� �����´�.
					UserBean	userBean	= new UserBean();
					userBean	= commonCode.executeUserSearch(util.getSessionID(request, "sessionUserId"));
					String sigu_cd = userBean.getORG_CD(); // ����ڵ�
					
					String gu_code = ServletRequestUtils.getStringParameter(request,"GU_CODE");		
					String corp_cd = ServletRequestUtils.getStringParameter(request,"CORP_CD");
					String admin_no = ServletRequestUtils.getStringParameter(request,"ADMIN_NO");
					String object_no = ServletRequestUtils.getStringParameter(request, "OBJECT_NO","");
					String cal_sum_seq = ServletRequestUtils.getStringParameter(request, "cal_sum_seq","");
					String seq = ServletRequestUtils.getStringParameter(request, "SEQ","");
					String message = ServletRequestUtils.getStringParameter(request, "message","");
					
					String strCurrentPage = ServletRequestUtils.getStringParameter(request, "currentPage", Globals.DEFAULT_CURRENT_PAGE);
					
					// ���⵵ ���
					Calendar cal = Calendar.getInstance();
					SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd");			  
					String thisDate = formatter.format(cal.getTime());			
					String thisYear = thisDate.substring(0,4);
					
					String year = ServletRequestUtils.getStringParameter(request, "year", thisYear);	// �⵵
					String tax_set = ServletRequestUtils.getStringParameter(request, "tax_set", "");	// �ü� 10, ���� 50 ���а�
					String cal_status = ServletRequestUtils.getStringParameter(request, "cal_status", ""); // ���� �̻��� �����ϱ� ����
					
		//			System.out.println("*********** product_view  ************");
		//			System.out.println("GU_CODE=== " + gu_code);
		//			System.out.println("corp_cd=== " + corp_cd);
		//			System.out.println("year== " + year);
		//			System.out.println("tax_set=== " + tax_set);
					
					
					request.setAttribute("gu_code", gu_code);
					request.setAttribute("corp_cd", corp_cd);			
					request.setAttribute("admin_no", admin_no);
					request.setAttribute("object_no", object_no);
					request.setAttribute("cal_sum_seq", cal_sum_seq);
					request.setAttribute("SEQ", seq);
					request.setAttribute("message", message);
					request.setAttribute("currentPage", strCurrentPage);
					request.setAttribute("tax_set", tax_set);
					request.setAttribute("sigu_cd", sigu_cd);
					
					// 1 �������� ����Ʈ ī��Ʈ
					int listCount = objJunggiService.Cal_sumListCount(gu_code, corp_cd, admin_no, tax_set);
					
					// 1 ����¡
					int	rowCol = pageing.execute(request, listCount, Integer.parseInt(strCurrentPage), 10);
					
					// 1 �������� ����Ʈ
					List calSumList = objJunggiService.Cal_sumList(gu_code, corp_cd, tax_set, admin_no, rowCol, rowCol+3);
					
					// -- WriteCalSumCount,InputTaxationSiseCount,InputTaxationGuseCount �� �뵵 --
					// ���ܼ��Կ��� ���ۼ��Ǿ� EQUIP_TAXATION_INFO�� ���� ���� �����Ͱ� ����л���Ǵ°��� ���� ���� ����
					// ���⵵�� equip_taxation_info�� equip_cal_sum_info ������ ���� ���ؼ� ���� �ٸ��� ����� ������ ���� �ʵ��� �ڵ���.
					// ���⵵ ������ ���� �¾ƾ� ���ܼ��Կ��� �ۼ��� ����.
					
					int WriteCalSumCount =  objJunggiService.WriteCalSumCount(gu_code, corp_cd, year, tax_set, admin_no);					
					int InputTaxationCount = 0;
				
					Equip_ProductBean Probean = (Equip_ProductBean)calSumList.get(0); 
					
					if(Probean.getTAX_SET().equals("10")){
						
						InputTaxationCount = objJunggiService.InputTaxationSiseCount(gu_code, corp_cd, Probean.getYEAR());
						
						System.out.println("����� tax_set : 10-�ü�"+WriteCalSumCount);
						System.out.println("InputTaxationSiseCount : "+InputTaxationCount);
						System.out.println("year : "+Probean.getYEAR());
					}else{
						InputTaxationCount = objJunggiService.InputTaxationGuseCount(gu_code, corp_cd, Probean.getYEAR());
						
						System.out.println("����� tax_set : 50-����"+WriteCalSumCount);
						System.out.println("InputTaxationGuseCount : "+InputTaxationCount);
						System.out.println("year : "+Probean.getYEAR());
					}
					
					request.setAttribute("WriteCalSumCount", Integer.toString(WriteCalSumCount));
					request.setAttribute("InputTaxationCount",Integer.toString(InputTaxationCount));
					
					/*		
					for(int i = 0; i<calSumList.size();i++)
					{
						Equip_ProductBean calsum  = (Equip_ProductBean)calSumList.get(i);
						calsum.setREQUEST_NO(  calsum.getREQUEST_NO().replaceAll("0",""));						
						
					}*/
					
					
					request.setAttribute("calSumList", calSumList);
				
					for( int i=0; i<calSumList.size(); i++){
						Equip_ProductBean a = (Equip_ProductBean)calSumList.get(i);
						
						System.out.println("a.getSEQ() : "+a.getSEQ());
						if(cal_sum_seq == Integer.toString(a.getSEQ()) || cal_sum_seq.equals(Integer.toString(a.getSEQ()))){
						request.setAttribute("SumAdjust", Integer.toString(a.getSUM_ADJUST()));
						System.out.println("sum_adjust : "+Integer.toString(a.getSUM_ADJUST()));
						System.out.println("seq : "+ a.getSEQ());
						}
					}
					
					if(calSumList.size()>0)
					{
					
						
						if("".equals(cal_sum_seq) )
						{
							cal_sum_seq = String.valueOf( ((Equip_ProductBean)calSumList.get(0)).getSEQ() );
							year = String.valueOf( ((Equip_ProductBean)calSumList.get(0)).getYEAR() );
							
							
							request.setAttribute("cal_sum_seq", cal_sum_seq);
							
							
						}
						System.out.println("cal_sum_seq=== " + cal_sum_seq);
						
						for( int i=0; i<calSumList.size(); i++){
							Equip_ProductBean a = (Equip_ProductBean)calSumList.get(i);
							
							System.out.println("a.getSEQ() : "+a.getSEQ());
							if(cal_sum_seq == Integer.toString(a.getSEQ()) || cal_sum_seq.equals(Integer.toString(a.getSEQ()))){
							request.setAttribute("SumAdjust", Integer.toString(a.getSUM_ADJUST()));
							System.out.println("sum_adjust : "+Integer.toString(a.getSUM_ADJUST()));
							System.out.println("seq : "+ a.getSEQ());
							
							}
						}
						
						List CalculationList = new ArrayList();
						
						//2 �������� ����Ʈ
						/*if(Integer.parseInt(year)>Integer.parseInt(thisYear)){
						CalculationList = objJunggiService.CalculationLists(gu_code, corp_cd, year);
						}else{
						CalculationList = objJunggiService.CalculationList(Integer.parseInt(cal_sum_seq) , year);
						}*/
						
						CalculationList = objJunggiService.CalculationList(Integer.parseInt(cal_sum_seq) , year, gu_code,admin_no);
						
						//List CalculationList = objJunggiService.CalculationList_purpose(Integer.parseInt(cal_sum_seq));
						List CalculationList2 = new ArrayList();
						
						System.out.println("�� ���� for��");
						int gee = 0;
						for(int i=0;i<CalculationList.size();i++){
							
							Equip_ProductBean bea = (Equip_ProductBean)CalculationList.get(i);
							
							System.out.println("bea.getOBJECT_NO() : "+bea.getOBJECT_NO());
							System.out.println("getCORP_CD() : "+bea.getCORP_CD());
							System.out.println("bea.getGU_CODE() : "+bea.getGU_CODE());
							System.out.println("getADMIN_NO() : "+bea.getADMIN_NO());
							System.out.println("getYEAR() : "+bea.getYEAR());
							
							
							gee = objJunggiService.CalculationCount(bea.getGU_CODE(), bea.getCORP_CD(),bea.getADMIN_NO(), Integer.toString(Integer.parseInt(bea.getYEAR())+1), bea.getOBJECT_NO());
						
							
							if(gee>0){
								bea.setTYPE("����");
							}else{
								bea.setTYPE("�̻���");
							}
							
							CalculationList2.add(bea);
							
							//System.out.println(i+" : "+bea.getGU_CODE()+" : "+bea.getCORP_CD()+" : "+bea.getYEAR()+" : "+bea.getOBJECT_NO());
							//System.out.println("Ÿ�� : "+ bea.getTYPE());
							gee=0;
						}
						
						
						request.setAttribute("CalculationList", CalculationList2);
						
						
						if(CalculationList.size()>0)
						{
							if("0".equals(seq) || seq == null || "".equals(seq)){
								seq = String.valueOf( ((Equip_ProductBean)CalculationList.get(0)).getSEQ());
								cal_status = String.valueOf( ((Equip_ProductBean)CalculationList.get(0)).getCAL_STATUS());
							}
							
						/*	for(int i = 0; i<CalculationList.size();i++)
							{
								Equip_ProductBean bean = (Equip_ProductBean)CalculationList.get(i);
								bean.setREQUEST_NO(  bean.getREQUEST_NO().replaceAll("0",""));						
								
							}*/
						}
						
//						System.out.println("info ���� ������ seq === " + seq);
						pb = objJunggiService.CalculationInfo(gu_code,Integer.parseInt(seq)); 
						request.setAttribute("SEQ", seq);
						
				
					}			
					
					request.setAttribute("year", year);
					request.setAttribute("SEQ", seq);
					request.setAttribute("yearAdd", String.valueOf(Integer.parseInt(thisYear)+1));
					request.setAttribute("cal_status", cal_status);
				}
			}catch(Exception e){
				System.out.println(e.toString());
			}	
			
			
			
			return new ModelAndView("/facility/junggi/tab/info_product_view","product",pb);
		}			

////////////////////////////////////////////////////////////////////////////////////////////////////////
//���� product_temp_insert
		public ModelAndView product_temp_insert(HttpServletRequest request,HttpServletResponse response) throws Exception {
			HttpSession session 	= request.getSession();
			String 		userId		= (String)session.getAttribute("sessionUserId");		
			//List		list		= null;
			String 		gu_code		= "";
			String 		request_no	= "";
			String 		corp_cd		= "";
			
			try{
				if(userId != null){
					corp_cd = ServletRequestUtils.getStringParameter(request, "corp_cd", "");
					gu_code = ServletRequestUtils.getStringParameter(request, "gu_code", "");
					request_no = ServletRequestUtils.getStringParameter(request, "request_no", "");
					
					//EQUIP ����� ���� ��� �Է�//YEAR,FROMDATE,TODATE,UP_DATE,CAL_SUM_SEQ,GU_CODE,CORP_CD			
					
					Calendar cal = Calendar.getInstance();				
					SimpleDateFormat  sdf  =  new SimpleDateFormat("yyyyMMdd");      // ������ ��� ���� ����
					String toDay = sdf.format (cal.getTime());      // ���� ��¥ ������ ����
					
					String thisDate = sdf.format(cal.getTime());			
					String thisYear = thisDate.substring(0,4);
					
					String year = ServletRequestUtils.getStringParameter(request, "year", thisYear);
					String tax_set = ServletRequestUtils.getStringParameter(request, "tax_set", "");
					
					
					System.out.println("year = "+year);
					
					if(objJunggiService.getcal_sum_exist(gu_code,corp_cd,year,tax_set)> 0)		//�̹� �ش翬�� ����� ���� �� ������ return 
						return new ModelAndView("redirect:/facility/junggi/product_view.do?GU_CODE="+gu_code+"&CORP_CD="+corp_cd+"&year="+year+"&tax_set="+tax_set+"&message=�̹� �ش�⵵ ������� �ֽ��ϴ�.");
					
					List a1 = objJunggiService.Equip_Calculation_TaxSet(gu_code,corp_cd);
					Equip_ProductBean epb = new Equip_ProductBean();
					for(int i = 0; i<a1.size();i++)
					{				
						
						epb.setTAX_SET(  ((Equip_ProductBean)a1.get(i)).getTAX_SET());
						epb.setUSE_SECTION("1");
						epb.setYEAR(year);
						epb.setFROMDATE(year+"0101");
						epb.setTODATE(year+"1231");
						epb.setUP_DATE(toDay);
						epb.setGU_CODE(gu_code);
						epb.setCORP_CD(corp_cd);
						epb.setREQUEST_NO(request_no);
						
						int cal_sum_seq = objJunggiService.getEquip_Cal_Sum_Seq(gu_code,corp_cd,epb.getTAX_SET(),year);
						
						if( cal_sum_seq == 0 )//0�� �ش� ������ cal_sum_info�� ���� ���.
						{
							//epb.setSEQ(epb.getCAL_SUM_SEQ());
							cal_sum_seq = objJumyongService.getEquip_Cal_Sum_Seq(); 
							epb.setSEQ(cal_sum_seq);					
							objJumyongService.Equip_Cal_SumInsertQuery(epb);			    
						}
						epb.setCAL_SUM_SEQ(cal_sum_seq);
					    objJunggiService.Equip_CalculationTempInsert(epb);
					}
				}
			}catch(Exception e){
				System.out.println(e.toString());
			}	
			
			
			return new ModelAndView("redirect:/facility/junggi/product_view.do?GU_CODE="+gu_code+"&CORP_CD="+corp_cd);
		}
		
}
