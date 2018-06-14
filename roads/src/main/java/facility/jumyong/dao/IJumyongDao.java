/*********************************************************************************************************
 				*�����ۼ��� : 2006.07.12
				*�����ۼ��� : jklee, jhlee
				*�ֿ�ó������ : QA�Խ��� ���� db�۾��� ó��
				*������ :
				*������ :
				*�������� :
 *********************************************************************************************************/

package main.java.facility.jumyong.dao;

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

public interface IJumyongDao {	
    //���� ��ȸ
	public List searhList(String year, String req_nm,String checkYn,int intCurPage, String gu_code );
	//  ���� ��ȸ  ī��Ʈ
	public int getsearhListCount(String year, String req_nm,String checkYn, String gu_code );
	//	���� - ���� ����Ʈ
	public List placeList(String gu_code, String corp_cd, String request_no,int intCurPage);
	public List placeBoardList(String gu_code, String corp_cd, String request_no,int intRn1, int intRn2);
	public List placeBoardListHan(String gu_code,String corp_cd,String admin_no,String tax_set, int Rn1, int Rn2);
	// �ϰ� ���� - ���� ����Ʈ 
	public List placeBoardCalList(String gu_code, String corp_cd, String admin_no);
	//	���� - ���� ����Ʈ ī��Ʈ
	public int placeListCount(String gu_code, String corp_cd, String admin_no);
	
	// ���� - �ü�/������ ���� ����Ʈ ī��Ʈ
	public int placeListTaxCount(String gu_code, String corp_cd, String admin_no, String tax_set);
	//	���� - ���� ����
	public Equip_ProductBean placeInfo(String gu_code, String corp_cd, String request_no,String object_no );
	//	  ����  -EQUIP_CALCULATION �Է�
	public void Equip_CalculationInsert(Equip_ProductBean epb);    
	//  ����  -EQUIP_CAL_SUM_INFO �Է�     	 
	public void Equip_Cal_SumInsertQuery(Equip_ProductBean epb);
	//Equip_CAL_SUM_INFO ������ ������
	public int getEquip_Cal_Sum_Seq();
	//  Equip_CALCULATIONINFO  
	public Equip_ProductBean Equip_CalculationInfo(String gu_code, String corp_cd, String object_no, String year );  
	//Equip_CAL_SUM_SEQ
	public int getEquip_Cal_Sum_Seq(String gu_code, String corp_cd, String tax_set, String year, String admin_no);
	//  Equip_CAL_SUM_INFO �߰� ������Ʈ
	public void Equip_Cal_Sum_AddUpdate(Equip_ProductBean epb);
	//Equip_CALCULATION SUM_ADJUST �հ�
	public int Equip_Calculation_Sum_Adjust(String gu_code, String corp_cd, String year,String tax_set,String admin_no );
	//Equip_CAL_SUM LIST
	public List Equip_Cal_SumList(String gu_code, String corp_cd, String year, String admin_no);
	//Equip_CAL_SUM_INFO �߰� ������Ʈ
	public void Equip_CalculationUpdate(Equip_ProductBean epb);
	//�ΰ� ���� ������
	public int getProductTax_ynByYear(String gu_code, String corp_cd,String admin_no, String object_no, String year );
	//�ΰ� ���� ������
	public Map getSubtractedProduct(String gu_code, String corp_cd,String request_no, String object_no, String year );
	//quantity 
	public int getQuantity(String gu_code, String corp_cd,String admin_no,String object_no );


	//����  -EQUIP_CALCULATION �Է�
	public void Equip_AdminBase_CheckYn(Equip_ProductBean epb);
	
	//equip_place �⵵ �߰� ������Ʈ
	public void Equip_PlaceUpdate(Equip_ProductBean epb);
	
	public void Equip_CalculationUpdateHan(Equip_ProductBean epb);
	
	public int getEquip_Cal_Sum_Seq_Han(String gu_code, String corp_cd, String tax_set, String year);
	
	public int Equip_Calculation_Sum_AdjustHan(String gu_code, String corp_cd, String tax_set,String year, String admin_no);
	
	public int Euip_CalculationCount(String gu_code,String corp_cd,String year, String admin_no);
	
	public Equip_ProductBean getCalMinMaxDate(String gu_code, String corp_cd, String year, String admin_no);
	// getCalsumSeq �� ��������
	public Equip_ProductBean Equip_GetCalSumSeq(String gu_code, String corp_cd, String admin_no, String year );
}