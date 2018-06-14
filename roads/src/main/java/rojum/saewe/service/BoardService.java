package main.java.rojum.saewe.service;

import java.util.List;
import main.java.admin.dao.IBoardDao;
import main.java.admin.model.BoardBean;

public class BoardService implements IBoardService {

	private IBoardDao objBoardDao = null;

	public void setBoardDao(IBoardDao newBoardDao) {
		this.objBoardDao = newBoardDao;
	}

	public List retrieveBoardList(int intCurrentPage, int intCountPerPage, String gubun,String content,String fromDate,String toDate,String openYN) {
		

		return objBoardDao.retrieveBoardList(intCurrentPage,intCountPerPage,gubun,content,fromDate,toDate,openYN);
	}

	public BoardBean insertBoard(BoardBean objBoardBean) {
		
		objBoardDao.insertBoard(objBoardBean);
		return null;
	}
	
	/**
	* �Խù���ȣ�� �޾� dao�� ���� �ش�Ǵ� �Խ��� ��ü�� ����
	* @param	int seq	�Խù� ��ȣ
	* @return	BoardBean : �����Խ��� ��ü 
	*/
	public BoardBean getBoardDetail(int seq) {
	
		return objBoardDao.getBoardDetail(seq);
	}

	public BoardBean modify(BoardBean objBoardBean) {

		objBoardDao.modify(objBoardBean);
		return null;
	}

	public BoardBean delete(BoardBean objBoardBean) {

		objBoardDao.delete(objBoardBean);
		return null;
	}

	/**
	* dao�� ���� �Խ��� ��ü �Խù� ���� ����
	* @return	int	��ü �Խù� �Ǽ�  
	*/
	public int getBoardTotalCount(String gubun,String content,String fromDate,String toDate,String certYN){
		return objBoardDao.getBoardTotalCount(gubun,content,fromDate,toDate,certYN);
	}

	public List noticeBoardList(int intCurrentPage, int intCountPerPage, String gubun, String content, String fromDate, String toDate, String openYN) {

		return objBoardDao.noticeBoardList(intCurrentPage,intCountPerPage,gubun,content,fromDate,toDate,openYN);
	}
}