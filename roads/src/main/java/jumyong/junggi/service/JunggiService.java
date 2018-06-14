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


import main.java.jumyong.junggi.dao.IJunggiDao;
import main.java.jumyong.jumyong.model.ProductBean;
import main.java.jumyong.jumyong.model.SearchBean;
import main.java.jumyong.jumyonginfo.model.TotalWIthBean;

public class JunggiService implements IJunggiService {
	
	private IJunggiDao  objJunggiDao = null;

	public void setJunggiDao(IJunggiDao newJunggiDao) {
	    this.objJunggiDao = newJunggiDao;
	}
	
//	정기분 조회 리스트    
	public List junggiSearchList(String sigu_cd, String year,String type,String tax_set,String tax_yn,String mul_fromdate,String mul_todate,String purpose,String bj_cd , String hj_cd
    		,String jumyongName, String cal_status, String SECTION,int currentPage,int countPerPage, String gubun)
	
	{
		return objJunggiDao.junggiSearchList( sigu_cd, year,  type,  tax_set,  tax_yn,  mul_fromdate, mul_todate, purpose, bj_cd, hj_cd, jumyongName, cal_status, SECTION, currentPage, countPerPage, gubun);
	}
//  정기분 조회 리스트   카운트
    public int getJunggiSearchListCount(String sigu_cd, String year,String type,String tax_set,String tax_yn,String mul_fromdate,String mul_todate,String purpose,String bj_cd ,String hj_cd
    		,String jumyongName , String cal_status, String SECTION)
    {
    	return objJunggiDao.getJunggiSearchListCount(sigu_cd, year,  type,  tax_set,  tax_yn,  mul_fromdate, mul_todate, purpose, bj_cd, hj_cd, jumyongName, cal_status, SECTION);
    }
//  부과정보 리스트 
//  부과정보 리스트 
    public List impositionList(String adminNo,String strYear,int currentPage,int countPerPage,String use_section, String seq )

	{
		return objJunggiDao.impositionList(adminNo,strYear,currentPage,countPerPage,use_section,seq);
	}
//  부과정보 리스트 카운트
	public int getProductListCount(String adminNo)
	{
		return objJunggiDao.getProductListCount(adminNo);
	}

//  부과정보 - 년도별 
    public ProductBean impositionInfo(String seq)
    {
    	ProductBean pb = objJunggiDao.impositionInfo(seq);
    	
    	return pb;
    }
//  작년도 점용료 가져오기
    public Map getSum_LastYear(String adminNo,String strYear)
    {
    	return objJunggiDao.getSum_LastYear(adminNo,strYear);
    }
//  부과정보 리스트  카운트
    public int getProductSeq(String adminNo,String strYear)
    {
    	return objJunggiDao.getProductSeq(adminNo,strYear);
    }
//  부과정보 가장 나중 입력된 YEAR
    public String getLastYear(String adminNo)
    {
    	return objJunggiDao.getLastYear(adminNo);
    }
//  부과 미부과 여부
    public String getTaxYn(String seq)
    {    	
    	return objJunggiDao.getTaxYn(seq);
    }
//  부과정보 - 년도별 합계 
    public List impositionSumListByYear(String adminNo,int currentPage,int countPerPage)
    {
    	return objJunggiDao.impositionSumListByYear(adminNo,currentPage,countPerPage);
    }
//  부과정보 - 년도별 합계 카운트
    public int getImpositionSumListByYearCount(String adminNo)
    {
    	return objJunggiDao.getImpositionSumListByYearCount(adminNo);
    }
//  부과정보 - 면적 합계-정기분 
    public float getProductAreaSum(String seq)
    {
    	return objJunggiDao.getProductAreaSum(seq);
    }
//	정기분 선택 리스트		
    public List Productjunggi_addList(String admin_no, String year)
    {
    	return objJunggiDao.Productjunggi_addList(admin_no,year);
    }
//  산출_부과 테이블 SEQ 얻기
    public int getCal_tax_seq(String adminNo,String strYear)
    {
    	return objJunggiDao.getCal_tax_seq(adminNo,strYear);
    }
//  부과정보 - 년도별 합계 리스트 
    public List cal_sum_infoList(String adminNo, String year,int currentPage,int countPerPage)
    {
    	return objJunggiDao.cal_sum_infoList(adminNo, year,currentPage,countPerPage);
    }
	 //    부과정보 - 년도별 합계 리스트 카운트 
    public int getcal_sum_infoListCount(String adminNo, String year)
    {
    	return objJunggiDao.getcal_sum_infoListCount(adminNo, year);
    }
//  부과정보 리스트 
    public List ImpositionInfoByCalSumList(String cal_sum_seq,int currentPage,int countPerPage)
    {
    	return objJunggiDao.ImpositionInfoByCalSumList(cal_sum_seq,currentPage,countPerPage);    	
    }
//	CAL_SUM_INFO 테이블 면적 추가 업데이트		 
    public int CalSumAddUpdate(ProductBean objProductBean)
    {    	
    	return objJunggiDao.CalSumAddUpdate(objProductBean);
    }
//	CAL_SUM_INFO 테이블 면적 추가 업데이트		 
    public int CalSumReductionUpdate(ProductBean objProductBean)
    {
    	return objJunggiDao.CalSumReductionUpdate(objProductBean);
    }
//	SUM_ADJUST, AREA_AFTER 합계 SUM_SEQ별
    public ProductBean SumBysumSeq(String seq)
    {
    	return objJunggiDao.SumBysumSeq(seq);
    }
//	reduction정보
    public ProductBean GetReductionInfo(String seq,String adminNo)
    {
    	return objJunggiDao.GetReductionInfo(seq,adminNo);
    }
//  정기분 해당연도 같은 first_seq당 개수
    public int GetCountSameCal(String seq,String year)
    {
    	return objJunggiDao.GetCountSameCal(seq,year);
    }
//	CalculationTempUpdateQuery
    public void CalculationTempInsert(ProductBean pb)
    {
    	objJunggiDao.CalculationTempInsert(pb);
    }
    
//  getCal_sum_seq
    public int GetCal_sum_seq(String admin_no,String year)
    {
    	return objJunggiDao.GetCal_sum_seq(admin_no,year);
    }
//  cal_sum_exist
    public int cal_sum_exist(String admin_no,String year,String fromdate,String todate)
    {
    	return objJunggiDao.cal_sum_exist(admin_no,year,fromdate,todate);
    }
//  junggi getUseSection     
    public int getUseSection(String seq)
    {
    	return objJunggiDao.getUseSection(seq);
    }
    
//	2009.8.7추가 taxation_info insert
    public	boolean	executeBugwa_Register(ProductBean objProductBean)
    {
    	return objJunggiDao.executeBugwa_Register(objProductBean);
    }
//  부과정보 리스트 
    public List ImpositionInfoByCalSumList_multi(String admin_no, String year)
    {
    	return objJunggiDao.ImpositionInfoByCalSumList_multi(admin_no, year);    	
    }
//  부과정보 - 년도별 
    public ProductBean impositionInfo_tax(String seq, String admin_no, String year)
    {
    	ProductBean pb = objJunggiDao.impositionInfo_tax(seq, admin_no, year);
    	
    	return pb;
    }
//  부과정보 - 면적 합계-정기분 
    public int getProductAreaSum_year(String admin_no, String year)
    {
    	return objJunggiDao.getProductAreaSum_year(admin_no, year);
    }
//  점용목적코드로 코드명 가져오기
    public String getPurposeNm(String type, String cd)
    {
    	return objJunggiDao.getPurposeNm(type, cd);
    }
    public	int	SetCal_Sum_Info_taxseq(String strSeq)
    {
    	return objJunggiDao.SetCal_Sum_Info_taxseq(strSeq);
    }
    public boolean updateTaxation_info(ProductBean objProductBean)
    {
    	return objJunggiDao.updateTaxation_info(objProductBean);
    }
    
    public int CalSumReductionUpdate_noPermission(ProductBean objProductBean)
    {
    	return objJunggiDao.CalSumReductionUpdate_noPermission(objProductBean);
    }
    
 // 공시지가 일괄 적용 count
    public int getlandPriceAllApllyCount(String sigu_cd, String year,String type,String tax_set,String tax_yn, String purpose,String bj_cd , String hj_cd
    		,String jumyongName, String SECTION)
    {
    	return objJunggiDao.getlandPriceAllApllyCount(sigu_cd, year,  type,  tax_set,  tax_yn, purpose, bj_cd, hj_cd, jumyongName, SECTION);
    }
// 공시지가 일괄 적용    
    public List getlandPriceAllAplly(String sigu_cd, String year,String type,String tax_set,String tax_yn, String purpose,String bj_cd ,String hj_cd
    		,String jumyongName, String SECTION, int currentPage,int countPerPage)
    {
    	return objJunggiDao.getlandPriceAllAplly( sigu_cd, year,  type,  tax_set,  tax_yn, purpose, bj_cd, hj_cd, jumyongName, SECTION, currentPage, countPerPage);
    }
    
 // 공시지가 일괄 적용 update
    public boolean priceApllyUpdate(SearchBean sb)
    {
    	return objJunggiDao.priceApllyUpdate(sb);
    }
  //등록된 공시지가 가져오기
    public int getNowPrice(String admin_no, String year)
    {
    	return objJunggiDao.getNowPrice(admin_no, year);
    }  
    
    public boolean CalSumUpdate(ProductBean objProductBean)
    {
    	return objJunggiDao.CalSumUpdate(objProductBean);
    }
    
    // 인접지 공시지가 xml 구하기
    public List executeTotal_With(String admin_no){
    	return objJunggiDao.executeTotal_With(admin_no);
    }
    
    //인접지 목록 지우기
    public void executeDelete_With(String adminNo){
    	objJunggiDao.executeDelete_With(adminNo);
    }
    //인접지 정보 등록하기
    public void executeRegister_With(TotalWIthBean bean){
    	objJunggiDao.executeRegister_With(bean);
    	
    }
    
	//place에 with_sum_price 업데이트
	public void updateWith_Sum_Addr(String adminNo, String price,String WITH_ADDR1,String WITH_ADDR2)
    {    	
    	objJunggiDao.updateWith_Sum_Addr(adminNo,price,WITH_ADDR1,WITH_ADDR2);
    }
}