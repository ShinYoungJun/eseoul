/* 2009		Kim Yun Seo
 * [20130510] yjmoon List generic ó�� (List -> List<String>) 
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
	
	//	��¥ "-" ����
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
	
	//	��¥ "-" �߰�
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
	
	//	���ڿ� �޸� �߰�
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
	
	//	���ڿ� �޸� ����
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

	//	�����ȣ "-" �߰�
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
	
	//	�����ȣ "-" ����
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
	
	
	//	XML ��� ����
	public	String	XmlNodeMake(String NodeName, String Value)
	{
		String	XML	= "";
		
		XML	= "<" + NodeName + ">" + StringEscapeUtils.escapeXml(Value) + "</" + NodeName + ">";
		
		return	XML;
	}

	//	���� �����͸� �����´�.
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
			
			System.out.println("== ���ǿ� �����Ͱ� �����ϴ�.");
		}
		catch(Exception e)
		{
			System.out.println("== ������ ���� �Ǿ����ϴ�.");
		}
		
		return	null;
	}
	
	
	//	properties ���Ͽ� �ִ� �õ� �ڵ带 �����´�.
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
			
			System.out.println("SIDO CODE�� �����ϴ�.");
		}
   
		return	null;
	}
	
	// ���ڿ��� ������ ���ڱ��� ��ŭ �ڸ���.
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
	
	//�Ѿ�� source�� null�� ��� replace�� ����...
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
