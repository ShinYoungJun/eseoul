//	2009		Kim Yun Seo

package main.java.gapan.gapan.web;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import main.java.gapan.gapan.model.JumjiSearchBean;
import main.java.gapan.gapan.service.IGapanService;
import main.java.common.util.catUtil.Pageing;
import main.java.common.util.catUtil.Util;
import main.java.common.commonCode.model.UserBean;
import main.java.common.commonCode.service.CommonCodeService;


public class TabJumji_Control	extends MultiActionController {

	private	IGapanService		iGapanService	= null;
	private	CommonCodeService	commonCode		= null;
	private	Util				util			= new Util();
	private	Pageing				pageing			= new Pageing();
	

	public void setGapanService(IGapanService gapanService) 
	{
		this.iGapanService = gapanService;
	}
	
	public void setCommonCodeService(CommonCodeService commonCode)
	{
		this.commonCode 	= commonCode;
	}
	
	//	������ ��ȸ ȭ���� ����Ѵ�.
	public	ModelAndView 	Search(HttpServletRequest request, HttpServletResponse response) throws Exception
	{
		// ���� ����
		HttpSession session = request.getSession();
		
		String 		userId	= (String)session.getAttribute("sessionUserId");
		List	list	=	null;

		try{
			if(userId != null)
			{
				String 	FIRST 	= ServletRequestUtils.getStringParameter(request, "FIRST", "");
				
				//	������ �����͸� �����´�.
				UserBean	userBean	= new UserBean();
				userBean	= commonCode.executeUserSearch(util.getSessionID(request, "sessionUserId"));
				
				//properties ���Ͽ� �ִ� �õ� �ڵ带 �����´�.
				String	SIDO_CD	= util.getSidoCode(getMessageSourceAccessor());
				String SIGU_CD = userBean.getSIGU_CD();
				
				//	������ �����Ͱ� ������ "GU_NM" ��  "SIGUNGU" ��������  request�Ѵ�.
				if(userBean	!= null)
				{
					request.setAttribute("GU_NM", userBean.getGU_NM());
				}
				
				//	���� �������� �����´�.
				int	 	currentPage	= Integer.parseInt(ServletRequestUtils.getStringParameter(request, "currentPage", "1"));
				
				JumjiSearchBean 	Bean	= new JumjiSearchBean();
				list	= new ArrayList();
				
				//	�˻����� �� �����´�.
				String 	GAPAN_NO 	= ServletRequestUtils.getStringParameter(request, "GAPAN_NO", "").trim();
				String 	NAME	 	= ServletRequestUtils.getStringParameter(request, "NAME", "").trim();
				String 	SSN1 		= ServletRequestUtils.getStringParameter(request, "SSN1", "").trim();
				String 	SSN2 		= ServletRequestUtils.getStringParameter(request, "SSN2", "").trim();
				String 	BJ_CD 		= ServletRequestUtils.getStringParameter(request, "BJ_CD", "");
				String 	SPC_CD 		= ServletRequestUtils.getStringParameter(request, "SPC_CD", "");
				
				String 	BONBUN 		= ServletRequestUtils.getStringParameter(request, "BONBUN", "").trim();
				String 	BUBUN 		= ServletRequestUtils.getStringParameter(request, "BUBUN", "").trim();

				Bean.setSIDO(SIDO_CD);
				Bean.setSIGUNGU(SIGU_CD);
				Bean.setGAPAN_NO(GAPAN_NO);
				Bean.setNAME(NAME);
				//Bean.setSSN(SSN1 + SSN2);
				Bean.setSSN1(SSN1);
				Bean.setSSN2(SSN2);
				Bean.setBJ_CD(BJ_CD);
				Bean.setSPC_CD(SPC_CD);
				Bean.setBONBUN(BONBUN);
				Bean.setBUBUN(BUBUN);
				
				int	totalcnt	= 0;
				int	rowCol		= 0;
//				System.out.println("FIRST ==>"+FIRST);
				if(FIRST != "")
				{
					if(!(NAME.equals("")&&SSN1.equals("")&&SSN2.equals(""))){
						//	�� ������� Ȯ���Ѵ�.
						totalcnt	= iGapanService.executeSearch_JumjiCount(Bean);
//						System.out.println("totalcnt ==>"+totalcnt);
						//	���� ������ �Ǽ��� �����´�.
						rowCol		= pageing.execute(request, totalcnt, currentPage, 10);
						
						//	��ȸ�� �����͸� �����´�.
						list	= iGapanService.executeSearch_Jumji(Bean, rowCol, rowCol + 9);
//						System.out.println("list.size() ==>"+list.size());
					}
				}
				else
					request.setAttribute("FIRST", "1");
				
				int		size	= list.size();
				
				//	����¡ ó��
				pageing.execute(request, totalcnt, currentPage, 10);
				
				//	������ �����͸� �����Ѵ�.
				for(int i = 0	;	i < size	; 	i++)
				{
					Bean	= (JumjiSearchBean)list.get(i);
					
					Bean.setTYPE(commonCode.executeSearchCommonCode("use_type", Bean.getTYPE()));	//	��������	
					Bean.setBJ_CD(commonCode.executeSearchBJDongCode(Bean.getSIDO(), Bean.getSIGUNGU(), Bean.getBJ_CD()));
					Bean.setSPC_CD(commonCode.executeSearchCommonCode("MUL_SPC_CD", Bean.getSPC_CD()));
					
					//	������ ����
					if(Bean.getBUBUN()	!= null)
					{
						if(!Bean.getBUBUN().trim().equals(""))
							Bean.setBUBUN("-" + Bean.getBUBUN() + "����");
						else	Bean.setBONBUN(Bean.getBONBUN() + "����");
					}
					else
						Bean.setBONBUN(Bean.getBONBUN() + "����");
					
					Bean.setSIDO_NM(commonCode.executeSiNm(Bean.getSIDO()));
					Bean.setSIGUNGU(commonCode.SearchGuName(Bean.getSIDO(), Bean.getSIGUNGU()));	//	�� �̸��Է�
				}
				
				request.setAttribute("totalcnt", String.valueOf(totalcnt));
				request.setAttribute("bjdong_code", commonCode.CommonBJDongCodeSearch(SIDO_CD, SIGU_CD, BJ_CD));
				request.setAttribute("mul_spc_cd", commonCode.executeCommonCode("MUL_SPC_CD", SPC_CD, "��ü"));
				request.setAttribute("GAPAN_NO", GAPAN_NO);
				request.setAttribute("NAME", NAME);
				request.setAttribute("SSN1", SSN1);
				
				request.setAttribute("SSN2", SSN2);
				request.setAttribute("BJ_CD", BJ_CD);
				request.setAttribute("SPC_CD", SPC_CD);
				request.setAttribute("BONBUN", BONBUN);
				request.setAttribute("BUBUN", BUBUN);
				
				request.setAttribute("currentPage", String.valueOf(currentPage));
			}
		} catch(Exception e){
			System.out.println(e.toString());
		}
		
		return new ModelAndView("/gapan/gapan/tab/jumji_search", "blist", list);
	}
	
}
