//	2009		Kim Yun Seo

package main.java.common.purposeCode.dao;

import java.util.List;


public interface IPurposeCodeDao{
	
	public 	List 	executePurposeCodeList(String SectionCode, String CODE);
	public 	List 	executePurposeClassCodeList(String SectionCode);
	public 	List 	executePurposeSortCodeList(String SectionCode, String CLASS_CD);
	public 	List 	executePurposeKindCodeList(String SectionCode, String CLASS_CD, String SORT_CD);
	public	List	executePurposeSebuCode(String CODE);
}
