/**
 * 이 소스는 Spring 프레임워크 워크북에서 사용한 예제 소스입니다. 
 * 이 소스는 모든 개발자들이 자유롭게 수정 및 배포할 수 있습니다. 
 * 단, 이 소스를 기반으로 새로운 애플리케이션을 개발할 경우 출처를 명시해 주시면 됩니다. 
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
        
        strFileName = strFileName.replaceAll("%00","");	//	00 제거
        strFileName = strFileName.replaceAll("%02","");	//	02 제거       
        strFileName = strFileName.replaceAll(" ","");	//	공백제거
      

        
        try {
            stream = formFile.getInputStream();
            
            String strExtension = getExtension(strFileName).toLowerCase(); //확장자 분리후, 대문자 소문자로 치환함수
            
            /*
            if(strExtension.equals(".jpg")||strExtension.equals(".gif")||strExtension.equals(".bmp")
            		||strExtension.equals(".hwp")||strExtension.equals(".doc")||strExtension.equals(".xls")||strExtension.equals(".txt")
            		||strExtension.equals(".ppt")||strExtension.equals(".zip")||strExtension.equals(".wmv")||strExtension.equals(".mpg")
            		||strExtension.equals(".pdf"))*/
            if(true)	
            {	
            	//같은파일이 있을경우 파일이름에 _1 더 붙임
            	
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
		File aFile = new File(strFileName);    //File 객체 생성
		// 파일이 존재하지 않을 경우
		if (aFile.isFile()) return true;
		else return false;    
    }
}
