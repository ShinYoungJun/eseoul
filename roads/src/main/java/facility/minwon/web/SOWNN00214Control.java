package main.java.facility.minwon.web;

import java.util.*;

import main.java.common.util.catUtil.Util;
import main.java.facility.minwon.model.AppealBean;

import _212._147._46._10.stmr.websvc.ws.SOWNN00245.wsdl.RequestType;
import _212._147._46._10.stmr.websvc.ws.SOWNN00245.wsdl.RequestTypeDATA;
import _212._147._46._10.stmr.websvc.ws.SOWNN00245.wsdl.RequestTypeDATAMessage;
import _212._147._46._10.stmr.websvc.ws.SOWNN00245.wsdl.RequestTypeDATAMessageBody;
import _212._147._46._10.stmr.websvc.ws.SOWNN00245.wsdl.ResponseType;
import _212._147._46._10.stmr.websvc.ws.SOWNN00245.wsdl.ResponseTypeDATA;
import _212._147._46._10.stmr.websvc.ws.SOWNN00245.wsdl.ResponseTypeDATAMessage;
import _212._147._46._10.stmr.websvc.ws.SOWNN00245.wsdl.ResponseTypeDATAMessageBody;
import _212._147._46._10.stmr.websvc.ws.SOWNN00245.wsdl.ResponseTypeDATAMessageBodyList;
import _212._147._46._10.stmr.websvc.ws.SOWNN00245.wsdl.SOWNN00245PortTypeProxy;

public class SOWNN00214Control{

	public	int		_Size	= 0;
	
	//	���ÿ� �ִ� �����͸� ����Ʈ�� �����´�
	 public List	SaewolList(String in_take_symd, String in_take_eymd, String mw_aplct_nm, int currentPage, int maxCount, String SAEALL_IP, String SAEALL_PATH, String SAEALL_PORT, String DEPT, String ORG) throws Exception
	{
		
		_Size	= 0;
		
		Util		util	= new Util();
		
		List		list	= new ArrayList();
		AppealBean	Bean	= new AppealBean();
		
		int		startCount	= (currentPage - 1) * maxCount;
		int		endCount	= startCount + maxCount;
	
		//��û Ŭ���̾�Ʈ�� ���� ��� �Ű�����
		String mSGKEY_1id = "";
		String rESULTCODE_2id = "000";//��û�� 000 ����� 200
//		String oRGCD_3id = "3010000";
		String oRGCD_3id = ORG;
//		String in_take_cgg_code_7id = "3010000"; //�ñ����ڵ� (���÷� �߱�)
		String in_take_cgg_code_7id = ORG; //�ñ����ڵ� (���÷� �߱�)
		String in_take_eymd_8id = in_take_eymd;
//		String in_condition_9id = "t1.main_deal_dep_code=30100780000";  //�μ��ڵ��� �͸� ������ ���� ����
		String in_condition_9id = "t1.main_deal_dep_code=" + DEPT + "0000"; //�μ��ڵ��� �͸� ������ ���� ����
		String in_mw_se_10id = "";
		String in_condition2_11id = "";
		String in_mw_aplr_nm_12id = mw_aplct_nm;
		String in_take_symd_13id = in_take_symd;
//		String in_take_dep_code_14id = "30100780000";//�߱� �Ǽ������� 11�ڸ� 
		String in_take_dep_code_14id = DEPT + "0000"; 
		String in_mw_take_no_15id = "";//in_mw_take_no;
		String iFID_16id = "SOWNN00214";
//		System.out.println("Param:" + SAEALL_IP + SAEALL_PORT + SAEALL_PATH + DEPT + ORG);
		
//		add.... kdy..
		
		String serviceURL = "http://" + SAEALL_IP + ":" + SAEALL_PORT + SAEALL_PATH;  
//		System.out.println("serviceURL=" + serviceURL);
//		String serviceURL = "http://10.46.147.212.:3100/stmr/websvc/ws";	//kdy 09.07.30
//		String serviceURL = "http://98.2.9.22:3100/stmr/websvc/ws";	
		RequestTypeDATAMessageBody requestTypeDATAMessageBody = new RequestTypeDATAMessageBody();
		RequestTypeDATAMessage requestTypeDATAMessage = new RequestTypeDATAMessage();
		RequestTypeDATA requestTypeDATA = new RequestTypeDATA();
		RequestType requestType = new RequestType();
		
		SOWNN00245PortTypeProxy sOWNN00245PortTypeProxy = new SOWNN00245PortTypeProxy(serviceURL);
		
		ResponseTypeDATAMessageBodyList typebody15[] = {};
		
		
		try{
			requestTypeDATAMessageBody.setIn_take_cgg_code(in_take_cgg_code_7id);
			requestTypeDATAMessageBody.setIn_take_eymd(in_take_eymd_8id);
			requestTypeDATAMessageBody.setIn_condition(in_condition_9id);
			requestTypeDATAMessageBody.setIn_mw_se(in_mw_se_10id);
			requestTypeDATAMessageBody.setIn_condition2(in_condition2_11id);
			requestTypeDATAMessageBody.setIn_mw_aplr_nm(in_mw_aplr_nm_12id);
			requestTypeDATAMessageBody.setIn_take_symd(in_take_symd_13id);
			requestTypeDATAMessageBody.setIn_take_dep_code(in_take_dep_code_14id);
			requestTypeDATAMessageBody.setIn_mw_take_no(in_mw_take_no_15id);
			
			requestTypeDATAMessage.setBody(requestTypeDATAMessageBody);
			
			requestTypeDATA.setMessage(requestTypeDATAMessage);
			
			requestType.setMSGKEY(mSGKEY_1id);
			requestType.setRESULTCODE(rESULTCODE_2id);
			requestType.setORGCD(oRGCD_3id);
			requestType.setDATA(requestTypeDATA);
			requestType.setIFID(iFID_16id);
	        
//			System.out.println(" SaewolList LOADING..");
			
			ResponseType SOWNN002142mtemp = sOWNN00245PortTypeProxy.SOWNN00214(requestType);
			
//			System.out.println(" SaewolList OK !!");
			
			if(SOWNN002142mtemp != null)
			{
				ResponseTypeDATA tebece0	= SOWNN002142mtemp.getDATA();
				
				if(tebece0 != null)
				{
					ResponseTypeDATAMessage tebece1 = tebece0.getMessage();
				
					if(tebece1 != null)
					{
						typebody15	= tebece1.getBody().getList();
						
							List	listbody15	= Arrays.asList(typebody15);
							ResponseTypeDATAMessageBodyList	li	= null;
						
							try
							{	
								_Size	= listbody15.size();
							
								for(int i = startCount	;	i < endCount	;	i++)
								{
									if(i >= _Size)
										break;
								
									Bean	= new AppealBean();
								
									li	= (ResponseTypeDATAMessageBodyList)listbody15.get(i);
								
									//	System.out.println(i + ". " + li.getMw_take_no());
																
									Bean.setADMIN_NO(li.getMw_take_no());
									Bean.setRN(String.valueOf(i + 1));
									Bean.setREQ_NO(li.getMw_take_no());	//	������ȣ
									Bean.setREQ_NM(li.getUser_name());	//	�����ڸ�
									Bean.setGUBUN(li.getMw_code_cn());	//	�ο����и�
									Bean.setNAME(li.getMw_aplct_nm());	//	�ο��θ�
									List cut_list = util.StringToken_Two(li.getMw_afr_shtnm());
									Bean.setNOTES(cut_list.get(0).toString());	//	�ο�����
									Bean.setREQ_DATE(util.Date_Paste(li.getTake_ymd()));	//	��������
									Bean.setREQ_CK(li.getTake_confrm_code());	//	����Ȯ��
									Bean.setTODATE(util.Date_Paste(li.getReal_deal_ymd()));	//	ó������
									Bean.setYN(li.getDeal_code_cn());	//	ó��Ȯ��
									Bean.setMANAGER(li.getOutvars());	//	�����
									
									System.out.println("=====================");
									System.out.println(Bean.getADMIN_NO());
									System.out.println(Bean.getRN());
									System.out.println(Bean.getREQ_NO());	//	������ȣ
									System.out.println(Bean.getREQ_NM());	//	�����ڸ�
									System.out.println(Bean.getGUBUN());	//	�ο����и�
									System.out.println(Bean.getNAME());	//	�ο��θ�
									System.out.println(Bean.getNOTES());	//	�ο�����
									System.out.println(Bean.getREQ_DATE());	//	��������
									System.out.println(Bean.getREQ_CK());	//	����Ȯ��
									System.out.println(Bean.getTODATE());	//	ó������
									System.out.println(Bean.getYN());	//	ó��Ȯ��
									System.out.println(Bean.getMANAGER());	//	�����
									System.out.println("=====================");
									
								
									list.add(Bean);
								}
							}
							catch(Exception e)
							{
								e.printStackTrace();
								System.out.println("error:" + e.toString());
							}
							finally
							{
								listbody15.clear();
								listbody15	= null;
							}
							
							
							
					}
					tebece1	= null;
				}
			}
		}
		catch(Exception e)
		{
			System.out.println(" SaewolList ERROR !!");
			
			String errReason = e.toString();
			System.out.println(errReason);
		}
		finally
		{
			Bean		= null;
			util		= null;
			typebody15	= null;
			sOWNN00245PortTypeProxy	= null;
			requestType				= null;
			requestTypeDATA			= null;
			requestTypeDATAMessage		= null;
			requestTypeDATAMessageBody	= null;
			
			System.runFinalization();
			System.gc();
		}
		
		return	list;//new ModelAndView("/sampleSOWNN00214PortTypeProxy/testOutput", "list", typebody15);
	}
}