/*********************************************************************************************************
 				*최초작성일 : 2006.07.12
				*최초작성자 : jklee, jhlee
				*주요처리내용 : Q&A게시판 관련 db작업을 처리
				*수정일 :
				*수정자 :
				*수정내용 :
 *********************************************************************************************************/

package main.java.facility.jumyong.service;

import java.util.List;
import java.util.Map;

import main.java.facility.jumyong.dao.IJumyongDao;
import main.java.facility.jumyong.model.Equip_ProductBean;

public class JumyongService implements IJumyongService {
	
	private IJumyongDao objJumyongDao = null;

	public void setJumyongDao_facility(IJumyongDao newJumyongDao) {
	    this.objJumyongDao = newJumyongDao;
	}
	
    //점용 조회
    public List searhList(String year, String req_nm,String checkYn,int intCurPage, String gu_code )
	{		
		return objJumyongDao.searhList(year,req_nm,checkYn,intCurPage, gu_code );
	}
    //  점용 조회  카운트
    public int getsearhListCount(String year, String req_nm,String checkYn, String gu_code )
    {
    	return objJumyongDao.getsearhListCount(year,req_nm,checkYn, gu_code);
    }
//	산출 - 물건 리스트
    public List placeList(String gu_code, String corp_cd, String request_no,int intCurPage )
    {
    	return objJumyongDao.placeList(gu_code,corp_cd,request_no,intCurPage);
    }
//	산출 - 물건 리스트
    public List placeBoardList(String gu_code, String corp_cd, String request_no,int intRn1, int intRn2 )
    {
    	return objJumyongDao.placeBoardList(gu_code,corp_cd,request_no,intRn1, intRn2);
    }
// 산출 - 물건 리스트    
    public List placeBoardListHan(String gu_code,String corp_cd,String admin_no,String tax_set, int Rn1, int Rn2){
    	return objJumyongDao.placeBoardListHan(gu_code, corp_cd, admin_no, tax_set, Rn1, Rn2);
    }
 // 일괄 산출 - 물건 리스트 
	public List placeBoardCalList(String gu_code, String corp_cd, String admin_no){
		return objJumyongDao.placeBoardCalList(gu_code, corp_cd, admin_no);
	}
	
//	산출 - 물건 리스트 카운트
    public int placeListCount(String gu_code, String corp_cd, String admin_no)
    {
    	return objJumyongDao.placeListCount(gu_code,corp_cd,admin_no);
    }

// 산출 - 시세/구세별 물건 리스트 카운트
    public int placeListTaxCount(String gu_code, String corp_cd, String admin_no , String tax_set){
    	return objJumyongDao.placeListTaxCount(gu_code, corp_cd, admin_no, tax_set);
    }
    
    
//	산출 - 물건 정보
    public Equip_ProductBean placeInfo(String gu_code, String corp_cd, String request_no,String object_no )
    {
    	return objJumyongDao.placeInfo(gu_code,corp_cd,request_no,object_no);
    }

//	  산출  -EQUIP_CALCULATION 입력
    public void Equip_CalculationInsert(Equip_ProductBean epb)
    {
    	objJumyongDao.Equip_CalculationInsert(epb);
    }
//  산출  -EQUIP_CAL_SUM_INFO 입력     	 
    public void Equip_Cal_SumInsertQuery(Equip_ProductBean epb)
    {
    	objJumyongDao.Equip_Cal_SumInsertQuery(epb);
    }
//  Equip_CAL_SUM_INFO 시퀀스 증가값
    public int getEquip_Cal_Sum_Seq()
    {
    	return objJumyongDao.getEquip_Cal_Sum_Seq();
    }
//	  Equip_CALCULATIONINFO
    public Equip_ProductBean Equip_CalculationInfo(String gu_code, String corp_cd, String object_no, String year )
    {
    	return objJumyongDao.Equip_CalculationInfo(gu_code,corp_cd,object_no,year);
    }
//  Equip_CAL_SUM_SEQ
    public int getEquip_Cal_Sum_Seq(String gu_code, String corp_cd, String tax_set, String year, String admin_no )
    {
    	return objJumyongDao.getEquip_Cal_Sum_Seq(gu_code,corp_cd,tax_set, year, admin_no);
    }
    
//  Equip_CAL_SUM_INFO 추가 업데이트
    public void Equip_Cal_Sum_AddUpdate(Equip_ProductBean epb)
    {
    	objJumyongDao.Equip_Cal_Sum_AddUpdate(epb);
    }

//  Equip_CALCULATION SUM_ADJUST 합계
    public int Equip_Calculation_Sum_Adjust(String gu_code, String corp_cd, String year,String tax_set, String admin_no )
    {
    	return objJumyongDao.Equip_Calculation_Sum_Adjust(gu_code,corp_cd,year,tax_set, admin_no);
    }
    
    
//  Equip_CAL_SUM LIST
    public List Equip_Cal_SumList(String gu_code, String corp_cd, String year, String admin_no)
    {
    	return objJumyongDao.Equip_Cal_SumList( gu_code,  corp_cd,  year , admin_no);
    }

//	  Equip_CAL_SUM_INFO 추가 업데이트
    public void Equip_CalculationUpdate(Equip_ProductBean epb)
    {
    	objJumyongDao.Equip_CalculationUpdate(epb);
    }
//  부과 여부 연도별
    public int getProductTax_ynByYear(String gu_code, String corp_cd,String admin_no, String object_no, String year )
    {
    	return objJumyongDao.getProductTax_ynByYear( gu_code,  corp_cd, admin_no,  object_no,  year );
    }
//  부과 여부 연도별
    public Map getSubtractedProduct(String gu_code, String corp_cd,String request_no, String object_no, String year )
    {
    	return objJumyongDao.getSubtractedProduct(gu_code,corp_cd,request_no,object_no,year);
    }
//  quantity 
    public int getQuantity(String gu_code, String corp_cd,String admin_no,String object_no)
    {
    	return objJumyongDao.getQuantity(gu_code,corp_cd, admin_no, object_no);
    }
    
    //산출  -EQUIP_CALCULATION 입력
    public void Equip_AdminBase_CheckYn(Equip_ProductBean epb)
    {
    	objJumyongDao.Equip_AdminBase_CheckYn(epb);
    }
    
    //산출  -EQUIP_Place 년도 추가 업데이트
    public void Equip_PlaceUpdate(Equip_ProductBean epb){
    	objJumyongDao.Equip_PlaceUpdate(epb);
    }
    
    public void Equip_CalculationUpdateHan(Equip_ProductBean epb){
    	objJumyongDao.Equip_CalculationUpdateHan(epb);
    }
    
    public int getEquip_Cal_Sum_Seq_Han(String gu_code, String corp_cd, String tax_set, String year){
    	return objJumyongDao.getEquip_Cal_Sum_Seq_Han(gu_code, corp_cd, tax_set, year);
    }
    
    public int Equip_Calculation_Sum_AdjustHan(String gu_code, String corp_cd, String tax_set,String year, String admin_no ){
    	return objJumyongDao.Equip_Calculation_Sum_AdjustHan(gu_code, corp_cd,tax_set, year, admin_no);
    }
    
    public int Euip_CalculationCount(String gu_code,String corp_cd,String year, String admin_no){
    	return objJumyongDao.Euip_CalculationCount(gu_code, corp_cd,year,admin_no);
    }
    
    public Equip_ProductBean getCalMinMaxDate(String gu_code, String corp_cd, String year, String admin_no){
    	return objJumyongDao.getCalMinMaxDate(gu_code, corp_cd, year, admin_no);
    }
    
    public Equip_ProductBean Equip_GetCalSumSeq(String gu_code, String corp_cd, String admin_no, String year ){
    	return objJumyongDao.Equip_GetCalSumSeq(gu_code, corp_cd, admin_no, year);
    }
}