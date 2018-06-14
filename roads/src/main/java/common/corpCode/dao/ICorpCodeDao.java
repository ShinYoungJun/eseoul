//	2009		Kim Yun Seo

package main.java.common.corpCode.dao;

import java.util.List;

import main.java.admin.model.UserRegBean;


public interface ICorpCodeDao{
	
	public List executeCorpCodeList(String strCorpNm, String guCd);
	public UserRegBean getUserInfoDetail(String userId);
}
