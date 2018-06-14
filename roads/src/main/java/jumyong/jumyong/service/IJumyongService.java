/*********************************************************************************************************
 				*최초작성일 : 2006.07.12
				*최초작성자 : jklee, jhlee
				*주요처리내용 : Q&A게시판 관련 db작업을 처리
				*수정일 :
				*수정자 :
				*수정내용 :
 *********************************************************************************************************/

package main.java.jumyong.jumyong.service;

import java.util.List;
import java.util.Map;

import org.springframework.dao.DataAccessException;

import main.java.jumyong.jumyong.model.ConfBean;
import main.java.jumyong.jumyong.model.DisUseBean;
import main.java.jumyong.jumyong.model.InspectBean;
import main.java.jumyong.jumyong.model.PlaceFileBean;
import main.java.jumyong.jumyong.model.PlaceLocationBean;
import main.java.jumyong.jumyong.model.ProductBean;
import main.java.jumyong.jumyong.model.SearchBean;
import main.java.jumyong.jumyong.model.initCalBean;

public interface IJumyongService{	
	//public List retrieveBoardList(int intCurPage, String fromDate ,String toDate,String type, String section,String tax_set,String check_yn
    //		,String bj_cd,String hj_cd,String bonbun, String bubun,String numberValue,String jumyongName,String purpose);
    //점용 조회
    public List retrieveBoardList(SearchBean objectSearchBean);
    
    //점용 조회 Excel
    public List retrieveBoardList_Excel(SearchBean objectSearchBean);
    
    //점용 조회 개수
    public int getProductListCount(SearchBean objectSearchBean);
	//산출물 //////////////////////////////////////////////////////////////////////////////////////////
	//public List retrieveProductList(String adminNo);
	//산출물 리스트
	public List ProductList(int intCurPage, int intCount, String adminNo);
	//산출물 개수
	public int getProductListCount(String adminNum);	
	//산출물 개별 정보
	public ProductBean productInfo(String seq);
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
	//요율 구하기
	public String getYoyul(String adminNo);
	//점용면적 구하기
	public String getAreaSize(String adminNo);
	//부과 여부 구하기
	public boolean define_tax_yn(String adminNo, String seq);
	
	//점용구분 구하기
	public Map getSection(String admin_no);
	//검토여부 설정
	public void SetCheckYn(String adminNo);
	public void SetTaxYn(String adminNo);
//  무단점용 총액 
    public int getTotalSum(String adminNo, String seq);	
	
	//현장조사//////////////////////////////////////////////////////////////////////////////////////////	
	public InspectBean insertInspect(InspectBean objInspectBean);
	public List retrieveInspectList(int intCurPage, int intCount, String adminNo, String seq);
	public int getInspectListCount(String adminNum);
	public List InspectInfo(String adminNo, String seq);	
	public InspectBean updateInspect(InspectBean objInspectBean);
	
	//검토협의//////////////////////////////////////////////////////////////////////////////////////////
	public List retrieveConfList(int intCurPage, int intCount, String adminNo, String seq);
	public int getConfListCount(String adminNum);
	public List ConfInfo(String adminNo, String seq);
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
    public boolean disUseDelete(String adminNo);  



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
//	  CAL_SUM_INFO 수정
    public int CalSumUpdate2(ProductBean objProductBean);
//	  CAL_SUM_INFO
    public ProductBean CalSumInfoInfo(int seq);    
//	년도별 first_seq별 seq
    public int getCalSeqbyFirstSeq(String year,String first_seq);    
//	  FORM_ADJUST CAL_SUM_SEQ로 가져오기
    public String FormAdjustList(int seq);    
    
//  무단 점용 cal_sum_seq 
    public int get_cal_sum_seq(String year);    

//  무단 점용 cal_sum_seq 
    public int get_cal_sum_seq2(String adminNo, String seq, String year); 

    
//	무단점용 getForm
    public String getForm(String adminNo, float reduction_rate);

//  무단 해당 연도 자료 있는지.
    public int get_calculationCount_mudan(String adminNum,String year);	
    
//  공시지가 구하기.
    public Map get_Price(String admin_no);
    
//	  ADMIN_BASE UPDATE		    
    public void Admin_baseUp_dateUpdateQuery(String update,String admin_no);   


//	  현장조사 삭제
    public void Delete_Inspect(int seq);    
//	  검토 협의 삭제
    public void Delete_Conf(int seq);
    
//  일반 점용 일수 가져오기
    public int getTotalPeriod(String admin_no);    
//  무단 점용 넓이
    public float getMudanArea(String adminNo);    
    
	//무단점용 getForm
	public String getForm2(String adminNo);
//	무단점용 getPrice
	public String getPrice(String adminNo);
	
	// 이력정보 list
	public List getHistoryList(String adminNo ,int currentPage ,int countPerPage);
	// 이력정보 list count
	public int getHistoryListCount(String adminNo);
	// 이력정보 insert
	public ProductBean insertHistoryInfo(ProductBean objProductBean);
	// 이력정보 상세
	public ProductBean getHistoryView(String ADMIN_NO, String SEQ);	
	public ProductBean updateHistoryInfo(ProductBean objProductBean);
	public String getHistoryMaxSeq(ProductBean objProductBean);
	
	public boolean deleteHistoryInfo(String adminNo,String seq);
	
	
	
	
	
	
	
	
	
//	CAL_SUM_INFO 테이블 면적 추가 업데이트		 
    public int CalSumAddUpdate(ProductBean objProductBean);    
	
//	SUM_ADJUST, AREA_AFTER 합계 SUM_SEQ별
    public int SumBysumSeq(String admin_no, String seq);  
	
    // check_yn 가져오기    
    public String getCheck_yn(String adminNo);
    
    // 인접지 합계 가져오기
    public String getWITH_SUM_PRICE(String adminNo);
    
    public ProductBean productInfo_Admin(String seq, String adminNo);
    
 // 산출합계 삭제
	public void DeleteCalSumInfo(String adminNo, String Cal_Sum_Seq, String Year);
	
	// 산출 삭제
	public void DeleteCalculatioInfo(String adminNo, String Seq, String Year);
	
	// 산출합계 삭제
	public void DeleteTaxationInfo(String adminNo, String Cal_Sum_Seq, String Year);
	
	// 산출식들 구하기
	public List getFormAdjust(String adminNo, String calSumSeq);
	
	// 점용 조회 개수
	public int getCountCalculationInfo(String adminNo, String cal_sum_seq);
	
	// 점용목적 구하기
	public String getPurposeCd(String adminNo);
	
	// 삭제시 admin_base check_yn 변화
	public void updateAdminBaseCheckYN(String adminNo);
	
	// 점용구분 가져오기
	public String getUseType(String adminNo);
	
	// 감면율, 지분율 구하기 
	public Map getReduction(String adminNo);
	
	// 인접지 평균공시지가 위한 기본정보 구하기
	public Map getWithAddrInfo(String adminNo);
	
	// 산출합계중 max year 가져오기
	public String getMaxYear(String adminNo,String cal_sum_seq);
	
	// 산출 초기데이터 구하기
	public initCalBean getInitCalData(String adminNo);
	
	// 공시지가 주소리스트 불러오기
	public List getPriceList(String adminNo, String year);
		
}