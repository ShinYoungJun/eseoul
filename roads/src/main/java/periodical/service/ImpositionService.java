/*********************************************************************************************************
 				*최초작성일 : 2006.07.12
				*최초작성자 : jklee, jhlee
				*주요처리내용 : Q&A게시판 관련 db작업을 처리
				*수정일 :
				*수정자 :
				*수정내용 :
 *********************************************************************************************************/

package main.java.periodical.service;

import java.util.List;
import main.java.periodical.dao.IImpositionDao;

public class ImpositionService implements IImpositionService {
	
	private IImpositionDao  objImpositionDao = null;

	public void setImpositionDao(IImpositionDao newImpositionDao) {
	    this.objImpositionDao = newImpositionDao;
	}
	
	public List periodicalBoardList()
	{
		return objImpositionDao.periodicalBoardList();
	}
	
}