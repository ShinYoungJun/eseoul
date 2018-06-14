
package main.java.gapan.sugeo.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.object.MappingSqlQuery;
import org.springframework.jdbc.object.SqlUpdate;

import main.java.common.dao.RoadsJdbcDaoSupport;
import main.java.gapan.sugeo.model.SugeoBean;

public class SugeoDao extends RoadsJdbcDaoSupport	implements	ISugeoDao{
	
	private ExecuteSearch objExecuteSearch;
	private ExecuteRemInfo objExecuteRemInfo;
	private GoodsList objGoodsList;
	private Goods_view objGoods_view;
	private ExecuteGoodsRegister objExecuteGoodsRegister;
	private ExecuteBugwa_RegisterPrc objExecuteBugwa_RegisterPrc;
	private ExecuteSale_RegisterPrc objExecuteSale_RegisterPrc;
	private GetBjhjName objGetBjhjName;
	private GetSugeoView objGetSugeoView;
	private GetSugeoBugwaView objGetSugeoBugwaView;
	private Sugeo_modify objSugeo_modify;
	private Sugeo_bugwa_modify objSugeo_bugwa_modify;
	private Sugeo_fine_modify objSugeo_fine_modify;
	private Sugeo_sale_modify objSugeo_sale_modify;
	//private GapanCodeNm objGapanCodeNm;
	
    protected	void	initDao()  throws Exception
    {
		super.initDao();
		
		objExecuteSearch = new ExecuteSearch(getDataSource());
		objExecuteRemInfo = new ExecuteRemInfo(getDataSource());		
		objGoodsList = new GoodsList(getDataSource());
		objGoods_view = new Goods_view(getDataSource());
		objExecuteGoodsRegister = new ExecuteGoodsRegister(getDataSource());
		objExecuteBugwa_RegisterPrc = new ExecuteBugwa_RegisterPrc(getDataSource());
		objExecuteSale_RegisterPrc = new ExecuteSale_RegisterPrc(getDataSource());
		objGetBjhjName = new GetBjhjName(getDataSource());
		objGetSugeoView = new GetSugeoView(getDataSource());
		objGetSugeoBugwaView = new GetSugeoBugwaView(getDataSource());
		objSugeo_modify = new Sugeo_modify(getDataSource());
		objSugeo_bugwa_modify = new Sugeo_bugwa_modify(getDataSource());
		objSugeo_fine_modify = new Sugeo_fine_modify(getDataSource());
		objSugeo_sale_modify = new Sugeo_sale_modify(getDataSource());
		//objGapanCodeNm = new GapanCodeNm(getDataSource());
   	}
    
    
    //	리스트 검색 
    public List	executeSearch(SugeoBean bean, int intCurrentPage,int intCountPerPage)
	{
    	
    	String Rem_mulnm = "%"+bean.getRem_mulnm_search()+"%";
    	String Rem_addr = "%"+bean.getRem_addr_search()+"%";
    	String Rem_nm = "%"+bean.getRem_nm_search()+"%";
//    	if(bean.getRem_date_from().equals("") || bean.getRem_date_from() == null){
//    		bean.setRem_date_from("%");
//    	}
//    	if(bean.getRem_date_to().equals("") || bean.getRem_date_to() == null){
//    		bean.setRem_date_to("%");
//    	}
    	if(bean.getRem_mulcd_search().equals("") || bean.getRem_mulcd_search() == null){
    		bean.setRem_mulcd_search("%");
    	}
    	if(Rem_mulnm.equals("") || Rem_mulnm == null){
    		Rem_mulnm = "%";
    	}
    	if(bean.getRem_bjcd_search().equals("") || bean.getRem_bjcd_search() == null){
    		bean.setRem_bjcd_search("%");
    	}
    	if(bean.getRem_hjcd_search().equals("") || bean.getRem_hjcd_search() == null){
    		bean.setRem_hjcd_search("%");
    	}
    	if(Rem_addr.equals("") || Rem_addr == null){
    		Rem_addr = "%";
    	}
    	if(Rem_nm.equals("") || Rem_nm == null){
    		Rem_nm = "%";
    	}
    	// 처리상황 
    	//if(bean.getGoods_status().equals("") || bean.getGoods_status() == null){
    	//	bean.setGoods_status("%");
    	//}
    	
    	/*System.out.println( " bean.getRem_date_from()=== " + bean.getRem_date_from()+"0000");
    	System.out.println( " bean.getRem_date_to()  === " + bean.getRem_date_to()+"2400");
    	System.out.println( " bean.getRem_mulcd_search()    === " + bean.getRem_mulcd_search());
    	System.out.println( " Rem_mulnm 			=== " + Rem_mulnm);
    	System.out.println( " bean.getRem_bjcd_search()     === " + bean.getRem_bjcd_search());
    	System.out.println( " bean.getRem_hjcd_search()     === " + bean.getRem_hjcd_search());
    	System.out.println( " Rem_addr			     === " + Rem_addr);
    	System.out.println( " Rem_nm		         === " + Rem_nm);
    	System.out.println( " intCurrentPage         === " + intCurrentPage);
    	System.out.println( " intCountPerPage        === " + intCountPerPage);
    	*/
    	Object[] values = { bean.getRem_date_from()+"0000", bean.getRem_date_to()+"2400", bean.getRem_mulcd_search(), Rem_mulnm, bean.getRem_bjcd_search() ,
    						bean.getRem_hjcd_search(), Rem_addr, Rem_nm, bean.getSigu_cd(), new Integer(intCurrentPage),	new Integer(intCountPerPage) };
    	
    	//System.out.println(getMessageSourceAccessor().getMessage("Querys.gapan.gapan.sugeo.Search"));
		
    	return objExecuteSearch.execute(values); 
	}

	protected class ExecuteSearch extends MappingSqlQuery {
		protected ExecuteSearch(DataSource ds) {
			super(ds, getMessageSourceAccessor().getMessage(
					"Querys.gapan.gapan.sugeo.Search"));
			
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
		}

		protected Object mapRow(ResultSet rs, int rownum) throws SQLException {
			
			SugeoBean objSugeoBean = new SugeoBean();

			objSugeoBean.setMul_no(rs.getString("MUL_NO"));
			objSugeoBean.setRem_date(rs.getString("REM_DATE"));
			objSugeoBean.setRem_bjcd(rs.getString("REM_BJCD"));
			objSugeoBean.setRem_hjcd(rs.getString("REM_HJCD"));
			objSugeoBean.setRem_mulcd(rs.getString("REM_MULCD"));
			objSugeoBean.setRem_mulnm(rs.getString("REM_MULNM"));
			objSugeoBean.setRem_area(rs.getString("REM_AREA"));
			objSugeoBean.setRem_nm(rs.getString("REM_NM"));
			objSugeoBean.setRem_svfrom(rs.getString("REM_SVFROM"));
			objSugeoBean.setRem_svto(rs.getString("REM_SVTO"));
			objSugeoBean.setRem_svplace(rs.getString("REM_SVPLACE"));
			objSugeoBean.setRem_badfrom(rs.getString("REM_BADFROM"));
			objSugeoBean.setRem_badto(rs.getString("REM_BADTO"));
			objSugeoBean.setRem_bigo(rs.getString("REM_BIGO"));
			objSugeoBean.setChg_org(rs.getString("CHG_ORG"));
			objSugeoBean.setChg_nm(rs.getString("CHG_NM"));
			objSugeoBean.setAnn_date(rs.getString("ANN_DATE"));
			objSugeoBean.setAnn_no(rs.getString("ANN_NO"));
			objSugeoBean.setRem_addr(rs.getString("REM_ADDR"));			
			objSugeoBean.setRN(rs.getString("RN"));
			
			return objSugeoBean;
		}
	}
    
    //	전체 건수
    public	int		executeCount(SugeoBean bean)
	{
    	
    	String Rem_mulnm = bean.getRem_mulnm_search();
    	String Rem_addr = bean.getRem_addr_search();
    	String Rem_nm = bean.getRem_nm_search();
//    	if(bean.getRem_date_from().equals("") || bean.getRem_date_from() == null){
//    		bean.setRem_date_from("%");
//    	}
//    	if(bean.getRem_date_to().equals("") || bean.getRem_date_to() == null){
//    		bean.setRem_date_to("%");
//    	}
    	if(bean.getRem_mulcd_search().equals("") || bean.getRem_mulcd_search() == null){
    		bean.setRem_mulcd_search("%");
    	}
    	if(Rem_mulnm.equals("") || Rem_mulnm == null){
    		Rem_mulnm = "%";
    	}
    	if(bean.getRem_bjcd_search().equals("") || bean.getRem_bjcd_search() == null){
    		bean.setRem_bjcd_search("%");
    	}
    	if(bean.getRem_hjcd_search().equals("") || bean.getRem_hjcd_search() == null){
    		bean.setRem_hjcd_search("%");
    	}
    	if(Rem_addr.equals("") || Rem_addr == null){
    		Rem_addr = "%";
    	}
    	if(Rem_nm.equals("") || Rem_nm == null){
    		Rem_nm = "%";
    	}
    	// 처리상황 
    	//if(bean.getGoods_status().equals("") || bean.getGoods_status() == null){
    	//	bean.setGoods_status("%");
    	//}
    	
    	
    	Object[] values = { bean.getRem_date_from()+"0000", bean.getRem_date_to()+"2400", bean.getRem_mulcd_search(), Rem_mulnm, bean.getRem_bjcd_search() ,bean.getRem_hjcd_search(), 
    						Rem_addr, Rem_nm , bean.getSigu_cd()};
    	
		String sql = getMessageSourceAccessor().getMessage("Querys.gapan.sugeo.Count");
	
		return 	getJdbcTemplate().queryForInt(sql, values);
	}
    
    
    // 수거물 관리번호 생성
    public	String	executeGapan_MulNo(String sigu_cd, String rem_bjcd)
	{
    	
    	Object[] values = {rem_bjcd};

    	String sql = getMessageSourceAccessor().getMessage("Querys.gapan.sugeo.getMulno");
    	//System.out.println(sql);
    	
    	String mul_no = "";
    	try
		{
			Map Request_Map = getJdbcTemplate().queryForMap(sql,values);
			mul_no = Request_Map.get("MUL_NO").toString();
		}catch(Exception e)
		{
			System.out.println(e.toString());
			e.printStackTrace();
		}	
		
    	return mul_no;
	}
    
    
    
    //	수거정보 입력
    public SugeoBean executeRemInfo(SugeoBean bean)
    {    	
    	try{	
	    	Object[] values = { bean.getMul_no(), bean.getRem_date(), bean.getRem_bjcd(), bean.getRem_hjcd(), bean.getRem_mulcd(), 
	    			bean.getRem_mulnm(), bean.getRem_area(), bean.getRem_nm(), bean.getRem_svfrom(), bean.getRem_svto(), 
	    			bean.getRem_svplace(), bean.getRem_badfrom(), bean.getRem_badto(), bean.getRem_bigo(), bean.getChg_org(), 
	    			bean.getChg_nm(), bean.getAnn_date(), bean.getAnn_no(), bean.getRem_addr() 	};
			
	    	/*System.out.println("bean.getMul_no  === " + bean.getMul_no()); 
	    	System.out.println("bean.getRem_date=== " + bean.getRem_date()); 
	    	System.out.println("bean.getRem_bjcd(=== " + bean.getRem_bjcd()); 
	    	System.out.println("bean.getRem_hjcd(=== " + bean.getRem_hjcd()); 
	    	System.out.println("bean.getRem_mulcd=== " + bean.getRem_mulcd()); 
	    	System.out.println("bean.getRem_mulnm=== " + bean.getRem_mulnm()); 
	    	System.out.println("bean.getRem_area(=== " + bean.getRem_area()); 
	    	System.out.println("bean.getRem_nm()=== " + bean.getRem_nm()); 
	    	System.out.println("bean.getRem_svfrom=== " + bean.getRem_svfrom()); 
	    	System.out.println("bean.getRem_svto=== " + bean.getRem_svto()); 
	    	System.out.println("bean.getRem_svplace=== " + bean.getRem_svplace()); 
	    	System.out.println("bean.getRem_badfrom=== " + bean.getRem_badfrom()); 
	    	System.out.println("bean.getRem_badto=== " + bean.getRem_badto()); 
	    	System.out.println("bean.getRem_bigo=== " + bean.getRem_bigo()); 
	    	System.out.println("bean.getChg_org=== " + bean.getChg_org()); 
	    	System.out.println("bean.getChg_nm( === " + bean.getChg_nm()); 
	    	System.out.println("bean.getAnn_date=== " + bean.getAnn_date()); 
	    	System.out.println("bean.getAnn_no( === " + bean.getAnn_no()); 
	    	System.out.println("bean.getRem_addr=== " + bean.getRem_addr());		
	    	
	    	System.out.println(getMessageSourceAccessor().getMessage("Querys.gapan.sugeo.RemInfoInsert"));
	    	*/
    	
	    	objExecuteRemInfo.update(values);
    	} catch (Exception e) {
			System.out.println(e.toString());

			e.printStackTrace();
		}
    	return bean;
    }
    
    public class ExecuteRemInfo extends SqlUpdate {
        public ExecuteRemInfo(DataSource dataSource)  throws SQLException{	        	
        	super(dataSource, getMessageSourceAccessor().getMessage("Querys.gapan.sugeo.RemInfoInsert"));
        	
            declareParameter(new SqlParameter(Types.VARCHAR));
      		declareParameter(new SqlParameter(Types.VARCHAR));
      		declareParameter(new SqlParameter(Types.VARCHAR));
      		declareParameter(new SqlParameter(Types.VARCHAR));
      		declareParameter(new SqlParameter(Types.VARCHAR));
      		
      		declareParameter(new SqlParameter(Types.VARCHAR));
      		declareParameter(new SqlParameter(Types.VARCHAR));
      		declareParameter(new SqlParameter(Types.VARCHAR));
      		declareParameter(new SqlParameter(Types.VARCHAR));
      		declareParameter(new SqlParameter(Types.VARCHAR));
      		
      		declareParameter(new SqlParameter(Types.VARCHAR));
      		declareParameter(new SqlParameter(Types.VARCHAR));
      		declareParameter(new SqlParameter(Types.VARCHAR));
      		declareParameter(new SqlParameter(Types.VARCHAR));
      		declareParameter(new SqlParameter(Types.VARCHAR));
      		
      		declareParameter(new SqlParameter(Types.VARCHAR));
      		declareParameter(new SqlParameter(Types.VARCHAR));
      		declareParameter(new SqlParameter(Types.VARCHAR));
      		declareParameter(new SqlParameter(Types.VARCHAR));
        }
    }   
    
    
    // 수거물품 리스트를 조회해 List 형태로 리턴
	public List goodsList(String mul_no, int intCurrentPage, int intCountPerPage ) {

		Object[] values = {mul_no, new Integer(intCurrentPage),new Integer(intCountPerPage) };
		
		return objGoodsList.execute(values); 
	
	}

	protected class GoodsList extends MappingSqlQuery {
		protected GoodsList(DataSource ds) {
			super(ds, getMessageSourceAccessor().getMessage(
					"Querys.gapan.goods.select"));
			
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
		}

		protected Object mapRow(ResultSet rs, int rownum) throws SQLException {
			
			SugeoBean objSugeoBean = new SugeoBean();

			objSugeoBean.setMul_no(rs.getString("MUL_NO"));
			objSugeoBean.setGoods_nm(rs.getString("GOODS_NM"));
			objSugeoBean.setGoods_cnt(rs.getString("GOODS_CNT"));
			objSugeoBean.setGoods_cqyn(rs.getString("GOODS_CQYN"));
			objSugeoBean.setGoods_svfrom(rs.getString("GOODS_SVFROM"));
			objSugeoBean.setGoods_svto(rs.getString("GOODS_SVTO"));
			objSugeoBean.setGoods_svnm(rs.getString("GOODS_SVNM"));
			objSugeoBean.setGoods_status(rs.getString("GOODS_STATUS"));
			objSugeoBean.setGoods_date(rs.getString("GOODS_DATE"));
			objSugeoBean.setGoods_bigo(rs.getString("GOODS_BIGO"));
			objSugeoBean.setGoods_seq(rs.getString("GOODS_SEQ"));
			objSugeoBean.setRN(rs.getString("RN"));
			
			return objSugeoBean;
		}
	}
	
	
	// 수거물품 게시물수를 리턴한다
	public int getGoodsTotalCount(String mul_no){
		
		Object[] values = {mul_no}; 
		
        String sql = getMessageSourceAccessor().getMessage("Querys.gapan.goods.count");
        //System.out.println("sql"+sql);
        return getJdbcTemplate().queryForInt(sql,values);		
	}
	
	
	// 물품정보 view 
	public SugeoBean goods_view(String goods_seq) {

		SugeoBean objSugeoBean = null;
		try{
			
			int goodsSeq = Integer.parseInt(goods_seq);
			Object[] values = {new Integer(goodsSeq)};
			objSugeoBean = (SugeoBean) objGoods_view.findObject(values);
			//System.out.println(getMessageSourceAccessor().getMessage("Querys.gapan.sugeo.goods_view"));
		
		} catch (Exception e) {
			System.out.println(e.toString());
			e.printStackTrace();
		}
		
		return objSugeoBean;
	}
	
	protected class Goods_view extends MappingSqlQuery {
		protected Goods_view(DataSource ds) {
			super(ds, getMessageSourceAccessor().getMessage(
					"Querys.gapan.sugeo.goods_view"));
			
			declareParameter(new SqlParameter(Types.INTEGER));
			
		}

		protected Object mapRow(ResultSet rs, int rownum) throws SQLException {
			
			SugeoBean objSugeoBean = new SugeoBean();
			
			objSugeoBean.setMul_no(rs.getString("MUL_NO"));
			objSugeoBean.setGoods_nm(rs.getString("GOODS_NM"));	
			objSugeoBean.setGoods_cnt(rs.getString("GOODS_CNT"));
			objSugeoBean.setGoods_cqyn(rs.getString("GOODS_CQYN"));
			objSugeoBean.setGoods_svfrom(rs.getString("GOODS_SVFROM"));
			objSugeoBean.setGoods_svto(rs.getString("GOODS_SVTO"));
			objSugeoBean.setGoods_svnm(rs.getString("GOODS_SVNM"));
			objSugeoBean.setGoods_status(rs.getString("GOODS_STATUS"));
			objSugeoBean.setGoods_date(rs.getString("GOODS_DATE"));
			objSugeoBean.setGoods_bigo(rs.getString("GOODS_BIGO"));
			objSugeoBean.setGoods_seq(rs.getString("GOODS_SEQ"));
			objSugeoBean.setGoods_status_name(rs.getString("GOODS_STATUS_NAME"));
			objSugeoBean.setGoods_cqyn_name(rs.getString("GOODS_CQYN_NAME"));
			return objSugeoBean;
		}
	}
	
	
	//	수거물품 입력
    public SugeoBean executeGoodsRegister(SugeoBean bean)
    {    	
    	try{	
	    	Object[] values = { bean.getMul_no() ,bean.getGoods_nm() , bean.getGoods_cnt() ,bean.getGoods_cqyn() , bean.getGoods_svfrom() ,
	    						bean.getGoods_svto() , bean.getGoods_svnm() , bean.getGoods_status() , bean.getGoods_date() , bean.getGoods_bigo()};
			
	    	/*System.out.println("bean.getMul_no());   === " + bean.getMul_no());
			System.out.println("bean.getGoods_nm()); === " + bean.getGoods_nm());
			System.out.println("bean.getGoods_cnt()) === " + bean.getGoods_cnt());
			System.out.println("bean.getGoods_cqyn() === " + bean.getGoods_cqyn());
			System.out.println("bean.getGoods_svfrom === " + bean.getGoods_svfrom());
			System.out.println("bean.getGoods_svto() === " + bean.getGoods_svto());
			System.out.println("bean.getGoods_svnm() === " + bean.getGoods_svnm());
			System.out.println("bean.getGoods_status === " + bean.getGoods_status());
			System.out.println("bean.getGoods_date() === " + bean.getGoods_date());
			System.out.println("bean.getGoods_bigo() === " + bean.getGoods_bigo());		
	    	
	    	System.out.println(getMessageSourceAccessor().getMessage("Querys.gapan.sugeo.GoodsInsert"));
	    	*/
    	
	    	objExecuteGoodsRegister.update(values);
    	} catch (Exception e) {
			System.out.println(e.toString());

			e.printStackTrace();
		}
    	return bean;
    }
    
    public class ExecuteGoodsRegister extends SqlUpdate {
        public ExecuteGoodsRegister(DataSource dataSource)  throws SQLException{	        	
        	super(dataSource, getMessageSourceAccessor().getMessage("Querys.gapan.sugeo.GoodsInsert"));
        	
            declareParameter(new SqlParameter(Types.VARCHAR));
      		declareParameter(new SqlParameter(Types.VARCHAR));
      		declareParameter(new SqlParameter(Types.VARCHAR));
      		declareParameter(new SqlParameter(Types.VARCHAR));
      		declareParameter(new SqlParameter(Types.VARCHAR));
      		
      		declareParameter(new SqlParameter(Types.VARCHAR));
      		declareParameter(new SqlParameter(Types.VARCHAR));
      		declareParameter(new SqlParameter(Types.VARCHAR));
      		declareParameter(new SqlParameter(Types.VARCHAR));
      		declareParameter(new SqlParameter(Types.VARCHAR));
      		
        }
    }
    
    
    
    // 과태료 입력
    public SugeoBean executeBugwa_RegisterPrc(SugeoBean bean)
    {    	
    	try{	
	    	Object[] values = { bean.getMul_no() ,bean.getOwner_nm() , bean.getOwner_ssn() ,bean.getOwner_zip() , bean.getOwner_zip_addr1() ,
	    						bean.getOwner_zip_addr2() , bean.getOwner_tel() , bean.getOwner_hp() , bean.getBugwa_yn() , bean.getBugwa_area() ,
	    						bean.getBugwa_danga(), bean.getBugwa_tax(), bean.getBugwa_red_rate(), bean.getBugwa_red_tax(), bean.getBugwa_form() ,
	    						bean.getBugwa_bigo() };
			
	    	/*System.out.println( " bean.getMul_no());       ==== " + bean.getMul_no());
	    	System.out.println( " bean.getOwner_nm());     ==== " + bean.getOwner_nm()); 
	    	System.out.println( " bean.getOwner_ssn());    ==== " + bean.getOwner_ssn());
	    	System.out.println( " bean.getOwner_zip());    ==== " + bean.getOwner_zip()); 
	    	System.out.println( " bean.getOwner_zip_addr1( ==== " + bean.getOwner_zip_addr1());                   
	    	System.out.println( " bean.getOwner_zip_addr2( ==== " + bean.getOwner_zip_addr2()); 
	    	System.out.println( " bean.getOwner_tel());    ==== " + bean.getOwner_tel()); 
	    	System.out.println( " bean.getOwner_hp());     ==== " + bean.getOwner_hp()); 
	    	System.out.println( " bean.getBugwa_yn());     ==== " + bean.getBugwa_yn()); 
	    	System.out.println( " bean.getBugwa_area());   ==== " + bean.getBugwa_area());   
	    	System.out.println( " bean.getBugwa_danga());  ==== " + bean.getBugwa_danga()); 
	    	System.out.println( " bean.getBugwa_tax());    ==== " + bean.getBugwa_tax());
	    	System.out.println( " bean.getBugwa_red_rate() ==== " + bean.getBugwa_red_rate()); 
	    	System.out.println( " bean.getBugwa_red_tax()) ==== " + bean.getBugwa_red_tax()); 
	    	System.out.println( " bean.getBugwa_form());   ==== " + bean.getBugwa_form());
	    	System.out.println( " bean.getBugwa_bigo()     ==== " + bean.getBugwa_bigo());
	    	
	    	
	    	System.out.println(getMessageSourceAccessor().getMessage("Querys.gapan.sugeo.BugwaInsert"));
	    	*/
    	
	    	objExecuteBugwa_RegisterPrc.update(values);
    	} catch (Exception e) {
			System.out.println(e.toString());

			e.printStackTrace();
		}
    	return bean;
    }
    
    public class ExecuteBugwa_RegisterPrc extends SqlUpdate {
        public ExecuteBugwa_RegisterPrc(DataSource dataSource)  throws SQLException{	        	
        	super(dataSource, getMessageSourceAccessor().getMessage("Querys.gapan.sugeo.BugwaInsert"));
        	
            declareParameter(new SqlParameter(Types.VARCHAR));
      		declareParameter(new SqlParameter(Types.VARCHAR));
      		declareParameter(new SqlParameter(Types.VARCHAR));
      		declareParameter(new SqlParameter(Types.VARCHAR));
      		declareParameter(new SqlParameter(Types.VARCHAR));
      		
      		declareParameter(new SqlParameter(Types.VARCHAR));
      		declareParameter(new SqlParameter(Types.VARCHAR));
      		declareParameter(new SqlParameter(Types.VARCHAR));
      		declareParameter(new SqlParameter(Types.VARCHAR));
      		declareParameter(new SqlParameter(Types.VARCHAR));
      		
      		declareParameter(new SqlParameter(Types.VARCHAR));
      		declareParameter(new SqlParameter(Types.VARCHAR));
      		declareParameter(new SqlParameter(Types.VARCHAR));
      		declareParameter(new SqlParameter(Types.VARCHAR));
      		declareParameter(new SqlParameter(Types.VARCHAR));
      		
      		declareParameter(new SqlParameter(Types.VARCHAR));      		
        }
    }
    
    
    // 폐기/매각 입력
    public SugeoBean executeSale_RegisterPrc(SugeoBean bean)
    {    	
    	try{	
	    	Object[] values = { bean.getMul_no() ,bean.getSale_type() , bean.getSale_bigo() ,bean.getSale_date() , bean.getSale_no() ,
	    						bean.getHnd_desdate() , bean.getHnd_type() , bean.getHnd_office() , bean.getHnd_opedate() , bean.getHnd_bigo() };
			
	    	/*System.out.println( " bean.getMul_no());   ==== " + bean.getMul_no());
	    	System.out.println( " bean.getSale_type(   ==== " + bean.getSale_type());
	    	System.out.println( " bean.getSale_bigo(   ==== " + bean.getSale_bigo());
	    	System.out.println( " bean.getSale_date(   ==== " + bean.getSale_date());
	    	System.out.println( " bean.getSale_no( 	   ==== " + bean.getSale_no());
	    	System.out.println( " bean.getHnd_desdate  ==== " + bean.getHnd_desdate());
	    	System.out.println( " bean.getHnd_type())  ==== " + bean.getHnd_type());
	    	System.out.println( " bean.getHnd_office(  ==== " + bean.getHnd_office());
	    	System.out.println( " bean.getHnd_opedate  ==== " + bean.getHnd_opedate());
	    	System.out.println( " bean.getHnd_bigo())  ==== " + bean.getHnd_bigo());
	    	
	    	
	    	System.out.println(getMessageSourceAccessor().getMessage("Querys.gapan.sugeo.SaleInsert"));
	    	*/
    	
	    	objExecuteSale_RegisterPrc.update(values);
    	} catch (Exception e) {
			System.out.println(e.toString());

			e.printStackTrace();
		}
    	return bean;
    }
    
    public class ExecuteSale_RegisterPrc extends SqlUpdate {
        public ExecuteSale_RegisterPrc(DataSource dataSource)  throws SQLException{	        	
        	super(dataSource, getMessageSourceAccessor().getMessage("Querys.gapan.sugeo.SaleInsert"));
        	
            declareParameter(new SqlParameter(Types.VARCHAR));
      		declareParameter(new SqlParameter(Types.VARCHAR));
      		declareParameter(new SqlParameter(Types.VARCHAR));
      		declareParameter(new SqlParameter(Types.VARCHAR));
      		declareParameter(new SqlParameter(Types.VARCHAR));
      		
      		declareParameter(new SqlParameter(Types.VARCHAR));
      		declareParameter(new SqlParameter(Types.VARCHAR));
      		declareParameter(new SqlParameter(Types.VARCHAR));
      		declareParameter(new SqlParameter(Types.VARCHAR));
      		declareParameter(new SqlParameter(Types.VARCHAR));
      		
        }
    }
    
    
    // 법정동,행정동 코드로 이름 가져오기
    public List getBjhjName(String sidu_cd, String sigu_cd, String bj_cd, String hj_cd)
	{

    	Object[] values = {sidu_cd, sigu_cd, bj_cd};
		//System.out.println(getMessageSourceAccessor().getMessage("Querys.gapan.sugeo.getBjhjName"));

		return objGetBjhjName.execute(values);
	}
		
	protected class GetBjhjName extends MappingSqlQuery {
		protected GetBjhjName(DataSource ds) {
			super(ds, getMessageSourceAccessor().getMessage(
					"Querys.gapan.sugeo.getBjhjName"));
		
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			
		}
		
		protected Object mapRow(ResultSet rs, int rownum) throws SQLException {

			SugeoBean objSugeoBean = new SugeoBean();

			objSugeoBean.setBj_nm(rs.getString("BJ_NM"));
			return objSugeoBean;
		}
	}
	
    
	
	// 수거정보  view 가져오기
	public SugeoBean getSugeoView(String SIDO_CD, String SIGU_CD, String mul_no) {

		SugeoBean objSugeoBean = null;
		try{
		
			Object[] values = {SIDO_CD, SIGU_CD, mul_no};
			//system.out.println(getMessageSourceAccessor().getMessage("Querys.gapan.sugeo.view"));
			objSugeoBean = (SugeoBean) objGetSugeoView.execute(values).get(0);
			
		
		} catch (Exception e) {
			System.out.println(e.toString());
			e.printStackTrace();
		}
		
		return objSugeoBean;
	}
	
	protected class GetSugeoView extends MappingSqlQuery {
		protected GetSugeoView(DataSource ds) {
			super(ds, getMessageSourceAccessor().getMessage(
					"Querys.gapan.sugeo.view"));
			
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
		}

		protected Object mapRow(ResultSet rs, int rownum) throws SQLException {
			
			SugeoBean objSugeoBean = new SugeoBean();

			objSugeoBean.setMul_no(rs.getString("MUL_NO"));
			objSugeoBean.setRem_date(rs.getString("REM_DATE"));
			objSugeoBean.setRem_bjcd(rs.getString("REM_BJCD"));
			objSugeoBean.setRem_hjcd(rs.getString("REM_HJCD"));
			objSugeoBean.setRem_mulcd(rs.getString("REM_MULCD"));
			objSugeoBean.setRem_mulnm(rs.getString("REM_MULNM"));
			objSugeoBean.setRem_area(rs.getString("REM_AREA"));
			objSugeoBean.setRem_nm(rs.getString("REM_NM"));
			objSugeoBean.setRem_svfrom(rs.getString("REM_SVFROM"));
			objSugeoBean.setRem_svto(rs.getString("REM_SVTO"));
			objSugeoBean.setRem_svplace(rs.getString("REM_SVPLACE"));
			objSugeoBean.setRem_badfrom(rs.getString("REM_BADFROM"));
			objSugeoBean.setRem_badto(rs.getString("REM_BADTO"));
			objSugeoBean.setRem_bigo(rs.getString("REM_BIGO"));
			objSugeoBean.setChg_org(rs.getString("CHG_ORG"));
			objSugeoBean.setChg_nm(rs.getString("CHG_NM"));
			objSugeoBean.setAnn_date(rs.getString("ANN_DATE"));
			objSugeoBean.setAnn_no(rs.getString("ANN_NO"));
			objSugeoBean.setRem_addr(rs.getString("REM_ADDR"));	
			objSugeoBean.setBj_nm(rs.getString("BJ_NM"));
			objSugeoBean.setRem_mulcd_nm(rs.getString("REM_MULCD_NM"));
			/*objSugeoBean.setGoods_nm(rs.getString("GOODS_NM"));	
			objSugeoBean.setGoods_cnt(rs.getString("GOODS_CNT"));
			objSugeoBean.setGoods_cqyn(rs.getString("GOODS_CQYN"));
			objSugeoBean.setGoods_svfrom(rs.getString("GOODS_SVFROM"));
			objSugeoBean.setGoods_svto(rs.getString("GOODS_SVTO"));
			objSugeoBean.setGoods_svnm(rs.getString("GOODS_SVNM"));
			objSugeoBean.setGoods_status(rs.getString("GOODS_STATUS"));
			objSugeoBean.setGoods_date(rs.getString("GOODS_DATE"));
			objSugeoBean.setGoods_bigo(rs.getString("GOODS_BIGO"));*/
			
			return objSugeoBean;
		}
	}
	
	
	// 과태료 테이블 중복체크
	public int getFineCnt(String mul_no)
	{  	
    	
    	Object[] values = { mul_no };
    	
		String sql = getMessageSourceAccessor().getMessage("Querys.gapan.sugeo.FineCnt");
	
		return 	getJdbcTemplate().queryForInt(sql, values);
	}
    
	// 폐기/매각 테이블 중복체크
	public int getSaleCnt(String mul_no)
	{  	
    	
    	Object[] values = { mul_no };
    	
		String sql = getMessageSourceAccessor().getMessage("Querys.gapan.sugeo.SaleCnt");
	
		return 	getJdbcTemplate().queryForInt(sql, values);
	}
	
	
	
	// 과태료,폐기/매각 view 가져오기
	public SugeoBean getSugeoBugwaView(String mul_no) {

		SugeoBean objSugeoBean = null;
		try{
			//System.out.println("mul_nomul_no  " + mul_no);
			Object[] values = { mul_no, mul_no };
			
			objSugeoBean = (SugeoBean) objGetSugeoBugwaView.findObject(values);
			
			//System.out.println(getMessageSourceAccessor().getMessage("Querys.gapan.sugeo.bugwaView"));
		
		} catch (Exception e) {
			System.out.println(e.toString());
			e.printStackTrace();
		}
		
		return objSugeoBean;
	}
	
	//  과태료,폐기/매각 view 가져오기
	protected class GetSugeoBugwaView extends MappingSqlQuery {
		protected GetSugeoBugwaView(DataSource ds) {
			super(ds, getMessageSourceAccessor().getMessage(
					"Querys.gapan.sugeo.bugwaView"));
			
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
		}

		protected Object mapRow(ResultSet rs, int rownum) throws SQLException {
			
			SugeoBean objSugeoBean = new SugeoBean();

			objSugeoBean.setMul_no(rs.getString("MUL_NO")); 
			objSugeoBean.setOwner_nm (rs.getString("OWNER_NM")); 
			objSugeoBean.setOwner_ssn(rs.getString("OWNER_SSN")); 
			objSugeoBean.setOwner_zip(rs.getString("OWNER_ZIP")); 
			objSugeoBean.setOwner_zip_addr1(rs.getString("OWNER_ZIP_ADDR1")); 
			objSugeoBean.setOwner_zip_addr2(rs.getString("OWNER_ZIP_ADDR2")); 
			objSugeoBean.setOwner_tel(rs.getString("OWNER_TEL")); 
			objSugeoBean.setOwner_hp(rs.getString("OWNER_HP")); 
			objSugeoBean.setBugwa_yn(rs.getString("BUGWA_YN")); 
			objSugeoBean.setBugwa_area(rs.getString("BUGWA_AREA")); 
			objSugeoBean.setBugwa_danga(rs.getString("BUGWA_DANGA")); 
			objSugeoBean.setBugwa_tax(rs.getString("BUGWA_TAX")); 
			objSugeoBean.setBugwa_red_rate(rs.getString("BUGWA_RED_RATE")); 
			objSugeoBean.setBugwa_red_tax(rs.getString("BUGWA_RED_TAX")); 
			objSugeoBean.setBugwa_form(rs.getString("BUGWA_FORM")); 
			objSugeoBean.setBugwa_bigo(rs.getString("BUGWA_BIGO"));
			objSugeoBean.setSale_type(rs.getString("SALE_TYPE"));
			objSugeoBean.setSale_bigo(rs.getString("SALE_BIGO"));
			objSugeoBean.setSale_date(rs.getString("SALE_DATE"));
			objSugeoBean.setSale_no(rs.getString("SALE_NO"));
			objSugeoBean.setHnd_desdate(rs.getString("HND_DESDATE"));
			objSugeoBean.setHnd_type(rs.getString("HND_TYPE"));
			objSugeoBean.setHnd_office(rs.getString("HND_OFFICE"));
			objSugeoBean.setHnd_opedate(rs.getString("HND_OPEDATE"));
			objSugeoBean.setHnd_bigo(rs.getString("HND_BIGO"));
			objSugeoBean.setBugwa_yn_name(rs.getString("BUGWA_YN_NAME"));
			
			return objSugeoBean;
		}
	}
	
	
	// 수거정보 수정
	public SugeoBean sugeo_modify(SugeoBean objSugeoBean) {
    	
		try{	
			 
	    	/*System.out.println("objSugeoBean.getRem_date=== " + objSugeoBean.getRem_date()); 
	    	System.out.println("objSugeoBean.getRem_bjcd(=== " + objSugeoBean.getRem_bjcd()); 
	    	System.out.println("objSugeoBean.getRem_hjcd(=== " + objSugeoBean.getRem_hjcd()); 
	    	System.out.println("objSugeoBean.getRem_mulcd=== " + objSugeoBean.getRem_mulcd()); 
	    	System.out.println("objSugeoBean.getRem_mulnm=== " + objSugeoBean.getRem_mulnm()); 
	    	System.out.println("objSugeoBean.getRem_area(=== " + objSugeoBean.getRem_area()); 
	    	System.out.println("objSugeoBean.getRem_nm()=== " + objSugeoBean.getRem_nm()); 
	    	System.out.println("objSugeoBean.getRem_svfrom=== " + objSugeoBean.getRem_svfrom()); 
	    	System.out.println("objSugeoBean.getRem_svto=== " + objSugeoBean.getRem_svto()); 
	    	System.out.println("objSugeoBean.getRem_svplace=== " + objSugeoBean.getRem_svplace()); 
	    	System.out.println("objSugeoBean.getRem_badfrom=== " + objSugeoBean.getRem_badfrom()); 
	    	System.out.println("objSugeoBean.getRem_badto=== " + objSugeoBean.getRem_badto()); 
	    	System.out.println("objSugeoBean.getRem_bigo=== " + objSugeoBean.getRem_bigo()); 
	    	System.out.println("objSugeoBean.getChg_org=== " + objSugeoBean.getChg_org()); 
	    	System.out.println("objSugeoBean.getChg_nm( === " + objSugeoBean.getChg_nm()); 
	    	System.out.println("objSugeoBean.getAnn_date=== " + objSugeoBean.getAnn_date()); 
	    	System.out.println("objSugeoBean.getAnn_no( === " + objSugeoBean.getAnn_no()); 
	    	System.out.println("objSugeoBean.getRem_addr=== " + objSugeoBean.getRem_addr());
	    	System.out.println("objSugeoBean.getMul_no  === " + objSugeoBean.getMul_no());
	    	*/
			Object[] values = { 		
					objSugeoBean.getRem_date()
					, objSugeoBean.getRem_bjcd()
					, objSugeoBean.getRem_hjcd()
					, objSugeoBean.getRem_mulcd()
					, objSugeoBean.getRem_mulnm()
					, objSugeoBean.getRem_area()
					, objSugeoBean.getRem_nm()
					, objSugeoBean.getRem_svfrom()
					, objSugeoBean.getRem_svto()
					, objSugeoBean.getRem_svplace()
					, objSugeoBean.getRem_badfrom()
					, objSugeoBean.getRem_badto()
					, objSugeoBean.getRem_bigo()
					, objSugeoBean.getChg_org()
					, objSugeoBean.getChg_nm()
					, objSugeoBean.getAnn_date()
					, objSugeoBean.getAnn_no()
					, objSugeoBean.getRem_addr()
					, objSugeoBean.getMul_no() };
					
			objSugeo_modify.update(values);	
			
			
		} catch (Exception e) {
			System.out.println(e.toString());

			e.printStackTrace();
		}
		
		return objSugeoBean;
	}
		
    public class Sugeo_modify extends SqlUpdate {
        public Sugeo_modify(DataSource dataSource) {

            super(dataSource, getMessageSourceAccessor().getMessage("Querys.gapan.sugeo.sugeo_modify"));
           
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
        }
    }
    
    
    
    // 수거물품정보 수정
	public SugeoBean sugeo_bugwa_modify(SugeoBean objSugeoBean) {
    	
		try{	
			
			Object[] values = { 		
					//objSugeoBean.getMul_no() , 
					 objSugeoBean.getGoods_nm()	
					, objSugeoBean.getGoods_cnt()
					, objSugeoBean.getGoods_cqyn()
					, objSugeoBean.getGoods_svfrom()
					, objSugeoBean.getGoods_svto()
					, objSugeoBean.getGoods_svnm()
					, objSugeoBean.getGoods_status()
					, objSugeoBean.getGoods_date()
					, objSugeoBean.getGoods_bigo()
					, objSugeoBean.getGoods_seq()
			};
					
			objSugeo_bugwa_modify.update(values);	
			
			
		} catch (Exception e) {
			System.out.println(e.toString());

			e.printStackTrace();
		}
		
		return objSugeoBean;
	}
		
    public class Sugeo_bugwa_modify extends SqlUpdate {
        public Sugeo_bugwa_modify(DataSource dataSource) {

            super(dataSource, getMessageSourceAccessor().getMessage("Querys.gapan.sugeo.sugeo_bugwa_modify"));
           
            //declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            
            declareParameter(new SqlParameter(Types.VARCHAR));
        }
    }
    
    
    // 과태료정보 수정
	public SugeoBean sugeo_fine_modify(SugeoBean objSugeoBean) {
    	
		try{	
			
			Object[] values = {
					objSugeoBean.getOwner_nm(),       
					objSugeoBean.getOwner_ssn(),      
					objSugeoBean.getOwner_zip(),      
					objSugeoBean.getOwner_zip_addr1(),
					objSugeoBean.getOwner_zip_addr2(),
					objSugeoBean.getOwner_tel(),      
					objSugeoBean.getOwner_hp(),       
					objSugeoBean.getBugwa_yn(),       
					objSugeoBean.getBugwa_area(),     
					objSugeoBean.getBugwa_danga(),    
					objSugeoBean.getBugwa_tax(),      
					objSugeoBean.getBugwa_red_rate(), 
					objSugeoBean.getBugwa_red_tax(),  
					objSugeoBean.getBugwa_form(),     
					objSugeoBean.getBugwa_bigo(),
					objSugeoBean.getMul_no() };
					
			objSugeo_fine_modify.update(values);	
			
			
		} catch (Exception e) {
			System.out.println(e.toString());

			e.printStackTrace();
		}
		
		return objSugeoBean;
	}
		
    public class Sugeo_fine_modify extends SqlUpdate {
        public Sugeo_fine_modify(DataSource dataSource) {

            super(dataSource, getMessageSourceAccessor().getMessage("Querys.gapan.sugeo.sugeo_fine_modify"));
           
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            
            declareParameter(new SqlParameter(Types.VARCHAR));
        }
    }
    
    
    // 폐기/매각 수정
	public SugeoBean sugeo_sale_modify(SugeoBean objSugeoBean) {
    	
		try{	
			
			Object[] values = {
					objSugeoBean.getSale_type()
					, objSugeoBean.getSale_bigo()
					, objSugeoBean.getSale_date()
					, objSugeoBean.getSale_no()
					, objSugeoBean.getHnd_desdate()
					, objSugeoBean.getHnd_type() 
					, objSugeoBean.getHnd_office()
					, objSugeoBean.getHnd_opedate()
					, objSugeoBean.getHnd_bigo() 
					, objSugeoBean.getMul_no() };
					
			objSugeo_sale_modify.update(values);	
			
			
		} catch (Exception e) {
			System.out.println(e.toString());

			e.printStackTrace();
		}
		
		return objSugeoBean;
	}
		
    public class Sugeo_sale_modify extends SqlUpdate {
        public Sugeo_sale_modify(DataSource dataSource) {

            super(dataSource, getMessageSourceAccessor().getMessage("Querys.gapan.sugeo.sugeo_sale_modify"));
           
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            
        }
    }
    
    
    // 가판코드로 이름 가져오기
    public	String gapanCodeNm(String cd_type, String cd_value)
	{
    	
    	Object[] values = {cd_type, cd_value};

    	String sql = getMessageSourceAccessor().getMessage("Querys.gapan.sugeo.gapanCdNm");
    	//System.out.println(sql);
    	
    	String cd_nm = "";
    	try
		{
			Map Request_Map = getJdbcTemplate().queryForMap(sql,values);
			cd_nm = Request_Map.get("NAME").toString();
		} catch (EmptyResultDataAccessException e) {
		   return null;
		}
	
    	return cd_nm;
	}
}
