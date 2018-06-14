/*********************************************************************************************************
 				*최초작성일 : 2006.07.12
				*최초작성자 : jklee, jhlee
				*주요처리내용 : Q&A게시판 관련 db작업을 처리
				*수정일 :
				*수정자 :
				*수정내용 :
 *********************************************************************************************************/

package main.java.facility.junggi.service;

import java.util.List;
import java.util.Map;


import main.java.facility.jumyong.model.Equip_ProductBean;
import main.java.facility.junggi.dao.IJunggiDao;
import main.java.jumyong.jumyong.model.ProductBean;

public class JunggiService implements IJunggiService {
	
	private IJunggiDao objJunggiDao = null;

	public void setJunggiDao_facility(IJunggiDao newJunggiDao) {
	    this.objJunggiDao = newJunggiDao;
	}
	
    //점용 조회
    public List searhList(String office_nm, String gu_code,String year,int intCurPage )
	{		
		return objJunggiDao.searhList(office_nm,gu_code,year,intCurPage);
	}
//  점용 조회  카운트
    public int getsearhListCount(String year, String gu_code, String office_nm)
    {
    	return objJunggiDao.getsearhListCount(year, gu_code, office_nm);
    }
//	산출 정보 - cal_sum_infoList
    public List Cal_sumList(String gu_code, String corp_cd, String tax_set, String admin_no, int currentPage,int countPerPage )
    {
    	return objJunggiDao.Cal_sumList(gu_code, corp_cd, tax_set, admin_no, currentPage, countPerPage );
    }
//	산출 정보 - calculation_list
    public List CalculationList(int seq , String year, String gu_code, String admin_no)
    {
    	return objJunggiDao.CalculationList(seq , year, gu_code, admin_no);
    }
// 	calculation_info
    public Equip_ProductBean CalculationInfo(String gu_code, int seq)
    {
    	return objJunggiDao.CalculationInfo(gu_code, seq);
    }
//	EQUIP 정기분 산출 목록 입력//YEAR,FROMDATE,TODATE,UP_DATE,FIRST_SEQ,CAL_SUM_SEQ,GU_CODE,CORP_CD
    public void Equip_CalculationTempInsert(Equip_ProductBean epb)
    {
    	objJunggiDao.Equip_CalculationTempInsert(epb);
    }
//	  GET CALCULATION TAX_SET
    public List Equip_Calculation_TaxSet(String gu_code,String corp_cd)
    {
    	return objJunggiDao.Equip_Calculation_TaxSet(gu_code,corp_cd);
    }
//  junggi Equip_CAL_SUM_SEQ
    public int getEquip_Cal_Sum_Seq(String gu_code, String corp_cd,String tax_set,String year )
    {
    	return objJunggiDao.getEquip_Cal_Sum_Seq(gu_code,corp_cd,tax_set,year);
    }
//  junggi get_last_sum     
    public Map getLastSum(int seq)
    {
    	return objJunggiDao.getLastSum(seq);
    }
//  junggi CALCULATION_UPDATE
    public void Equip_CalculationUpdate(Equip_ProductBean epb)
    {
    	objJunggiDao.Equip_CalculationUpdate(epb);
    }
//  junggi Equip_CAL_SUM_SEQ
    public int getSum_SumAdjust(int seq )
    {
    	return objJunggiDao.getSum_SumAdjust(seq);
    }
//  junggi Equip_CAL_SUM_SEQ
    public int getcal_sum_exist(String gu_code,String corp_cd, String year , String tax_set )
    {
    	return objJunggiDao.getcal_sum_exist(gu_code,corp_cd,year,tax_set);
    }
//	reduction정보
    public Equip_ProductBean GetReductionInfo(String seq)
    {
    	return objJunggiDao.GetReductionInfo(seq);
    }
//	CAL_SUM_INFO 감면정보 업데이트 
    public int CalSumReductionUpdate(Equip_ProductBean objProductBean)
    {
    	return objJunggiDao.CalSumReductionUpdate(objProductBean);
    }
    
    // 2009.8 추가 start
    public int Cal_sumListCount(String gu_code, String corp_cd, String request_no, String tax_set)
    {
    	return objJunggiDao.Cal_sumListCount(gu_code, corp_cd, request_no, tax_set);
    }
    // 정기분 해당연도 같은 first_seq당 개수
    public int GetCountSameCal(String seq,String year)
    {
    	return objJunggiDao.GetCountSameCal(seq,year);
    }
    public int getAreaSum(String gu_code, String corp_cd, String year, String tax_set)
    {
    	return objJunggiDao.getAreaSum(gu_code, corp_cd, year, tax_set);
    }
    //	산출 정보 - calculation_list 수정
    public List CalculationList_purpose(int seq )
    {
    	return objJunggiDao.CalculationList_purpose(seq);
    }
    //EQUIP 정기분 산출 목록 입력
    public void Equip_Taxation_InfoInsert(Equip_ProductBean epb)
    {
    	objJunggiDao.Equip_Taxation_InfoInsert(epb);
    }
    // Equip_Taxation Update
    public void Equip_Taxation_InfoUpdate(Equip_ProductBean epb)
    {
    	objJunggiDao.Equip_Taxation_InfoUpdate(epb);
    }
    public float Equip_Calculation_Sum_Adjust(String gu_code, String corp_cd,String tax_set, String year )
    {
    	return objJunggiDao.Equip_Calculation_Sum_Adjust(gu_code, corp_cd, tax_set, year);
    }
    public void Equip_Cal_Sum_AddUpdate(Equip_ProductBean epb)
    {
    	objJunggiDao.Equip_Cal_Sum_AddUpdate(epb);
    }
    // 2009.8 추가 end
    
    public int CalculationCount(String gu_code, String corp_cd,String request_no, String year, String object_no){
    	return objJunggiDao.CalculationCount(gu_code, corp_cd,request_no, year, object_no);
    }
    public List CalculationLists(String gu_code,String corp_cd,String year,String tax_set, String admin_no){
    	return objJunggiDao.CalculationLists(gu_code,corp_cd,year,tax_set,admin_no);
    }
    public Equip_ProductBean Equip_Prev_Taxation_infoSelect(String seq){
    	return objJunggiDao.Equip_Prev_Taxation_infoSelect(seq);
    }
    public int WriteCalSumCount(String gu_code, String corp_cd, String year, String tax_set, String admin_no){
    	return objJunggiDao.WriteCalSumCount(gu_code, corp_cd, year, tax_set, admin_no);
    }
    public int InputTaxationGuseCount(String gu_code,String corp_cd, String year){
    	return objJunggiDao.InputTaxationGuseCount(gu_code, corp_cd, year);
    }
    public int InputTaxationSiseCount(String gu_code,String corp_cd, String year){
    	return objJunggiDao.InputTaxationSiseCount(gu_code, corp_cd, year);
    }
}