//	2009		Kim Yun Seo

package main.java.common.purposeCode.service;

import java.util.List;

import main.java.common.purposeCode.dao.IPurposeCodeDao;


public class PurposeCodeService	implements	IPurposeCodeService{

	private IPurposeCodeDao	iPurposeCodeDao	= null;

	public	void	setPurposeCodeDao(IPurposeCodeDao purposeCodeDao)
	{
		this.iPurposeCodeDao = purposeCodeDao;
	}
	
	
	public List executePurposeCodeList(String SectionCode, String CODE)
	{
		return	iPurposeCodeDao.executePurposeCodeList(SectionCode, CODE);
	}
	

	public List executePurposeClassCodeList(String SectionCode)
	{
		return	iPurposeCodeDao.executePurposeClassCodeList(SectionCode);
	}
	

	public List executePurposeSortCodeList(String SectionCode, String CLASS_CD)
	{
		return	iPurposeCodeDao.executePurposeSortCodeList(SectionCode, CLASS_CD);
	}
	
	
	public List executePurposeKindCodeList(String SectionCode, String CLASS_CD, String SORT_CD)
	{	
		return	iPurposeCodeDao.executePurposeKindCodeList(SectionCode, CLASS_CD, SORT_CD);
	}

	
	public	List	executePurposeSebuCode(String CODE)
	{	
		return	iPurposeCodeDao.executePurposeSebuCode(CODE);
	}
}
