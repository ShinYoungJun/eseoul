/*********************************************************************************************************
 				*�����ۼ��� : 2006.07.12
				*�����ۼ��� : jklee, jhlee
				*�ֿ�ó������ : Q&A�Խ��� ���� db�۾��� ó��
				*������ :
				*������ :
				*�������� :
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
    //���� ��ȸ
    public List searhList(String office_nm, String gu_code,String year,int intCurPage );
//  ���� ��ȸ  ī��Ʈ
    public int getsearhListCount(String year, String req_nm,String checkYn);
//	���� ���� - cal_sum_infoList  - 2009.8.17 ����
    public List Cal_sumList(String gu_code, String corp_cd, String tax_set, String admin_no, int currentPage,int countPerPage );   
//	���� ���� - calculation_list
    public List CalculationList(int seq , String year, String gu_code, String admin_no);
// 	calculation_info
    public Equip_ProductBean CalculationInfo(String gu_code,int seq);
//	EQUIP ����� ���� ��� �Է�//YEAR,FROMDATE,TODATE,UP_DATE,FIRST_SEQ,CAL_SUM_SEQ,GU_CODE,CORP_CD
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
//	reduction����
    public Equip_ProductBean GetReductionInfo(String seq);
//	CAL_SUM_INFO �������� ������Ʈ 
    public int CalSumReductionUpdate(Equip_ProductBean objProductBean);    
    
    // 2009.8 �߰� start
    //���� ���� - cal_sum_infoList Count
    public int Cal_sumListCount(String gu_code, String corp_cd, String request_no, String tax_set);
    public int GetCountSameCal(String seq,String year);
    // �ΰ����� - ���� �հ�-����/���ú� 
    public int getAreaSum(String gu_code, String corp_cd, String year, String tax_set);
    // calculation ����Ʈ ����
    public List CalculationList_purpose(int seq );
    // junggi EQUP_TAXATION_INFO insert
    public void Equip_Taxation_InfoInsert(Equip_ProductBean ep);
    // junggi EQUP_TAXATION_INFO update
    public void Equip_Taxation_InfoUpdate(Equip_ProductBean ep);
    public float Equip_Calculation_Sum_Adjust(String gu_code, String corp_cd, String tax_set, String year);
    public void Equip_Cal_Sum_AddUpdate(Equip_ProductBean ep);
    // 2009.8 �߰� end
    public int CalculationCount(String gu_code, String corp_cd, String request_no,String year, String object_no);
    public List CalculationLists(String gu_code,String corp_cd,String year,String tax_set, String admin_no);
    public Equip_ProductBean Equip_Prev_Taxation_infoSelect(String seq);
    public int WriteCalSumCount(String gu_code, String corp_cd, String year, String tax_set, String admin_no);
    public int InputTaxationGuseCount(String gu_code,String corp_cd, String year);
    public int InputTaxationSiseCount(String gu_code,String corp_cd, String year);
    
}