
package main.java.facility.jumyong.web;


import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import main.java.common.util.Globals;
import main.java.common.util.catUtil.Pageing;
import main.java.facility.jumyong.model.Equip_ProductBean;
import main.java.facility.jumyong.service.IJumyongService;

import org.springframework.validation.BindException;
import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

public class ProductBoardFormControl_facility extends SimpleFormController {	
	
  	/**
  	 * CALCULATION 리스트 조회
	 * @param HttpServletRequest request
	 * @param HttpServletResponce responce
	 * @return ModelAndView
	 */
	
	
	
	private IJumyongService objJumyongService = null;	
	private	Pageing				pageing				= new Pageing();	
	
	public void setJumyongService_facility(IJumyongService newObjJumyongService) {
		this.objJumyongService = newObjJumyongService;
	}
	
	public ProductBoardFormControl_facility() {
		setBindOnNewForm(true);
	}
	
	
	
	protected Object formBackingObject(HttpServletRequest request) throws ServletException {
		
			System.out.println("***************************************************************************");
			System.out.println("hoban : productBoardFormControl_facility - formBackingObject");
			System.out.println("***************************************************************************");
		
			String gu_code = ServletRequestUtils.getStringParameter(request,"GU_CODE");		
			String corp_cd = ServletRequestUtils.getStringParameter(request,"CORP_CD");
			String admin_no = ServletRequestUtils.getStringParameter(request,"ADMIN_NO");
			String object_no = ServletRequestUtils.getStringParameter(request, "OBJECT_NO","");
			String mode = ServletRequestUtils.getStringParameter(request, "mode","");
			String strCurrentPage = ServletRequestUtils.getStringParameter(request, "currentPage", Globals.DEFAULT_CURRENT_PAGE);
			String strCountPerPage = ServletRequestUtils.getStringParameter(request, "countPerPage", "5");
			String year = ServletRequestUtils.getStringParameter(request,"YEAR","");
			String tax_set = ServletRequestUtils.getStringParameter(request,"TAX_SET","");
			String cal_status = "";
			String depth_num = "";
			String direct = ServletRequestUtils.getStringParameter(request, "direct", "");
			
			System.out.println("###########OBJECT_NO######### ::::"+object_no);
			System.out.println("==jumyong.formBackingObject==");
			System.out.println("tax_set : "+tax_set);
			
			
			request.setAttribute("gu_code", gu_code);
			request.setAttribute("corp_cd", corp_cd);
			request.setAttribute("admin_no", admin_no);
			request.setAttribute("currentPage", strCurrentPage);
			request.setAttribute("mode", mode);
			request.setAttribute("year", year);
			request.setAttribute("direct", direct);
			
			Equip_ProductBean epb = new Equip_ProductBean();
//			List placeList = objJumyongService.placeList(gu_code,corp_cd,request_no,Integer.parseInt(strCurrentPage));
			int placeListCount = objJumyongService.placeListCount(gu_code,corp_cd,admin_no);
			int	rowCol		= pageing.execute(request, placeListCount, Integer.parseInt(strCurrentPage), 5);
			//List placeList = objJumyongService.placeBoardList(gu_code,corp_cd,request_no, rowCol, rowCol + 4);
			
			List placeList = new ArrayList();
			
			if(mode.equals("edit")){
				placeList = objJumyongService.placeBoardListHan(gu_code,corp_cd,admin_no,tax_set, rowCol, rowCol + 4);
				System.out.println("--------2010.02.12--------");
				System.out.println("edit일때");
			}else{
				placeList = objJumyongService.placeBoardList(gu_code,corp_cd,admin_no,rowCol, rowCol + 4);
				System.out.println("--------2010.02.12--------");
				System.out.println("add일때");
			}
			
			if(placeList.size()==0){
				
				System.out.println("====(1)=====");
				 placeList = objJumyongService.placeBoardList(gu_code,corp_cd,admin_no,rowCol, rowCol + 4);
			}
			
			if(placeList.size()>0)
			//if(placeListCount>0)
			{
				
				/*epb = objJumyongService.Equip_GetCalSumSeq(gu_code,corp_cd,admin_no,year);
				
				String cal = Integer.toString(epb.getCAL_SUM_SEQ());
				epb = null;*/
				
				List calSumList = objJumyongService.Equip_Cal_SumList(gu_code,corp_cd,year,admin_no);
				
				//List placeList = objJumyongService.placeBoardListHan(gu_code,corp_cd,request_no,tax_set, rowCol, rowCol + 4);
				
				setSuccessView("redirect:/facility/jumyong/product_view.do?GU_CODE="+gu_code+"&strCurrentPage="+strCurrentPage+"&OBJECT_NO="+object_no+"&CORP_CD="+corp_cd+"&ADMIN_NO="+admin_no+"&YEAR="+year+"&direct="+direct);
				request.setAttribute("calSumList", calSumList);
				request.setAttribute("placeList", placeList);
				
				System.out.println("====(3)=====");
				
				if(object_no.equals(""))
				{
					System.out.println("###########OBJECT_NO: null  ######### ::::"+depth_num);
										
					object_no = ((Equip_ProductBean)placeList.get(0)).getOBJECT_NO();
					cal_status = ((Equip_ProductBean)placeList.get(0)).getCAL_STATUS();
					depth_num = ((Equip_ProductBean)placeList.get(0)).getDEPTH_NUM();
				}
				else
				{
					System.out.println("###########OBJECT_NO: TRUE  ######### ::::"+depth_num);
					
					for(int i=0; i<placeList.size(); i++){
						Equip_ProductBean equip_ProductBean = (Equip_ProductBean)placeList.get(i);
						
						System.out.println("====(4)=====");
						if(equip_ProductBean.getOBJECT_NO().equals(object_no)){
							object_no = equip_ProductBean.getOBJECT_NO();
							cal_status = equip_ProductBean.getCAL_STATUS();
							depth_num = ((Equip_ProductBean)placeList.get(0)).getDEPTH_NUM();
							
							
							System.out.println("====(5)=====");
							if(depth_num == null && object_no == equip_ProductBean.getOBJECT_NO() ){
								System.out.println("@@@@"+String.valueOf(((Equip_ProductBean)placeList.get(0)).getDEPTH_RATE()));
								depth_num = String.valueOf(equip_ProductBean.getDEPTH_RATE());
								
								System.out.println("====(6)=====");
							}
						
						}
						
						
					}
				}
				


				request.setAttribute("object_no", object_no);
				request.setAttribute("cal_status", cal_status);
				request.setAttribute("depth_num", depth_num);
				
				if(mode.equals("edit"))	{	//수정
					
					System.out.println("====(6.2)=====");
					epb = objJumyongService.Equip_CalculationInfo(gu_code,corp_cd,object_no,year);
					//System.out.println("epb.getTax_set : "+epb.getTAX_SET());
					System.out.println("====(6.3)=====");
				}
				else
				{	//입력
					
					System.out.println("====(6.4)=====");
					epb = objJumyongService.placeInfo(gu_code,corp_cd,admin_no,object_no);
					epb.setYEAR(year);
					System.out.println("====(6.5)=====");
				}
				request.setAttribute("product", epb);
				
				request.setAttribute("countPerPage", strCountPerPage);
				
				String strFormView = "/facility/jumyong/tab/info_product";
				

				System.out.println("====(7)=====");
				setFormView(strFormView);
			}
			
		
			
			return epb;
	}	
	
	protected ModelAndView onSubmit(HttpServletRequest request, HttpServletResponse response, Object command, BindException errors) throws Exception {

		System.out.println("***************************************************************************");
		System.out.println("hoban : productBoardFormControl_facility - onSubmit");
		System.out.println("***************************************************************************");
		
		Equip_ProductBean objProductBean = (Equip_ProductBean)command;
		
		
		String mode = ServletRequestUtils.getStringParameter(request, "mode","");
		
		String gu_code = objProductBean.getGU_CODE();
		String corp_cd = objProductBean.getCORP_CD();
		String admin_no = objProductBean.getADMIN_NO();
		String tax_set = objProductBean.getTAX_SET();
		String object_no = objProductBean.getOBJECT_NO();
		String strCurrentPage = ServletRequestUtils.getStringParameter(request, "currentPage", Globals.DEFAULT_CURRENT_PAGE);
		String year = objProductBean.getYEAR();
		String direct = ServletRequestUtils.getStringParameter(request, "direct", "");
		String depth_rate = ServletRequestUtils.getStringParameter(request, "DEPTH_NUM","0");
		
		System.out.println("----------------넘어오는 년도 :" + year + " -----");
		System.out.println("tax_set 처음 : "+tax_set);
		System.out.println("gu_code 처음 : "+gu_code);
		System.out.println("admin_no 처음 : "+admin_no);
		System.out.println("object_no 처음 : "+object_no);
		System.out.println("year 처음 : "+year);

		//여기까지 넘어옴
		request.setAttribute("direct", direct);
		try
		{
			Calendar cal = Calendar.getInstance();				
			SimpleDateFormat  sdf  =  new SimpleDateFormat("yyyyMMdd");      // 데이터 출력 형식 지정
			String toDay = sdf.format (cal.getTime());      // 오늘 날짜 변수에 저장
			
			objProductBean.setUP_DATE(toDay);
			objProductBean.setFROMDATE(removeDash(objProductBean.getFROMDATE()));
			objProductBean.setTODATE(removeDash(objProductBean.getTODATE()));
			//objProductBean.setYEAR(objProductBean.getFROMDATE().substring(0,4));
			
			
			
			objProductBean.setSEQ(0);
			objProductBean.setFORM(objProductBean.getFORM_ADJUST());
			objProductBean.setUSE_SECTION("2");
			objProductBean.setFIRST_SEQ(0);
			objProductBean.setDEPTH_RATE(Float.parseFloat(depth_rate));

			//기존에 등록된 같은년도의 산출 코드가 있으면...
			int cal_sum_seq = objJumyongService.getEquip_Cal_Sum_Seq(gu_code,corp_cd,tax_set, year,admin_no);
			
			if(mode.equals("add"))
			{
				System.out.println("######################################## CAL_SUM_SEQ ==> " + cal_sum_seq);
				if(cal_sum_seq == 0)	//cal_sum_info 최초 입력인지 확인 seq가 0이면 최초 입력,cal_sum_info에 먼저 입력후 cal_sum_info의 seq를 calculation의 cal_sum_seq에 넣음
				{
					//cal_sum_info seq 조회 없으면 0 있다면 seq +1 증가
					cal_sum_seq = objJumyongService.getEquip_Cal_Sum_Seq();		// cal_sum_seq를 sequence에서 뽑아옴
					objProductBean.setSEQ(cal_sum_seq);							// cal_sum_info의seq를 set 함
					objProductBean.setCAL_SUM_SEQ(cal_sum_seq);					// calculation의 cal_sum_seq를 set함
					
					
					
					int sum = objProductBean.getSUM_ADJUST() * (100 - objProductBean.getREDUCTION_RATE())/100;
					sum = sum/100*100;
					
					objProductBean.setSUM(sum);//최종점용료 입력
					objProductBean.setADMIN_NO(admin_no);
					
					objJumyongService.Equip_CalculationInsert(objProductBean);	// calculation의 seq는 sequence에 의해서 들어감 seq 변경 필요 없음
					
					objProductBean.setFORM_ADJUST("단가 * 연장 * 기간 * 감면율");
					objJumyongService.Equip_Cal_SumInsertQuery(objProductBean);
				}
				else
				{
					objProductBean.setSEQ(cal_sum_seq);							// cal_sum_info의seq를 set 함
					objProductBean.setCAL_SUM_SEQ(cal_sum_seq);					// calculation의 cal_sum_seq를 set함 
					
					objJumyongService.Equip_CalculationInsert(objProductBean);	//calculation 입력
					
					int sum_adjust = objJumyongService.Equip_Calculation_Sum_Adjust(gu_code,corp_cd,year,tax_set,admin_no);
					// cal_sum_info에 들어갈 sum_adjust  합계 구함
	
					objProductBean.setSEQ(cal_sum_seq);							//cal_sum_info seq set
					objProductBean.setSUM_ADJUST(sum_adjust);					//cal_sum_info sum_adjust set
					
					System.out.println("------------------계산식--------------------");
					System.out.println("sum_adjust : "+sum_adjust);
					int sum = sum_adjust * ((100 - objProductBean.getREDUCTION_RATE())/100);
					/*System.out.println("sum_adjust*10 : "+sum_adjust*10);
					System.out.println("sum_adjust*10 : "+sum_adjust*20);
					System.out.println("sum_adjust*10 : "+sum_adjust*30);
					System.out.println("sum_adjust*10 : "+sum_adjust*40);
					System.out.println("sum_adjust*10 : "+sum_adjust*50);
					System.out.println("sum_adjust*10 : "+sum_adjust*60);
					System.out.println("sum_adjust*10 : "+sum_adjust*70);
					System.out.println("sum_adjust*10 : "+sum_adjust*80);
					System.out.println("sum_adjust*10 : "+sum_adjust*90);
					System.out.println("sum_adjust*10 : "+sum_adjust*100);
					System.out.println("reduction_rate :"+objProductBean.getREDUCTION_RATE());*/
					System.out.println("sum1 : "+ sum);
					sum = sum/100*100;
					System.out.println("sum2 : "+sum);
					
					Equip_ProductBean objProductBean2 =new Equip_ProductBean();
					
					objProductBean2 = (Equip_ProductBean)objJumyongService.getCalMinMaxDate(gu_code, corp_cd, year,admin_no);
					
					objProductBean.setSUM(sum);		//최종점용료 입력
					objProductBean.setVAT(sum_adjust/10);						//cal_sum_info vat set
					
					objProductBean.setFORM_ADJUST("단가 * 연장 * 기간 * 감면율"); //fromdate min todate max 구해서 set	 
					System.out.println("fromdate : "+objProductBean2.getFROMDATE());
					System.out.println("todate : "+objProductBean2.getTODATE());
					
					objProductBean.setFROMDATE(objProductBean2.getFROMDATE());
					objProductBean.setTODATE(objProductBean2.getTODATE());
					
					System.out.println("이쪽이 출력되기는 하냐?");
					objJumyongService.Equip_Cal_Sum_AddUpdate(objProductBean);
				}
				System.out.println("add모드");
			}
			else
			{
				//objJumyongService.Equip_CalculationUpdate(objProductBean);	
				objJumyongService.Equip_CalculationUpdateHan(objProductBean);
				objJumyongService.Equip_PlaceUpdate(objProductBean);
				
				System.out.println("수정모드");
				System.out.println("년도 10.1.31 YEAR " + objProductBean.getYEAR());
				System.out.println("10.1.31 CORP_CD " + objProductBean.getCORP_CD());
				System.out.println("년도 10.1.31 OBJECT_NO " + objProductBean.getOBJECT_NO());
				System.out.println("년도 10.1.31 REQUEST_NO " + objProductBean.getREQUEST_NO());
				System.out.println("년도 10.1.31 GU_CODE " + objProductBean.getGU_CODE());
				System.out.println("cal_sum_seq : "+cal_sum_seq );
				System.out.println("tax_set : "+tax_set);
				
				objProductBean.setSEQ(cal_sum_seq);							// cal_sum_info의seq를 set 함
				int sum_adjust = objJumyongService.Equip_Calculation_Sum_AdjustHan(gu_code,corp_cd,tax_set,year, admin_no);				
				// cal_sum_info에 들어갈 sum_adjust  합계 구함
				System.out.println("cal_sum_info에 들어갈 sum_adjust  합계 구함 : "+sum_adjust);
				objProductBean.setSEQ(cal_sum_seq);							//cal_sum_info seq set
				objProductBean.setSUM_ADJUST(sum_adjust);					//cal_sum_info sum_adjust set
				objProductBean.setVAT(sum_adjust/10);						//cal_sum_info vat set
																		//fromdate min todate max 구해서 set
				int sum = objProductBean.getSUM_ADJUST() * (100 - objProductBean.getREDUCTION_RATE())/100;
				
				
				sum = sum/100*100;
				objProductBean.setSUM(sum);
				
				objJumyongService.Equip_Cal_Sum_AddUpdate(objProductBean);
				
			}	
		
		//objJumyongService.Equip_AdminBase_CheckYn(objProductBean);	// 해당 시설점용의  시설물이 모두 산출 되었으면 EQUIP_ADMIN_BASE의 CHECK_YN이 1로 바뀜... 
		
		}catch(Exception err)
		{
			System.out.println(err.toString());
		}
//	    GU_CODE,CORP_CD,REQUEST_NO,OBJECT_NO,YEAR,SEQ,RATE,DEPTH_RATE,SUM_ADJUST,FROMDATE,TODATE ,FORM_ADJUST,FORM,UP_DATE \
//		,PERIOD,USE_SECTION,FIRST_SEQ,CAL_SUM_SEQ,QUANTITY) \
		System.out.println("getSuccessView() = " + getSuccessView().toString());
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