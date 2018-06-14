/*********************************************************************************************************
 				*�����ۼ��� : 2006.07.12
				*�����ۼ��� : jklee, jhlee
				*�ֿ�ó������ : QA�Խ��� ���� db�۾��� ó��
				*������ :
				*������ :
				*�������� :
 *********************************************************************************************************/

package main.java.facility.junggi.dao;

import main.java.facility.jumyong.model.Equip_ProductBean;
import main.java.jumyong.jumyong.model.ConfBean;
import main.java.jumyong.jumyong.model.DisUseBean;
import main.java.jumyong.jumyong.model.InspectBean;
import main.java.jumyong.jumyong.model.PlaceLocationBean;
import main.java.jumyong.jumyong.model.PlaceFileBean;
import main.java.jumyong.jumyong.model.ProductBean;
import main.java.jumyong.jumyong.model.jumregBean;


import java.util.List;
import java.util.Map;

import org.springframework.dao.DataAccessException;

public interface IJunggiDao {	
    //���� ��ȸ
    public List searhList(String office_nm, String gu_code,String year,int intCurPage );
//  ���� ��ȸ  ī��Ʈ
    public int getsearhListCount(String year, String req_nm,String checkYn);
//	���� ���� - cal_sum_infoList
    public List Cal_sumList(String gu_code, String corp_cd, String tax_set, String admin_no, int currentPage,int countPerPage );
//	���� ���� - calculation_list
    public List CalculationList(int seq , String year, String gu_code, String admin_no);    
// 	calculation_info
    public Equip_ProductBean CalculationInfo(String gu_code ,int seq);
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
    public int getcal_sum_exist(String gu_code,String corp_cd, String year , String tax_Set);
//	reduction����
    public Equip_ProductBean GetReductionInfo(String seq);
//	CAL_SUM_INFO �������� ������Ʈ 
    public int CalSumReductionUpdate(Equip_ProductBean objProductBean);    
    
//  2009.8 �߰� start
    public int Cal_sumListCount(String gu_code, String corp_cd, String request_no, String tax_set);
    // ����� �ش翬�� ���� first_seq�� ����
    public int GetCountSameCal(String seq,String year);
    public int getAreaSum(String gu_code, String corp_cd, String year, String tax_set);
    // ���� ���� - calculation_list ����
    public List CalculationList_purpose(int seq );
    //EQUIP ����� ���� ��� �Է�
    public void Equip_Taxation_InfoInsert(Equip_ProductBean epb);
    //EQUIP ����� ����
    public void Equip_Taxation_InfoUpdate(Equip_ProductBean epb);
    public int Equip_Calculation_Sum_Adjust(String gu_code, String corp_cd, String tax_set, String year);
    public void Equip_Cal_Sum_AddUpdate(Equip_ProductBean epb);
//  2009.8 �߰� end
    public int CalculationCount(String gu_code, String corp_cd,String request_no, String year, String object_no);
    public List CalculationLists(String gu_code,String corp_cd,String year,String tax_set,String admin_no);
    public Equip_ProductBean Equip_Prev_Taxation_infoSelect(String seq);
    public int WriteCalSumCount(String gu_code, String corp_cd, String year, String tax_set, String admin_no);
	public int InputTaxationSiseCount(String gu_code, String corp_cd, String year);
	public int InputTaxationGuseCount(String gu_code, String corp_cd, String year);
}