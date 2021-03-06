package main.java.jumyong.minwon.web;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import main.java.common.util.catUtil.Util;
import main.java.jumyong.minwon.model.AppealBean;
import _212._147._46._10.stmr.websvc.ws.SOWNN00245.wsdl.RequestType;
import _212._147._46._10.stmr.websvc.ws.SOWNN00245.wsdl.RequestTypeDATA;
import _212._147._46._10.stmr.websvc.ws.SOWNN00245.wsdl.RequestTypeDATAMessage;
import _212._147._46._10.stmr.websvc.ws.SOWNN00245.wsdl.RequestTypeDATAMessageBody;
import _212._147._46._10.stmr.websvc.ws.SOWNN00245.wsdl.ResponseType;
import _212._147._46._10.stmr.websvc.ws.SOWNN00245.wsdl.ResponseTypeDATA;
import _212._147._46._10.stmr.websvc.ws.SOWNN00245.wsdl.ResponseTypeDATAMessage;
import _212._147._46._10.stmr.websvc.ws.SOWNN00245.wsdl.ResponseTypeDATAMessageBodyList;
import _212._147._46._10.stmr.websvc.ws.SOWNN00245.wsdl.SOWNN00245PortTypeProxy;

public class SOWNN00214Control{

	public	int		_Size	= 0;
	
	/**
	 * 새올에 있는 데이터를 리스트로 가져온다.
	 * @param in_take_symd
	 * @param in_take_eymd
	 * @param mw_aplct_nm
	 * @param currentPage
	 * @param maxCount
	 * @param SAEALL_IP
	 * @param SAEALL_PATH
	 * @param SAEALL_PORT
	 * @param DEPT
	 * @param ORG
	 * @return
	 * @throws Exception
	 */
	public List<AppealBean>	SaewolList(String in_take_symd, String in_take_eymd, String mw_aplct_nm, int currentPage, int maxCount, String SAEALL_IP, String SAEALL_PATH, String SAEALL_PORT, String DEPT, String ORG) throws Exception
//	public List	SaewolList(String in_take_symd, String in_take_eymd, String in_mw_take_no, String mw_aplct_nm, int currentPage, int maxCount) throws Exception 
	{
		
		_Size	= 0;
		
		Util		util	= new Util();
		
		/* [20130510] yjmoon use generic */ 
		List<AppealBean> list = new ArrayList<AppealBean>();
		AppealBean	Bean	= new AppealBean();
		
		int		startCount	= (currentPage - 1) * maxCount;
		int		endCount	= startCount + maxCount;
	
		//요청 클라이언트로 부터 얻는 매개변수
		String mSGKEY_1id = "200908171327233412512598742";
//		String mSGKEY_1id = "";
		String rESULTCODE_2id = "000";//요청시 000 응답시 200
//		String oRGCD_3id = "3010000";
		String oRGCD_3id = ORG;
//		String in_take_cgg_code_7id = "3010000"; //시군구코드 (샘플로 중구)
		String in_take_cgg_code_7id = ORG; //시군구코드 (샘플로 중구)
		String in_take_eymd_8id = in_take_eymd;
//		String in_condition_9id = "t1.main_deal_dep_code=30100780000";  //부서코드의 것만 가지고 오기 위함
		String in_condition_9id = "t1.main_deal_dep_code=" + DEPT + "0000"; //부서코드의 것만 가지고 오기 위함
		String in_mw_se_10id = "";
		String in_condition2_11id = "";
		String in_mw_aplr_nm_12id = mw_aplct_nm;
		String in_take_symd_13id = in_take_symd;
//		String in_take_dep_code_14id = "30100780000";//중구 건설관리과 11자리 
		String in_take_dep_code_14id = DEPT + "0000"; 
		String in_mw_take_no_15id = "";//in_mw_take_no;
		String iFID_16id = "SOWNN00214";
		//System.out.println("Param:" + SAEALL_IP + SAEALL_PORT + SAEALL_PATH + DEPT + ORG);
		//System.out.println("0000000000000000000000000");
//		add.... kdy..
		
		String serviceURL = "http://" + SAEALL_IP + ":" + SAEALL_PORT + SAEALL_PATH;  
		//System.out.println("serviceURL=" + serviceURL);
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
	        
			System.out.println(" SaewolList LOADING..");
			
			ResponseType SOWNN002142mtemp = sOWNN00245PortTypeProxy.SOWNN00214(requestType);
			
			System.out.println(" SaewolList OK !!");
			
			if(SOWNN002142mtemp != null)
			{
				ResponseTypeDATA tebece0	= SOWNN002142mtemp.getDATA();
				
				if(tebece0 != null)
				{
					ResponseTypeDATAMessage tebece1 = tebece0.getMessage();
				
					if(tebece1 != null)
					{
						typebody15	= tebece1.getBody().getList();
						
						if (typebody15 != null) { /* [20130510] yjmoon NullPointerException 발생 */
							/* [20130510] yjmoon use generic */
							List<ResponseTypeDATAMessageBodyList>	listbody15	= Arrays.asList(typebody15);
							ResponseTypeDATAMessageBodyList	li	= null;
						
							try
							{	
								_Size	= listbody15.size();
							
								for(int i = startCount	;	i < endCount	;	i++)
								{
									if(i >= _Size)
										break;
								
									Bean	= new AppealBean();
								
									li	= listbody15.get(i);
								
									//	System.out.println(i + ". " + li.getMw_take_no());
																
									Bean.setADMIN_NO(li.getMw_take_no());
									Bean.setRN(String.valueOf(i + 1));
									Bean.setREQ_NO(li.getMw_take_no());	//	접수번호
									Bean.setREQ_NM(li.getUser_name());	//	접수자명
									Bean.setGUBUN(li.getMw_code_cn());	//	민원구분명
									Bean.setNAME(li.getMw_aplct_nm());	//	민원인명
									/* [20130510] yjmoon use generic */
									List<String> cut_list = util.StringToken_Two(li.getMw_afr_shtnm());
									Bean.setNOTES(cut_list.get(0).toString());	//	민원요지
									Bean.setREQ_DATE(util.Date_Paste(li.getTake_ymd()));	//	접수일자
									Bean.setREQ_CK(li.getTake_confrm_code());	//	접수확인
									Bean.setTODATE(util.Date_Paste(li.getReal_deal_ymd()));	//	처리일자
									Bean.setYN(li.getDeal_code_cn());	//	처리확인
									Bean.setMANAGER(li.getOutvars());	//	담당자
								
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
								/* [20130509] yjmoon listbody15 is fixed-size list.
								 * can't add, remove, clear operation
								 * java.lang.UnsupportedOperationException
								 **/
//								listbody15.clear();
								listbody15	= null;
							}
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
			e.printStackTrace();
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