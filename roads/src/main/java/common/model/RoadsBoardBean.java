/*********************************************************************************************************
 				*최초작성일 : 2006.08.29
				*최초작성자 : jhlee
				*주요처리내용 : 게시판 BEAN
				*수정일 :
				*수정자 :
				*수정내용 :
 *********************************************************************************************************/

package main.java.common.model;

import java.net.*;
import main.java.common.model.RnicFileBean;
import main.java.common.util.StringUtil;

/**참고사항 : 파일업로드기능사용시에는 RnicFileBean을 상속받아서 사용하고,
 						일반빈을 생성시에는 RnicBaseBean을 상속받아서 사용한다.
**/
public class RoadsBoardBean extends RnicFileBean{

	   private int intMgtSn 			= 0;
	   private int intSubMgtSn 			= 0;
	   private int intRefNo				= 0;
	   private int intViewCnt			= 0;
	   private int intIsChild			= 0;
	   private int intFileCnt 			= 0;	   
	   private int intViewNo			= 0;    // 화면 리스트에서 보여줄 일련번호
	   private int intFileMgt;
	   private int intNum;					    //  관련관리번호1
	   private String strFileName;
	   private String strTempFileName;
	   private long lngFileSize;    
	   private boolean bValid 			= true; //	당일 생성된 게시물인지 여부	      
	   private String	strStep	= "0";
	   private String	strSubject 		= null;
	   private String	strRegNm 		= null;
	   private String	strEmail 		= null;
	   private String	strPassWord		= null;
	   private String	strRegYmd		= null;
	   private String	strContent		= null;
	   private String	strDept			= null;
	   private String	strTelNo		= null;
	   private String	strChargeManNm	= null;
	   private String	strHtmlContent 	= null;
	   private String	strReMarkRm		= null;
	   private String	strIp			= null;
	   private String	strSggCd		= null;
	   private String	strSggNm		= null;
	   private String	strSiCd		= null;
	   private String	strSiNm		= null;	   
	   
	   public String getIp() {
		   return strIp;
	   }

	   public void setIp(String strIp) {
		   this.strIp = strIp;
	   }
	
	   public RoadsBoardBean(){}
			
	   public void setMgtSn(int intMgtSn){
		   this.intMgtSn=intMgtSn;
	   }
		   
	   public int getMgtSn(){
		   return intMgtSn;
	   }
	   
	   public void setSubMgtSn(int intSubMgtSn){
		   this.intSubMgtSn=intSubMgtSn;
	   }
		   
	   public int getSubMgtSn(){
		   return intSubMgtSn;
	   }
		   
	   public void setRefNo(int intRefNo){
		   this.intRefNo	=	intRefNo;
	   }
		   
	   public int getRefNo(){
		   return intRefNo;
	   }
		   
	   public void setViewCnt(int intViewCnt){
		   this.intViewCnt=intViewCnt;
	   }
		   
	   public int getViewCnt(){
		   return intViewCnt;
	   }	   
		   
	   public void setIsChild(int intIsChild){				
		   this.intIsChild =intIsChild;
	   }
			
	   public int getIsChild(){
		   return this.intIsChild;
	   }	   
		   
	   public void setFileCnt(int intFileCnt){
		   this.intFileCnt=intFileCnt;
	   }
	   
	   public int getFileCnt(){
		   return intFileCnt;
	   }			
			
	   public void setViewNo(int intViewNo){
		   this.intViewNo=intViewNo;
	   }
	   
	   public int getViewNo(){
		   return intViewNo;
	   }			
			
	   public void setValid(String strValid){
		   if(strValid.equals("Y"))
			   bValid = true;
		   else
			   bValid = false;
	   }	   
		   
	   public boolean getValid(){
		   return this.bValid;		   
	   }
		   
	   public void setStep(String strStep){
		   this.strStep=strStep;
	   }
	
	   public String getStep(){
		   return strStep;
	   }
		   
	   public void setSubject(String strSubject){
		   this.strSubject=strSubject;
	   }		
		   	   
	   public String getSubject(){
		   return strSubject;
	   }
		  
	   public void setRegNm(String strRegNm){
		   this.strRegNm=strRegNm;
	   }	   
		   
	   public String getRegNm(){
		   return strRegNm;
	   }
		   
	   public void setEmail(String strEmail){
		   this.strEmail=strEmail;
	   }
		   
	   public String getEmail(){
		   return strEmail;
	   }
		   
	   public void setPassWord(String strPassWord){
		   this.strPassWord=strPassWord;
	   }
		   
	   public String getPassWord(){
		   return strPassWord;
	   }
		   
	   public void setRegYmd(String strRegYmd){
		   this.strRegYmd=strRegYmd;
	   }
	   
	   public String getRegYmd(){
		   return strRegYmd;
	   }
	   
	   public String getReMarkRm(){
		   return strReMarkRm;
	   }
	   
	   public void setContent(String strContent){
		   this.strContent=strContent;
	   }
	   
	   public String getContent(){
		   return strContent;
	   }
	   
	   public void setDept(String strDept){
		   this.strDept=strDept;
	   }
	   
	   public String getDept(){
		   return strDept;
	   }
	   
	   public void setTelNo(String strTelNo){
		   this.strTelNo=strTelNo;
	   }
	   
	   public String getTelNo(){
		   return strTelNo;
	   }	   

	   public void setChargeManNm(String strChargeManNm){
		   this.strChargeManNm=strChargeManNm;
	   }
	   
	   public String getChargeManNm(){
		   return strChargeManNm;
	   }	   	   
	 
	   public void setHtmlContent(String strHtmlContent){
		   this.strHtmlContent=strHtmlContent;
		   this.strHtmlContent=StringUtil.convertHtmlBr(strHtmlContent);
	   }	   
	   
	   public String getHtmlContent(){
		   return strHtmlContent;
	   }
	   
	   public String getFileName() {
	        return strFileName;
	   }

	   public void setFileName(String strFileName) {
	       this.strFileName = strFileName;
	   }

	    
	   public String getTempFileName() {
	       return strTempFileName;
	   }

	   public void setTempFileName(String strTempFileName) {
	       this.strTempFileName = strTempFileName;
	   }

	    

	   public long getFileSize(){
	       return lngFileSize;
	   }

	   public void setFileSize(long lngFileSize){
	       this.lngFileSize = lngFileSize;
	   }
	   
	   public int getNum(){
		   return intNum;
	   }
	   
	   public void setNum(int intNum){
	    	this.intNum=intNum;
	   }
	   
	   public int getFileMgt(){
		   return intFileMgt;
	   }
	   
	   public void setFileMgt(int intFileMgt){
	    	this.intFileMgt=intFileMgt;
	   }
	   
	   public void setReMarkRm(String strReMarkRm){
	    	this.strReMarkRm=strReMarkRm;
	   }

		public String getSggCd(){
			return strSggCd;
		}
	
		public void setSggCd(String strSggCd){
			this.strSggCd = strSggCd;
		}
	
		public String getSggNm(){
			return strSggNm;
		}
	
		public void setSggNm(String strSggNm){
			this.strSggNm = strSggNm;
		}
	
		public String getSiCd() {
			return strSiCd;
		}
	
		public void setSiCd(String strSiCd) {
			this.strSiCd = strSiCd;
		}
	
		public String getSiNm() {
			return strSiNm;
		}
	
		public void setSiNm(String strSiNm) {
			this.strSiNm = strSiNm;
		}
}