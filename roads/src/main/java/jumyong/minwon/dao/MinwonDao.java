//	2009		Kim Yun Seo

package main.java.jumyong.minwon.dao;

import java.util.List;
import java.util.Map;

import main.java.common.dao.RoadsJdbcDaoSupport;
import main.java.jumyong.minwon.model.Admin_BaseBean;
import main.java.jumyong.minwon.model.AppealBean;
import main.java.jumyong.minwon.model.JumjiSearchBean;
import main.java.jumyong.minwon.model.MinwonBean;
import main.java.jumyong.minwon.model.PlaceBean;
import main.java.jumyong.minwon.model.TotalWIthBean;


public class MinwonDao	extends RoadsJdbcDaoSupport	implements	IMinwonDao
{
	private	MinwonMapDao	minwonMap	= new MinwonMapDao();
	
	
    protected	void	initDao()  throws Exception
    {
		super.initDao();
   	}
    
    //  민원 조회 리스트
    public	List	executeSearch(String strName, int intRn1, int intRn2)
	{
    	MinwonMapDao.Search	search	= minwonMap.new Search(getDataSource(), getMessageSourceAccessor());
    	
    	Object[] values = {
    		"%" + strName + "%",
        	new Integer(intRn1),
        	new Integer(intRn2)
    	};
    	
    	return search.execute(values);
	}
    
    //	전체 건수
    public	int		executeCount(String strName)
	{
    	Object[] values = {
        	"%" + strName + "%",
        };
    	
		String sql = getMessageSourceAccessor().getMessage("Querys.jumyong.minwon.Count");
		return 	getJdbcTemplate().queryForInt(sql, values);
	}
    
    //	ADMIN_BASE 등록
    public	boolean	executeAdmin_Base_Register(Admin_BaseBean Bean)
	{
    	MinwonMapDao.Admin_Base_Register	admin_Base_Register	= minwonMap.new Admin_Base_Register(getDataSource(), getMessageSourceAccessor());
    	
		try
		{
//			System.out.println("START ADMIN BASE ###########################################");
//			System.out.println("Bean.getADMIN_NO() ==>" + Bean.getADMIN_NO());
//			System.out.println("Bean.getREGDATE() ==>" +Bean.getREGDATE() );
//			System.out.println("Bean.getUP_DATE() ==>" + Bean.getUP_DATE());
//			System.out.println("Bean.getMANAGER() ==>" + Bean.getMANAGER());
//			System.out.println("Bean.getFINISH_ID() ==>" + Bean.getFINISH_ID());
//			System.out.println("Bean.getCHECK_YN() ==>" + Bean.getCHECK_YN());
//			System.out.println("END ADMIN BASE ###########################################");
			
			Object[] values = {
				Bean.getADMIN_NO(),
				Bean.getREGDATE(),
				Bean.getUP_DATE(),
				Bean.getMANAGER(),
				Bean.getFINISH_ID(),
				Bean.getCHECK_YN()
			};

			admin_Base_Register.update(values);
		}
		catch (Exception e)
		{
			System.out.println(" ! ERROR : executeAdmin_Base_Register");
			e.printStackTrace();
			return	false;
		}
		
		return	true;
    }
    

    //	민원, 점용인정보 등록
    public	boolean	executeAppeal_Register(AppealBean Bean)
	{
    	MinwonMapDao.Appeal_Register	appeal_Register	= minwonMap.new Appeal_Register(getDataSource(), getMessageSourceAccessor());
    	
		try
		{
			System.out.println("*** MinwonDao.executeAppeal_Register ***");
			//********** BEGIN_현진_20120215
			/*
			 Object[] values = {
				Bean.getADMIN_NO(),
				Bean.getNAME(),
				Bean.getSSN(),
				Bean.getBIZSSN(),
				Bean.getBIZ_STATUS(),

				Bean.getBIZ_TYPES(),
				Bean.getPOST(),
				Bean.getADDR1(),
				Bean.getADDR2(),
				Bean.getTEL(),

				Bean.getHP(),
				Bean.getEMAIL(),
				Bean.getTOPOST(),
				Bean.getTOADDR1(),
				Bean.getTOADDR2(),

				Bean.getTOTEL(),
				Bean.getTOHP(),
				Bean.getADDR_CHECK(),
				Bean.getAPPEAL_REFERENCE(),
				Bean.getTONM(),
				
				Bean.getTOMAIL(),
				Bean.getB_PERMISSION(),
				Bean.getSAN(),
				Bean.getBON(),
				Bean.getBU(),
				
				Bean.getTOSAN(),
				Bean.getTOBON(),
				Bean.getTOBU(),
				
				Bean.getSI(),
				Bean.getGUN(),
				Bean.getDORO_NM(),
				Bean.getBD_NM()
			}; 
			 */
			
			System.out.println("Bean.getADDR_CHECK() : " +Bean.getADDR_CHECK());
			System.out.println("Bean.getADDR1() : " +Bean.getADDR1());
			System.out.println("Bean.getADDR2() : " +Bean.getADDR2());
			System.out.println("Bean.getADMIN_NO() : " +Bean.getADMIN_NO());
			System.out.println("Bean.getB_PERMISSION() : " +Bean.getB_PERMISSION());
			System.out.println("Bean.getBD_BON() : " +Bean.getBD_BON());
			System.out.println("Bean.getBD_BU() : " +Bean.getBD_BU());
			System.out.println("Bean.getBD_DET_NM() : " +Bean.getBD_DET_NM());
			System.out.println("Bean.getBD_NM() : " +Bean.getBD_NM());
			System.out.println("Bean.getBIZ_STATUS() : " +Bean.getBIZ_STATUS());
			System.out.println("Bean.getBIZ_TYPES() : " +Bean.getBIZ_TYPES());
			System.out.println("Bean.getBIZSSN() : " +Bean.getBIZSSN());
			System.out.println("Bean.getBON() : " +Bean.getBON());
			System.out.println("Bean.getBU() : " +Bean.getBU());
			System.out.println("Bean.getDONG() : " +Bean.getDONG());
			System.out.println("Bean.getDORO_NM() : " +Bean.getDORO_NM());
			System.out.println("Bean.getEMAIL() : " +Bean.getEMAIL());
			System.out.println("Bean.getGUN() : " +Bean.getGUN());
			System.out.println("Bean.getHP() : " +Bean.getHP());
			System.out.println("Bean.getNAME() : " +Bean.getNAME());
			System.out.println("Bean.getNOTES() : " +Bean.getNOTES());
			System.out.println("Bean.getPOST() : " +Bean.getPOST());
			System.out.println("Bean.getREFERENCE() : " +Bean.getREFERENCE());
			System.out.println("Bean.getRI() : " +Bean.getRI());
			System.out.println("Bean.getSAN() : " +Bean.getSAN());
			System.out.println("Bean.getSANGSE() : " +Bean.getSANGSE());
			System.out.println("Bean.getSI() : " +Bean.getSI());
			System.out.println("Bean.getSSN() : " +Bean.getSSN());
			System.out.println("Bean.getTEL() : " +Bean.getTEL());
			System.out.println("Bean.getTO_BD_BON() : " +Bean.getTO_BD_BON());
			System.out.println("Bean.getTO_BD_BU() : " +Bean.getTO_BD_BU());
			System.out.println("Bean.getTO_BD_DET_NM() : " +Bean.getTO_BD_DET_NM());
			System.out.println("Bean.getTO_BD_NM() : " +Bean.getTO_BD_NM());
			System.out.println("Bean.getTO_DORO_NM() : " +Bean.getTO_DORO_NM());
			System.out.println("Bean.getTO_RI() : " +Bean.getTO_RI());
			System.out.println("Bean.getTOADDR1() : " +Bean.getTOADDR1());
			System.out.println("Bean.getTOADDR2() : " +Bean.getTOADDR2());
			System.out.println("Bean.getTOBON() : " +Bean.getTOBON());
			System.out.println("Bean.getTOBU() : " +Bean.getTOBU());
			System.out.println("Bean.getTODONG() : " +Bean.getTODONG());
			System.out.println("Bean.getTOGUN() : " +Bean.getTOGUN());
			System.out.println("Bean.getTOHP() : " +Bean.getTOHP());
			System.out.println("Bean.getTOMAIL() : " +Bean.getTOMAIL());
			System.out.println("Bean.getTONM() : " +Bean.getTONM());
			System.out.println("Bean.getTOPOST() : " +Bean.getTOPOST());
			System.out.println("Bean.getTOSAN() : " +Bean.getTOSAN());
			System.out.println("Bean.getTOSANGSE() : " +Bean.getTOSANGSE());
			System.out.println("Bean.getTOSI() : " +Bean.getTOSI());
			System.out.println("Bean.getTOTEL() : " +Bean.getTOTEL());
			System.out.println("Bean.getUP_DATE() : " +Bean.getUP_DATE());
			System.out.println("Bean.getWORK_ID() : " +Bean.getWORK_ID());
			
			Object[] values = {
					Bean.getADMIN_NO(),
					Bean.getNAME(),
					Bean.getSSN(),
					Bean.getBIZSSN(),
					Bean.getBIZ_STATUS(),
					
					Bean.getBIZ_TYPES(),
					Bean.getPOST(),
					Bean.getADDR1(),
					Bean.getADDR2(),
					Bean.getSI(),
					
					Bean.getGUN(),
					Bean.getDONG(),
					Bean.getRI(),
					Bean.getSAN(),
					Bean.getBON(),
					
					Bean.getBU(),
					Bean.getSANGSE(),
					Bean.getDORO_NM(),
					Bean.getBD_BON(),
					Bean.getBD_BU(),
					
					Bean.getBD_NM(),
					Bean.getBD_DET_NM(),
					Bean.getTEL(),
					Bean.getHP(),
					Bean.getEMAIL(),
					
					Bean.getNOTES(),
					Bean.getTOPOST(),
					Bean.getTOADDR1(),
					Bean.getTOADDR2(),
					Bean.getTOSI(),
					
					Bean.getTOGUN(),
					Bean.getTODONG(),
					Bean.getTO_RI(),
					Bean.getTOSAN(),
					Bean.getTOBON(),
					
					Bean.getTOBU(),
					Bean.getTOSANGSE(),
					Bean.getTO_DORO_NM(),
					Bean.getTO_BD_BON(),
					Bean.getTO_BD_BU(),
					
					Bean.getTO_BD_NM(),
					Bean.getTO_BD_DET_NM(),
					Bean.getTONM(),
					Bean.getTOTEL(),
					Bean.getTOHP(),
					
					Bean.getTOMAIL(),
					Bean.getADDR_CHECK(),
					Bean.getREFERENCE(),
					Bean.getB_PERMISSION(),
					Bean.getWORK_ID(),
										
					//********** BEGIN_현진_20120321
					//Bean.getUP_DATE()
					Bean.getUP_DATE(),
					Bean.getEXPONENT(),
					//********** BEGIN_KANG_20120417
					Bean.getCOMPANY_NAME(),
					//********** END_KANG_20120417
					Bean.getBUSINESSADDR()
					//********** END_현진_20120321

				};
			//********** END_현진_20120215
			
			
			System.out.println("Bean.getSI() ="+Bean.getSI());
			System.out.println("Bean.getGUN() ="+Bean.getGUN());
			System.out.println("Bean.getDORO_NM() ="+Bean.getDORO_NM());
			System.out.println("Bean.getBD_NM() ="+Bean.getBD_NM());

			appeal_Register.update(values);
		}
		catch (Exception e)
		{
			System.out.println(" ! ERROR : executeAppeal_Register");
			e.printStackTrace();
			return	false;
		}
		
		return	true;
    }
    
    
    //	점용지 정보 등록 
    public	boolean	executePlace_Register(PlaceBean Bean)
	{
    	MinwonMapDao.Place_Register	place_Register	= minwonMap.new Place_Register(getDataSource(), getMessageSourceAccessor());
    	
		try	{
			System.out.println("Bean.getADMIN_NO() : " +Bean.getADMIN_NO());
			System.out.println("Bean.getBAN() : " +Bean.getBAN());
			System.out.println("Bean.getBD_DONG() : " +Bean.getBD_DONG());
			System.out.println("Bean.getBD_HO() : " +Bean.getBD_HO());
			System.out.println("Bean.getBD_NM() : " +Bean.getBD_NM());
			System.out.println("Bean.getBJ_CD() : " +Bean.getBJ_CD());
			System.out.println("Bean.getBONBUN() : " +Bean.getBONBUN());
			System.out.println("Bean.getBUBUN() : " +Bean.getBUBUN());
			System.out.println("Bean.getEXE_INFO() : " +Bean.getEXE_INFO());
			System.out.println("Bean.getHJ_CD() : " +Bean.getHJ_CD());
			System.out.println("Bean.getMUL_FROMDATE() : " +Bean.getMUL_FROMDATE());
			System.out.println("Bean.getMUL_POST() : " +Bean.getMUL_POST());
			System.out.println("Bean.getMUL_TODATE() : " +Bean.getMUL_TODATE());
			System.out.println("Bean.getOWNER_SET() : " +Bean.getOWNER_SET());
			System.out.println("Bean.getPARKING_NUM() : " +Bean.getPARKING_NUM());
			System.out.println("Bean.getPARTLY_PERIOD() : " +Bean.getPARTLY_PERIOD());
			System.out.println("Bean.getPLACE_REFERENCE() : " +Bean.getPLACE_REFERENCE());
			System.out.println("Bean.getPURPOSE_CD() : " +Bean.getPURPOSE_CD());
			System.out.println("Bean.getREDUCTION_REASON() : " +Bean.getREDUCTION_REASON());
			System.out.println("Bean.getREDUCTION_REASON() : " +Bean.getREDUCTION_REASON());
			System.out.println("Bean.getRIVER_NM() : " +Bean.getRIVER_NM());
			System.out.println("Bean.getRIVER_RANK() : " +Bean.getRIVER_RANK());
			System.out.println("Bean.getROAD_ADDR() : " +Bean.getROAD_ADDR());
			System.out.println("Bean.getROAD_BON() : " +Bean.getROAD_BON());
			System.out.println("Bean.getROAD_BU() : " +Bean.getROAD_BU());
			System.out.println("Bean.getSECTION() : " +Bean.getSECTION());
			System.out.println("Bean.getSIDO() : " +Bean.getSIDO());
			System.out.println("Bean.getSIGUNGU() : " +Bean.getSIGUNGU());
			System.out.println("Bean.getSPC_CD() : " +Bean.getSPC_CD());
			System.out.println("Bean.getTAX_SET() : " +Bean.getTAX_SET());
			System.out.println("Bean.getTONG() : " +Bean.getTONG());
			System.out.println("Bean.getTOTAL_PERIOD() : " +Bean.getTOTAL_PERIOD());
			System.out.println("Bean.getTYPE() : " +Bean.getTYPE());
			System.out.println("Bean.getWITH_ADDR1() : " +Bean.getWITH_ADDR1());
			System.out.println("Bean.getWITH_ADDR2() : " +Bean.getWITH_ADDR2());
			System.out.println("Bean.getWITH_POST() : " +Bean.getWITH_POST());
			System.out.println("Bean.getWITH_SUM_PRICE() : " +Bean.getWITH_SUM_PRICE());
			System.out.println("Bean.getWORK_FROMDATE() : " +Bean.getWORK_FROMDATE());
			System.out.println("Bean.getWORK_TODATE() : " +Bean.getWORK_TODATE());
			System.out.println("Bean.getWSP_YN() : " +Bean.getWSP_YN());
			System.out.println("new Float(Bean.getAREA_SIZE()), : " +new Float(Bean.getAREA_SIZE()));
			System.out.println("new Float(Bean.getPERCENT_RATE()), : " +new Float(Bean.getPERCENT_RATE()));
			System.out.println("new Float(Bean.getREDUCTION_RATE()), : " +new Float(Bean.getREDUCTION_RATE()));
//#mr 점용지 도로명 주소 추가
			System.out.println("Bean.getJYADDR_NEW() : " +Bean.getJYADDR_NEW());
			System.out.println("Bean.getJYADDR_BON() : " +Bean.getJYADDR_BON());
			System.out.println("Bean.getJYADDR_BU() : " +Bean.getJYADDR_BU());
			
			Object[] values = {
				Bean.getADMIN_NO(),
				Bean.getTYPE(),
				Bean.getSECTION(),
				Bean.getPURPOSE_CD(),
				Bean.getPARKING_NUM(),
				
				Bean.getOWNER_SET(),
				Bean.getTAX_SET(),
				Bean.getMUL_POST(),
				Bean.getSIDO(),
				Bean.getSIGUNGU(),
				
				Bean.getBJ_CD(),
				Bean.getHJ_CD(),
				Bean.getSPC_CD(),
				Bean.getBONBUN(),
				Bean.getBUBUN(),
				
				Bean.getTONG(),
				Bean.getBAN(),
				Bean.getBD_NM(),
				Bean.getBD_DONG(),
				Bean.getBD_HO(),
				
				Bean.getMUL_FROMDATE(),
				Bean.getMUL_TODATE(),
				Bean.getTOTAL_PERIOD(),
				Bean.getPARTLY_PERIOD(),
				Bean.getWORK_FROMDATE(),
				
				Bean.getWORK_TODATE(),
				Bean.getEXE_INFO(),
				Bean.getRIVER_NM(),
				Bean.getWITH_POST(),
				Bean.getWITH_ADDR1(),
				
				Bean.getWITH_ADDR2(),
				Bean.getROAD_ADDR(),
				Bean.getROAD_BON(),
				Bean.getROAD_BU(),
				Bean.getPLACE_REFERENCE(),
				
				new Float(Bean.getAREA_SIZE()),
				Bean.getWITH_SUM_PRICE(),
				Bean.getWSP_YN(),
				Bean.getRIVER_RANK(),
				new Float(Bean.getREDUCTION_RATE()),
				
				Bean.getREDUCTION_REASON(),
				new Float(Bean.getPERCENT_RATE()),
				Bean.getREDUCTION_REASON(),

				// #mr 점용지 도로명주소 추가
				Bean.getJYADDR_NEW(),
				Bean.getJYADDR_BON(),
				Bean.getJYADDR_BU(),
				
				Bean.getDUE_DATE()
			};

			place_Register.update(values);
		}
		catch (Exception e)
		{
			System.out.println(" ! ERROR : executePlace_Register");
			e.printStackTrace();
			return	false;
		}
		
		return	true;
    }
    
    
    
    //	민원정보 보기
    public	List	executeMinwon_View(String strAdmin_no)
	{
    	MinwonMapDao.Minwon_View	minwon_View	= minwonMap.new Minwon_View(getDataSource(), getMessageSourceAccessor());
    	
    	Object[] values = {strAdmin_no};
    	
    	return minwon_View.execute(values);
	}
    
    //	민원정보 등록
    public	boolean	executeMinwon_Register(MinwonBean Bean)
	{
    	MinwonMapDao.Minwon_Register	minwon_Register	= minwonMap.new Minwon_Register(getDataSource(), getMessageSourceAccessor());
    	
		try
		{
//			System.out.println("START MINWON_INFO ###########################################");
//			System.out.println("Bean.getADMIN_NO_MIN() ==>" +Bean.getADMIN_NO_MIN());
//			System.out.println("Bean.getREQ_NO_MIN() ==>" +Bean.getREQ_NO_MIN());
//			System.out.println("Bean.getREQ_DATE_MIN() ==>" +Bean.getREQ_DATE_MIN());
//			System.out.println("Bean.getREQ_NM_MIN() ==>" +Bean.getREQ_NM_MIN());
//			System.out.println("Bean.getMANAGER_MIN() ==>" +Bean.getMANAGER_MIN());
//			System.out.println("Bean.getGUBUN_MIN() ==>" +Bean.getGUBUN_MIN());
//			System.out.println("Bean.getAGENT_NM_MIN() ==>" +Bean.getAGENT_NM_MIN());
//			System.out.println("Bean.getAGENT_TEL_MIN() ==>" +Bean.getAGENT_TEL_MIN());
//			System.out.println("Bean.getEVENT_SET_MIN() ==>" +Bean.getEVENT_SET_MIN());
//			System.out.println("Bean.getREQ_SET_MIN() ==>" +Bean.getREQ_SET_MIN());
//			System.out.println("Bean.getREQ_SIGU_MIN() ==>" +Bean.getREQ_SIGU_MIN());
//			System.out.println("Bean.getREQ_DEP_MIN() ==>" +Bean.getREQ_DEP_MIN());
//			System.out.println("Bean.getREQ_SET_CN_MIN() ==>" +Bean.getREQ_SET_CN_MIN());
//			System.out.println("Bean.getBIZSSN_MIN() ==>" +Bean.getBIZSSN_MIN());
//			System.out.println("Bean.getMANAGE_DEP_MIN() ==>" +Bean.getMANAGE_DEP_MIN());
//			System.out.println("Bean.getNOTES_MIN() ==>" +Bean.getNOTES_MIN());
//			System.out.println("Bean.getPREDATE_MIN() ==>" +Bean.getPREDATE_MIN());
//			System.out.println("Bean.getSSN_MIN() ==>" +Bean.getSSN_MIN());
//			System.out.println("Bean.getNAME_MIN() ==>" +Bean.getNAME_MIN());
//			System.out.println("Bean.getTEL_MIN() ==>" +Bean.getTEL_MIN());
//			System.out.println("Bean.getHP_MIN() ==>" +Bean.getHP_MIN());
//			System.out.println("Bean.getADDR1_MIN() ==>" +Bean.getADDR1_MIN());
//			System.out.println("Bean.getADDR2_MIN() ==>" +Bean.getADDR2_MIN());
//			System.out.println("Bean.getPOST_MIN() ==>" +Bean.getPOST_MIN());
//			System.out.println("Bean.getREAL_DEAL_DATE_MIN() ==>" +Bean.getREAL_DEAL_DATE_MIN());
//			System.out.println("Bean.getMW_PROG_SE_MIN() ==> " + Bean.getMW_PROG_SE_MIN());
//			System.out.println("Bean.getEMAIL_MIN() ==> " + Bean.getEMAIL_MIN());
//			System.out.println("Bean.getMINWON_REFERENCE() ==> " + Bean.getMINWON_REFERENCE());
//			System.out.println("END MINWON_INFO ###########################################");
			//********** BEGIN_현진_20120215
			/*
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
					Bean.getEMAIL_MIN(),
					Bean.getMINWON_REFERENCE()			 
			 */
			
			System.out.println("Bean.getADDR1_MIN() : " +Bean.getADDR1_MIN());
			System.out.println("Bean.getADDR2_MIN() : " +Bean.getADDR2_MIN());
			System.out.println("Bean.getADMIN_NO_MIN() : " +Bean.getADMIN_NO_MIN());
			System.out.println("Bean.getAGENT_NM_MIN() : " +Bean.getAGENT_NM_MIN());
			System.out.println("Bean.getAGENT_TEL_MIN() : " +Bean.getAGENT_TEL_MIN());
			System.out.println("Bean.getBIZSSN_MIN() : " +Bean.getBIZSSN_MIN());
			System.out.println("Bean.getDORO_ADDR1_MIN() : " +Bean.getDORO_ADDR1_MIN());
			System.out.println("Bean.getDORO_ADDR2_MIN() : " +Bean.getDORO_ADDR2_MIN());
			System.out.println("Bean.getEMAIL_MIN() : " +Bean.getEMAIL_MIN());
			System.out.println("Bean.getEVENT_SET_MIN() : " +Bean.getEVENT_SET_MIN());
			System.out.println("Bean.getGUBUN_MIN() : " +Bean.getGUBUN_MIN());
			System.out.println("Bean.getHP_MIN() : " +Bean.getHP_MIN());
			System.out.println("Bean.getMANAGE_DEP_MIN() : " +Bean.getMANAGE_DEP_MIN());
			System.out.println("Bean.getMANAGER_MIN() : " +Bean.getMANAGER_MIN());
			System.out.println("Bean.getMINWON_REFERENCE() : " +Bean.getMINWON_REFERENCE());
			System.out.println("Bean.getMW_PROG_SE_MIN() : " +Bean.getMW_PROG_SE_MIN());
			System.out.println("Bean.getNAME_MIN() : " +Bean.getNAME_MIN());
			System.out.println("Bean.getNOTES_MIN() : " +Bean.getNOTES_MIN());
			System.out.println("Bean.getPOST_MIN() : " +Bean.getPOST_MIN());
			System.out.println("Bean.getPREDATE_MIN() : " +Bean.getPREDATE_MIN());
			System.out.println("Bean.getREAL_DEAL_DATE_MIN() : " +Bean.getREAL_DEAL_DATE_MIN());
			System.out.println("Bean.getREQ_DATE_MIN() : " +Bean.getREQ_DATE_MIN());
			System.out.println("Bean.getREQ_DEP_MIN() : " +Bean.getREQ_DEP_MIN());
			System.out.println("Bean.getREQ_NM_MIN() : " +Bean.getREQ_NM_MIN());
			System.out.println("Bean.getREQ_NO_MIN() : " +Bean.getREQ_NO_MIN());
			System.out.println("Bean.getREQ_SET_CN_MIN() : " +Bean.getREQ_SET_CN_MIN());
			System.out.println("Bean.getREQ_SET_MIN() : " +Bean.getREQ_SET_MIN());
			System.out.println("Bean.getREQ_SIGU_MIN() : " +Bean.getREQ_SIGU_MIN());
			System.out.println("Bean.getSSN_MIN() : " +Bean.getSSN_MIN());
			System.out.println("Bean.getTEL_MIN() : " +Bean.getTEL_MIN());

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
					Bean.getEMAIL_MIN(),
					Bean.getMINWON_REFERENCE(),
					Bean.getDORO_ADDR1_MIN(),
					Bean.getDORO_ADDR2_MIN()
			};
			//********** END_현진_20120215
			minwon_Register.update(values);
		}
		catch (Exception e)
		{
			e.printStackTrace();
			return	false;
		}
		
		return	true;
    }

    //	점용지정보 보기
    public	List	executeJumji_View(String strAdmin_no)
	{
    	MinwonMapDao.Jumji_View	jumji_View	= minwonMap.new Jumji_View(getDataSource(), getMessageSourceAccessor());
    	
    	Object[] values = {strAdmin_no};
    	
    	List a = jumji_View.execute(values);;
    	
    	PlaceBean pb = new PlaceBean();
    	
    	pb = (PlaceBean)a.get(0);
    	
    	System.out.println("type="+pb.getTYPE());
    	
    	return a;
	}

    //	점용지정보  수정
    public	boolean	executeJumji_Modify(PlaceBean Bean)
	{
    	MinwonMapDao.Jumji_Modify	jumji_Modify	= minwonMap.new Jumji_Modify(getDataSource(), getMessageSourceAccessor());
    	
		try
		{
			Object[] values = {
					Bean.getTYPE(),
					Bean.getSECTION(),
					Bean.getPURPOSE_CD(),
					Bean.getPARKING_NUM(),
					Bean.getOWNER_SET(),
					Bean.getTAX_SET(),
					Bean.getMUL_POST(),
					Bean.getSIDO(),
					Bean.getSIGUNGU(),
					Bean.getBJ_CD(),
					Bean.getHJ_CD(),
					Bean.getSPC_CD(),
					Bean.getBONBUN(),
					Bean.getBUBUN(),
					Bean.getTONG(),
					Bean.getBAN(),
					Bean.getBD_NM(),
					Bean.getBD_DONG(),
					Bean.getBD_HO(),
					Bean.getMUL_FROMDATE(),
					Bean.getMUL_TODATE(),
					Bean.getTOTAL_PERIOD(),
					Bean.getPARTLY_PERIOD(),
					Bean.getWORK_FROMDATE(),
					Bean.getWORK_TODATE(),
					Bean.getEXE_INFO(),
					Bean.getRIVER_NM(),
					Bean.getWITH_POST(),
					Bean.getWITH_ADDR1(),
					Bean.getWITH_ADDR2(),
					Bean.getADMIN_NO()
			};
			
//			System.out.println("빈dp dhsrjwl = "+
//					Bean.getTYPE()+"  "+
//					Bean.getSECTION()+"  "+
//					Bean.getPURPOSE_CD()+"  "+
//					Bean.getPARKING_NUM()+"  "+
//					Bean.getOWNER_SET()+"  "+
//					Bean.getTAX_SET()+"  "+
//					Bean.getMUL_POST()+"  "+
//					Bean.getSIDO()+"  "+
//					Bean.getSIGUNGU()+"  "+
//					Bean.getBJ_CD()+"  "+
//					Bean.getHJ_CD()+"  "+
//					Bean.getSPC_CD()+"  "+
//					Bean.getBONBUN()+"  "+
//					Bean.getBUBUN()+"  "+
//					Bean.getTONG()+"  "+
//					Bean.getBAN()+"  "+
//					Bean.getBD_NM()+"  "+
//					Bean.getBD_DONG()+"  "+
//					Bean.getBD_HO()+"  "+
//					Bean.getMUL_FROMDATE()+"  "+
//					Bean.getMUL_TODATE()+"  "+
//					Bean.getTOTAL_PERIOD()+"  "+
//					Bean.getPARTLY_PERIOD()+"  "+
//					Bean.getWORK_FROMDATE()+"  "+
//					Bean.getWORK_TODATE()+"  "+
//					Bean.getEXE_INFO()+"  "+
//					Bean.getRIVER_NM()+"  "+
//					Bean.getWITH_POST()+"  "+
//					Bean.getWITH_ADDR1()+"  "+
//					Bean.getWITH_ADDR2()+"  "+
//					Bean.getADMIN_NO());
			
			jumji_Modify.update(values);
		}
		catch (Exception e)
		{
			System.out.println("에러="+e.toString());
			e.printStackTrace();
			return	false;
		}
		
		return	true;
    }
    //  점용지 체크
    public	int		executeJumji_Check(String strAdmin_no)
	{
    	Object[] values = {strAdmin_no};
    	
		String sql = getMessageSourceAccessor().getMessage("Querys.jumyong.minwon.JumjiCheck");

		return 	getJdbcTemplate().queryForInt(sql, values);
	}

    //	점용인 정보 수정
    public	boolean	executeUpdateJumin(AppealBean Bean)
	{
    	MinwonMapDao.UpdateJumin	updateJumin	= minwonMap.new UpdateJumin(getDataSource(), getMessageSourceAccessor());
    	
		try
		{
			Object[] values = {
				Bean.getNAME(),
				Bean.getSSN(),
				Bean.getBIZSSN(),
				Bean.getADDR1(),
				Bean.getADDR2(),
				Bean.getEMAIL(),
				Bean.getTEL(),
				Bean.getHP(),
				Bean.getADMIN_NO()
			};

			updateJumin.update(values);
		}
		catch (Exception e)
		{
			e.printStackTrace();
			return	false;
		}
		
		return	true;
    }
    
    
    //	관리자 생성 1단계 (법정동으로 관리번호 갯수 확인)
    public	int		executeCheck_AdminnoCount(String BJ_CD)
	{
    	Object[] values = {BJ_CD};
    	
		String sql = getMessageSourceAccessor().getMessage("Querys.jumyong.minwon.Check_AdminnoCount");
		return 	getJdbcTemplate().queryForInt(sql, values);
	}
    
    
    //	관리자 생성 2단계 (동일 관리번호 유무 확인)
    public	int		executeCheck_Adminno(String ADMIN_NO)
	{
    	Object[] values = {ADMIN_NO};
    	
		String sql = getMessageSourceAccessor().getMessage("Querys.jumyong.minwon.Check_Adminno");
		return 	getJdbcTemplate().queryForInt(sql, values);
	}



//	관련 점용지 조회
    public	List	executeSearch_Jumji(JumjiSearchBean Bean, int intRn1, int intRn2)
	{
    	MinwonMapDao.Search_Jumji	search_Jumji	= minwonMap.new Search_Jumji(getDataSource(), getMessageSourceAccessor());
    	
    	if(Bean.getSSN().equals("")	||	Bean.getSSN() == null)
    		Bean.setSSN("%");
    	if(Bean.getBJ_CD().equals("")	||	Bean.getBJ_CD() == null)
    		Bean.setBJ_CD("%");
    	if(Bean.getHJ_CD().equals("")	||	Bean.getHJ_CD() == null)
    		Bean.setHJ_CD("%");
    	if(Bean.getBONBUN().equals("")	||	Bean.getBONBUN() == null)
    		Bean.setBONBUN("%");
    	if(Bean.getBUBUN().equals("")	||	Bean.getBUBUN() == null)
    		Bean.setBUBUN("%");
    	String ADMIN_NO = "%" + Bean.getADMIN_NO() + "%"; 
    	String NAME = "%" + Bean.getNAME() + "%";
    	
//    	System.out.println("##########################################################################");
//    	System.out.println("Bean.getSIDO()==>"+Bean.getSIDO());
//    	System.out.println("Bean.getSIGUNGU()==>"+Bean.getSIGUNGU());
//    	System.out.println("ADMIN_NO==>"+ADMIN_NO);
//    	System.out.println("NAME==>"+NAME);
//    	System.out.println("Bean.getSSN()==>"+Bean.getSSN());
//    	System.out.println("Bean.getBJ_CD()==>"+Bean.getBJ_CD());
//    	System.out.println("Bean.getHJ_CD()==>"+Bean.getHJ_CD());
//    	System.out.println("Bean.getBONBUN()==>"+Bean.getBONBUN());
//    	System.out.println("Bean.getBUBUN()==>"+Bean.getBUBUN());
//    	System.out.println("intRn1==>"+intRn1);
//    	System.out.println("intRn2==>"+intRn2);
//    	System.out.println("##########################################################################");
    	
		Object[] values = {
				Bean.getSIDO(),
				Bean.getSIGUNGU(),
				ADMIN_NO,
				NAME,
				Bean.getSSN(),
				
				Bean.getBJ_CD(),
				Bean.getHJ_CD(),
				Bean.getBONBUN(),
				Bean.getBUBUN(),
	        	new Integer(intRn1),
	        	
	        	new Integer(intRn2)
			};
			
		return search_Jumji.execute(values);
    }




    //	관련 점용지 조회
    public	int	executeSearch_JumjiCount(JumjiSearchBean Bean)
	{
    	if(Bean.getSSN().equals("")	||	Bean.getSSN() == null)
    		Bean.setSSN("%");
    	if(Bean.getBJ_CD().equals("")	||	Bean.getBJ_CD() == null)
    		Bean.setBJ_CD("%");
    	if(Bean.getHJ_CD().equals("")	||	Bean.getHJ_CD() == null)
    		Bean.setHJ_CD("%");
    	if(Bean.getBONBUN().equals("")	||	Bean.getBONBUN() == null)
    		Bean.setBONBUN("%");
    	if(Bean.getBUBUN().equals("")	||	Bean.getBUBUN() == null)
    		Bean.setBUBUN("%");
    	String ADMIN_NO = "%" + Bean.getADMIN_NO() + "%";
   		String NAME = "%" + Bean.getNAME() + "%";
    	
//    	System.out.println("##########################################################################");
//    	System.out.println("Bean.getSIDO()==>"+Bean.getSIDO());
//    	System.out.println("Bean.getSIGUNGU()==>"+Bean.getSIGUNGU());
//    	System.out.println("ADMIN_NO==>"+ADMIN_NO);
//    	System.out.println("NAME==>"+NAME);
//    	System.out.println("Bean.getSSN()==>"+Bean.getSSN());
//    	System.out.println("Bean.getBJ_CD()==>"+Bean.getBJ_CD());
//    	System.out.println("Bean.getHJ_CD()==>"+Bean.getHJ_CD());
//    	System.out.println("Bean.getBONBUN()==>"+Bean.getBONBUN());
//    	System.out.println("Bean.getBUBUN()==>"+Bean.getBUBUN());
//    	System.out.println("##########################################################################");
    	
		Object[] values = {
			Bean.getSIDO(),
			Bean.getSIGUNGU(),
			ADMIN_NO,
			NAME,
			Bean.getSSN(),
			Bean.getBJ_CD(),
			Bean.getHJ_CD(),
			Bean.getBONBUN(),
			Bean.getBUBUN()
		};
			
		String sql = getMessageSourceAccessor().getMessage("Querys.jumyong.minwon.Search_JumjiCount");
		return 	getJdbcTemplate().queryForInt(sql, values);
    } 

    //전체 건수
    public	int		getJumyong_JibunInfo(String bj_cd, String hj_cd, String spc_cd, String bonbun, String bubun)
	{
	    System.out.println("DAO bj_cd ==>" + bj_cd);
	    System.out.println("DAO hj_cd ==>" + hj_cd);
	    System.out.println("DAO spc_cd ==>" + spc_cd);
	    System.out.println("DAO bonbun_cd ==>" + bonbun);
		System.out.println("DAO bubun_cd ==> " + bubun);
    	if("".equals(bubun))
    	{
    		Object[] values = {bj_cd, hj_cd, spc_cd, bonbun};
    		String sql = getMessageSourceAccessor().getMessage("Querys.jumyong.minwon.getJibunInfo_Count1");
    		return 	getJdbcTemplate().queryForInt(sql, values);
    	}
    	else
    	{
    		Object[] values = {bj_cd, hj_cd, spc_cd, bonbun, bubun};
    		String sql = getMessageSourceAccessor().getMessage("Querys.jumyong.minwon.getJibunInfo_Count2");
    		return 	getJdbcTemplate().queryForInt(sql, values);
    	}
	}
    
  //공시지가 가져오기
	public	Map	get_Price(String address, String bonbun, String bubun){
		
		Object[]values = {address,bonbun,bubun,bubun}; 	
		
		String sql = getMessageSourceAccessor().getMessage("Querys.jumyong.minwon.get_price");
		Map returnNum = null;
		try
		{
			returnNum = getJdbcTemplate().queryForMap(sql,values);
		}catch(Exception err)
		{
			System.out.println(err.toString());
		}
		return returnNum;
	}
	
	
	//공시지가 적용지번 삭제
    public void executeDeletePlaceWithAddr(String adminNo){
    	
    	MinwonMapDao.DeletePlaceWithAddr	deletePlaceWithAddr	= minwonMap.new DeletePlaceWithAddr(getDataSource(), getMessageSourceAccessor());
    	
		try
		{
			Object[] values = {adminNo};
			deletePlaceWithAddr.update(values);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
    }
    
	//공시지가 적용지번 추가
    public void executeInsertPlaceWithAddr(String adminNo,String pnu,String addr){
    	
    	MinwonMapDao.InsertPlaceWithAddr	insertPlaceWithAddr	= minwonMap.new InsertPlaceWithAddr(getDataSource(), getMessageSourceAccessor());
    	
		try
		{
			Object[] values = {
					adminNo,
					adminNo,
					pnu,
					addr
			};
			
			insertPlaceWithAddr.update(values);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
    }
    
}
