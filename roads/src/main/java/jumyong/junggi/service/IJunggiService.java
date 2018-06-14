/*********************************************************************************************************
 				*최초작성일 : 2006.07.12
				*최초작성자 : jklee, jhlee
				*주요처리내용 : Q&A게시판 관련 db작업을 처리
				*수정일 :
				*수정자 :
				*수정내용 :
 *********************************************************************************************************/

package main.java.jumyong.junggi.service;

import java.util.List;
import java.util.Map;

import main.java.jumyong.jumyong.model.ProductBean;
import main.java.jumyong.saewe.model.TaxationBean;
import main.java.jumyong.jumyong.model.SearchBean;
import main.java.jumyong.jumyonginfo.model.TotalWIthBean;

public interface IJunggiService{	
//정기분 조회 리스트    
	public List junggiSearchList(String sigu_cd, String year,String type,String tax_set,String tax_yn,String mul_fromdate,String mul_todate,String purpose,String bj_cd ,String hj_cd
    		,String jumyongName, String cal_status, String SECTION,int currentPage,int countPerPage, String gubun);
//  정기분 조회 리스트   카운트
    public int getJunggiSearchListCount(String sigu_cd, String year,String type,String tax_set,String tax_yn,String mul_fromdate,String mul_todate,String purpose,String bj_cd, String hj_cd, String jumyongName, String cal_status, String SECTION);
//  부과정보 리스트 
    public List impositionList(String adminNo,String strYear,int currentPage,int countPerPage,String use_section, String seq );
//  부과정보 리스트 카운트	
	public int getProductListCount(String adminNo);
//  부과정보 - 년도별 
    public ProductBean impositionInfo(String seq);
//  작년도 점용료 가져오기
    public Map getSum_LastYear(String adminNo,String strYear);
//  부과정보 리스트  카운트
    public int getProductSeq(String adminNo,String strYear);
//  부과정보 가장 나중 입력된 YEAR
    public String getLastYear(String adminNo);
//  부과 미부과 여부
    public String getTaxYn(String seq);   
//   부과정보 - 년도별 합계 
    public List impositionSumListByYear(String adminNo,int currentPage,int countPerPage);
//  부과정보 - 년도별 합계 카운트
    public int getImpositionSumListByYearCount(String adminNo);
//  부과정보 - 면적 합계-정기분 
    public float getProductAreaSum(String seq);    
//	정기분 선택 리스트		
    public List Productjunggi_addList(String admin_no, String year);    
//  산출_부과 테이블 SEQ 얻기
    public int getCal_tax_seq(String adminNo,String strYear);
//  부과정보 - 년도별 합계 리스트 
    public List cal_sum_infoList(String adminNo, String year,int currentPage,int countPerPage); 
	 //    부과정보 - 년도별 합계 리스트 카운트 
    public int getcal_sum_infoListCount(String adminNo, String year);
//  부과정보 리스트 
    public List ImpositionInfoByCalSumList(String cal_sum_seq,int currentPage,int countPerPage);
//	CAL_SUM_INFO 테이블 면적 추가 업데이트		 
    public int CalSumAddUpdate(ProductBean objProductBean);
//	CAL_SUM_INFO 테이블 면적 추가 업데이트		 
    public int CalSumReductionUpdate(ProductBean objProductBean);
//	SUM_ADJUST, AREA_AFTER 합계 SUM_SEQ별
    public ProductBean SumBysumSeq(String seq);  
//	reduction정보
    public ProductBean GetReductionInfo(String seq,String adminNo);
//  정기분 해당연도 같은 first_seq당 개수
    public int GetCountSameCal(String seq,String year);    
//	CalculationTempUpdateQuery
    public void CalculationTempInsert(ProductBean pb);
//  getCal_sum_seq
    public int GetCal_sum_seq(String admin_no,String year);    
//  cal_sum_exist
    public int cal_sum_exist(String admin_no,String year,String fromdate,String todate);
//  junggi getUseSection     
    public int getUseSection(String seq);
    
    
    // 2009.8.7 추가 taxation_info insert
    public	boolean	executeBugwa_Register(ProductBean objProductBean);
    //  부과정보 리스트 
    public List ImpositionInfoByCalSumList_multi(String admin_no, String year);
    //  부과정보 - 년도별 
    public ProductBean impositionInfo_tax(String seq, String admin_no, String year);
    //  부과정보 - 면적 합계-정기분 
    public int getProductAreaSum_year(String admin_no, String year);
    // 점용목적코드로 코드명 가져오기
    public String getPurposeNm(String type, String cd);
    public	int	SetCal_Sum_Info_taxseq(String strSeq);
    public boolean updateTaxation_info(ProductBean objProductBean);
    
    public int CalSumReductionUpdate_noPermission(ProductBean objProductBean);
    
 // 공시지가 일괄 적용 count 
    public int getlandPriceAllApllyCount(String sigu_cd, String year,String type,String tax_set,String tax_yn, String purpose,String bj_cd , String hj_cd
    		,String jumyongName, String SECTION);
    // 공시지가 일괄 적용 View
    public List getlandPriceAllAplly(String sigu_cd, String year,String type,String tax_set,String tax_yn,String purpose,String bj_cd ,String hj_cd
    		,String jumyongName, String SECTION, int currentPage,int countPerPage);
  //공시지가 일괄적용 update
    public boolean priceApllyUpdate(SearchBean sb);
    
    //등록된 공시지가 가져오기
    public int getNowPrice(String admin_no, String year);
    
    public	boolean	CalSumUpdate(ProductBean objProductBean);
    
    // 인접지 공시지가 xml 구하기
    public List executeTotal_With(String admin_no);
    
    //인접지 목록 지우기
    public void executeDelete_With(String adminNo);
    //인접지 정보 등록하기
    public void executeRegister_With(TotalWIthBean bean);
    
	//place에 with_sum_price 업데이트
	public void updateWith_Sum_Addr(String adminNo, String price,String WITH_ADDR1,String WITH_ADDR2);
	
}