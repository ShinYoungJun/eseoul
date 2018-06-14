package main.java.common.dao;

import java.util.List;


import main.java.common.model.BoardFileBean;

import org.springframework.dao.DataAccessException;

public interface IBoardFileDao {
 	public boolean createBoardFiles(int intNum, List objBoardFileList)	throws DataAccessException;
 	
 	public boolean createBoardFile(int intNum, BoardFileBean objBoardFileBean)	throws DataAccessException; 	
    
	public BoardFileBean getBoardFile(int intFileNo) throws DataAccessException;

	public BoardFileBean getBoardFile(String strBoardNo, int intNum) throws DataAccessException;	

	public  boolean deleteBoardFiles(String strBoardNo, int intNum)  throws DataAccessException;
	
	public  boolean deleteBoardFile(int intFileNo) throws DataAccessException;

 	public List getBoardFiles(String strBoardNo, int intNum) throws DataAccessException;
}
