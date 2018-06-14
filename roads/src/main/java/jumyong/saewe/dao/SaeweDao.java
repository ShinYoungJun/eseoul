//	2009		Kim Yun Seo

package main.java.jumyong.saewe.dao;

import java.util.List;
import java.util.Map;

import main.java.common.dao.RoadsJdbcDaoSupport;
import main.java.common.util.Debug;
import main.java.jumyong.jumyonginfo.dao.MinwoninfoMapDao;
import main.java.jumyong.saewe.dao.SaeweMapDao;
import main.java.jumyong.saewe.model.BugwaSearchBean;
import main.java.jumyong.saewe.model.TaxationBean;


public class SaeweDao	extends RoadsJdbcDaoSupport	implements	ISaeweDao{
	
	private	SaeweMapDao	saeweMap	= new SaeweMapDao();
	
	
    protected	void	initDao()  throws Exception
    {
		super.initDao();
   	}
    
    //	검색
    public	List	executeSearch(BugwaSearchBean Bean, int intRn1,int intRn2)
	{
    	SaeweMapDao.Search	search	= saeweMap.new Search(getDataSource(), getMessageSourceAccessor());
    	
    	String	PURPOSE_CD	= Bean.getPURPOSE_CD();
    	
       	if(Bean.getTYPE().equals("")	||	Bean.getTYPE() == null)
    		Bean.setTYPE("%");
    	if(Bean.getSECTION().equals("")	||	Bean.getSECTION() == null)
    		Bean.setSECTION("%");
    	if(Bean.getOWNER_SET().equals("")	||	Bean.getOWNER_SET() == null)
    		Bean.setOWNER_SET("%");
    	if(Bean.getTAX_SET().equals("")	||	Bean.getTAX_SET() == null)
    		Bean.setTAX_SET("%");
    	if(Bean.getBONBUN().equals("")	||	Bean.getBONBUN() == null)
    		Bean.setBONBUN("%");
    	if(Bean.getBUBUN().equals("")	||	Bean.getBUBUN() == null)
    		Bean.setBUBUN("%");
    	if(Bean.getPURPOSE_CD() == null || "000".equals(Bean.getPURPOSE_CD())	||	"".equals(Bean.getPURPOSE_CD()))
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
    		Bean.setCAL_YN("%");
    	
    	// 	 점용목적 조건 
    	String str1 = "";
    	String str2 = "";
    	String str3 = "";
    	if(Bean.getPURPOSE_CD().length()>1)
    	{
	    	str1 = Bean.getPURPOSE_CD().substring(0,1);
	    	str2 = Bean.getPURPOSE_CD().substring(1,2);
	    	str3 = Bean.getPURPOSE_CD().substring(2,3);
    	}

   		if(Bean.getPURPOSE_CD() == null || "".equals(Bean.getPURPOSE_CD()))
   		{
   			PURPOSE_CD = "%";
    	}
   		else if(str3.equals("0"))
    	{
    		if(str2.equals("0"))
    		{
    			PURPOSE_CD = str1+"%";
    		}
    		else
    		{
    			PURPOSE_CD = str1+str2+"%";
    		}
    	}
    	
    	Object[] values = {
    			Bean.getGIGAN1(),
    			Bean.getGIGAN2(),
    			Bean.getYEAR(),
    			Bean.getTYPE(),
    			Bean.getSECTION(),
    			Bean.getOWNER_SET(),
    			
    			Bean.getTAX_SET(),
    			PURPOSE_CD,
    			Bean.getBJ_CD(),
    			Bean.getHJ_CD(),
    			Bean.getBONBUN(),
    			
    			Bean.getBUBUN(),
    			"%" + Bean.getNAME() + "%",
    			"%" + Bean.getADMINNO() + "%",
    			Bean.getREFUND_YN(),
    			Bean.getSIDO(),
    			
    			Bean.getSIGUNGU(),
    			Bean.getTAX_YN(),
    			Bean.getCAL_YN(),
	        	new Integer(intRn1),
	        	new Integer(intRn2)
    	};
    	
    	System.out.println("################################         executeSearch          #########################################");
    	System.out.println("Bean.getGIGAN1()==>"+Bean.getGIGAN1());
    	System.out.println("Bean.getGIGAN2()==>"+Bean.getGIGAN2());
//    	System.out.println("Bean.getUSE_SECTION()==>"+Bean.getUSE_SECTION());
    	System.out.println("Bean.getTYPE()==>"+Bean.getTYPE());
    	System.out.println("Bean.getSECTION()==>"+Bean.getSECTION());
    	System.out.println("Bean.getOWNER_SET()==>"+Bean.getOWNER_SET());
    	
    	System.out.println("Bean.getTAX_SET()==>"+Bean.getTAX_SET());
    	System.out.println("PURPOSE_CD==>"+PURPOSE_CD);
    	System.out.println("Bean.getBJ_CD()==>"+Bean.getBJ_CD());
    	System.out.println("Bean.getHJ_CD()==>"+Bean.getHJ_CD());
    	System.out.println("Bean.getBONBUN()==>"+ "%" + Bean.getBONBUN() + "%");

    	System.out.println("Bean.getBUBUN()==>"+"%" + Bean.getBUBUN() + "%");
    	System.out.println("Bean.getNAME()==>"+"%" + Bean.getNAME() + "%");
    	System.out.println("Bean.getADMINNO()==>"+"%" + Bean.getADMINNO() + "%");
    	System.out.println("Bean.getREFUND_YN()==>"+Bean.getREFUND_YN());
    	System.out.println("Bean.getSIDO()==>"+Bean.getSIDO());
    	
    	System.out.println("Bean.getSIGUNGU()==>"+Bean.getSIGUNGU());
    	System.out.println("Bean.getTAX_YN()==>"+Bean.getTAX_YN());
    	System.out.println("Bean.getCAL_YN()==>"+Bean.getCAL_YN());
    	System.out.println("intRn1==>"+intRn1);
    	System.out.println("intRn2==>"+intRn2);
    	System.out.println("################################################################################################################");
    	
    	logger.debug("query ::: " + Debug.toQueryString(search.getSql(), values));
    	return search.execute(values);
	}
    
    //	전체 건수
    public	int		executeCount(BugwaSearchBean Bean)
	{
    	String	PURPOSE_CD	= Bean.getPURPOSE_CD();
    	
//    	if(Bean.getUSE_SECTION().equals("")	||	Bean.getUSE_SECTION() == null)
//    		Bean.setUSE_SECTION("%");
    	if(Bean.getTYPE().equals("")	||	Bean.getTYPE() == null)
    		Bean.setTYPE("%");
    	if(Bean.getSECTION().equals("")	||	Bean.getSECTION() == null)
    		Bean.setSECTION("%");
    	if(Bean.getOWNER_SET().equals("")	||	Bean.getOWNER_SET() == null)
    		Bean.setOWNER_SET("%");
    	if(Bean.getTAX_SET().equals("")	||	Bean.getTAX_SET() == null)
    		Bean.setTAX_SET("%");
    	if(Bean.getPURPOSE_CD() == null || "000".equals(Bean.getPURPOSE_CD())	||	"".equals(Bean.getPURPOSE_CD()))
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
    		Bean.setCAL_YN("%");
    	if(Bean.getBONBUN().equals("")	||	Bean.getBONBUN() == null)
    		Bean.setBONBUN("%");
    	if(Bean.getBUBUN().equals("")	||	Bean.getBUBUN() == null)
    		Bean.setBUBUN("%");
    	
    	
    	// 	 점용목적 조건 
    	String str1 = "";
    	String str2 = "";
    	String str3 = "";
    	if(Bean.getPURPOSE_CD().length()>1)
    	{
	    	str1 = Bean.getPURPOSE_CD().substring(0,1);
	    	str2 = Bean.getPURPOSE_CD().substring(1,2);
	    	str3 = Bean.getPURPOSE_CD().substring(2,3);
    	}

   		if(Bean.getPURPOSE_CD() == null || "".equals(Bean.getPURPOSE_CD()))
   		{
   			PURPOSE_CD = "%";
    	}
   		else if(str3.equals("0"))
    	{
    		if(str2.equals("0"))
    		{
    			PURPOSE_CD = str1+"%";
    		}
    		else
    		{
    			PURPOSE_CD = str1+str2+"%";
    		}
    	}
    	
    	Object[] values = {
    			Bean.getGIGAN1(),
    			Bean.getGIGAN2(),
    			Bean.getYEAR(),
    			//Bean.getUSE_SECTION(),
    			Bean.getTYPE(),
    			Bean.getSECTION(),
    			Bean.getOWNER_SET(),
    			
    			Bean.getTAX_SET(),
    			PURPOSE_CD,
    			Bean.getBJ_CD(),
    			Bean.getHJ_CD(),
    			Bean.getBONBUN(),
    			Bean.getBUBUN(),
    			"%" + Bean.getNAME() + "%",
    			"%" + Bean.getADMINNO() + "%",    			
    			Bean.getREFUND_YN(),
    			Bean.getSIDO(),

    			Bean.getSIGUNGU(),
    			Bean.getTAX_YN(),
    			Bean.getCAL_YN(),
    	};
    	
    	System.out.println("################################         executeCount          #########################################");
    	System.out.println("Bean.getGIGAN1()==>"+Bean.getGIGAN1());
    	System.out.println("Bean.getGIGAN2()==>"+Bean.getGIGAN2());
    	System.out.println("Bean.getYEAR()==>"+Bean.getYEAR());
    	System.out.println("Bean.getTYPE()==>"+Bean.getTYPE());
    	System.out.println("Bean.getSECTION()==>"+Bean.getSECTION());
    	System.out.println("Bean.getOWNER_SET()==>"+Bean.getOWNER_SET());
    	
    	System.out.println("Bean.getTAX_SET()==>"+Bean.getTAX_SET());
    	System.out.println("PURPOSE_CD==>"+PURPOSE_CD);
    	System.out.println("Bean.getBJ_CD()==>"+Bean.getBJ_CD());
    	System.out.println("Bean.getHJ_CD()==>"+Bean.getHJ_CD());
    	System.out.println("Bean.getBONBUN()==>"+ "%" + Bean.getBONBUN() + "%");

    	System.out.println("Bean.getBUBUN()==>"+"%" + Bean.getBUBUN() + "%");
    	System.out.println("Bean.getNAME()==>"+"%" + Bean.getNAME() + "%");
    	System.out.println("Bean.getADMINNO()==>"+"%" + Bean.getADMINNO() + "%");
    	System.out.println("Bean.getREFUND_YN()==>"+Bean.getREFUND_YN());
    	System.out.println("Bean.getSIDO()==>"+Bean.getSIDO());
    	
    	System.out.println("Bean.getSIGUNGU()==>"+Bean.getSIGUNGU());
    	System.out.println("Bean.getTAX_YN()==>"+Bean.getTAX_YN());
    	System.out.println("Bean.getCAL_YN()==>"+Bean.getCAL_YN());
    	System.out.println("################################################################################################################");
    	
		String sql = getMessageSourceAccessor().getMessage("Querys.jumyong.saewe.Count");
	
		return 	getJdbcTemplate().queryForInt(sql, values);
	}
    
    //	일괄부과를위한 부과정보조회
    public	List	executeSearch_Ilgwal(BugwaSearchBean Bean)
	{
    	SaeweMapDao.Search_Ilgwal	searchIlgwal	= saeweMap.new Search_Ilgwal(getDataSource(), getMessageSourceAccessor());

    	String	PURPOSE_CD	= Bean.getPURPOSE_CD();
    	
//    	if(Bean.getUSE_SECTION().equals("")	||	Bean.getUSE_SECTION() == null)
//    		Bean.setUSE_SECTION("%");
    	if(Bean.getTYPE().equals("")	||	Bean.getTYPE() == null)
    		Bean.setTYPE("%");
    	if(Bean.getSECTION().equals("")	||	Bean.getSECTION() == null)
    		Bean.setSECTION("%");
    	if(Bean.getOWNER_SET().equals("")	||	Bean.getOWNER_SET() == null)
    		Bean.setOWNER_SET("%");
    	if(Bean.getTAX_SET().equals("")	||	Bean.getTAX_SET() == null)
    		Bean.setTAX_SET("%");
    	if(Bean.getPURPOSE_CD() == null || "000".equals(Bean.getPURPOSE_CD())	||	"".equals(Bean.getPURPOSE_CD()))
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
    		Bean.setCAL_YN("%");
    	
    	System.out.println("################################         executeSearch_Ilgwal          #########################################");
    	System.out.println("Bean.getGIGAN1()==>"+Bean.getGIGAN1());
    	System.out.println("Bean.getGIGAN2()==>"+Bean.getGIGAN2());
//    	System.out.println("Bean.getUSE_SECTION()==>"+Bean.getUSE_SECTION());
    	System.out.println("Bean.getTYPE()==>"+Bean.getTYPE());
    	System.out.println("Bean.getSECTION()==>"+Bean.getSECTION());
    	System.out.println("Bean.getOWNER_SET()==>"+Bean.getOWNER_SET());

    	System.out.println("Bean.getTAX_SET()==>"+Bean.getTAX_SET());
    	System.out.println("PURPOSE_CD==>"+PURPOSE_CD);
    	System.out.println("Bean.getBJ_CD()==>"+Bean.getBJ_CD());
    	System.out.println("Bean.getHJ_CD()==>"+Bean.getHJ_CD());
    	System.out.println("Bean.getBONBUN()==>"+ "%" + Bean.getBONBUN() + "%");

    	System.out.println("Bean.getBUBUN()==>"+"%" + Bean.getBUBUN() + "%");
    	System.out.println("Bean.getNAME()==>"+"%" + Bean.getNAME() + "%");
    	System.out.println("Bean.getADMINNO()==>"+"%" + Bean.getADMINNO() + "%");
    	System.out.println("Bean.getTAX_YN()==>"+Bean.getTAX_YN());
    	System.out.println("Bean.getCAL_YN()==>"+Bean.getCAL_YN());
    	
    	System.out.println("Bean.getREFUND_YN()==>"+Bean.getREFUND_YN());
    	System.out.println("Bean.getSIDO()==>"+Bean.getSIDO());
    	System.out.println("Bean.getSIGUNGU()==>"+Bean.getSIGUNGU());
    	System.out.println("################################################################################################################");
    	
    	Object[] values = {
    			Bean.getGIGAN1(),
    			Bean.getGIGAN2(),
//    			Bean.getUSE_SECTION(),
    			Bean.getTYPE(),
    			Bean.getSECTION(),
    			Bean.getOWNER_SET(),

    			Bean.getTAX_SET(),
    			PURPOSE_CD,
    			Bean.getBJ_CD(),
    			Bean.getHJ_CD(),
    			"%" + Bean.getBONBUN() + "%",

    			"%" + Bean.getBUBUN() + "%",
    			"%" + Bean.getNAME() + "%",
    			"%" + Bean.getADMINNO() + "%",
    			Bean.getTAX_YN(),
    			Bean.getCAL_YN(),
    			
    			Bean.getREFUND_YN(),
    			Bean.getSIDO(),
    			Bean.getSIGUNGU()
    	};

    	return searchIlgwal.execute(values);
	}
    
    //	산출내역 검색
    public	List	executeSanchulSearch(String strAdmin_no, String strSeq, int intRn1,int intRn2)
	{
    	SaeweMapDao.SanchulSearch	sanchulSearch	= saeweMap.new SanchulSearch(getDataSource(), getMessageSourceAccessor());
    	
    	Object[] values = {
    		strAdmin_no,
    		strSeq,
        	new Integer(intRn1),
        	new Integer(intRn2)
    	};
    	
    	return sanchulSearch.execute(values);
	}
    
    //	산출내역 전체 건수
    public	int		executeSanchulCount(String strAdmin_no, String strSeq)
	{
    	Object[] values = {
    			strAdmin_no,
    			strSeq
            };
    	
		String sql = getMessageSourceAccessor().getMessage("Querys.jumyong.saewe.SanchulCount");
		return 	getJdbcTemplate().queryForInt(sql, values);
	}
    
    //	산출정보 자세히 보기
    public	List	executeSanchulInfo_View(String strAdmin_no, String strSeq)
	{
    	SaeweMapDao.SanchulInfo_View	sanchulInfo_View	= saeweMap.new SanchulInfo_View(getDataSource(), getMessageSourceAccessor());
    	
    	Object[] values = {
    		strAdmin_no,
    		strSeq
    	};
    	
    	return sanchulInfo_View.execute(values);
	}
    
    //	점용인정보 보기
    public	List	executeJumin_View(String strAdmin_no)
	{
    	SaeweMapDao.Jumin_View	jumin_View	= saeweMap.new Jumin_View(getDataSource(), getMessageSourceAccessor());
    	
    	Object[] values = {strAdmin_no};
    	
    	return jumin_View.execute(values);
	}
    
    //	점용지정보 보기
    public	List	executeJumji_View(String strAdmin_no)
	{
    	SaeweMapDao.Jumji_View	jumji_View	= saeweMap.new Jumji_View(getDataSource(), getMessageSourceAccessor());
    	
    	Object[] values = {strAdmin_no};
    	
    	return jumji_View.execute(values);
	}
    
    //	부과정보 상세보기
    public	List	executeBugwa_View(String strAdmin_no, String strSeq)
	{
    	SaeweMapDao.Bugwa_View	bugwa_View	= saeweMap.new Bugwa_View(getDataSource(), getMessageSourceAccessor());
    	
    	Object[] values = {
    		strAdmin_no,
    		strSeq
    	};
    	
    	logger.debug("query - Querys.jumyong.saewe.Bugwa_View : \n" + Debug.toQueryString(bugwa_View.getSql(), values));
    	return bugwa_View.execute(values);
	}
    
    
    //	부과정보 수정
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
					
					Bean.getYEAR(),
					Bean.getADMIN_NO(),
					Bean.getSEQ()
			};

			logger.debug(String.format("\n%s\n", Debug.toQueryString(bugwa_Modify.getSql(), values)));
			int ret = bugwa_Modify.update(values);
			logger.info(String.format("update = %d", ret));
		}
		catch (Exception e)
		{
			e.printStackTrace();
			return	false;
		}
		
		return	true;
    }
    
    
    //	부과정보 입력
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
					Bean.getTAXPAYER_ID(),
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
					Bean.getOCR_BUSEO_CD(),
					Bean.getFORM1(),
					
					Bean.getFORM2()
				};
			logger.fatal("query ::: " + Debug.toQueryString(bugwa_Register.getSql(), values));
			bugwa_Register.update(values);
		}
		catch (Exception e)
		{
			e.printStackTrace();
			return	false;
		}
		
		return	true;
    }
    
    
    //	부과정보에 필요한 점용인, 점용지 정보를 가져온다.
    public	List	executeBugwa_DataInfo(String strAdmin_no, String strSeq)
	{
    	SaeweMapDao.Bugwa_DataInfo	bugwa_DataInfo	= saeweMap.new Bugwa_DataInfo(getDataSource(), getMessageSourceAccessor());
    	
    	Object[] values = {
    		strAdmin_no,
    		strSeq
    	};
    	logger.debug(String.format("query : Querys.jumyong.saewe.Bugwa_DataInfo \n%s", Debug.toQueryString(bugwa_DataInfo.getSql(), values)));
    	return bugwa_DataInfo.execute(values);
	}
    
//	부과정보 입력
    public	boolean	deleteBugwaDataInfo(String adminNo, String seq)
	{
    	SaeweMapDao.BugwaDelete	bugwaDelete	= saeweMap.new BugwaDelete(getDataSource(), getMessageSourceAccessor());
    	
		try
		{
			Object[] values = {adminNo,seq};
			bugwaDelete.update(values);
		}
		catch (Exception e)
		{
			e.printStackTrace();
			return	false;
		}
		
		return	true;
    }
    

    //	세외수입 부과		-	부과정보 테이블에 부과 여부 확인
    public	List	SaeweSuipBugwa_Check(String strAdmin_no, String strSeq)
	{
    	SaeweMapDao.SaeweSuipBugwa_Check	saeweSuipBugwa_Check	= saeweMap.new SaeweSuipBugwa_Check(getDataSource(), getMessageSourceAccessor());
    	
    	Object[] values = {
    		strAdmin_no,
    		strSeq
    	};
    	
    	return saeweSuipBugwa_Check.execute(values);
	}
    
    
    //	세외수입 부과		-	부과정보 테이블에 부과 등록
    public	boolean	SaeweSuipBugwa_Taxation_Info(String strAdmin_no, String strSeq, String InsertKey)
	{
    	SaeweMapDao.SaeweSuipBugwa_Taxation_Info	saeweSuipBugwa_Taxation_Info	= saeweMap.new SaeweSuipBugwa_Taxation_Info(getDataSource(), getMessageSourceAccessor());	
    	
		try
		{
	    	Object[] values = {
	    			InsertKey,
	        		strAdmin_no,
	        		strSeq,
	        	};
	    	
	    	saeweSuipBugwa_Taxation_Info.update(values);
		}
		catch (Exception e)
		{
			e.printStackTrace();
			return	false;
		}
		
		return	true;
	}
    
    
    //	세외수입 부과		-	어드민정보 테이블에 부과 등록
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
    
    //	세외수입 부과		-	cal_sum_info tax_seq를 seq로 set
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
  	
    	String sql = getMessageSourceAccessor().getMessage("Querys.jumyong.saewe.Bugwa_Id");

		Map Request_Map =  getJdbcTemplate().queryForMap(sql, values);
		
		//20160805 인사대체키관련 작업
		if(Request_Map.get("INSARANGKEY") != null)
			return Request_Map.get("INSARANGKEY").toString();
		return null;
	}
    
    
    // 정기분 일괄부과를위한 부과정보조회
    public List	executeSearch_Ilgwal_junggi(String sigu_cd, String year,String type,String tax_set,String tax_yn,String mul_fromdate,String mul_todate,String purpose,String bj_cd ,String hj_cd
    		,String jumyongName, String cal_status, String SECTION)
	{
    	SaeweMapDao.executeSearch_Ilgwal_junggi	searchIlgwal	= saeweMap.new executeSearch_Ilgwal_junggi(getDataSource(), getMessageSourceAccessor());

    	if(type.equals("0") || type.equals("")) type = "%";
    	if(tax_set.equals("")) tax_set = "%";
    	if(tax_yn.equals("")) tax_yn="%";
    	
    	if("".equals(mul_fromdate)) mul_fromdate="%";
    	if("".equals(mul_todate)) mul_todate="%";
    	//if(purpose.equals("000") || purpose.equals("")) purpose = "%";
    	if(bj_cd.equals("") || bj_cd.equals("00000") || bj_cd == null) bj_cd="%";
    	if(hj_cd.equals("") || hj_cd.equals("00000") || hj_cd == null) hj_cd="%";
    	if("".equals(jumyongName)){ jumyongName="%"; } else{ jumyongName = "%"+jumyongName+"%"; }
    	if("".equals(cal_status)) cal_status="%";
    	if("".equals(SECTION) || SECTION == null) SECTION="%";
    	//System.out.println("******purpose:"+purpose);
    	// 점용목적 조건 
    	String str1 = "";
    	String str2 = "";
    	String str3 = "";
	    	
	    if(purpose.length()>1){
	    	str1 = purpose.substring(0,1);
	    	str2 = purpose.substring(1,2);
	    	str3 = purpose.substring(2,3);
	    }
    	
    	if(purpose==null || purpose.equals("") || purpose.equals("000")){ 
    		purpose = "%";
    	}else if(str3.equals("0")){
    		if(str2.equals("0")){
    			
    			purpose = str1+"%";
    		}else{
    			
    			purpose = str1+str2+"%";
    		}
    	} 
    	
    	System.out.println("sigu_cd, === " + sigu_cd);
    	System.out.println("year ======== " + year);
    	System.out.println("type====" + type);
    	System.out.println("tax_set====" + tax_set);
    	System.out.println("tax_yn====" + tax_yn);
    	System.out.println("mul_fromdate== " + mul_fromdate);
    	System.out.println("mul_todate====" + mul_todate);
    	System.out.println("purpose====" + purpose);
    	System.out.println("bj_cd====" + bj_cd);
    	System.out.println("hj_cd====" + hj_cd);
    	System.out.println("jumyongName====" + jumyongName);
    	System.out.println("cal_status==== " + cal_status);
    	System.out.println("SECTION ==== " + SECTION);
    	
    	Object[] values = { sigu_cd, year, type, tax_set,  tax_yn,  mul_fromdate, mul_todate, purpose, bj_cd, hj_cd, jumyongName, SECTION };
    	    	
    	return searchIlgwal.execute(values);
	}
    
	public List getAddInfo(String admin_no){
	 	SaeweMapDao.execute_Get_AddInfo	GetAddInfo	= saeweMap.new execute_Get_AddInfo(getDataSource(), getMessageSourceAccessor());
    	
    	Object[] values = {admin_no};
    	    	
    	return GetAddInfo.execute(values);
	}
	
	
    // 공시지가 적용지번 조회
    public	List	executeSelectPlaceWithAddr(String adminNo)
	{
    	SaeweMapDao.SelectPlaceWithAddr	selectPlaceWithAddr	= saeweMap.new SelectPlaceWithAddr(getDataSource(), getMessageSourceAccessor());
    	
    	Object[] values = {adminNo};
    	
    	return selectPlaceWithAddr.execute(values);
	}
}
