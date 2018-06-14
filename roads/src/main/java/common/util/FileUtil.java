
/*********************************************************************************************************
 				*최초작성일 : 2006.05.30
				*최초작성자 : 이준형
				*주요처리내용 : 파일관련작업을 위한 Utility Class, 파일경로반환, 파일복사, 파일내용반환, 파일삭제, 파일쓰기 기능이 있다.
 				*수정일 :
				*수정자 :
				*수정내용 :
 *********************************************************************************************************/


package main.java.common.util;


//import kr.go.ngii.system.Globals;
//import gov.rnic.system.Globals;

import main.java.common.model.BoardFileBean;
import java.io.*;
import org.springframework.web.multipart.MultipartFile;

public class FileUtil {

    
	public FileUtil() {
	}

	/**
	 * File 저장을 위한 Server Path을 얻는 간단한 메쏘드입니다.
	 * static method 이므로 직접사용합니다. 이 문제때문에 혹 성능에 지장이 있다면 고치겠습니다.
	 * 필요에 따라 새로 저장할 디렉토리를 정의할 필요가 있다면 
	 *  Globals.FileDirInfo.DIR_NAME 변수에 해당 디렉토리명을 추가하시면 되겠습니다.
	 * @param 기존에 사용하던 문자열 그대로입니다. <br>Globals에 등록된 문자열기준입니다.
	 * @return 주어진 문자열(업무특성)에 해당되는 서버디렉토리를 반환합니다.
	 */
/*
	static public synchronized String getFileSavePath(String fileDir) 
		throws IOException {

		boolean valid = false;
		StringBuffer svrStr = new StringBuffer(Globals.FileDirInfo.SERVER_ROOT);
		StringBuffer retStr = new StringBuffer("");

		int len = Globals.FileDirInfo.DIR_NAME.length;
		for (int n = 0; n < len; n++) {
			if (fileDir.equals(Globals.FileDirInfo.DIR_NAME[n])) {
				valid = true;
				break;
			}
		}
		if (!valid) {
			throw new IllegalArgumentException("Invalid File Directory Name : ["
												+ fileDir + "]");
		}

		DateUtility date = new DateUtility();
		retStr.append(fileDir);
		retStr.append(new SimpleDateFormat("/yyyy/MMdd/",Locale.KOREA).format(new Date()));
		svrStr.append(retStr);

		File svrdir = new File(svrStr.toString());
		//System.out.println("return svrStr="+svrStr.toString());
		if (!svrdir.exists()) {
			svrdir.mkdirs();
		}

		if(fileDir.equals("workflowbody")||fileDir.equals("form")){
			svrStr = new StringBuffer("");
			svrStr.append(retStr);
		}
		//System.out.println("Miraje Return path = " + svrStr.toString());
		//System.out.println("Return path = " + retStr.toString());
		return svrStr.toString();
	}
*/
	/**
	 * File 저장을 위한 Server Path을 얻는 간단한 메쏘드입니다.
	 * static method 이므로 직접사용합니다. 이 문제때문에 혹 성능에 지장이 있다면 고치겠습니다.
	 * 필요에 따라 새로 저장할 디렉토리를 정의할 필요가 있다면 
	 *  Globals.FileDirInfo.DIR_NAME 변수에 해당 디렉토리명을 추가하시면 되겠습니다.
	 * 파일디렉토리밑에 숫자형태의 디렉토리를 만들지 않고 저장합니다. 기본적인 기능은 getFileSavePath
	 * 과 동일합니다.
	 * @param 기존에 사용하던 문자열 그대로입니다. <br>Globals에 등록된 문자열기준입니다.
	 * @return 주어진 문자열(업무특성)에 해당되는 서버디렉토리를 반환합니다.
	 */
	static public synchronized String getFileSavePathWithoutDate(String fileDir)
        throws IOException {

        boolean valid = false;
        StringBuffer svrStr = new StringBuffer(Globals.FILEDIRINFO_SERVER_ROOT);
        System.out.println("SERVER_ROOT : " + svrStr.toString());
        StringBuffer retStr = new StringBuffer("");

        System.out.println("Requested FILE_DIR Name = " + fileDir);
        int len = Globals.FILEDIRINFO_DIR_NAME.length;
        System.out.println(" len ----" + len);
        for (int n = 0; n < len; n++) {
            if (fileDir.equals(Globals.FILEDIRINFO_DIR_NAME[n])) {
                valid = true;
                break;
            }
        }
        if (!valid) {
            throw new IllegalArgumentException("Invalid File Directory Name : ["
                                                + fileDir + "]");
        }

        retStr.append(fileDir);
        svrStr.append(retStr);

        File svrdir = new File(svrStr.toString());
        //System.out.println("return svrStr="+svrStr.toString());
        if (!svrdir.exists()) {
            svrdir.mkdirs();
        }

        if(fileDir.equals("workflowbody")||fileDir.equals("form")){
            svrStr = new StringBuffer("");
            svrStr.append(retStr);
        }
        //System.out.println("Miraje Return path = " + svrStr.toString());
        //System.out.println("Return path = " + retStr.toString());
        return svrStr.toString();

    }


	/**
	 * @param 기존에 사용하던 문자열 그대로입니다. <br>Globals에 등록된 문자열기준입니다.
	 *        예)"workflow","mail","edms","mailbody".....
	 * @return 주어진 문자열(업무특성)에 해당되는 서버디렉토리에서 루트디렉토리범주를 빼고 나머지를 반환합니다.
	 */
/*
	public static synchronized String getFileSavePathWithoutRootDir(String fileDir){
		boolean valid = false;

		String fullServerPath = Globals.FileDirInfo.SERVER_ROOT;
		String simpleServerPath = "";
		int len = Globals.FileDirInfo.DIR_NAME.length;
		for (int n = 0; n < len; n++) {
			if (fileDir.equals(Globals.FileDirInfo.DIR_NAME[n])) {
				valid = true;
				break;
			}
		}
		if (!valid) {
			throw new IllegalArgumentException("Invalid File Directory Name : ["
												+ fileDir + "]");
		}

		DateUtility date = new DateUtility();

		simpleServerPath = fileDir 
						 + new SimpleDateFormat("/yyyy/MMdd/",Locale.KOREA).format(new Date());
		fullServerPath += simpleServerPath;

		File svrdir = new File(fullServerPath);
		if (!svrdir.exists()) {
			svrdir.mkdirs();
		}

		return simpleServerPath;

	}
*/
	public static  boolean isFileExist(String fileDir){
		File svrdir = new File(fileDir);
		if(svrdir.isFile()){
			return false;
		} else {
			return true;
		}
	}
	/**
	 * 서버에 파일디렉토리가 존재하는지 확인한 후, 
	 * @param fileDir
	 * @return
	 */
	public static  boolean getExitFilePath(String fileDir){
		boolean bResult = false;
		File svrdir = new File(fileDir);
		if(!svrdir.exists()){
			bResult = svrdir.mkdirs();
		} else {
			bResult = true;
		}
		return bResult;
	}

	boolean msg;

	/**
	 * 파일복사 메쏘드
	 * @param inFile은 원본파일명-풀패스, 
			  outFile은 복사되서 생성될 파일명풀패쓰  
			  웬만하면 다 full path입니다.-_-;;;
	 * @return 성공하면 true, 아니면  false
	 */
	public boolean copy(String inFile, String outFile) 
		throws IOException{
		FileInputStream fin = null;
		FileOutputStream fout = null;
		try{

			fin = new FileInputStream(inFile);
			fout = new FileOutputStream(outFile);
			duplicate(fin,fout);

		}finally{
			msg = true;
			try{
				if(fin != null){
					fin.close();
				}
			}catch(IOException e){
				msg = false;
				
			}
			try{
				if(fout != null){
					fout.close();
				}
			}catch(IOException e){
				msg = false;
			}
			
		}
		return msg;
	}
	/**
	 * 파일복사 메쏘드
	 * @param inFile은 원본파일명-풀패스, 
			  outFile은 복사되서 생성될 파일명풀패쓰  
			  웬만하면 다 full path입니다.-_-;;;
	 * @return 복사된 파일을 리턴한다.
	 */
    public FileOutputStream copy2(String inFile, String outFile)
        throws IOException{
        FileInputStream fin = null;
        FileOutputStream fout = null;
        try{

            fin = new FileInputStream(inFile);
            fout = new FileOutputStream(outFile);
            duplicate(fin,fout);

        }finally{
            msg = true;
            try{
                if(fin != null){
                    fin.close();
                }
            }catch(IOException e){
                msg = false;

            }
            try{
                if(fout != null){
                    fout.close();
                }
            }catch(IOException e){
                msg = false;
            }

        }
        return fout;
    }
	
	/**
	 * copy()내부에서 사용하는 메쏘드로 쓰실일 없으실 듯 합니다..
	 */
	public void duplicate(InputStream in, OutputStream out) throws IOException{
		byte[] buffer = new byte[256];
		while(true){
			int bytesRead = in.read(buffer);
			if(bytesRead== -1){
				break;
			}
			out.write(buffer, 0, bytesRead);
					
		}
	}
   /**
	* 파일내용을 String으로 반환( Text File에 적용)
	* @param 읽을 파일의 절대경로+ 파일명 
	* @return 파일내용을 나타내는 문자열
	*/

	public String getContent(String file){
        byte buf[] = new byte[8 * 1024];
        int rlen;

		StringBuffer buffer = new StringBuffer("");
		try{
            FileInputStream in = new FileInputStream(new File(file));

            while((rlen = in.read(buf, 0, buf.length)) != -1){
                buffer.append(new String(buf, 0, rlen));
            }
            in.close();


			return buffer.toString();
		}catch(IOException ioe){
			return  "[FileUtility.getContent()] FILE_OPEN_ERROR -->  " + ioe.toString();
		}
		
	}

	/**
	 * 파일삭제
	 * ※ 이 메소드가 별로 필요없을것 같습니다. 왜냐면 java.io.File의 메쏘드 delete()직접 써도 두줄이면 되므로...
	 * 그래도 구색을 위해 넣어놓았습니다
	 * @param 삭제하고자 하는 파일의 절대경로 + 파일명
	 * @return 성공하면 true, 아니면 false
     */
	public  static boolean delete(String filePath){
		File file = new File(filePath);
		System.out.println("1="+filePath);
		boolean flag = false;
		if(!file.exists()){
			System.out.println("2="+filePath);
			flag = false;
		}else{
			System.out.println("3="+filePath);
			file.delete();
			System.out.println("4="+filePath);
			flag = true;
		}
		return flag;
	}

	/**
	 * parameter로 전달받은 문자열을 파일로 저장하는 메쏘드인데 별거 없습니다.
	 * 반환형으로 작업성공여부를 나타내는 것은 포함하지 않았습니다.
	 * @param String fileName - 파일의 절대경로 + 파일명 모두를 주세요,<br>  String content-저장할 문자열입니다.
	 *
	 */
	 public void writeFile(String fileName, String content){
		try {
			File file = new File(fileName);
			//boolean flag = false;
			FileWriter fWriter = new FileWriter(file);
			BufferedWriter bWriter = new BufferedWriter(fWriter);
            BufferedReader br = new BufferedReader(new StringReader(content));
            String line = "";
            while((line = br.readLine()) != null){
			   bWriter.write(line+"\n", 0, line.length()+1);
            }
            br.close();
			bWriter.close();
			fWriter.close();
		}catch(IOException ioe){

		}
	 }

	 /**
	  * 파라메터로 전달받은 문자열을 파일로 생성하는 메쏘드인데 위의 메소드에 인자 하나 더 추가했습니다.
	  * 추가된 인자는 String saveDirectory....
	  * 예) FileUtility f = new FileUtility();
	  *     f.writeFile("mail","test.txt","Hello~~ ");
	  * @param String saveDirectory - 저장될 디렉토리를 나타내는 문자열(<br>예 : "workflow","mail","bulletinbody"... 원래 쓰던 문자열), <br>String fileName - 생성하고자 하는 파일의 절대경로,  <br>String content - 저장하고자 하는 문자열.
	  */
/*
	  public void writeFile(String saveDirectory, String fileName, String content){

		try {
			String dir = FileUtil.getFileSavePath(saveDirectory);
			File file = new File(fileName);
			boolean flag = false;
			FileWriter fWriter = new FileWriter(dir +  file);
			BufferedWriter bWriter = new BufferedWriter(fWriter);
			bWriter.write(content, 0, content.length());
			bWriter.close();
			fWriter.close();
		}catch(IOException ioe){
		}
	  }
	/**
	* 서버의 폴더를 제거
	* @param dirToBeDeleted 삭제대상 디렉토리
	*/
    public static void rmdir(String dirToBeDeleted){
        File dir = new File(dirToBeDeleted);

        if(!dir.exists()){
            return;
        }
        if(!dir.isDirectory()){
            return;
        }

        File f = null;

        String[] files = dir.list();
        if(files.length == 0){
            f = new File(dirToBeDeleted);
            f.delete();
            return;
        }
        for(int i= 0; i<files.length; i++){
            f = new File(dirToBeDeleted + "/" + files[i]);
            f.delete();
        }
        f = new File(dirToBeDeleted);
        f.delete();

    }
    
    public static void deleteDir(String path) { 
    	deleteDir(new File(path)); 
    } 

    public static void deleteDir(File file) { 
    	if (!file.exists()) return; 

    	File[] files = file.listFiles(); 
    	for (int i = 0; i < files.length; i++) { 
	    	if (files[i].isDirectory()) { 
	    		deleteDir(files[i]); 
	    	} else { 
	    		files[i].delete(); 
	    	} 
    	} 
    	file.delete(); 
    } 

	public static void main(String s[]){
/*
		try{
			System.out.println("ORGN PARSING : " +FileUtil.getFileSavePath("organization"));
		}catch(IOException e){
			System.out.println("From com.enrises.office.file.FileUtility : " + e.toString());
		}
*/
	}

    public static BoardFileBean uploadFormFile(MultipartFile formFile, String realPath) {
        InputStream stream;

//        UUID uuid = UUID.randomUUID();
//        String tempFileName = uuid.toString();
        	String tempFileName="aaa";
        
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

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        BoardFileBean boardFile = new BoardFileBean();
        boardFile.setFileName(formFile.getOriginalFilename());
        boardFile.setFileSize(formFile.getSize());
        boardFile.setContentType(formFile.getContentType());
        boardFile.setTempFileName(tempFileName);

        return boardFile;
    }
}


	



