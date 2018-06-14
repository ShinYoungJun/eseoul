/*************************************************************************************
**	 -- 작  성  일	 : 2006-07-28
**	 -- 파  일  명	 : SiteUtil.java
**	 -- 내	    용	 : 사이트에서 사용할 Utility
**	 -- 부연설명	 : 추가 또는 변경되는 경우는 주석으로 표기한다.
*************************************************************************************/

package main.java.common.util;

import java.io.*;
import java.sql.*;
import java.net.*;
import java.text.*;
import java.util.*;

public class SiteUtil {

	// 현재 페이지 인덱스 설정
	//	listUrl = > 현재 페이지(파일명)
	//	totalCount => 전체 건수
	//	currentPage = > 현재 페이지
	//	listPage => 페이지들 리스트
	//	listCount = > 한 페이지에 나올목록갯수
	//	strOption => listUrl 에 기타 넘겨줘야할값들 key='바보'


	// http:// 표식 체크하여 링크 걸어주기...ㅋㅋ

	public static String wwwlink(String str) {
		if (str==null) return "";
		
		String tmp = str;
		int itmp = 0;
		int wend = 0;

		StringBuffer sb = new StringBuffer();
		sb.append("");
		
		while(tmp.indexOf("http://")>-1) {
			itmp = tmp.indexOf("http://");
			wend = tmp.indexOf(" ",itmp);
			if (wend>tmp.indexOf(")",itmp) && tmp.indexOf(")",itmp)>-1) wend = tmp.indexOf(")",itmp);
			if (wend>tmp.indexOf("<",itmp) && tmp.indexOf("<",itmp)>-1) wend = tmp.indexOf("<",itmp);
			if (wend==-1) wend = tmp.length();
			sb.append(tmp.substring(0,itmp));
		
			if(itmp>3 && tmp.substring(itmp-3,itmp).indexOf("=")>-1) {
			wend = tmp.indexOf("</a>",itmp)+3;
			if (wend==2) wend = tmp.indexOf(">",itmp);
			sb.append(tmp.substring(itmp,wend));
			} else {
			sb.append("<a href=\""+tmp.substring(itmp,wend)+"\" target=\"_blank\">");
			sb.append(tmp.substring(itmp,wend));
			sb.append("</a>");
			}
		
			tmp=tmp.substring(wend);
		}
		sb.append(tmp);
		
		tmp = sb.toString();
		sb.setLength(0);

		while(tmp.indexOf("www.")>-1) {
			itmp = tmp.indexOf("www.");
			wend = tmp.indexOf(" ",itmp);
			if (wend>tmp.indexOf(")",itmp) && tmp.indexOf(")",itmp)>-1) wend = tmp.indexOf(")",itmp);
			if (wend>tmp.indexOf("<",itmp) && tmp.indexOf("<",itmp)>-1) wend = tmp.indexOf("<",itmp);
			if (wend==-1) wend = tmp.length();
			sb.append(tmp.substring(0,itmp));
			if(itmp>10 && tmp.substring(itmp-10,itmp).indexOf("=")>-1) {
			wend = tmp.indexOf("</a>",itmp)+3;
			if (wend==2) wend = tmp.indexOf(">",itmp);
			sb.append(tmp.substring(itmp,wend));
			} else {
			sb.append("<a href=\"http://"+tmp.substring(itmp,wend)+"\" target=\"_blank\">");
			sb.append(tmp.substring(itmp,wend));
			sb.append("</a>");

			}
		
			tmp=tmp.substring(wend);
		}
	

		if (!(str.indexOf("www.")>-1) && !(str.indexOf("http://")>-1)){
			sb.append("<a href=\"http://"+str+"\" target=\"_blank\">");
			sb.append(str);
			sb.append("</a>");
			tmp="";
		}

		sb.append(tmp);

		return sb.toString();
	}
	// Null 문자열을 공백으로 변환
	public String checkNull(String str) {
		String strTmp;
		if(str == null || str.equals("null")) {
			strTmp = "";
		} else {
			strTmp = str;
		}

		return strTmp;
	}

	// 해당 Url 로 이동
	public String Redirect(String url) {
		String str = "<meta http-equiv='refresh' content='0;url="+ url +"'>";
		return str;
	}
	
	// 게시판의 뷰 화면에서 사용할부분
	public static String transEnterToBr(String src, String postfix) { 
		String result = ""; 
		StringTokenizer st = new StringTokenizer(src, "\n"); 

		if (src.indexOf("\n") != -1) { 

			while(st.hasMoreTokens()){ 
				result = result+st.nextToken() + postfix;
			}
		} 
		else { 
			result = src; 
		} 
		return result; 
	} 
	// 문자 치환에서 엔터효과사용할부분
	public static String transEnterToString(String src, String postfix) { 
		String result = ""; 
		StringTokenizer st = new StringTokenizer(src, postfix); 

		if (src.indexOf(postfix) != -1) { 

			while(st.hasMoreTokens()){
				result = result+st.nextToken() + "<br>";
			}
		} 
		else { 
			result = src; 
		} 
		return result; 
	} 
	// 문자 치환 할부분
	public static String transEnterToString(String src, String pre, String postfix) { 
		String result = ""; 
		StringTokenizer st = new StringTokenizer(src, pre); 

		if (src.indexOf(postfix) != -1) { 

			while(st.hasMoreTokens()){
				result = result+st.nextToken() + postfix; 
			}
		} 
		else { 
			result = src; 
		} 
		return result; 
	} 

	// TextArea에서 입력받은 캐리지 리턴값을 <br>태그로 변환
	public String nl2br(String comment) {
		int length = comment.length();
		StringBuffer buffer = new StringBuffer();

		for (int i = 0; i < length; ++i) {
			String comp = comment.substring(i,i+1);
			if("\r".compareTo(comp) == 0) {
				buffer.append("<br>\r");
			} else {
				buffer.append("\r");
			}

			buffer.append(comp);
		}

		return buffer.toString();
	}


	/** 스크립트 출력
	 *  @param  msg 출력할 문자열
	 *  @return 스크립트 메시지
	 */
	public String goHistoryBack(String msg){
		StringBuffer back = new StringBuffer();
		back.append("<script language=javascript>");
		back.append("  alert(\"").append(msg).append("\");");
		back.append("  history.go(-1);");
		back.append("</script>");

		return back.toString();
	}

	/** 스크립트 출력
	 *  @param  msg 출력할 문자열
	 *  @return 스크립트 메시지
	 */
	public String alertMessage(String msg){
		StringBuffer back = new StringBuffer();
		back.append("<script language=javascript>");
		back.append("  alert(\"").append(msg).append("\");");
		back.append("</script>");

		return back.toString();
	}

	/** 스크립트 출력(리다이렉트시 헤더정보가 찍히는 문제 발생으로 인해 스크립트로 대치)
	 *  @param  msg 출력할 문자열
	 *  @return 스크립트 메시지
	 */
	public String goURL(String url){
		StringBuffer go = new StringBuffer();
		go.append("<html>");
		go.append("<script language=javascript>");
		go.append("window.location.href='").append(url).append("'");
		go.append("</script>");
		go.append("</html>");
		return go.toString();
	}

	/** 문자열 안에 있는 특정 문자열을 원하는 문자열로 변환.
	 *  @param  curStr 검색대상이 되는 문자열
	 *  @param  oldStr 바꾸고자하는 문자열
	 *  @param  newStr 바꿀 문자열
	 *  @return 변환된 값
	 */
	public String replace(String curStr, String oldStr, String newStr) {
		StringBuffer returnStr = new StringBuffer();

		int i   = 0;
		int idx = 0;

		while ((idx = curStr.indexOf(oldStr,i)) != -1) {
			returnStr.append(curStr.substring(i,idx));
			returnStr.append(newStr);
			i = idx + oldStr.length();
		}
		returnStr.append(curStr.substring(i));

		return returnStr.toString();
	}

	/** 숫자에 콤마를 넣는다.
	 *  @param  num 콤마를 찍을 숫자
	 *  @return 콤마 삽입된 문자열
	 */
	public String addComma(double num) {
		NumberFormat nf = NumberFormat.getInstance();
		return nf.format(num);
	}

	/** 숫자에 콤마를 넣는다.
	 *  @param  num 콤마를 찍을 숫자
	 *  @return 콤마 삽입된 문자열
	 */
	public String addComma(int num) {
		NumberFormat nf = NumberFormat.getInstance();
		return nf.format(num);
	}

	/** 숫자에 콤마를 넣는다.
	 *  @param  num 콤마를 찍을 숫자
	 *  @return 콤마 삽입된 문자열
	 */
	public String addComma(long num) {
		NumberFormat nf = NumberFormat.getInstance();
		return nf.format(num);
	}

	/** 숫자 앞에 "0"을 추가한다.
	 *  @param  value "0"을 붙일 숫자 값
	 *  @param  size 반환할 전체 길이
	 *  @return 앞에 "0"이 추가된 문자열
	 */
	public String addZero(int value, int size) {
		String tmpStr = Integer.toString(value);
		StringBuffer sb = new StringBuffer();

		if (tmpStr.length() >= size) return tmpStr;

		for (int i = 0; i<(size-tmpStr.length()); i++) sb.append("0");

		sb.append(tmpStr);

		return sb.toString();
	}

	/** 문자열 길이 체크하여 희망하는 길이 이상인 경우 처리.
	 *  @param  str 검사할 문자열
	 *  @param  leng 희망 문자열 길이
	 *  @return 검사 후 변환된 값
	 */
	public String addDotChar(String str, int leng){
		String temp = null;

		if(str.length()>leng){
			temp = str.substring(0, leng) + "...";
		}else{
			temp = str;
		}

		return temp;
	}

	/** 널인지 체크한 후 int형으로 변환한다.
	 *  @param  str 검사할 문자열(숫자로만 이루어진 문자열)
	 *  @return 검사 후 변환된 값
	 */
	public int getIntParam(String str) {
		return getIntParam(str, 0);
	}

	/** 널인지 체크한 후 int형으로 변환한다.
	 *  @param  str 검사할 문자열(숫자로만 이루어진 문자열)
	 *  @param  def null일 경우 return할 값
	 *  @return 검사 후 변환된 값
	 */
	public int getIntParam(String str, int def) {
		int tmpInt = 0;

		if (str == null || str.equals("null") || str.trim().equals("")) {
			tmpInt = def;
		} else {
			tmpInt = Integer.parseInt(str);
		}

		return tmpInt;
	}

	/** 원하는 길이의 만큼의 문자열중 숫자를 제외한 부분에 "0"을 체운다.
	 *  @param  max 문자열길이
	 *  @param  value 0을 제외한 숫자
	 *  @return 검사 후 변환된 값
	 */
	public String addZeroString(int max, int value){
		String zero = "";
		String num = "";
//		int tmpNum = Integer.parseInt("9999998");
		num = Integer.toString(value);

		for(int i=0; i<max-num.length(); i++){
			zero = zero + "0";
		}
		num = zero + num;

		return num;
	}

	
	/** 한글 변환(8859_1 -> EUC-KR)
	 *  @param  str 변환할 문자열
	 *  @return 변환된 문자열
	 */
	public String encHangul(String str) {
		if ((str = checkNull(str)).length()>0) {
			try {
				str = new String(str.getBytes("8859_1"),"KSC5601");
			} catch(IOException e) {
				str = "";
			}
		}

		return str;
	}
	
	/** 한글 변환(EUC-KR -> 8859_1)
	 *  @param  str 변환할 문자열
	 *  @return 변환된 문자열
	 */
	public String decHangul(String str) {
		if ((str = checkNull(str)).length()>0) {
			try {
				str = new String(str.getBytes("KSC5601"),"8859_1");
			} catch(IOException e) {
				str = "";
			}
		}

		return str;
	}

	/** 한글 글자수 체크하여 50자가 넘으면 .... 로 대치
	 *  @param  str 변환할 문자열
	 *  @return 변환된 문자열
	 */
	public String changeStr(String str,int leng) {
		if ((str = checkNull(str)).length()>leng) {
				str = str.substring(0,leng)+"...";
		}

		return str;
	}
	/** 한글 글자수 체크하여 50자가 넘으면 <br>로 대치
	 *  @param  str 변환할 문자열
	 *  @return 변환된 문자열
	 */
	public String changeLineBr(String str,int leng) {
		int brIn= checkNull(str).length()/leng;
		if(checkNull(str).length()%leng != 0){
			brIn=brIn+1;
		}
		String resultStr=str.substring(0,leng);
		for(int i=2 ; i<= brIn ; i++){
			if(i==brIn){
				resultStr = resultStr+"<br>"+str.substring(leng*(i-1));
			}else{
				resultStr = resultStr+"<br>"+str.substring(leng*(i-1),leng*i);
			}
		}
		return resultStr;
	}
	/** \n을<br>로 대치
	 *  @param  str 변환할 문자열
	 *  @return 변환된 문자열
	 */
	public String changeLineBr(String str) {
		String comp = "";
		comp =str.replaceAll("\n", "<br>") ;
		return comp;
	}

/* http://붙이기*/
	public String httpAddString(String str) {
		String changStr= "";

		if (str.indexOf("http://")>=0) {
				changStr = str;
		}else{
				changStr = "http://"+str;
		}
		return changStr;
	}
// 소수점 3자리수 까지 표현하는 메소드
	public String doubleFormat(double chkNum) {
		String numRes="";
//		NumberFormat df=NumberFormat.getInstance();
		DecimalFormat df=new DecimalFormat("0.##") ;
//		df.setMaximumFractionDigits(3);
//		df.setMaximumFractionDigits(3);
		numRes=df.format(chkNum);
		return numRes;
	}
// 원하는 문자의 갯수 메소드(str문자에서 comStr의 문자의 갯수를 리턴한다.)
	public int contString(String str,String comStr) {
//		String chkStr=".";
		String chkStr=comStr;
		int strCnt=0;
		for (int i =0;i<str.length() ;i++ ){
			if((chkStr.equals(String.valueOf(str.charAt(i))))){
				strCnt++;
			}
		}
		return strCnt;
	}

};