package main.java.common.service;

import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.RequestUtils;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;


import main.java.common.model.BoardFileBean;



//import gov.mogaha.rnic.common.util.FileUploadUtil;
import main.java.common.util.FileUploadUtil;
//import gov.mogaha.rnic.common.util.FileUtil;
import main.java.common.util.FileUtil;

import main.java.common.util.Globals;
import main.java.common.dao.IBoardFileDao;

import javax.servlet.http.HttpServletRequest;

public class BoardFileServiceImpl implements BoardFileService{

	private IBoardFileDao objBoardFileDao = null;
	
	/**
	* ���ε� ���� ����
	* DB, ���������� ��� ����
	* @param	String tempFileName ���ϸ�
	*/
	public void mapDeleteImageFile(String strFileNm){
				
		FileUtil.delete(strFileNm); 
				 
	}

}	
