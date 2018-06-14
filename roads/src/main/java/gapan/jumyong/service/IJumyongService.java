/*********************************************************************************************************
 				*최초작성일 : 2006.07.12
				*최초작성자 : jklee, jhlee
				*주요처리내용 : Q&A게시판 관련 db작업을 처리
				*수정일 :
				*수정자 :
				*수정내용 :
 *********************************************************************************************************/

package main.java.gapan.jumyong.service;

import java.util.List;
import java.util.Map;


import main.java.gapan.jumyong.model.GapanInfoBean;
import main.java.gapan.jumyong.model.GapanHeadBean;
import main.java.gapan.jumyong.model.GapanBaseBean;
import main.java.gapan.jumyong.model.ConfBean;
import main.java.gapan.jumyong.model.DisUseBean;
import main.java.gapan.jumyong.model.InspectBean;
import main.java.gapan.jumyong.model.PlaceFileBean;
import main.java.gapan.jumyong.model.PlaceLocationBean;
import main.java.gapan.jumyong.model.ProductBean;
import main.java.gapan.jumyong.model.SaleBean;
import main.java.gapan.jumyong.model.SearchBean;

/**
 * 가판 점용 관리 인터페이스.
 * @author jklee, jhlee
 *
 */
public interface IJumyongService{
	
    public	String	executeCheck_Gapanno(String gapanNo);
    
    /**
     * 가판 BASE 등록
     * @param Bean
     * @return
     */
    public	boolean	executeGapan_Base_Register(GapanBaseBean Bean);

    /**
     * 가판 운영자, 동업자 정보 등록
     * @param Bean
     * @return
     */
    public	boolean	executeGapan_Head_Register(GapanHeadBean Bean);
   
    /**
     * GAPAN_INFO  테이블에 등록
     * @param Bean
     * @return
     */
    public	boolean	executeGapan_Info_Register(GapanInfoBean Bean);

    /**
     *  Only Seoul administrator registers.
     *  Write jumin info and a few jumji_info(nullable: no)  
     * @param Bean
     * @return
     */
    public boolean executeGapan_Info_Register_Seoulonly(GapanInfoBean Bean);
    
    /**
     * 세외수입부과정보 입력
     * @param objProductBean
     * @return
     */
    public boolean executeBugwa_Register(ProductBean objProductBean);
    
    /**
     * 세외수입부과정보 수정
     * @param objProductBean
     * @return
     */
    public boolean updateBugwa_Register(ProductBean objProductBean);
    
	/**
	 * 폐기/매각 리스트
	 * @param gapanNo
	 * @return
	 */
	public List ProductSaleList(String gapanNo);
	
	/**
	 * 폐기/매각 개수
	 * @param gapanNo
	 * @return
	 */
	public int getProductSaleListCount(String gapanNo);	
	
    /**
     * 폐기/매각 삭제
     * @param gapanNo
     */
    public void executeDeleteProductSale(String gapanNo);
    
    /**
     * 폐기매각 등록
     * @param objSaleBean
     * @return
     */
    public boolean UpdateSale_Register(SaleBean objSaleBean);
    
    /**
     * 폐기매각 수정
     * @param objSaleBean
     * @return
     */
    public boolean ExecuteSale_Register(SaleBean objSaleBean);
    
	/**
	 * 해지등록 취소
	 * @param gapanNo
	 */
	public void disuseCancel(String gapanNo);
	
	/**
	 * 이력정보 insert
	 * @param objProductBean
	 * @return
	 */
	public ProductBean insertHistoryInfo(ProductBean objProductBean);
	
	/**
	 * History_info 마지막 seq 추출
	 * @param objProductBean
	 * @return
	 */
	public String getHistoryMaxSeq(ProductBean objProductBean);
    
    /**
     * 점용 조회
     * @param objectSearchBean
     * @return
     */
    public List retrieveBoardList(SearchBean objectSearchBean);

    /**
     * 점용 조회 엑셀 변환
     * @param objectSearchBean
     * @return
     */
    public List retrieveBoardListExcel(SearchBean objectSearchBean);
    
    /**
     * 점용 조회 개수
     * @param objectSearchBean
     * @return
     */
    public int getProductListCount(SearchBean objectSearchBean);
    
	//산출물 //////////////////////////////////////////////////////////////////////////////////////////
	//public List retrieveProductList(String adminNo);
	
	/**
	 * 산출물 리스트
	 * @param intCurPage
	 * @param intCount
	 * @param adminNo
	 * @param cal_mode
	 * @return
	 */
	public List ProductList(int intCurPage, int intCount, String adminNo, String cal_mode);
	
	/**
	 * 산출물 개수
	 * @param adminNum
	 * @param cal_mode
	 * @return
	 */
	public int getProductListCount(String adminNum,String cal_mode);	
	
	/**
	 * 산출물 개별 정보
	 * @param adminNo
	 * @param seq
	 * @return
	 */
	public ProductBean productInfo(String adminNo,String seq);
	
    /**
     * 산출물 작년도 점용료
     * @param adminNum
     * @param year
     * @return
     */
    public int getSum_LastYear(String adminNum, String year);
	
	/**
	 * 입력
	 * @param objProductBean
	 * @return
	 */
	public ProductBean insertProduct(ProductBean objProductBean);
	
	/**
	 * 수정
	 * @param objProductBean
	 * @return
	 */
	public ProductBean updateProduct(ProductBean objProductBean);
	
	/**
	 * 산출요율 구하기
	 * @param add_sum
	 * @return
	 */
	public String getProductRate(String add_sum);
		
	/**
	 * 면허세 구하기
	 * @param area
	 * @return
	 */
	public int getLicenseTax(float area);
	
	/**
	 * 초기화 데이타 구하기
	 * @param gapanNo
	 * @param cal_mode
	 * @return
	 */
	public Map getInitCal(String gapanNo,String cal_mode);
	
	/**
	 * 점용구분 구하기
	 * @param admin_no
	 * @return
	 */
	public Map getSection(String admin_no);
	
	/**
	 * 검토여부 설정
	 * @param adminNo
	 */
	public void SetCheckYn(String adminNo);
	
	/**
	 * 과세여부 설정.
	 * @param adminNo
	 */
	public void SetTaxYn(String adminNo);
	
    /**
     * 무단점용 총액
     * @param adminNo
     * @return
     */
    public int getTotalSum(String adminNo);	
	
	//현장조사//////////////////////////////////////////////////////////////////////////////////////////	
	public InspectBean insertInspect(InspectBean objInspectBean);
	public List retrieveInspectList(int intCurPage, int intCount, String adminNo);
	public int getInspectListCount(String adminNum);
	public List InspectInfo(String adminNo, String seq);	
	public InspectBean updateInspect(InspectBean objInspectBean);
	
	//검토협의//////////////////////////////////////////////////////////////////////////////////////////
	public List retrieveConfList(int intCurPage, int intCount, String adminNo, String gp_typ);
	public int getConfListCount(String adminNum);
	public List ConfInfo(String adminNo, String seq, String gp_typ);
	public ConfBean insertConf(ConfBean objConfBean);
	public ConfBean updateConf(ConfBean objConfBean);
	
	//위치정보//////////////////////////////////////////////////////////////////////////////////////////
	public List retrieveLocatonList(int intCurPage, int intCount, String adminNo);
	public int getLocationListCount(String adminNum);
	public PlaceLocationBean insertLocation(PlaceLocationBean objLocationBean);
	public PlaceLocationBean updateLocation(PlaceLocationBean objLocationBean);
	public  boolean deleteLocation (int intNum);

	//파일정보//////////////////////////////////////////////////////////////////////////////////////////
	public List retrieveFileList(int intCurPage, int intCount, String adminNo);
	public int getFileListCount(String adminNum);
	public PlaceFileBean insertFile(PlaceFileBean objFileBean);
	public PlaceFileBean updateFile(PlaceFileBean objFileBean);
	public  boolean deleteFile(int intNum);

//  년도별 점용허가증 가능한지 카운트 
    public int getLicenseYnCount(String adminNum, String year);
//  년도별 점용허가증 가능한지 카운트 
    public int getProductYnCount(String adminNum, String year);    
//	해지정보
    public DisUseBean disUseInfo(String admin_no);
    public boolean disUseUpdate(DisUseBean disUseBean);    



//  CALCULATION_INFO 시퀀스 증가값
    public int getCalculationSequence();    
//  감소분 년도 선택 리스트
    public List productSubList(String adminNo,String year);  
///////////////////////////////////////////////산출물 부과
//  산출물 입력
    public int Cal_Sum_InfoInsert(ProductBean objProductBean);
//  CAL_SUM_INFO 시퀀스 증가값
    public int getCal_Sum_Seq();    
//	  CAL_SUM_INFO 수정
    public int CalSumUpdate(ProductBean objProductBean);
//	  CAL_SUM_INFO
    public ProductBean CalSumInfoInfo(int seq);    
//	년도별 first_seq별 seq
    public int getCalSeqbyFirstSeq(String year,String first_seq);    
//	  FORM_ADJUST CAL_SUM_SEQ로 가져오기
    public String FormAdjustList(int seq);    
    
//  무단 점용 cal_sum_seq 
    public int get_cal_sum_seq(String year);    
   
//  무단 해당 연도 자료 있는지.
    public int get_calculationCount_mudan(String adminNum,String year);	
    
    /**
     * 공시지가 구하기.
     * @param gapanNo
     * @return
     */
    public Map get_Price(String gapanNo);
    		    
    /**
     * ADMIN_BASE UPDATE
     * @param update
     * @param admin_no
     */
    public void Admin_baseUp_dateUpdateQuery(String update,String admin_no);   

    /**
     * 현장조사 삭제
     * @param seq
     */
    public void Delete_Inspect(int seq);    

    /**
     * 검토 협의 삭제
     * @param seq
     */
    public void Delete_Conf(int seq);
    
    /**
     * 일반 점용 일수 가져오기
     * @param admin_no
     * @return
     */
    public int getTotalPeriod(String admin_no);    

    /**
     * 무단 점용 넓이
     * @param adminNo
     * @return
     */
    public int getMudanArea(String adminNo);

	/**
	 * 무단점용 getPrice
	 * @param adminNo
	 * @return
	 */
	public String getPrice(String adminNo);
	
	// 위반사항 리스트
    public int  getVioTotalCount(ProductBean objProductBean);
    public List getVioTotalList(ProductBean objProductBean, int intCount , int intCurPage);
    public ProductBean violationRegisterPrc(ProductBean objProductBean);
    public ProductBean getViolationView(String gapanNo, String seq);
    public int violationCheck(ProductBean objProductBean);
    public ProductBean violationUpdate(ProductBean objProductBean);
    
    public ProductBean getBatchCalculationProductList(String gapan_no,String year);
    
    public ProductBean getCalculationItem(String year, String gapanNo);
    
    public int cal_sum_exist(String gapan_no,String year, String cal_mode);
    
    /**
     * 산출정보 삭제
     * @param gapanNo
     * @param seq
     * @return
     */
    public int executeDeleteCalTax(String gapanNo,String seq);
    
    public List getCalculationDate(String gapanNo,String calMode);
    
    public ProductBean getViolationAddInfo(String gapanNo);
    
    public Map getGiganPoint(String gapanNo);
    
    public void deleteViolationInfo(String gapanNo, String seq);
    
    
    public void executeGiganUpdate(String gapanNo, String mul_fromdate, String mul_todate);
    
//  출력물 정보 얻기
    public Map get_DocInfo(String gapanNo);
    
    
    
}