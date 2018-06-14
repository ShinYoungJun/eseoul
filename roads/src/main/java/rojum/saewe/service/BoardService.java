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
	* 게시물번호를 받아 dao를 통해 해당되는 게시판 객체를 리턴
	* @param	int seq	게시물 번호
	* @return	BoardBean : 자유게시판 객체 
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
	* dao를 통해 게시판 전체 게시물 수를 리턴
	* @return	int	전체 게시물 건수  
	*/
	public int getBoardTotalCount(String gubun,String content,String fromDate,String toDate,String certYN){
		return objBoardDao.getBoardTotalCount(gubun,content,fromDate,toDate,certYN);
	}

	public List noticeBoardList(int intCurrentPage, int intCountPerPage, String gubun, String content, String fromDate, String toDate, String openYN) {

		return objBoardDao.noticeBoardList(intCurrentPage,intCountPerPage,gubun,content,fromDate,toDate,openYN);
	}
}