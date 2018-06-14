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
import main.java.jumyong.jumyong.model.ConfBean;
import main.java.jumyong.jumyong.model.DisUseBean;
import main.java.jumyong.jumyong.model.InspectBean;
import main.java.jumyong.jumyong.model.PlaceFileBean;
import main.java.jumyong.jumyong.model.PlaceLocationBean;
import main.java.jumyong.jumyong.model.ProductBean;

public interface IJunggiService{	
    //점용 조회
    public List searhList(String office_nm, String gu_code,String year,int intCurPage );
//  점용 조회  카운트
    public int getsearhListCount(String year, String req_nm,String checkYn);
//	산출 정보 - cal_sum_infoList  - 2009.8.17 수정
    public List Cal_sumList(String gu_code, String corp_cd, String tax_set, String admin_no, int currentPage,int countPerPage );   
//	산출 정보 - calculation_list
    public List CalculationList(int seq , String year, String gu_code, String admin_no);
// 	calculation_info
    public Equip_ProductBean CalculationInfo(String gu_code,int seq);
//	EQUIP 정기분 산출 목록 입력//YEAR,FROMDATE,TODATE,UP_DATE,FIRST_SEQ,CAL_SUM_SEQ,GU_CODE,CORP_CD
    public void Equip_CalculationTempInsert(Equip_ProductBean epb);    
//	  GET CALCULATION TAX_SET
    public List Equip_Calculation_TaxSet(String gu_code,String corp_cd);    
//  junggi Equip_CAL_SUM_SEQ
    public int getEquip_Cal_Sum_Seq(String gu_code, String corp_cd,String tax_set,String year );
//  junggi get_last_sum     
    public Map getLastSum(int seq);
//  junggi CALCULATION_UPDATE
    public void Equip_CalculationUpdate(Equip_ProductBean ep);
//  junggi Equip_CAL_SUM_SEQ
    public int getSum_SumAdjust(int seq );
//  junggi Equip_CAL_SUM_SEQ
    public int getcal_sum_exist(String gu_code,String corp_cd, String year, String tax_set );
//	reduction정보
    public Equip_ProductBean GetReductionInfo(String seq);
//	CAL_SUM_INFO 감면정보 업데이트 
    public int CalSumReductionUpdate(Equip_ProductBean objProductBean);    
    
    // 2009.8 추가 start
    //산출 정보 - cal_sum_infoList Count
    public int Cal_sumListCount(String gu_code, String corp_cd, String request_no, String tax_set);
    public int GetCountSameCal(String seq,String year);
    // 부과정보 - 면적 합계-정기/수시분 
    public int getAreaSum(String gu_code, String corp_cd, String year, String tax_set);
    // calculation 리스트 수정
    public List CalculationList_purpose(int seq );
    // junggi EQUP_TAXATION_INFO insert
    public void Equip_Taxation_InfoInsert(Equip_ProductBean ep);
    // junggi EQUP_TAXATION_INFO update
    public void Equip_Taxation_InfoUpdate(Equip_ProductBean ep);
    public float Equip_Calculation_Sum_Adjust(String gu_code, String corp_cd, String tax_set, String year);
    public void Equip_Cal_Sum_AddUpdate(Equip_ProductBean ep);
    // 2009.8 추가 end
    public int CalculationCount(String gu_code, String corp_cd, String request_no,String year, String object_no);
    public List CalculationLists(String gu_code,String corp_cd,String year,String tax_set, String admin_no);
    public Equip_ProductBean Equip_Prev_Taxation_infoSelect(String seq);
    public int WriteCalSumCount(String gu_code, String corp_cd, String year, String tax_set, String admin_no);
    public int InputTaxationGuseCount(String gu_code,String corp_cd, String year);
    public int InputTaxationSiseCount(String gu_code,String corp_cd, String year);
    
}