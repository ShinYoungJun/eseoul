/* 2009		Kim Yun Seo
 * [20130510] yjmoon List generic 처리 (List -> List<String>) 
 */
package main.java.common.util.catUtil;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.commons.lang.StringEscapeUtils;
import org.springframework.context.support.MessageSourceAccessor;

public class Util {

	public List<String>	StringToken_Two(String str)
	{
		List<String> list = new ArrayList<String>();
		
		list.add(0, "");
		list.add(1, "");

		if(str	== null)
			str	= "";

		if(!str.equals(""))
		{
			StringTokenizer tst	= new StringTokenizer(str, "-");

			if(tst.countTokens()	== 2){
				list.add(0, tst.nextToken());
				list.add(1, tst.nextToken());
			}
			else
			{
				list.add(0, str);
			}
		}
		
		return list;
	}
	
	public List<String>	StringToken_Three(String str)
	{
		List<String> list = new ArrayList<String>();
		
		list.add(0, "");
		list.add(1, "");
		list.add(2, "");
		
		if(str	== null)
			str	= "";

		if(!str.equals(""))
		{
			StringTokenizer tst	= new StringTokenizer(str, "-");

			if(tst.countTokens()	== 3)
			{
				list.add(0, tst.nextToken());
				list.add(1, tst.nextToken());
				list.add(2, tst.nextToken());
			}
			else if(tst.countTokens()	== 2)
			{
				list.add(0, tst.nextToken());
				list.add(1, tst.nextToken());
			}
			else
			{
				list.add(0, str);
			}
		}
		
		return list;
	}
	
	public List<String>	SubString_SSN(String str)
	{
		List<String> list = new ArrayList<String>();
		
		list.add(0, "");
		list.add(1, "");
		
		if(str	== null)
			str	= "";

		if(str.length() == 13)
		{
			list.add(0, str.substring(0, 6));
			list.add(1, str.substring(6, 13));
		}
		else if(str.length() == 14)
		{
			list.add(0, str.substring(0, 6));
			list.add(1, str.substring(7, 14));
		}
		
		return list;
	}
	
	public List<String>	SubString_BIZSSN(String str)
	{
		List<String> list = new ArrayList<String>();
		
		list.add(0, "");
		list.add(1, "");
		list.add(2, "");
		
		if(str	== null)
			str	= "";

		if(str.length() == 10)
		{
			list.add(0, str.substring(0, 3));
			list.add(1, str.substring(3, 5));
			list.add(2, str.substring(5, 10));
		}
		else if(str.length() == 12)
		{
			list.add(0, str.substring(0, 3));
			list.add(1, str.substring(4, 6));
			list.add(2, str.substring(7, 12));
		}
		
		return list;
	}
	
	//	날짜 "-" 삭제
	public	String	Date_Cut(String date)
	{
		if(date	==	null	||	date.trim().equals(""))
			return "";
		
		if(date.length() != 10)
			return	date;
		
	//	System.out.println(date.length());
		
		String	str	= "";
			
		str	+= date.substring(0, 4);
		str	+= date.substring(5, 7);
		str	+= date.substring(8, 10);
		
		return	str;
	}
	
	//	날짜 "-" 추가
	public	String	Date_Paste(String date)
	{
		if(date	==	null	||	date.trim().equals(""))
			return "";
		
		if(date.length() != 8)
			return	date;
		
	//	System.out.println(date.length());
		
		String	str	= "";
			
		str	+= date.substring(0, 4) + "-" + date.substring(4, 6) + "-" + date.substring(6, 8);
		
		return	str;
	}
	
	//	숫자에 콤마 추가
	public	String	Comma_Paste(String cnt)
	{
		if(cnt	==	null	||	cnt.trim().equals(""))
			return "";
			
		DecimalFormat def = new DecimalFormat();

		try{
			return	def.format(Integer.parseInt(cnt));
		}catch(NumberFormatException nfe){
			nfe.printStackTrace();
			return cnt;
		}
	}
	
	//	숫자에 콤마 삭제
	public	String	Comma_Cut(String cnt)
	{
		if(cnt	==	null	||	cnt.trim().equals(""))
			return "";
		
		StringTokenizer token = new StringTokenizer(cnt, ",", false);

		StringBuffer sb = new StringBuffer();

		while(token.hasMoreTokens())
			sb.append(token.nextToken());

		return sb.toString();
	}

	//	우편번호 "-" 추가
	public	String	Post_Paste(String date)
	{
		if(date	==	null	||	date.trim().equals(""))
			return "";
		
		if(date.length() != 6)
			return	date;
		
	//	System.out.println(date.length());
		
		String	str	= "";
		
		str	+= date.substring(0, 3) + "-" + date.substring(3, 6);

		return	str;
	}
	
	//	우편번호 "-" 삭제
	public	String	Post_Cut(String date)
	{
		if(date	==	null	||	date.trim().equals(""))
			return "";
		
		if(date.length() != 7)
			return	date;
		
	//	System.out.println(date.length());
		
		String	str	= "";
			
		str	+= date.substring(0, 3);
		str	+= date.substring(4, 7);
		return	str;
	}
	
	
	//	XML 노드 생성
	public	String	XmlNodeMake(String NodeName, String Value)
	{
		String	XML	= "";
		
		XML	= "<" + NodeName + ">" + StringEscapeUtils.escapeXml(Value) + "</" + NodeName + ">";
		
		return	XML;
	}

	//	세션 데이터를 가져온다.
	public	String	getSessionID(HttpServletRequest request, String id)
	{
		try
		{
			HttpSession session = request.getSession();
			
			String 		userId	= (String)session.getAttribute(id);
			
			if(userId.trim()	!= null)
			{
				if(!userId.trim().equals(""))
				{
					return	userId.trim();
				}
			}
			
			System.out.println("== 세션에 데이터가 없습니다.");
		}
		catch(Exception e)
		{
			System.out.println("== 세션이 종료 되었습니다.");
		}
		
		return	null;
	}
	
	
	//	properties 파일에 있는 시도 코드를 가져온다.
	public	String	getSidoCode(MessageSourceAccessor msa)
	{
		try
		{
			String SidoCode = msa.getMessage("Roads.SidoCode");
			
		//	System.out.println("SIDO CODE : " + SidoCode);
			
			return	SidoCode;
		}
		catch(Exception e)
		{
		//	e.printStackTrace();
			
			System.out.println("SIDO CODE가 없습니다.");
		}
   
		return	null;
	}
	
	// 문자열을 지정한 숫자길이 만큼 자른다.
	public List<String>	SubString_String(String str, int cutlength)
	{
		List<String> list = new ArrayList<String>();
		
		list.add(0, "");
		list.add(1, "");
		
		if(str	== null)
			str	= "";

		if(str.length() > cutlength)
		{
			list.add(0, str.substring(0, cutlength));
			list.add(1, str.substring(cutlength, str.length()));
		}
		
		return list;
	}
	
	//넘어온 source가 null일 경우 replace로 변경...
	public String nullTo(String source, String replace)
	{
		if(source != null)
		{
			return source.trim();
		}
		else
		{
			return replace;
		}
	}
}
