/***********************************
 * ������ : 2007.9.27
 * ���������� : ������
 * �������� :
 ***********************************/
package main.java.jumyong.junggi.web;

import main.java.common.commonCode.model.UserBean;
import main.java.common.commonCode.service.CommonCodeService;
import main.java.common.util.Globals;
import main.java.common.util.catUtil.Pageing;
import main.java.common.util.catUtil.Util;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.jdom.Document;
import org.jdom.Element;
import org.jdom.input.SAXBuilder;
import org.jdom.output.XMLOutputter;
import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import java.io.StringReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Map;

import java.util.List;

import main.java.jumyong.jumyong.model.ProductBean;
import main.java.jumyong.jumyong.model.SearchBean;
import main.java.jumyong.jumyong.model.placeWithAddrBean;

import main.java.jumyong.jumyong.model.jumyongBean;
import main.java.jumyong.jumyong.service.IJumyongService;
import main.java.jumyong.jumyonginfo.model.TotalWIthBean;
import main.java.jumyong.saewe.model.SaeweBean;
import main.java.jumyong.saewe.model.TaxationBean;
import main.java.jumyong.saewe.service.ISaeweService;

import main.java.jumyong.junggi.service.JunggiService;
import main.java.jumyong.junggi.service.IJunggiService;

//********** BEGIN_����_20120308
import main.java.common.commonCode.model.TaxCodeBean;
import main.java.jumyong.saewe.model.semokBean;
import main.java.jumyong.saewe.web.BugaWebControl;
import BugaWebService_pkg.BugaWS;
//********** END_����_20120308
public class JunggiBoardControl extends MultiActionController {

    /**
     * QABoard ����Ʈ ��ȸ (login ���ѻ��¿� ���̴� ����Ʈ)
     * 
     * @param HttpServletRequest
     *            request
     * @param HttpServletResponce
     *            responce
     * @return ModelAndView
     */
    private IJunggiService objJunggiService = null;
    private IJumyongService objJumyongService = null;
    private CommonCodeService commonCode = null;
    private ISaeweService iSaeweService = null;
    private Util util = new Util();
    private Pageing pageing = new Pageing();

    public void setJunggiService(JunggiService newObjJunggiService) {
        this.objJunggiService = newObjJunggiService;
    }

    public void setCommonCodeService(CommonCodeService commonCode) {
        this.commonCode = commonCode;
    }

    public void setJumyong_saeweService(ISaeweService jumyong_saeweService) {
        this.iSaeweService = jumyong_saeweService;
    }

    public void setJumyongService(IJumyongService newObjJumyongService) {
        this.objJumyongService = newObjJumyongService;
    }

    public ModelAndView junggi_view(HttpServletRequest request,
            HttpServletResponse response) throws Exception {
        // ���� ����
        HttpSession session = request.getSession();

        System.out.println("!!!!!!!!!!! JungGiBoardControl.junggi_view here...");
        
        String userId = (String) session.getAttribute("sessionUserId");

        // ���⵵ ���
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd");
        String thisDate = formatter.format(cal.getTime());
        String thisYear = thisDate.substring(0, 4);

        String goUrl = "/jumyong/junggi/info_product_view"; // ������ url

        try {

            if (userId != null) {

                String ADMIN_NO = ServletRequestUtils.getStringParameter(request, "ADMIN_NO");
                String year = ServletRequestUtils.getStringParameter(request,"year");
                String cal_sum_seq = ServletRequestUtils.getStringParameter(request, "sum_seq", "");
                String seq = ServletRequestUtils.getStringParameter(request,"seq", "");
                String strCurrentPage = ServletRequestUtils.getStringParameter(request, "currentPage", Globals.DEFAULT_CURRENT_PAGE);
                String strCurrentPage2 = ServletRequestUtils.getStringParameter(request, "currentPage2",Globals.DEFAULT_CURRENT_PAGE);
                String strCountPerPage = ServletRequestUtils.getStringParameter(request, "countPerPage", "4");
                String message = ServletRequestUtils.getStringParameter(request, "message", "");
                String mode = ServletRequestUtils.getStringParameter(request,"mode", "");

                int countPerPage = Integer.parseInt(strCountPerPage);

                request.setAttribute("ADMIN_NO", ADMIN_NO);
                request.setAttribute("currentPage", strCurrentPage);
                request.setAttribute("countPerPage", strCountPerPage);

                System.out.println(" ******* JunggiBoardControl : junggi_view  START ***** ");
                System.out.println("ADMIN_NO==== " + ADMIN_NO);
                System.out.println("year 0000 ===== " + year);

                // �հ踮��Ʈ ����
                int listTotCount = objJunggiService.getcal_sum_infoListCount(ADMIN_NO, year);

                // ����¡
                int rowCol = pageing.execute(request, listTotCount, Integer.parseInt(strCurrentPage), countPerPage);

                // �հ踮��Ʈ
                List cal_sum_infoList = objJunggiService.cal_sum_infoList(ADMIN_NO, year, rowCol, rowCol + 3);
                request.setAttribute("cal_sum_infoList", cal_sum_infoList);

                if (!"edit".equals(mode)) {
                    if (cal_sum_seq == null || "".equals(cal_sum_seq)) {

                        // ����⵵ ���� �����ֵ���
                        for (int i = 0; i < cal_sum_infoList.size(); i++) {
                            ProductBean aa = (ProductBean) cal_sum_infoList.get(i);
                            year = aa.getYEAR();

                            if (thisYear.equals(year)) {
                                year = thisYear;
                                cal_sum_seq = aa.getSEQ();
                                break;
                            }
                        }

                        // ����⵵ ������ ���� ��� �ֻ��� seq
                        if (cal_sum_seq == null || "".equals(cal_sum_seq)) {
                            cal_sum_seq = ((ProductBean) cal_sum_infoList.get(0)).getSEQ();
                        }
                    }
                } // ������ ���
                else if (mode != null && "edit".equals(mode)) {
                    // �ش�⵵ ���� �����ֵ���
                    for (int i = 0; i < cal_sum_infoList.size(); i++) {
                        ProductBean aa = (ProductBean) cal_sum_infoList.get(i);
                        String year_arr = aa.getYEAR();

                        if (year_arr.equals(year)) {
                            year = year_arr;
                            cal_sum_seq = aa.getSEQ();
                            break;
                        }
                    }
                }

                if (cal_sum_seq == null || cal_sum_seq.equals("") || cal_sum_seq.equals("null")) {
                    cal_sum_seq = ((ProductBean) cal_sum_infoList.get(0)).getSEQ();
                }
                request.setAttribute("sum_seq", cal_sum_seq);

                List ImpositionInfoByCalSumList_multi = objJunggiService.ImpositionInfoByCalSumList_multi(ADMIN_NO, year);
                int listSize = ImpositionInfoByCalSumList_multi.size();

                request.setAttribute("ImpositionInfoByCalSumList",ImpositionInfoByCalSumList_multi);
                request.setAttribute("listSize", String.valueOf((listSize)));

                ProductBean pb = new ProductBean();
                // //////////info
                if (listSize > 0) // �⵵�� ����Ʈ�� ������
                {
                    if (seq == null || seq.equals("") || seq.equals("null")) {
                        seq = ((ProductBean) ImpositionInfoByCalSumList_multi.get(0)).getSEQ();
                    }
                    // System.out.println("seq===== " + seq);

                    // info����
                    // pb = objJunggiService.impositionInfo(seq);
                    pb = objJunggiService.impositionInfo_tax(seq, ADMIN_NO,year);

                    if (pb != null) {
                        // ��¥�� �뽬(-) �߰�
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

                        pb.setMOMEY((long) pb.getRATE());
                        pb.setYOYUL(pb.getRATE());

                    } else {
                        // System.out.println(" *** junggi_product.do *** ");
                        goUrl = "redirect:/jumyong/junggi/junggi_product.do?ADMIN_NO=" + ADMIN_NO + "&SEQ=" + seq + "&sum_seq=" + cal_sum_seq + "&currentPage=" + strCurrentPage + "&year=" + year + "&mode=add";
                    }
                }

                if ("3".equals(pb.getSECTION())) {
                    request.setAttribute("PRICE_NAME", "�����");
                } else {
                    request.setAttribute("PRICE_NAME", "�����");
                }

                request.setAttribute("year", year);
                request.setAttribute("seq", seq);
                request.setAttribute("product", pb);
                request.setAttribute("message", message);
                request.setAttribute("yearAdd", String.valueOf(Integer.parseInt(thisYear) + 1));
            }

            System.out.println(" ******* JunggiBoardControl : junggi_view  END    ***** ");
        } catch (Exception err) {
            ProductBean pb = new ProductBean();
            request.setAttribute("product", pb);
            System.out.println(err.toString());
        }

        return new ModelAndView(goUrl);
    }

    public ModelAndView landPriceAllAplly(HttpServletRequest request,
            HttpServletResponse response) throws Exception {

        HttpSession session = request.getSession();
        String userId = (String) session.getAttribute("sessionUserId");

        List junggiList = null;

        try {
            if (userId != null) {

                // ������ �����͸� �����´�.
                UserBean userBean = new UserBean();
                userBean = commonCode.executeUserSearch(util.getSessionID(
                        request, "sessionUserId"));

                // ���⵵ ���
                Calendar cal = Calendar.getInstance();
                SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd");
                String thisDate = formatter.format(cal.getTime());
                String thisYear = thisDate.substring(0, 4);

                // ���ǿ��� �õ� �ڵ带 �����´�.
                String SIDO_CD = util.getSidoCode(getMessageSourceAccessor());
                String sigu_cd = userBean.getSIGU_CD();
                String strCurrentPage = ServletRequestUtils.getStringParameter(
                        request, "currentPage", Globals.DEFAULT_CURRENT_PAGE);
                String year = ServletRequestUtils.getStringParameter(request,
                        "year", thisYear);
                String type = ServletRequestUtils.getStringParameter(request,
                        "type", "");
                String tax_set = ServletRequestUtils.getStringParameter(
                        request, "tax_set", "");
                String tax_yn = ServletRequestUtils.getStringParameter(request,
                        "tax_yn", "");
                // String mul_fromdate =
                // ServletRequestUtils.getStringParameter(request,"mul_fromdate",thisYear+"-01-01");
                // String mul_todate =
                // ServletRequestUtils.getStringParameter(request,"mul_todate",thisYear+"-12-31");
                String purpose = ServletRequestUtils.getStringParameter(
                        request, "purpose_cd", "");
                String bj_cd = ServletRequestUtils.getStringParameter(request,
                        "bj_cd", "");
                String hj_cd = ServletRequestUtils.getStringParameter(request,
                        "hj_cd", "");
                String jumyongName = ServletRequestUtils.getStringParameter(
                        request, "jumyongName", "");
                String SECTION = ServletRequestUtils.getStringParameter(
                        request, "SECTION", "");

                request.setAttribute("sigu_cd", sigu_cd);
                request.setAttribute("year", year);
                request.setAttribute("type", type);
                request.setAttribute("tax_set", tax_set);
                request.setAttribute("tax_yn", tax_yn);

                // request.setAttribute("mul_fromdate", mul_fromdate);
                // request.setAttribute("mul_todate", mul_todate);
                request.setAttribute("purpose", purpose);
                request.setAttribute("bj_cd", bj_cd);
                request.setAttribute("hj_cd", hj_cd);

                request.setAttribute("jumyongName", jumyongName);
                request.setAttribute("SECTION", SECTION);
                request.setAttribute("currentPage", strCurrentPage);

                // ��¥ �˻� ������ '-' ����
				/*
                 * if(mul_fromdate != null && !"".equals(mul_fromdate) ) {
                 * mul_fromdate = util.Date_Cut(mul_fromdate); } if(mul_todate
                 * != null && !"".equals(mul_todate) ) { mul_todate =
                 * util.Date_Cut(mul_todate); }
                 */

                // ����Ʈ�� ����¡ html
                // int listCount =
                // objJunggiService.getlandPriceAllApllyCount(sigu_cd, year,
                // type, tax_set, tax_yn, mul_fromdate, mul_todate, purpose,
                // bj_cd, hj_cd, jumyongName, SECTION);
                int listCount = objJunggiService.getlandPriceAllApllyCount(
                        sigu_cd, year, type, tax_set, tax_yn, purpose, bj_cd,
                        hj_cd, jumyongName, SECTION);
                request.setAttribute("listCount", String.valueOf(listCount));
                System.out.println("listCount:" + listCount);
                // ����¡ ó��
                int rowCol = pageing.execute(request, listCount, Integer.parseInt(strCurrentPage), 10);

                // junggiList = objJunggiService.getlandPriceAllAplly(sigu_cd,
                // year, type, tax_set, tax_yn, mul_fromdate, mul_todate,
                // purpose, bj_cd, hj_cd, jumyongName, SECTION, rowCol, rowCol +
                // 9);
                junggiList = objJunggiService.getlandPriceAllAplly(sigu_cd,
                        year, type, tax_set, tax_yn, purpose, bj_cd, hj_cd,
                        jumyongName, SECTION, rowCol, rowCol + 9);
            }
        } catch (Exception err) {
            System.out.println("�������� �ϰ����� View error:" + err.toString());
        }
        return new ModelAndView("/jumyong/junggi/landPriceAllAplly", "blist",
                junggiList);
    }

    public ModelAndView priceApllyUpdate(HttpServletRequest request,
            HttpServletResponse response) throws Exception {

        SearchBean sb = new SearchBean();

        // ������ �����͸� �����´�.
        UserBean userBean = new UserBean();
        userBean = commonCode.executeUserSearch(util.getSessionID(request,
                "sessionUserId"));

        // ���⵵ ���
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd");
        String thisDate = formatter.format(cal.getTime());
        String thisYear = thisDate.substring(0, 4);

        // ���ǿ��� �õ� �ڵ带 �����´�.
        String SIDO_CD = util.getSidoCode(getMessageSourceAccessor());
        String sigu_cd = userBean.getSIGU_CD();
        String year = ServletRequestUtils.getStringParameter(request, "YEAR",
                thisYear);
        String type = ServletRequestUtils.getStringParameter(request, "TYPE",
                "");
        String tax_set = ServletRequestUtils.getStringParameter(request,
                "TAX_SET", "");
        String tax_yn = ServletRequestUtils.getStringParameter(request,
                "TAX_YN", "");
        String mul_fromdate = ServletRequestUtils.getStringParameter(request,
                "MUL_FROMDATE", thisYear + "-01-01");
        String mul_todate = ServletRequestUtils.getStringParameter(request,
                "MUL_TODATE", thisYear + "-12-31");
        String purpose = ServletRequestUtils.getStringParameter(request,
                "PURPOSE", "");
        String bj_cd = ServletRequestUtils.getStringParameter(request, "BJ_CD",
                "");
        String hj_cd = ServletRequestUtils.getStringParameter(request, "HJ_CD",
                "");
        String jumyongName = ServletRequestUtils.getStringParameter(request,
                "jumyongName", "");
        String SECTION = ServletRequestUtils.getStringParameter(request,
                "SECTION", "");

        // ��¥ �˻� ������ '-' ����
        if (mul_fromdate != null && !"".equals(mul_fromdate)) {
            mul_fromdate = util.Date_Cut(mul_fromdate);
        }
        if (mul_todate != null && !"".equals(mul_todate)) {
            mul_todate = util.Date_Cut(mul_todate);
        }

        sb.setGU_CODE(sigu_cd);
        sb.setYEAR(year);
        sb.setTYPE(type);
        sb.setTAX_SET(tax_set);
        sb.setTAX_YN(tax_yn);
        sb.setFROMDATE(mul_fromdate);
        sb.setTODATE(mul_todate);
        sb.setPURPOSE(purpose);
        sb.setBJ_CD(bj_cd);
        sb.setHJ_CD(hj_cd);
        sb.setJUMYONGNAME(jumyongName);
        sb.setSECTION(SECTION);

        if (objJunggiService.priceApllyUpdate(sb)) {
            request.setAttribute("result", "1");
        } else {
            request.setAttribute("result", "0");
        }

        return new ModelAndView("/jumyong/junggi/landPriceAllAplly");
    }

    public ModelAndView search(HttpServletRequest request,
            HttpServletResponse response) throws Exception {

        // ���� ����
        HttpSession session = request.getSession();

        String userId = (String) session.getAttribute("sessionUserId");
        List junggiList = null;

        try {
            if (userId != null) {

                System.out.println("************ ����� ����Ʈ start *************");
                // ������ �����͸� �����´�.
                UserBean userBean = new UserBean();
                userBean = commonCode.executeUserSearch(util.getSessionID(
                        request, "sessionUserId"));

                // ���⵵ ���
                Calendar cal = Calendar.getInstance();
                SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd");
                String thisDate = formatter.format(cal.getTime());
                String thisYear = thisDate.substring(0, 4);

                // ���ǿ��� �õ� �ڵ带 �����´�.
                String SIDO_CD = util.getSidoCode(getMessageSourceAccessor());
                String sigu_cd = userBean.getSIGU_CD();
                
                
                //2018-05-29
                System.out.println("sigu_cd: " + sigu_cd);
                if(sigu_cd.equals("000"))
                	sigu_cd = "%";
                
                
                String strCurrentPage = ServletRequestUtils.getStringParameter(
                        request, "currentPage", Globals.DEFAULT_CURRENT_PAGE);
                String year = ServletRequestUtils.getStringParameter(request,
                        "year", thisYear);
                String type = ServletRequestUtils.getStringParameter(request,
                        "type", "");
                String tax_set = ServletRequestUtils.getStringParameter(
                        request, "tax_set", "");
                String tax_yn = ServletRequestUtils.getStringParameter(request,
                        "tax_yn", "");
                String mul_fromdate = ServletRequestUtils.getStringParameter(
                        request, "mul_fromdate", thisYear + "-01-01");
                String mul_todate = ServletRequestUtils.getStringParameter(
                        request, "mul_todate", thisYear + "-12-31");
                String purpose = ServletRequestUtils.getStringParameter(
                        request, "purpose_cd", "");
                String bj_cd = ServletRequestUtils.getStringParameter(request,
                        "bj_cd", "");
                String hj_cd = ServletRequestUtils.getStringParameter(request,
                        "hj_cd", "");
                String jumyongName = ServletRequestUtils.getStringParameter(
                        request, "jumyongName", "");
                String cal_status = ServletRequestUtils.getStringParameter(
                        request, "cal_status", "");
                String SECTION = ServletRequestUtils.getStringParameter(
                        request, "SECTION", "");
                String search = ServletRequestUtils.getStringParameter(request,
                        "search", "0");
                String message = ServletRequestUtils.getStringParameter(
                        request, "message", "");

                // �������� ����⵵ or �ֽų⵵ ����. 2012-11-28. by ksic
                String gongsijiga = ServletRequestUtils.getStringParameter(request, "GONGSIJIGA", "1");

                // �Ϲ� �ڵ�.
                request.setAttribute("use_type", commonCode.executeCommonCode(
                        "use_type", type, "��ü"));
                request.setAttribute("taxation_section", commonCode.executeCommonCode("taxation_section", tax_set, "��ü"));
                request.setAttribute("taxation_yn", commonCode.executeCommonCode("taxation_yn", tax_yn, "��ü"));
                request.setAttribute("bjdong_code", commonCode.CommonBJDongCodeSearch(SIDO_CD, userBean.getSIGU_CD(),
                        bj_cd)); // ������
                request.setAttribute("hjdong_code", commonCode.CommonHJDongCodeSearch(SIDO_CD, userBean.getSIGU_CD(),
                        hj_cd)); // ������
                request.setAttribute("cal_status", commonCode.executeCommonCode("cal_status", cal_status, "��ü"));

                // ��¥ �˻� ������ '-' ����
                if (mul_fromdate != null && !"".equals(mul_fromdate)) {
                    mul_fromdate = util.Date_Cut(mul_fromdate);
                }
                if (mul_todate != null && !"".equals(mul_todate)) {
                    mul_todate = util.Date_Cut(mul_todate);
                }

                System.out.println("������� �ڵ�  �ڵ� �ڵ� : : : " + purpose);

                int listCount = objJunggiService.getJunggiSearchListCount(
                        sigu_cd, year, type, tax_set, tax_yn, mul_fromdate,
                        mul_todate, purpose, bj_cd, hj_cd, jumyongName,
                        cal_status, SECTION);

                // ����¡ ó��
                int rowCol = pageing.execute(request, listCount, Integer.parseInt(strCurrentPage), 10);

                junggiList = objJunggiService.junggiSearchList(sigu_cd, year,
                        type, tax_set, tax_yn, mul_fromdate, mul_todate,
                        purpose, bj_cd, hj_cd, jumyongName, cal_status,
                        SECTION, rowCol, rowCol + 9, "");

                // System.out.println("junggiList.size()== " +
                // junggiList.size());

                if (junggiList != null) {
                    for (int i = 0; i < junggiList.size(); i++) {
                        jumyongBean jumyong_bean = (jumyongBean) junggiList.get(i);

                        if (jumyong_bean.getSUM() != null) {
                            jumyong_bean.setSUM(insertComma2(jumyong_bean.getSUM()));
                        }
                        if (jumyong_bean.getLAST_FROMDATE() != null) {
                            jumyong_bean.setLAST_FROMDATE(util.Date_Paste(jumyong_bean.getLAST_FROMDATE()));
                        }
                        if (jumyong_bean.getLAST_TODATE() != null) {
                            jumyong_bean.setLAST_TODATE(util.Date_Paste(jumyong_bean.getLAST_TODATE()));
                        }
                        if (jumyong_bean.getFROMDATE() != null) {
                            jumyong_bean.setFROMDATE(util.Date_Paste(jumyong_bean.getFROMDATE()));
                        }
                        if (jumyong_bean.getTODATE() != null) {
                            jumyong_bean.setTODATE(util.Date_Paste(jumyong_bean.getTODATE()));
                        }
                        if (jumyong_bean.getPRICE() != null) {
                            jumyong_bean.setPRICE(insertComma2(jumyong_bean.getPRICE()));
                        }
                        if (jumyong_bean.getRATE() != null) {
                            jumyong_bean.setRATE(String.valueOf(Float.parseFloat(jumyong_bean.getRATE())));
                        }
                        if (jumyong_bean.getLAST_FROMDATE() == null || "".equals(jumyong_bean.getLAST_FROMDATE())) {
                            jumyong_bean.setLAST_FROMDATE("-");
                        }
                        if (jumyong_bean.getLAST_TODATE() == null || "".equals(jumyong_bean.getLAST_TODATE())) {
                            jumyong_bean.setLAST_TODATE("-");
                        }

                        if (jumyong_bean.getPURPOSE_CD() != null || !"".equals(jumyong_bean.getPURPOSE_CD())) {

                            String PURPOSE_CLASSNM_ARR = getPurposeNm(
                                    jumyong_bean.getTYPE(), jumyong_bean.getPURPOSE_CD());

                            String[] PURPOSE_CLASSNM = null;

                            if (PURPOSE_CLASSNM_ARR != null && !"".equals(PURPOSE_CLASSNM_ARR)) {
                                PURPOSE_CLASSNM = PURPOSE_CLASSNM_ARR.split("@");
                            }

                            if (!"null".equals(PURPOSE_CLASSNM[0]) && !"null".equals(PURPOSE_CLASSNM[1])) {
                                jumyong_bean.setCHECK_YN(PURPOSE_CLASSNM[1]);
                            } else {
                            }
                        }

                        String taxSet = jumyong_bean.getTAX_SET();
                        if (taxSet.equals("10")) {
                            jumyong_bean.setTAX_SET("�ü�");
                        } else if (taxSet.equals("50")) {
                            jumyong_bean.setTAX_SET("����");
                        }
                        String typ = jumyong_bean.getTYPE();
                        if (typ.equals("1")) {
                            jumyong_bean.setTYPE("����");
                        } else if (typ.equals("2")) {
                            jumyong_bean.setTYPE("��õ");
                        } else if (typ.equals("3")) {
                            jumyong_bean.setTYPE("����");
                        }

                        if (jumyong_bean.getBUBUN() != null) {
                            jumyong_bean.setBONBUN(jumyong_bean.getBONBUN() + "-" + jumyong_bean.getBUBUN());
                        } else {
                            jumyong_bean.setBONBUN(jumyong_bean.getBONBUN());
                        }

                        if (jumyong_bean.getSECTION() != null && !"".equals(jumyong_bean.getSECTION())) {
                            jumyong_bean.setSECTION(commonCode.executeCommonCodeNm("occupancy_type",
                                    jumyong_bean.getSECTION()));
                        }

                        if (jumyong_bean.getSUM_ADJUST() != null && !"".equals(jumyong_bean.getSUM_ADJUST())) {
                            jumyong_bean.setSUM_ADJUST("����");
                        } else {
                            jumyong_bean.setSUM_ADJUST("�̻���");
                        }

                        if (jumyong_bean.getTAX_YN() != null && !"".equals(jumyong_bean.getTAX_YN())) {
                            if ("1".equals(jumyong_bean.getTAX_YN())) {
                                jumyong_bean.setTAX_YN("�ΰ�");
                            } else {
                                jumyong_bean.setTAX_YN("�̺ΰ�");
                            }
                        }

                        if (jumyong_bean.getVAT() != null && !"".equals(jumyong_bean.getVAT())) {
                            jumyong_bean.setVAT(insertComma2(jumyong_bean.getVAT()));
                        }
                    }
                }

                request.setAttribute("tax_yn", tax_yn);
                request.setAttribute("listCount", String.valueOf(listCount));
                request.setAttribute("currentPage", strCurrentPage);
                request.setAttribute("year", year);
                request.setAttribute("mul_fromdate", util.Date_Paste(mul_fromdate));
                request.setAttribute("mul_todate", util.Date_Paste(mul_todate));
                request.setAttribute("TYPE", type);
                request.setAttribute("PURPOSE_CD", purpose);
                request.setAttribute("jumyongName", jumyongName);
                request.setAttribute("SECTION", SECTION);
                request.setAttribute("search", search);
                request.setAttribute("message", message);
                request.setAttribute("BJ_CD", bj_cd);
                request.setAttribute("HJ_CD", hj_cd);
                // �������� ����⵵ or �ֽų⵵ ����. 2012-11-28. by ksic
                request.setAttribute("GONGSIJIGA", gongsijiga);

                // ������� Ŭ�����ڵ� ����Ʈ�ڽ��� �������� �Ǿ� ������...search_flag���� 1��...
                if ("".equals(purpose) || purpose == null) {
                    request.setAttribute("search_flag", "1");
                }

            }

        } catch (Exception e) {
            System.out.println(e.toString());
        }

        return new ModelAndView("/jumyong/junggi/search", "blist", junggiList);
    }

    public ModelAndView View(HttpServletRequest request,
            HttpServletResponse response) throws Exception {
        String ADMIN_NO = ServletRequestUtils.getStringParameter(request,
                "ADMIN_NO", "");
        String year = ServletRequestUtils.getStringParameter(request, "year",
                "");
        String purpose_cd = ServletRequestUtils.getStringParameter(request,
                "purpose_cd", "");
        String type = ServletRequestUtils.getStringParameter(request, "type",
                "");
        String tax_set = ServletRequestUtils.getStringParameter(request,
                "tax_set", "");
        String tax_yn = ServletRequestUtils.getStringParameter(request,
                "tax_yn", "");
        String mul_fromdate = ServletRequestUtils.getStringParameter(request,
                "mul_fromdate", "");
        String mul_todate = ServletRequestUtils.getStringParameter(request,
                "mul_todate", "");
        String bj_cd = ServletRequestUtils.getStringParameter(request, "bj_cd",
                "");
        String hj_cd = ServletRequestUtils.getStringParameter(request, "hj_cd",
                "");
        String jumyongName = ServletRequestUtils.getStringParameter(request,
                "jumyongName", "");
        String cal_status = ServletRequestUtils.getStringParameter(request,
                "cal_status", "");
        String SECTION = ServletRequestUtils.getStringParameter(request,
                "SECTION", "");
        String search = ServletRequestUtils.getStringParameter(request,
                "search", "");
        String purpose_search = ServletRequestUtils.getStringParameter(request,
                "purpose_search", "");

        HttpSession session = request.getSession();
        String userId = (String) session.getAttribute("sessionUserId");

        try {
            if (userId != null) {

                request.setAttribute("view_admin_no", ADMIN_NO.substring(9));
                request.setAttribute("year", year);
                request.setAttribute("purpose_cd", purpose_cd);
                request.setAttribute("type", type);
                request.setAttribute("tax_set", tax_set);
                request.setAttribute("tax_yn", tax_yn);
                request.setAttribute("mul_fromdate", mul_fromdate);
                request.setAttribute("mul_todate", mul_todate);
                request.setAttribute("bj_cd", bj_cd);
                request.setAttribute("hj_cd", hj_cd);
                request.setAttribute("jumyongName", jumyongName);
                request.setAttribute("cal_status", cal_status);
                request.setAttribute("SECTION", SECTION);
                request.setAttribute("search", search);
                request.setAttribute("purpose_search", purpose_search);

            }
        } catch (Exception e) {
            System.out.println("error:" + e.toString());
        }
        return new ModelAndView("/jumyong/junggi/view", "ADMIN_NO", ADMIN_NO);
    }

    // �ΰ����� �󼼺���
    public ModelAndView Bugwa_View(HttpServletRequest request,
            HttpServletResponse response) throws Exception {
        HttpSession session = request.getSession();
        String userId = (String) session.getAttribute("sessionUserId");
        TaxationBean Bean = new TaxationBean();

        try {
            if (userId != null) {

                String ADMIN_NO = ServletRequestUtils.getStringParameter(
                        request, "ADMIN_NO", "");
                String SEQ = ServletRequestUtils.getStringParameter(request,
                        "SEQ", "");
                // String TAX_SET =
                // ServletRequestUtils.getStringParameter(request, "TAX_SET",
                // "");

                List list = iSaeweService.executeBugwa_View(ADMIN_NO, SEQ);

                if (SEQ == null || SEQ.trim().equals("")) // ���������� �ϳ��� ������� ��ȭ��
                // ���
                {
                    return new ModelAndView(
                            "/jumyong/saewe/tab/bugwa_view_sample");
                }

                if (list.size() <= 0) {
                    return Bugwa_Register(request, response);// Bean = null;
                } else {
                    Bean = (TaxationBean) list.get(0);

                    List data = iSaeweService.executeBugwa_DataInfo(ADMIN_NO,
                            SEQ);
                    SaeweBean saeweBean = new SaeweBean();
                    saeweBean = (SaeweBean) data.get(0);

                    request.setAttribute("TAX_SET", commonCode.executeSearchCommonCode("taxation_part", Bean.getTAX_SET()));
                    request.setAttribute("TAX_CD", commonCode.executeSearchTaxCode(saeweBean.getTAX_SET(), Bean.getTAX_CD()));
                    request.setAttribute("LIVE", commonCode.executeSearchCommonCode("taxpayer_residence", Bean.getLIVE()));
                    request.setAttribute("OBJ_SET", commonCode.executeSearchCommonCode("object_type", Bean.getOBJ_SET()));
                    request.setAttribute("TAXPAYER_SET", commonCode.executeSearchCommonCode("taxpayer_group", Bean.getTAXPAYER_SET()));
                    request.setAttribute("TAX_YN", Bean.getTAX_YN());

                    Bean.setBONSE(util.Comma_Paste(Bean.getBONSE())); // ����
                    Bean.setVAT(util.Comma_Paste(Bean.getVAT())); // �ΰ���ġ��
                    Bean.setINTAX(util.Comma_Paste(Bean.getINTAX())); // ���⳻�ݾ�
                    Bean.setOVERTAX(util.Comma_Paste(Bean.getOVERTAX())); // �����ıݾ�
                    // Bean.setLIMIT_SUM(util.Comma_Paste(Bean.getLIMIT_SUM()));
                    // // ���� ������
                    // Bean.setRATE(util.Comma_Paste(Bean.getRATE())); // Ư������
                    Bean.setGIGUM(util.Comma_Paste(Bean.getGIGUM())); // ���
                    Bean.setGUKSE(util.Comma_Paste(Bean.getGUKSE())); // ����
                    Bean.setGUSE(util.Comma_Paste(Bean.getGUSE())); // ����

                    if (Bean.getTAX_YM() != null) {
                        String ym = Bean.getTAX_YM();
                        if (Bean.getTAX_YM().length() == 6) {
                            request.setAttribute("tax_year", ym.substring(0, 4));
                            request.setAttribute("tax_month", ym.substring(4, 6));
                        }
                    }
                }

                request.setAttribute("ADMIN_NO", ADMIN_NO);
                request.setAttribute("SEQ", SEQ);

            }
        } catch (Exception e) {
            System.out.println("error:" + e.toString());
        }
        return new ModelAndView("/jumyong/saewe/tab/bugwa_view", "board", Bean);
    }

    // �ΰ����� �Է��ϱ�
    public ModelAndView Bugwa_Register(HttpServletRequest request,
            HttpServletResponse response) throws Exception {
        HttpSession session = request.getSession();
        String userId = (String) session.getAttribute("sessionUserId");

        try {
            if (userId != null) {

                // System.out.println("!! Bugwa_Register");

                String ADMIN_NO = ServletRequestUtils.getStringParameter(
                        request, "ADMIN_NO", "");
                String SEQ = ServletRequestUtils.getStringParameter(request,
                        "SEQ", "");

                if (SEQ == null || SEQ.trim().equals("")) // ERROR
                {
                    return new ModelAndView("/jumyong/saewe/tab/bugwa_register");
                }

                // System.out.println("!! ADMIN_NO :" + ADMIN_NO);
                // System.out.println("!! SEQ :" + SEQ);

                List list = iSaeweService.executeBugwa_DataInfo(ADMIN_NO, SEQ);

                SaeweBean Bean = new SaeweBean();

                if (list.size() <= 0) {
                    Bean = null;
                } else {
                    Bean = (SaeweBean) list.get(0);

                    // System.out.println("!! Bean.getTAX_SET() :" +
                    // Bean.getTAX_SET());

                    request.setAttribute("taxation_part", commonCode.executeCommonCode("taxation_part", null, "�����ϼ���")); // ��������
                    request.setAttribute("taxcode", commonCode.executeTaxCode(
                            Bean.getTAX_SET(), null, "�����ϼ���")); // �����ڵ�
                    request.setAttribute("taxpayer_residence", commonCode.executeCommonCode("taxpayer_residence", null,
                            "�����ϼ���")); // ���ֻ���
                    request.setAttribute("object_type", commonCode.executeCommonCode("object_type", null, "�����ϼ���")); // ���Ǳ���
                    request.setAttribute("taxpayer_group", commonCode.executeCommonCode("taxpayer_group", null,
                            "�����ϼ���")); // ������ ����

                    // System.out.println("!! getADMIN_NO : " +
                    // Bean.getADMIN_NO());

                    request.setAttribute("SUM_YEAR", util.Comma_Paste(Bean.getSUM_YEAR()));
                    request.setAttribute("VAT", util.Comma_Paste(Bean.getVAT()));

                    // System.out.println("!! getADMIN_NO : " +
                    // Bean.getSUM_YEAR());
                }

                request.setAttribute("ADMIN_NO", ADMIN_NO);
                request.setAttribute("SEQ", SEQ);

            }
        } catch (Exception e) {
            System.out.println("error:" + e.toString());
        }
        return new ModelAndView("/jumyong/saewe/tab/bugwa_register");
    }

    public String insertComma2(String value1) {
        int length1 = value1.length();
        int divideNum = length1 % 3;

        String returnValue2 = "";
        if (divideNum != 0) {
            returnValue2 = value1.substring(0, divideNum) + ",";
        }
        if (length1 > 3) {
            while (true) {
                returnValue2 = returnValue2 + value1.substring(divideNum, divideNum + 3) + ",";
                divideNum = divideNum + 3;
                if (length1 < divideNum + 3) {
                    break;
                }
            }
        }

        if (returnValue2 == "") {
            returnValue2 = value1;
        } else {
            returnValue2 = returnValue2.substring(0, returnValue2.length() - 1);
        }

        return returnValue2;
    }

    public String addDash(String val1) {
        if (val1.length() > 8) {
            return val1.substring(0, 4) + "-" + val1.substring(4, 6) + "-" + val1.substring(6, 8);
        } else {
            return val1;
        }
    }

    // ����� ���� ���� ����Ʈ
    public ModelAndView productaddList(HttpServletRequest request,
            HttpServletResponse response) throws Exception {
        HttpSession session = request.getSession();
        String userId = (String) session.getAttribute("sessionUserId");

        try {
            if (userId != null) {

                String ADMIN_NO = ServletRequestUtils.getStringParameter(
                        request, "ADMIN_NO", "");
                String year = ServletRequestUtils.getStringParameter(request,
                        "year", "");

                request.setAttribute("ADMIN_NO", ADMIN_NO);
                request.setAttribute("year", year);

                List list1 = objJunggiService.Productjunggi_addList(ADMIN_NO,
                        year);
                request.setAttribute("productList", list1);

            }
        } catch (Exception e) {
            System.out.println("error:" + e.toString());
        }
        return new ModelAndView("/jumyong/junggi/info_productaddlist");
    }

    // ���Һ� ���� ���� ����Ʈ
    public ModelAndView productSubList(HttpServletRequest request,
            HttpServletResponse response) throws Exception {
        HttpSession session = request.getSession();
        String userId = (String) session.getAttribute("sessionUserId");

        try {
            if (userId != null) {

                String ADMIN_NO = ServletRequestUtils.getStringParameter(
                        request, "ADMIN_NO", "");
                String year = ServletRequestUtils.getStringParameter(request,
                        "year", "");
                String area = ServletRequestUtils.getStringParameter(request,
                        "area", "");

                request.setAttribute("ADMIN_NO", ADMIN_NO);
                request.setAttribute("year", year);
                request.setAttribute("area", area);

                // List list1
                // =objJunggiService.Productjunggi_addList(ADMIN_NO,year);
                List list1 = objJumyongService.productSubList(ADMIN_NO, year);

                request.setAttribute("productList", list1);

            }
        } catch (Exception e) {
            System.out.println("error:" + e.toString());
        }
        return new ModelAndView("/jumyong/jumyong/info_productsublist");
    }

    // //////////////////////////////////////////////////////////////////////////////////////////////////////
    // ���� product_temp_insert
    public ModelAndView product_temp_insert(HttpServletRequest request,
            HttpServletResponse response) throws Exception {
        HttpSession session = request.getSession();
        String userId = (String) session.getAttribute("sessionUserId");
        String admin_no = ServletRequestUtils.getStringParameter(request,
                "admin_no", "");
        String year = ServletRequestUtils.getStringParameter(request, "year",
                "");

        try {
            if (userId != null) {

                // EQUIP ����� ���� ���
                // �Է�//YEAR,FROMDATE,TODATE,UP_DATE,CAL_SUM_SEQ,GU_CODE,CORP_CD

                Calendar cal = Calendar.getInstance();
                SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd"); // ������
                // ���
                // ����
                // ����
                String toDay = sdf.format(cal.getTime()); // ���� ��¥ ������ ����

                // if(objJunggiService.getcal_sum_exist(gu_code,corp_cd,year)>
                // 0) //�̹� �ش翬�� ����� ���� �� ������ return
                // return new
                // ModelAndView("redirect:/facility/junggi/product_view.do?GU_CODE="+gu_code+"&CORP_CD="+corp_cd);

                // System.out.println("objJunggiService.cal_sum_exist(admin_no,year)===== "
                // + objJunggiService.cal_sum_exist(admin_no,year));
                if (objJunggiService.cal_sum_exist(admin_no, year,year + "0101",year + "1231") > 0) { // �̹�
                    // �ش翬��
                    // �����
                    // ����
                    // ��
                    // ������
                    // return
                    // return new
                    // ModelAndView("redirect:http://127.0.0.1:8088/jumyong/junggi/view.do?ADMIN_NO="+admin_no+"&year="+year);
                    return new ModelAndView(
                            "redirect:/jumyong/junggi/junggi_view.do?ADMIN_NO=" + admin_no + "&year=" + year + "&message=�̹� �ش�⵵ ������� �ֽ��ϴ�.");
                }

                ProductBean pb = new ProductBean();

                // pb.getYEAR(),pb.getFROMDATE(),pb.getTODATE(),pb.getUP_DATE(),
                // pb.getCAL_SUM_SEQ(),pb.getADMIN_NO()

                pb.setYEAR(year);
                pb.setFROMDATE(year + "0101");
                pb.setTODATE(year + "1231");
                pb.setUP_DATE(toDay);
                pb.setADMIN_NO(admin_no);
                pb.setUSE_SECTION("1");

                int cal_sum_seq = objJunggiService.GetCal_sum_seq(admin_no,
                        year);

                if (cal_sum_seq == 0) {
                    cal_sum_seq = objJumyongService.getCal_Sum_Seq();
                    pb.setSEQ(String.valueOf(cal_sum_seq));
                    objJumyongService.Cal_Sum_InfoInsert(pb);
                }

                pb.setCAL_SUM_SEQ(String.valueOf(cal_sum_seq));
                objJunggiService.CalculationTempInsert(pb);

            }
        } catch (Exception e) {
            System.out.println("error:" + e.toString());
        }
        return new ModelAndView(
                "redirect:http:/jumyong/junggi/view.do?ADMIN_NO=" + admin_no + "&year=" + year);
    }

    // ������ȯ
    public ModelAndView excel_search(HttpServletRequest request,
            HttpServletResponse response) throws Exception {

        // System.out.println("*********** excel_search ***********");

        // ���� ����
        HttpSession session = request.getSession();

        String userId = (String) session.getAttribute("sessionUserId");
        List junggiList = null;

        try {
            if (userId != null) {
                // ������ �����͸� �����´�.
                UserBean userBean = new UserBean();
                userBean = commonCode.executeUserSearch(util.getSessionID(
                        request, "sessionUserId"));

                // ���⵵ ���
                Calendar cal = Calendar.getInstance();
                SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd");
                String thisDate = formatter.format(cal.getTime());
                String thisYear = thisDate.substring(0, 4);

                // ���ǿ��� �õ� �ڵ带 �����´�.
                String SIDO_CD = util.getSidoCode(getMessageSourceAccessor());
                String sigu_cd = userBean.getSIGU_CD();
                // String sigu_cd = "500"; // �׽�Ʈ�� ���߿� ����!!
                String strCurrentPage = ServletRequestUtils.getStringParameter(
                        request, "currentPage", Globals.DEFAULT_CURRENT_PAGE);
                String year = ServletRequestUtils.getStringParameter(request,
                        "year", thisYear);
                String type = ServletRequestUtils.getStringParameter(request,
                        "type", "1");
                String tax_set = ServletRequestUtils.getStringParameter(
                        request, "tax_set", "");
                String tax_yn = ServletRequestUtils.getStringParameter(request,
                        "tax_yn", "");
                String mul_fromdate = ServletRequestUtils.getStringParameter(
                        request, "mul_fromdate", thisYear + "-01-01");
                String mul_todate = ServletRequestUtils.getStringParameter(
                        request, "mul_todate", thisYear + "-12-31");
                String purpose = ServletRequestUtils.getStringParameter(
                        request, "purpose_cd", "000");
                String bj_cd = ServletRequestUtils.getStringParameter(request,
                        "bj_cd", "");
                String hj_cd = ServletRequestUtils.getStringParameter(request,
                        "hj_cd", "");
                String jumyongName = ServletRequestUtils.getStringParameter(
                        request, "jumyongName", "");
                String cal_status = ServletRequestUtils.getStringParameter(
                        request, "cal_status", "");
                String SECTION = ServletRequestUtils.getStringParameter(
                        request, "SECTION", "");
                String message = ServletRequestUtils.getStringParameter(
                        request, "message", "");

                // �Ϲ� �ڵ�.
                request.setAttribute("use_type", commonCode.executeCommonCode(
                        "use_type", type, "�����ϼ���"));
                request.setAttribute("taxation_section",
                        commonCode.executeCommonCode("taxation_section",
                        tax_set, "�����ϼ���"));
                request.setAttribute("taxation_yn", commonCode.executeCommonCode("taxation_yn", tax_yn, "�����ϼ���"));
                request.setAttribute("bjdong_code", commonCode.CommonBJDongCodeSearch(SIDO_CD, userBean.getSIGU_CD(),
                        bj_cd)); // ������
                request.setAttribute("hjdong_code", commonCode.CommonHJDongCodeSearch(SIDO_CD, userBean.getSIGU_CD(),
                        hj_cd)); // ������
                // request.setAttribute("bjdong_code",
                // commonCode.executeBJDongCode(SIDO_CD, userBean.getSIGU_CD(),
                // bj_cd));
                // request.setAttribute("hjdong_code",
                // commonCode.executeHJDongCode(SIDO_CD, userBean.getSIGU_CD(),
                // hj_cd));
                request.setAttribute("cal_status", commonCode.executeCommonCode("cal_status", cal_status, "�����ϼ���"));

                // ��¥ �˻� ������ '-' ����
                if (mul_fromdate != null && !"".equals(mul_fromdate)) {
                    mul_fromdate = util.Date_Cut(mul_fromdate);
                }
                if (mul_todate != null && !"".equals(mul_todate)) {
                    mul_todate = util.Date_Cut(mul_todate);
                }

                // System.out.println("excel  purpose=== "+ purpose);
                // ����Ʈ�� ����¡ html
                int listCount = objJunggiService.getJunggiSearchListCount(
                        sigu_cd, year, type, tax_set, tax_yn, mul_fromdate,
                        mul_todate, purpose, bj_cd, hj_cd, jumyongName,
                        cal_status, SECTION);
                // System.out.println("listCount == "+listCount);

                // ����¡ ó��
                int rowCol = pageing.execute(request, listCount, Integer.parseInt(strCurrentPage), 10);

                junggiList = objJunggiService.junggiSearchList(sigu_cd, year,
                        type, tax_set, tax_yn, mul_fromdate, mul_todate,
                        purpose, bj_cd, hj_cd, jumyongName, cal_status,
                        SECTION, 1, listCount, "");

                // System.out.println("junggiList.size()== " +
                // junggiList.size());
                if (junggiList != null) {
                    for (int i = 0; i < junggiList.size(); i++) {
                        jumyongBean jumyong_bean = (jumyongBean) junggiList.get(i);

                        if (jumyong_bean.getSUM() != null) {
                            jumyong_bean.setSUM(insertComma2(jumyong_bean.getSUM()));
                        }
                        if (jumyong_bean.getLAST_FROMDATE() != null) {
                            jumyong_bean.setLAST_FROMDATE(util.Date_Paste(jumyong_bean.getLAST_FROMDATE()));
                        }
                        if (jumyong_bean.getLAST_TODATE() != null) {
                            jumyong_bean.setLAST_TODATE(util.Date_Paste(jumyong_bean.getLAST_TODATE()));
                        }
                        if (jumyong_bean.getFROMDATE() != null) {
                            jumyong_bean.setFROMDATE(util.Date_Paste(jumyong_bean.getFROMDATE()));
                        }
                        if (jumyong_bean.getTODATE() != null) {
                            jumyong_bean.setTODATE(util.Date_Paste(jumyong_bean.getTODATE()));
                        }
                        if (jumyong_bean.getPRICE() != null) {
                            jumyong_bean.setPRICE(insertComma2(jumyong_bean.getPRICE()));
                        }
                        if (jumyong_bean.getRATE() != null) {
                            jumyong_bean.setRATE(String.valueOf(Float.parseFloat(jumyong_bean.getRATE())));
                        }
                        if (jumyong_bean.getLAST_FROMDATE() == null || "".equals(jumyong_bean.getLAST_FROMDATE())) {
                            jumyong_bean.setLAST_FROMDATE("-");
                        }
                        if (jumyong_bean.getLAST_TODATE() == null || "".equals(jumyong_bean.getLAST_TODATE())) {
                            jumyong_bean.setLAST_TODATE("-");
                        }

                        if (jumyong_bean.getPURPOSE_CD() != null || !"".equals(jumyong_bean.getPURPOSE_CD())) {

                            String PURPOSE_CLASSNM_ARR = getPurposeNm(
                                    jumyong_bean.getTYPE(), jumyong_bean.getPURPOSE_CD());

                            String[] PURPOSE_CLASSNM = null;

                            if (PURPOSE_CLASSNM_ARR != null && !"".equals(PURPOSE_CLASSNM_ARR)) {
                                PURPOSE_CLASSNM = PURPOSE_CLASSNM_ARR.split("@");
                            }

                            if (!"null".equals(PURPOSE_CLASSNM[0]) && !"null".equals(PURPOSE_CLASSNM[1])) {

                                jumyong_bean.setCHECK_YN(PURPOSE_CLASSNM[1]);
                            } else {
                            }
                        }

                        if (jumyong_bean.getBUBUN() != null) {
                            jumyong_bean.setBONBUN(jumyong_bean.getBONBUN() + "-" + jumyong_bean.getBUBUN());
                        } else {
                            jumyong_bean.setBONBUN(jumyong_bean.getBONBUN());
                        }

                        if (jumyong_bean.getSECTION() != null && !"".equals(jumyong_bean.getSECTION())) {
                            jumyong_bean.setSECTION(commonCode.executeCommonCodeNm("occupancy_type",
                                    jumyong_bean.getSECTION()));
                        }

                        String taxSet = jumyong_bean.getTAX_SET();
                        if (taxSet.equals("10")) {
                            jumyong_bean.setTAX_SET("�ü�");
                        } else if (taxSet.equals("50")) {
                            jumyong_bean.setTAX_SET("����");
                        }
                        String typ = jumyong_bean.getTYPE();
                        if (typ.equals("1")) {
                            jumyong_bean.setTYPE("����");
                        } else if (typ.equals("2")) {
                            jumyong_bean.setTYPE("��õ");
                        } else if (typ.equals("3")) {
                            jumyong_bean.setTYPE("����");
                        }

                        if (jumyong_bean.getSUM_ADJUST() != null && !"".equals(jumyong_bean.getSUM_ADJUST())) {
                            jumyong_bean.setSUM_ADJUST("����");
                        } else {
                            jumyong_bean.setSUM_ADJUST("�̻���");
                        }

                        if (jumyong_bean.getTAX_YN() != null && !"".equals(jumyong_bean.getTAX_YN())) {
                            if ("1".equals(jumyong_bean.getTAX_YN())) {
                                jumyong_bean.setTAX_YN("�ΰ�");
                            } else {
                                jumyong_bean.setTAX_YN("�̺ΰ�");
                            }
                        }

                        if (jumyong_bean.getVAT() != null && !"".equals(jumyong_bean.getVAT())) {
                            jumyong_bean.setVAT(insertComma2(jumyong_bean.getVAT()));
                        }
                    }
                }

                request.setAttribute("listCount", String.valueOf(listCount));
                request.setAttribute("currentPage", strCurrentPage);
                request.setAttribute("year", year);
                request.setAttribute("mul_fromdate", util.Date_Paste(mul_fromdate));
                request.setAttribute("mul_todate", util.Date_Paste(mul_todate));
                request.setAttribute("TYPE", type);
                request.setAttribute("PURPOSE_CD", purpose);
                request.setAttribute("jumyongName", jumyongName);
                request.setAttribute("SECTION", SECTION);
                request.setAttribute("message", message);

            }

        } catch (Exception e) {
            System.out.println(e.toString());
        }

        return new ModelAndView("/jumyong/junggi/excel_search", "blist",
                junggiList);
    }

    // ��������ڵ�, Ÿ������ Ŭ������ ��������
    public String getPurposeNm(String type, String cd) {
        String nm = objJunggiService.getPurposeNm(type, cd);

        return nm;
    }

    // �ϰ�����
    public ModelAndView junggiAllCal(HttpServletRequest request, HttpServletResponse response) throws Exception {

        // ���� ����
        HttpSession session = request.getSession();

        String userId = (String) session.getAttribute("sessionUserId");
        List junggiList = null;

        try {
            if (userId != null) {
                // ������ �����͸� �����´�.
                UserBean userBean = new UserBean();
                userBean = commonCode.executeUserSearch(util.getSessionID(request, "sessionUserId"));

                // ���⵵ ���
                Calendar cal = Calendar.getInstance();
                SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd");
                String thisDate = formatter.format(cal.getTime());
                String thisYear = thisDate.substring(0, 4);

                // ���ǿ��� �õ� �ڵ带 �����´�.
                String SIDO_CD = util.getSidoCode(getMessageSourceAccessor());
                String sigu_cd = userBean.getSIGU_CD();
                String strCurrentPage = ServletRequestUtils.getStringParameter(request, "currentPage", Globals.DEFAULT_CURRENT_PAGE);
                String year = ServletRequestUtils.getStringParameter(request,"YEAR", thisYear);
                String type = ServletRequestUtils.getStringParameter(request,"TYPE", "");
                String tax_set = ServletRequestUtils.getStringParameter(request, "TAX_SET", "");
                String tax_yn = ServletRequestUtils.getStringParameter(request,"TAX_YN", "");
                String mul_fromdate = ServletRequestUtils.getStringParameter(request, "mul_fromdate", thisYear + "-01-01");
                String mul_todate = ServletRequestUtils.getStringParameter(request, "mul_todate", thisYear + "-12-31");
                String purpose = ServletRequestUtils.getStringParameter(request, "PURPOSE_CD", "");
                String bj_cd = ServletRequestUtils.getStringParameter(request,"BJ_CD", "");
                String hj_cd = ServletRequestUtils.getStringParameter(request,"HJ_CD", "");
                String jumyongName = ServletRequestUtils.getStringParameter(request, "jumyongName", "");
                String cal_status = ServletRequestUtils.getStringParameter(request, "cal_status", "");
                String SECTION = ServletRequestUtils.getStringParameter(request, "SECTION", "");
                String search = ServletRequestUtils.getStringParameter(request, "search", "0");
                String message = ServletRequestUtils.getStringParameter(request, "message", "");
                // �������� ����⵵ or �ֽų⵵ ����. 2012-11-28. by ksic
                String gongsijiga = ServletRequestUtils.getStringParameter(request, "GONGSIJIGA", "1");


                // �Ϲ� �ڵ�.
                request.setAttribute("use_type", commonCode.executeCommonCode("use_type", type, "��ü"));
                request.setAttribute("taxation_section", commonCode.executeCommonCode("taxation_section", tax_set, "��ü"));
                request.setAttribute("taxation_yn", commonCode.executeCommonCode("taxation_yn", tax_yn, "��ü"));
                request.setAttribute("bjdong_code", commonCode.CommonBJDongCodeSearch(SIDO_CD, userBean.getSIGU_CD(), bj_cd)); // ������
                request.setAttribute("hjdong_code", commonCode.CommonHJDongCodeSearch(SIDO_CD, userBean.getSIGU_CD(), hj_cd)); // ������
                request.setAttribute("cal_status", commonCode.executeCommonCode("cal_status", cal_status, "��ü"));

                // ��¥ �˻� ������ '-' ����
                if (mul_fromdate != null && !"".equals(mul_fromdate)) {
                    mul_fromdate = util.Date_Cut(mul_fromdate);
                }
                if (mul_todate != null && !"".equals(mul_todate)) {
                    mul_todate = util.Date_Cut(mul_todate);
                }
                // ����Ʈ�� ����¡ html
                int listCount = objJunggiService.getJunggiSearchListCount(
                        sigu_cd, year, type, tax_set, tax_yn, mul_fromdate,
                        mul_todate, purpose, bj_cd, hj_cd, jumyongName,
                        cal_status, SECTION);
                junggiList = objJunggiService.junggiSearchList(sigu_cd, year,
                        type, tax_set, tax_yn, mul_fromdate, mul_todate,
                        purpose, bj_cd, hj_cd, jumyongName, cal_status,
                        SECTION, 1, listCount, "AllCal");

                // ����� ��������� ��� �����⵵�� ����
                String yearVal1 = String.valueOf(Integer.parseInt(year) + 1);

                listCount = 0;
                if (junggiList != null) {
                	System.out.println("����� �ϰ����� ����Ÿ �������� ����!!");
                    for (int i = 0; i < junggiList.size(); i++) {
                        jumyongBean jumyong_bean = (jumyongBean) junggiList.get(i);

                        /**********************************************************/
                        
                        // ������ ���⳻���� �ִ� ��� ������ȣ�� ���� ū ���� ������ ������
                        if (jumyong_bean.getMAX_TAX_NO() != null && !"".equals(jumyong_bean.getMAX_TAX_NO()) && jumyong_bean.getTAX_NO() != null && !"".equals(jumyong_bean.getTAX_NO())) {
                            if (jumyong_bean.getMAX_TAX_NO().equals(jumyong_bean.getTAX_NO())) {
                                listCount++;
                            }
                        } else if (jumyong_bean.getTAX_NO() == null || "".equals(jumyong_bean.getTAX_NO())) {
                            listCount++;
                        }

                        jumyong_bean.setSEQ(String.valueOf(i));

                        if (jumyong_bean.getSUM() != null) {
                            jumyong_bean.setSUM(insertComma2(jumyong_bean.getSUM()));
                        }
                        if (jumyong_bean.getRATE() != null) {
                            jumyong_bean.setRATE(String.valueOf(Float.parseFloat(jumyong_bean.getRATE())));
                        }
                        
                        if (jumyong_bean.getOLD_RATE() != null) {
                            jumyong_bean.setOLD_RATE(String.valueOf(Float.parseFloat(jumyong_bean.getOLD_RATE())));
                        }

                        if (jumyong_bean.getPURPOSE_CD() != null || !"".equals(jumyong_bean.getPURPOSE_CD())) {

                            String PURPOSE_CLASSNM_ARR = getPurposeNm(
                                    jumyong_bean.getTYPE(), jumyong_bean.getPURPOSE_CD());

                            String[] PURPOSE_CLASSNM = null;

                            if (PURPOSE_CLASSNM_ARR != null && !"".equals(PURPOSE_CLASSNM_ARR)) {
                                PURPOSE_CLASSNM = PURPOSE_CLASSNM_ARR.split("@");
                            }

                            if (!"null".equals(PURPOSE_CLASSNM[0]) && !"null".equals(PURPOSE_CLASSNM[1])) {
                                jumyong_bean.setCHECK_YN(PURPOSE_CLASSNM[1]);
                            }
                        }

                        String taxSet = jumyong_bean.getTAX_SET();
                        if (taxSet.equals("10")) {
                            jumyong_bean.setTAX_SET("�ü�");
                        } else if (taxSet.equals("50")) {
                            jumyong_bean.setTAX_SET("����");
                        }
                        String typ = jumyong_bean.getTYPE();
                        if (typ.equals("1")) {
                            jumyong_bean.setTYPE("����");
                        } else if (typ.equals("2")) {
                            jumyong_bean.setTYPE("��õ");
                        } else if (typ.equals("3")) {
                            jumyong_bean.setTYPE("����");
                        }

                        if (jumyong_bean.getBUBUN() != null) {
                            jumyong_bean.setBONBUN(jumyong_bean.getBONBUN() + "-" + jumyong_bean.getBUBUN());
                        } else {
                            jumyong_bean.setBONBUN(jumyong_bean.getBONBUN());
                        }

                        if (jumyong_bean.getSECTION() != null && !"".equals(jumyong_bean.getSECTION())) {
                            jumyong_bean.setSECTION(commonCode.executeCommonCodeNm("occupancy_type",
                                    jumyong_bean.getSECTION()));
                        }

                        if (jumyong_bean.getTAX_YN() != null && !"".equals(jumyong_bean.getTAX_YN())) {
                            if ("1".equals(jumyong_bean.getTAX_YN())) {
                                jumyong_bean.setTAX_YN("�ΰ�");
                            } else {
                                jumyong_bean.setTAX_YN("�̺ΰ�");
                            }
                        }

                        // ���⵵ ����� ���
                            double sum_lastYear = 0;
                            
                            float old_area_after = jumyong_bean.getOLD_AREA_SIZE();
                            float old_price = new Float(util.nullTo(jumyong_bean.getOLD_PRICE(), "1")).floatValue();
                            float old_rate = new Float(util.nullTo(jumyong_bean.getOLD_RATE(), "1")).floatValue();
                            float surcharge_rate = jumyong_bean.getSURCHARGE_RATE();
                            
                            if (surcharge_rate < 1) {
                                surcharge_rate = (float)1.2;
                            }

                            if ("3".equals(jumyong_bean.getSECTION().trim())) {
                                sum_lastYear = old_area_after * old_price * old_rate * surcharge_rate;
                            } else {
                                sum_lastYear = old_area_after * old_price * old_rate;
                            }
                                                       
                            if (jumyong_bean.getTYPE().equals("����")) {
                                //100�� ����
                                sum_lastYear = (Math.floor(sum_lastYear / 100)) * 100;
                            } else {
                                //10�� ����
                                sum_lastYear = (Math.floor(sum_lastYear / 10)) * 10;
                            }
                            
                            if(jumyong_bean.getSUM_LASTYEAR() == null || Integer.parseInt(jumyong_bean.getSUM_LASTYEAR()) == 0){
                            	jumyong_bean.setSUM_ADJUST(String.valueOf((long) sum_lastYear));

                            }else{
                            	
                            }

                        
                        // �������� ����⵵ or �ֽų⵵ ����. 2012-11-28. by ksic
                        System.out.println("# GONGSIJIGA : "+gongsijiga);
                        List priceList = null;
                        if (gongsijiga.equals("1")) {
                        	//System.out.println("# GONGSIJIGA YEAR1 : "+year);
                        	priceList = objJumyongService.getPriceList(jumyong_bean.getADMIN_NO(),year);
                        } else {
                        	//System.out.println("# GONGSIJIGA YEAR2 : "+thisYear);
                        	priceList = objJumyongService.getPriceList(jumyong_bean.getADMIN_NO(),thisYear);
                        }
                        // �������� ��������
                        //List priceList = objJumyongService.getPriceList(jumyong_bean.getADMIN_NO(),year);
                        long price = 0;
                        int priceCount = 0;
                        for(int c = 0 ; c < priceList.size() ; c++){
                        	priceCount ++;
                        	placeWithAddrBean priceBean = (placeWithAddrBean)priceList.get(c);
                        	if(priceBean.getJIGA() != null && !priceBean.getJIGA().equals("")){
                        		price += Long.parseLong(priceBean.getJIGA());
                        	}
                        }
                        
                        price = (long) Math.floor(price/priceCount);
                        
                        jumyong_bean.setPRICE(String.valueOf(price));

                    }// for end
                    
                    System.out.println("����� �ϰ����� ����Ÿ �������� ����!!");
                }

                request.setAttribute("TAX_YN", tax_yn);
                request.setAttribute("listCount", String.valueOf(listCount));
                request.setAttribute("currentPage", strCurrentPage);
                request.setAttribute("year", year);
                request.setAttribute("TAX_SET", tax_set);
                request.setAttribute("mul_fromdate", util.Date_Paste(mul_fromdate));
                request.setAttribute("mul_todate", util.Date_Paste(mul_todate));
                request.setAttribute("TYPE", type);
                request.setAttribute("PURPOSE_CD", purpose);
                request.setAttribute("BJ_CD", bj_cd);
                request.setAttribute("HJ_CD", hj_cd);
                request.setAttribute("jumyongName", jumyongName);
                request.setAttribute("SECTION", SECTION);
                request.setAttribute("search", search);
                request.setAttribute("message", message);

                // ������� Ŭ�����ڵ� ����Ʈ�ڽ��� �������� �Ǿ� ������...search_flag���� 1��...
                if ("".equals(purpose) || purpose == null) {
                    request.setAttribute("search_flag", "1");
                }

                request.setAttribute("PERIOD", "12");
                request.setAttribute("YEAR", yearVal1);
                request.setAttribute("FROMDATE", yearVal1 + "-01-01");
                request.setAttribute("TODATE", yearVal1 + "-12-31");
                request.setAttribute("TAX_DATE", util.Date_Paste(thisDate));

            }

        } catch (Exception e) {

        	System.out.println("�ϰ����� ��ü�� ����");
        	e.printStackTrace();
        }

        return new ModelAndView("/jumyong/junggi/junggiAllCal", "blist",junggiList);
    }

    // �ϰ����� ����
    public ModelAndView junggiAllCalPrc(HttpServletRequest request,
            HttpServletResponse response) throws Exception {

        // ���� ����
        HttpSession session = request.getSession();
        String userId = (String) session.getAttribute("sessionUserId");
        String param = "";
        String result_message = "";
        int failCnt = 0;
        String failNo = "";

        try {
            if (userId != null) {
                // ������ �����͸� �����´�.
                UserBean userBean = new UserBean();
                userBean = commonCode.executeUserSearch(util.getSessionID(request, "sessionUserId"));
             
                //********** BEGIN_����_20120228
                UserBean userDept = new UserBean();
                List<UserBean> userList = commonCode.executeUserDeptSearch(userBean.getORG_CD());
                userDept = userList.get(0);                			
                //********** END_����_20120228
				//********** BEGIN_����_20120308
                //String deptCd = userDept.getDEPT_CD();
                //String siguCd = userDept.getORG_CD();
                String deptCd = userBean.getDEPT_CD();
                String siguCd = userBean.getORG_CD();	
                ArrayList<semokBean> semokListMatrix = semokListMatrix(siguCd,deptCd);
				//********** END_����_20120308
                // ���⵵ ���
                Calendar cal = Calendar.getInstance();
                SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd");
                String thisDate = formatter.format(cal.getTime());
                String thisYear = thisDate.substring(0, 4);
                	
                // ����Ʈ �˻� param start
                String SIDO_CD = util.getSidoCode(getMessageSourceAccessor());
                String sigu_cd = userBean.getSIGU_CD();
                String strCurrentPage = ServletRequestUtils.getStringParameter(request, "currentPage", Globals.DEFAULT_CURRENT_PAGE);
                String year_search = ServletRequestUtils.getStringParameter(request, "YEAR_search", thisYear);
                String type = ServletRequestUtils.getStringParameter(request,"TYPE", "");
                String tax_set = ServletRequestUtils.getStringParameter(request, "TAX_SET", "");
                String tax_yn = ServletRequestUtils.getStringParameter(request,"TAX_YN", "");
                String mul_fromdate = ServletRequestUtils.getStringParameter(request, "mul_fromdate", thisYear + "-01-01");
                String mul_todate = ServletRequestUtils.getStringParameter(request, "mul_todate", thisYear + "-12-31");
                String purpose = ServletRequestUtils.getStringParameter(request, "PURPOSE_CD", "");
                String bj_cd = ServletRequestUtils.getStringParameter(request,"BJ_CD", "");
                String hj_cd = ServletRequestUtils.getStringParameter(request,"HJ_CD", "");
                String jumyongName = ServletRequestUtils.getStringParameter(request, "jumyongName", "");
                String cal_status = ServletRequestUtils.getStringParameter(request, "cal_status", "");
                String SECTION = ServletRequestUtils.getStringParameter(request, "SECTION", "");
                String search = ServletRequestUtils.getStringParameter(request,"search", "0");
                String message = ServletRequestUtils.getStringParameter(request, "message", "");

                // ����Ʈ �˻� param end

                // ��� ���� param start
                String YEAR = ServletRequestUtils.getStringParameter(request,"YEAR", "");
                String FROMDATE = ServletRequestUtils.getStringParameter(request, "FROMDATE", "");
                String TODATE = ServletRequestUtils.getStringParameter(request,"TODATE", "");
                String PERIOD = ServletRequestUtils.getStringParameter(request,"PERIOD", "");
                String TAX_DATE = ServletRequestUtils.getStringParameter(request, "TAX_DATE", "");
                String INDATE = ServletRequestUtils.getStringParameter(request,"INDATE", "");
                String OVERDATE = ServletRequestUtils.getStringParameter(request, "OVERDATE", "");
                String SURCHARGE_RATE = ServletRequestUtils.getStringParameter(request, "SURCHARGE_RATE", "");

                // ����Ʈ ��� - �迭 param start
                String[] SUM_LASTYEAR_ARR = request.getParameterValues("SUM_LASTYEAR");
                String[] PRICE_ARR = request.getParameterValues("PRICE");
                String[] RATE_ARR = request.getParameterValues("RATE");
                String[] SUM_YEAR_ARR = request.getParameterValues("SUM_YEAR");
                String[] SUM_ADJUST_ARR = request.getParameterValues("SUM_ADJUST");
                String[] ADJUSTMENT_ARR = request.getParameterValues("ADJUSTMENT");
                String[] FORM_ARR = request.getParameterValues("FORM");
                String[] FORM_ADJUST_ARR = request.getParameterValues("FORM_ADJUST");
                String[] OVERTAX_ARR = request.getParameterValues("OVERTAX");

                String[] REDUCTION_SUM_ARR = request.getParameterValues("REDUCTION_SUM");
                String[] REDUCTION_FORM_ARR = request.getParameterValues("REDUCTION_FORM");

                String[] ADMIN_NO_ARR = request.getParameterValues("ADMIN_NO");
                String[] CHECK_YN_ARR = request.getParameterValues("CHECK_YN");
                String[] AREA_AFTER_ARR = request.getParameterValues("AREA_AFTER");
                String[] SUM_ARR = request.getParameterValues("SUM");

                String[] SIGU_CD_ARR = request.getParameterValues("SIGU_CD");
                String[] BJ_CD_ARR = request.getParameterValues("BJ_CD");
                String[] DEPT_CD_ARR = request.getParameterValues("DEPT_CD");
                String[] TAX_GUBUN_ARR = request.getParameterValues("TAX_GUBUN");
                String[] OBJ_SET_ARR = request.getParameterValues("OBJ_SET");
                String[] TAXPAYER_ID_ARR = request.getParameterValues("TAXPAYER_ID");
                String[] TAXPAYER_SET_ARR = request.getParameterValues("TAXPAYER_SET");
                String[] OCR_SIGU_CD_ARR = request.getParameterValues("OCR_SIGU_CD");
                String[] OCR_BUSEO_CD_ARR = request.getParameterValues("OCR_BUSEO_CD");
                String[] TAX_CD_ARR = request.getParameterValues("TAX_CD");
                String[] LIVE_ARR = request.getParameterValues("LIVE");
                String[] ADD_SET_ARR = request.getParameterValues("ADD_SET");
                String[] ADD_YN_ARR = request.getParameterValues("ADD_YN");
                String[] SUBUSEO_CD_ARR = request.getParameterValues("SUBUSEO_CD");
                String[] REDUCTION_RATE_ARR = request.getParameterValues("REDUCTION_RATE");
                String[] REDUCTION_REASON_ARR = request.getParameterValues("REDUCTION_REASON");
                String[] PERCENT_RATE_ARR = request.getParameterValues("PERCENT_RATE");
                String[] PERCENT_REASON_ARR = request.getParameterValues("PERCENT_REASON");

                if (ADMIN_NO_ARR != null && !"".equals(ADMIN_NO_ARR)) {
                    for (int i = 0; i < ADMIN_NO_ARR.length; i++) {

                        if (SUM_ADJUST_ARR[i] != null && !"".equals(SUM_ADJUST_ARR[i])) {
                            ProductBean objProductBean = new ProductBean();

                            int cal_sum_seq = 0;
//                            System.out.println("�ش翬�� ����� �� �ߺ�����***** " + objJunggiService.cal_sum_exist(ADMIN_NO_ARR[i], YEAR));
                            if (objJunggiService.cal_sum_exist(ADMIN_NO_ARR[i],
                                    YEAR,FROMDATE,TODATE) < 1) {

                                // cal_sum_seq ���� ���� ��������
                                cal_sum_seq = objJumyongService.getCal_Sum_Seq();
                                // System.out.println("cal_sum_seq ==== " +
                                // cal_sum_seq);

                                // �����, �ΰ���ġ�� ���
                                long sum = Long.parseLong(String.valueOf(util.nullTo(SUM_ADJUST_ARR[i], "0")));

                                long reduction_sum = Long.parseLong(String.valueOf(util.nullTo(REDUCTION_SUM_ARR[i], "0")));

                                //�ΰ���
                                if (commonCode.inquiryVatYN(ADMIN_NO_ARR[i])) {
                                    objProductBean.setVAT(String.valueOf(reduction_sum / 100 * 10));
                                } else {
                                    objProductBean.setVAT("0");

                                }
//                                System.out.println("�ΰ����ΰ����ΰ����ΰ��� : : : : " + objProductBean.getVAT());




//                                System.out.println(i + "  VAT  " + objProductBean.getVAT());

                                // System.out.println("************* ���밪 ���� start ****************");
                                // 1.2.3 ���밪 ����
                                objProductBean.setSECTION(SECTION);
                                objProductBean.setADMIN_NO(ADMIN_NO_ARR[i]);
                                objProductBean.setYEAR(YEAR);
                                objProductBean.setFROMDATE(util.Date_Cut(FROMDATE));
                                objProductBean.setTODATE(util.Date_Cut(TODATE));

                                if (PRICE_ARR[i] != null && !"".equals(PRICE_ARR[i])) {
                                    //objProductBean.setPRICE(Integer.parseInt(util.nullTo(PRICE_ARR[i], "0")));
                                	objProductBean.setPRICE(Long.parseLong(util.nullTo(PRICE_ARR[i], "0")));
                                }
                                if (AREA_AFTER_ARR[i] != null && !"".equals(AREA_AFTER_ARR[i])) {
                                    objProductBean.setAREA_AFTER(new Float(util.nullTo(AREA_AFTER_ARR[i], "0")).floatValue());
                                    objProductBean.setAREA_ALL(Float.parseFloat(util.nullTo(
                                            AREA_AFTER_ARR[i], "0")));
                                }
                                if (RATE_ARR[i] != null && !"".equals(RATE_ARR[i])) {
                                    objProductBean.setRATE(new Float(util.nullTo(RATE_ARR[i], "0")).floatValue());
                                }
                                if (SUM_LASTYEAR_ARR[i] != null && !"".equals(SUM_LASTYEAR_ARR[i])) {
                                    objProductBean.setSUM_LASTYEAR(Integer.parseInt(util.nullTo(
                                            SUM_LASTYEAR_ARR[i], "0")));
                                }
                                if (SUM_YEAR_ARR[i] != null && !"".equals(SUM_YEAR_ARR[i])) {
                                    objProductBean.setSUM_YEAR(Integer.parseInt(util.nullTo(
                                            SUM_YEAR_ARR[i], "0")));
                                }
                                if (SUM_ADJUST_ARR[i] != null && !"".equals(SUM_ADJUST_ARR[i])) {
                                    objProductBean.setSUM_ADJUST(Integer.parseInt(util.nullTo(
                                            SUM_ADJUST_ARR[i], "0")));
                                }
                                if (FORM_ADJUST_ARR[i] != null && !"".equals(FORM_ADJUST_ARR[i])) {
                                    objProductBean.setFORM_ADJUST(util.nullTo(
                                            FORM_ADJUST_ARR[i], ""));
                                }
                                if (REDUCTION_SUM_ARR[i] != null && !"".equals(REDUCTION_SUM_ARR[i])) {
                                    objProductBean.setREDUCTION_SUM(Integer.parseInt(util.nullTo(
                                            REDUCTION_SUM_ARR[i],
                                            "0")));
                                }
                                if (REDUCTION_FORM_ARR[i] != null && !"".equals(REDUCTION_FORM_ARR[i])) {
                                    objProductBean.setREDUCTION_FORM(util.nullTo(REDUCTION_FORM_ARR[i], ""));
                                }
                                if (FORM_ARR[i] != null && !"".equals(FORM_ARR[i])) {
                                    objProductBean.setFORM(util.nullTo(
                                            FORM_ARR[i], ""));
                                }
                                if (ADJUSTMENT_ARR[i] != null && !"".equals(ADJUSTMENT_ARR[i])) {
                                    objProductBean.setADJUSTMENT(new Float(util.nullTo(ADJUSTMENT_ARR[i], "0")).floatValue());
                                }
                                if (SURCHARGE_RATE != null && !"".equals(SURCHARGE_RATE)) {
                                    objProductBean.setSURCHARGE_RATE(new Float(
                                            SURCHARGE_RATE).floatValue());
                                }
                                if (REDUCTION_RATE_ARR[i] != null && !"".equals(REDUCTION_RATE_ARR[i])) {
                                    objProductBean.setREDUCTION_RATE(Float.parseFloat((util.nullTo(
                                            REDUCTION_RATE_ARR[i],
                                            "0"))));
                                }
                                if (REDUCTION_REASON_ARR[i] != null && !"".equals(REDUCTION_REASON_ARR[i])) {
                                    objProductBean.setREDUCTION_REASON(util.nullTo(
                                            REDUCTION_REASON_ARR[i],
                                            ""));
                                }
                                if (PERCENT_RATE_ARR[i] != null && !"".equals(PERCENT_RATE_ARR[i])) {
                                    objProductBean.setPERCENT_RATE(Float.parseFloat((util.nullTo(
                                    		PERCENT_RATE_ARR[i],
                                            "0"))));
                                }
                                if (PERCENT_REASON_ARR[i] != null && !"".equals(PERCENT_REASON_ARR[i])) {
                                    objProductBean.setPERCENT_REASON(util.nullTo(
                                    		PERCENT_REASON_ARR[i],
                                            ""));
                                }
                                objProductBean.setPERIOD(Integer.parseInt(PERIOD));

                                objProductBean.setUSE_SECTION("1");
                                objProductBean.setTAX_GUBUN("1");
                                // System.out.println("************* ���밪 ���� end ***************");

                                // ******************************************************************//
                                // 1.CALCULATION �� �Է�
                                objProductBean.setCAL_SUM_SEQ(String.valueOf(cal_sum_seq));
                                objProductBean.setPREV_SEQ("2"); // PREV_SEQ
                                // null�ƴҽ� :
                                // 1. ������ ,
                                // null 2.
                                // ������
                                objProductBean.setFIRST_SEQ(""); // FIRST_SEQ ���
                                // ������ ���
                                // null ����
                                objProductBean.setUP_DATE(thisDate);
                                objJumyongService.insertProduct(objProductBean);
                                // System.out.println("********* calculation_info �Է� end ************");
                                // ******************************************************************//

                                // *************************************************************//
                                // 2. cal_sum_info �� �Է�
                                objProductBean.setSEQ(String.valueOf(cal_sum_seq));
                                objProductBean.setTAX_SEQ(String.valueOf(cal_sum_seq));
                                objJumyongService.Cal_Sum_InfoInsert(objProductBean);
                                // System.out.println("********* cal_sum_info �Է� end ************");
                                // *************************************************************//

                                // *************************************************************//
                                // 3. taxation_info �� �Է�
                                objProductBean.setTAX_DATE(util.Date_Cut(TAX_DATE));
                                objProductBean.setINDATE(util.Date_Cut(INDATE));
                                objProductBean.setOVERDATE(util.Date_Cut(OVERDATE));
                                objProductBean.setFORM1(objProductBean.getFORM_ADJUST());
                                objProductBean.setFORM2(objProductBean.getFORM());
                                objProductBean.setTAX_NO("");
                                objProductBean.setTAX_YM((util.Date_Cut(TAX_DATE)).substring(0, 6));
                                objProductBean.setSEQ(String.valueOf(cal_sum_seq));
                                objProductBean.setINTAX(String.valueOf(reduction_sum));
                                objProductBean.setBONSE(String.valueOf(reduction_sum));
                                objProductBean.setSISE(String.valueOf(reduction_sum));
                                objProductBean.setGUSE(String.valueOf(0));
                                if (objProductBean.getGIGUM() == null || "".equals(objProductBean.getGIGUM())) {
                                    objProductBean.setGIGUM("0");
                                }
                                if (objProductBean.getGUKSE() == null || "".equals(objProductBean.getGUKSE())) {
                                    objProductBean.setGUKSE("0");
                                }

                                if (OVERTAX_ARR[i] != null && !"".equals(OVERTAX_ARR[i])) {
                                    objProductBean.setOVERTAX(util.nullTo(
                                            OVERTAX_ARR[i], "0"));
                                }
                              //********** BEGIN_����_20120228
                              /*  if (SIGU_CD_ARR[i] != null && !"".equals(SIGU_CD_ARR[i])) {
                                    objProductBean.setSIGU_CD(util.nullTo(
                                            SIGU_CD_ARR[i], ""));
                                }*/
                               // System.out.println(" SIGU_CD_ARR[i] : " + SIGU_CD_ARR[i]);
                               // System.out.println(" siguCd : " + siguCd);
                                objProductBean.setSIGU_CD(siguCd);
                              //********** END_����_20120228
                                if (BJ_CD_ARR[i] != null && !"".equals(BJ_CD_ARR[i])) {
                                    objProductBean.setBJ_CD(util.nullTo(
                                            BJ_CD_ARR[i], ""));
                                }
                                
                              //********** BEGIN_����_20120228                              
                               /* if (DEPT_CD_ARR[i] != null && !"".equals(DEPT_CD_ARR[i])) {
                                    objProductBean.setDEPT_CD(util.nullTo(
                                            DEPT_CD_ARR[i], ""));
                                }*/
                                objProductBean.setDEPT_CD(deptCd);
                              //  System.out.println(" DEPT_CD_ARR[i] : " + DEPT_CD_ARR[i]);
                               // System.out.println(" deptCd : " + deptCd);
                              //********** END_����_20120228
                                if (OBJ_SET_ARR[i] != null && !"".equals(OBJ_SET_ARR[i])) {
                                    objProductBean.setOBJ_SET(util.nullTo(
                                            OBJ_SET_ARR[i], ""));
                                }
                                if (TAXPAYER_ID_ARR[i] != null && !"".equals(TAXPAYER_ID_ARR[i])) {
                                    objProductBean.setTAXPAYER_ID(util.nullTo(
                                            TAXPAYER_ID_ARR[i], ""));
                                }
                                if (TAXPAYER_SET_ARR[i] != null && !"".equals(TAXPAYER_SET_ARR[i])) {
                                    objProductBean.setTAXPAYER_SET(util.nullTo(
                                            TAXPAYER_SET_ARR[i], ""));
                                }
                              
                                if (OCR_SIGU_CD_ARR[i] != null && !"".equals(OCR_SIGU_CD_ARR[i])) {
                                    objProductBean.setOCR_SIGU_CD(util.nullTo(
                                            OCR_SIGU_CD_ARR[i], ""));
                                }
                                if (OCR_BUSEO_CD_ARR[i] != null && !"".equals(OCR_BUSEO_CD_ARR[i])) {
                                    objProductBean.setOCR_BUSEO_CD(util.nullTo(
                                            OCR_BUSEO_CD_ARR[i], ""));
                                }
                                if (TAX_CD_ARR[i] != null && !"".equals(TAX_CD_ARR[i])) {
                                    objProductBean.setTAX_CD(util.nullTo(
                                            TAX_CD_ARR[i], ""));
                                }
                                if (LIVE_ARR[i] != null && !"".equals(LIVE_ARR[i])) {
                                    objProductBean.setLIVE(util.nullTo(
                                            LIVE_ARR[i], ""));
                                }
                                if (ADD_SET_ARR[i] != null && !"".equals(ADD_SET_ARR[i])) {
                                    objProductBean.setADD_SET(util.nullTo(
                                            ADD_SET_ARR[i], ""));
                                }
                                if (ADD_YN_ARR[i] != null && !"".equals(ADD_YN_ARR[i])) {
                                    objProductBean.setADD_YN(util.nullTo(
                                            ADD_YN_ARR[i], ""));
                                }
                               //********** BEGIN_����_20120306                              
                                if (SUBUSEO_CD_ARR[i] != null && !"".equals(SUBUSEO_CD_ARR[i])) {
                                    objProductBean.setSUBUSEO_CD(util.nullTo(
                                            SUBUSEO_CD_ARR[i], ""));
                                }
                                objProductBean.setSUBUSEO_CD(deptCd);
                               //********** END_����_20120306
                               //********** BEGIN_����_20120308
                                semokBean resultBean = new semokBean();
                                System.out.println("================================================================");
                                System.out.println("TAX_CD_ARR[i] : " + TAX_CD_ARR[i] );
                                if (TAX_CD_ARR[i] != null && !"".equals(TAX_CD_ARR[i])) {
                                    objProductBean.setTAX_CD(util.nullTo(TAX_CD_ARR[i], ""));
                                    
                                    resultBean = semokListSelect(semokListMatrix,objProductBean.getTAX_CD());
                                    
                                	objProductBean.setOCR_BUSEO_CD(resultBean.getOcrBuseoCd());
                                	objProductBean.setOCR_SIGU_CD(resultBean.getOcrSiguCd());
                                	objProductBean.setSUBUSEO_CD(resultBean.getSuBuseoCd());
                                	
                                	System.out.println("objProductBean.getOCR_BUSEO_CD() : " +objProductBean.getOCR_BUSEO_CD() );
                                	System.out.println("objProductBean.getOCR_SIGU_CD() : " +objProductBean.getOCR_SIGU_CD()  );
                                	System.out.println("objProductBean.getSUBUSEO_CD() : " +objProductBean.getSUBUSEO_CD()   );
                                    
                                }                                
                               //********** END_����_20120308
                              
                                objJunggiService.executeBugwa_Register(objProductBean);
                                // System.out.println("********* taxation_info �Է� end ************");
                                // **************************************************************//

                                objJunggiService.SetCal_Sum_Info_taxseq(String.valueOf(cal_sum_seq));

                                // ADMIN_BASE ������Ʈ ��¥ ����
                                objJumyongService.Admin_baseUp_dateUpdateQuery(
                                        thisDate, ADMIN_NO_ARR[i]);


                            }// �ߺ����� true end
                            else {
                                failCnt++;
                                failNo += "'" + ADMIN_NO_ARR[i].substring(9) + "' ";
                            }// �ߺ����� false end
                        }// ��������� ���� ���� end
                    }// for�� end

                }

                param = "?year=" + year_search + "&currentPage=" + strCurrentPage + "&type=" + type + "&tax_set=" + tax_set + "&tax_yn=" + tax_yn + "&mul_fromdate=" + mul_fromdate + "&mul_todate=" + mul_todate + "&purpose_cd=" + purpose + "&bj_cd=" + bj_cd + "&hj_cd=" + hj_cd + "&jumyongName=" + jumyongName + "&cal_status=" + cal_status + "&SECTION=" + SECTION + "&search=" + search;
            }

        } catch (Exception e) {
            System.out.println(e.toString());
            result_message = e.toString();// "����� ���⿡�� ������ �߻� ";
        }

        if (result_message == null || "".equals(result_message)) {

            if (failCnt > 0) {
                result_message = "�̹� ����� ������� " + failCnt + "�� �ֽ��ϴ�. �� ���� �Ǹ� ����Ǿ����ϴ�. ";
            } else {
                result_message = "����Ǿ����ϴ�. ";
            }

        }

        System.out.println("result_message== " + result_message);
        return new ModelAndView("redirect:/jumyong/junggi/search.do" + param + "&message=" + result_message);
    }
    
    
    
    
    // �ϰ����� ���� ���
    public ModelAndView excel_junggiAllCal(HttpServletRequest request,HttpServletResponse response) throws Exception {

        // ���� ����
        HttpSession session = request.getSession();
        String userId = (String) session.getAttribute("sessionUserId");
        String param = "";
        String result_message = "";
        int failCnt = 0;
        String failNo = "";
        
        
        List excelList = new ArrayList();
        

        try {
            if (userId != null) {
                // ������ �����͸� �����´�.
                UserBean userBean = new UserBean();
                userBean = commonCode.executeUserSearch(util.getSessionID(
                        request, "sessionUserId"));
                
                
                // ���� �迭 
                
                String[] ADMIN_NO_ARR = request.getParameterValues("ADMIN_NO");
                String[] NAME_ARR = request.getParameterValues("NAME");
                String[] SECTION_NAME_ARR = request.getParameterValues("SECTION_NAME");
                String SECTION = request.getParameter("SECTION");
                String[] TYPE_NAME_ARR = request.getParameterValues("TYPE_NAME");
                String[] TAX_SET_ARR = request.getParameterValues("TAX_SET_NAME");
                String[] ADDR_ARR = request.getParameterValues("ADDR");
                String[] ROAD_ADDR_ARR = request.getParameterValues("ROAD_ADDR");
                String[] PURPOSE_CLASSNM_ARR = request.getParameterValues("PURPOSE_CLASSNM");
                String[] OLD_AREA_SIZE_ARR = request.getParameterValues("OLD_AREA_SIZE");
                String[] OLD_RATE_ARR = request.getParameterValues("OLD_RATE");
                String[] OLD_PRICE_ARR = request.getParameterValues("OLD_PRICE");
                String[] SUM_LASTYEAR_ARR = request.getParameterValues("SUM_LASTYEAR");
                String[] AREA_AFTER_ARR = request.getParameterValues("AREA_AFTER");
                String[] RATE_ARR = request.getParameterValues("RATE");
                String[] PRICE_ARR = request.getParameterValues("PRICE");
                String[] SUM_YEAR_ARR = request.getParameterValues("SUM_YEAR");
                String[] SUM_ADJUST_ARR = request.getParameterValues("SUM_ADJUST");
                String[] REDUCTION_SUM_ARR = request.getParameterValues("REDUCTION_SUM");
                String[] VAT_ARR = request.getParameterValues("VAT");  
                String[] OVERTAX_ARR = request.getParameterValues("OVERTAX");         
                String[] ADJUSTMENT_ARR = request.getParameterValues("ADJUSTMENT");
                String[] FORM_ARR = request.getParameterValues("FORM");
                String[] FORM_ADJUST_ARR = request.getParameterValues("FORM_ADJUST");
                String[] REDUCTION_FORM_ARR = request.getParameterValues("REDUCTION_FORM");
                String[] REDUCTION_RATE_ARR = request.getParameterValues("REDUCTION_RATE");
                String[] REDUCTION_REASON_ARR = request.getParameterValues("REDUCTION_REASON");
                String[] PERCENT_RATE_ARR = request.getParameterValues("PERCENT_RATE");
                String[] PERCENT_REASON_ARR = request.getParameterValues("PERCENT_REASON");
                String[] OWNER_SET_NM_ARR = request.getParameterValues("OWNER_SET_NM");
                
                for(int i = 0 ; i < ADMIN_NO_ARR.length;i++){
                	
                	jumyongBean temp = new jumyongBean();
                	
                	temp.setADMIN_NO(ADMIN_NO_ARR[i].substring(9));
                	temp.setNAME(NAME_ARR[i]);
                	temp.setSECTION_NAME(SECTION_NAME_ARR[i]);
                	temp.setSECTION(SECTION);
                	temp.setTYPE_NAME(TYPE_NAME_ARR[i]);
                	temp.setTAX_SET(TAX_SET_ARR[i]);
                	temp.setADDR(ADDR_ARR[i]);
                	temp.setROAD_ADDR(ROAD_ADDR_ARR[i]);
                	temp.setPURPOSE_CLASSNM(PURPOSE_CLASSNM_ARR[i]);
                	temp.setOLD_AREA_SIZE(Float.parseFloat(OLD_AREA_SIZE_ARR[i]));
                	temp.setOLD_RATE(OLD_RATE_ARR[i]);
                	temp.setOLD_PRICE(OLD_PRICE_ARR[i]);
                	temp.setSUM_LASTYEAR(SUM_LASTYEAR_ARR[i]);
                	temp.setAREA_AFTER(Float.parseFloat(AREA_AFTER_ARR[i]));
                	temp.setRATE(RATE_ARR[i]);
                	temp.setPRICE(PRICE_ARR[i]);
                	temp.setSUM_YEAR(SUM_YEAR_ARR[i]);
                	temp.setSUM_ADJUST(SUM_ADJUST_ARR[i]);
                	temp.setREDUCTION_SUM(REDUCTION_SUM_ARR[i]);
                	temp.setVAT(VAT_ARR[i]);
                	temp.setOVERTAX(OVERTAX_ARR[i]);
                	temp.setADJUSTMENT(ADJUSTMENT_ARR[i]);
                	temp.setFORM(FORM_ARR[i]);
                	temp.setFORM_ADJUST(FORM_ADJUST_ARR[i]);
                	temp.setREDUCTION_FORM(REDUCTION_FORM_ARR[i]);
                	temp.setPERCENT_RATE(PERCENT_RATE_ARR[i]);
                	temp.setPERCENT_REASON(PERCENT_REASON_ARR[i]);
                	temp.setREDUCTION_RATE(REDUCTION_RATE_ARR[i]);
                	temp.setREDUCTION_REASON(REDUCTION_REASON_ARR[i]);
                	temp.setOWNER_SET_NM(OWNER_SET_NM_ARR[i]); //2016.01
                	
                	
                	excelList.add(i, temp);
        		                	
                }
                

            }

        } catch (Exception e) {
            System.out.println(e.toString());
            result_message = e.toString();
        }

        return new ModelAndView("/jumyong/junggi/excel_resultJunggiCal", "blist",excelList);
    }
    
  //********** BEGIN_����_20120308
    // ����� �ϰ� ����� �����ڵ� ��ȸ �׽�Ʈ�� ���� �޼��� - ��������
    public ModelAndView semokListTest(HttpServletRequest request,
            HttpServletResponse response) throws Exception {

        // ���� ����
        HttpSession session = request.getSession();
        String userId = (String) session.getAttribute("sessionUserId");
        
        ArrayList<semokBean> semokList = new ArrayList<semokBean>();
        ArrayList<semokBean> semokListMatrix = new ArrayList<semokBean>();
        String TAX_CD = request.getParameter("TAX_CD");
        System.out.println("TAX_CD : " + TAX_CD);
        try {
            if (userId != null) {
                // ������ �����͸� �����´�.
                UserBean userBean = new UserBean();
                userBean = commonCode.executeUserSearch(util.getSessionID(request, "sessionUserId"));
                
                UserBean userDept = new UserBean();
                List<UserBean> userList = commonCode.executeUserDeptSearch(userBean.getORG_CD());
                userDept = userList.get(0);
              //********** BEGIN_����_20120308
              
                //String deptCd = userDept.getDEPT_CD();
                //String siguCd = userDept.getORG_CD();
                String deptCd = userBean.getDEPT_CD();
                String siguCd = userBean.getORG_CD();
              //********** END_����_20120308  
                /*List<TaxCodeBean> TaxCodeList = commonCode.getTaxCodeList();                
                TaxCodeBean taxBean = new TaxCodeBean();
                
                BugaWebControl bugaWebControl = new BugaWebControl();             
                BugaWS ws = bugaWebControl.getBugaWS();
                semokBean semokInfoBean = new semokBean();
                
                System.out.println("TaxCodeList() : " + TaxCodeList.size());
                
                
                if(TaxCodeList.size() > 0){
                	for(int i = 0; i < TaxCodeList.size();i++){
                		taxBean = TaxCodeList.get(i);
                		System.out.println(taxBean.getTAXCODE() + ", "+ siguCd + ", "+ deptCd);
                		semokInfoBean = bugaWebControl.getSemokInfoList(ws, taxBean.getTAXCODE(), siguCd, deptCd);
                		semokList.add(semokInfoBean);
                		
                	}
                }                
                
                
                semokBean resultBean = new semokBean();
                System.out.println("semokList() : " + semokList.size());
                if(semokList.size() > 0){
                	for(int i = 0; i < semokList.size();i++){
                		resultBean = semokList.get(i);
                		
                		if(resultBean.getSemok_cd().equals(TAX_CD)){
                			break;
                		}
                	}
                }
                
                System.out.println("resultBean.getSigu_cd() : " +resultBean.getSigu_cd()   );
                System.out.println("resultBean.getSemok_cd()  : " +resultBean.getSemok_cd()   );
                System.out.println("resultBean.getBuseo_cd() : " +resultBean.getBuseo_cd()  );
                System.out.println("resultBean.getOcrBuseoCd() : " +resultBean.getOcrBuseoCd());
                System.out.println("resultBean.getOcrSiguCd() : " +resultBean.getOcrSiguCd() );
                System.out.println("resultBean.getSuBuseoCd() : " +resultBean.getSuBuseoCd() );*/
                semokBean resultBean = new semokBean();
                semokListMatrix = semokListMatrix(siguCd,deptCd);
                resultBean = semokListSelect(semokListMatrix,TAX_CD);
                
                request.setAttribute("resultBean", resultBean);
                //********** END_����_20120308
            }
            

        } catch (Exception e) {
            System.out.println(e.toString());
        }

        return new ModelAndView("/test/semokList","semokList", semokListMatrix);
    }
/*
    // ����� �ϰ� ����� �����ڵ� ��ȸ ��Ʈ����
    public semokBean semokListMatrix(String TAX_CD, String siguCd, String deptCd) throws Exception {

        ArrayList<semokBean> semokList = new ArrayList<semokBean>();
        semokBean resultBean = new semokBean();

        try {              
                List<TaxCodeBean> TaxCodeList = commonCode.getTaxCodeList();                
                TaxCodeBean taxBean = new TaxCodeBean();
                
                BugaWebControl bugaWebControl = new BugaWebControl();             
                BugaWS ws = bugaWebControl.getBugaWS();
                semokBean semokInfoBean = new semokBean();
                
                
                System.out.println("TaxCodeList() : " + TaxCodeList.size());
                if(TaxCodeList.size() > 0){
                	for(int i = 0; i < TaxCodeList.size();i++){
                		taxBean = TaxCodeList.get(i);
                		System.out.println(taxBean.getTAXCODE() + ", "+ siguCd + ", "+ deptCd);
                		semokInfoBean = bugaWebControl.getSemokInfoList(ws, taxBean.getTAXCODE(), siguCd, deptCd);
                		semokList.add(semokInfoBean);                		
                	}
                }
               
                System.out.println("semokList() : " + semokList.size());
                if(semokList.size() > 0){
                	for(int i = 0; i < semokList.size();i++){
                		resultBean = semokList.get(i);
                		
                		if(resultBean.getSemok_cd().equals(TAX_CD)){
                			break;
                		}
                	}
                }
                
                System.out.println("resultBean.getSigu_cd() : " +resultBean.getSigu_cd()   );
                System.out.println("resultBean.getSemok_cd()  : " +resultBean.getSemok_cd()   );
                System.out.println("resultBean.getBuseo_cd() : " +resultBean.getBuseo_cd()  );
                System.out.println("resultBean.getOcrBuseoCd() : " +resultBean.getOcrBuseoCd());
                System.out.println("resultBean.getOcrSiguCd() : " +resultBean.getOcrSiguCd() );
                System.out.println("resultBean.getSuBuseoCd() : " +resultBean.getSuBuseoCd() );
            

        } catch (Exception e) {
            System.out.println(e.toString());
        }

        return resultBean;
    }
    */
    
 // ����� �ϰ� ����� �����ڵ� ��ȸ ��Ʈ����
    public ArrayList semokListMatrix(String siguCd, String deptCd) throws Exception {

        ArrayList<semokBean> semokList = new ArrayList<semokBean>();

        try {              
                List<TaxCodeBean> TaxCodeList = commonCode.getTaxCodeList();                
                TaxCodeBean taxBean = new TaxCodeBean();
                
                BugaWebControl bugaWebControl = new BugaWebControl();             
                BugaWS ws = bugaWebControl.getBugaWS();
                semokBean semokInfoBean = new semokBean();
                
                
                System.out.println("TaxCodeList() : " + TaxCodeList.size());
                if(TaxCodeList.size() > 0){
                	for(int i = 0; i < TaxCodeList.size();i++){
                		taxBean = TaxCodeList.get(i);
                		System.out.println(taxBean.getTAXCODE() + ", "+ siguCd + ", "+ deptCd);
                		semokInfoBean = bugaWebControl.getSemokInfoList(ws, taxBean.getTAXCODE(), siguCd, deptCd);
                		semokList.add(semokInfoBean);  
                		
                		// �� ���� �� !!
                		//if(i == 2){
                		//	break;
                		//}
                		// �� ���� �� !!
                	}
                }
               
            

        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return semokList;
    }

    
    public semokBean semokListSelect(ArrayList semokMatrixList, String TAX_CD) throws Exception {

        ArrayList<semokBean> semokList = semokMatrixList;
        semokBean resultBean = new semokBean();
        boolean confirm = false;
        try {  
                System.out.println("semokList() : " + semokList.size());
                if(semokList.size() > 0){
                	for(int i = 0; i < semokList.size();i++){
                		resultBean = semokList.get(i);
                		
                		if(resultBean.getSemok_cd().equals(TAX_CD)){
                			confirm = true;
                			break;
                		}
                	}
                }
                
                System.out.println("resultBean.getSigu_cd() : " +resultBean.getSigu_cd()   );
                System.out.println("resultBean.getSemok_cd()  : " +resultBean.getSemok_cd()   );
                System.out.println("resultBean.getBuseo_cd() : " +resultBean.getBuseo_cd()  );
                System.out.println("resultBean.getOcrBuseoCd() : " +resultBean.getOcrBuseoCd());
                System.out.println("resultBean.getOcrSiguCd() : " +resultBean.getOcrSiguCd() );
                System.out.println("resultBean.getSuBuseoCd() : " +resultBean.getSuBuseoCd() );
            

        } catch (Exception e) {
            System.out.println(e.toString());
        }
        if(!confirm){
        	resultBean = null;
        }

        return resultBean;
    }
    
    //********** END_����_20120308    
    
}
