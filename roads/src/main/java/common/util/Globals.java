/*********************************************************************************************************
 				*최초작성일 : 2006.06.
				*최초작성자 : 이준형
				*주요처리내용 : 시스템을 시작할때 초기값을 셋팅한다.
				*수정일 :
				*수정자 :
				*수정내용 :
 *********************************************************************************************************/


package main.java.common.util;

import java.util.Properties;
import java.io.InputStream;
import org.springframework.context.support.MessageSourceAccessor;

public class Globals { 
	
	private MessageSourceAccessor msAccessor = null;
	
	public void setMessageSourceAccessor(MessageSourceAccessor msAccessor) {
		this.msAccessor = msAccessor;
	}
	
	public String getMessage(String strKey){
		return msAccessor.getMessage(strKey);
	}

	//서버설정	
	
	
	//세외수입 FTP 주소
	public static final  String TAX_FTP_HOST = "98.33.1.157";
	public static final  String TAX_FTP_PORT = "21";
	public static final  String TAX_FTP_ID = "sn_roads";
	public static final  String TAX_FTP_PWD = "roads123";
	
	public static final String CHARSET = "euc-kr";

	//JDBC 환경설정
	public static final  String JDBCENVIRONMENT_EXPORTNAME = "dbsource";
	
	//통합센터 JDBC 환경설정
	public static final String UNITYJDBCENVIRONMENT_EXPORTNAME = "unity_db";
	
	//파일관련 환경설정
	public static final String FILEDIRINFO_SERVER_ROOT = "/src/rnic/upload/";
	
    public static final String[] FILEDIRINFO_DIR_NAME = {
		"bltnBody",
		"bltnAttach",
		"DAT_DOC",
		"NTC_DOC"};

    public static final  String FILEUPLOADPATH		=	"/src/rnic/upload/";
    public static final  String MAPFILEUPLOADPATH	=	"/src/rnic/WebContent/map/";
    
	public static final  String IMAGEFILEUPLOADPATH	=	"E:/roads/road/";
	public static final  String IMAGEFILEUPLOADPATH_GAPAN	=	"E:/roads/gapan/";
	public static final  String IMAGEFILEUPLOADPATH_ROJUM	=	"E:/roads/gapan/";
	public static final  String FILE_MAIL_TEMPLATE	=	"/src/rnic/WebContent/jsp/common/mailTemplate.htm";
	public static final  String IMAGEFILEPATH		=   "/roadsnas/gapan/";
	
	public static final  String SUNAPLOGPATH			=   "/roadsnas/sunap/";
	public static final  String SUNAPLOGUPLOADPATH		=   "E:/roads/sunap/";
	
	public final static String FILEPATH_UP = "D:/workspace/roads/WebContent/mdb_up/";
	public final static String FILEPATH_DOWN ="D:/workspace/roads/WebContent/mdb/";
	
	//게시판 관련 환경설정
	//게시판 default현재페이지
	public static final String DEFAULT_CURRENT_PAGE = "1"; 	

	//게시판 페이지당 보여줄 게시물 수
	public static final String	DEFAULT_COUNTPER_PAGE				= "10";
	public static final String	BRAND_COUNTPER_PAGE					= "20";
	public static final String	VOD_COUNTPER_PAGE					= "6";
	public static final String	MAIN_COUNTPER_PAGE					= "4";		// 메인 페이지에서 보여줄 공지사항 리스트 갯수
	public static final String	SHORTCUT_POSITION_COUNT_PER_PAGE	= "12";		// 최단거리 검색시 지점 검색 리스트 갯수
	public static final int		INT_PAGE_GROUP_CNT_IN_MAP 			= 5;
	
	public static final String NOTIFICATION_NUM			= "TN_SGBE72";		// 새주소고시
	public static final String POLICYLAW_NUM			= "TN_SGBE74";		// 법령정보
	public static final String OpenArchives_NUM 		= "TN_SGBE76";		// 자료실
	public static final String AdminArchives_NUM 		= "TN_SGBE87";		// 뉴 자료실
	//public static final String REPORT_NUM	= "08";							// 보도자료
	public static final String DBREQUEST_NUM			= "TN_SCBE68";		// 새지도사용신청
	public static final String QABOARD_NUM				= "TN_SGBE73";		// QABoard
	public static final String FAQBOARD_NUM				= "TN_SGBE86";		// QABoard
	public static final String OPINIONBOARD_NUM			= "TN_SCBE62";		// 의견나누기
	public static final String  NOTICE_NUM				= "TN_SGBE75";		// 공지사항 게시판
	public static final String  LOCATION_REGISTER_NUM	= "TN_SGBE77";		// 위치정보등록 
	public static final String  VODBOARD_NUM			= "TN_SGBE50";		// 홍보도우미 동영상
	public static final String  ADMINBOARD_NUM			= "TN_SGBE82";		// 헬프데스크
	public static final String  MAPMODIFY_NUM			= "TN_SGBE81";		// 지도오류신청
	
	public static final String USERTYPE_MEMBER 			= "1";		//일반기업사용자
	public static final String USERTYPE_WEB_ADMIN 		= "2";		//포탈관리자
	public static final String USERTYPE_BS_ADMIN_CITY 	= "3";		//시도관리자
	public static final String USERTYPE_BS_ADMIN_COUNTY = "4";		//시군구관리자
	public static final String USERTYPE_BS_ADMIN_USER 	= "5";		//지자체일반사용자
	public static final String USERTYPE_BS_ADMIN_EXCEPT = "6";		//구제시관리자
	
	public static final String USER_MOGAHA_ID = "bberlbberl";		//행자부 아이디
	public static final String USER_ADMIN_ID = "ksicrn2006";		//최고관리자 아이디
	
	public static final String MSG_LOGIN_INVALID_USER 			= "잘못된 로그인 정보입니다.";
	public static final String MSG_LOGIN_INVALID_PASSWORD 		= "잘못된 로그인 정보입니다.";
	public static final String MSG_LOGIN_INVALID_CERTIFICATION 	= "잘못된 로그인 정보입니다.";
	public static final String MSG_USER_REGIST_SUCCESS 			= "가입되셨습니다.\\n \\n 인증처리 후 로그인하실 수 있습니다.\\n (인증은 2-3일 소요 될 수 있습니다.)";
	public static final String MSG_USER_REGIST_FAIL 			= "가입처리가 처리되지 않았습니다";
	public static final String MSG_IDENTIFICATION_FAIL 			= "인증되지 않았습니다";
	public static final String MSG_LOGIN_SUCCESS				= "님 입장하셨습니다.";	
	public static final String MSG_MAPMODIFY_SUCCESS			= "님의 요청이 처리되었습니다.";
	public static final String MSG_PAGE_NOT_FOUND				= "페이지가 존재하지 않습니다.";	
	
	public static final String INFO_TYPE_MAP	="1";				//새주소제공-전자지도제공
	public static final String INFO_TYPE_ADDRESS="2";				//새주소제공-새주소제공
	
	public static final String SEARCH_TYPE_ROAD_NAME="NORMAL1";		//검색타입 새주소
	public static final String SEARCH_TYPE_TOWN_NAME="NORMAL2";		//검색타입 지번주소
	public static final String SEARCH_TYPE_BUILDING_NAME="NORMAL3";	//검색타입 건물명칭
	public static final String SEARCH_TYPE_TEL_NUMBER="NORMAL4";	//검색타입 전화번호
	public static final String SEARCH_TYPE_LIVING="LIVING";			//생활정보검색
	public static final String SEARCH_TYPE_EMERGENCY="EMERGENCY";	//응급의료검색
	public static final String SEARCH_TYPE_SHORTCUT="SHORTCUT";		//최단거리검색	
	
	public static final String WEB_CS_SE = "W";		// 건물상가정보.시스템구분-웹
	
	//public static final String MAIL_SERVER_ADDRESS = "192.168.1.13";
	public static final String MAIL_SENDER_ADDRESS 	= "webmaster@juso.go.kr";
	public static final String MAIL_SENDER_NAME 	= "새주소안내";
	
	//public static final String MAIL_CONTENT_MEMBER_INFO = "";
	
	public static final String MSG_ERROR_EMAIL 			= "E-mail전송을 실패했습니다<br/>관리자에게 문의하시기 바랍니다.";
	public static final String MSG_ERROR_IDPWD_CHECK 	= "입력하신 내용으로 등록된 회원정보가 없습니다.";
	public static final String MSG_MAILPAGE_SUBJECT		= "건물/상가정보가 입력되었습니다.";
	public static final String MSG_MAILPAGE_CONTENT		= "사용자가 건물/상가정보를 입력요청 하였습니다.\\n 확인 바랍니다.";
	public static final String MSG_MAILPAGE_Map_SUBJECT		= "지도오류신청이 입력되었습니다.";
	public static final String MSG_MAILPAGE_Map_CONTENT		= "사용자가 지도오류 신청을 등록 하였습니다.\\n 확인 바랍니다.";
	
	public static final String LANGUAGE_ENGLISH 		= "ENGLISH";
	public static final String LANGUAGE_DEFAULT 		= "KOREAN";
	


}

