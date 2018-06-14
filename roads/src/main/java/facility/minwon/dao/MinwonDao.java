//	2009		Kim Yun Seo

package main.java.facility.minwon.dao;

import java.util.List;
import java.util.Map;

import main.java.common.dao.RoadsJdbcDaoSupport;
import main.java.facility.adminbiz.model.AdminBizBean;
import main.java.facility.minwon.model.Admin_BaseBean;
import main.java.facility.minwon.model.AppealBean;
import main.java.facility.minwon.model.MinwonBean;
import main.java.facility.minwon.model.PlaceBean;


public class MinwonDao	extends RoadsJdbcDaoSupport	implements	IMinwonDao
{
	private	MinwonMapDao	minwonMap	= new MinwonMapDao();
	
	
    protected	void	initDao()  throws Exception
    {
		super.initDao();
   	}
    
    //	검색
    public	List	executeSearch(String strName, String strReq_no, String strReq_date1, String strReq_date2, String strCheck, String Process, int intRn1, int intRn2)
	{
    	MinwonMapDao.Search	search	= minwonMap.new Search(getDataSource(), getMessageSourceAccessor());
    	
    	if(strReq_no.equals("")	||	strReq_no == null)
    		strReq_no	= "%";
    	
    	if(strCheck.equals("")	||	strCheck == null)
    		strCheck	= "%";
    	
    	if(Process.equals("")	||	Process == null)
    		Process	= "%";
    	else if(Process.equals("0"))
    		Process	= "N";   	
    	else if(Process.equals("1"))
    		Process	= "Y";  
    	
    	Object[] values = {
    		"%" + strName + "%",
    		strReq_no,
    		strReq_date1,
    		strReq_date2,
    		strCheck,
    		Process,
        	new Integer(intRn1),
        	new Integer(intRn2)
    	};
    	
    	return search.execute(values);
	}
    
    //	전체 건수
    public	int		executeCount(String strName, String strReq_no, String strReq_date1, String strReq_date2, String strCheck, String Process)
	{
    	if(strReq_no.equals("")	||	strReq_no == null)
    		strReq_no	= "%";
    	
    	if(strCheck.equals("")	||	strCheck == null)
    		strCheck	= "%";
    	
    	if(Process.equals("")	||	Process == null)
    		Process	= "%";
    	else if(Process.equals("0"))
    		Process	= "N";   	
    	else if(Process.equals("1"))
    		Process	= "Y";
    	
    	Object[] values = {
        	"%" + strName + "%",
        	strReq_no,
        	strReq_date1,
        	strReq_date2,
        	strCheck,
        	Process
        };
    	
		String sql = getMessageSourceAccessor().getMessage("Querys.facility.minwon.Count");
		return 	getJdbcTemplate().queryForInt(sql, values);
	}
    
    
    //	ADMIN_BASE 등록 및 등록한 값 가져오기
    public	Admin_BaseBean	executeAdmin_Base_Register(Admin_BaseBean Bean)
	{
    	MinwonMapDao.Admin_Base_Register	admin_Base_Register	= minwonMap.new Admin_Base_Register(getDataSource(), getMessageSourceAccessor());
    	
		try
		{
//			System.out.println("Start Admin_Base_Register Param ##########################################");
//			System.out.println("Bean.getCORP_CD() ==>" + Bean.getCORP_CD());
//			System.out.println("Bean.getGU_CODE() ==>" + Bean.getGU_CODE());
//			System.out.println("Bean.getREQUEST_NO() ==> " + Bean.getREQUEST_NO());
//			System.out.println("Bean.getREGDATE() ==>" + Bean.getREGDATE());
//			System.out.println("Bean.getUP_DATE() ==>" + Bean.getUP_DATE());
//			System.out.println("Bean.getMANAGER()" + Bean.getMANAGER());
//			System.out.println("Bean.getFINISH_ID() ==>"+Bean.getFINISH_ID());
//			System.out.println("Bean.getCHECK_YN() ==>" + Bean.getCHECK_YN());
//			System.out.println("Bean.getTAX_YN() ==> " + Bean.getTAX_YN());
			Object[] values1 = {
//				Bean.getADMIN_NO(),
//				Bean.getSEQ(),
				Bean.getCORP_CD(),
				Bean.getGU_CODE(),
				Bean.getREQUEST_NO(),
				Bean.getREGDATE(),
				Bean.getUP_DATE(),
				Bean.getMANAGER(),
				Bean.getFINISH_ID(),
				Bean.getCHECK_YN(),
				Bean.getTAX_YN()
			};

			admin_Base_Register.update(values1);
			
			//저장한후 저장한 EQUIP_ADMIN_BASE값을 가져온다.
			MinwonMapDao.GetAdminBase	getAdminBase	= minwonMap.new GetAdminBase(getDataSource(), getMessageSourceAccessor());
//			System.out.println("Start GetAdminBase Param ##########################################");
//			System.out.println("Bean.getCORP_CD()" + Bean.getCORP_CD());
//			System.out.println("Bean.getGU_CODE() ==>" + Bean.getGU_CODE());
//			System.out.println("Bean.getREQUEST_NO() ==> " + Bean.getREQUEST_NO());
	    	Object[] values2 = {
	    			Bean.getCORP_CD(),
					Bean.getGU_CODE(),
					Bean.getREQUEST_NO()
	    	};
	    	
	    	List adminBase = getAdminBase.execute(values2);
	    	
	    	for(int i = 0	;	i < adminBase.size()	;	i++)
			{
				Bean	= (Admin_BaseBean)adminBase.get(i);
			}
		}
		catch (Exception e)
		{
			System.out.println(" ! ERROR : executeAdmin_Base_Register");
			e.printStackTrace();
			return	Bean;
		}
		
		return	Bean;
    }
    
    
    //	민원정보 등록
    public	boolean	executeMinwon_Register(MinwonBean Bean)
	{
    	MinwonMapDao.Minwon_Register	minwon_Register	= minwonMap.new Minwon_Register(getDataSource(), getMessageSourceAccessor());
    	
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
			
			System.out.println("admin_no");
			System.out.println(Bean.getADMIN_NO_MIN());

			minwon_Register.update(values);
		}
		catch (Exception e)
		{
			e.printStackTrace();
			return	false;
		}
		
		return	true;
    }
    
    
    //	점용인정보 등록
    public	boolean	executeAppeal_Register(AppealBean Bean)
	{
    	MinwonMapDao.Appeal_Register	appeal_Register	= minwonMap.new Appeal_Register(getDataSource(), getMessageSourceAccessor());
    	
		try
		{
			System.out.println("Bean.getNAME() ==>" + Bean.getNAME() );
			System.out.println("Bean.getSSN() ==>" +  Bean.getSSN());
			System.out.println("Bean.getBIZSSN() ==>" +  Bean.getBIZSSN());
			System.out.println("Bean.getTEL() ==>" +  Bean.getTEL());
			System.out.println("Bean.getHP() ==>" +  Bean.getHP());
			System.out.println("Bean.getGU_CODE() ==>" +  Bean.getGU_CODE());
			System.out.println("Bean.getCORP_CD() ==>" + Bean.getCORP_CD() );
			System.out.println("Bean.getBON_POST() ==>" + Bean.getBON_POST() );
			System.out.println("Bean.getBON_ADDR1() ==>" + Bean.getBON_ADDR1() );
			System.out.println("Bean.getBON_ADDR2() ==>" + Bean.getBON_ADDR2() );
			System.out.println("Bean.getBIZ_STATUS() ==>" + Bean.getBIZ_STATUS() );
			System.out.println("Bean.getTO_POST() ==>" + Bean.getTO_POST() );
			System.out.println("Bean.getTO_ADDR1() ==>" + Bean.getTO_ADDR1() );
			System.out.println("Bean.getTO_ADDR2() ==>" + Bean.getTO_ADDR2() );
			System.out.println("Bean.getOFFICE() ==>" + Bean.getOFFICE() );
			System.out.println("Bean.getTEL_EXT() ==>" + Bean.getTEL_EXT() );
			System.out.println("Bean.getFAX() ==>" + Bean.getFAX() );
			System.out.println("Bean.getTOPOST_NM() ==>" + Bean.getTOPOST_NM() );
			System.out.println("Bean.getMANAGER() ==>" + Bean.getMANAGER() );
			System.out.println("Bean.getADDR_CHECK() ==>" + Bean.getADDR_CHECK() );
			
			Object[] values = {
				Bean.getNAME(),
				Bean.getSSN(),
				Bean.getBIZSSN(),
				Bean.getTEL(),
				Bean.getHP(),

				Bean.getGU_CODE(),
				Bean.getCORP_CD(),
				Bean.getBON_POST(),
				Bean.getBON_ADDR1(),
				Bean.getBON_ADDR2(),

				Bean.getBIZ_STATUS(),
				Bean.getBIZ_TYPES(),
				Bean.getTO_POST(),
				Bean.getTO_ADDR1(),
				Bean.getTO_ADDR2(),

				Bean.getOFFICE(),
				Bean.getTEL_EXT(),
				Bean.getFAX(),
				Bean.getTOPOST_NM(),
				Bean.getMANAGER(),
				
				Bean.getADDR_CHECK()
			};

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
    
//	점용인정보 등록
    public	boolean	executeAppeal_Update(AppealBean Bean)
	{
    	MinwonMapDao.Appeal_Update	appeal_Update	= minwonMap.new Appeal_Update(getDataSource(), getMessageSourceAccessor());
    	
		try
		{
			System.out.println("Bean.getNAME() ==>" + Bean.getNAME() );
			System.out.println("Bean.getSSN() ==>" +  Bean.getSSN());
			System.out.println("Bean.getBIZSSN() ==>" +  Bean.getBIZSSN());
			System.out.println("Bean.getTEL() ==>" +  Bean.getTEL());
			System.out.println("Bean.getHP() ==>" +  Bean.getHP());
			System.out.println("Bean.getGU_CODE() ==>" +  Bean.getGU_CODE());
			System.out.println("Bean.getCORP_CD() ==>" + Bean.getCORP_CD() );
			System.out.println("Bean.getBON_POST() ==>" + Bean.getBON_POST() );
			System.out.println("Bean.getBON_ADDR1() ==>" + Bean.getBON_ADDR1() );
			System.out.println("Bean.getBON_ADDR2() ==>" + Bean.getBON_ADDR2() );
			System.out.println("Bean.getBIZ_STATUS() ==>" + Bean.getBIZ_STATUS() );
			System.out.println("Bean.getTO_POST() ==>" + Bean.getTO_POST() );
			System.out.println("Bean.getTO_ADDR1() ==>" + Bean.getTO_ADDR1() );
			System.out.println("Bean.getTO_ADDR2() ==>" + Bean.getTO_ADDR2() );
			System.out.println("Bean.getOFFICE() ==>" + Bean.getOFFICE() );
			System.out.println("Bean.getTEL_EXT() ==>" + Bean.getTEL_EXT() );
			System.out.println("Bean.getFAX() ==>" + Bean.getFAX() );
			System.out.println("Bean.getTOPOST_NM() ==>" + Bean.getTOPOST_NM() );
			System.out.println("Bean.getMANAGER() ==>" + Bean.getMANAGER() );
			System.out.println("Bean.getADDR_CHECK() ==>" + Bean.getADDR_CHECK() );
			
			Object[] values = {
				Bean.getNAME(),
				Bean.getSSN(),
				Bean.getBIZSSN(),
				Bean.getTEL(),
				Bean.getHP(),

				Bean.getBON_POST(),
				Bean.getBON_ADDR1(),
				Bean.getBON_ADDR2(),
				Bean.getBIZ_STATUS(),
				Bean.getBIZ_TYPES(),

				Bean.getTO_POST(),
				Bean.getTO_ADDR1(),
				Bean.getTO_ADDR2(),
				Bean.getOFFICE(),
				Bean.getTEL_EXT(),

				Bean.getFAX(),
				Bean.getTOPOST_NM(),
				Bean.getMANAGER(),
				Bean.getADDR_CHECK(),
				Bean.getGU_CODE(),
				
				Bean.getCORP_CD()
			};

			appeal_Update.update(values);
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
    	
		try
		{
//			System.out.println("Bean.getCORP_CD() ==>"+Bean.getCORP_CD());
//			System.out.println("Bean.getGU_CODE() ==>"+Bean.getGU_CODE());
//			System.out.println("Bean.getREQUEST_NO() ==>"+Bean.getREQUEST_NO());
//			System.out.println("Bean.getOBJECT_NO() ==>"+Bean.getOBJECT_NO());
//			System.out.println("Bean.getSECTION() ==>"+Bean.getSECTION());
//			System.out.println("Bean.getOWNER_SET() ==>"+Bean.getOWNER_SET());
//			System.out.println("Bean.getTAX_SET() ==>"+Bean.getTAX_SET());
//			System.out.println("Bean.getPURPOSE_CD() ==>"+Bean.getPURPOSE_CD());
//			System.out.println("Bean.getSTANDARD() ==>"+Bean.getSTANDARD());
//			System.out.println("Bean.getQUANTITY() ==>"+Bean.getQUANTITY());
//			System.out.println("Bean.getDEPTH_CK() ==>"+Bean.getDEPTH_CK());
//			System.out.println("Bean.getDEPTH_NUM() ==>"+Bean.getDEPTH_NUM());
//			System.out.println("Bean.getMUL_FROMDATE() ==>"+Bean.getMUL_FROMDATE());
//			System.out.println("Bean.getMUL_TODATE() ==>"+Bean.getMUL_TODATE());
//			System.out.println("Bean.getPARTLY_PERIOD() ==>"+Bean.getPARTLY_PERIOD());
//			System.out.println("Bean.getTOTAL_PERIOD() ==>"+Bean.getTOTAL_PERIOD());
//			System.out.println("Bean.getBJ_CD() ==>"+Bean.getBJ_CD());
//			System.out.println("Bean.getHJ_CD() ==>"+Bean.getHJ_CD());
//			System.out.println("Bean.getSPC_CD() ==>"+Bean.getSPC_CD());
//			System.out.println("Bean.getBONBUN() ==>"+Bean.getBONBUN());
//			System.out.println("Bean.getBUBUN() ==>"+Bean.getBUBUN());
//			System.out.println("Bean.getADDR_CK() ==>"+Bean.getADDR_CK());
//			System.out.println("Bean.getSISUL_ADDR_CK() ==>"+Bean.getSISUL_ADDR_CK());
//			System.out.println("Bean.getSISUL_ADDR() ==>"+Bean.getSISUL_ADDR());
//			System.out.println("Bean.getWORK_FROMDATE() ==>"+Bean.getWORK_FROMDATE());
//			System.out.println("Bean.getWORK_TODATE() ==>"+Bean.getWORK_TODATE());
//			System.out.println("Bean.getCOMPLETION_DATE() ==>"+Bean.getCOMPLETION_DATE());
//			System.out.println("Bean.getEXE_INFO() ==>"+Bean.getEXE_INFO());
//			System.out.println("Bean.getADMIN_NO() ==>"+Bean.getADMIN_NO());
//			System.out.println("Bean.getPURPOSESEBU_CD() ==>"+Bean.getPURPOSESEBU_CD());
//			System.out.println("Bean.getYEAR() ==>"+ Bean.getYEAR());
			
			System.out.println("	");
			
			Object[] values = {
				Bean.getCORP_CD(),
				Bean.getGU_CODE(),
//				Bean.getREQUEST_NO(),
				Bean.getOBJECT_NO(),
				Bean.getSECTION(),
				
				Bean.getOWNER_SET(),
				Bean.getTAX_SET(),
				Bean.getPURPOSE_CD(),
				Bean.getSTANDARD(),
				Bean.getQUANTITY(),
				
				Bean.getDEPTH_CK(),
				Bean.getDEPTH_NUM(),
				Bean.getMUL_FROMDATE(),
				Bean.getMUL_TODATE(),
				Bean.getPARTLY_PERIOD(),
				
				Bean.getTOTAL_PERIOD(),
				Bean.getBJ_CD(),
				Bean.getHJ_CD(),
				Bean.getSPC_CD(),
				Bean.getBONBUN(),	
				
				Bean.getBUBUN(),
//				Bean.getADDR_CK(),
//				Bean.getSISUL_ADDR_CK(),
//				Bean.getSISUL_ADDR(),
				Bean.getWORK_FROMDATE(),
				
				Bean.getWORK_TODATE(),
				Bean.getCOMPLETION_DATE(),
				Bean.getEXE_INFO(),
				Bean.getSISUL_POST(),
				Bean.getSISUL_ADDR1(),
				
				Bean.getSISUL_ADDR2(),
				Bean.getADMIN_NO(),
				Bean.getPURPOSESEBU_CD(),
				Bean.getYEAR(),
				Bean.getTYPE()
				
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
    
    //	관리자번호가 몇개 있는지 검색
    public	int		executeCheck_AdminnoCount()
	{
		String sql = getMessageSourceAccessor().getMessage("Querys.facility.minwon.Check_AdminnoCount");
		return 	getJdbcTemplate().queryForInt(sql);
	}
    
    //	동일 관리번호 유무 확인
    public	int		executeCheck_Adminno(String ADMIN_NO)
	{
    	Object[] values = {ADMIN_NO};
    	
		String sql = getMessageSourceAccessor().getMessage("Querys.facility.minwon.Check_Adminno");
		return 	getJdbcTemplate().queryForInt(sql, values);
	}
    
    public	int		executeCheck_CorpcdCount(String CORP_CD)
	{
    	Object[] values = {CORP_CD};
    	
		String sql = getMessageSourceAccessor().getMessage("Querys.facility.minwon.Check_Corpcd_Count");
		return 	getJdbcTemplate().queryForInt(sql, values);
	}
    
    
    //	관련 점용지 조회
    public	List	executeSearch_Jumin(AppealBean Bean, int intRn1, int intRn2)
	{
    	MinwonMapDao.Search_Jumin	search_Jumin	= minwonMap.new Search_Jumin(getDataSource(), getMessageSourceAccessor());
    	
    	if(Bean.getNAME().equals("")	||	Bean.getNAME() == null)
    		Bean.setNAME("%");
    	if(Bean.getSSN().equals("")	||	Bean.getSSN() == null)
    		Bean.setSSN("%");

    	Object[] values = {
				Bean.getSIGUNGU(),
				Bean.getNAME(),
				Bean.getSSN(),
	        	new Integer(intRn1),
	        	new Integer(intRn2)
			};
			
		return search_Jumin.execute(values);
    }
    
    
    //	관련 점용지 조회
    public	int	executeSearch_JuminCount(AppealBean Bean)
	{
    	if(Bean.getNAME().equals("")	||	Bean.getNAME() == null)
    		Bean.setNAME("%");
    	if(Bean.getSSN().equals("")	||	Bean.getSSN() == null)
    		Bean.setSSN("%");

    	Object[] values = {
				Bean.getSIGUNGU(),
				Bean.getNAME(),
				Bean.getSSN()
			};
		
		String sql = getMessageSourceAccessor().getMessage("Querys.facility.minwon.Search_JuminCount");
		return 	getJdbcTemplate().queryForInt(sql, values);
    }
    
    
    public	List	executeSearch_Depth()
	{
    	MinwonMapDao.Select_Depth	select_Depth	= minwonMap.new Select_Depth(getDataSource(), getMessageSourceAccessor());
    	
    	Object[] values = {};
		
		return select_Depth.execute(values);
    }
    
    //전승원 추가
    public	String	getRequest_No(Admin_BaseBean Bean)
	{
    	Object[] values = {Bean.getCORP_CD(), Bean.getGU_CODE()};
    	
		String sql = getMessageSourceAccessor().getMessage("Querys.facility.minwon.getRequest_No");
		Map Request_Map =  getJdbcTemplate().queryForMap(sql, values);
		return Request_Map.get("REQUEST_NO").toString();
	}
    
    //전승원 추가
    public	String	getObject_No(PlaceBean Bean)
	{
    	Object[] values = {Bean.getCORP_CD(), Bean.getGU_CODE()};

    	String sql = getMessageSourceAccessor().getMessage("Querys.facility.minwon.getObject_No");
    	Map Request_Map =getJdbcTemplate().queryForMap(sql, values);
    	return Request_Map.get("OBJECT_NO").toString();
	}
    
    //전승원 추가
    public	String	getAppeal_Check(AppealBean Bean)
	{
    	Object[] values = {Bean.getCORP_CD(), Bean.getGU_CODE()};
		String sql = getMessageSourceAccessor().getMessage("Querys.facility.minwon.getAppeal_Check");
		Map Request_Map =getJdbcTemplate().queryForMap(sql, values);
		return Request_Map.get("CORP_CD_COUNT").toString();
	}
    
    public	AppealBean	getAppeal(String corp_cd, String gu_code){	//EquipAppeal에서 값을 가져온다.
    
		//저장한후 저장한 EQUIP_ADMIN_BASE값을 가져온다.
		MinwonMapDao.GetEquipAppeal	getEquipAppeal	= minwonMap.new GetEquipAppeal(getDataSource(), getMessageSourceAccessor());
		System.out.println("####################### Start getAppeal Param ##########################################");
		System.out.println("corp_cd ==>" + corp_cd);
		System.out.println("gu_code ==>" + gu_code);
		System.out.println("#########################################################################################");
		Object[] values = {
				corp_cd,
				gu_code
		};
		
		List equipAppeal = getEquipAppeal.execute(values);
		
		AppealBean Bean = new AppealBean();
		
		for(int i = 0	;	i < equipAppeal.size()	;	i++)
		{
			Bean	= (AppealBean)equipAppeal.get(i);
		}
		
		return Bean;
    }
    
    
    public List adminBizSearch(String name,String manager,String gu_code, int startPage,int endPage){    	
    	
    	MinwonMapDao.Search	search	= minwonMap.new Search(getDataSource(), getMessageSourceAccessor());
    	
    	if(name.equals("")	||	name == null)
    		name	= "%";
    	
    	if(manager.equals("")	||	manager == null)
    		manager	= "%";
    	
    	Object[] values = {
    		"%" + name + "%",
    		"%"+ manager +"%",
    		gu_code,
    		new Integer(startPage),
    		new Integer(endPage)
    	};
    	
    	return search.execute(values);
    }
    
    public int adminBizSearchCount(String name, String manager, String gu_code){
    	
    	if(name.equals("")	||	name == null)
    		name	= "%";
    	
    	if(manager.equals("")	||	manager == null)
    		manager	= "%";
    	
    	Object[] values = {
    			"%" + name + "%",
        		"%"+ manager +"%",
        		gu_code
        	
        };
    	
		String sql = getMessageSourceAccessor().getMessage("Querys.facility.minwon.GetAdminBizSearchCount");
		return 	getJdbcTemplate().queryForInt(sql, values);
		
    }
    
  public AdminBizBean adminBizView(String gu_code, String corp_cd){
    	
	  MinwonMapDao.GetAdminBizView	getAdminBizView	= minwonMap.new GetAdminBizView(getDataSource(), getMessageSourceAccessor());
		
    	System.out.println(gu_code+":"+corp_cd);
    	
		Object[] values = {
				corp_cd,
				gu_code
		};
		
		List list = getAdminBizView.execute(values);
		
		
		System.out.println("list : "+list.size());
		
		AdminBizBean Bean = new AdminBizBean();
		
		if(list.size() >0 ){
			Bean	= (AdminBizBean)list.get(0);
		}

		return Bean;
    }
  
  public int  MaxAdminNo(String string){
	  
	   	Object[] values = {
			string
			};
		
		String sql = getMessageSourceAccessor().getMessage("Querys.facility.minwon.GetMaxAdminNo");
		return 	getJdbcTemplate().queryForInt(sql, values);
	  
  }
  
  public String GetRefDongName(String gu_code,String bj_cd){
	  
	  MinwonMapDao.GetRefDongName getRefDongName	= minwonMap.new GetRefDongName(getDataSource(), getMessageSourceAccessor());
	
	  
	  System.out.println(gu_code+" : "+bj_cd);
		Object[] values = {
				gu_code,
				bj_cd
		};
		
		List list = getRefDongName.execute(values);
		
		
		System.out.println("list : "+list.size());
		
		PlaceBean Bean = new PlaceBean();
		
		if(list.size() >0 ){
			Bean	= (PlaceBean)list.get(0);
		}

		return Bean.getSISUL_ADDR();
	  
	  
  }
  
  
}