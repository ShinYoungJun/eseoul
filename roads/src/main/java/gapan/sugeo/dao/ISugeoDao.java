
package main.java.gapan.sugeo.dao;

import java.util.List;

import main.java.gapan.sugeo.model.SugeoBean;
//import main.java.gapan.sugeo.model.TaxationBean;

public interface ISugeoDao {

	public List	executeSearch(SugeoBean Bean, int intRn1,int intRn2);
	public int executeCount(SugeoBean Bean);
	
	public String executeGapan_MulNo(String sigu_cd, String rem_bjcd);
	public SugeoBean executeRemInfo(SugeoBean Bean);
	
	public List goodsList(String mul_no, int intRn1, int intRn2);
	public int getGoodsTotalCount(String mul_no);
	public SugeoBean goods_view(String goods_seq);
	
	public SugeoBean executeGoodsRegister(SugeoBean Bean);
	public SugeoBean executeBugwa_RegisterPrc(SugeoBean Bean);
	public SugeoBean executeSale_RegisterPrc(SugeoBean Bean);
	
	public List getBjhjName(String sidu_cd, String sigu_cd, String bj_cd, String hj_cd);
	
	public SugeoBean getSugeoView(String SIDO_CD, String SIGU_CD, String mul_no);
	
	public int getFineCnt(String mul_no);
	public int getSaleCnt(String mul_no);
	
	public SugeoBean getSugeoBugwaView(String mul_no);
	
	public SugeoBean sugeo_modify(SugeoBean Bean);
	public SugeoBean sugeo_bugwa_modify(SugeoBean Bean);
	public SugeoBean sugeo_fine_modify(SugeoBean Bean);
	public SugeoBean sugeo_sale_modify(SugeoBean Bean);
	
	public String gapanCodeNm(String cd_type, String cd_value);
}
