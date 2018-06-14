package main.java.gapan.gapan.dao;

import java.util.List;
import java.util.Map;

import main.java.common.dao.RoadsJdbcDaoSupport;
import main.java.jumyong.minwon.dao.MinwonMapDao;
import main.java.gapan.gapan.dao.GapanMapDao.Search_Jumji;
import main.java.gapan.gapan.model.JumjiSearchBean;
import main.java.jumyong.minwon.model.MinwonBean;
import main.java.gapan.gapan.model.BloomBean;
import main.java.gapan.gapan.model.FamilyBean;
import main.java.gapan.gapan.model.GapanBaseBean;
import main.java.gapan.gapan.model.GapanBean;
import main.java.gapan.gapan.model.GapanHeadBean;
import main.java.gapan.gapan.model.GapanInfoBean;
import main.java.gapan.gapan.model.OperBean;


public class GapanDao	extends RoadsJdbcDaoSupport	implements	IGapanDao{
	
	private	GapanMapDao	gapanMap	= new GapanMapDao();
	
	
    protected	void	initDao()  throws Exception
    {
		super.initDao();
   	}
    
    //가판 list 조회
    public	List	executeSearch(GapanBean Bean, int intRn1,int intRn2)
	{
    	GapanMapDao.Search	search	= gapanMap.new Search(getDataSource(), getMessageSourceAccessor());
    	  	
    	String gpType = "%";
		String ftTypeCd = "%";
		String ftSelCd = "%";
		String sgTypeCd = "%";
		String sgSelCd = "%";
		String bjCd = "%";

    	if(!Bean.getGP_TYPE().equals("")	&&	Bean.getGP_TYPE() != null)
    		gpType = Bean.getGP_TYPE();
    	if(!Bean.getFT_TYPE_CD().equals("")	&&	Bean.getFT_TYPE_CD() != null)
    		ftTypeCd = Bean.getFT_TYPE_CD();
    	if(!Bean.getFT_SEL_CD().equals("")	&&	Bean.getFT_SEL_CD() != null)
    		ftSelCd = Bean.getFT_SEL_CD();    	
    	if(!Bean.getSG_TYPE_CD().equals("")	&&	Bean.getSG_TYPE_CD() != null)
    		sgTypeCd = Bean.getSG_TYPE_CD();
    	if(!Bean.getSG_SEL_CD().equals("")	&&	Bean.getSG_SEL_CD() != null)
    		sgSelCd = Bean.getSG_SEL_CD();
    	if(!Bean.getBJ_CD().equals("")	&&	Bean.getBJ_CD() == null)
    		bjCd = Bean.getBJ_CD();

    	Object[] values = {
    			gpType,
    			ftTypeCd,
    			ftSelCd,
    			sgTypeCd,
    			sgSelCd,
 //   			bjCd,
    			Bean.getFROM_DATE(),
    			Bean.getTO_DATE(),
    			"%" + Bean.getGAPAN_NO() + "%",
    			"%" + Bean.getOWNER_NAME() + "%",
    			"%" + Bean.getROAD_ADDR() + "%",
            	new Integer(intRn1),
            	new Integer(intRn2)
    	};
        //System.out.println("values="+Bean);	
        return search.execute(values);
	}
    
    //	전체 건수
    public	int		executeCount(GapanBean Bean)
	{
		String sql = getMessageSourceAccessor().getMessage("Querys.gapan.gapan.Count");
		
    	String gpType = "%";
		String ftTypeCd = "%";
		String ftSelCd = "%";
		String sgTypeCd = "%";
		String sgSelCd = "%";
		String bjCd = "%";

    	if(!Bean.getGP_TYPE().equals("")	&&	Bean.getGP_TYPE() != null)
    		gpType = Bean.getGP_TYPE();
    	if(!Bean.getFT_TYPE_CD().equals("")	&&	Bean.getFT_TYPE_CD() != null)
    		ftTypeCd = Bean.getFT_TYPE_CD();
    	if(!Bean.getFT_SEL_CD().equals("")	&&	Bean.getFT_SEL_CD() != null)
    		ftSelCd = Bean.getFT_SEL_CD();    	
    	if(!Bean.getSG_TYPE_CD().equals("")	&&	Bean.getSG_TYPE_CD() != null)
    		sgTypeCd = Bean.getSG_TYPE_CD();
    	if(!Bean.getSG_SEL_CD().equals("")	&&	Bean.getSG_SEL_CD() != null)
    		sgSelCd = Bean.getSG_SEL_CD();
    	if(!Bean.getBJ_CD().equals("")	&&	Bean.getBJ_CD() == null)
    		bjCd = Bean.getBJ_CD();

    	Object[] values = {
    			gpType,
    			ftTypeCd,
    			ftSelCd,
    			sgTypeCd,
    			sgSelCd,
//    			bjCd,
    			Bean.getFROM_DATE(),
    			Bean.getTO_DATE(),
    			"%" + Bean.getGAPAN_NO() + "%",
    			"%" + Bean.getOWNER_NAME() + "%",
    			"%" + Bean.getROAD_ADDR() + "%"
    	};
		
		return 	getJdbcTemplate().queryForInt(sql, values);
	}

    //운영자 조회
	public List getOperatorInfo(String gapanNo) {

		GapanMapDao.getOperatorInfo	operatorInfo = gapanMap.new getOperatorInfo(getDataSource(), getMessageSourceAccessor());
		
		Object[] values = {gapanNo};
		
		return operatorInfo.execute(values);
	}
    
	//직계가족 조회
	public FamilyBean getFamilyInfo(String gapanNo) {
		
		GapanMapDao.getFamilyInfo	familyInfo = gapanMap.new getFamilyInfo(getDataSource(), getMessageSourceAccessor());
		
		FamilyBean bean = (FamilyBean) familyInfo.findObject(gapanNo);

		return bean;
	}
	
    //시설 조회
	public BloomBean getBloomInfo(String gapanNo) {

		GapanMapDao.getBloomInfo	bloomInfo = gapanMap.new getBloomInfo(getDataSource(), getMessageSourceAccessor());
		
		BloomBean bean = (BloomBean) bloomInfo.findObject(gapanNo);

		return bean;
	}
    
	//운영 조회
	public OperBean getOperInfo(String gapanNo) {
		
		GapanMapDao.getOperInfo	operInfo = gapanMap.new getOperInfo(getDataSource(), getMessageSourceAccessor());
		
		OperBean bean = (OperBean) operInfo.findObject(gapanNo);

		return bean;
	}

	//ADMIN_NO 생성
    public	String	executeCheck_Gapanno(String gapan_num)
	{
    	//system.out.println("########################## Insert executeCheck_Gapanno ##############################");
    	//system.out.println("gapan_num =>" + gapan_num);
    	//system.out.println("#########################################################################");
    	Object[] values = {gapan_num};

    	String sql = getMessageSourceAccessor().getMessage("Querys.gapan.gapan.getGapanno");	
    	
    	//강남구, 노원구
    	String[] gangnamBj = {"680101", "680106", "680107", "680108", "680118", "350105"};
    	for(int i=0; i<gangnamBj.length; i++){
    		if(gapan_num.contains(gangnamBj[i])){
    			System.out.println("gangnamBj: "  + gangnamBj);
    			sql = getMessageSourceAccessor().getMessage("Querys.rojum.jumyong.getGapanno_gangNam");
    		}
    	}
    	Map Request_Map =getJdbcTemplate().queryForMap(sql, values);							//'_4_0001'의 형식으로 가져온다.
    	gapan_num = gapan_num + Request_Map.get("GAPAN_NO").toString();							//(구코드+법정동코드) + '_4_0001'
    	return gapan_num;
	}
    
    
    //	GAPAN_BASE 정보 등록
    public	boolean	executeGapan_Base_Register(GapanBaseBean Bean)
	{
    	GapanMapDao.Gapan_Base_Register	gapan_Base_Register	= gapanMap.new Gapan_Base_Register(getDataSource(), getMessageSourceAccessor());
    	try
		{
    		//system.out.println("########################## Insert executeGapan_Base_Register ##############################");
    		//system.out.println("Bean.getGAPAN_NO() =>"+Bean.getGAPAN_NO());
    		//system.out.println("Bean.getREG_DATE() =>"+Bean.getREG_DATE());
    		//system.out.println("Bean.getUP_DATE() =>"+Bean.getUP_DATE());
    		//system.out.println("Bean.getMANAGER() =>"+Bean.getMANAGER());
    		//system.out.println("Bean.getFINISH_ID() =>"+Bean.getFINISH_ID());
    		
    		//system.out.println("Bean.getCLOSE_DATE() =>"+Bean.getCLOSE_DATE());
    		//system.out.println("Bean.getGP_TYPE() =>"+Bean.getGP_TYPE());
    		//system.out.println("#########################################################################");
			
    		Object[] values = {
					Bean.getGAPAN_NO(),
					Bean.getREG_DATE(),
					Bean.getUP_DATE(),
					Bean.getMANAGER(),
					Bean.getFINISH_ID(),
					Bean.getCLOSE_DATE(),
					Bean.getGP_TYPE()
			};

			gapan_Base_Register.update(values);
		}
		catch (Exception e)
		{
			e.printStackTrace();
			return	false;
		}
		
		return	true;
	}
    
    //	민원정보 등록
    public	boolean	executeMinwon_Register(MinwonBean Bean)
	{
    	GapanMapDao.Gapan_Register	gapan_Register	= gapanMap.new Gapan_Register(getDataSource(), getMessageSourceAccessor());
    	
		try
		{
			/*System.out.println("########################## Insert executeMinwon_Register ##############################");
			System.out.println("Bean.getADMIN_NO_MIN() =>" + Bean.getADMIN_NO_MIN());
			System.out.println("Bean.getREQ_NO_MIN() =>" + Bean.getREQ_NO_MIN());
			System.out.println("Bean.getREQ_DATE_MIN() =>" + Bean.getREQ_DATE_MIN());
			System.out.println("Bean.getREQ_NM_MIN() =>" + Bean.getREQ_NM_MIN());
			System.out.println("Bean.getMANAGER_MIN() =>" + Bean.getMANAGER_MIN());
			
			System.out.println("Bean.getGUBUN_MIN() =>" + Bean.getGUBUN_MIN());
			System.out.println("Bean.getAGENT_NM_MIN() =>" + Bean.getAGENT_NM_MIN());
			System.out.println("Bean.getAGENT_TEL_MIN() =>" + Bean.getAGENT_TEL_MIN());
			System.out.println("Bean.getEVENT_SET_MIN() =>" + Bean.getEVENT_SET_MIN());
			System.out.println("Bean.getREQ_SET_MIN() =>" + Bean.getREQ_SET_MIN());
			
			System.out.println("Bean.getREQ_SIGU_MIN() =>" + Bean.getREQ_SIGU_MIN());
			System.out.println("Bean.getREQ_DEP_MIN() =>" + Bean.getREQ_DEP_MIN());
			System.out.println("Bean.getREQ_SET_CN_MIN() =>" + Bean.getREQ_SET_CN_MIN());
			System.out.println("Bean.getBIZSSN_MIN() =>" + Bean.getBIZSSN_MIN());
			System.out.println("Bean.getMANAGE_DEP_MIN() =>" + Bean.getMANAGE_DEP_MIN());
			
			System.out.println("Bean.getNOTES_MIN() =>" + Bean.getNOTES_MIN());
			System.out.println("Bean.getPREDATE_MIN() =>" + Bean.getPREDATE_MIN());
			System.out.println("Bean.getSSN_MIN() =>" + Bean.getSSN_MIN());
			System.out.println("Bean.getNAME_MIN() =>" + Bean.getNAME_MIN());
			System.out.println("Bean.getTEL_MIN() =>" + Bean.getTEL_MIN());
			
			System.out.println("Bean.getHP_MIN() =>" + Bean.getHP_MIN());
			System.out.println("Bean.getADDR1_MIN() =>" + Bean.getADDR1_MIN());
			System.out.println("Bean.getADDR2_MIN() =>" + Bean.getADDR2_MIN());
			System.out.println("Bean.getPOST_MIN() =>" + Bean.getPOST_MIN());
			System.out.println("Bean.getREAL_DEAL_DATE_MIN() =>" + Bean.getREAL_DEAL_DATE_MIN());
			
			System.out.println("Bean.getMW_PROG_SE_MIN() =>" + Bean.getMW_PROG_SE_MIN());
			System.out.println("Bean.getEMAIL_MIN() =>" + Bean.getEMAIL_MIN());
			System.out.println("#########################################################################");
			*/
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
			};

			gapan_Register.update(values);
		}
		catch (Exception e)
		{
			e.printStackTrace();
			return	false;
		}
		
		return	true;
    }
    
    //가판 운영자, 동업자 정보 등록
    public	boolean	executeGapan_Head_Register(GapanHeadBean Bean)
	{
    	GapanMapDao.Gapan_Head_Register	gapan_Head_Register	= gapanMap.new Gapan_Head_Register(getDataSource(), getMessageSourceAccessor());
    	
		try
		{
			System.out.println("########################## Insert executeGapan_Head_Register ##############################");
			/*System.out.println("Bean.getGAPAN_NO() =>" + Bean.getGAPAN_NO());
			System.out.println("Bean.getOWNER_NAME() =>" + Bean.getOWNER_NAME());
			System.out.println("Bean.getOWNER_IDCHK() =>" + Bean.getOWNER_IDCHK());
			System.out.println("Bean.getOWNER_SSN() =>" + Bean.getOWNER_SSN());
			System.out.println("Bean.getOWNER_IMG =>" + Bean.getOWNER_IMG_NAME());
			
			System.out.println("Bean.getOWNER_GENDER() =>" + Bean.getOWNER_GENDER());
			System.out.println("Bean.getOWNER_AGE() =>" + Bean.getOWNER_AGE());
			System.out.println("Bean.getOWNER_TEL =>" + Bean.getOWNER_TEL());
			System.out.println("Bean.getOWNER_HP() =>" + Bean.getOWNER_HP());
			System.out.println("Bean.getOWNER_POST() =>" + Bean.getOWNER_POST());
			
			System.out.println("Bean.getOWNER_ADDR1() =>" + Bean.getOWNER_ADDR1());
			System.out.println("Bean.getOWNER_ADDR2() =>" + Bean.getOWNER_ADDR2());
			System.out.println("Bean.getOWNER_TOPOST() =>" + Bean.getOWNER_TOPOST());
			System.out.println("Bean.getOWNER_TOADDR1() =>" + Bean.getOWNER_TOADDR1());
			System.out.println("Bean.getOWNER_TOADDR2() =>" + Bean.getOWNER_TOADDR2());
			
			System.out.println("Bean.getLC_SEL() =>" + Bean.getLC_SEL());
			System.out.println("Bean.getLC_TXT() =>" + Bean.getLC_TXT());
			System.out.println("Bean.getRT_SEL() =>" + Bean.getRT_SEL());
			System.out.println("Bean.getRT_TXT() =>" + Bean.getRT_TXT());
			System.out.println("Bean.getESTATE_MOVE() =>" + Bean.getESTATE_MOVE());
			
			System.out.println("Bean.getESTATE_REAL() =>" + Bean.getESTATE_REAL());
			System.out.println("Bean.getGP_TYP() =>" + Bean.getGP_TYP());
			System.out.println("Bean.getPARTN_NAME() =>" + Bean.getPARTN_NAME());
			System.out.println("Bean.getPT_SEL() =>" + Bean.getPT_SEL());
			System.out.println("Bean.getPARTN_SSN() =>" + Bean.getPARTN_SSN());
			
			System.out.println("Bean.getPARTN_IMG() =>" + Bean.getPARTN_IMG_NAME());
			System.out.println("Bean.getPARTN_GENDER() =>" + Bean.getPARTN_GENDER());
			System.out.println("Bean.getPARTN_AGE() =>" + Bean.getPARTN_AGE());
			System.out.println("Bean.getPARTN_TEL() =>" + Bean.getPARTN_TEL());
			System.out.println("Bean.getPARTN_HP() =>" + Bean.getPARTN_HP());
			
			System.out.println("Bean.getPARTN_POST() =>" + Bean.getPARTN_POST());
			System.out.println("Bean.getPARTN_ADDR1() =>" + Bean.getPARTN_ADDR1());
			System.out.println("Bean.getPARTN_ADDR2() =>" + Bean.getPARTN_ADDR2());
			System.out.println("Bean.getPARTN_TOPOST() =>" + Bean.getPARTN_TOPOST());
			System.out.println("Bean.getPARTN_TOADDR1() =>" + Bean.getPARTN_TOADDR1());
			
			System.out.println("Bean.getPARTN_TOADDR2() =>" + Bean.getPARTN_TOADDR2());
			System.out.println("Bean.getOWNER_JIBUN() =>" + Bean.getOWNER_JIBUN());
			System.out.println("Bean.getOWNER_SAN() =>" + Bean.getOWNER_SAN());
			System.out.println("Bean.getOWNER_TOJIBUN() =>" + Bean.getOWNER_TOJIBUN());
			System.out.println("Bean.getOWNER_TOSAN() =>" + Bean.getOWNER_TOSAN());
			
			System.out.println("Bean.getPARTN_JIBUN() =>" + Bean.getPARTN_JIBUN());
			System.out.println("Bean.getPARTN_SAN() =>" + Bean.getPARTN_SAN());
			System.out.println("Bean.getPARTN_TOJIBUN() =>" + Bean.getPARTN_TOJIBUN());
			System.out.println("Bean.getPARTN_TOSAN() =>" + Bean.getPARTN_TOSAN());
			System.out.println("Bean.getADDR_CHECK1() =>" + Bean.getADDR_CHECK1());
			
			System.out.println("Bean.getADDR_CHECK2() =>" + Bean.getADDR_CHECK2());
			System.out.println("#########################################################################");
			*/
			Object[] values = {
					Bean.getGAPAN_NO(),
					Bean.getOWNER_NAME(),
					Bean.getOWNER_IDCHK(),
					Bean.getOWNER_SSN(),
					Bean.getOWNER_IMG_NAME(),
					
					Bean.getOWNER_GENDER(),
					Bean.getOWNER_AGE(),
					Bean.getOWNER_TEL(),
					Bean.getOWNER_HP(),
					Bean.getOWNER_POST(),
					
					Bean.getOWNER_ADDR1(),
					Bean.getOWNER_ADDR2(),
					Bean.getOWNER_TOPOST(),        
					Bean.getOWNER_TOADDR1(),       
					Bean.getOWNER_TOADDR2(),       
					
					Bean.getLC_SEL(),              
					Bean.getLC_TXT(),              
					Bean.getRT_SEL(),              
					Bean.getRT_TXT(),              
					Bean.getESTATE_MOVE(),         
					
					Bean.getESTATE_REAL(),         
					Bean.getGP_TYP(),
					Bean.getPARTN_NAME(),          
					Bean.getPT_SEL(),              
					Bean.getPARTN_SSN(),           
					
					Bean.getPARTN_IMG_NAME(),           
					Bean.getPARTN_GENDER(),        
					Bean.getPARTN_AGE(),           
					Bean.getPARTN_TEL(),           
					Bean.getPARTN_HP(),            
					
					Bean.getPARTN_POST(),          
					Bean.getPARTN_ADDR1(),         
					Bean.getPARTN_ADDR2(),         
					Bean.getPARTN_TOPOST(),        
					Bean.getPARTN_TOADDR1(),       
					
					Bean.getPARTN_TOADDR2(),
					Bean.getOWNER_JIBUN(),
					Bean.getOWNER_SAN(),
					Bean.getOWNER_TOJIBUN(),
					Bean.getOWNER_TOSAN(),
					
					Bean.getPARTN_JIBUN(),
					Bean.getPARTN_SAN(),
					Bean.getPARTN_TOJIBUN(),
					Bean.getPARTN_TOSAN(),
					Bean.getADDR_CHECK1(),
					
					Bean.getADDR_CHECK2(),
					Bean.getNOTE(),
					
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
					Bean.getTOBD_DET_NM() 
			};

			gapan_Head_Register.update(values);
		}
		catch (Exception e)
		{
			e.printStackTrace();
			return	false;
		}
		
		return	true;
    }
    
//  가판 운영자, 동업자 정보 등록
    public	boolean	executeGapan_Info_Register(GapanInfoBean Bean)
	{
    	GapanMapDao.Gapan_Info_Register	gapan_Info_Register	= gapanMap.new Gapan_Info_Register(getDataSource(), getMessageSourceAccessor());
    	
		try
		{
			Object[] values = {
					Bean.getGAPAN_NO(),
					Bean.getX_COORD(),
					Bean.getY_COORD(),
					Bean.getGP_TYP(),
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
					Bean.getHJ_CD()
			};

			gapan_Info_Register.update(values);
		}
		catch (Exception e)
		{
			e.printStackTrace();
			return	false;
		}
		
		return	true;
    }
    
//	관련 점용지 조회
    public	List	executeSearch_Jumji(JumjiSearchBean Bean, int intRn1, int intRn2)
	{
    	GapanMapDao.Search_Jumji	search_Jumji	= gapanMap.new Search_Jumji(getDataSource(), getMessageSourceAccessor());
    	
    	if(Bean.getSPC_CD().equals("")	||	Bean.getSPC_CD() == null)
    		Bean.setSPC_CD("%");
    	if(Bean.getBJ_CD().equals("")	||	Bean.getBJ_CD() == null)
    		Bean.setBJ_CD("%");
    	
    	String SSN1 = "%" + Bean.getSSN1() + "%";
    	String SSN2 = "%" + Bean.getSSN2() + "%";
    	String BONBUN = "%" + Bean.getBONBUN() + "%"; 
    	String BUBUN = "%" + Bean.getBUBUN() + "%";
    	String GAPAN_NO = "%" + Bean.getGAPAN_NO() + "%"; 
    	String NAME = "%" + Bean.getNAME() + "%";
    	
    	/*System.out.println("###########################   executeSearch_Jumji    ##############################");
    	System.out.println("Bean.getSIDO()==>"+Bean.getSIDO());
    	System.out.println("Bean.getSIGUNGU()==>"+Bean.getSIGUNGU());
    	System.out.println("GAPAN_NO==>"+GAPAN_NO);
    	System.out.println("NAME==>"+NAME);
    	System.out.println("SSN1==>"+SSN1);
    	
    	System.out.println("SSN2==>"+SSN2);
    	System.out.println("Bean.getBJ_CD()==>"+Bean.getBJ_CD());
    	System.out.println("Bean.getSPC_CD()==>"+Bean.getSPC_CD());
    	System.out.println("BONBUN==>"+BONBUN);
    	System.out.println("BUBUN==>"+BUBUN);
    	
    	System.out.println("intRn1==>"+intRn1);
    	System.out.println("intRn2==>"+intRn2);
    	System.out.println("###################################################################################");
    	*/
		Object[] values = {
				Bean.getSIDO(),
				Bean.getSIGUNGU(),
				GAPAN_NO,
				NAME,
				SSN1,
				
				SSN2,
				Bean.getBJ_CD(),
				Bean.getSPC_CD(),
				BONBUN,
				BUBUN,
				
	        	new Integer(intRn1),
	        	new Integer(intRn2)
			};
			
		return search_Jumji.execute(values);
    }


    //	관련 점용지 조회
    public	int	executeSearch_JumjiCount(JumjiSearchBean Bean)
	{
    	if(Bean.getSPC_CD().equals("")	||	Bean.getSPC_CD() == null)
    		Bean.setSPC_CD("%");
    	if(Bean.getBJ_CD().equals("")	||	Bean.getBJ_CD() == null)
    		Bean.setBJ_CD("%");
    	
    	String SSN1 = "%" + Bean.getSSN1() + "%";
    	String SSN2 = "%" + Bean.getSSN2() + "%";
    	String BONBUN = "%" + Bean.getBONBUN() + "%"; 
    	String BUBUN = "%" + Bean.getBUBUN() + "%";
    	String GAPAN_NO = "%" + Bean.getGAPAN_NO() + "%";
   		String NAME = "%" + Bean.getNAME() + "%";
    	
    	/*System.out.println("##############################  executeSearch_JumjiCount  ############################");
    	System.out.println("Bean.getSIDO()==>"+Bean.getSIDO());
    	System.out.println("Bean.getSIGUNGU()==>"+Bean.getSIGUNGU());
    	System.out.println("GAPAN_NO==>"+GAPAN_NO);
    	System.out.println("NAME==>"+NAME);
    	System.out.println("Bean.getSSN1()==>"+SSN1);
    	
    	System.out.println("Bean.getSSN2()==>"+SSN2);
    	System.out.println("Bean.getBJ_CD()==>"+Bean.getBJ_CD());
    	System.out.println("Bean.getSPC_CD()==>"+Bean.getSPC_CD());
    	System.out.println("BONBUN==>"+BONBUN);
    	System.out.println("BUBUN==>"+BUBUN);
    	System.out.println("######################################################################################");
    	*/
    	
		Object[] values = {
				Bean.getSIDO(),
				Bean.getSIGUNGU(),
				GAPAN_NO,
				NAME,
				SSN1,
				
				SSN2,
				Bean.getBJ_CD(),
				Bean.getSPC_CD(),
				BONBUN,
				BUBUN
			};
			
		String sql = getMessageSourceAccessor().getMessage("Querys.gapan.gapan.Search_JumjiCount");
		return 	getJdbcTemplate().queryForInt(sql, values);
    } 
}
