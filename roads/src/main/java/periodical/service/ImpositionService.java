/*********************************************************************************************************
 				*�����ۼ��� : 2006.07.12
				*�����ۼ��� : jklee, jhlee
				*�ֿ�ó������ : Q&A�Խ��� ���� db�۾��� ó��
				*������ :
				*������ :
				*�������� :
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