
package main.java.gapan.saewe.dao;

import java.util.List;
import java.util.Map;

import main.java.common.dao.RoadsJdbcDaoSupport;
import main.java.gapan.saewe.dao.SaeweMapDao;
import main.java.gapan.saewe.model.BugwaSearchBean;
import main.java.gapan.saewe.model.TaxationBean;


public class SaeweDao	extends RoadsJdbcDaoSupport	implements	ISaeweDao{
	
	private	SaeweMapDao	saeweMap	= new SaeweMapDao();
	
	
    protected	void	initDao()  throws Exception
    {
		super.initDao();
   	}
    
    //	�˻�
    public	List	executeSearch(BugwaSearchBean Bean)
	{
    	SaeweMapDao.Search	search	= saeweMap.new Search(getDataSource(), getMessageSourceAccessor());
    	
    
    	if(Bean.getUSE_SECTION().equals("")	||	Bean.getUSE_SECTION() == null)
    		Bean.setUSE_SECTION("%");
    	if(Bean.getTYPE().equals("")	||	Bean.getTYPE() == null)
    		Bean.setTYPE("%");
    	if(Bean.getSECTION().equals("")	||	Bean.getSECTION() == null)
    		Bean.setSECTION("%");
    	if(Bean.getTAX_SET().equals("")	||	Bean.getTAX_SET() == null)
    		Bean.setTAX_SET("%");
    	//********** BEGIN_KANG_20120404
    	if(Bean.getSUNAP_YN().equals("")	||	Bean.getSUNAP_YN() == null)
    		Bean.setSUNAP_YN("%");
    	//********** END_KANG_20120404
    	if(Bean.getBJ_CD().equals("")	||	Bean.getBJ_CD() == null)
    		Bean.setBJ_CD("%");
    	if(Bean.getHJ_CD().equals("")	||	Bean.getHJ_CD() == null)
    		Bean.setHJ_CD("%");
    	if(Bean.getTAX_YN().equals("")	||	Bean.getTAX_YN() == null)
    		Bean.setTAX_YN("%");
    	if(Bean.getFT_TYP().equals("")	||	Bean.getFT_TYP() == null)
    		Bean.setFT_TYP("%");
    	
    	if(Bean.getBONBUN().equals("")	||	Bean.getBONBUN() == null)
    		Bean.setBONBUN("%");
    	if(Bean.getBUBUN().equals("")	||	Bean.getBUBUN() == null)
    		Bean.setBUBUN("%");
    	
    	if(Bean.getCAL_MODE().equals("") || Bean.getCAL_MODE() == null){
    		Bean.setCAL_MODE("%");
    	}
    	
    	Object[] values = {
    			Bean.getYEAR(),
    			Bean.getGIGAN1(),
    			Bean.getGIGAN2(),
    			Bean.getTAX_SET(),
    			Bean.getTAX_YN(),
    			//********** BEGIN_KANG_20120404
    			Bean.getSUNAP_YN(),
    			//********** END_KANG_20120404    			
    			Bean.getFT_TYP(),
    			Bean.getBJ_CD(),
    			Bean.getHJ_CD(),
    			Bean.getBONBUN(),
    			Bean.getBUBUN(),
    			
    			"%" + Bean.getNAME() + "%",
    			"%" + Bean.getADMINNO() + "%",
    			Bean.getCAL_MODE(),
    			Bean.getSIGUNGU()
    	};
    	
    	
    	System.out.println("Bean.getSIDO() ==> " + Bean.getSIDO());
    	System.out.println("Bean.getSIGUNGU() ==> " + Bean.getSIGUNGU());
    	return search.execute(values);
	}
    
    //	��ü �Ǽ�
    public	int		executeCount(BugwaSearchBean Bean)
	{
      	if(Bean.getUSE_SECTION().equals("")	||	Bean.getUSE_SECTION() == null)
    		Bean.setUSE_SECTION("%");
    	if(Bean.getTYPE().equals("")	||	Bean.getTYPE() == null)
    		Bean.setTYPE("%");
    	if(Bean.getSECTION().equals("")	||	Bean.getSECTION() == null)
    		Bean.setSECTION("%");
    	if(Bean.getTAX_SET().equals("")	||	Bean.getTAX_SET() == null)
    		Bean.setTAX_SET("%");
    	//********** BEGIN_KANG_20120404
    	if(Bean.getSUNAP_YN().equals("")	||	Bean.getSUNAP_YN() == null)
    		Bean.setSUNAP_YN("%");
    	//********** END_KANG_20120404
    	if(Bean.getBJ_CD().equals("")	||	Bean.getBJ_CD() == null)
    		Bean.setBJ_CD("%");
    	if(Bean.getHJ_CD().equals("")	||	Bean.getHJ_CD() == null)
    		Bean.setHJ_CD("%");
    	if(Bean.getTAX_YN().equals("")	||	Bean.getTAX_YN() == null)
    		Bean.setTAX_YN("%");
    	if(Bean.getFT_TYP().equals("")	||	Bean.getFT_TYP() == null)
    		Bean.setFT_TYP("%");
    	
    	if(Bean.getBONBUN().equals("")	||	Bean.getBONBUN() == null)
    		Bean.setBONBUN("%");
    	if(Bean.getBUBUN().equals("")	||	Bean.getBUBUN() == null)
    		Bean.setBUBUN("%");
    	
    	if(Bean.getCAL_MODE().equals("") || Bean.getCAL_MODE() == null){
    		Bean.setCAL_MODE("%");
    	}
    	
    	Object[] values = {
    			Bean.getYEAR(),
    			Bean.getGIGAN1(),
    			Bean.getGIGAN2(),
    			Bean.getTAX_SET(),
    			Bean.getTAX_YN(),
    			//********** BEGIN_KANG_20120404
    			Bean.getSUNAP_YN(),
    			//********** END_KANG_20120404   
    			Bean.getFT_TYP(),
    			Bean.getBJ_CD(),
    			Bean.getHJ_CD(),
    			Bean.getBONBUN(),
    			Bean.getBUBUN(),
    			
    			"%" + Bean.getNAME() + "%",
    			"%" + Bean.getADMINNO() + "%",
    			Bean.getCAL_MODE(),
    			Bean.getSIGUNGU()
    	};
    	
    	for(int i =0;i<values.length;i++){
    		System.out.println("executeCount :::" + values[i]);
    	}
    	
		String sql = getMessageSourceAccessor().getMessage("Querys.gapan.saewe.Count");
	
		return 	getJdbcTemplate().queryForInt(sql, values);
	}
    
    //	�ϰ��ΰ������� �ΰ�������ȸ
    public	List	executeSearch_Ilgwal(BugwaSearchBean Bean)
	{
SaeweMapDao.Search_Ilgwal	searchIlgwal = saeweMap.new Search_Ilgwal(getDataSource(), getMessageSourceAccessor());
    	
    	
    	/*if(Bean.getUSE_SECTION().equals("")	||	Bean.getUSE_SECTION() == null)
    		Bean.setUSE_SECTION("%");
    	if(Bean.getTYPE().equals("")	||	Bean.getTYPE() == null)
    		Bean.setTYPE("%");
    	if(Bean.getSECTION().equals("")	||	Bean.getSECTION() == null)
    		Bean.setSECTION("%");
    	if(Bean.getOWNER_SET().equals("")	||	Bean.getOWNER_SET() == null)
    		Bean.setOWNER_SET("%");
    	if(Bean.getTAX_SET().equals("")	||	Bean.getTAX_SET() == null)
    		Bean.setTAX_SET("%");
    	if(Bean.getPURPOSE_CD().equals("000")	||	Bean.getPURPOSE_CD().equals("")	||	Bean.getPURPOSE_CD() == null)
    		PURPOSE_CD	= "%";
    	if(Bean.getBJ_CD().equals("")	||	Bean.getBJ_CD() == null)
    		Bean.setBJ_CD("%");
    	if(Bean.getHJ_CD().equals("")	||	Bean.getHJ_CD() == null)
    		Bean.setHJ_CD("%");
    	if(Bean.getTAX_YN().equals("")	||	Bean.getTAX_YN() == null)
    		Bean.setTAX_YN("%");
    	if(Bean.getREFUND_YN().equals("")	||	Bean.getREFUND_YN() == null)
    		Bean.setREFUND_YN("%");
    	if(Bean.getCAL_YN().equals("")	||	Bean.getCAL_YN() == null)
    		Bean.setCAL_YN("%");*/
    	
    	/*System.out.println(Bean.getADMINNO());
    	System.out.println("�õ� : "+Bean.getSIDO());
    	System.out.println("�ñ��� : "+Bean.getSIGUNGU());
    	System.out.println(Bean.getSEQ());*/
    	
    	
    	Object[] values = {
    			Bean.getADMINNO(),
    			Bean.getSIDO(),
    			Bean.getSIGUNGU(),
    			Bean.getSEQ()
    	};
    	
    	for(int i =0;i<values.length;i++){
    		System.out.println("executeSearch_Ilgwal :::" + values[i]);
    	}

    	return searchIlgwal.execute(values);
	} 
    
    //	���⳻�� �˻�
    public	List	executeSanchulSearch(String strAdmin_no, String strSeq)
	{
    	SaeweMapDao.SanchulSearch	sanchulSearch	= saeweMap.new SanchulSearch(getDataSource(), getMessageSourceAccessor());
    	
    	Object[] values = {
    		strAdmin_no,
    		strSeq,
    	};
    	
    	for(int i = 0;i<values.length;i++){
    		System.out.println(" : executeSanchulSearch : "+values[i]);
    	}
    	
    	return sanchulSearch.execute(values);
	}
    
    //	���⳻�� ��ü �Ǽ�
    public	int		executeSanchulCount(String strAdmin_no, String strSeq)
	{
    	Object[] values = {
    			strAdmin_no,
    			strSeq
            };
    	
    	
    	for(int i = 0;i<values.length;i++){
    		System.out.println(" : executeSanchulCount : "+values[i]);
    	}
    	
		String sql = getMessageSourceAccessor().getMessage("Querys.gapan.saewe.SanchulCount");
		return 	getJdbcTemplate().queryForInt(sql, values);
	}
    
    //	�������� �ڼ��� ����
    public	List	executeSanchulInfo_View(String strAdmin_no, String strSeq)
	{
    	SaeweMapDao.SanchulInfo_View	sanchulInfo_View	= saeweMap.new SanchulInfo_View(getDataSource(), getMessageSourceAccessor());
    	
    	Object[] values = {
    		strAdmin_no,
    		strSeq
    	};
    	
    	return sanchulInfo_View.execute(values);
	}
    
    //	���������� ����
    public	List	executeJumin_View(String strAdmin_no)
	{
    	SaeweMapDao.Jumin_View	jumin_View	= saeweMap.new Jumin_View(getDataSource(), getMessageSourceAccessor());
    	
    	Object[] values = {strAdmin_no};
    	
    	return jumin_View.execute(values);
	}
    
    //	���������� ����
    public	List	executeJumji_View(String strAdmin_no)
	{
    	SaeweMapDao.Jumji_View	jumji_View	= saeweMap.new Jumji_View(getDataSource(), getMessageSourceAccessor());
    	
    	Object[] values = {strAdmin_no};
    	
    	return jumji_View.execute(values);
	}
    
    //	�ΰ����� �󼼺���
    public	List	executeBugwa_View(String strAdmin_no, String strSeq)
	{
    	SaeweMapDao.Bugwa_View	bugwa_View	= saeweMap.new Bugwa_View(getDataSource(), getMessageSourceAccessor());
    	
    	Object[] values = {
    		strAdmin_no,
    		strSeq
    	};
    	
    	for(int i = 0;i<values.length;i++){
    		System.out.println("executeBugwa_View"+values[i]);
    	}
    	
    	return bugwa_View.execute(values);
	}
    
    
    //	�ΰ����� ����
    public	boolean	executeBugwa_Modify(TaxationBean Bean)
	{
    	SaeweMapDao.Bugwa_Modify	bugwa_Modify	= saeweMap.new Bugwa_Modify(getDataSource(), getMessageSourceAccessor());
    	
		try
		{	
			Object[] values = {
					Bean.getTAX_NO(),
					Bean.getTAX_GUBUN(),
					Bean.getTAX_YM(),
					Bean.getTAX_CD(),
					Bean.getSIGU_CD(),
					Bean.getDEPT_CD(),
					Bean.getTAXPAYER_SET(),
					Bean.getLIVE(),
					Bean.getOBJ_SET(),
					Bean.getBONSE(),
					Bean.getVAT(),
					Bean.getTAX_DATE(),
					Bean.getINTAX(),
					Bean.getINDATE(),
					Bean.getOVERTAX(),
					Bean.getOVERDATE(),
					Bean.getADD_SET(),
					Bean.getADD_YN(),
					Bean.getNOTES(),
					Bean.getLIMIT_SUM(),
					Bean.getLIMIT_CNT(),
					Bean.getRATE(),
					Bean.getRATE_CAUSE(),
					Bean.getSISE(),
					Bean.getGIGUM(),
					Bean.getGUKSE(),
					Bean.getGUSE(),
					
					Bean.getSUBUSEO_CD(),
					Bean.getOCR_SIGU_CD(),
					Bean.getOCR_BUSEO_CD(),	
					
					Bean.getGAPAN_NO(),
					Bean.getSEQ()
			};

			bugwa_Modify.update(values);
		}
		catch (Exception e)
		{
			e.printStackTrace();
			return	false;
		}
		
		return	true;
    }
    
    
    //	�ΰ����� �Է�
    public	boolean	executeBugwa_Register(TaxationBean Bean)
	{
    	SaeweMapDao.Bugwa_Register	bugwa_Register	= saeweMap.new Bugwa_Register(getDataSource(), getMessageSourceAccessor());
    	
		try
		{
			Object[] values = {
					Bean.getADMIN_NO(),
					Bean.getTAX_NO(),
					Bean.getTAX_GUBUN(),
					Bean.getTAX_YM(),
					Bean.getTAX_CD(),
					Bean.getSIGU_CD(),
					Bean.getDEPT_CD(),
					Bean.getTAXPAYER_SET(),
					Bean.getLIVE(),
					Bean.getOBJ_SET(),
					Bean.getBONSE(),
					Bean.getVAT(),
					Bean.getTAX_DATE(),
					Bean.getINTAX(),
					Bean.getINDATE(),
					Bean.getOVERTAX(),
					Bean.getOVERDATE(),
					Bean.getADD_SET(),
					Bean.getADD_YN(),
					Bean.getNOTES(),
					Bean.getLIMIT_SUM(),
					Bean.getLIMIT_CNT(),
					Bean.getRATE(),
					Bean.getRATE_CAUSE(),
					Bean.getYEAR(),
					Bean.getSEQ(),
					Bean.getSISE(),
					Bean.getGIGUM(),
					Bean.getGUKSE(),
					Bean.getGUSE(),
					Bean.getSUBUSEO_CD(),
					Bean.getOCR_SIGU_CD(),
					Bean.getOCR_BUSEO_CD()
				};
			//system.out.println("values="+values);
			bugwa_Register.update(values);
		}
		catch (Exception e)
		{
			e.printStackTrace();
			return	false;
		}
		
		return	true;
    }
    
    
    //	�ΰ������� �ʿ��� ������, ������ ������ �����´�.
    public	List	executeBugwa_DataInfo(String strAdmin_no, String strSeq)
	{
    	SaeweMapDao.Bugwa_DataInfo	bugwa_DataInfo	= saeweMap.new Bugwa_DataInfo(getDataSource(), getMessageSourceAccessor());
    	System.out.println("strAdmin_no -=->" + strAdmin_no);
    	System.out.println("strSeq -=->" + strSeq);
    	Object[] values = {
    		strAdmin_no,
    		strSeq
    	};
    	
    	return bugwa_DataInfo.execute(values);
	}
    

    //	���ܼ��� �ΰ�		-	�ΰ����� ���̺� �ΰ� ���� Ȯ��
    public	List	SaeweSuipBugwa_Check(String strAdmin_no, String strSeq)
	{
    	SaeweMapDao.SaeweSuipBugwa_Check	saeweSuipBugwa_Check	= saeweMap.new SaeweSuipBugwa_Check(getDataSource(), getMessageSourceAccessor());
    	
    	Object[] values = {
    		strAdmin_no,
    		strSeq
    	};
    	
    	return saeweSuipBugwa_Check.execute(values);
	}
    
    
    //	���ܼ��� �ΰ�		-	�ΰ����� ���̺� �ΰ� ���
    public	boolean	SaeweSuipBugwa_Taxation_Info(String strAdmin_no, String strSeq, String InsertKey)
	{
    	SaeweMapDao.SaeweSuipBugwa_Taxation_Info	saeweSuipBugwa_Taxation_Info	= saeweMap.new SaeweSuipBugwa_Taxation_Info(getDataSource(), getMessageSourceAccessor());	
    	
		try
		{
	    	Object[] values = {
	    			InsertKey,
	        		strAdmin_no,
	        		strSeq
	        	};
	    	System.out.println("InsertKey ==>"+InsertKey);
	    	System.out.println("strAdmin_no ==>"+strAdmin_no);
	    	System.out.println("strSeq ==>"+strSeq);
	    	saeweSuipBugwa_Taxation_Info.update(values);
		}
		catch (Exception e)
		{
			e.printStackTrace();
			return	false;
		}
		
		return	true;
	}
    
    
    //	���ܼ��� �ΰ�		-	�������� ���̺� �ΰ� ���
    public	boolean	SaeweSuipBugwa_Admin_Base(String strAdmin_no, String strSeq)
	{
    	SaeweMapDao.SaeweSuipBugwa_Admin_Base	saeweSuipBugwa_Admin_Base	= saeweMap.new SaeweSuipBugwa_Admin_Base(getDataSource(), getMessageSourceAccessor());
    	
		try
		{
	    	Object[] values = {
	        	strAdmin_no	
	    	};

	    	saeweSuipBugwa_Admin_Base.update(values);
		}
		catch (Exception e)
		{
			e.printStackTrace();
			return	false;
		}
		
		return	true;
	}
    
    //	���ܼ��� �ΰ�		-	cal_sum_info tax_seq�� seq�� set
    public	boolean	SetCal_Sum_Info_taxseq(String strSeq)
	{
    	SaeweMapDao.SetCal_Sum_Info_taxseq	SetCal_Sum_Info_taxseq	= saeweMap.new SetCal_Sum_Info_taxseq(getDataSource(), getMessageSourceAccessor());
    	
		try
		{
	    	Object[] values = {
	    			strSeq,
	    			strSeq
	        	};

	    	SetCal_Sum_Info_taxseq.update(values);
		}
		catch (Exception e)
		{
			e.printStackTrace();
			return	false;
		}
		
		return	true;
	}
    
    public	String	executeBugwa_Id(String user_id)
	{
    	Object[] values = {user_id};
  	
    	String sql = getMessageSourceAccessor().getMessage("Querys.gapan.saewe.Bugwa_Id");

		Map Request_Map =  getJdbcTemplate().queryForMap(sql, values);
		return Request_Map.get("INSARANGKEY").toString();
	}
    
    //	�ΰ����� �󼼺���
    public	List	executeBugwa_View_GpTyp(String strAdmin_no, String strSeq)
	{
    	SaeweMapDao.Bugwa_View_GpTyp	bugwa_View	= saeweMap.new Bugwa_View_GpTyp(getDataSource(), getMessageSourceAccessor());
    	
    	Object[] values = {
    		strAdmin_no,
    		strSeq
    	};
    	
    		return bugwa_View.execute(values);
    	}
    
    public	List	executeBugwa_DataInfo_GpTyp(String strAdmin_no, String strSeq)
	{
    	SaeweMapDao.Bugwa_DataInfo_GpTyp	bugwa_DataInfo	= saeweMap.new Bugwa_DataInfo_GpTyp(getDataSource(), getMessageSourceAccessor());
    	System.out.println("GpTyp strAdmin_no -=->" + strAdmin_no);
    	System.out.println("GpTyp strSeq -=->" + strSeq);
    	Object[] values = {
    		strAdmin_no,
    		strSeq
    	};
    	
    	return bugwa_DataInfo.execute(values);
	}
}
