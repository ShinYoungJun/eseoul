
/*********************************************************************************************************
 				*최초작성일 : 2006.05.30
				*최초작성자 : mylee
				*주요처리내용 : 게시판 파일처리를 위한 Bean
				*수정일 :
				*수정자 :
				*수정내용 :
 *********************************************************************************************************/

package main.java.common.model;

import main.java.common.model.RoadsBaseBean;

public class BoardFileBean extends RoadsBaseBean {
	
	private String strBoardID;		//	관련테이블	
	private int intNum;				//  관련관리번호1
	private int intNum2;			//  관련관리번호2
	private int intNum3;			//  관련관리번호3
    private int intFileNo;			// 파일관리번호
    private String strFileName;
    private String strTempFileName;
    private long lngFileSize;
    private String strContentType;
    
    public String getBoardID(){
    	return strBoardID;
    }
    
    public void setBoardID(String strBoardID){
    	this.strBoardID=strBoardID;
    }
    
    public int getNum(){
    	return intNum;
    }
    
    public int getNum2(){
    	return intNum2;
    }
    
    public int getNum3(){
    	return intNum3;
    }
    
    public void setNum(int intNum){
    	this.intNum=intNum;
    }
    
    public void setNum2(int intNum){
    	this.intNum2=intNum;
    }
    
    public void setNum3(int intNum){
    	this.intNum3=intNum;
    }
    
    public String getFileName() {
        return strFileName;
    }

    public void setFileName(String strFileName) {
        this.strFileName = strFileName;
    }

    public int getFileNo() {
        return intFileNo;
    }

    public void setFileNo(int intFileNo) {
        this.intFileNo = intFileNo;
    }

    public String getTempFileName() {
        return strTempFileName;
    }

    public void setTempFileName(String strTempFileName) {
        this.strTempFileName = strTempFileName;
    }

    public String getContentType() {
        return strContentType;
    }

    public void setContentType(String strContentType) {
        this.strContentType = strContentType;
    }

    public long getFileSize() {
        return lngFileSize;
    }

    public void setFileSize(long lngFileSize) {
        this.lngFileSize = lngFileSize;
    }
}