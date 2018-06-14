//	2009		Kim Yun Seo

package main.java.sisul.sisul.dao;

import java.util.List;

import main.java.common.dao.RoadsJdbcDaoSupport;
import main.java.sisul.sisul.model.AppealBean;
import main.java.sisul.sisul.model.EqCalculationBean;


public class SisulDao	extends RoadsJdbcDaoSupport	implements	ISisulDao{
	
	private	SisulMapDao	sisulMap	= new SisulMapDao();
	
	
    protected	void	initDao()  throws Exception
    {
		super.initDao();
   	}
    
    //	�˻�
    public	List	executeSearch(int intRn1,int intRn2)
	{
    	SisulMapDao.Search	search	= sisulMap.new Search(getDataSource(), getMessageSourceAccessor());
    	
    	Object[] values = {
        	new Integer(intRn1),
        	new Integer(intRn2)
    	};
    	
    	return search.execute(values);
	}
    
    //	��ü �Ǽ�
    public	int		executeCount()
	{
		String sql = getMessageSourceAccessor().getMessage("Querys.sisul.sisul.Count");
		return 	getJdbcTemplate().queryForInt(sql);
	}
    
    //	���������� ����
    public	List	executeJumin_View(String strAdmin_no)
	{
    	SisulMapDao.Jumin_View	jumin_View	= sisulMap.new Jumin_View(getDataSource(), getMessageSourceAccessor());
    	
    	Object[] values = {strAdmin_no};
    	
    	return jumin_View.execute(values);
	}
    
    //	������ ���� ����
    public	boolean	executeJumin_Modify(AppealBean Bean)
	{
    	SisulMapDao.Jumin_Modify	jumin_Modify	= sisulMap.new Jumin_Modify(getDataSource(), getMessageSourceAccessor());
    	
		try
		{
			Object[] values = {
				Bean.getNAME(),
				Bean.getSSN(),
				Bean.getBIZSSN(),
				Bean.getBIZ_STATUS(),
				Bean.getBIZ_TYPES(),
				Bean.getPOST(),
				Bean.getADDR1(),
				Bean.getADDR2(),
				Bean.getEMAIL(),
				Bean.getTEL(),
				Bean.getHP(),
				Bean.getTOPOST_NM(),
				Bean.getTOPOST(),
				Bean.getTOADDR1(),
				Bean.getTOADDR2(),
				Bean.getTOEMAIL(),
				Bean.getTOTEL(),
				Bean.getTOHP(),
				Bean.getADMIN_NO()
			};

			jumin_Modify.update(values);
		}
		catch (Exception e)
		{
			e.printStackTrace();
			return	false;
		}
		
		return	true;
    }
    
    
    //	�������� �߰�
    public	boolean	executeMulgun_Register(EqCalculationBean Bean)
	{
    	SisulMapDao.Mulgun_Register	mulgun_Register	= sisulMap.new Mulgun_Register(getDataSource(), getMessageSourceAccessor());
    	
		try
		{
			Object[] values = {
				Bean.getADMIN_NO(),
				Bean.getPURPOSE_CD(),
				Bean.getLENGTH(),
				Bean.getRATE(),
				Bean.getSUM_LASTYEAR(),
				Bean.getFROMDATE(),
				Bean.getTODATE(),
				Bean.getSUM_YEAR()
			};

			mulgun_Register.update(values);
		}
		catch (Exception e)
		{
			e.printStackTrace();
			return	false;
		}
		
		return	true;
    }
}
