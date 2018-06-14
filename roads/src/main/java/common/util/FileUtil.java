
/*********************************************************************************************************
 				*�����ۼ��� : 2006.05.30
				*�����ۼ��� : ������
				*�ֿ�ó������ : ���ϰ����۾��� ���� Utility Class, ���ϰ�ι�ȯ, ���Ϻ���, ���ϳ����ȯ, ���ϻ���, ���Ͼ��� ����� �ִ�.
 				*������ :
				*������ :
				*�������� :
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
	 * File ������ ���� Server Path�� ��� ������ �޽���Դϴ�.
	 * static method �̹Ƿ� ��������մϴ�. �� ���������� Ȥ ���ɿ� ������ �ִٸ� ��ġ�ڽ��ϴ�.
	 * �ʿ信 ���� ���� ������ ���丮�� ������ �ʿ䰡 �ִٸ� 
	 *  Globals.FileDirInfo.DIR_NAME ������ �ش� ���丮���� �߰��Ͻø� �ǰڽ��ϴ�.
	 * @param ������ ����ϴ� ���ڿ� �״���Դϴ�. <br>Globals�� ��ϵ� ���ڿ������Դϴ�.
	 * @return �־��� ���ڿ�(����Ư��)�� �ش�Ǵ� �������丮�� ��ȯ�մϴ�.
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
	 * File ������ ���� Server Path�� ��� ������ �޽���Դϴ�.
	 * static method �̹Ƿ� ��������մϴ�. �� ���������� Ȥ ���ɿ� ������ �ִٸ� ��ġ�ڽ��ϴ�.
	 * �ʿ信 ���� ���� ������ ���丮�� ������ �ʿ䰡 �ִٸ� 
	 *  Globals.FileDirInfo.DIR_NAME ������ �ش� ���丮���� �߰��Ͻø� �ǰڽ��ϴ�.
	 * ���ϵ��丮�ؿ� ���������� ���丮�� ������ �ʰ� �����մϴ�. �⺻���� ����� getFileSavePath
	 * �� �����մϴ�.
	 * @param ������ ����ϴ� ���ڿ� �״���Դϴ�. <br>Globals�� ��ϵ� ���ڿ������Դϴ�.
	 * @return �־��� ���ڿ�(����Ư��)�� �ش�Ǵ� �������丮�� ��ȯ�մϴ�.
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
	 * @param ������ ����ϴ� ���ڿ� �״���Դϴ�. <br>Globals�� ��ϵ� ���ڿ������Դϴ�.
	 *        ��)"workflow","mail","edms","mailbody".....
	 * @return �־��� ���ڿ�(����Ư��)�� �ش�Ǵ� �������丮���� ��Ʈ���丮���ָ� ���� �������� ��ȯ�մϴ�.
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
	 * ������ ���ϵ��丮�� �����ϴ��� Ȯ���� ��, 
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
	 * ���Ϻ��� �޽��
	 * @param inFile�� �������ϸ�-Ǯ�н�, 
			  outFile�� ����Ǽ� ������ ���ϸ�Ǯ�о�  
			  �����ϸ� �� full path�Դϴ�.-_-;;;
	 * @return �����ϸ� true, �ƴϸ�  false
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
	 * ���Ϻ��� �޽��
	 * @param inFile�� �������ϸ�-Ǯ�н�, 
			  outFile�� ����Ǽ� ������ ���ϸ�Ǯ�о�  
			  �����ϸ� �� full path�Դϴ�.-_-;;;
	 * @return ����� ������ �����Ѵ�.
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
	 * copy()���ο��� ����ϴ� �޽��� ������ ������ �� �մϴ�..
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
	* ���ϳ����� String���� ��ȯ( Text File�� ����)
	* @param ���� ������ ������+ ���ϸ� 
	* @return ���ϳ����� ��Ÿ���� ���ڿ�
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
	 * ���ϻ���
	 * �� �� �޼ҵ尡 ���� �ʿ������ �����ϴ�. �ֳĸ� java.io.File�� �޽�� delete()���� �ᵵ �����̸� �ǹǷ�...
	 * �׷��� ������ ���� �־���ҽ��ϴ�
	 * @param �����ϰ��� �ϴ� ������ ������ + ���ϸ�
	 * @return �����ϸ� true, �ƴϸ� false
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
	 * parameter�� ���޹��� ���ڿ��� ���Ϸ� �����ϴ� �޽���ε� ���� �����ϴ�.
	 * ��ȯ������ �۾��������θ� ��Ÿ���� ���� �������� �ʾҽ��ϴ�.
	 * @param String fileName - ������ ������ + ���ϸ� ��θ� �ּ���,<br>  String content-������ ���ڿ��Դϴ�.
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
	  * �Ķ���ͷ� ���޹��� ���ڿ��� ���Ϸ� �����ϴ� �޽���ε� ���� �޼ҵ忡 ���� �ϳ� �� �߰��߽��ϴ�.
	  * �߰��� ���ڴ� String saveDirectory....
	  * ��) FileUtility f = new FileUtility();
	  *     f.writeFile("mail","test.txt","Hello~~ ");
	  * @param String saveDirectory - ����� ���丮�� ��Ÿ���� ���ڿ�(<br>�� : "workflow","mail","bulletinbody"... ���� ���� ���ڿ�), <br>String fileName - �����ϰ��� �ϴ� ������ ������,  <br>String content - �����ϰ��� �ϴ� ���ڿ�.
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
	* ������ ������ ����
	* @param dirToBeDeleted ������� ���丮
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


	



