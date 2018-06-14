package main.java.jumyong.jumyong.web;

import main.java.common.commonCode.service.CommonCodeService;
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
import main.java.jumyong.jumyong.model.ProductBean;
import main.java.jumyong.jumyong.model.initCalBean;
import main.java.jumyong.jumyong.service.*;

public class ProductBoardFormControl extends SimpleFormController {

    /**
     * CALCULATION 리스트 조회
     * 
     * @param HttpServletRequest
     *            request
     * @param HttpServletResponce
     *            responce
     * @return ModelAndView
     */
    private IJumyongService objJumyongService = null;
    private	CommonCodeService	commonCode		= null;		
	

    public void setJumyongService(IJumyongService newObjJumyongService) {
        this.objJumyongService = newObjJumyongService;
    }

    public ProductBoardFormControl() {
        setBindOnNewForm(true);
    }
    
	public void setCommonCodeService(CommonCodeService commonCode) 
	{
		this.commonCode 	= commonCode;
	}

    protected Object formBackingObject(HttpServletRequest request) throws ServletException {
        // 삭제 세션
        HttpSession session = request.getSession();
        String userId = (String) session.getAttribute("sessionUserId");
        ProductBean pb = null;


        try {
            if (userId != null) {
                String adminNo = ServletRequestUtils.getStringParameter(request, "no");
                String mode = ServletRequestUtils.getStringParameter(request,"mode", "view");
                String seq = ServletRequestUtils.getStringParameter(request,"seq");
                String strYear = ServletRequestUtils.getStringParameter(request, "year");
                String strCurrentPage = ServletRequestUtils.getStringParameter(request, "currentPage", Globals.DEFAULT_CURRENT_PAGE);
                String strCountPerPage = ServletRequestUtils.getStringParameter(request, "countPerPage", "5");
                String check_yn = ServletRequestUtils.getStringParameter(request, "check_yn");
                String message = ServletRequestUtils.getStringParameter(request, "message", "");
                String type = ServletRequestUtils.getStringParameter(request,"TYPE");
                
                request.setAttribute("no", adminNo);
                request.setAttribute("seq", seq);
                request.setAttribute("year", strYear);
                request.setAttribute("currentPage", strCurrentPage);
                request.setAttribute("message", message);
                request.setAttribute("CK_DEL", "false");
                
                pb = new ProductBean();
                
                // 산출물 리스트 가져오기
                List productList = objJumyongService.ProductList(Integer.parseInt(strCurrentPage), 5, adminNo);
                // 산출물 리스트 크기
                int listSize = productList.size();
                request.setAttribute("listSize", String.valueOf((listSize)));

                
                // 산출물 페이징 처리
                int totalProductCount = objJumyongService.getProductListCount(adminNo);
                request.setAttribute("totalProductCount", String.valueOf((totalProductCount)));
                String strPageDivideForm = BoardUtil.getDividePageForm(Integer.parseInt(strCurrentPage), 5, "", "no=" + adminNo, "/jumyong/productInsert.do", totalProductCount);

                request.setAttribute("strPageDivideForm", strPageDivideForm);
                
                initCalBean initData = objJumyongService.getInitCalData(adminNo);
System.out.println("Yoyul Test" + initData.getYOYUL());
                request.setAttribute("section", initData.getSECTION());
                request.setAttribute("type", initData.getTYPE());
                if (initData.getPURPOSE_CD().substring(0,1).equals("0")) {
                    request.setAttribute("gongyu_yn", "0");
                } else {
                    request.setAttribute("gongyu_yn", "1");
                }


                if (listSize > 0) { //산출내역 있을때
                	
                    if (!mode.equals("add")) {
                        System.out.println("mode가 add가 아닐때");
                        if (seq == null || seq.equals("") || seq.equals("null")) {
                            seq = String.valueOf(((ProductBean) productList.get(0)).getSEQ());
                        }
                        // 수정버튼 맹글껀가 말껀가 -- 김권태 11월 27일
                        boolean defineTax = objJumyongService.define_tax_yn(adminNo, seq);
                        request.setAttribute("defineTax", String.valueOf(defineTax));

                        pb = objJumyongService.productInfo_Admin(seq, adminNo);
                        
                        request.setAttribute("sum_seq", pb.getCAL_SUM_SEQ());

                        if (mode.equals("edit")) {
                            // 감면율 지분율 가져오기
                            pb.setREDUCTION_RATE(Float.parseFloat(initData.getREDUCTION_RATE()));
                            pb.setREDUCTION_REASON(initData.getREDUCTION_REASON());
                            pb.setPERCENT_RATE(Float.parseFloat(initData.getPERCENT_RATE()));
                            pb.setPERCENT_REASON(initData.getPERCENT_REASON());
                            pb.setAREA_AFTER(new Float(initData.getAREA_SIZE()).floatValue());
                            if (!initData.getYOYUL().equals("")) {
                                pb.setRATE(Float.valueOf(initData.getYOYUL()).floatValue());
                            } else {
                                pb.setRATE(400);
                            }

                        } else if (mode.equals("del")) {
                            // cal_sum_seq 구하기
                            String cal_sum_seq = String.valueOf(objJumyongService.get_cal_sum_seq2(adminNo, seq,strYear));

                            if (!initData.getSECTION().equals("3")) { // 일시나 계속일때
                                // 산출정보 지우기
                                objJumyongService.DeleteCalculatioInfo(adminNo,seq, strYear);
                                // 산출합계지우기 시작
                                objJumyongService.DeleteCalSumInfo(adminNo,cal_sum_seq, strYear);
                                // 세외 수입 지우기
                                objJumyongService.DeleteTaxationInfo(adminNo,cal_sum_seq, strYear);

                            } else { // 무단점용일때

                                int countCalculationInfo = objJumyongService.getCountCalculationInfo(adminNo,cal_sum_seq);
                                // 산출정보 지우기
                                objJumyongService.DeleteCalculatioInfo(adminNo,seq, strYear);
                                
                                //1건일때
                                if (countCalculationInfo == 1) {
                                    // 산출합계지우기 시작
                                    objJumyongService.DeleteCalSumInfo(adminNo,cal_sum_seq, strYear);
                                    // 세외 수입 지우기
                                    objJumyongService.DeleteTaxationInfo(adminNo,cal_sum_seq, strYear);
                                } else {
                                    // 산출합계 재계산
                                    ProductBean objProductBean = new ProductBean();

                                    objProductBean.setADMIN_NO(adminNo);
                                    objProductBean.setSEQ(String.valueOf(cal_sum_seq));
                                    objProductBean.setYEAR(strYear);
                                    objProductBean.setREDUCTION_RATE(Float.parseFloat(initData.getREDUCTION_RATE()));
                                    objProductBean.setPERCENT_RATE(Float.parseFloat(initData.getPERCENT_RATE()));
                                    objProductBean.setREDUCTION_REASON(initData.getREDUCTION_REASON());
                                    objProductBean.setPERCENT_REASON(initData.getPERCENT_REASON());
                                    
                                    // REDUCTION_SUM 구하기
                                    int pb_sum = objJumyongService.SumBysumSeq(adminNo, String.valueOf(cal_sum_seq));
                                    objProductBean.setSUM_ADJUST(pb_sum);
                                    
                                    long reduction_sum = Long.parseLong(String.valueOf(pb_sum));
                                    
                                    float reduction_rate = objProductBean.getREDUCTION_RATE();
                                    float percent_rate = objProductBean.getPERCENT_RATE();
                                    if(percent_rate == 0){
                                    	percent_rate = 100;
                                    }
                                    
                                    reduction_sum = (long)(reduction_sum * (percent_rate/100) * (1- reduction_rate/100));
                                    
                                    if(!type.equals("1")){
                                    	reduction_sum = reduction_sum/10*10;
                                    }else{
                                    	String gongyu_yn = initData.getPURPOSE_CD().substring(0, 1);
                                    	if(gongyu_yn.equals("0")){
                                    		/* 도로,무단,공유법 10원 절삭 2014.11*/
                                    		reduction_sum = reduction_sum/10*10;
                                    	}else{
                                    		reduction_sum = reduction_sum/100*100;
                                    	}
                                    }
                                    
                                    objProductBean.setREDUCTION_SUM(reduction_sum);
                                    
                                    // REDUCTION_FORM 합계 구하기
                                    String form_adjust = "";
                                    List formAdjustList = objJumyongService.getFormAdjust(adminNo, String.valueOf(cal_sum_seq));
                                    for (int i = 0; i < formAdjustList.size(); i++) {
                                        Map t = (Map) formAdjustList.get(i);
                                        form_adjust += t.get("FORM_ADJUST");
                                        if(percent_rate != 0 && percent_rate != 100){
                                        	form_adjust +=" X (" + percent_rate+"/100)";
                                        }
                                        if(reduction_rate != 0){
                                        	form_adjust +=" X (1-"+reduction_rate+"/100)";
                                        }
                                        form_adjust += ",";
                                    }
                                    System.out.println("form_adjust값 합계 내역 : " + form_adjust.substring(0,form_adjust.length() - 1));
                                    objProductBean.setREDUCTION_FORM(form_adjust.substring(0,form_adjust.length() - 1));
                                    // area_after 구하기
                                    objProductBean.setAREA_AFTER(Float.parseFloat(initData.getAREA_SIZE()));
                                    
                                    //부가세
                                    if(commonCode.inquiryVatYN(objProductBean.getADMIN_NO())){
                                    	objProductBean.setVAT(String.valueOf(objProductBean.getREDUCTION_SUM()/100*10));
                                     }else{
                                     	objProductBean.setVAT("0");
                                        
                                    }
                                    objProductBean.setYEAR(objJumyongService.getMaxYear(adminNo, String.valueOf(cal_sum_seq))); // 년도를 max year로 세팅
                       
                                    // 업데이트 하기 !!!!!!
                                    objJumyongService.CalSumAddUpdate(objProductBean);
                                }
                            }
                            
                            // calculation_info 합계구한후 0일 경우 admin_base 지우기....
                            objJumyongService.updateAdminBaseCheckYN(adminNo);

                            request.setAttribute("CK_DEL", "true");

                        }

                    } else // view
                    {
                        pb.setCHECK_YN(check_yn.trim());
                    }
                    
                    request.setAttribute("productList", productList);
                    request.setAttribute("firstArea", String.valueOf(((ProductBean) productList.get(productList.size() - 1)).getAREA_AFTER()));
                
                } else { //산출내역 없을때
                    mode = "add";
                    System.out.println("mode : add");
                    
                    pb.setREDUCTION_RATE(Float.parseFloat(initData.getREDUCTION_RATE()));
                    pb.setREDUCTION_REASON(initData.getREDUCTION_REASON());
                    pb.setPERCENT_RATE(Float.parseFloat(initData.getPERCENT_RATE()));
                    pb.setPERCENT_REASON(initData.getPERCENT_REASON());
                    pb.setAREA_AFTER(new Float(initData.getAREA_SIZE()).floatValue());
                }

                
                if (initData.getSECTION().equals("1") || initData.getSECTION().trim().equals("4"))// 계속,폐쇄
                // 점용
                {
                    // forwview 설정
                    String strFormView = "/jumyong/jumyong/info_product";
                    setFormView(strFormView);

                } else if (initData.getSECTION().equals("2")) // 일시 점용
                {
                    // 상단 리스트 조정 리스트의 갱신년월일 -> 년월로 조정
                    if (productList.size() > 0) {
                        for (int i = 0; i < productList.size(); i++) {
                            String strUp_date = ((ProductBean) productList.get(i)).getUP_DATE();
                            ((ProductBean) productList.get(i)).setUP_DATE(strUp_date.substring(0, 6));
                        }
                    }

                    String period = String.valueOf(pb.getPERIOD());
                    if (period.equals("") || period.equals("0")) {
                        int totalPeriod = objJumyongService.getTotalPeriod(adminNo);
                        pb.setPERIOD(totalPeriod);
                    }

                    // formview 설정
                    String strFormView = "/jumyong/jumyong/info_product_instance";
                    setFormView(strFormView);
                } else if (initData.getSECTION().equals("3"))// 무단 점용
                {
                    // forwview 설정
                    String strFormView = "/jumyong/jumyong/info_product_noPermission";
                    setFormView(strFormView);

                    int totalSum = 0;

                    if (mode.equals("add")) {
                        totalSum = objJumyongService.getTotalSum(adminNo, seq);
                    } else {
                        totalSum = objJumyongService.getTotalSum(adminNo, pb.getCAL_SUM_SEQ());
                    }
                    System.out.println("무단점용seq:" + seq);
                    System.out.println("TOTAL_SUM:" + totalSum);

                    if (totalSum > 0) {

                        String strForm = objJumyongService.getForm2(adminNo);

                        request.setAttribute("totalSum", String.valueOf(totalSum));
                        request.setAttribute("mudanForm", strForm);
                        request.setAttribute("mudanPrice", objJumyongService.getPrice(adminNo));

                        String mudan_area = String.valueOf(pb.getAREA_AFTER());

                        if (mudan_area == null || mudan_area.equals("") || mudan_area.equals("null") || mudan_area.equals("0.0")) {
                            pb.setAREA_AFTER(objJumyongService.getMudanArea(adminNo));
                        }

                    } else {
                        request.setAttribute("totalSum", "0");
                    }

                }

                request.setAttribute("mode", mode);

                pb.setCHECK_YN(pb.getCHECK_YN().trim());

                // 추가인 경우 check_yn 가져오기
                if (pb.getCHECK_YN() == null || "".equals(pb.getCHECK_YN())) {
                    pb.setCHECK_YN(initData.getCHECK_YN());
                }

                if (mode.equals("add")) // add 일때 요율 구하기
                {
                    pb.setREDUCTION_RATE(Float.parseFloat(initData.getREDUCTION_RATE()));
                    pb.setREDUCTION_REASON(initData.getREDUCTION_REASON());
                    pb.setPERCENT_RATE(Float.parseFloat(initData.getPERCENT_RATE()));
                    pb.setPERCENT_REASON(initData.getPERCENT_REASON());
                    pb.setAREA_AFTER(new Float(initData.getAREA_SIZE()).floatValue());
                    if (!initData.getYOYUL().equals("")) {
                        pb.setRATE(Float.valueOf(initData.getYOYUL()).floatValue());
                    } else {
                        pb.setRATE(400);
                    }
                }

                if (seq == null) {
                    seq = "0";
                }
                request.setAttribute("seq", seq);

                // 날짜형식에 - 추가
                if (pb.getFROMDATE() != null) {
                    pb.setFROMDATE(addDash(pb.getFROMDATE()));
                }
                if (pb.getTODATE() != null) {
                    pb.setTODATE(addDash(pb.getTODATE()));
                }
                /* 2014.06 kny */
                pb.setPURPOSE_CD(initData.getPURPOSE_CD());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return pb;
    }

    protected ModelAndView onSubmit(HttpServletRequest request, HttpServletResponse response, Object command, BindException errors) throws Exception {

        ProductBean objProductBean = (ProductBean) command;

        // 오늘 날짜 , 7일전 날짜 구하기
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd"); // 데이터 출력
        String toDate = sdf.format(cal.getTime()); // 오늘 날짜 변수에 저장
        String year = toDate.substring(0, 4);




        objProductBean.setUP_DATE(toDate);

        String adminNo = ServletRequestUtils.getStringParameter(request, "no");
        String mode = ServletRequestUtils.getStringParameter(request, "mode");
        String TAX_YN = ServletRequestUtils.getStringParameter(request,"TAX_YN");
        String type = ServletRequestUtils.getStringParameter(request,"TYPE");

        initCalBean initData = objJumyongService.getInitCalData(adminNo);
        String message = "";

        objProductBean.setADMIN_NO(adminNo);

        objProductBean.setFROMDATE(removeDash(objProductBean.getFROMDATE())); // fromdate
        objProductBean.setTODATE(removeDash(objProductBean.getTODATE())); // todate

        objProductBean.setUSE_SECTION("2");
        objProductBean.setFIRST_SEQ("");

        objJumyongService.Admin_baseUp_dateUpdateQuery(toDate, objProductBean.getADMIN_NO());

        if (initData.getSECTION().equals("3"))// 무단 점용
        {
            if (mode.equals("add")) {
                int cal_sum_seq = objJumyongService.get_cal_sum_seq(objProductBean.getADMIN_NO());

                if (cal_sum_seq == 0 || TAX_YN.equals("1")) // 최초 입력 (부과된 내용일 경우 새로 입력함)
                {
                    if (mode.equals("add")) {
                        System.out.println("처음 무단 data 입력");
                        int cal_tax_seq = objJumyongService.getCal_Sum_Seq();
                        ProductBean pb2 = objProductBean;
                        pb2.setSEQ(String.valueOf(cal_tax_seq));
                          
                        // 지분점용료 계산
                        long reduction_sum = Long.parseLong(String.valueOf(pb2.getSUM_ADJUST()));
                        
                        float reduction_rate = pb2.getREDUCTION_RATE();
                        float percent_rate = pb2.getPERCENT_RATE();
                        if(percent_rate == 0){
                        	percent_rate = 100;
                        }
                        
                        reduction_sum = (long)(reduction_sum * (percent_rate/100) * (1- reduction_rate/100));
                        
                        if(!type.equals("1")){
                        	reduction_sum = reduction_sum/10*10;
                        }else{
                        	String gongyu_yn = initData.getPURPOSE_CD().substring(0, 1);
                        	if(gongyu_yn.equals("0")){
                        		/* 도로,무단,공유법 10원 절삭 2014.11*/
                        		reduction_sum = reduction_sum/10*10;
                        	}else{
                        		reduction_sum = reduction_sum/100*100;
                        	}
                        }
                        
                        pb2.setREDUCTION_SUM(reduction_sum);
                        
                        String reductionForm = pb2.getFORM_ADJUST();
                        
                        if(percent_rate != 0 && percent_rate != 100){
                        	reductionForm +=" X (" + percent_rate+"/100)";
                        }
                        if(reduction_rate != 0){
                        	reductionForm +=" X (1-"+reduction_rate+"/100)";
                        }
                        
                        pb2.setREDUCTION_FORM(reductionForm);
                        
                        //부가세
                        if(commonCode.inquiryVatYN(objProductBean.getADMIN_NO())){
                        	objProductBean.setVAT(String.valueOf(objProductBean.getREDUCTION_SUM()/100*10));
                        }else{
                        	objProductBean.setVAT("0");
                        }
                        
                        objJumyongService.Cal_Sum_InfoInsert(pb2);
                        objProductBean.setCAL_SUM_SEQ(String.valueOf(cal_tax_seq));
                        objJumyongService.insertProduct(objProductBean);
                        objJumyongService.SetCheckYn(adminNo);
                        objJumyongService.SetTaxYn(adminNo);
                    }
                } else // 이미 입력 되어 있음 cal_sum_info 는 update
                {
                    objProductBean.setCAL_SUM_SEQ(String.valueOf(cal_sum_seq));
                
                    //부가세
                    if(commonCode.inquiryVatYN(objProductBean.getADMIN_NO())){
                    	objProductBean.setVAT(String.valueOf(objProductBean.getREDUCTION_SUM()/100*10));
                    }else{
                    	objProductBean.setVAT("0");
                    	
                    }
                    objJumyongService.insertProduct(objProductBean);
                    System.out.println("Product Insert 완료!");

                    // cal_sum_info 업데이트
                    // form_adjust 업데이트
                    // REDUCTION_FORM 합계 구하기
                    
                    float reduction_rate = objProductBean.getREDUCTION_RATE();
                    float percent_rate = objProductBean.getPERCENT_RATE();
                    if(percent_rate == 0){
                    	percent_rate = 100;
                    }
                    
                    String form_adjust = "";
                    List formAdjustList = objJumyongService.getFormAdjust(adminNo, String.valueOf(cal_sum_seq));
                    for (int i = 0; i < formAdjustList.size(); i++) {
                        Map t = (Map) formAdjustList.get(i);
                        form_adjust += t.get("FORM_ADJUST");
                        if(percent_rate != 0 && percent_rate != 100){
                        	form_adjust +=" X (" + percent_rate+"/100)";
                        }
                        if(reduction_rate != 0){
                        	form_adjust +=" X (1-"+reduction_rate+"/100)";
                        }
                        form_adjust += ",";
                    }
                    
                    
                    objProductBean.setREDUCTION_FORM(form_adjust.substring(0,form_adjust.length() - 1));

                    // sum_adjust 업데이트
                    int pb_sum = objJumyongService.SumBysumSeq(adminNo,String.valueOf(cal_sum_seq));
                    
                    long reduction_sum = Long.parseLong(String.valueOf(pb_sum));
                    
                    reduction_sum = (long)(reduction_sum * (percent_rate/100) * (1- reduction_rate/100));
                    
                    if(!type.equals("1")){
                    	reduction_sum = reduction_sum/10*10;
                    	
                    }else{
                    	reduction_sum = reduction_sum/100*100;
                    }

                    objProductBean.setREDUCTION_SUM(reduction_sum);

                    // area 업데이트
                    objProductBean.setAREA_AFTER(Float.parseFloat(initData.getAREA_SIZE()));

                    objProductBean.setSEQ(String.valueOf(cal_sum_seq));
                    objProductBean.setYEAR(objJumyongService.getMaxYear(adminNo, String.valueOf(cal_sum_seq))); // 년도를 max year로 세팅
                    
                    //부가세
                    if(commonCode.inquiryVatYN(objProductBean.getADMIN_NO())){
                    	objProductBean.setVAT(String.valueOf(objProductBean.getREDUCTION_SUM()/100*10));
                    }else{
                    	objProductBean.setVAT("0");
                    }
                    objJumyongService.CalSumAddUpdate(objProductBean);

                }
                
            } else if (mode.equals("edit")) {
                System.out.println("edit!!!");
                
                //부가세
                if(commonCode.inquiryVatYN(objProductBean.getADMIN_NO())){
                	objProductBean.setVAT(String.valueOf(objProductBean.getREDUCTION_SUM()/100*10));
                    
                 }else{
                 	objProductBean.setVAT("0");
                    
                }

                objJumyongService.updateProduct(objProductBean);
                objProductBean.setSEQ(objProductBean.getCAL_SUM_SEQ());

                int cal_sum_seq = objJumyongService.get_cal_sum_seq(objProductBean.getADMIN_NO());
                
                // form_adjust 업데이트
                float reduction_rate = objProductBean.getREDUCTION_RATE();
                float percent_rate = objProductBean.getPERCENT_RATE();
                if(percent_rate == 0){
                	percent_rate = 100;
                }
                
                String form_adjust = "";
                List formAdjustList = objJumyongService.getFormAdjust(adminNo, String.valueOf(cal_sum_seq));
                for (int i = 0; i < formAdjustList.size(); i++) {
                    Map t = (Map) formAdjustList.get(i);
                    form_adjust += t.get("FORM_ADJUST");
                    if(percent_rate != 0 && percent_rate != 100){
                    	form_adjust +=" X (" + percent_rate+"/100)";
                    }
                    if(reduction_rate != 0){
                    	form_adjust +=" X (1-"+reduction_rate+"/100)";
                    }
                    form_adjust += ",";
                }
                objProductBean.setREDUCTION_FORM(form_adjust);

                
                // sum_adjust 업데이트
                int pb_sum = objJumyongService.SumBysumSeq(adminNo,String.valueOf(cal_sum_seq));
                
                long reduction_sum = Long.parseLong(String.valueOf(pb_sum));
                
                
                reduction_sum = (long)(reduction_sum * (percent_rate/100) * (1- reduction_rate/100));
                
                if(!type.equals("1")){
                	reduction_sum = reduction_sum/10*10;
                	
                }else{
                	String gongyu_yn = initData.getPURPOSE_CD().substring(0, 1);
                	if(gongyu_yn.equals("0")){
                		/* 도로,무단,공유법 10원 절삭 2014.11*/
                		reduction_sum = reduction_sum/10*10;
                	}else{
                		reduction_sum = reduction_sum/100*100;
                	}
                	
                }

                objProductBean.setREDUCTION_SUM(reduction_sum);
                
                objProductBean.setYEAR(objJumyongService.getMaxYear(adminNo, String.valueOf(cal_sum_seq))); // 년도를 max year로 세팅
                //부가세
                if(commonCode.inquiryVatYN(objProductBean.getADMIN_NO())){
                    	objProductBean.setVAT(String.valueOf(objProductBean.getREDUCTION_SUM()/100*10));
                    
                 }else{
                	 	objProductBean.setVAT("0");
                        
                 }
                System.out.println("부가세부가세부가세부가세 : : : : " + objProductBean.getVAT());
                
                
                objJumyongService.CalSumAddUpdate(objProductBean);
                objJumyongService.SetCheckYn(adminNo);
                objJumyongService.SetTaxYn(adminNo);
                // System.out.println("edit end!!");
            }
        } else { //일시 or 계속
            if (mode.equals("add")) {
                int cal_tax_seq = objJumyongService.getCal_Sum_Seq();
                ProductBean pb2 = objProductBean;
                pb2.setSEQ(String.valueOf(cal_tax_seq));
                
                //부가세
                if(commonCode.inquiryVatYN(objProductBean.getADMIN_NO())){
                	objProductBean.setVAT(String.valueOf(objProductBean.getREDUCTION_SUM()/100*10));
                    
                  }else{
                		objProductBean.setVAT("0");
                        
                }
                objJumyongService.Cal_Sum_InfoInsert(pb2);
                objProductBean.setCAL_SUM_SEQ(String.valueOf(cal_tax_seq));
                objJumyongService.insertProduct(objProductBean);
                objJumyongService.SetCheckYn(adminNo);
                objJumyongService.SetTaxYn(adminNo);
            } else if (mode.equals("edit")) {
            	//부가세
                if(commonCode.inquiryVatYN(objProductBean.getADMIN_NO())){
                	objProductBean.setVAT(String.valueOf(objProductBean.getREDUCTION_SUM()/100*10));
                }else{
                 	objProductBean.setVAT("0");
                }
                objJumyongService.updateProduct(objProductBean);
                objProductBean.setSEQ(objProductBean.getCAL_SUM_SEQ());

                if(commonCode.inquiryVatYN(objProductBean.getADMIN_NO())){
                	objProductBean.setVAT(String.valueOf(objProductBean.getREDUCTION_SUM()/100*10));
                    
                 }else{
                 	objProductBean.setVAT("0");
                    
                }
                objJumyongService.CalSumUpdate(objProductBean);
                objJumyongService.SetCheckYn(adminNo);
                objJumyongService.SetTaxYn(adminNo);
            }
        }
        // 페이지 성공후 돌아갈 페이지
        setSuccessView("redirect:/jumyong/productInsert.do?no=" + adminNo + "&message=" + message);

        return new ModelAndView(getSuccessView());
    }

    public String removeDash(String val1) {
        if (val1 != null && val1.length() > 0) {
            String[] components = val1.split("-");
            String returnVal = "";
            for (int i = 0; i < components.length; i++) {
                returnVal = returnVal + components[i].toString();
            }

            return returnVal;
        } else {
            return "";
        }
    }

    public String addDash(String val1) {
        if (val1.length() >= 8) {
            val1 = val1.substring(0, 4) + "-" + val1.substring(4, 6) + "-" + val1.substring(6, 8);
        } else if (val1.length() >= 6) {
            val1 = val1.substring(0, 4) + "-" + val1.substring(4, 6);
        }

        return val1;
    }
}
