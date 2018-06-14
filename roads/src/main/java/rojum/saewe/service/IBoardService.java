package main.java.rojum.saewe.service;

import java.util.List;

import main.java.admin.model.BoardBean;

public interface IBoardService {

	public List retrieveBoardList(int intCurrentPage, int intCountPerPage,String gubun,String content,String fromDate,String toDate,String openYN);
	public BoardBean insertBoard(BoardBean objBoardBean);
	public BoardBean getBoardDetail(int seq); 
	public BoardBean modify(BoardBean objBoardBean);
	public BoardBean delete(BoardBean objBoardBean);
	public int getBoardTotalCount(String gubun,String content,String fromDate,String toDate,String certYN);
	public List noticeBoardList(int intCurrentPage, int intCountPerPage,String gubun,String content,String fromDate,String toDate,String openYN);
}