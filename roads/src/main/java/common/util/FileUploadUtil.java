/**
 * �� �ҽ��� Spring �����ӿ�ũ ��ũ�Ͽ��� ����� ���� �ҽ��Դϴ�. 
 * �� �ҽ��� ��� �����ڵ��� �����Ӱ� ���� �� ������ �� �ֽ��ϴ�. 
 * ��, �� �ҽ��� ������� ���ο� ���ø����̼��� ������ ��� ��ó�� ����� �ֽø� �˴ϴ�. 
 */
package main.java.common.util;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import main.java.common.model.BoardFileBean;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.multipart.MultipartFile;

public class FileUploadUtil {
    protected static Log logger = LogFactory.getLog(FileUploadUtil.class);

    public static BoardFileBean uploadFormFile(MultipartFile formFile, String realPath) {
        InputStream stream;

        UUID uuid = UUID.randomUUID();
        String tempFileName = uuid.toString();
        String strFileName = formFile.getOriginalFilename();
        
        strFileName = strFileName.replaceAll("%00","");	//	00 ����
        strFileName = strFileName.replaceAll("%02","");	//	02 ����       
        strFileName = strFileName.replaceAll(" ","");	//	��������        
            
        try {
            stream = formFile.getInputStream();
            
            String strExtension = FileUploadUtil.getExtension(strFileName).toLowerCase(); //�빮�� �ҹ��ڷ� ġȯ�Լ�
            
            if(strExtension.equals(".jpg")||strExtension.equals(".gif")||strExtension.equals(".bmp")
            		||strExtension.equals(".hwp")||strExtension.equals(".doc")||strExtension.equals(".xls")||strExtension.equals(".txt")
            		||strExtension.equals(".ppt")||strExtension.equals(".zip")||strExtension.equals(".wmv")||strExtension.equals(".mpg")
            		||strExtension.equals(".pdf"))
            {
	            if(!strExtension.equals(""))
	            	tempFileName = tempFileName+strExtension;
                  
	            OutputStream bos = new FileOutputStream(realPath + tempFileName);
	            int bytesRead = 0;
	            byte[] buffer = new byte[8192];
	            while ((bytesRead = stream.read(buffer, 0, 8192)) != -1) {
	                bos.write(buffer, 0, bytesRead);
	            }
	            bos.close();
	            stream.close();
            }
            else{
            	System.out.println("����");
            	BoardFileBean boardFile = new BoardFileBean();
            	
            	return boardFile;
            }

System.out.println("The file has been written to \"" + realPath+ tempFileName);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        BoardFileBean boardFile = new BoardFileBean();
        boardFile.setFileName(strFileName);
        boardFile.setFileSize(formFile.getSize());
        boardFile.setContentType(formFile.getContentType());
        boardFile.setTempFileName(tempFileName);

        return boardFile;
    }
    
    public static String getExtension(String strFileName){
    	
    	try{
    		int intIdx = strFileName.lastIndexOf(".");
    		String strExtention = strFileName.substring(intIdx);
    		return strExtention;
    		
    	}catch(Exception e){
    		return "";
    	}
    		
    }
    
    public static String uploadFile(MultipartFile formFile, String realPath) {
        InputStream stream;

        UUID uuid = UUID.randomUUID();
        String tempFileName = uuid.toString();
        
        System.out.println("FileTransform:"+realPath);
        try {
            stream = formFile.getInputStream();

            OutputStream bos = new FileOutputStream(realPath + tempFileName);
            int bytesRead = 0;
            byte[] buffer = new byte[8192];
            while ((bytesRead = stream.read(buffer, 0, 8192)) != -1) {
                bos.write(buffer, 0, bytesRead);
            }
            bos.close();
            stream.close();

            System.out.println("The file has been written to \"" + realPath+ tempFileName);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return tempFileName;
    }
    
    public static BoardFileBean mapUploadFile(MultipartFile formFile, String fileName) {
        InputStream stream;

        UUID uuid = UUID.randomUUID();
        String tempFileName = fileName; //uuid.toString(); 
        String strFileName = formFile.getOriginalFilename();
        strFileName = strFileName.replaceAll("%00","");	//	00 ����
        strFileName = strFileName.replaceAll("%02","");	//	02 ����       
        strFileName = strFileName.replaceAll(" ","");	//	��������               
                 
        System.out.println("check:"+strFileName);
        
        try {
            stream = formFile.getInputStream();
            
            String strExtension = FileUploadUtil.getExtension(strFileName).toLowerCase();
            if(strExtension.equals(".jpg")){
	            if(!strExtension.equals(""))
	            	tempFileName = tempFileName+strExtension;
  	            OutputStream bos = new FileOutputStream(Globals.MAPFILEUPLOADPATH + tempFileName);
	            int bytesRead = 0;
	            byte[] buffer = new byte[8192];
	            while ((bytesRead = stream.read(buffer, 0, 8192)) != -1) {
	                bos.write(buffer, 0, bytesRead);
	            }
	            bos.close();
	            stream.close();
            }
            else{
            	BoardFileBean boardFile = new BoardFileBean();
            	return boardFile;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        BoardFileBean boardFile = new BoardFileBean();
        boardFile.setFileName(strFileName);
        boardFile.setFileSize(formFile.getSize());
        boardFile.setContentType(formFile.getContentType());
        boardFile.setTempFileName(tempFileName);

        return boardFile;
    }
}
