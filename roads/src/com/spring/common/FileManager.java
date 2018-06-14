package com.spring.common;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Calendar;

import javax.servlet.http.HttpServletResponse;

import org.springframework.util.FileCopyUtils;
import org.springframework.stereotype.Service;

@Service("fileManager")
public class FileManager {

	// path : ������ ������ ���
	// ���� : ������ ����� ���ο� ���ϸ�
	public String doFileUpload(InputStream is, String originalFileName, String path) throws Exception {
		String newFileName = null;

		if(is == null)
			return null;
		
		// Ŭ���̾�Ʈ�� ���ε��� ������ �̸�
		if(originalFileName.equals(""))
			return null;
		
		// Ȯ����
		String fileExt = originalFileName.substring(originalFileName.lastIndexOf("."));
		if(fileExt == null || fileExt.equals(""))
			return null;
		
		// ������ ������ ���ο� ���ϸ��� �����.
		newFileName = String.format("%1$tY%1$tm%1$td%1$tH%1$tM%1$tS", 
				         Calendar.getInstance());
		newFileName += System.nanoTime();
		newFileName += fileExt;
		
		// ���ε��� ��ΰ� �������� �ʴ� ��� ������ ���� �Ѵ�.
		File dir = new File(path);
		if(!dir.exists())
			dir.mkdirs();
		
		String fullFileName = path + File.separator + newFileName;
		
		FileCopyUtils.copy(is, new FileOutputStream(fullFileName));
/*System.out.println("path : " + path);
System.out.println("fullFileName : " + fullFileName);
System.out.println("newFileName : " + newFileName);		*/
		return newFileName;
	}
	
	// ���� �ٿ�ε�
	// saveFileName : ������ ����� ���ϸ�
	// originalFileName : Ŭ���̾�Ʈ�� ���ε��� ���ϸ�
	// path : ������ ����� ���
	public boolean doFileDownload(String saveFileName, String originalFileName, String path, HttpServletResponse response) {
		String load_dir = path + File.separator + saveFileName;
		
        try {
    		if(originalFileName == null || originalFileName.equals(""))
    			originalFileName = saveFileName;
    		//********** BEGIN_����_20120219
    		//originalFileName = new String(originalFileName.getBytes("euc-kr"),"8859_1");    		
    		originalFileName = URLEncoder.encode(originalFileName, "UTF-8");
    		originalFileName = originalFileName.replaceAll("\\+", " ");
    		//********** END_����_20120219
        	
        } catch (UnsupportedEncodingException e) {
        	
        }

	    try {
	        File file = new File(load_dir);

	        if (file.exists()){
	            byte readByte[] = new byte[4096];

	            response.setContentType("application/octet-stream");
	          //********** BEGIN_����_20120219
	            response.setHeader(
						"Content-disposition",
						//"attachment;filename=" + originalFileName);
						"attachment;filename=" + "\"" +originalFileName+ "\"");
				response.setHeader("Content-Transfer-Encoding","Binary");	            
	          //********** END_����_20120219	            
	            BufferedInputStream  fin  = new BufferedInputStream(new FileInputStream(file));
	            //javax.servlet.ServletOutputStream outs =	response.getOutputStream();
	            OutputStream outs = response.getOutputStream();
	            
	   			int read;
	    		while ((read = fin.read(readByte, 0, 4096)) != -1)
	    				outs.write(readByte, 0, read);
	    		outs.flush();
	    		outs.close();
	            fin.close();
	            
	            return true;
	        }
	    } catch(Exception e) {
	    }
	    
	    return false;
	}
	
	// ���� ���� ����
	public void doFileDelete(String fileName, String path) 
	        throws Exception {
		File file = null;
		String fullFileName = path + File.separator + fileName;
        file = new java.io.File(fullFileName);
        if (file.exists())
           file.delete();
	}	
}
