package jeus_jspwork._jsp._mdb;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.io.*;
import java.util.*;
import java.net.URLDecoder;


public class _500_download_5fjsp extends jeus.servlet.jsp.HttpJspBase {

  public final String[] __jeusGetIncludedJspFiles() {
    return null;
  }
  // jsp code [from=(6,4);to=(18,1)]
  
  	public String toKor(String str)
  	{	
  		try
  		{
  			return new String(str.getBytes("8859_1"),"utf-8");
  		}
  		catch(Exception e)
  		{
  			return str;
  		}
  	}


  public void _jspService(HttpServletRequest request, HttpServletResponse  response)
      throws ServletException, IOException {

    JspFactory	_jspxFactory = null;
    PageContext	pageContext = null;
    HttpSession	session = null;
    ServletContext	application = null;
    ServletConfig	config = null;
    JspWriter	out = null;
    Object		page = this;
    String		_value = null;

    try {
      _jspxFactory = JspFactory.getDefaultFactory();
      pageContext = _jspxFactory.getPageContext(this, request, response, "", true, 8192, true);
      session = pageContext.getSession();
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      out = pageContext.getOut();

      response.setContentType("text/html;charset=MS949");

      out.write(_jspx_template0);
      out.write(_jspx_template1);
      out.write(_jspx_template2);
      // jsp code [from=(18,5);to=(44,1)]
      
      out.clear();
      request.setCharacterEncoding("utf-8");
      String filename =toKor(request.getParameter("fileName"));	
      
      String files = request.getSession().getServletContext().getRealPath("/mdb")+"/"+filename;
      File file = new File(files);  
      byte b[] = new byte[1024]; 
      files = java.net.URLEncoder.encode(files, "UTF-8");
      files = files.replace('+', ' '); // for space
      response.setHeader("Content-Disposition", "attachment;filename=" + "GAPAN.mdb" + ";");
      response.setHeader("Content-Length", ""+file.length() );
      if (file.isFile()) { 
      	
      	BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file)); 
      	BufferedOutputStream bos = new BufferedOutputStream(response.getOutputStream());    
      	int read = 0; 
      	while ((read = bis.read(b)) != -1) 	{ 
      		bos.write(b,0,read);		
      	} 	
      
      	bos.close(); 
      	bis.close(); 
      	out.clear();
      	out = pageContext.pushBody();
      }

      out.write(_jspx_template3);

    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)) {
        if (out.getBufferSize() != 0) {
          try {
            out.clear();
          } catch (Exception _exc) { }
        }
        pageContext.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(pageContext);
    }
  }
  private final static String _jspx_template0 = "\r\n";
  private final static String _jspx_template1 = "\r\n";
  private final static String _jspx_template2 = "\r\n\r\n<!--%@ page contentType=\"application;charset=utf-8\" %>-->\r\n";
  private final static String _jspx_template3 = "\r\n\r\n";
}
