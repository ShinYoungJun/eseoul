//	2009		Kim Yun Seo
//	�Ⱓ ����ó�� - �ϰ�ó�� ����Ʈ
package main.java.jumyong.gigan.web;


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;
import java.util.StringTokenizer;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import main.java.common.util.catUtil.Pageing;
import main.java.common.util.catUtil.Util;
import main.java.common.commonCode.model.UserBean;
import main.java.common.commonCode.service.CommonCodeService;
import main.java.jumyong.gigan.model.AppealBean;
import main.java.jumyong.gigan.model.GiganBean;
import main.java.jumyong.gigan.model.GiganSearchBean;
import main.java.jumyong.gigan.model.GiyeonBean;
import main.java.jumyong.gigan.service.IGiganService;

import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

public class TabIlgwal_Control	extends MultiActionController{

	private	IGiganService		iGiganervice	= null;
	private	CommonCodeService	commonCode		= null;
	private	Util				util			= new Util();
	private	Pageing				pageing			= new Pageing();
	

	public void setJumyong_giganService(IGiganService jumyong_giganService) 
	{
		this.iGiganervice = jumyong_giganService;
	}
	
	public void setCommonCodeService(CommonCodeService commonCode)
	{
		this.commonCode 	= commonCode;
	}
	
	//	������ȸ���� �˻��� ����Ʈ�� ����Ѵ�.
	public ModelAndView 	Ilgwal_View(HttpServletRequest request, HttpServletResponse response) throws Exception 
	{
		HttpSession session = request.getSession();
		String 		userId	= (String)session.getAttribute("sessionUserId");	
		List		list	= null;
		try{
			if(userId != null)
			{
				//	���ǿ��� �õ� �ڵ带 �����´�.
				String	SIDO_CD	= util.getSidoCode(getMessageSourceAccessor());
				
				//	������ �����͸� �����´�.
				UserBean	userBean	= new UserBean();
				userBean	= commonCode.executeUserSearch(util.getSessionID(request, "sessionUserId"));
				
				String 	GIGAN1 		= ServletRequestUtils.getStringParameter(request, "GIGAN1", "");
				String 	GIGAN2 		= ServletRequestUtils.getStringParameter(request, "GIGAN2", "");
				String		TYPE = ServletRequestUtils.getStringParameter(request, "TYPE", "");
				String		SECTION = ServletRequestUtils.getStringParameter(request, "SECTION", "");
				
				System.out.println("�ƿ� ���İ� ������� : : : :"+SECTION);
							
				GiganSearchBean	giganSearchBean	= new GiganSearchBean();
				
				bind(request, giganSearchBean);
				
				if(giganSearchBean.getPURPOSE_CD()==null || giganSearchBean.getPURPOSE_CD().length()==0)
					giganSearchBean.setPURPOSE_CD(ServletRequestUtils.getStringParameter(request, "PURPOSE_CD", ""));
				request.setAttribute("PURPOSE_CD", giganSearchBean.getPURPOSE_CD());
				//	�˻� ���ǿ� ������ ������ �߰�
				giganSearchBean.setSIDO(SIDO_CD);
				giganSearchBean.setSIGUNGU(userBean.getSIGU_CD());
				giganSearchBean.setGIGAN1(util.Date_Cut(GIGAN1));
				giganSearchBean.setGIGAN2(util.Date_Cut(GIGAN2));
					
			    int	 	currentPage	= Integer.parseInt(ServletRequestUtils.getStringParameter(request, "currentPage", "1"));
				
				//	�������� �� ������ �����´�.
				int		iTotalCnt	= iGiganervice.executeCount(giganSearchBean);
				System.out.println("iTotalCnt :" +iTotalCnt);
				//	����¡ ó��
				int		rowCol		= pageing.execute(request, iTotalCnt, currentPage, 10);
				System.out.println("rowCol :" +rowCol);
				
				//	�˻��� �����͸� �����´�.
				list	= iGiganervice.executeSearch(giganSearchBean, rowCol, rowCol + 9);
			//	List		blist	= new ArrayList();
				GiganBean	Bean	= new GiganBean();
				int			size	= list.size();
				String		jumyongji	= "";
				
				//	����Ʈ�� �ѷ��� ������ 
				for(int i = 0	;	i < size	;	i++)
				{
					Bean	= (GiganBean)list.get(i);
					
					Bean.setTYPE_NM(commonCode.executeSearchCommonCode("use_type", Bean.getTYPE()));	//	��������
					//	������
					jumyongji	= commonCode.executeSearchBJDongCode("����", "������", Bean.getBJ_CD());
					
					if(Bean.getSAN_CK()	!= null)
						if(Bean.getSAN_CK().trim().equals("2"))
							jumyongji += " ��";
					
					if(Bean.getBONBUN()	!= null)
						if(!Bean.getBONBUN().trim().equals(""))
							jumyongji	+= " " + Bean.getBONBUN();
					
					if(Bean.getBUBUN()	!= null)
						if(!Bean.getBUBUN().trim().equals(""))
							jumyongji	+= "-" + Bean.getBUBUN();
					
					Bean.setJUMYONGJI(jumyongji);
					
					//	������� KIND
					if(Bean.getPURPOSE_KIND()	!= null)
						if(!Bean.getPURPOSE_KIND().trim().equals(""))
							Bean.setPURPOSE_KIND("(" + Bean.getPURPOSE_KIND() + ")");
					
					Bean.setGIGAN(util.Date_Paste(Bean.getMUL_FROMDATE()) + " ~ " + util.Date_Paste(Bean.getMUL_TODATE()));
				}
		
				request.setAttribute("GIGAN1", GIGAN1);
				request.setAttribute("GIGAN2", GIGAN2);
				
				
				request.setAttribute("TYPE", TYPE);
				request.setAttribute("SECTION", SECTION);
				
			}
		}catch(Exception e){
			System.out.println("error:"+e.toString());
		}
		return new ModelAndView("/jumyong/gigan/tab/ilgwal_view", "blist", list);
	}
}
