//	2009		Kim Yun Seo

package main.java.facility.adminbiz.dao;

import java.util.List;
import java.util.Map;

import main.java.common.dao.RoadsJdbcDaoSupport;
import main.java.facility.adminbiz.model.AdminBizBean;
import main.java.facility.minwon.model.Admin_BaseBean;
import main.java.facility.minwon.model.AppealBean;
import main.java.facility.minwon.model.MinwonBean;
import main.java.facility.minwon.model.PlaceBean;
import main.java.gapan.gapan.model.GapanBean;


public class AdminBizDao	extends RoadsJdbcDaoSupport	implements	IAdminBizDao
{
	private	AdminBizMapDao	adminbizMap	= new AdminBizMapDao();
	
	
    protected	void	initDao()  throws Exception
    {
		super.initDao();
   	}
    
    //검색
    public List adminBizSearch(String name, String manager, String gu_code, int startPage, int endPage){
	
    	AdminBizMapDao.Search	search	= adminbizMap.new Search(getDataSource(), getMessageSourceAccessor());
    	
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
    
//	전체 건수
    public	int		adminBizSearchCount(String name, String manager, String gu_code)
	{
       	if(name.equals("")	||	name == null)
    		name	= "%";
    	
    	if(manager.equals("")	||	manager == null)
    		manager	= "%";
    	
    	Object[] values = {
    			"%" + name + "%",
        		"%"+ manager +"%",
        		gu_code
        	
        };
    	
		String sql = getMessageSourceAccessor().getMessage("Querys.facility.adminbiz.SearchCount");
		return 	getJdbcTemplate().queryForInt(sql, values);

	}
    
    
    public AdminBizBean adminBizView(String gu_code, String corp_cd){
    	
    	AdminBizMapDao.GetAdminBizView	getAdminBizView	= adminbizMap.new GetAdminBizView(getDataSource(), getMessageSourceAccessor());
		
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
    
    
    public List adminBizCompanyList(String gu_code){
    	
    	AdminBizMapDao.GetCompanyList company	= adminbizMap.new GetCompanyList(getDataSource(), getMessageSourceAccessor());
    	
    	Object[] values = {				
				gu_code
		};
    
    	return company	.execute(values);
    }
    
    public int adminBizInsert(AdminBizBean bean){
    	
    	AdminBizMapDao.CompanylInsert company	= adminbizMap.new CompanylInsert(getDataSource(), getMessageSourceAccessor());
    	
    	Object[] values = {		
	    	bean.getNAME(),
			bean.getSSN(),
			bean.getTOPOST_NM(),
			bean.getBIZSSN(),
			bean.getBIZ_STATUS(),
			bean.getBIZ_TYPES(),
			bean.getOFFICE(),
			bean.getMANAGER(),
			bean.getTOTEL(),
			bean.getTOTEL_EXT(),
			bean.getTOFAX(),
			bean.getTOHP(),
			bean.getOFFICE_CD(),
			bean.getJIJUM_CD(),
			bean.getCORP_CD(),
			bean.getGU_CODE(),

			bean.getPOST(),
			bean.getADDR1(),
			bean.getADDR2(),

			bean.getSI(),
			bean.getGUN(),
			bean.getDONG(),
			bean.getRI(),
			bean.getLNBR1(),
			bean.getLNBR2(),
			bean.getSANGSE(),

			bean.getROAD_ADDR(),
			bean.getROAD_BON(),
			bean.getROAD_BU(),
			bean.getBD_NM(),
			bean.getBD_DET_NM(),

			bean.getTOPOST(),
			bean.getTOADDR1(),
			bean.getTOADDR2(),

			bean.getTOSI(),
			bean.getTOGUN(),
			bean.getTODONG(),
			bean.getTORI(),
			bean.getTO_LNBR1(),
			bean.getTO_LNBR2(),
			bean.getTOSANGSE(),

			bean.getTO_DORO_NM(),
			bean.getTO_BD_BON(),
			bean.getTO_BD_BU(),
			bean.getTO_BD_NM(),
			bean.getTO_BD_DET_NM(),

			bean.getSPC_CD(),
			bean.getTO_SPC_CD()

    	};    	
    	
   	return company	.update(values);
     
    }
    
    public String maxOffice_cd(String gu_code){
    	AdminBizMapDao.maxOffice_cd company	= adminbizMap.new maxOffice_cd(getDataSource(), getMessageSourceAccessor());
    	 
    	
    	Object[] values = {				
				gu_code
		};
    	
    	List list = company	.execute(values); 
    
    	AdminBizBean bean = (AdminBizBean)list.get(0);
    	
    	return bean.getOFFICE_CD();
    	
    	
    }
	
    public String maxJijum_cd(String gu_code,String office_cd){
    	
	AdminBizMapDao.maxJijum_cd company	= adminbizMap.new maxJijum_cd(getDataSource(), getMessageSourceAccessor());
    	 
    	
    	Object[] values = {				
				gu_code,
				office_cd
		};
    	
    	List list = company	.execute(values); 
    
    	AdminBizBean bean = (AdminBizBean)list.get(0);
    	
    	return bean.getJIJUM_CD();
    	
    }
    
    
    public int adminBizUpdate(AdminBizBean bean, String corp){
    	
    	AdminBizMapDao.CompanylUpdate company	= adminbizMap.new CompanylUpdate(getDataSource(), getMessageSourceAccessor());
    	
    	/*
    	NAME, SSN, TOPOST_NM, BIZSSN, BIZ_STATUS, BIZ_TYPES, OFFICE, MANAGER, TOTEL, TOTEL_EXT, TOFAX, TOHP, OFFICE_CD, JIJUM_CD, CORP_CD, GU_CODE, \
		POST, ADDR1, ADDR2, \
		SI, GUN, DONG, RI, LNBR1, LNBR2, SANGSE, \
		ROAD_ADDR, ROAD_BON, ROAD_BU, BD_NM, BD_DET_NM, \
		TOPOST, TOADDR1, TOADDR2, \
		TOSI, TOGUN, TODONG, TORI, TO_LNBR1, TO_LNBR2, TOSANGSE, \
		TO_DORO_NM, TO_BD_BON, TO_BD_BU, TO_BD_NM, TO_BD_DET_NM, \
		SPC_CD, TO_SPC_CD, REGDATE,
		CORP_CD, GU_CODE
		*/
    	
    	Object[] values = {		

/*
    			NAME
    			SSN
    			TOPOST_NM
    			BIZSSN
    			BIZ_STATUS
    			BIZ_TYPES
    			OFFICE
    			MANAGER
    			TOTEL
    			TOTEL_EXT
    			TOFAX
    			TOHP
    			OFFICE_CD
    			JIJUM_CD
    			CORP_CD
    			GU_CODE
    			POST
    			ADDR1
    			ADDR2
    			SI
    			GUN
    			DONG
    			RI
    			LNBR1
    			LNBR2
    			SANGSE
    			ROAD_ADDR
    			ROAD_BON
    			ROAD_BU
    			BD_NM
    			BD_DET_NM
    			TOPOST
    			TOADDR1
    			TOADDR2
    			TOSI
    			TOGUN
    			TODONG
    			TORI
    			TO_LNBR1
    			TO_LNBR2
    			TOSANGSE
    			TO_DORO_NM
    			TO_BD_BON
    			TO_BD_BU
    			TO_BD_NM
    			TO_BD_DET_NM
    			SPC_CD
    			TO_SPC_CD
    			REGDATE
    			CORP_CD
    			GU_CODE

    		bean.getNAME(),
			bean.getSSN(),
			bean.getTOPOST_NM(),
			bean.getBIZSSN(),
			bean.getPOST(),
			bean.getADDR1(),
			bean.getADDR2(),
			bean.getBIZ_STATUS(),
			bean.getBIZ_TYPES(),
			bean.getTOPOST(),
			bean.getTOADDR1(),
			bean.getTOADDR2(),
			bean.getOFFICE(),
			bean.getMANAGER(),
			bean.getTOTEL(),
			bean.getTOTEL_EXT(),
			bean.getTOFAX(),
			bean.getTOHP(),
			bean.getOFFICE_CD(),
			bean.getJIJUM_CD(),
			bean.getCORP_CD(),			
			bean.getLNBR1(),
			bean.getLNBR2(),
			bean.getTO_LNBR1(),
			bean.getTO_LNBR2(),
			bean.getSPC_CD(),
			bean.getTO_SPC_CD(),
			corp,
			bean.getGU_CODE()			
			*/	
    			
    	    	    	bean.getNAME(),
    	    			bean.getSSN(),
    	    			bean.getTOPOST_NM(),
    	    			bean.getBIZSSN(),
    	    			bean.getBIZ_STATUS(),
    	    			bean.getBIZ_TYPES(),
    	    			bean.getOFFICE(),
    	    			bean.getMANAGER(),
    	    			bean.getTOTEL(),
    	    			bean.getTOTEL_EXT(),
    	    			bean.getTOFAX(),
    	    			bean.getTOHP(),
    	    			bean.getOFFICE_CD(),
    	    			bean.getJIJUM_CD(),
    	    			bean.getCORP_CD(),
    	    			bean.getGU_CODE(),

    	    			bean.getPOST(),
    	    			bean.getADDR1(),
    	    			bean.getADDR2(),

    	    			bean.getSI(),
    	    			bean.getGUN(),
    	    			bean.getDONG(),
    	    			bean.getRI(),
    	    			bean.getLNBR1(),
    	    			bean.getLNBR2(),
    	    			bean.getSANGSE(),

    	    			bean.getROAD_ADDR(),
    	    			bean.getROAD_BON(),
    	    			bean.getROAD_BU(),
    	    			bean.getBD_NM(),
    	    			bean.getBD_DET_NM(),

    	    			bean.getTOPOST(),
    	    			bean.getTOADDR1(),
    	    			bean.getTOADDR2(),

    	    			bean.getTOSI(),
    	    			bean.getTOGUN(),
    	    			bean.getTODONG(),
    	    			bean.getTORI(),
    	    			bean.getTO_LNBR1(),
    	    			bean.getTO_LNBR2(),
    	    			bean.getTOSANGSE(),

    	    			bean.getTO_DORO_NM(),
    	    			bean.getTO_BD_BON(),
    	    			bean.getTO_BD_BU(),
    	    			bean.getTO_BD_NM(),
    	    			bean.getTO_BD_DET_NM(),

    	    			bean.getSPC_CD(),
    	    			bean.getTO_SPC_CD(),

    	    			bean.getCORP_CD(),
    	    			bean.getGU_CODE()
    	    			
    	};    	
    	
    	
   	
    	return company	.update(values);
    	
    }
    
    
    public int adminBizDelete(String gu_code, String corp_cd){
    	
AdminBizMapDao.CompanyDelete company	= adminbizMap.new CompanyDelete(getDataSource(), getMessageSourceAccessor());
    	
    	Object[] values = {		
	    	gu_code,
	    	corp_cd
    	};    	
    	
   	return company	.update(values);
    	
    }
}