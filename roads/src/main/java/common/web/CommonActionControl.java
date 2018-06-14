package main.java.common.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import java.util.Collection;
import java.util.List;
import java.util.Vector;
import java.io.*;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.*;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import g4c.db160.resident.app.ResidentCheckApp;
import g4c.dc000.driver.resident.RequestTokenBean;

import main.java.common.commonCode.model.UserBean;
import main.java.common.commonCode.service.CommonCodeService;
import main.java.common.util.Globals;
import main.java.common.util.catUtil.Util;
import main.java.jumyong.jumyong.model.SearchBean;
import main.java.rojum.jumyong.model.TaxCodeBean;

public class CommonActionControl extends MultiActionController {
	
	private	Util				util			= new Util();
	private	CommonCodeService	commonCode		= null;
	
	public void setCommonCodeService(CommonCodeService commonCode)
	{
		this.commonCode 	= commonCode;
	}
	
	/**
     * 법정동 AJAX 호출
	 */
	public ModelAndView getBjdongCode(HttpServletRequest request, HttpServletResponse response)  throws Exception {
		
		// 삭제 세션
		HttpSession session = request.getSession();
		
		String 		userId	= (String)session.getAttribute("sessionUserId");
		
        try {
        	if(userId != null)
			{
				//	세션에서 시도 코드를 가져온다.
				String	SIDO_CD	= util.getSidoCode(getMessageSourceAccessor());
				//	관리자 데이터를 가져온다.
				UserBean	userBean	= new UserBean();
				userBean	= commonCode.executeUserSearch(util.getSessionID(request, "sessionUserId"));
				
				String guCd = ServletRequestUtils.getStringParameter(request, "guCd", "000");
				
				String bjCdList = commonCode.CommonBJDongCodeSearch(SIDO_CD, guCd, "");
				
				logger.info("bjCdList =" +bjCdList);
				
		        response.setContentType("text/html;charset=EUC-KR");
		        response.setHeader("Cache-Control", "no-cache");
		        response.getWriter().write(bjCdList);
				
			}
        } catch (Exception e) {
        	e.printStackTrace();
        }
        return null;
    }
	
	/**
     * 행정동 AJAX 호출
	 */
	public ModelAndView getHjdongCode(HttpServletRequest request, HttpServletResponse response)  throws Exception {
		
		// 삭제 세션
		HttpSession session = request.getSession();
		
		String 		userId	= (String)session.getAttribute("sessionUserId");
		
        try {
        	if(userId != null)
			{
				//	세션에서 시도 코드를 가져온다.
				String	SIDO_CD	= util.getSidoCode(getMessageSourceAccessor());
				//	관리자 데이터를 가져온다.
				UserBean	userBean	= new UserBean();
				userBean	= commonCode.executeUserSearch(util.getSessionID(request, "sessionUserId"));
				
				String guCd = ServletRequestUtils.getStringParameter(request, "guCd", "000");
				
				String bjCdList = commonCode.CommonHJDongCodeSearch(SIDO_CD, guCd, "");
				
		        response.setContentType("text/html;charset=EUC-KR");
		        response.setHeader("Cache-Control", "no-cache");
		        response.getWriter().write(bjCdList);
				
			}
        } catch (Exception e) {
        	e.printStackTrace();
        }
        return null;
    }
	/*
	 * 서울시 전체구간 및 서울시 구간 별 정보 가져오기
	 * @param request
	 * @param response
	 * @return
	 * @throws Exception
	 */
	public ModelAndView getSeoulGugan(HttpServletRequest request, HttpServletResponse response)  throws Exception {
		
		// 삭제 세션
		HttpSession session = request.getSession();
		
		String 		userId	= (String)session.getAttribute("sessionUserId");
		
        try {
        	if(userId != null) {
				//	세션에서 시도 코드를 가져온다.
				String	SIDO_CD	= util.getSidoCode(getMessageSourceAccessor());
				//	관리자 데이터를 가져온다.
				UserBean	userBean	= new UserBean();
				userBean	= commonCode.executeUserSearch(util.getSessionID(request, "sessionUserId"));

				String guCd = ServletRequestUtils.getStringParameter(request, "guCd", "");
				String gugancd = ServletRequestUtils.getStringParameter(request, "GUGAN_CD","");
				String SeoulGuganList ="";	
				if(guCd.equals("000")){
					// 구코드가 서울시일 경우에 서울시 전체구간 정보 가져오기 
					SeoulGuganList = commonCode.CommonGapanSeoulGuganCodeSearch(gugancd);
				}else{
					// 구코드가 서울시 구단위 일 경우 서울시 구간 별 정보 가져오기 
					SeoulGuganList = commonCode.CommonGapanGuganCodeSearch(guCd, gugancd);
				}
				response.setContentType("text/html;charset=EUC-KR");
				response.setHeader("Cache-Control", "no-cache");
				response.getWriter().write(SeoulGuganList);
				
        	}		
        }catch (Exception e) {
        	e.printStackTrace();
        }
        return null;
    }
	/**
	/**
     * 파일 다운로드 처리
	 */
	public ModelAndView download(HttpServletRequest request,
			HttpServletResponse response)  throws Exception {
        try {
        	String strPath = Globals.FILEUPLOADPATH;
            String strRealFileName = request.getParameter("realFileName");
            String strFileName = request.getParameter("fileName");
            String strLoggingFlag = request.getParameter("logging");
            
            strRealFileName = strRealFileName.replace('/', '#');            
            strFileName = strFileName.replace('/', '#');
                        
            File flTempFile = new File(strPath+strRealFileName);
            strFileName = strFileName.substring(strFileName.lastIndexOf("/") + 1);
            
            String agentType = request.getHeader("Accept-Encoding");
            try {
                if (!flTempFile.exists() || !flTempFile.canRead()) {
                    PrintWriter out = response.getWriter();
                    out.println("<script>alert('File Not Found');history.back();</script>");
                    return null;
                }
            } catch (Exception e) {
                PrintWriter out = response.getWriter();
				out.println("<script>alert('File Not Found');history.back();</script>");
				e.printStackTrace();
                return null;
            }

            boolean flag = false;
            if (agentType != null && agentType.indexOf("gzip") >= 0)
                flag = true;

            flag = false;

            if (flag) {
                response.setHeader("Content-Encoding", "gzip");
                response.setHeader("Content-disposition","attachment;filename=" + strFileName);
                javax.servlet.ServletOutputStream servletoutputstream = response.getOutputStream();
                java.util.zip.GZIPOutputStream gzipoutputstream = new java.util.zip.GZIPOutputStream(servletoutputstream);
                
                dumpFile(flTempFile, gzipoutputstream);
                gzipoutputstream.close();
                servletoutputstream.close();
            } else{
                response.setContentType("application/octet-stream");
                response.setHeader("Content-disposition","attachment;filename=" + strFileName);
                javax.servlet.ServletOutputStream servletoutputstream1 = response.getOutputStream();

                dumpFile(flTempFile, servletoutputstream1);
                servletoutputstream1.flush();
                servletoutputstream1.close();
            }

                   
        } catch (Exception e) {
            PrintWriter out = response.getWriter();
            out.println("<script>alert('File Not Found');history.back();</script>");
            e.printStackTrace();
            return null;
        }
        return null;
    }
	
	/**
     * 파일 다운로드 처리
	 */
	public ModelAndView vodownload(HttpServletRequest request,
			HttpServletResponse response)  throws Exception {
        try {
        	String strPath = Globals.IMAGEFILEUPLOADPATH;
            String strRealFileName = request.getParameter("realFileName");
            
                        
            String strFileName = request.getParameter("fileName");
            String strLoggingFlag = request.getParameter("logging");
            
            strRealFileName = strRealFileName.replace('/', '#');
            strFileName  = strFileName.replace('/', '#');
            
            
            if(strRealFileName.indexOf("%") > -1){
            	strRealFileName = URLDecoder.decode(strRealFileName, "EUC-KR");
            }
            
            File flTempFile = new File(strPath+strRealFileName);
            strFileName = strFileName.substring(strFileName.lastIndexOf("/") + 1);

            String agentType = request.getHeader("Accept-Encoding");
            try {
                if (!flTempFile.exists() || !flTempFile.canRead()) {

                    PrintWriter out = response.getWriter();
                    out.println("<script>alert('File Not Found');history.back();</script>");
                    return null;
                }
            } catch (Exception e) {
                PrintWriter out = response.getWriter();
				out.println("<script>alert('File Not Found');history.back();</script>");
				e.printStackTrace();
                return null;
            }

            boolean flag = false;
            if (agentType != null && agentType.indexOf("gzip") >= 0)
                flag = true;

            flag = false;

            if (flag) {
                response.setHeader("Content-Encoding", "gzip");
                response.setHeader("Content-disposition",
                        "attachment;filename=" + strFileName);
                javax.servlet.ServletOutputStream servletoutputstream = response
                        .getOutputStream();
                java.util.zip.GZIPOutputStream gzipoutputstream = new java.util.zip.GZIPOutputStream(
                        servletoutputstream);

                dumpFile(flTempFile, gzipoutputstream);
                gzipoutputstream.close();
                servletoutputstream.close();
            } else {
                response.setContentType("application/octet-stream");
                response.setHeader("Content-disposition",
                        "attachment;filename=" + strFileName);
                javax.servlet.ServletOutputStream servletoutputstream1 = response
                        .getOutputStream();

                dumpFile(flTempFile, servletoutputstream1);
                servletoutputstream1.flush();
                servletoutputstream1.close();
            }

              
        } catch (Exception e) {
            PrintWriter out = response.getWriter();
            out.println("<script>alert('File Not Found');history.back();</script>");
            e.printStackTrace();
            return null;
        }
        return null;
    }
    
    private void dumpFile(File realFile, OutputStream outputstream) {
        byte readByte[] = new byte[4096];
        try {
            BufferedInputStream bufferedinputstream = new BufferedInputStream(
                    new FileInputStream(realFile));
            int i;
            while ((i = bufferedinputstream.read(readByte, 0, 4096)) != -1)
                outputstream.write(readByte, 0, i);
            bufferedinputstream.close();
        } catch (Exception _ex) {
        }
    }
    
}