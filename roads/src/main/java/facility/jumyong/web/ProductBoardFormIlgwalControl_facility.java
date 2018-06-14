package main.java.facility.jumyong.web;

import java.text.SimpleDateFormat;
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

public class ProductBoardFormIlgwalControl_facility extends
		SimpleFormController {

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
	private Pageing pageing = new Pageing();

	public void setJumyongService_facility(IJumyongService newObjJumyongService) {
		this.objJumyongService = newObjJumyongService;
	}

	public ProductBoardFormIlgwalControl_facility() {
		setBindOnNewForm(true);
	}

	protected Object formBackingObject(HttpServletRequest request)
			throws ServletException {

		String gu_code = ServletRequestUtils.getStringParameter(request,
				"GU_CODE");
		String corp_cd = ServletRequestUtils.getStringParameter(request,
				"CORP_CD");
		String admin_no = ServletRequestUtils.getStringParameter(request,
				"ADMIN_NO");
		String mode = ServletRequestUtils.getStringParameter(request, "mode",
				"");
		String year = ServletRequestUtils.getStringParameter(request, "YEAR",
				"");
		String tax_set = ServletRequestUtils.getStringParameter(request,
				"TAX_SET", "");
		String cal_status = "";
		String depth_num = "";
		String direct = ServletRequestUtils.getStringParameter(request,
				"direct", "");

		System.out.println("==jumyong.formBackingObject==");
		System.out.println("tax_set : " + tax_set);
		System.out.println("year : " + year);

		request.setAttribute("gu_code", gu_code);
		request.setAttribute("corp_cd", corp_cd);
		request.setAttribute("admin_no", admin_no);
		request.setAttribute("mode", mode);
		request.setAttribute("year", year);
		request.setAttribute("direct", direct);

		Equip_ProductBean epb = new Equip_ProductBean();

		// hoban : 일괄 산출 리스트 호출.
		List placeList = objJumyongService.placeBoardCalList(gu_code, corp_cd,
				admin_no);

		System.out.println(placeList.size());

		request.setAttribute("blist", placeList);
		request.setAttribute("listCount", placeList.size());

		String strFormView = "/facility/jumyong/tab/ilgwal_info_product";
		setFormView(strFormView);

		return epb;

	}

	protected ModelAndView onSubmit(HttpServletRequest request,
			HttpServletResponse response, Object command, BindException errors)
			throws Exception {
		Equip_ProductBean objProductBean = (Equip_ProductBean) command;

		System.out
				.println("***************************************************************************");
		System.out
				.println("pactio : productBoardFormIlgwalControl_facility - onSubmit");
		System.out
				.println("***************************************************************************");

		String mode = ServletRequestUtils.getStringParameter(request, "mode",
				"");

		String gu_code = objProductBean.getGU_CODE();
		String corp_cd = objProductBean.getCORP_CD();
		String admin_no = objProductBean.getADMIN_NO();
		String strCurrentPage = ServletRequestUtils.getStringParameter(request,
				"currentPage", Globals.DEFAULT_CURRENT_PAGE);
		String year = objProductBean.getYEAR();
		String direct = ServletRequestUtils.getStringParameter(request,
				"direct", "");
		// 복수 데이터를 가진 변수
		String quantity_data = objProductBean.getQUANTITY_ILGW();
		String tax_set_data = objProductBean.getTAX_SET();
		String object_no_data = objProductBean.getOBJECT_NO();
		String sum_adjust_data = objProductBean.getSUM_ADJUST_ILGW();
		String form_adjust_data = objProductBean.getFORM_ADJUST();
		String rate_data = objProductBean.getRATE_ILGW();
		String depth_num_data = objProductBean.getDEPTH_NUM();

		// strCurrentPage 때문에 인쇄해보기
		System.out.println("/*hoban***************************************/");
		System.out.println("/*********************************************/");
		System.out.println("request = " + request);
		System.out.println("response = " + response);
		System.out.println("strCurrentPage = " + strCurrentPage);
		System.out.println("direct = " + direct);
		System.out.println("/*********************************************/");
		System.out.println("/*********************************************/");

		// 산출할 대상 갯수
		int listcount = objProductBean.getLISTCOUNT();
		System.out.println("quantity_data : " + quantity_data);
		System.out.println("tax_set_data : " + tax_set_data);
		System.out.println("object_no_data : " + object_no_data);
		System.out.println("sum_adjust_data : " + sum_adjust_data);
		System.out.println("form_adjust_data : " + form_adjust_data);
		System.out.println("rate_data : " + rate_data);
		System.out.println("depth_num_data : " + depth_num_data);

		// 복수 데이터 끌어온 변수에 대해서 배열로 재정리
		String[] quantitys = quantity_data.split(",");
		String[] tax_sets = tax_set_data.split(",");
		String[] object_nos = object_no_data.split(",");
		String[] sum_adjusts = sum_adjust_data.split(",");
		String[] form_adjusts = form_adjust_data.split(",");
		String[] rates = rate_data.split(",");
		String[] depth_nums = depth_num_data.split(",");

		System.out.println("pactio : 받는 값 전체 테스트");
		System.out.println("----------------넘어오는 년도 :" + year + " -----");
		System.out.println("corp_cd 처음 : " + corp_cd);
		System.out.println("gu_code 처음 : " + gu_code);
		System.out.println("admin_no 처음 : " + admin_no);
		System.out.println("year 처음 : " + year);
		System.out.println("listcount : " + listcount);

		request.setAttribute("direct", direct);
		try {
			for (int i = 0; i < listcount; i++) {
				// 배열로 받은 변수 값을 일반 변수에 1개씩 입력
				String quantity_f = quantitys[i];
				String tax_set = tax_sets[i];
				String object_no = object_nos[i];
				String sum_adjust_i = sum_adjusts[i];
				String form_adjust = form_adjusts[i];
				String rate_f = rates[i];
				String depth_num = depth_nums[i];

				// String으로 받은 값을 형변환
				float quantity = Float.valueOf(quantity_f);
				float rate = Float.valueOf(rate_f);
				int sum_adjust = Integer.valueOf(sum_adjust_i);

				// 배열로 받아진 depth_num값을 위 과정으로 1개씩 받아지도록 바꼈으므로 objProductBean에 다시
				// set함
				objProductBean.setDEPTH_NUM(depth_num);
				String depth_rate = ServletRequestUtils.getStringParameter(
						request, "DEPTH_NUM", "0");

				// 배열로 받아진 변수값 들이 단일값으로 바뀐걸 objProductBean에 set함.
				objProductBean.setQUANTITY(quantity);
				objProductBean.setTAX_SET(tax_set);
				objProductBean.setOBJECT_NO(object_no);
				objProductBean.setSUM_ADJUST(sum_adjust);
				objProductBean.setFORM_ADJUST(form_adjust);
				objProductBean.setRATE(rate);
				System.out.println("pactio : 데이터 삽입 완료 후 통과 테스트");
				Calendar cal = Calendar.getInstance();
				SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd"); // 데이터
																			// 출력
																			// 형식
																			// 지정
				String toDay = sdf.format(cal.getTime()); // 오늘 날짜 변수에 저장

				objProductBean.setUP_DATE(toDay);
				objProductBean.setFROMDATE(removeDash(objProductBean
						.getFROMDATE()));
				objProductBean
						.setTODATE(removeDash(objProductBean.getTODATE()));

				System.out.println("pactio : 데이터 삽입 완료 후 통과 테스트1");

				objProductBean.setSEQ(0);
				objProductBean.setFORM(objProductBean.getFORM_ADJUST());
				objProductBean.setUSE_SECTION("2");
				objProductBean.setFIRST_SEQ(0);
				objProductBean.setDEPTH_RATE(Float.parseFloat(depth_rate));

				// 기존에 등록된 같은년도의 산출 코드가 있으면...
				int cal_sum_seq = objJumyongService.getEquip_Cal_Sum_Seq(
						gu_code, corp_cd, tax_set, year, admin_no);

				cal_sum_seq = objJumyongService.getEquip_Cal_Sum_Seq(); // cal_sum_seq를
																		// sequence에서
																		// 뽑아옴
				objProductBean.setSEQ(cal_sum_seq); // cal_sum_info의seq를 set 함
				objProductBean.setCAL_SUM_SEQ(cal_sum_seq); // calculation의
															// cal_sum_seq를 set함

				System.out.println("pactio : 데이터 삽입 완료 후 통과 테스트2");

				int sum = objProductBean.getSUM_ADJUST()
						* (100 - objProductBean.getREDUCTION_RATE()) / 100;
				sum = sum / 100 * 100;

				objProductBean.setSUM(sum);// 최종점용료 입력
				objProductBean.setADMIN_NO(admin_no);

				objJumyongService.Equip_CalculationInsert(objProductBean); // calculation의
																			// seq는
																			// sequence에
																			// 의해서
																			// 들어감
																			// seq
																			// 변경
																			// 필요
																			// 없음

				objProductBean.setFORM_ADJUST("단가 * 연장 * 기간 * 감면율");
				objJumyongService.Equip_Cal_SumInsertQuery(objProductBean);

				System.out.println("pactio : 데이터 삽입 완료 후 통과 테스트3");

			}
		} catch (Exception err) {
			System.out.println(err.toString());
		}
		// 일괄산출 - 계산, 저장 - 리턴때 요부분에서 에러가 나요.
		// 원래 리턴되어야 할 경로 : /jsp/facility/jumyong/productIlgwalInsert.jsp
		// 현재 잘못 설정된 경로 : /jspfacility/jumyong/productIlgwalInsert.jsp

		System.out
				.println("************** ProductBoardFormIlgwalControl_facility.java / onSubmit - getSuccessView() ERROR ****************");
		System.out.println("획득한 URL 정보 : /facility/jumyong/product_view.do?GU_CODE="+gu_code+"&CORP_CD="+corp_cd+"&ADMIN_NO="+admin_no+"&YEAR="+year);
//		System.out.println("getSuccessView()" + getSuccessView());
//		return new ModelAndView("/facility/jumyong/productIlgwalInsert");
		return new ModelAndView("redirect:/facility/jumyong/product_view.do?GU_CODE="+gu_code+"&CORP_CD="+corp_cd+"&ADMIN_NO="+admin_no+"&YEAR="+year);
//		facility\jumyong\tab\ilgwal_info_product.jsp
	}

	public String removeDash(String val1) {
		String[] components = val1.split("-");
		String returnVal = "";
		for (int i = 0; i < components.length; i++)
			returnVal = returnVal + components[i].toString();

		return returnVal;
	}

	public String addDash(String val1) {
		if (val1.length() >= 8)
			val1 = val1.substring(0, 4) + "-" + val1.substring(4, 6) + "-"
					+ val1.substring(6, 8);
		else if (val1.length() >= 6)
			val1 = val1.substring(0, 4) + "-" + val1.substring(4, 6);

		return val1;
	}
}