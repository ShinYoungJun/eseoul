//	2009		Kim Yun Seo

package main.java.common.corpCode.service;

import java.util.List;

import main.java.admin.model.UserRegBean;
import main.java.common.corpCode.dao.ICorpCodeDao;


public class CorpCodeService	implements	ICorpCodeService{

	private ICorpCodeDao	iCorpCodeDao	= null;

	public	void	setCorpCodeDao(ICorpCodeDao corpCodeDao)
	{
		this.iCorpCodeDao = corpCodeDao;
	}

	public List executeCorpCodeList(String strCorpNm, String guCd)
	{
		return	iCorpCodeDao.executeCorpCodeList(strCorpNm, guCd);
	}
	
	public UserRegBean getUserInfoDetail(String userId) {
		return iCorpCodeDao.getUserInfoDetail(userId);
	}
}
