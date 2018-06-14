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
	 * 사용자리스트 조회 (login 안한상태에 보이는 리스트)
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
				
				//	세션에서 시도 코드를 가져온다.
				String	SIDO_CD	= util.getSidoCode(getMessageSourceAccessor());
				
				//	관리자 데이터를 가져온다.
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
				
				request.setAttribute("userGrade", commonCode.executeCommonCode("user_grade", userGrade, "전체"));	
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
   	 * USER_INFO 상세 내용을 조회 
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
   	 * 등급별 메뉴권한 조회 
 	 * @param HttpServletRequest request 
 	 * @param HttpServletResponse response
	 * @return ModelAndView
	 */
	/*
	 메뉴가 7개가 있으면 각메뉴당 1에서 7까지를 2의 제곱을 해서
	 예) 1    2    3    4    5    6    7   --> 메뉴번호
	    2    4    8    16   32   64   128 --> 제곱값
	    2^1	 2^2  2^3  2^4  2^5  2^6  2^7
	이렇게 구한다.
	그 다음 해당 메뉴에 권한이 있다면    메뉴번호의 제곱값을 각각 더한다.
	만약 1, 4, 6번의 메뉴번호를 체크 한다면 그에 제곱값 2+16+64를 더한값 82가 나오는데
	이 값은 User_code 테이블의 해당 아이디의 grade_menu값에 저장된걸 가져온다.
	가져온 값을 위의 방식의 반대로 해서 
	즉, 82의 값을 가져왔는데 메뉴번호의 가장 큰값에서부터  가져와 그 제곱값을 뺀다
	그래서 그값이 0보다 작다면 그메뉴는 체크 되지 않는걸로 인식하고 뺀값을 더한다.
	위 방식을 계속하다 0보다 큰값이 나오면 그 메뉴번호는 체크된 걸로 인식한다.
	해서 뺀값을 점점 제곱값으로 빼다가 0이 나오면 메뉴의 체크된 여부를 알수 있다.
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
		System.out.println("컨트롤 등급="+userGrade);
		List info = objUserRegService.userAuthorityList();
		List info2 = new ArrayList();
		request.setAttribute("listSize",String.valueOf(info.size()));
		UserRegBean bean = new UserRegBean();
		
		int square = 1;		//제곱근값 변수
		for(int i = 0	;	i < info.size()	;	i++)
		{
			bean	= (UserRegBean)info.get(i);
			
			for(int j=0; j < Integer.parseInt(bean.getMENU_CD());j++){		//해당메뉴 번호의 2제곱값을 구한다.
				square =  square*2;
			}
			
			grade_menu = grade_menu - square;
			

			if(grade_menu>=0){  	//제곱값을 뺀 grade_menu값이 0보다 작은지 여부를 본다
				bean.setCHK("1");	//0보다 크기 때문에 해당 메뉴는 체크 됨을 알수 있다.
			}else{				
				bean.setCHK("0");
				grade_menu = grade_menu + square;
			}
			info2.add(i, bean);
			square = 1;		//해당 메뉴값을 다시 쓰기 위해 초기화 한다.
									
		}
		
		System.out.println("info2:"+info2);
		return new ModelAndView("/admin/user/userAuthorityPop", "authorityList", info2);
	}	
		
   	/**
   	 * 구코드 조회
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
   	 * 부서코드 조회
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
   	 * login처리
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
		
		//공지사항 조회
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
	
		// 로그인 전 메뉴로 이동. 전 메뉴가 없으면 메인페이지로 온다
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
			
			// 등록된 사용자가 아님
			if(objUserRegBean == null){
				
				return new ModelAndView("redirect:/rams/admin/user/login.do?message="+"존재하지 않는 ID입니다");
			}
			// 인증되지 않음     
			else if(objUserRegBean.getAPPROVAL_DATE() == null){
				
				return new ModelAndView("redirect:/rams/admin/user/login.do?message="+"인증되지 않았습니다.");
			}
			// password불일치
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
						model = new ModelAndView("redirect:/rams/admin/user/login.do?message="+"패스워드를 확인하시기 바랍니다.(" + pwcount + "회 실패)");						
					}else{
						model = new ModelAndView("redirect:/rams/admin/user/login.do?message="+"패스워드 5회 이상 실패. 070-8889-3275 또는 02-2133-8133로 문의.");
					}
				}else if(pwcount >= 5){
					System.out.println("로그인불가");
					model = new ModelAndView("redirect:/rams/admin/user/login.do?message="+"패스워드 5회 이상 실패. 070-8889-3275 또는 02-2133-8133로 문의.");
				}
				
				return model;
			}
			// 로그인 성공
			else{
				
				//String[][] location = new String[26][5];
				
				pwcount = objUserRegService.getPwNum(strUserId);
				if(pwcount > 0 && pwcount < 5){
					objUserRegService.setPwNum(strUserId, 0);
				}else if(pwcount == 5 ){
					System.out.println("로그인불가");
					return new ModelAndView("redirect:/rams/admin/user/login.do?message="+"패스워드 5회 이상 실패. 070-8889-3275 또는 02-2133-8133로 문의.");
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
				diff = diff / (24*60*60*1000); // 24(시간)*60(분)*60(초)*1000(1000분의1)
				if(diff >= 183){
					System.out.println(diff + "  비밀번호 변경일이 6개월 이상입니다.");
				}
				objUserRegService.setLoginDate(today, strUserId);	//로그인 한 데이터 세팅
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
			
			/*arr[][0] : 구코드 
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
				
				// 세션에 로긴 정보 등록 후 지정된 페이지로 이동
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
				
				//개인인증 정보가 있을경우 세션에서 삭제한다
				//session.removeAttribute("sessionUserId");
					
				return new ModelAndView("/admin/user/main");
			}	
		}
	}
	
	/**
   	 * logout처리
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
     * 메인 페이지 오픈시 공지사항 popup 수행
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
   	 * simple 유저 정보 조회 
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
				System.out.println("여기까지~" + currentPW + "else");
			}
		}else{
			System.out.println("널...!!!!!!");
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