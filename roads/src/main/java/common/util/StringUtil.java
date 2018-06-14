
/*********************************************************************************************************
 				*최초작성일 : 2006.05.30
				*최초작성자 : 이준형
				*주요처리내용 : String 관련 처리를 위한 Utility
				*수정일 :
				*수정자 :
				*수정내용 :
 *********************************************************************************************************/


package main.java.common.util;

import java.util.StringTokenizer;
import java.util.Vector;
import java.text.MessageFormat;

public class StringUtil {
	/**
	 * null을 체크한다.
	 * @param str 체크할 문자
	 * @return String null을 체크하여 null이 아니면 체크한 문자열을, null이면 ""을 리턴
	 */
	public String checkNull(String str) {
		if(str == null) {
			str = "";
		} else {
			str = str.trim();
		}
		return str;
	}
	/**
	 * 테이타가 특정 크기 이상일시 지정한 크기까지만 보여주고, 나머지는 특정 형태로 보여줌
	 * @param str 원문자열
	 * @param size 지정할 크기
	 * @param proxy 특정크기 이상의 문자열을 proxy로 치환
	 * @return String 변환한 문자 
	 */
	public String fixLength(String str, int size, String proxy) {

		String result = "";
        byte[] sbyte = str.getBytes();
        int sbyteLength = java.lang.reflect.Array.getLength(sbyte);

        if(size%2 == 1) {
            size = size-1;
        }

        if(sbyteLength <= size) {
            result = str;
        } else {
            Vector vec = new Vector();
            for(int i=0; i<size ; i++) {
                 vec.add(new Byte(sbyte[i]));
            }
            byte[] temp = new byte[vec.size()];
            for(int j=0; j<vec.size() ; j++) {
                temp[j] = ((Byte)vec.get(j)).byteValue();
            }
            result = new String(temp) + proxy;
            if((new String(temp)) == null || (new String(temp)).equals("")) {

                byte[] reTemp = new byte[(vec.size()-1)];

                for(int k=0; k<(vec.size()-1); k++) {
                    reTemp[k] = ((Byte)vec.get(k)).byteValue();
                }

                result = new String(reTemp) + proxy;
            }
        }
        
		return result;
    }
	/**
	 * 테이타가 특정 크기 이상일시 지정한 크기까지만 보여주고, 나머지는 특정 형태로 보여줌(한글용도)
	 * @param str 원문자열
	 * @param size 지정할 크기
	 * @param proxy 특정크기 이상의 문자열을 proxy로 치환
	 * @return String 변환한 문자 
	 */
	public String fixLength2(String str, int size, String proxy) {
		String result = "";
		if(str.length() > size) {
			result = str.substring(0,size) + proxy;
		} else {
			result = str;
		}
		return result;
	}
	
	/**
	 * 테이타가 특정 크기 이하일시 원래 크기까지만 보여주고, 나머지는 특정 형태로 보여줌(문자형)
	 * @param str 원문자열
	 * @param size 지정할 크기
	 * @param proxy 특정크기 이상의 문자열을 proxy로 치환
	 * @return String 변환한 문자 
	 */
	public String fixLength3(String str, int size, String proxy) {
		while(size != str.length()) {
			str = proxy+str;
		}
		
		return str;
	}

	/**
	 * #,###형태로 보여준다.소수점이 존재하는 숫자일시, #,###.00형태로 보여준다.
	 * @param pInstr 변환할 number형태의 문자
	 * @return String 변환문자열  
	 */
	public static String getFormattedMoney( String pInstr )
    {
		String rStr = "0";
		
		try{
			float fNum = Float.parseFloat(pInstr);
					
		if(pInstr.length() >0 ){
			if(pInstr.indexOf(".") == -1) {
				rStr = getFormattedMoney( Long.parseLong( pInstr ) );
			} else {
				String temp = pInstr.substring(pInstr.indexOf("."),pInstr.length());
		
				//소수점 2자리이상일시 2자리로 통일
				if(temp.length() > 3 ) {
					temp = temp.substring(0,3);
				}
				if(!temp.equals(pInstr)){
					rStr = getFormattedMoney( Long.parseLong( pInstr.substring(0,pInstr.indexOf(".")) ) );
				}//end if (3)
				rStr += temp;
			}//end if(2)
			
		} 
 	} catch (NumberFormatException e) { 		
            rStr = pInstr;
        } catch (Exception e) {
        
            rStr = pInstr;
        }
        return rStr;
    }
	/**
	 * #,###형태로 보여준다.소수점이 존재하는 숫자일시, #,###.00형태로 보여준다.
	 * @param pInstr 변환할 number
	 * @return String 변환문자열  
	 */
	public static String getFormattedMoney( long pInstr )
    {
        String rStr = "" + pInstr;

        try
        {        	
            Object[] testArgs = {new Long( rStr )};
            MessageFormat form = new MessageFormat( "{0,number,###,###,###,##0}" );
            rStr = form.format( testArgs );
        }
        catch ( Exception e ) {
        	System.out.println(e.toString());
        }
        return rStr;
    }
	
	/**
	 * 문자열을 주어진 분리자(문자열)에 의해 분리하고, 분리된 문자열 토큰을 문자열 배열에 저장하여 반환한다.
	 * @param token 문자열을 분리하기 위한 분리자
	 * @param string 입력 문자열
	 * @return 분리된 문자열
	 */
	public static String[] split(String token, String string) {
		StringArray ssa = new StringArray();
		int previousLoc = 0;
		if (string == null) {
			return ssa.toArray();
		}
		int loc = string.indexOf(token, previousLoc);
		if (loc == -1) {
			ssa.add(string);
			return (ssa.toArray());
		}
		do {
			ssa.add(string.substring(previousLoc, loc));
			previousLoc = (loc + token.length());
			loc = string.indexOf(token, previousLoc);
		} while( (loc != -1) && (previousLoc < string.length()));
		ssa.add(string.substring(previousLoc));
		return(ssa.toArray());
	}
	/**
	 * 문자열 배열의 각 element 사이에 분리자를 붙여 하나의 문자열로 만든다.
	 * @param token 문자열 배열의 element 사이에 붙일 문자열
	 * @param strings 입력 문자열 배열
	 * @return 문자열 배열의 각 element가 분리자에 의해 연결된 문자열
	 */
	public static String join(String token, String[] strings) {
		StringBuffer sb = new StringBuffer();

		for(int n = 0; n < (strings.length - 1); n++) {
			sb.append(strings[n]);
			sb.append(token);
		}
		sb.append(strings[strings.length-1]);

		return (sb.toString());
	}	
	/**
	 * 문자열을 html 형식에 맞춰 변환한다.
	 * @param comment 입력 문자열
	 * @return html 형식에 맞춰 변환된 문자열
	 */
    public static String convertHtmlBr(String comment) {
        int length = comment.length();

        StringBuffer buffer = new StringBuffer();
        
	        for (int i = 0; i < length; ++i) {
	            String comp = comment.substring(i, i+1);
	            
	            if (" ".compareTo(comp) == 0) {
	                //comp = comment.substring(++i, i+1);
	                buffer.append("&nbsp");
	            } else if ("\r".compareTo(comp) == 0) {
	                //comp = comment.substring(++i, i+1);
	                if ("\n".compareTo(comp) == 0)
	                    buffer.append("<BR>\r");
	                else
	                    buffer.append("\r");
	            } else if("\n".compareTo(comp) == 0){
	                buffer.append("<BR>\r");
	            } else if("<".compareTo(comp) == 0){
	                //comp = comment.substring(++i, i+1);
	                buffer.append("&lt");
	            } else if(">".compareTo(comp) == 0){
	                //comp = comment.substring(++i, i+1);
	                buffer.append("&gt");
	            }
	            else
	            	buffer.append(comp);
	        }
	        return buffer.toString();
    }
    
    /**
	 * convertHtmlBr+getEllipsisString
	 * @param comment 입력 문자열
	 * @return html 형식에 맞춰 변환된 문자열
	 */
    public static String getEllipsisNConvertedHtml(String comment, int intLen) {
        String strRtn = StringUtil.getEllipsisString(comment,intLen);
        return StringUtil.convertHtmlBr(strRtn);
    }
    /**
     * 입력 문자열을 html 형식에 맞춰 변환한다
     * @param comment 입력 문자열
     * @return
     */
	public static String convertHtmlToolTip(String comment) {
        int length = comment.length();
        StringBuffer buffer = new StringBuffer();
        try{
	        for (int i = 0; i < length; ++i) {
	            String comp = comment.substring(i, i+1);
	            if (" ".compareTo(comp) == 0) {
	                comp = comment.substring(++i, i+1);
	                buffer.append("&nbsp");
	            } else if ("\r".compareTo(comp) == 0) {
	                comp = comment.substring(++i, i+1);
	                if ("\n".compareTo(comp) == 0)
	                    buffer.append("<BR>\r");
	                else
	                    buffer.append("\r");
	            } else if (",".compareTo(comp) == 0) {
	                comp = comment.substring(++i, i+1);
	                buffer.append(" ");
	            } else if("\n".compareTo(comp) == 0){
	                buffer.append("<BR>\r");
	            }
	            buffer.append(comp);
	        }
	        return buffer.toString();
        }catch(Exception e){
        	return comment;
        }
    }

	/**
	 * 입력 문자열을 JScript 형식에 맞춰 변환한다
	 * @param comment 입력 문자열
	 * @return JScript 형식에 맞춰 변환된 문자열
	 */
	public static String convertJScriptBr(String comment) {
		int length = comment.length();
		StringBuffer buffer = new StringBuffer();

		for (int i = 0; i < length; ++i) {
			String comp = comment.substring(i, i+1);
			if ("\r".compareTo(comp) == 0) {
				comp = comment.substring(++i, i+1);
				if ("\n".compareTo(comp) == 0)
					buffer.append("<BR>");
				else
					buffer.append(" ");
					buffer.append("<BR>");
			} else {
				buffer.append(comp);
			}
		}
		return buffer.toString();
	}

	/**
	 *  주어진 문자열에서 특정문자열을 찾아 새문자열로 치환한다.<br>
	 *  예)String result = StringTool.replace("Hello~~ JAVA!!!!","ello","ELLO");<br>
	 *     --> "HELLO~~n JAVA!!!!" 반환
	 *  @param String src 바꾸고자 하는 문자열이 포함된 String<br> String oldStr - 치환될 문자열<br> String newStr- 치환될 문자열을 찾아 교체할 새로운 문자열
	 *  @return 치환된 결과문자열을 반환한다.(해당문자열이 없다면 변화없은 문자열을 반환)
	 */
	public static String replace(String src, String oldStr, String newStr){
		if(src == null)
			return null;
		StringBuffer dest = new StringBuffer("");
		int len = oldStr.length();
		int srcLen = src.length();
		int pos=0;
		int oldPos = 0;

		while((pos = src.indexOf(oldStr, oldPos)) >=0 ){
			dest.append(src.substring(oldPos,pos));
			dest.append(newStr);
			oldPos = pos + len;
		}
		if(oldPos<srcLen){
			dest.append(src.substring(oldPos, srcLen));
	    }


		return dest.toString();
	}

	/**
	 * 입력으로 받은 분리자에 의해 분리된 토큰을 반환한다
	 * @param delim 분리자
	 * @param str
	 * @return 분리자에 의해 분리된 문자 배열
	 */
	public static String[] tokenizer(String delim, String str){
		StringArray temp = new StringArray();

        StringTokenizer token = new StringTokenizer(str,delim);
        while(token.hasMoreElements()){
            temp.add((String)token.nextToken());
        }
		return temp.toArray();
	}

    /**
     * 문자열에서 분리자에 의해 분리되는 마지막 토큰 문자열을 반환한다.
     * ex) String result = StringTool.getLastToken("1;2;3", ";");
     * 결과 : result = "3"
     * @param str 입력 문자열
     * @param delim 분리자 문자열
     * @return 분리자에 의해 분리된 마지막 문자열
     */
    public String getLastToken(String str, String delim){
        char[] temp = null;
        char[] type = null;
        String result = "";

        temp = str.toCharArray();
        type = new char[(temp.length-1)];
        for(int i=temp.length; i>0; i--){

            if(!(new String(temp, i-1, 1)).equals(delim)){
                type[i-2] = temp[i-1];
            }else{
                result = new String(type);
                break;
            }
        }
        return result.trim();
    }
    
    /**
	 * 소수점 이하 truncate
	 * @param dbl 변환할 number
	 * @return size 소수점이하 자리수
	 */
	public static String truncate(double dbl, int size)
    {
		String strTemp = String.valueOf(dbl);
		
		try{
			
			if(strTemp.length() >0 ){
				if(strTemp.indexOf(".") == -1) {
					return strTemp;
				} 
				else {
					
					// 소수점이하
					String strTemp2 = strTemp.substring(strTemp.indexOf("."),strTemp.length());
		
					//소수점 2자리이상일시 2자리로 통일
					if(strTemp2.length() > size ) {
						strTemp2 = strTemp2.substring(0,size+1);
					}
					return strTemp.substring(0,strTemp.indexOf("."))+strTemp2;
				}
			} 
			else
				return null;
		} catch (Exception e) {
        
            return null;
        }
    }
	
    /**
	 * 문자열을 "*"로 치환.
	 * @param str 입력 문자열
	 * @param len 치환할 문자개수
	 * @return String 치환된 문자열
	 */	
	 public static String replaceStar(String str) {
	  if (str == null)
		  return null;
	  
	  StringBuffer result = new StringBuffer();
	  result.append(str.substring(0, str.length()));
	  
	  int strLen = str.length();
	  for(int i = 0; i < strLen; i++) {
	   result.append("*");
	  }
	  return result.toString();
	 }
	 
		/**
		 * int -> string 변환
		 * @param int 변환할 숫자
		 * @return String 변환한 문자 
		 */
		public static String intToString(int intNum) {
			
			String result = "";
			try{
				if(intNum == 0)
					return "0";
				else{
					
					return new Integer(intNum).toString();
				}
			}catch(Exception e){
				return "";
			}
		}

		/*
		 *  한글이든 영문이든 글자수로 count해 자르면 될것 같아서 그냥 substring으로 바꿔놓았습니다
		 *  원래의도와 다르게 바뀐거면 원복시켜놓겠습니다
		 *  10.03 mylee
		 */
		public static String getEllipsisString(String str, int size) {

//			 int eos 	= 0; 
//			 int i 		= 0;
//			 int cnt 	= 0;
//			 byte[] temp = str.getBytes();  //스트링을 바이트열로 변환한다.
			 String strDot = "...";

			 try{
				 if(str.length() <= size) 
					 return str;
				 else
					 return str.substring(0,size)+strDot;
			 }catch(Exception e){
				 return str;
			 }
			 
/*			 
			 for(i = 0; i < size ; i++)      //바이트중에 음수값인것을 카운트 한다.
			      if(temp[i] < 0) cnt ++;
			                     
			 if(cnt%2 != 0){ //한글 미완성 . 현재 바이트 포함시키지 않음            
			     eos = size-1;
			     //System.out.println("1byte deleted...");   
			  } else {
			             eos = size; 
			             //System.out.println("no deleted...");  
			          }
			 
			 String s = new String(temp,0,eos);  //임시 바이트열을 다시 스트링으로 변환
			 //System.out.println("[변환 문자열 = "+s+"] 바이트 변환 길이 = "+s.getBytes().length); 
			 return s+strDot;
*/
	    }
		
		public static boolean inNumber(String str) {
			boolean check = true;
			for(int i=0; i<str.length(); i++) {
				if(!Character.isDigit(str.charAt(i))) {
					check = false;
					break;
				}
			}
			return check;
		}	
		
		//금액 타입으로 변환
		public static String insertComma2(String value1)
		{	
			int length1 = value1.length();		
			int divideNum = length1%3;
			
			String returnValue2 ="";
			if(divideNum != 0)
			{
				returnValue2 = value1.substring(0,divideNum)+",";
			}
			if(length1 >3)
			{
				while(true)
				{	
					returnValue2 = returnValue2 + value1.substring(divideNum,divideNum+3)+",";
					divideNum = divideNum+3;
					if(length1 < divideNum+3)
						break;
				}
			}
			
			if(returnValue2 == "")
				returnValue2 = value1;
			else
				returnValue2 = returnValue2.substring(0,returnValue2.length() - 1);
				
			return returnValue2;
		}
		
		public static String addDash(String val1)
		{	
			if(val1 != null){
				if(val1.length() >= 8)
					val1 = val1.substring(0,4)+"-"+val1.substring(4,6)+"-"+val1.substring(6,8);
				else if(val1.length() >= 6)
					val1 = val1.substring(0,4)+"-"+val1.substring(4,6);
				
				return val1;
				
				}
				return null;
		}
		
		public static String removeDash(String val1)
		{
			if(val1 == null || val1.equals("")){
				return "";
			}
			String[] components = val1.split("-");		
			String returnVal = "";		
			for(int i=0;i<components.length;i++)
				returnVal = returnVal + components[i].toString();
			
			return returnVal;		
		}
		
		public static String removeComma(String val1)
		{
			if(val1 == null || val1.equals("")){
				return "";
			}
			String[] components = val1.split(",");		
			String returnVal = "";		
			for(int i=0;i<components.length;i++)
				returnVal = returnVal + components[i].toString();
			
			return returnVal;		
		}
		
		public static String replaceNulltoPer(String val)
		{
			if(val == null || val.equals("")){
				return "%";
			}else{
				return val;
			}
		}
		
}

