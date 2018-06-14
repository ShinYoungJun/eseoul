/*********************************************************************************************************
 				*�����ۼ��� : 2006.06.
				*�����ۼ��� : ������
				*�ֿ�ó������ : �ý����� �����Ҷ� �ʱⰪ�� �����Ѵ�.
				*������ :
				*������ :
				*�������� :
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

	//��������	
	
	
	//���ܼ��� FTP �ּ�
	public static final  String TAX_FTP_HOST = "98.33.1.157";
	public static final  String TAX_FTP_PORT = "21";
	public static final  String TAX_FTP_ID = "sn_roads";
	public static final  String TAX_FTP_PWD = "roads123";
	
	public static final String CHARSET = "euc-kr";

	//JDBC ȯ�漳��
	public static final  String JDBCENVIRONMENT_EXPORTNAME = "dbsource";
	
	//���ռ��� JDBC ȯ�漳��
	public static final String UNITYJDBCENVIRONMENT_EXPORTNAME = "unity_db";
	
	//���ϰ��� ȯ�漳��
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
	
	//�Խ��� ���� ȯ�漳��
	//�Խ��� default����������
	public static final String DEFAULT_CURRENT_PAGE = "1"; 	

	//�Խ��� �������� ������ �Խù� ��
	public static final String	DEFAULT_COUNTPER_PAGE				= "10";
	public static final String	BRAND_COUNTPER_PAGE					= "20";
	public static final String	VOD_COUNTPER_PAGE					= "6";
	public static final String	MAIN_COUNTPER_PAGE					= "4";		// ���� ���������� ������ �������� ����Ʈ ����
	public static final String	SHORTCUT_POSITION_COUNT_PER_PAGE	= "12";		// �ִܰŸ� �˻��� ���� �˻� ����Ʈ ����
	public static final int		INT_PAGE_GROUP_CNT_IN_MAP 			= 5;
	
	public static final String NOTIFICATION_NUM			= "TN_SGBE72";		// ���ּҰ���
	public static final String POLICYLAW_NUM			= "TN_SGBE74";		// ��������
	public static final String OpenArchives_NUM 		= "TN_SGBE76";		// �ڷ��
	public static final String AdminArchives_NUM 		= "TN_SGBE87";		// �� �ڷ��
	//public static final String REPORT_NUM	= "08";							// �����ڷ�
	public static final String DBREQUEST_NUM			= "TN_SCBE68";		// ����������û
	public static final String QABOARD_NUM				= "TN_SGBE73";		// QABoard
	public static final String FAQBOARD_NUM				= "TN_SGBE86";		// QABoard
	public static final String OPINIONBOARD_NUM			= "TN_SCBE62";		// �ǰ߳�����
	public static final String  NOTICE_NUM				= "TN_SGBE75";		// �������� �Խ���
	public static final String  LOCATION_REGISTER_NUM	= "TN_SGBE77";		// ��ġ������� 
	public static final String  VODBOARD_NUM			= "TN_SGBE50";		// ȫ������� ������
	public static final String  ADMINBOARD_NUM			= "TN_SGBE82";		// ��������ũ
	public static final String  MAPMODIFY_NUM			= "TN_SGBE81";		// ����������û
	
	public static final String USERTYPE_MEMBER 			= "1";		//�Ϲݱ�������
	public static final String USERTYPE_WEB_ADMIN 		= "2";		//��Ż������
	public static final String USERTYPE_BS_ADMIN_CITY 	= "3";		//�õ�������
	public static final String USERTYPE_BS_ADMIN_COUNTY = "4";		//�ñ���������
	public static final String USERTYPE_BS_ADMIN_USER 	= "5";		//����ü�Ϲݻ����
	public static final String USERTYPE_BS_ADMIN_EXCEPT = "6";		//�����ð�����
	
	public static final String USER_MOGAHA_ID = "bberlbberl";		//���ں� ���̵�
	public static final String USER_ADMIN_ID = "ksicrn2006";		//�ְ������� ���̵�
	
	public static final String MSG_LOGIN_INVALID_USER 			= "�߸��� �α��� �����Դϴ�.";
	public static final String MSG_LOGIN_INVALID_PASSWORD 		= "�߸��� �α��� �����Դϴ�.";
	public static final String MSG_LOGIN_INVALID_CERTIFICATION 	= "�߸��� �α��� �����Դϴ�.";
	public static final String MSG_USER_REGIST_SUCCESS 			= "���ԵǼ̽��ϴ�.\\n \\n ����ó�� �� �α����Ͻ� �� �ֽ��ϴ�.\\n (������ 2-3�� �ҿ� �� �� �ֽ��ϴ�.)";
	public static final String MSG_USER_REGIST_FAIL 			= "����ó���� ó������ �ʾҽ��ϴ�";
	public static final String MSG_IDENTIFICATION_FAIL 			= "�������� �ʾҽ��ϴ�";
	public static final String MSG_LOGIN_SUCCESS				= "�� �����ϼ̽��ϴ�.";	
	public static final String MSG_MAPMODIFY_SUCCESS			= "���� ��û�� ó���Ǿ����ϴ�.";
	public static final String MSG_PAGE_NOT_FOUND				= "�������� �������� �ʽ��ϴ�.";	
	
	public static final String INFO_TYPE_MAP	="1";				//���ּ�����-������������
	public static final String INFO_TYPE_ADDRESS="2";				//���ּ�����-���ּ�����
	
	public static final String SEARCH_TYPE_ROAD_NAME="NORMAL1";		//�˻�Ÿ�� ���ּ�
	public static final String SEARCH_TYPE_TOWN_NAME="NORMAL2";		//�˻�Ÿ�� �����ּ�
	public static final String SEARCH_TYPE_BUILDING_NAME="NORMAL3";	//�˻�Ÿ�� �ǹ���Ī
	public static final String SEARCH_TYPE_TEL_NUMBER="NORMAL4";	//�˻�Ÿ�� ��ȭ��ȣ
	public static final String SEARCH_TYPE_LIVING="LIVING";			//��Ȱ�����˻�
	public static final String SEARCH_TYPE_EMERGENCY="EMERGENCY";	//�����Ƿ�˻�
	public static final String SEARCH_TYPE_SHORTCUT="SHORTCUT";		//�ִܰŸ��˻�	
	
	public static final String WEB_CS_SE = "W";		// �ǹ�������.�ý��۱���-��
	
	//public static final String MAIL_SERVER_ADDRESS = "192.168.1.13";
	public static final String MAIL_SENDER_ADDRESS 	= "webmaster@juso.go.kr";
	public static final String MAIL_SENDER_NAME 	= "���ּҾȳ�";
	
	//public static final String MAIL_CONTENT_MEMBER_INFO = "";
	
	public static final String MSG_ERROR_EMAIL 			= "E-mail������ �����߽��ϴ�<br/>�����ڿ��� �����Ͻñ� �ٶ��ϴ�.";
	public static final String MSG_ERROR_IDPWD_CHECK 	= "�Է��Ͻ� �������� ��ϵ� ȸ�������� �����ϴ�.";
	public static final String MSG_MAILPAGE_SUBJECT		= "�ǹ�/�������� �ԷµǾ����ϴ�.";
	public static final String MSG_MAILPAGE_CONTENT		= "����ڰ� �ǹ�/�������� �Է¿�û �Ͽ����ϴ�.\\n Ȯ�� �ٶ��ϴ�.";
	public static final String MSG_MAILPAGE_Map_SUBJECT		= "����������û�� �ԷµǾ����ϴ�.";
	public static final String MSG_MAILPAGE_Map_CONTENT		= "����ڰ� �������� ��û�� ��� �Ͽ����ϴ�.\\n Ȯ�� �ٶ��ϴ�.";
	
	public static final String LANGUAGE_ENGLISH 		= "ENGLISH";
	public static final String LANGUAGE_DEFAULT 		= "KOREAN";
	


}
