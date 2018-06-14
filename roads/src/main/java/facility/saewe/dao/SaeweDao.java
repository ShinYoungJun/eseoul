
package main.java.facility.saewe.dao;

import java.util.List;
import java.util.Map;

import main.java.common.dao.RoadsJdbcDaoSupport;
import main.java.facility.jumyonginfo.dao.JumyonginfoMapDao;
import main.java.facility.saewe.dao.SaeweMapDao.Jumji_View2;
import main.java.facility.saewe.model.BugwaSearchBean;
import main.java.facility.saewe.model.TaxationBean;


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
    	
    	if(Bean.getSECTION().equals("")	||	Bean.getSECTION() == null)	//과세구분
    		Bean.setSECTION("%");
    	if(Bean.getTAX_SET().equals("")	||	Bean.getTAX_SET() == null)	//세입구분
    		Bean.setTAX_SET("%");
    	if(Bean.getTAX_YN().equals("")	||	Bean.getTAX_YN() == null)	//부과여부
    		Bean.setTAX_YN("%");    	
    	
    	Object[] values = {
    			Bean.getGIGAN1(),
    			Bean.getGIGAN2(),
    			//Bean.getSECTION(), //과세구분 (정시,수시,신고분)
    			Bean.getTAX_SET(), //시세구세
    			"%" + Bean.getNAME() + "%", //점용인/법인명
    			Bean.getTAX_YN(),  //부과여부
    			Bean.getSIGUNGU(), //시군구코드
	        	new Integer(intRn1),
	        	new Integer(intRn2)
    	};
    	
    	return search.execute(values);
	}
    
    //	전체 건수
    public	int		executeCount(BugwaSearchBean Bean)
	{
    	if(Bean.getSECTION().equals("")	||	Bean.getSECTION() == null)	//과세구분
    		Bean.setSECTION("%");
    	if(Bean.getTAX_SET().equals("")	||	Bean.getTAX_SET() == null)	//세입구분
    		Bean.setTAX_SET("%");
    	if(Bean.getTAX_YN().equals("")	||	Bean.getTAX_YN() == null)	//부과여부
    		Bean.setTAX_YN("%");    	
    	
    	Object[] values = {
    			Bean.getGIGAN1(),
    			Bean.getGIGAN2(),
    			//Bean.getSECTION(),
    			Bean.getTAX_SET(),
    			"%" + Bean.getNAME() + "%",
    			Bean.getTAX_YN(),
    			Bean.getSIGUNGU()
    	};
    	
		String sql = getMessageSourceAccessor().getMessage("Querys.facility.saewe.Count");
		return 	getJdbcTemplate().queryForInt(sql, values);
	}

    //	일괄부과를위한 부과정보조회
    public	List	executeSearch_Ilgwal(BugwaSearchBean Bean)
	{
    	SaeweMapDao.Search_Ilgwal	searchIlgwal	= saeweMap.new Search_Ilgwal(getDataSource(), getMessageSourceAccessor());
    	 
    	if(Bean.getSECTION().equals("")	||	Bean.getSECTION() == null)	//과세구분
    		Bean.setSECTION("%");
    	if(Bean.getTAX_SET().equals("")	||	Bean.getTAX_SET() == null)	//세입구분
    		Bean.setTAX_SET("%");
    	if(Bean.getTAX_YN().equals("")	||	Bean.getTAX_YN() == null)	//부과여부
    		Bean.setTAX_YN("%");    	
    	
    	Object[] values = {
    			Bean.getGIGAN1(),
    			Bean.getGIGAN2(),
    			Bean.getSECTION(),
    			Bean.getTAX_SET(),
    			"%" + Bean.getNAME() + "%",
    			Bean.getSIGUNGU()
    	};
    	
    	return searchIlgwal.execute(values);
	}     
    
    //	산출내역 검색
    public	List	executeSanchulSearch(String guCode, String corpCd, String seq, int intRn1,int intRn2)
	{
    	SaeweMapDao.SanchulSearch	sanchulSearch	= saeweMap.new SanchulSearch(getDataSource(), getMessageSourceAccessor());
    	
    	Object[] values = {
    		guCode,
    		corpCd,    		
    		seq,
        	new Integer(intRn1),
        	new Integer(intRn2)
    	};
    	
    	return sanchulSearch.execute(values);
	}
    
    //	산출내역 전체 건수
    public	int		executeSanchulCount(String guCode, String corpCd, String seq)
	{
    	Object[] values = {
    		guCode,
    		corpCd,    		
    		seq
        };
    	
		String sql = getMessageSourceAccessor().getMessage("Querys.facility.saewe.SanchulCount");
		return 	getJdbcTemplate().queryForInt(sql, values);
	}
    
    //	산출정보 자세히 보기
    public	List	executeSanchulInfo_View(String guCode, String corpCd, String seq)
	{
    	SaeweMapDao.SanchulInfo_View	sanchulInfo_View	= saeweMap.new SanchulInfo_View(getDataSource(), getMessageSourceAccessor());
    	
    	Object[] values = {
			guCode,
			corpCd,			
			seq
    	};
    	
    	return sanchulInfo_View.execute(values);
	}
    
    //	점용인정보 보기
    public	List	executeJumin_View(String guCode,String corpCd)
	{
    	SaeweMapDao.Jumin_View	jumin_View	= saeweMap.new Jumin_View(getDataSource(), getMessageSourceAccessor());
    	
    	Object[] values = {corpCd, guCode};
    	
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
    public	List	executeBugwa_View(String guCode,String corpCd,String adminNo, String seq)
	{
    	SaeweMapDao.Bugwa_View	bugwa_View	= saeweMap.new Bugwa_View(getDataSource(), getMessageSourceAccessor());
    	
    	Object[] values = {
			guCode,
			corpCd,
			adminNo,
			seq
    	};
    	
    	System.out.println("Bugwa_View : gucode... : "+guCode+":"+corpCd+":"+adminNo+":"+seq+":");
    	
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
					Bean.getGU_CODE(),
					Bean.getCORP_CD(),
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
    
    
    //	부과정보 입력
    public	boolean	executeBugwa_Register(TaxationBean Bean)
	{
    	SaeweMapDao.Bugwa_Register	bugwa_Register	= saeweMap.new Bugwa_Register(getDataSource(), getMessageSourceAccessor());
    	
		try
		{
			Object[] values = {
					Bean.getGU_CODE(),
					Bean.getCORP_CD(),					
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
					"1",
					"1",
					"1",
					Bean.getSEQ(),
					Bean.getSISE(),
					Bean.getGIGUM(),
					Bean.getGUKSE(),
					Bean.getGUSE(),
					Bean.getSUBUSEO_CD(),
					Bean.getOCR_SIGU_CD(),
					Bean.getOCR_BUSEO_CD()
				};
			System.out.println("values="+values);
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
    public	List	executeBugwa_DataInfo(String guCode,String corpCd,String adminNo, String seq)
	{
    	SaeweMapDao.Bugwa_DataInfo	bugwa_DataInfo	= saeweMap.new Bugwa_DataInfo(getDataSource(), getMessageSourceAccessor());
    	
    	Object[] values = {
			guCode,
			corpCd,
			adminNo,
			seq
    	};
    	
    	return bugwa_DataInfo.execute(values);
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
    public	boolean	SaeweSuipBugwa_Taxation_Info (String guCode,String corpCd,String seq, String InsertKey)
	{
    	SaeweMapDao.SaeweSuipBugwa_Taxation_Info	saeweSuipBugwa_Taxation_Info	= saeweMap.new SaeweSuipBugwa_Taxation_Info(getDataSource(), getMessageSourceAccessor());	
    	
		try
		{
	    	Object[] values = {
	    			InsertKey,
	    			guCode,
	    			corpCd,	    			
	    			seq
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
    
    
    //	세외수입 부과		-	산출내역합계 테이블에 부과 등록
    public	boolean	SaeweSuipBugwa_Cal_Sum_Info(String guCode, String corpCd, String seq)
	{
    	SaeweMapDao.SaeweSuipBugwa_Cal_Sum_Info	saeweSuipBugwa_Cal_Sum_Info	= saeweMap.new SaeweSuipBugwa_Cal_Sum_Info(getDataSource(), getMessageSourceAccessor());
    	
		try
		{
	    	Object[] values = {
    			guCode,
    			corpCd,    			
    			seq
	    	};

	    	saeweSuipBugwa_Cal_Sum_Info.update(values);
		}
		catch (Exception e)
		{
			e.printStackTrace();
			return	false;
		}
		
		return	true;
	}
    
    //	세외수입 부과		-	산출합계정보테이블에 부과등록여부 '1'세팅
    public	boolean	SetCal_Sum_Info_taxseq(String guCode, String corpCd,String adminNo)
	{
    	SaeweMapDao.SetCal_Sum_Info_taxseq	SetCal_Sum_Info_taxseq	= saeweMap.new SetCal_Sum_Info_taxseq(getDataSource(), getMessageSourceAccessor());
    	
		try
		{
	    	Object[] values = {
    			guCode,
    			corpCd,
    			adminNo
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


    //	세외수입 부과		-	연계이력 등록
    public	boolean	SaeweSuipBugwa_History_Info(TaxationBean Bean, String user_id, String succes_yn)
	{
    	SaeweMapDao.SaeweSuipBugwa_History_Info	saeweSuipBugwa_History_Info	= saeweMap.new SaeweSuipBugwa_History_Info(getDataSource(), getMessageSourceAccessor());
    	
		try
		{
	    	Object[] values = {
    			Bean.getADMIN_NO(),
    			"2",
    			user_id,
    			"3",
    			succes_yn
	    	};

	    	saeweSuipBugwa_History_Info.update(values);
		}
		catch (Exception e)
		{
			e.printStackTrace();
			return	false;
		}
		
		return	true;
	}
    
//	점용지정보 보기
    public	List	executeJumji_View(String corp_cd, String gu_code, String admin_no, String tax_set, int intRn1, int intRn2)
	{
    	SaeweMapDao.Jumji_View2	jumji_View2	= saeweMap.new Jumji_View2(getDataSource(), getMessageSourceAccessor());
    	
    	Object[] values = {
    				corp_cd, 
    				gu_code, 
    				admin_no, 
    				tax_set,
    				new Integer(intRn1),
    				new Integer(intRn2)
    	};
    	
    	return jumji_View2.execute(values);
	}
    
    public	int		executeJumji_Count(String corp_cd, String gu_code, String admin_no, String tax_set)
	{
    	Object[] values = {corp_cd, gu_code, admin_no,tax_set};
  	
    	String sql = getMessageSourceAccessor().getMessage("Querys.facility.saewe.Jumji_Count");
    	return 	getJdbcTemplate().queryForInt(sql, values);
	}
    
    public	String	executeBugwa_Id(String user_id)
	  {
	  	Object[] values = {user_id};
	  	
	  	String sql = getMessageSourceAccessor().getMessage("Querys.facility.saewe.Bugwa_Id");
		
		Map Request_Map =  getJdbcTemplate().queryForMap(sql, values);
		return Request_Map.get("INSARANGKEY").toString();
	  }
    
    public	List	 executePurpose(String corp_cd, String gu_code, String admin_no, String tax_set)
    {
    	SaeweMapDao.Purpose	purpose	= saeweMap.new Purpose(getDataSource(), getMessageSourceAccessor());
    	
    	System.out.println("===3.1==="+corp_cd+" "+gu_code+" "+admin_no+" "+tax_set);
    	Object[] values = {corp_cd, gu_code, admin_no, tax_set};
    	
    	return purpose.execute(values);
    }
    
    public	List executeGetSumQuantity(String cal_sum_seq){
    	
    	SaeweMapDao.GetSumQuantity q	= saeweMap.new GetSumQuantity(getDataSource(), getMessageSourceAccessor());
    	
    	Object[] values = {cal_sum_seq};
    	
    	
    	return q.execute(values);
    	
    	//return 	getJdbcTemplate().queryForInt(sql, values);
    }
    
    public	TaxationBean executeMinObjBunji(String admin_no)
	{
    	SaeweMapDao.GetMinObjBunji obj	= saeweMap.new GetMinObjBunji(getDataSource(), getMessageSourceAccessor());
    	
    	Object[] values = {
    			admin_no,
    			admin_no
    	};
    	
    	return (TaxationBean)obj.execute(values).get(0);
	}
}
