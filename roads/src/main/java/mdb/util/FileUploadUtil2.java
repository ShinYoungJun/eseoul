/**
 * �� �ҽ��� Spring �����ӿ�ũ ��ũ�Ͽ��� ����� ���� �ҽ��Դϴ�. 
 * �� �ҽ��� ��� �����ڵ��� �����Ӱ� ���� �� ������ �� �ֽ��ϴ�. 
 * ��, �� �ҽ��� ������� ���ο� ���ø����̼��� ������ ��� ��ó�� ����� �ֽø� �˴ϴ�. 
 */
package main.java.mdb.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import main.java.common.model.BoardFileBean;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.multipart.MultipartFile;

public class FileUploadUtil2 {
    protected static Log logger = LogFactory.getLog(FileUploadUtil2.class);

public static String uploadFormFile(MultipartFile formFile, String realPath,String userId) {
		
        InputStream stream;

        //UUID uuid = UUID.randomUUID();
        //String tempFileName = uuid.toString();
        String strFileName = formFile.getOriginalFilename();
        
        strFileName = strFileName.replaceAll("%00","");	//	00 ����
        strFileName = strFileName.replaceAll("%02","");	//	02 ����       
        strFileName = strFileName.replaceAll(" ","");	//	��������
      

        
        try {
            stream = formFile.getInputStream();
            
            String strExtension = getExtension(strFileName).toLowerCase(); //Ȯ���� �и���, �빮�� �ҹ��ڷ� ġȯ�Լ�
            
            /*
            if(strExtension.equals(".jpg")||strExtension.equals(".gif")||strExtension.equals(".bmp")
            		||strExtension.equals(".hwp")||strExtension.equals(".doc")||strExtension.equals(".xls")||strExtension.equals(".txt")
            		||strExtension.equals(".ppt")||strExtension.equals(".zip")||strExtension.equals(".wmv")||strExtension.equals(".mpg")
            		||strExtension.equals(".pdf"))*/
            if(true)	
            {	
            	//���������� ������� �����̸��� _1 �� ����
            	
            	strFileName = getNewFileName(strFileName, "_"+userId);
            	
            	while(fileExistYn(realPath+strFileName))
            	{
            		strFileName = getNewFileName(strFileName, "_1");
            	}
            	
            		

	            OutputStream bos = new FileOutputStream(realPath + strFileName);
	            

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
            }

            System.out.println("The file has been written to \"" + realPath+ strFileName);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        return strFileName;
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
	
	public static String getNewFileName(String strFileName,String strNewVal){		
		int intIdx = strFileName.lastIndexOf(".");
		int lastIdx = strFileName.length();				
		String returnVal = strFileName.substring(0,intIdx)+strNewVal+strFileName.substring(intIdx,lastIdx);
		return returnVal;
    }	
	
	

	public static boolean fileExistYn(String strFileName) {
		File aFile = new File(strFileName);    //File ��ü ����
		// ������ �������� ���� ���
		if (aFile.isFile()) return true;
		else return false;    
    }
}
