//	2009		Kim Yun Seo

package main.java.gapan.jumyonginfo.dao;


import java.util.List;
import java.util.Map;

import main.java.common.dao.RoadsJdbcDaoSupport;
import main.java.gapan.gapan.dao.GapanMapDao;
import main.java.gapan.jumyonginfo.model.GapanInfoBean;
import main.java.gapan.jumyonginfo.model.AppealBean;
import main.java.gapan.jumyonginfo.model.GapanHeadBean;
import main.java.gapan.jumyonginfo.model.MinwonBean;
import main.java.gapan.jumyonginfo.model.PlaceBean;
import main.java.jumyong.oldminwon.dao.MinwonMapDao;


public class JumyonginfoDao	extends RoadsJdbcDaoSupport	implements	IJumyonginfoDao
{
	private	JumyonginfoMapDao	jumyonginfoMapDao	= new JumyonginfoMapDao();
	
	
    protected	void	initDao()  throws Exception
    {
		super.initDao();
   	}
    
 
    
    //	민원정보 보기
    public	List	executeMinwon_View(String strAdmin_no)
	{
    	JumyonginfoMapDao.Minwon_View	minwon_View	= jumyonginfoMapDao.new Minwon_View(getDataSource(), getMessageSourceAccessor());
    	
    	Object[] values = { strAdmin_no	};
    	
    	return minwon_View.execute(values);
	}
    public	List	executeMinwon_View_Search(String strAdmin_no, String strSeq)
    {
    	JumyonginfoMapDao.Minwon_View_Search		minwon_View	= jumyonginfoMapDao.new Minwon_View_Search(getDataSource(), getMessageSourceAccessor());
    	
    	Object[] values = {strAdmin_no, strSeq};
    	
    	return minwon_View.execute(values);
    }
    //	민원정보 등록
    public	boolean	executeMinwon_Modify(MinwonBean Bean)
	{
    	JumyonginfoMapDao.Minwon_Modify	minwon_Modify	= jumyonginfoMapDao.new Minwon_Modify(getDataSource(), getMessageSourceAccessor());
    	
		try
		{
			Object[] values = {
					Bean.getREQ_DATE_MIN(),
					Bean.getREQ_NM_MIN(),
					Bean.getMANAGER_MIN(),
					Bean.getGUBUN_MIN(),
					Bean.getAGENT_NM_MIN(),
					
					Bean.getAGENT_TEL_MIN(),
					Bean.getREQ_DEP_MIN(),
					Bean.getMANAGE_DEP_MIN(),
					Bean.getNOTES_MIN(),
					Bean.getPREDATE_MIN(),
					
					Bean.getSSN_MIN(),
					Bean.getNAME_MIN(),
					Bean.getTEL_MIN(),
					Bean.getHP_MIN(),
					Bean.getADDR1_MIN(),
					
					Bean.getADDR2_MIN(),
					Bean.getPOST_MIN(),
					Bean.getREQ_NO_MIN(),
					Bean.getADMIN_NO_MIN(),
					Bean.getSEQ_MIN()
					
			};

			minwon_Modify.update(values);
		}
		catch (Exception e)
		{
			e.printStackTrace();
			return	false;
		}
		
		return	true;
    }
    
    //	민원정보 추가
    public	boolean	executeMinwon_Register(MinwonBean Bean)
	{
    	JumyonginfoMapDao.Minwon_Register	minwoninfo_Register	= jumyonginfoMapDao.new Minwon_Register(getDataSource(), getMessageSourceAccessor());
    	
		try
		{
			Object[] values = {
					Bean.getADMIN_NO_MIN(),
					Bean.getREQ_NO_MIN(),
					Bean.getREQ_DATE_MIN(),
					Bean.getREQ_NM_MIN(),
					Bean.getMANAGER_MIN(),
					Bean.getGUBUN_MIN(),
					Bean.getAGENT_NM_MIN(),
					Bean.getAGENT_TEL_MIN(),
					Bean.getEVENT_SET_MIN(),
					Bean.getREQ_SET_MIN(),
					
					Bean.getREQ_SIGU_MIN(),
					Bean.getREQ_DEP_MIN(),
					Bean.getREQ_SET_CN_MIN(),
					Bean.getBIZSSN_MIN(),
					Bean.getMANAGE_DEP_MIN(),
					Bean.getNOTES_MIN(),
					Bean.getPREDATE_MIN(),
					Bean.getSSN_MIN(),
					Bean.getNAME_MIN(),
					Bean.getTEL_MIN(),
					
					Bean.getHP_MIN(),
					Bean.getADDR1_MIN(),
					Bean.getADDR2_MIN(),
					Bean.getPOST_MIN(),
					Bean.getREAL_DEAL_DATE_MIN(),
					Bean.getMW_PROG_SE_MIN(),
					Bean.getEMAIL_MIN()
			};

			minwoninfo_Register.update(values);
		}
		catch (Exception e)
		{
			e.printStackTrace();
			return	false;
		}
		
		return	true;
	}
		
    //	민원정보 등록
    public	boolean	executeUnyong_Gapan_Head_Modify(GapanHeadBean Bean)
	{
    	JumyonginfoMapDao.Unyong_Gapan_Head_Modify	unyong_Gapan_Head_Modify	= jumyonginfoMapDao.new Unyong_Gapan_Head_Modify(getDataSource(), getMessageSourceAccessor());
    	JumyonginfoMapDao.Up_date_modify	up_date_modify	= jumyonginfoMapDao.new Up_date_modify(getDataSource(), getMessageSourceAccessor());
    	
		try
		{
			Object[] values = {
					Bean.getOWNER_NAME(),
					Bean.getOWNER_IDCHK(),
					Bean.getOWNER_SSN(),
					Bean.getOWNER_IMG_NAME(),
					Bean.getOWNER_GENDER(),

					Bean.getOWNER_AGE(),
					Bean.getOWNER_TEL(),
					Bean.getOWNER_HP(),
					Bean.getADDR_CHECK1(),
					Bean.getOWNER_POST(),

					Bean.getOWNER_TOPOST(),
					Bean.getOWNER_ADDR1(),
					Bean.getOWNER_SAN(),
					Bean.getOWNER_JIBUN(),
					Bean.getOWNER_ADDR2(),

					Bean.getOWNER_TOADDR1(),
					Bean.getOWNER_TOSAN(),
					Bean.getOWNER_TOJIBUN(),
					Bean.getOWNER_TOADDR2(),
					Bean.getLC_SEL(),

					Bean.getLC_TXT(),
					Bean.getRT_SEL(),
					Bean.getRT_TXT(),
					Bean.getESTATE_MOVE(),
					Bean.getESTATE_REAL(),
					
					Bean.getSI(),
					Bean.getGUN(),
					Bean.getDORO_NM(),
					Bean.getBD_BON(),
					Bean.getBD_BU(),
					Bean.getBD_NM(),
					Bean.getBD_DET_NM(),

					Bean.getTOSI(),
					Bean.getTOGUN(),
					Bean.getTODORO_NM(),
					Bean.getTOBD_BON(),
					Bean.getTOBD_BU(),
					Bean.getTOBD_NM(),
					Bean.getTOBD_DET_NM(),
					
					Bean.getNOTE(),
					//********** BEGIN_현진_20120330
					Bean.getDONG(),
					Bean.getRI(),
					Bean.getBON(),
					Bean.getBU(),
					Bean.getTDONG(),
					Bean.getT_RI(),
					Bean.getTBON(),
					Bean.getTBU(),
					//********** END_현진_20120330
					Bean.getGAPAN_NO(),
					"001"
			};
			
			unyong_Gapan_Head_Modify.update(values);

			Object[] value2 = {
					Bean.getGAPAN_NO(),
					"001"
			};
			up_date_modify.update(value2);
			
		}
		catch (Exception e)
		{
			e.printStackTrace();
			return	false;
		}
		
		return	true;
    }
    
    //	점용인정보 보기
    public	List	executeJumin_View(String admin_no)
	{

    	JumyonginfoMapDao.Jumin_View	jumin_View	= jumyonginfoMapDao.new Jumin_View(getDataSource(), getMessageSourceAccessor());
    	
    	Object[] values = {admin_no};
    	
    	return jumin_View.execute(values);
	}
    
    //	점용인 정보 수정
    public	boolean	executeJumin_Gapan_Head_Modify(GapanHeadBean Bean)
	{
    	JumyonginfoMapDao.Jumin_Gapan_Head_Modify	jumin_Gapan_Head_Modify	= jumyonginfoMapDao.new Jumin_Gapan_Head_Modify(getDataSource(), getMessageSourceAccessor());
		
    	try
		{
			Object[] values = {
					Bean.getPARTN_NAME(),
					Bean.getPARTN_IMG_NAME(),
					Bean.getPT_SEL(),
					Bean.getPARTN_SSN(),
					Bean.getPARTN_GENDER(),
					
					Bean.getPARTN_AGE(),
					Bean.getPARTN_TEL(),					
					Bean.getPARTN_HP(),
					Bean.getADDR_CHECK2(),
					Bean.getPARTN_POST(),
					
					Bean.getPARTN_TOPOST(),
					Bean.getPARTN_ADDR1(),
					Bean.getPARTN_SAN(),
					Bean.getPARTN_JIBUN(),
					Bean.getPARTN_ADDR2(),

					Bean.getPARTN_TOADDR1(),
					Bean.getPARTN_TOSAN(),
					Bean.getPARTN_TOJIBUN(),
					Bean.getPARTN_TOADDR2(),
					
					// hoban : 도로명주소를 위한 추가 컬럼					
					Bean.getPSI(),
					Bean.getPGUN(),
					Bean.getP_DORO_NM(),
					Bean.getP_BD_BON(),
					Bean.getP_BD_BU(),
					Bean.getP_BD_NM(),
					Bean.getP_BD_DET_NM(),

					Bean.getPTSI(),
					Bean.getPTGUN(),
					Bean.getPTDORO_NM(),
					Bean.getPTBD_BON(),
					Bean.getPTBD_BU(),
					Bean.getPTBD_NM(),
					Bean.getPTBD_DET_NM(),
					
					//********** BEGIN_현진_20120330
					Bean.getPDONG(),
					Bean.getPRI(),
					Bean.getPBON(),
					Bean.getPBU(),
					Bean.getPTDONG(),
					Bean.getPTRI(),
					Bean.getPTBON(),
					Bean.getPTBU(),
					//********** END_현진_20120330
					Bean.getGAPAN_NO(),
					"001"
			};

			jumin_Gapan_Head_Modify.update(values);
		}
		catch (Exception e)
		{
			e.printStackTrace();
			return	false;
		}
		
		return	true;
    }    
    
  //	점용지정보 보기
  public	List	executeJumji_View(String gapanno)
	{
	  	JumyonginfoMapDao.Jumji_View	jumji_View	= jumyonginfoMapDao.new Jumji_View(getDataSource(), getMessageSourceAccessor());
	  	Object[] values = {gapanno};
	  	
	  	return jumji_View.execute(values);
	}
    
    //	점용지정보  수정
    public	boolean	executeJumji_Modify(GapanInfoBean Bean)
	{
    	JumyonginfoMapDao.Jumji_Modify	jumji_Modify	= jumyonginfoMapDao.new Jumji_Modify(getDataSource(), getMessageSourceAccessor());
    	JumyonginfoMapDao.Up_date_modify	up_date_modify	= jumyonginfoMapDao.new Up_date_modify(getDataSource(), getMessageSourceAccessor());
		try
		{
		
			Object[] values = {
					Bean.getX_COORD(),
					Bean.getY_COORD(),
					"001",
					Bean.getPURPOSE_CD(),
					Bean.getWITH_PNU(),

					Bean.getWITH_ADDR(),
					Bean.getSHOP_IMG_NAME(),
					Bean.getWITH_INFO(),
					Bean.getROAD_INFO(),
					Bean.getAR_SEL(),

					Bean.getAR_TXT(),
					Bean.getFOUND_DATE(),
					Bean.getUC_SEL(),
					Bean.getUC_TXT(),
					Bean.getFT_TYP(),

					Bean.getFT_SEL(),
					Bean.getFACIL_L(),
					Bean.getFACIL_W(),
					Bean.getFACIL_H(),
					Bean.getPLACE_L(),

					Bean.getPLACE_H(),
					Bean.getPLACE_A(),
					Bean.getDP_SEL(),
					Bean.getDP_TXT(),
					Bean.getSPECIAL_ST(),

					Bean.getMAINTN_OB(),
					Bean.getMT_SEL(),
					Bean.getSG_TYP(),
					Bean.getLIQUOR_SL(),
					Bean.getLPGAS_US(),
					
					Bean.getSG_ITM(),
					Bean.getSG_SEL(),
					Bean.getMEM_NUM(),
					Bean.getOPEN_TIME(),
					Bean.getCLOSE_TIME(),

					Bean.getPERMIT_DATE(),
					Bean.getDAY_SALES(),
					Bean.getUN_TYP(),
					Bean.getUN_TXT(),
					Bean.getNOTES(),

					Bean.getTAXTATION_AT(),
					Bean.getTYPE(),
					Bean.getSECTION(),
					Bean.getOWNER_SET(),
					Bean.getTAX_SET(),
					
					Bean.getMUL_FROMDATE(),
					Bean.getMUL_TODATE(),
					Bean.getHJ_CD(),
					Bean.getSF_VALUE(),
					Bean.getCHANGE_YM(),
					//********** BEGIN_KANG_20120423
					Bean.getFacility_No(),
					//********** END_KANG_20120423
					
					//********** BEGIN_DORO_NM_20140425
					Bean.getWITH_DORO_NM(),
					Bean.getWITH_BD_BON(),
					Bean.getWITH_BD_BU(),
					//********** END_DORO_NM_20140425
					
					Bean.getGAPAN_NO(),
					"001"
					
			};
			jumji_Modify.update(values);

			
			Object[] value2 = {
					Bean.getGAPAN_NO(),
					Bean.getGP_TYP()
			};
			up_date_modify.update(value2);
		}
		catch (Exception e)
		{
			e.printStackTrace();
			return	false;
		}
		
		return	true;
    }
    
    
    
	  public	int		executeJumji_Count(String corp_cd, String gu_code, String request_no)
	  {
	  	Object[] values = {corp_cd, gu_code, request_no};
	  	
	  	String sql = getMessageSourceAccessor().getMessage("Querys.gapan.jumyonginfo.Jumji_Count");
			return 	getJdbcTemplate().queryForInt(sql, values);
	  }
	  
	  
	    //전승원 추가
	    public	String	getObject_No(PlaceBean Bean)
		{
	    	Object[] values = {Bean.getCORP_CD(), Bean.getGU_CODE(), Bean.getREQUEST_NO()};

	    	String sql = getMessageSourceAccessor().getMessage("Querys.gapan.jumyonginfo.getObject_No");
	    	Map Request_Map =getJdbcTemplate().queryForMap(sql, values);
	    	return Request_Map.get("OBJECT_NO").toString();
		}
	    
	    
	    public	List	executeSearch_Depth()
		{
	    	JumyonginfoMapDao.Select_Depth	select_Depth	= jumyonginfoMapDao.new Select_Depth(getDataSource(), getMessageSourceAccessor());
	    	
	    	Object[] values = {};
			
			return select_Depth.execute(values);
	    }
	    
	    
	    // 시설물 규격 얻기
	    
		public	List	executeGetFtSel(String FT_TYP){
			JumyonginfoMapDao.GetFtSelList	FtSelList	= jumyonginfoMapDao.new GetFtSelList(getDataSource(), getMessageSourceAccessor());
			Object[] values = {FT_TYP};

	    	return FtSelList.execute(values);
			
			
			
		}
		
		// 시설물명 얻기
	    
		public	List	executeGetFtTyp(String GP_TYP){
			JumyonginfoMapDao.GetFtTypList	FtTypList	= jumyonginfoMapDao.new GetFtTypList(getDataSource(), getMessageSourceAccessor());
			Object[] values = {GP_TYP};

	    	return FtTypList.execute(values);
			
			
			
		}
}
