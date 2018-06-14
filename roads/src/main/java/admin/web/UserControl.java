package main.java.admin.web;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import main.java.admin.model.BoardBean;
import main.java.admin.model.UserRegBean;
import main.java.admin.service.IUserRegService;
import main.java.common.commonCode.model.UserBean;
import main.java.common.commonCode.service.CommonCodeService;
import main.java.common.util.BoardUtil;
import main.java.common.util.Globals;
import main.java.common.util.SHA;
import main.java.common.util.catUtil.Util;
import main.java.facility.jumyong.model.Equip_ProductBean;

import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

public class UserControl extends MultiActionController {

	private IUserRegService objUserRegService = null;
	private	CommonCodeService	commonCode		= null;
	private	Util util = new Util();

	public void setUserRegService(IUserRegService newObjUserRegService) {
		this.objUserRegService = newObjUserRegService;
	}
	
	public void setCommonCodeService(CommonCodeService commonCode)
	{
		this.commonCode = commonCode;
	}

	/**
	 * ����ڸ���Ʈ ��ȸ (login ���ѻ��¿� ���̴� ����Ʈ)
	 * 
	 * @param HttpServletRequest 
	 *            request
	 * @param HttpServletResponce
	 *            responce
	 * @return ModelAndView
	 */
	public ModelAndView list(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		HttpSession session = request.getSession();
		String 		userId	= (String)session.getAttribute("sessionUserId");
		List	blist = null;
		
		try{
			if(userId != null){					
				
				//	���ǿ��� �õ� �ڵ带 �����´�.
				String	SIDO_CD	= util.getSidoCode(getMessageSourceAccessor());
				
				//	������ �����͸� �����´�.
				UserBean	userBean	= new UserBean();
				userBean	= commonCode.executeUserSearch(util.getSessionID(request, "sessionUserId"));
				String sigu_cd = userBean.getORG_CD();
				
				int intCurrentPage = 0;
				int intCountPerPage = 0;
				
				String strCurrentPage = ServletRequestUtils.getStringParameter(request, "currentPage", Globals.DEFAULT_CURRENT_PAGE);
				String strCountPerPage = ServletRequestUtils.getStringParameter(request, "countPerPage", Globals.DEFAULT_COUNTPER_PAGE);		
				String userGrade = ServletRequestUtils.getStringParameter(request,"userGrade","");
				String siguCode = ServletRequestUtils.getStringParameter(request,"siguCode","");	
				String deptCode = ServletRequestUtils.getStringParameter(request,"deptCode","");	
				String userName = ServletRequestUtils.getStringParameter(request,"userName","");
				String position = ServletRequestUtils.getStringParameter(request,"position","");	
				String certYN = ServletRequestUtils.getStringParameter(request,"certYN","");				
				//String strParams ="&userGrade="+userGrade+"&siguCode="+sigu_cd+"&deptCode="+deptCode+"&userName="+userName+"&certYN="+certYN;
				String strParams ="&userGrade="+userGrade+"&siguCode="+siguCode+"&deptCode="+deptCode+"&userName="+userName+"&certYN="+certYN;				
				String strActionUrl = request.getContextPath();
				
				intCurrentPage = Integer.parseInt(strCurrentPage);
				intCountPerPage = Integer.parseInt(strCountPerPage);
				
				if(sigu_cd.equals("0000000")){
					sigu_cd = siguCode;
				}
					
				
				int totalCount = objUserRegService.getUserTotalCount(userGrade,sigu_cd,deptCode,userName,certYN);
				String strPageDivideForm = BoardUtil.getDividePageForm(intCurrentPage,intCountPerPage, strParams,"/admin/user/user.do",strActionUrl, totalCount);
				
				List		list	= objUserRegService.retrieveUserList(intCurrentPage,intCountPerPage,userGrade, sigu_cd, deptCode,userName, certYN);
				blist	= new ArrayList();
				UserRegBean	bean	= new UserRegBean();
				int			size	= list.size();
			
				for(int i = 0	;	i < size	;	i++)
				{
					bean	= (UserRegBean)list.get(i);
					
					if(bean.getREQUEST_DATE() != null)	
						bean.setREQUEST_DATE(util.Date_Paste(bean.getREQUEST_DATE()));
		        	
					if(bean.getAPPROVAL_DATE() != null)	
						bean.setAPPROVAL_DATE(util.Date_Paste(bean.getAPPROVAL_DATE()));
		        	
					bean.setLAST_CONN_DATE(util.Date_Paste(bean.getLAST_CONN_DATE()));
					blist.add(i, bean);
				}
				
				String org_cd = (String)session.getAttribute("org_cd");		
				
				request.setAttribute("userGrade", commonCode.executeCommonCode("user_grade", userGrade, "��ü"));	
				request.setAttribute("siguCode",sigu_cd);
				request.setAttribute("deptCode",deptCode);
				request.setAttribute("userName",userName);
				request.setAttribute("POSITION",position);
				request.setAttribute("certYN",certYN);
				request.setAttribute("strPageDivideForm", strPageDivideForm);
				request.setAttribute("listSize",String.valueOf(list.size()));
				request.setAttribute("totalCount",String.valueOf(totalCount));
				request.setAttribute("org_cd",org_cd);		
						
				List guCdList = objUserRegService.getGuCode();
				request.setAttribute("guCdList",guCdList);
			}
		}catch(Exception e)	{
			System.out.println(e.toString());
		}
		return new ModelAndView("/admin/user/userList", "blist", blist);

	}
	
   	/**
   	 * USER_INFO �� ������ ��ȸ 
 	 * @param HttpServletRequest request 
 	 * @param HttpServletResponse response
	 * @return ModelAndView
	 */
	public ModelAndView userView(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		HttpSession session = request.getSession();
		String 		userId	= (String)session.getAttribute("sessionUserId");
		String 		adId = ServletRequestUtils.getStringParameter(request,"adId","");
		String 		user_Id = ServletRequestUtils.getStringParameter(request,"userId","");
		String 		input_type = ServletRequestUtils.getStringParameter(request,"input_type","");
		System.out.println("input_type:"+input_type);
		UserRegBean info = null;
		
		try{
			if(userId != null || adId != null){		
				
				request.setAttribute("userId", user_Id);
				
				List guCdList = objUserRegService.getGuCode();
				request.setAttribute("guCdList",guCdList);
				
				info = objUserRegService.getUserDetail(user_Id);
				
				request.setAttribute("siguCode", info.getSIGU_CD());
				request.setAttribute("deptCode", info.getDEPT_CD());
				request.setAttribute("section", info.getSECTION());
				request.setAttribute("input_type", input_type);
			
				//System.out.println("info"+info);
			}
		}catch(Exception e)	{
			System.out.println(e.toString());
		}
		return new ModelAndView("/admin/user/userUpdatePop", "userView", info);
	}	

   	/**
   	 * ��޺� �޴����� ��ȸ 
 	 * @param HttpServletRequest request 
 	 * @param HttpServletResponse response
	 * @return ModelAndView
	 */
	/*
	 �޴��� 7���� ������ ���޴��� 1���� 7������ 2�� ������ �ؼ�
	 ��) 1    2    3    4    5    6    7   --> �޴���ȣ
	    2    4    8    16   32   64   128 --> ������
	    2^1	 2^2  2^3  2^4  2^5  2^6  2^7
	�̷��� ���Ѵ�.
	�� ���� �ش� �޴��� ������ �ִٸ�    �޴���ȣ�� �������� ���� ���Ѵ�.
	���� 1, 4, 6���� �޴���ȣ�� üũ �Ѵٸ� �׿� ������ 2+16+64�� ���Ѱ� 82�� �����µ�
	�� ���� User_code ���̺��� �ش� ���̵��� grade_menu���� ����Ȱ� �����´�.
	������ ���� ���� ����� �ݴ�� �ؼ� 
	��, 82�� ���� �����Դµ� �޴���ȣ�� ���� ū����������  ������ �� �������� ����
	�׷��� �װ��� 0���� �۴ٸ� �׸޴��� üũ ���� �ʴ°ɷ� �ν��ϰ� ������ ���Ѵ�.
	�� ����� ����ϴ� 0���� ū���� ������ �� �޴���ȣ�� üũ�� �ɷ� �ν��Ѵ�.
	�ؼ� ������ ���� ���������� ���ٰ� 0�� ������ �޴��� üũ�� ���θ� �˼� �ִ�.
	 */
	public ModelAndView userAuthority(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		String user_id = ServletRequestUtils.getStringParameter(request,"user_id","");
		String userGrade = ServletRequestUtils.getStringParameter(request, "userGrade", "");
		String result = ServletRequestUtils.getStringParameter(request, "result", "");
		
		request.setAttribute("user_id", user_id);
		request.setAttribute("result", result);
		
		int grade_menu = objUserRegService.getGrade_menu(user_id);
		
		
		request.setAttribute("userGrade", userGrade);
		System.out.println("��Ʈ�� ���="+userGrade);
		List info = objUserRegService.userAuthorityList();
		List info2 = new ArrayList();
		request.setAttribute("listSize",String.valueOf(info.size()));
		UserRegBean bean = new UserRegBean();
		
		int square = 1;		//�����ٰ� ����
		for(int i = 0	;	i < info.size()	;	i++)
		{
			bean	= (UserRegBean)info.get(i);
			
			for(int j=0; j < Integer.parseInt(bean.getMENU_CD());j++){		//�ش�޴� ��ȣ�� 2�������� ���Ѵ�.
				square =  square*2;
			}
			
			grade_menu = grade_menu - square;
			

			if(grade_menu>=0){  	//�������� �� grade_menu���� 0���� ������ ���θ� ����
				bean.setCHK("1");	//0���� ũ�� ������ �ش� �޴��� üũ ���� �˼� �ִ�.
			}else{				
				bean.setCHK("0");
				grade_menu = grade_menu + square;
			}
			info2.add(i, bean);
			square = 1;		//�ش� �޴����� �ٽ� ���� ���� �ʱ�ȭ �Ѵ�.
									
		}
		
		System.out.println("info2:"+info2);
		return new ModelAndView("/admin/user/userAuthorityPop", "authorityList", info2);
	}	
		
   	/**
   	 * ���ڵ� ��ȸ
 	 * @param HttpServletRequest request 
 	 * @param HttpServletResponse response
	 * @return ModelAndView
	 */
	public ModelAndView getGuCd(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		List guCdList = objUserRegService.getGuCode();
		return new ModelAndView("/admin/user/userList", "guCdList", guCdList);

	}
	
   	/**
   	 * �μ��ڵ� ��ȸ
 	 * @param HttpServletRequest request 
 	 * @param HttpServletResponse response
	 * @return ModelAndView
	 */
	public ModelAndView getDeptCd(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		String siguCode = ServletRequestUtils.getStringParameter(request,"siguCode","");
		String strModeType = ServletRequestUtils.getStringParameter(request, "modeType","");
		
		List deptCdList = objUserRegService.getDeptCode(siguCode);
		
		request.setAttribute("siguCode",siguCode);
		request.setAttribute("deptCdList",deptCdList);
		request.setAttribute("modeType",strModeType);
		
		return new ModelAndView("/admin/user/deptCode", "deptCdList", deptCdList);

	}
	
	public String getSHA_PW(String oriPW) {
		String pw_sha = "";
		
		pw_sha = SHA.SHA(oriPW, "SHA-256");
		System.out.println("oriPW : " + oriPW + ", pw_sha : " + pw_sha);
		
		return pw_sha;
	}
	
   	/**
   	 * loginó��
 	 * @param HttpServletRequest request 
 	 * @param HttpServletResponse response
	 * @return ModelAndView
	 */
	public ModelAndView login(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		String strUserId = ServletRequestUtils.getStringParameter(request, "ROADS_USERID", "").trim();
		String strPassword = ServletRequestUtils.getStringParameter(request, "ROADS_PASS", "").trim();
		System.out.println("strUserId1="+strUserId);
//		String strActionUrl = ServletRequestUtils.getStringParameter(request, "target", "");
		String strActionUrl = request.getContextPath();
		
		strUserId = strUserId.replace('=','#');
		strUserId = strUserId.replace(';','#');
		strUserId = strUserId.replaceAll("<","&lt;");
		strUserId = strUserId.replaceAll(">","&gt;");
		
		strPassword = strPassword.replace('=','#');
		strPassword = strPassword.replace(';','#');
		strPassword = strPassword.replaceAll("<","&lt;");
		strPassword = strPassword.replaceAll(">","&gt;");

		String pw_sha = getSHA_PW(strPassword);
		
		//�������� ��ȸ
		List		list	= objUserRegService.retrieveNoticeList("0");
		
		List		blist	= new ArrayList();
		BoardBean	bean	= new BoardBean();
		int			size	= list.size();
		int j=0;
		int a =25;
		for(int i = 0	;	i < size	;	i++)
		{
			bean	= (BoardBean)list.get(i);
			
			if(bean.getREGDATE() != null)	
				bean.setREGDATE(util.Date_Paste(bean.getREGDATE()));

			blist.add(i, bean);
		}
    	int pwcount = 0;
    	request.setAttribute("notice",blist);
	
		// �α��� �� �޴��� �̵�. �� �޴��� ������ ������������ �´�
		if(strActionUrl.equals("") || strActionUrl.equals("null"))
			strActionUrl = "redirect:/openIndexPage.do";
		else
			strActionUrl = "redirect:"+strActionUrl;
		
		if(strUserId == null || strUserId == "")
		{	
			return new ModelAndView("redirect:/rams/admin/user/login.do");
		}
		else
		{
			UserRegBean objUserRegBean = objUserRegService.getUserDetail(strUserId);
			
			// ��ϵ� ����ڰ� �ƴ�
			if(objUserRegBean == null){
				
				return new ModelAndView("redirect:/rams/admin/user/login.do?message="+"�������� �ʴ� ID�Դϴ�");
			}
			// �������� ����     
			else if(objUserRegBean.getAPPROVAL_DATE() == null){
				
				return new ModelAndView("redirect:/rams/admin/user/login.do?message="+"�������� �ʾҽ��ϴ�.");
			}
			// password����ġ
			else if(!objUserRegBean.getPW().equals(strPassword)){
				ModelAndView model = null;
				pwcount = objUserRegService.getPwNum(strUserId);
				System.out.println("pwcount: " + pwcount);			
				System.out.println("&&&&&&&&&&&&&&&&getPW: ' " + objUserRegBean.getPW());
				System.out.println("&&&&&&&&&&strPassword: ' " + strPassword);
				if(pwcount >= 0 && pwcount < 5){
					pwcount++;
					System.out.println("pwcount: " + pwcount);
					objUserRegService.setPwNum(strUserId, pwcount);
					
					if(pwcount != 5){
						model = new ModelAndView("redirect:/rams/admin/user/login.do?message="+"�н����带 Ȯ���Ͻñ� �ٶ��ϴ�.(" + pwcount + "ȸ ����)");						
					}else{
						model = new ModelAndView("redirect:/rams/admin/user/login.do?message="+"�н����� 5ȸ �̻� ����. 070-8889-3275 �Ǵ� 02-2133-8133�� ����.");
					}
				}else if(pwcount >= 5){
					System.out.println("�α��κҰ�");
					model = new ModelAndView("redirect:/rams/admin/user/login.do?message="+"�н����� 5ȸ �̻� ����. 070-8889-3275 �Ǵ� 02-2133-8133�� ����.");
				}
				
				return model;
			}
			// �α��� ����
			else{
				
				//String[][] location = new String[26][5];
				
				pwcount = objUserRegService.getPwNum(strUserId);
				if(pwcount > 0 && pwcount < 5){
					objUserRegService.setPwNum(strUserId, 0);
				}else if(pwcount == 5 ){
					System.out.println("�α��κҰ�");
					return new ModelAndView("redirect:/rams/admin/user/login.do?message="+"�н����� 5ȸ �̻� ����. 070-8889-3275 �Ǵ� 02-2133-8133�� ����.");
				}

				SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd");
				String today = formatter.format(new Date());
				String pw_date = objUserRegBean.getPW_DATE();
				
				if(pw_date == null){
					pw_date = today;
				}
				
				Date end = formatter.parse(today);
				Date start = formatter.parse(pw_date);
				long diff = end.getTime() - start.getTime();
				diff = diff / (24*60*60*1000); // 24(�ð�)*60(��)*60(��)*1000(1000����1)
				if(diff >= 183){
					System.out.println(diff + "  ��й�ȣ �������� 6���� �̻��Դϴ�.");
				}
				objUserRegService.setLoginDate(today, strUserId);	//�α��� �� ������ ����
			String arr[][] = {
					{"110","195490.910","202065.600","451809.250","459196.480"},
					{"140","196603.920","202367.840","449371.390","452497.210"},
					{"170","195101.440","201524.240","445227.460","450682.180"},
					{"200","200718.390","206516.020","447649.320","452609.400"},
					{"215","204970.420","210187.310","447005.010","452705.340"},
					{"230","202048.850","206910.720","451161.540","456452.850"},
					{"260","206134.450","210463.860","452241.130","457944.690"},
					{"290","197784.060","206330.300","453105.190","459530.240"},
					{"305","198210.040","204389.710","456592.470","465034.690"},
					{"320","200661.440","205014.830","458983.210","466880.790"},
					{"350","203681.660","209932.340","457189.990","466277.220"},
					{"380","189583.160","196767.550","452943.740","462171.100"},
					{"410","191340.290","197302.530","450621.300","456696.110"},
					{"440","187069.040","196809.980","448254.280","454587.820"},
					{"470","184231.640","190346.750","444828.370","450198.950"},
					{"500","179188.090","189466.610","447455.420","456179.090"},
					{"530","183464.170","191438.320","441555.010","446498.840"},
					{"545","188656.060","193675.540","437127.360","443030.840"},
					{"560","189208.150","195569.740","442842.500","450754.310"},
					{"590","191438.320","198712.730","441770.360","446460.380"},
					{"620","191060.440","198998.660","437367.780","443958.630"},
					{"650","198223.990","208471.280","436545.290","447343.170"},
					{"680","200759.120","210989.480","439636.660","448481.320"},
					{"710","205969.290","214279.120","440793.870","449301.200"},
					{"740","209640.400","216243.540","446382.780","453531.290"},
					{"000","179188.090","217385.960","433423.790","467087.320"}
			};
			
			/*arr[][0] : ���ڵ� 
			arr[][1] : minx
			arr[][2] : maxx
			arr[][3] : miny
			arr[][4] : maxy*/
			
			for(j=0;j<arr.length;j++){
				if(arr[j][0].equals(objUserRegBean.getGU_CD())){
					//a = j;
					break;
				}		
			}	
			
			System.out.println("----------");
			System.out.println(objUserRegBean.getSIGU_CD());
			System.out.println(arr.length);
			System.out.println(j);
			System.out.println(arr[j][0]);
			System.out.println(arr[j][1]);
			System.out.println(arr[j][2]);
				
				// ���ǿ� �α� ���� ��� �� ������ �������� �̵�
				HttpSession session = request.getSession();
				session.setAttribute("sessionUserId", objUserRegBean.getUSER_ID());
			
				session.setAttribute("org_cd", objUserRegBean.getSIGU_CD());
				session.setAttribute("dept_cd", objUserRegBean.getDEPT_CD());
				session.setAttribute("sigu_cd", objUserRegBean.getGU_CD());
				
				request.setAttribute("userId", strUserId);
				
				session.setAttribute("minx", arr[j][1]);
				session.setAttribute("miny", arr[j][3]);
				session.setAttribute("maxx", arr[j][2]);
				session.setAttribute("maxy", arr[j][4]);
	//			boolean updateYmd = objUserRegService.updateSys(strUserId);			
				
				//�������� ������ ������� ���ǿ��� �����Ѵ�
				//session.removeAttribute("sessionUserId");
					
				return new ModelAndView("/admin/user/main");
			}	
		}
	}
	
	/**
   	 * logoutó��
 	 * @param HttpServletRequest request 
 	 * @param HttpServletResponse response
	 * @return ModelAndView
	 */
	public ModelAndView logout(HttpServletRequest request,
			HttpServletResponse response) throws Exception {

		HttpSession session = request.getSession();
		session.removeAttribute("sessionUserId");
		return new ModelAndView("redirect:/rams/admin/user/login.do");
	}
	
	/**
     * ���� ������ ���½� �������� popup ����
	 */
    public ModelAndView openIndexPage(HttpServletRequest request,
			HttpServletResponse response)  throws Exception {
    	
    	String popup = ServletRequestUtils.getStringParameter(request,"popup","0");
    	
    	List noticeList = objUserRegService.retrieveNoticeList(popup);  
    	
    	BoardBean bean = null; 
    	if(noticeList.size()>0){
    		bean = (BoardBean)noticeList.get(0);
    		System.out.println("11111111111@@@@@@@@@@@@@");
    		System.out.println("bean.getNOTICE_TODATE():"+bean.getNOTICE_TODATE());
    		request.setAttribute("notice_todate",bean.getNOTICE_TODATE());
    	}else{
    		request.setAttribute("notic" +
    				"e_todate","00000000");
    	}
    	
    	SimpleDateFormat	formatter 	= new SimpleDateFormat("yyyyMMdd", Locale.KOREA );
		Calendar 			cal 		= Calendar.getInstance();
		String	today		= formatter.format(cal.getTime());
    	
    	request.setAttribute("notice",noticeList);
    	request.setAttribute("today",today);
    	

     	return new ModelAndView("/admin/user/noticePop","noticeList",noticeList);
	}
    
   	/**
   	 * simple ���� ���� ��ȸ 
 	 * @param HttpServletRequest request 
 	 * @param HttpServletResponse response
	 * @return ModelAndView
	 */
	public ModelAndView userInfo(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		HttpSession session = request.getSession();
		String userId = (String)session.getAttribute("sessionUserId");		
		String org_cd = (String)session.getAttribute("org_cd");
		String dept_cd = (String)session.getAttribute("dept_cd");
		UserRegBean info = null;
		
		if(userId != null)
		{
			info = objUserRegService.getUserDetail(userId);
			
			request.setAttribute("name", info.getNAME());
			request.setAttribute("guNm", info.getGU_NM());
			request.setAttribute("section", info.getSECTION());
			request.setAttribute("userId", userId);
			request.setAttribute("grade_menu", info.getGrade());
			request.setAttribute("org_cd", org_cd);
			request.setAttribute("dept_cd", dept_cd);
			request.setAttribute("insarangKey", info.getINSARANGKEY());
		}
		
		return new ModelAndView("/menu/top/menu", "userView", info);
	}
	
	
	public ModelAndView changePwdView(HttpServletRequest request,
			HttpServletResponse response) throws Exception {

		HttpSession session = request.getSession();
		String userId = (String)session.getAttribute("sessionUserId");	
		System.out.println("sessionUserId: " + userId);
		String returnPage = "/admin/user/changePwdView";
		
		return new ModelAndView(returnPage);
	}
	
	public ModelAndView changePwd(HttpServletRequest request,
			HttpServletResponse response) throws Exception {

		HttpSession session = request.getSession();
		String userId = (String)session.getAttribute("sessionUserId");		
		String currentPW = ServletRequestUtils.getStringParameter(request, "currentPW");
		String newPW = ServletRequestUtils.getStringParameter(request, "newPW");
		
		System.out.println("currentPW: " + currentPW);
		System.out.println("newPW: " + newPW);
		
		String pwd_check = null;
		
		SimpleDateFormat formatter=  new SimpleDateFormat("yyyyMMdd");
		String today = formatter.format(new Date());
		
		UserRegBean userBean = new UserRegBean();
		userBean.setUSER_ID(userId);
		userBean.setPW_DATE(today);
		
		if(currentPW != null && newPW != null){
			System.out.println("userId; " + userId);
			pwd_check = objUserRegService.checkPwd(userId);
			
			if(pwd_check != null && pwd_check.equals(currentPW)){
				userBean.setPW(newPW);
				userBean.setPW_SHA(SHA(newPW, "sha-256"));
				objUserRegService.setNewPwd(userBean);
			}else{
				System.out.println("�������~" + currentPW + "else");
			}
		}else{
			System.out.println("��...!!!!!!");
		}
		
		System.out.println("((((((((((((((((((");
		//return new ModelAndView("redirect:/admin/user/changePwdView.do?", "result", true);
		return new ModelAndView("/admin/user/main");
	}
	
	public static String SHA(String sVal,String sEncryptionName){
		String sMsg="";
		System.out.println("sVal: " + sVal);
		try{
			MessageDigest sh=MessageDigest.getInstance(sEncryptionName);
			sh.update(sVal.getBytes());
			byte byteData[]=sh.digest();
			StringBuffer sb = new StringBuffer();
			
			for(int i=0; i<byteData.length;i++){
				sb.append(Integer.toString((byteData[i]&0xff)+0x100,16).substring(1));
			}
			
			sMsg=sb.toString();
		}catch(NoSuchAlgorithmException e){
			e.printStackTrace();
			sMsg = null;
		}
		return sMsg;
	}
	
	public ModelAndView insarangKey(HttpServletRequest request, HttpServletResponse response) throws Exception {
		return new ModelAndView("/menu/top/getInsarangKey");
	}	
}