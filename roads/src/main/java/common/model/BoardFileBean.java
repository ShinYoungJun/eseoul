
/*********************************************************************************************************
 				*�����ۼ��� : 2006.05.30
				*�����ۼ��� : mylee
				*�ֿ�ó������ : �Խ��� ����ó���� ���� Bean
				*������ :
				*������ :
				*�������� :
 *********************************************************************************************************/

package main.java.common.model;

import main.java.common.model.RoadsBaseBean;

public class BoardFileBean extends RoadsBaseBean {
	
	private String strBoardID;		//	�������̺�	
	private int intNum;				//  ���ð�����ȣ1
	private int intNum2;			//  ���ð�����ȣ2
	private int intNum3;			//  ���ð�����ȣ3
    private int intFileNo;			// ���ϰ�����ȣ
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