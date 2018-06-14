
package main.java.gapan.sugeo.service;

import java.util.List;

import main.java.gapan.sugeo.dao.ISugeoDao;
import main.java.gapan.sugeo.model.SugeoBean;

public class SugeoService	implements	ISugeoService{
	
	private ISugeoDao iSugeoDao = null;
	
	public void setSugeoDao(ISugeoDao sugeoDao) {
	    this.iSugeoDao = sugeoDao;
	}
	
	public List executeSearch(SugeoBean Bean, int intRn1, int intRn2)
	{
		return iSugeoDao.executeSearch(Bean, intRn1, intRn2);
	}
		
	public int	executeCount(SugeoBean Bean)
	{
		return iSugeoDao.executeCount(Bean);
	}
	
	public String executeGapan_MulNo(String sigu_cd, String rem_bjcd)
	{
		return iSugeoDao.executeGapan_MulNo(sigu_cd, rem_bjcd);
	}
	
	public	SugeoBean executeRemInfo(SugeoBean Bean)
	{
		return iSugeoDao.executeRemInfo(Bean);
	}
	
	
	public List goodsList(String mul_no, int intRn1, int intRn2)
	{
		return iSugeoDao.goodsList(mul_no, intRn1, intRn2);
	}
		
	public int	getGoodsTotalCount(String mul_no)
	{
		return iSugeoDao.getGoodsTotalCount(mul_no);
	}

	public	SugeoBean goods_view(String goods_seq)
	{
		return iSugeoDao.goods_view(goods_seq);
	}
	
	public	SugeoBean executeGoodsRegister(SugeoBean Bean)
	{
		return iSugeoDao.executeGoodsRegister(Bean);
	}
	
	public	SugeoBean executeBugwa_RegisterPrc(SugeoBean Bean)
	{
		return iSugeoDao.executeBugwa_RegisterPrc(Bean);
	}

	public	SugeoBean executeSale_RegisterPrc(SugeoBean Bean)
	{
		return iSugeoDao.executeSale_RegisterPrc(Bean);
	}
	
	public List getBjhjName(String sidu_cd, String sigu_cd, String bj_cd, String hj_cd)
	{
		return iSugeoDao.getBjhjName(sidu_cd, sigu_cd, bj_cd, hj_cd);
	}
	
	public	SugeoBean getSugeoView(String SIDO_CD, String SIGU_CD, String mul_no)
	{
		return iSugeoDao.getSugeoView(SIDO_CD, SIGU_CD, mul_no);
	}
	
	public int	getFineCnt(String mul_no)
	{
		return iSugeoDao.getFineCnt(mul_no);
	}
	
	public int	getSaleCnt(String mul_no)
	{
		return iSugeoDao.getSaleCnt(mul_no);
	}
	
	public SugeoBean getSugeoBugwaView(String mul_no)
	{
		return iSugeoDao.getSugeoBugwaView(mul_no);
	}
	
	public	SugeoBean sugeo_modify(SugeoBean Bean)
	{
		return iSugeoDao.sugeo_modify(Bean);
	}
	
	public	SugeoBean sugeo_bugwa_modify(SugeoBean Bean)
	{
		return iSugeoDao.sugeo_bugwa_modify(Bean);
	}

	public	SugeoBean sugeo_fine_modify(SugeoBean Bean)
	{
		return iSugeoDao.sugeo_fine_modify(Bean);
	}
	
	public	SugeoBean sugeo_sale_modify(SugeoBean Bean)
	{
		return iSugeoDao.sugeo_sale_modify(Bean);
	}
	
	public String gapanCodeNm(String cd_type, String cd_value)
	{
		return iSugeoDao.gapanCodeNm(cd_type, cd_value);
	}
	
	
}
