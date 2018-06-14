//	2009		Jeon Seoung Won

package main.java.jumyong.oldminwon.dao;

import java.util.List;

import main.java.common.dao.RoadsJdbcDaoSupport;
import main.java.jumyong.oldminwon.model.Apjy20mr1Bean;
import main.java.jumyong.oldminwon.model.SangseMinwonBean;
import main.java.jumyong.oldminwon.model.SearchBean;
import main.java.jumyong.oldminwon.model.ZipBean;

public class MinwonDao	extends RoadsJdbcDaoSupport	implements	IMinwonDao
{
	private	MinwonMapDao	minwonMap	= new MinwonMapDao();
	
	
    protected	void	initDao()  throws Exception
    {
		super.initDao();
   	}
    
    //  민원 조회 리스트
    public	List	executeSearch(SearchBean searchBean, int intRn1, int intRn2)
	{
    	MinwonMapDao.Search	search	= minwonMap.new Search(getDataSource(), getMessageSourceAccessor());
    
    	if(searchBean.getJUMMOK().equals("") || searchBean.getJUMMOK().equals("0")){
    		searchBean.setJUMMOK("%");
    		
    	}

    	Object[] values = {
    			searchBean.getORG_CD().substring(0, 5),
	    		"%" + searchBean.getSERIAL_NBR() + "%",
	    		"%" + searchBean.getJUMNM() + "%",
	    		"%" + searchBean.getHEOGA() + "%",
	    		"%" + searchBean.getHJCD() + "%",
	    		"%" + searchBean.getBUN() + "%",
	    		"%" + searchBean.getJI() + "%",
	    		"%" + searchBean.getJIBUN() + "%",
        		"%" + searchBean.getJIMOK() + "%",
        		searchBean.getJUMMOK(),
	        	new Integer(intRn1),
	        	new Integer(intRn2)
    	};
    	
    	for(int i = 0; i < values.length ; i ++){
    		System.out.println("@@@@@@@@@@@@@ : " + values[i]);
    		
    	}
    	
    	return search.execute(values);
	}
    
    //	전체 건수
    public	int		executeCount(SearchBean searchBean)
	{
    	if(searchBean.getJUMMOK().equals("") || searchBean.getJUMMOK().equals("0")){
    		searchBean.setJUMMOK("%");
    		
    	}
    	
    	
    	Object[] values = {
    			searchBean.getORG_CD().substring(0, 5),
    			"%" + searchBean.getSERIAL_NBR() + "%",
        		"%" + searchBean.getJUMNM() + "%",
        		"%" + searchBean.getHEOGA() + "%",
        		"%" + searchBean.getHJCD() + "%",
        		"%" + searchBean.getBUN() + "%",
        		"%" + searchBean.getJI() + "%",
        		"%" + searchBean.getJIBUN() + "%",
        		"%" + searchBean.getJIMOK() + "%",
        		searchBean.getJUMMOK()
        };
    	
    	String sql = getMessageSourceAccessor().getMessage("Querys.jumyong.oldminwon.Count");
		return 	getJdbcTemplate().queryForInt(sql, values);
	}
    
    //  
    public	Apjy20mr1Bean	executeView(String SERIAL_NBR, String GU_CODE)
    {
    	MinwonMapDao.View	view	= minwonMap.new View(getDataSource(), getMessageSourceAccessor());
    	
//    	System.out.println("##########################        executeSearch     #######################");
//    	System.out.println("SERIAL_NBR==> " + SERIAL_NBR);
//    	System.out.println("GU_CODE==> " + GU_CODE);
//    	System.out.println("###########################################################################");
    	Object[] values = {
    			SERIAL_NBR,
    			GU_CODE
    	};
    	List list = view.execute(values);

    	return (Apjy20mr1Bean) list.get(0);
    }
    
    //  상세 민원 조회 리스트
    public	List	executeSangseSearch(String SERIAL_NBR, String GU_CODE, int intRn1, int intRn2)
	{
    	MinwonMapDao.SangseSearch	sangseSearch	= minwonMap.new SangseSearch(getDataSource(), getMessageSourceAccessor());
    	
    	System.out.println("##########################        executeSangseSearch     #######################");
    	System.out.println("SERIAL_NBR ==> " + SERIAL_NBR);
    	System.out.println("GU_CODE ==> " + GU_CODE);
    	System.out.println("intRn1==> " + intRn1);
    	System.out.println("intRn2==> " + intRn2);
    	System.out.println("###########################################################################");
    	Object[] values = {
    			SERIAL_NBR,
    			GU_CODE,
	        	new Integer(intRn1),
	        	new Integer(intRn2)
    	};
    	
    	return sangseSearch.execute(values);
	}
    
    //	전체 건수
    public	int		executeSangseCount(String SERIAL_NBR, String GU_CODE)
	{
    	System.out.println("##########################        executeSangseCount     #######################");
    	System.out.println("SERIAL_NBR ==> " + SERIAL_NBR);
    	System.out.println("GU_CODE ==> " + GU_CODE);
    	System.out.println("###########################################################################");
    	
    	Object[] values = {
    			SERIAL_NBR,
    			GU_CODE
        };
    	
		String sql = getMessageSourceAccessor().getMessage("Querys.jumyong.oldminwon.SangseCount");
		return 	getJdbcTemplate().queryForInt(sql, values);
	}
    
    //  
    public	SangseMinwonBean	executeSangseMinwonBean(String SERIAL_NBR, String GU_CODE, String ILKWAL_NBR, String YY)
	{
    	MinwonMapDao.SangseView	sangseView	= minwonMap.new SangseView(getDataSource(), getMessageSourceAccessor());
    	
    	System.out.println("##########################        executeSangseMinwonBean     #######################");
    	System.out.println("SERIAL_NBR==> " + SERIAL_NBR);
    	System.out.println("GU_CODE==> " + GU_CODE);
    	System.out.println("ILKWAL_NBR==> " + ILKWAL_NBR);
    	System.out.println("YY==> " + YY);
    	System.out.println("###########################################################################");
    	Object[] values = {
	    		SERIAL_NBR,
	    		GU_CODE,
	    		ILKWAL_NBR,
	    		YY
    	};
    	
    	List list = sangseView.execute(values);

    	return (SangseMinwonBean) list.get(0);
	}

    public	ZipBean	executeZip(String POST1, String POST2)
    {
    	MinwonMapDao.Zip	zip	= minwonMap.new Zip(getDataSource(), getMessageSourceAccessor());
    	
//    	System.out.println("##########################        executeSearch     #######################");
//    	System.out.println("SERIAL_NBR==> " + SERIAL_NBR);
//    	System.out.println("GU_CODE==> " + GU_CODE);
//    	System.out.println("###########################################################################");
    	Object[] values = {
    			POST1,
    			POST2
    	};
    	List list = zip.execute(values);

    	return (ZipBean) list.get(0);
    }
    
	public List executeGuMinwonSearch(String userId, String JIMOK){
		MinwonMapDao.getJummokList	jummokList	= minwonMap.new getJummokList(getDataSource(), getMessageSourceAccessor());
		Object[] values = {
				userId,
				JIMOK
    	};

    	return jummokList.execute(values);
	}
	
	public List executeHistoryList(String SERIAL_NBR, String GU_CODE){
		
		
		MinwonMapDao.getHistoryList	historyList	= minwonMap.new getHistoryList(getDataSource(), getMessageSourceAccessor());
		Object[] values = {
				SERIAL_NBR,
				GU_CODE
    	};
		System.out.println("##############"+SERIAL_NBR);
		System.out.println("##############"+GU_CODE);

    	return historyList.execute(values);
	
	}
}
