/***********************************
 * ������ : 2007.9.27
 * ���������� : ������
 * �������� :
 ***********************************/

package main.java.map.web;


import main.java.admin.model.UserRegBean;
import main.java.common.commonCode.dao.CommonCodeDao;
import main.java.common.commonCode.service.CommonCodeService;
import main.java.common.util.BoardUtil;
import main.java.common.util.Globals;
import main.java.common.util.catUtil.Util;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.bind.RequestUtils;
import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import java.util.Iterator;
import java.util.List;

import main.java.map.service.*;
import main.java.map.model.SearchBean;
import main.java.admin.model.UserRegBean;
import main.java.admin.service.*;

public class MapSearchControl extends MultiActionController {
	
  	/**
  	 * ��������
	 * @param HttpServletRequest request
	 * @param HttpServletResponce responce
	 * @return ModelAndView
	 */
		
	private IMapSearchService objMapSearchService = null;
	private IUserRegService objUserRegService = null;
	private	CommonCodeService	commonCode		= null;
	private	CommonCodeDao	commonCodeDao	= null;
	private	Util				util			= new Util();
	
	public void setMapSearchService(IMapSearchService newObjMapSearchService) {
		this.objMapSearchService = newObjMapSearchService;
	}
	
	public void setUserRegService(IUserRegService newObjUserRegService) {
		this.objUserRegService = newObjUserRegService;
	}
	
	public void setCommonCodeService(CommonCodeService commonCode) 
	{
		this.commonCode 	= commonCode;
	}
	
	public void setCommonCodeDao(CommonCodeDao commonCodeDao) {
	    this.commonCodeDao = commonCodeDao;
	}

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// 		�˻� ���� ����(���뱸��, �ñ���)
		public ModelAndView initMapSearch(HttpServletRequest request,HttpServletResponse response) throws Exception {
	
			SearchBean objSearchBean = new SearchBean();
			
		
			// ���ǿ��� �õ� �ڵ带 �����´�.
			String SI_CD	= util.getSidoCode(getMessageSourceAccessor());
			
			HttpSession session = request.getSession();
			String userId = (String)session.getAttribute("sessionUserId");		
					
			UserRegBean info = objUserRegService.getUserDetail(userId);
			
			request.setAttribute("name", info.getNAME());
			request.setAttribute("guNm", info.getGU_NM());
			request.setAttribute("guCd", info.getGU_CD());
			request.setAttribute("userId", userId);
			
			// �ñ����ڵ�
			List guCdList = objMapSearchService.getGuCode(SI_CD);
			request.setAttribute("guCdList",guCdList);
	
			return new ModelAndView("/map/left");
		}
		
// 		�˻� ���� ����(��������� ���� ����)
		public ModelAndView searchType(HttpServletRequest request,HttpServletResponse response) throws Exception {
			
			SearchBean objSearchBean = new SearchBean();
			
			String searchType1 = ServletRequestUtils.getStringParameter(request,"searchType1","");

			if(searchType1.equals("jumyong")){
				// �Ϲ�����
				request.setAttribute("use_type", commonCode.executeCommonCode("use_type", objSearchBean.getTYPE(), "����"));
			}
			else if (searchType1.equals("gapan")){
				// ������ �����ü���
				request.setAttribute("use_type", objMapSearchService.executepurposeCode("7", "", "����"));
			}

			return new ModelAndView("/map/searchType");		
		}
		
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////		
//		�˻� ����Ʈ
		public ModelAndView MapSearch(HttpServletRequest request,HttpServletResponse response) throws Exception {
			
			
			SearchBean objSearchBean = new SearchBean();
			
			String strCurrentPage = ServletRequestUtils.getStringParameter(request, "currentPage", Globals.DEFAULT_CURRENT_PAGE);
			String strCountPerPage = ServletRequestUtils.getStringParameter(request, "countPerPage", "4");
			
			objSearchBean.setINTCURPAGE(Integer.parseInt(strCurrentPage));
					
			String searchType1 = ServletRequestUtils.getStringParameter(request,"searchType1");		//�������
			String type = ServletRequestUtils.getStringParameter(request,"type","0");				//���뱸��
			String type_name = ServletRequestUtils.getStringParameter(request,"type_name","0"); 	//�����
			System.out.println("@@@Ÿ�� : "+type + "@@@Ÿ�Ը� : "+type_name);
				
			String gu_cd = ServletRequestUtils.getStringParameter(request, "gu_cd", "");			//�ñ���
			
			String bj_cd = ServletRequestUtils.getStringParameter(request,"bj_cd","");				//���鵿
			String bj_nm = ServletRequestUtils.getStringParameter(request,"bj_nm");					//���鵿
			
			String spc_cd = ServletRequestUtils.getStringParameter(request,"spc_cd","");			//��/����
			String bonbun = ServletRequestUtils.getStringParameter(request,"bonbun","");			//����
			String bubun = ServletRequestUtils.getStringParameter(request,"bubun","");				//�ι�
			String jumyongName = ServletRequestUtils.getStringParameter(request,"jumyongName","");	//�����θ�
			String ssn = ServletRequestUtils.getStringParameter(request, "ssn", "");				//�ֹι�ȣ
			
//			 ���ǿ��� �õ� �ڵ带 �����´�.
			String SI_CD	= util.getSidoCode(getMessageSourceAccessor());
			
			String strPnu = SI_CD+gu_cd+bj_cd;

			request.setAttribute("searchType1", searchType1);
		
			objSearchBean.setTYPE(type);
			objSearchBean.setGU_CD(gu_cd);
			objSearchBean.setBJ_CD(bj_cd);
			objSearchBean.setSPC_CD(spc_cd);
			objSearchBean.setBONBUN(bonbun);
			objSearchBean.setBUBUN(bubun);
			objSearchBean.setJUMYONGNAME(jumyongName);
			objSearchBean.setSSN(ssn);
	
			request.setAttribute("currentPage", strCurrentPage);
			request.setAttribute("countPerPage", strCountPerPage);
						
			request.setAttribute("jumyongName", objSearchBean.getJUMYONGNAME());
			request.setAttribute("numberValue", objSearchBean.getNUMBERVALUE());
			request.setAttribute("type", objSearchBean.getTYPE());
	
			request.setAttribute("type_name", type_name);
			request.setAttribute("bj_nm", bj_nm);

			request.setAttribute("xylist", objMapSearchService.miniMapbjXY(strPnu));

			if(searchType1.equals("jumyong"))
			{
				
				// �Ϲ�����
				int listCount = objMapSearchService.getMapSearchCount(objSearchBean);
					String strPageDivideForm = BoardUtil.getDividePageForm(Integer.parseInt(strCurrentPage)
				,10, "&searchType1="+searchType1+"&type="+type+"&type_name="+type_name+"&gu_cd="+gu_cd+"&bj_cd="+bj_cd+"&bj_nm="+bj_nm+"&spc_cd="+spc_cd+"&bonbun="+bonbun+"&bubun="+bubun+"&jumyongName="+jumyongName+
				"&ssn="+ssn, "", "/map/searchresult.do", listCount);
				
				request.setAttribute("strPageDivideForm", strPageDivideForm);
				request.setAttribute("listCount", String.valueOf(listCount));
				request.setAttribute("currentPage", strCurrentPage);
				
				return new ModelAndView("/map/jumyong_result","search",objMapSearchService.mapSearchList(objSearchBean));
			}
			else 
			{
				// ������ �����ü���
				
				if(objSearchBean.getTYPE().equals("710")){
					objSearchBean.setGP_TYP("001");
				}else if(objSearchBean.getTYPE().equals("720")){
					objSearchBean.setGP_TYP("002");
				}

				int listCount = objMapSearchService.getMapSearchCount1(objSearchBean);
		
				String strPageDivideForm = BoardUtil.getDividePageForm(Integer.parseInt(strCurrentPage)
				,10, "&searchType1="+searchType1+"&type="+type+"&type_name="+type_name+"&gu_cd="+gu_cd+"&bj_cd="+bj_cd+"&bj_nm="+bj_nm+"&spc_cd="+spc_cd+"&bonbun="+bonbun+"&bubun="+bubun+"&jumyongName="+jumyongName+
				"&ssn="+ssn, "", "/map/searchresult.do", listCount);
				
				request.setAttribute("strPageDivideForm", strPageDivideForm);
				request.setAttribute("listCount", String.valueOf(listCount));
				request.setAttribute("currentPage", strCurrentPage);
				
			  return new ModelAndView("/map/gapan_result","search",objMapSearchService.mapSearchList1(objSearchBean));
			}
	
		}

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	
//		������
		public ModelAndView 	Map_View(HttpServletRequest request,HttpServletResponse response) throws Exception 
		{
			String 		strAdminno = ServletRequestUtils.getStringParameter(request, "ADMIN_NO", "");
			String 		strGapanno = ServletRequestUtils.getStringParameter(request, "GAPAN_NO", "");
			String gp_typ = "";
			
			
			if(strGapanno.length() > 1){
				gp_typ = strGapanno.substring(13,16);
				strGapanno = strGapanno.substring(0,13);
			}
				
			
			SearchBean objSearchBean = new SearchBean();
			
			if(strAdminno.equals("") && !strGapanno.equals(""))
			{
				//������ �����ü���
							
				List		list 	= objMapSearchService.getMap_View1(strGapanno,gp_typ);

				if(list.size()<=0)
					objSearchBean	= null;
				else
				{
					objSearchBean	= (SearchBean)list.get(0);
				}
			
				request.setAttribute("GAPAN_NO", strGapanno);
			
			return new ModelAndView("/map/gapan_view", "board", objSearchBean);
			
			}
			else
			{
				// �Ϲ�����
				List		list 	= objMapSearchService.getMap_View(strAdminno);

				if(list.size()<=0)
					objSearchBean	= null;
				else
				{
					objSearchBean	= (SearchBean)list.get(0);

					request.setAttribute("use_owner_Group", commonCode.executeSearchCommonCode("use_ownerGroup", objSearchBean.getOWNER_SET()));
				}
				
				
				if(strAdminno.length() > 1){
					request.setAttribute("ADMIN_NO", strAdminno.substring(9,20));
				}
				
				
				return new ModelAndView("/map/jumyong_view", "board", objSearchBean);
			}
			
		}
		
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	
// 		��ġ���(��ǥ��������)
		public ModelAndView miniMapXY(HttpServletRequest request,HttpServletResponse response) throws Exception {
			
			String 		strPnu = ServletRequestUtils.getStringParameter(request, "PNU", "");
			String 		strAddr = ServletRequestUtils.getStringParameter(request, "ADDR", "");
			String 		strFlag = ServletRequestUtils.getStringParameter(request, "FLAG", "");
			String 		strOwner_Name = ServletRequestUtils.getStringParameter(request, "OWNER_NAME", "");
			String 		strName = ServletRequestUtils.getStringParameter(request, "NAME", "");
			String 		strX = ServletRequestUtils.getStringParameter(request, "X", "");
			String 		strY = ServletRequestUtils.getStringParameter(request, "Y", "");
			String 		check = ServletRequestUtils.getStringParameter(request, "CHECK", "0");
			
			
			System.out.println("PNU���� ������ �� : : : "+strPnu);
			System.out.println("strX���� ������ �� : : : "+strX);
			System.out.println("strY���� ������ �� : : : "+strY);
		
			
			SearchBean objSearchBean = new SearchBean();
			
				if(!strPnu.equals("")){
					List	list2 	= objMapSearchService.miniMapXY(strPnu); // �ǹ� ��ǥ ��������
	
					if(list2.size()<=0){
						
						List	list3 	= objMapSearchService.miniMapbjXY(strPnu); //���鵿 ��ǥ��������
						
						if(list3.size()<=0){
							
							objSearchBean	= null;
						}
						else
						{
							
							objSearchBean	= (SearchBean)list3.get(0);
					
						}
						
					}
					else
					{
						objSearchBean	= (SearchBean)list2.get(0);
					}
				}

				request.setAttribute("PNU", strPnu);
				request.setAttribute("ADDR", strAddr);
				request.setAttribute("FLAG", strFlag);
				request.setAttribute("OWNER_NAME", strOwner_Name);
				request.setAttribute("NAME", strName);
				request.setAttribute("X", strX);
				request.setAttribute("Y", strY);
				request.setAttribute("CHECK", check);

				
				
				if(strFlag.equals("VIEW")){
					return new ModelAndView("/map/miniMapView", "miniMap", objSearchBean);
				}
				
				
			return new ModelAndView("/map/miniMap", "miniMap", objSearchBean);
				
		}
		
		

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	
//		���鵿 �ڵ�
		public ModelAndView getAreaCode(HttpServletRequest request,
				HttpServletResponse response)  throws Exception {
			
			// ���ǿ��� �õ� �ڵ带 �����´�.
			String SI_CD = util.getSidoCode(getMessageSourceAccessor());
	     
			String strFrom = request.getParameter("from");
			String strTo = request.getParameter("to");
			String valFrom = ServletRequestUtils.getStringParameter(request,"valFrom","0");   //�ñ��� �ڵ�
			String valTo = ServletRequestUtils.getStringParameter(request,"valTo","0");   //�� �ڵ�
			String strCity,strCounty,strTown;
			String strRdIndex = request.getParameter("rdIndex");
			String strLanguage =RequestUtils.getStringParameter(request,"language","KOREAN"); 
	
			List lstResult = null;
	     
			response.setCharacterEncoding("UTF-8");
			
			lstResult		=  objMapSearchService.executeBJDongCode(SI_CD, valFrom); //���ڵ�
	         	 
	        StringBuffer results = new StringBuffer("<counties>");
	        SearchBean objSearchBean = null;
	        for(Iterator it = lstResult.iterator(); it.hasNext();) {
	        	objSearchBean = (SearchBean)it.next();
	            results.append("<value>");
	            results.append(objSearchBean.getBJ_CD1());
	            results.append("</value>");
	            results.append("<name>");
	            results.append(objSearchBean.getBJ_NM());
	            results.append("</name>");
	         }
	         results.append("</counties>");
	         
	         response.setContentType("text/xml");
	         response.getWriter().write(results.toString());
	
	         return null;    
	
	    }
}
