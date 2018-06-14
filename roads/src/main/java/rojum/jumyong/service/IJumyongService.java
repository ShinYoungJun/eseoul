/*********************************************************************************************************
 				*최초작성일 : 2006.07.12
				*최초작성자 : jklee, jhlee
				*주요처리내용 : Q&A게시판 관련 db작업을 처리
				*수정일 :
				*수정자 :
				*수정내용 :
 *********************************************************************************************************/

package main.java.rojum.jumyong.service;

import java.util.List;
import java.util.Map;

import main.java.rojum.jumyong.model.GapanInfoBean;
import main.java.rojum.jumyong.model.GapanHeadBean;
import main.java.rojum.jumyong.model.GapanBaseBean;
import main.java.rojum.jumyong.model.ConfBean;
import main.java.rojum.jumyong.model.DisUseBean;
import main.java.rojum.jumyong.model.ProductBean;
import main.java.rojum.jumyong.model.SaleBean;
import main.java.rojum.jumyong.model.SearchBean;

public interface IJumyongService{
    public	String	executeCheck_Gapanno(String gapanNo);
   //가판 BASE 등록
    public	boolean	executeGapan_Base_Register(GapanBaseBean Bean);
  //가판 운영자, 동업자 정보 등록
    public	boolean	executeGapan_Head_Register(GapanHeadBean Bean);
    //	GAPAN_INFO  테이블에 등록
    public	boolean	executeGapan_Info_Register(GapanInfoBean Bean);
    //점용 조회
    public List retrieveBoardList(SearchBean objectSearchBean);
    //점용 조회 엑셀 변환
    public List retrieveBoardListExcel(SearchBean objectSearchBean);
    //점용 조회 개수
    public Map getProductListCount(SearchBean objectSearchBean);
    
    //운영자 정보 보기
    public List executeGapan_Head(String GAPAN_NO);
  //********** BEGIN_KANG_20120416
    public List executeGapan_Info(String GAPAN_NO);
  //********** END_KANG_20120416
    
    //점용료 정보 보기
    public List executeJumyongInfo(String ownerName,String ownerSsn,String guCd);
    
	// 수거 정보 보기
	public List executePickupInfo(String ownerName,String ownerSsn,String guCd);
	
	//********** BEGIN_KANG_20120416
	public List executePickupInfo(String ownerName,String ownerSsn,String guCd, String CAR_NO);
	//********** END_KANG_20120416

	// 계도 정보 보기
	public List executeGuideInfo(String ownerName,String ownerSsn,String guCd);

	//********** BEGIN_KANG_20120416
	public List executeGuideInfo(String ownerName,String ownerSsn,String guCd,String CAR_NO);
	//********** END_KANG_20120416

	// 폐기 / 매각 정보 보기
	public List executeSaleInfo(String ownerName,String ownerSsn,String guCd);
    
	// 고발등록 리스트
	public List executeAccuseInfo(String ownerName,String ownerSsn,String guCd);

	// 전업지원 리스트
	public List executeChangeJobInfo(String ownerName,String ownerSsn,String guCd);
    
    
    
    
    
    
    
    
    
    
    
    
    
	//세외수입부과정보 입력
    public boolean executeBugwa_Register(ProductBean objProductBean);
    //세외수입부과정보 수정
    public boolean updateBugwa_Register(ProductBean objProductBean);
    
	//폐기/매각 리스트
	public List ProductSaleList(String gapanNo);
	//폐기/매각 개수
	public int getProductSaleListCount(String gapanNo);	
	// 폐기/매각 삭제
    public void executeDeleteProductSale(String gapanNo);
    
    //폐기매각 등록
    public boolean UpdateSale_Register(SaleBean objSaleBean);
    
    //폐기매각 수정
    public boolean ExecuteSale_Register(SaleBean objSaleBean);
    
    
   
	
	// 운영자 리스트
	public List executeOwnerList(String owner_name);
	
	
	

    
    // 이력정보 insert
	public ProductBean insertHistoryInfo(ProductBean objProductBean);
	//History_info 마지막 seq 추출
	public String getHistoryMaxSeq(ProductBean objProductBean);
	//산출물 //////////////////////////////////////////////////////////////////////////////////////////
	//public List retrieveProductList(String adminNo);
	//산출물 리스트
	public List ProductList(int intCurPage, int intCount, String adminNo, String cal_mode);
	//산출물 개수
	public int getProductListCount(String adminNum,String cal_mode);	
	//산출물 개별 정보
	public ProductBean productInfo(String adminNo,String seq);
    //  산출물 작년도 점용료 
    public int getSum_LastYear(String adminNum, String year);
	//입력
	public ProductBean insertProduct(ProductBean objProductBean);
	//수정
	public ProductBean updateProduct(ProductBean objProductBean);
	//산출요율 구하기
	public String getProductRate(String add_sum);
	//면허세 구하기	
	public int getLicenseTax(float area);
	//초기화 데이타 구하기
	public Map getInitCal(String gapanNo,String cal_mode);
	
	//점용구분 구하기
	public Map getSection(String admin_no);

	// 점용료 대상여부 알기
	public Map getTaxtationAt(String gapanNo);
	
	//검토여부 설정
	public void SetCheckYn(String adminNo);
	public void SetTaxYn(String adminNo);
//  무단점용 총액 
    public int getTotalSum(String adminNo);	
	
//	해지정보
    public DisUseBean disUseInfo(String admin_no);
    public boolean disUseUpdate(DisUseBean disUseBean);    

//  CALCULATION_INFO 시퀀스 증가값
    public int getCalculationSequence();    
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
    
//  공시지가 구하기.
    public Map get_Price(String gapanNo);
    
//	가판기본 업데이트
    public void GapanBaseUpdate(GapanBaseBean bean);   

//  일반 점용 일수 가져오기
    public int getTotalPeriod(String admin_no);    
//  무단 점용 넓이
    public int getMudanArea(String adminNo);

//	무단점용 getPrice
	public String getPrice(String adminNo);
	
    public ProductBean getBatchCalculationProductList(String gapan_no,String year);
    
    public int cal_sum_exist(String gapan_no,String year);
    
    // 산출정보 삭제
    public void executeDeleteCalTax(String gapanNo,String seq);
    
    // 반환 처리
    public void executeReturnProduct(String gapanNo,String returnDate);
    
    //운영자 존재 여부
    public String getExistOwner(String gapanNo);
    
    // tax_code 리스트 가져오기
    public List ExecuteTaxCodeInfo(String TAX_SET, String TAX_CD);
    
	// 해지등록 취소
	public void disuseCancel(String gapanNo);
	
	//********** BEGIN_현진_20120222

	public List gapanTaxationInfoSelect(String gapanNo,String seq,String year);

	public List gapanCalculationSelect(String gapanNo,String seq,String year);

	public List gapanCalSumInfoSelect(String gapanNo,String seq,String year);
	//********** END_현진_20120222
	//********** BEGIN_현진_20120227
    public void executebugwaCancel(String gapanNo,String seq);
	//********** END_현진_20120227	   
}