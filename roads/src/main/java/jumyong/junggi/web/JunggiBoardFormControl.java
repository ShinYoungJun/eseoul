package main.java.jumyong.junggi.web;

import main.java.common.commonCode.model.UserBean;
import main.java.common.commonCode.service.CommonCodeService;
import main.java.common.util.Globals;
import main.java.common.util.catUtil.Pageing;
import main.java.common.util.catUtil.Util;

import java.io.StringReader;
import java.text.SimpleDateFormat;
import java.util.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.jdom.Document;
import org.jdom.Element;
import org.jdom.input.SAXBuilder;
import org.jdom.output.XMLOutputter;
import org.springframework.validation.BindException;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;
import org.springframework.web.bind.ServletRequestUtils;

import main.java.jumyong.jumyong.service.IJumyongService;

import main.java.jumyong.jumyong.model.ProductBean;
import main.java.jumyong.jumyonginfo.model.TotalWIthBean;

import main.java.jumyong.junggi.service.*;
import main.java.jumyong.saewe.service.ISaeweService;

public class JunggiBoardFormControl extends SimpleFormController {

    /**
     * CALCULATION 리스트 조회
     *
     * @param HttpServletRequest
     *            request
     * @param HttpServletResponce
     *            responce
     * @return ModelAndView
     */
    private Pageing pageing = new Pageing();
    private Util util = new Util();
    private IJunggiService objJunggiService = null;
    private IJumyongService objJumyongService = null;
    private ISaeweService iSaeweService = null;
    private CommonCodeService commonCode = null;

    public void setJunggiService(JunggiService newObjJunggiService) {
        this.objJunggiService = newObjJunggiService;
    }

    public void setJumyongService(IJumyongService newObjJumyongService) {
        this.objJumyongService = newObjJumyongService;
    }

    public void setCommonCodeService(CommonCodeService commonCode) {
        this.commonCode = commonCode;
    }

    public JunggiBoardFormControl() {
        setBindOnNewForm(true);
    }

    protected Object formBackingObject(HttpServletRequest request)
            throws ServletException {

        HttpSession session = request.getSession();
        String userId = (String) session.getAttribute("sessionUserId");

        try {
            if (userId != null) {

                System.out.println("********** formBackingObject **************");


                // 관리자 데이터를 가져온다.
                UserBean userBean = new UserBean();
                userBean = commonCode.executeUserSearch(util.getSessionID(request, "sessionUserId"));
                String sigu_cd = userBean.getSIGU_CD();
                String si_cd = util.getSidoCode(getMessageSourceAccessor());

                String mode = ServletRequestUtils.getStringParameter(request, "mode");
                String ADMIN_NO = ServletRequestUtils.getStringParameter(request, "ADMIN_NO");
                String year = ServletRequestUtils.getStringParameter(request, "year");
                String cal_sum_seq = ServletRequestUtils.getStringParameter(request, "sum_seq", "");
                String seq = ServletRequestUtils.getStringParameter(request, "SEQ", "");
                String strCurrentPage = ServletRequestUtils.getStringParameter(request, "currentPage",Globals.DEFAULT_CURRENT_PAGE);
                String strCountPerPage = ServletRequestUtils.getStringParameter(request, "countPerPage", "4");

                int countPerPage = Integer.parseInt(strCountPerPage);

                // 현년도 계산
                Calendar cal = Calendar.getInstance();
                SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd");
                String thisDate = formatter.format(cal.getTime());
                String thisYear = thisDate.substring(0, 4);

                request.setAttribute("no", ADMIN_NO);
                request.setAttribute("currentPage", strCurrentPage);
                request.setAttribute("countPerPage", strCountPerPage);
                request.setAttribute("mode", mode);

                System.out.println("mode ====== " + mode);
                System.out.println("year ===== " + year);
                System.out.println("SEQ : seq==== " + seq);

                // 합계리스트 개수 및 페이징
                int listTotCount = objJunggiService.getcal_sum_infoListCount(ADMIN_NO, year);

                int rowCol = pageing.execute(request, listTotCount, Integer.parseInt(strCurrentPage), countPerPage);

                // 합계리스트
                List cal_sum_infoList = objJunggiService.cal_sum_infoList(ADMIN_NO, year, rowCol, rowCol + 3);
                request.setAttribute("cal_sum_infoList", cal_sum_infoList);

                // 년도별 리스트
                // sum_seq 파라미터 없는 경우
                if (!"edit".equals(mode)) {
                    if (cal_sum_seq == null || "".equals(cal_sum_seq)) {

                        // 현재년도 정보 보여주도록
                        for (int i = 0; i < cal_sum_infoList.size(); i++) {
                            ProductBean aa = (ProductBean) cal_sum_infoList.get(i);
                            year = aa.getYEAR();
                            if (thisYear.equals(year)) {
                                year = thisYear;
                                cal_sum_seq = aa.getSEQ();
                                break;
                            }
                        }

                        // 현재년도 정보가 없는 경우 최상위 seq
                        if (cal_sum_seq == null || "".equals(cal_sum_seq)) {
                            cal_sum_seq = ((ProductBean) cal_sum_infoList.get(0)).getSEQ();
                        }
                    }
                } // 수정일 경우
                else if (mode != null && "edit".equals(mode)) {
                    // 해당년도 정보 보여주도록
                    for (int i = 0; i < cal_sum_infoList.size(); i++) {
                        ProductBean pb = (ProductBean) cal_sum_infoList.get(i);
                        String year_arr = pb.getYEAR();

                        if (year_arr.equals(year)) {
                            year = year_arr;
                            cal_sum_seq = pb.getSEQ();
                            break;
                        }
                    }
                }

                request.setAttribute("year", year);
                request.setAttribute("sum_seq", cal_sum_seq);

                List ImpositionInfoByCalSumList_multi = objJunggiService.ImpositionInfoByCalSumList_multi(ADMIN_NO, year);
                int listSize = ImpositionInfoByCalSumList_multi.size();

                request.setAttribute("ImpositionInfoByCalSumList",
                        ImpositionInfoByCalSumList_multi);
                request.setAttribute("listSize", String.valueOf((listSize)));

                // forwview 설정
                String strFormView = "/jumyong/junggi/info_product";
                setFormView(strFormView);

                ProductBean pb = new ProductBean();

                // info
                if (listSize > 0) // 년도별 리스트가 있을때
                {
                    if (seq == null || seq.equals("") || seq.equals("null")) {
                        seq = ((ProductBean) ImpositionInfoByCalSumList_multi.get(0)).getSEQ();
                    }

                    // info정보
                    System.out.println("info정보 가져올 seq =======  " + seq);

                    pb = objJunggiService.impositionInfo_tax(seq, ADMIN_NO,year);

                    // 날짜에 대쉬(-) 추가
                    if (pb.getFROMDATE() != null) {
                        pb.setFROMDATE(addDash(pb.getFROMDATE()));
                    }
                    if (pb.getTODATE() != null) {
                        pb.setTODATE(addDash(pb.getTODATE()));
                    }

                    if (pb.getTAX_DATE() != null) {
                        pb.setTAX_DATE(util.Date_Paste(pb.getTAX_DATE()));
                    }
                    if (pb.getINDATE() != null) {
                        pb.setINDATE(util.Date_Paste(pb.getINDATE()));
                    }
                    if (pb.getOVERDATE() != null) {
                        pb.setOVERDATE(util.Date_Paste(pb.getOVERDATE()));
                    }

                    // 날짜에 대쉬(-) 추가 끝
                    }
                request.setAttribute("seq", seq);
                request.setAttribute("yearAdd", String.valueOf(Integer.parseInt(thisYear) + 1));

                if (mode.equals("add")) {
                    System.out.println(" ******** add *********** ");
                    // 안들어옴 -> 변경(2009.8.7)
                    String yearVal1 = "";

                    // 정기분 산출상태일 경우 다음년도로 셋팅
                    yearVal1 = String.valueOf(Integer.parseInt(pb.getYEAR()) + 1);

                    if (objJunggiService.GetCountSameCal(pb.getFIRST_SEQ(),pb.getYEAR()) > 1) {
                        pb.setUSE_SECTION("2");
                        pb.setUSE_SECTIONNAME("수시");

                    }

                    // 전년도 점용료 계산
                    double sum_lastYear = 0;
                    float area_after = pb.getAREA_AFTER();
                    float price = new Float(util.nullTo(String.valueOf(pb.getPRICE()), "1")).floatValue();
                    float rate = new Float(util.nullTo(String.valueOf(pb.getRATE()), "1")).floatValue();
                    float surcharge_rate = pb.getSURCHARGE_RATE();
                    if (surcharge_rate < 1) {
                        surcharge_rate = 1;
                    }

                    if ("3".equals(pb.getSECTION().trim())) {
                        sum_lastYear = area_after * price * rate * surcharge_rate;
                    } else {
                        sum_lastYear = area_after * price * rate;
                    }

                    if (pb.getTYPE().equals("1")) {
                        // 100원 절삭
                        sum_lastYear = (Math.floor(sum_lastYear / 100)) * 100;
                    } else {
                        // 10원 절삭
                        sum_lastYear = (Math.floor(sum_lastYear / 10)) * 10;
                    }
                    
                    if( pb.getSUM_LASTYEAR() == 0){
                        pb.setSUM_LASTYEAR((int) sum_lastYear);
                    }else {
						pb.setSUM_LASTYEAR(pb.getSUM_ADJUST());
					}

                    pb.setSUM_YEAR(0);
                    pb.setSUM_ADJUST(0);
                    pb.setFORM("");
                    pb.setFORM_ADJUST("");




                    pb.setPERIOD(12);
                    pb.setYEAR(yearVal1);
                    pb.setFROMDATE(yearVal1 + "0101");
                    pb.setTODATE(yearVal1 + "1231");
                    pb.setTAX_DATE(util.Date_Paste(thisDate));

                    request.setAttribute("old_use_section", pb.getTAX_GUBUN().trim());
                    request.setAttribute("old_price", String.valueOf(pb.getPRICE()));
                    request.setAttribute("old_rate", String.valueOf(pb.getRATE()));
                    request.setAttribute("old_area_after", String.valueOf(pb.getAREA_AFTER()));

                    price = objJunggiService.getNowPrice(ADMIN_NO, year); // 등록된 공시지가 가져오기
                    pb.setPRICE((long) price);

                } else {
                    pb.setMOMEY((long) pb.getRATE());
                    pb.setYOYUL(pb.getRATE());
                    request.setAttribute("old_use_section", pb.getTAX_GUBUN().trim());
                    request.setAttribute("old_price", String.valueOf(pb.getPRICE()));
                    request.setAttribute("old_rate", String.valueOf(pb.getRATE()));
                    request.setAttribute("old_area_after", String.valueOf(pb.getAREA_AFTER()));
                }
                
                if ("3".equals(pb.getSECTION())) {
                    request.setAttribute("PRICE_NAME", "변상금");
                } else {
                    request.setAttribute("PRICE_NAME", "점용료");
                }
                
                // 날짜에 대쉬(-) 추가
                if (pb.getFROMDATE() != null) {
                    pb.setFROMDATE(addDash(pb.getFROMDATE()));
                }
                if (pb.getTODATE() != null) {
                    pb.setTODATE(addDash(pb.getTODATE()));
                }
                if (pb.getCHECK_YN() != null) {
                    pb.setCHECK_YN(pb.getCHECK_YN().trim());
                }
                if (pb.getADD_SET() != null) {
                    pb.setADD_SET(pb.getADD_SET().trim());
                }
                if (pb.getADD_YN() != null) {
                    pb.setADD_YN(pb.getADD_YN().trim());
                }

                return pb;


            }
        } catch (Exception e) {
            System.out.println("error:" + e.toString());
        }

        ProductBean pb2 = new ProductBean();

        return pb2;

    }

    protected ModelAndView onSubmit(HttpServletRequest request, HttpServletResponse response, Object command, BindException errors)
            throws Exception {
        try {
            // 입력 수정 위해 mode를 가지고 옴
            String mode = ServletRequestUtils.getStringParameter(request,"mode");
            String seq = ServletRequestUtils.getStringParameter(request, "SEQ");

            String area_all = ServletRequestUtils.getStringParameter(request,"area_all", "0");
            String listSize = ServletRequestUtils.getStringParameter(request,"listSize", "0");

            // 현년도 계산
            Calendar cal = Calendar.getInstance();
            SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd");
            String thisDate = formatter.format(cal.getTime());

            System.out.println(" ********  onSubmit  START ************* ");

            ProductBean objProductBean = (ProductBean) command;

            objProductBean.setFROMDATE(removeDash(objProductBean.getFROMDATE()));
            objProductBean.setTODATE(removeDash(objProductBean.getTODATE()));
            objProductBean.setAREA_ALL(Float.parseFloat(area_all));

            if ("add".equals(mode)) {

                if (objJunggiService.cal_sum_exist(objProductBean.getADMIN_NO(), objProductBean.getYEAR(),objProductBean.getFROMDATE(),objProductBean.getTODATE()) > 0) { // 이미
                    // 해당연도
                    // 정기분
                    // 값이
                    // 들어가
                    // 있으면
                    // return
                    // forwview 설정
                    String strFormView = "redirect:/jumyong/junggi/junggi_view.do?ADMIN_NO=" + objProductBean.getADMIN_NO() + "&year=" + objProductBean.getYEAR() + "&message=이미 해당년도 정기분이 있습니다.";
                    setSuccessView(strFormView);

                } else {

                    // 면적추가 없이 한개인 경우 add insert
                    // if( Integer.parseInt(listSize) == 1 ){
                    System.out.println("***** 한개인 경우 add  START ****");
                    junggiOneInsert(request, response, objProductBean);

                    // }
                    // else {

                    // *********** 여러개 합산일 경우 add START ************* // -- 일단
                    // 보류중...
                    // junggiMultiInsert(request, response, objProductBean);
                    // }

                    String strFormView = "redirect:/jumyong/junggi/junggi_view.do?&ADMIN_NO=" + objProductBean.getADMIN_NO() + "&year=" + objProductBean.getYEAR() + "&mode=" + mode + "&message=등록되었습니다.";
                    setSuccessView(strFormView);

                }// 정기분 중복 체크 end

            } else if ("edit".equals(mode)) {

                System.out.println(" ***** edit 수정 *********");
                
                //부가세
                if (commonCode.inquiryVatYN(objProductBean.getADMIN_NO())) {
                    objProductBean.setVAT(String.valueOf(objProductBean.getREDUCTION_SUM() / 100 * 10));
                } else {
                    objProductBean.setVAT("0");
                }

                // *************************************************
                // 1. calculation 정보 수정
                objProductBean.setUP_DATE(thisDate);
                objJumyongService.updateProduct(objProductBean);

                // ************************************************
                // 2. cal_sum_info 업데이트
                int cal_sum_seq = objJunggiService.getCal_tax_seq(objProductBean.getADMIN_NO(), objProductBean.getYEAR());
                objProductBean.setCAL_SUM_SEQ(String.valueOf(cal_sum_seq));
                objProductBean.setSEQ(String.valueOf(cal_sum_seq));
                objProductBean.setUP_DATE(thisDate);
                objProductBean.setUSE_SECTION("1");
                objJunggiService.CalSumUpdate(objProductBean);

                // ************************************************
                // 3. taxation_info 업데이트
                objProductBean.setTAX_DATE(util.Date_Cut(objProductBean.getTAX_DATE()));
                objProductBean.setINDATE(util.Date_Cut(objProductBean.getINDATE()));
                objProductBean.setOVERDATE(util.Date_Cut(objProductBean.getOVERDATE()));
                objProductBean.setFORM1(objProductBean.getFORM_ADJUST());
                objProductBean.setFORM2(objProductBean.getFORM());
                objProductBean.setTAX_YM(objProductBean.getTAX_DATE().substring(0, 6));
                objProductBean.setSEQ(objProductBean.getCAL_SUM_SEQ());

                long sum = Long.parseLong(String.valueOf(objProductBean.getREDUCTION_SUM()));
               
                System.out.println("부가세부가세부가세부가세 : : : : " + objProductBean.getVAT());

                if (objProductBean.getTAX_CD() != null && !"".equals(objProductBean.getTAX_CD())) {
                    String cd = objProductBean.getTAX_CD().substring(0, 2);
                    objProductBean.setBONSE(String.valueOf(sum));
                    objProductBean.setSISE(String.valueOf(sum));
                    objProductBean.setGUSE(String.valueOf(0));

                }
                objProductBean.setINTAX(String.valueOf(sum));
                if (objProductBean.getGIGUM() == null || "".equals(objProductBean.getGIGUM())) {
                    objProductBean.setGIGUM("0");
                }
                if (objProductBean.getGUKSE() == null || "".equals(objProductBean.getGUKSE())) {
                    objProductBean.setGUKSE("0");
                }
                objJunggiService.updateTaxation_info(objProductBean);

                String strFormView = "redirect:/jumyong/junggi/junggi_view.do?seq=" + seq + "&ADMIN_NO=" + objProductBean.getADMIN_NO() + "&year=" + objProductBean.getYEAR() + "&mode=" + mode + "&message=수정되었습니다.";
                setSuccessView(strFormView);

            }

            // 검토 미검토 -> 검토로 수정 , 부과 , 미부과 -> 미부과로 수정
            objJumyongService.SetCheckYn(objProductBean.getADMIN_NO());
            objJumyongService.SetTaxYn(objProductBean.getADMIN_NO());

            // ADMIN_BASE 업데이트 날짜 갱신
            objJumyongService.Admin_baseUp_dateUpdateQuery(thisDate,objProductBean.getADMIN_NO());

            System.out.println(" ********  onSubmit  END ************* ");

        } catch (Exception err) {
            System.out.println("입력,수정에러=" + err.toString());
        }

        return new ModelAndView(getSuccessView());
    }

    // 면적추가 없이 한개인 경우 add insert
    public void junggiOneInsert(HttpServletRequest request,
            HttpServletResponse response, ProductBean objProductBean) {

        // 년도에 맞는 cal_sum_seq 있는지 검색 있으면 가져오고 없으면 0
        int cal_sum_seq = objJunggiService.getCal_tax_seq(objProductBean.getADMIN_NO(), objProductBean.getYEAR());

        objProductBean.setUSE_SECTION("1"); // 정기분 셋팅
        // 현년도 계산
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd");
        String thisDate = formatter.format(cal.getTime());

        if (cal_sum_seq == 0) {

            // cal_sum_seq 새로 생성 가져오기
            cal_sum_seq = objJumyongService.getCal_Sum_Seq();

            // ************************************************
            // 1. calculation_info 에 입력
            objProductBean.setCAL_SUM_SEQ(String.valueOf(cal_sum_seq));
            objProductBean.setPREV_SEQ("2"); // PREV_SEQ null아닐시 : 1. 산출전 , null
            // 2. 산출후
            objProductBean.setFIRST_SEQ(""); // FIRST_SEQ 사용 이유가 없어서 null 셋팅
            objProductBean.setUP_DATE(thisDate);

            // 부가세
            if (commonCode.inquiryVatYN(objProductBean.getADMIN_NO())) {
                objProductBean.setVAT(String.valueOf(objProductBean.getREDUCTION_SUM() / 100 * 10));
            } else {
                objProductBean.setVAT("0");

            }
            System.out.println("부가세부가세부가세부가세 : : : : " + objProductBean.getVAT());

            objJumyongService.insertProduct(objProductBean);

            // ************************************************
            // 2.cal_sum_info 에 입력
            objProductBean.setSEQ(String.valueOf(cal_sum_seq));
            objProductBean.setTAX_SEQ(String.valueOf(cal_sum_seq));
            objJumyongService.Cal_Sum_InfoInsert(objProductBean);

            // ************************************************
            // 3.taxation에 입력
            objProductBean.setTAX_GUBUN("1");
            objProductBean.setTAX_DATE(util.Date_Cut(objProductBean.getTAX_DATE()));
            objProductBean.setINDATE(util.Date_Cut(objProductBean.getINDATE()));
            objProductBean.setOVERDATE(util.Date_Cut(objProductBean.getOVERDATE()));
            objProductBean.setFORM1(objProductBean.getFORM_ADJUST());
            objProductBean.setFORM2(objProductBean.getFORM());
            objProductBean.setTAX_NO("");
            objProductBean.setTAX_YM(objProductBean.getTAX_DATE().substring(0,
                    6));
            objProductBean.setSEQ(objProductBean.getCAL_SUM_SEQ());

            long sum = Long.parseLong(String.valueOf(objProductBean.getSUM_ADJUST()));

            long reduction_sum = Long.parseLong(String.valueOf(objProductBean.getREDUCTION_SUM()));

            if (objProductBean.getTAX_CD() != null && !"".equals(objProductBean.getTAX_CD())) {
                String cd = objProductBean.getTAX_CD().substring(0, 2);
                // if( "10".equals(cd) ){ // 무조건 시세에 들어가도록 수정
                objProductBean.setBONSE(String.valueOf(reduction_sum));
                objProductBean.setSISE(String.valueOf(reduction_sum));
                objProductBean.setGUSE(String.valueOf(0));

            }
            objProductBean.setINTAX(String.valueOf(reduction_sum));

            // 부가세
            if (commonCode.inquiryVatYN(objProductBean.getADMIN_NO())) {
                objProductBean.setVAT(String.valueOf(reduction_sum / 100 * 10));
            } else {
                objProductBean.setVAT("0");

            }
            System.out.println("부가세부가세부가세부가세 : : : : " + objProductBean.getVAT());

            if (objProductBean.getGIGUM() == null || "".equals(objProductBean.getGIGUM())) {
                objProductBean.setGIGUM("0");
            }
            if (objProductBean.getGUKSE() == null || "".equals(objProductBean.getGUKSE())) {
                objProductBean.setGUKSE("0");
            }
            objJunggiService.executeBugwa_Register(objProductBean);

            objJunggiService.SetCal_Sum_Info_taxseq(objProductBean.getCAL_SUM_SEQ());

        } else {

            // calculation 에 입력
            objProductBean.setCAL_SUM_SEQ(String.valueOf(cal_sum_seq));
            objProductBean.setUP_DATE(thisDate);

            // 부가세
            if (commonCode.inquiryVatYN(objProductBean.getADMIN_NO())) {
                objProductBean.setVAT(String.valueOf(objProductBean.getREDUCTION_SUM() / 100 * 10));
            } else {
                objProductBean.setVAT("0");

            }
            System.out.println("부가세부가세부가세부가세 : : : : " + objProductBean.getVAT());

            objJumyongService.insertProduct(objProductBean);

            // cal_sum_info 업데이트
            // form_adjust 업데이트
            objProductBean.setFORM_ADJUST(objJumyongService.FormAdjustList(cal_sum_seq));

            // sum_adjust 업데이트
            ProductBean pb_sum = objJunggiService.SumBysumSeq(String.valueOf(cal_sum_seq));

            // System.out.println("sum_adjust11="+pb_sum.getSUM_ADJUST());
            objProductBean.setSUM_ADJUST(pb_sum.getSUM_ADJUST());

            // area 업데이트
            objProductBean.setAREA_AFTER(pb_sum.getAREA_AFTER());

            objProductBean.setSEQ(String.valueOf(cal_sum_seq));
            objJunggiService.CalSumAddUpdate(objProductBean);
        }
        // ********** 한개인 경우 add END ************* //

        System.out.println(" ***** 한개인 경우 add  END **** ");

    }

    // 면적추가 여러개인 경우 add insert
    public void junggiMultiInsert(HttpServletRequest request,
            HttpServletResponse response, ProductBean objProductBean) {
        // *********** 여러개 합산일 경우 add END ************* // -- 일단 보류중...
    }

    public String addDash(String val1) {
        if (val1.length() > 8) {
            return val1.substring(0, 4) + "-" + val1.substring(4, 6) + "-" + val1.substring(6, 8);
        } else {
            return val1;
        }
    }

    public String removeDash(String val1) {
        String[] components = val1.split("-");
        String returnVal = "";
        for (int i = 0; i < components.length; i++) {
            returnVal = returnVal + components[i].toString();
        }

        return returnVal;
    }

    public String removeDash1(String val1) {
        String[] components = val1.split(".");
        String returnVal = "";
        for (int i = 0; i < components.length; i++) {
            returnVal = returnVal + components[i].toString();
        }

        return returnVal;
    }
}
