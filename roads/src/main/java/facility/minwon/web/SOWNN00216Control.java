package main.java.facility.minwon.web;

import java.util.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import main.java.common.util.catUtil.Util;

import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import _212._147._46._10.stmr.websvc.ws.SOWNN00247.wsdl.*;



public class SOWNN00216Control extends MultiActionController
{
	
	public	void	SaewolView(String in_mw_take_no, HttpServletRequest request, String SAEALL_IP, String SAEALL_PATH, String SAEALL_PORT, String DEPT, String ORG)	throws Exception
	{
		Util		util	= new Util();
		
		RequestTypeDATAMessageBody	requestTypeDATAMessageBody	= new RequestTypeDATAMessageBody();
		RequestTypeDATAMessage 		requestTypeDATAMessage 		= new RequestTypeDATAMessage();
		RequestTypeDATA 			requestTypeDATA 			= new RequestTypeDATA();
		RequestType 				requestType 				= new RequestType();
		
		//	String serviceURL = "http://10.46.147.212.:3100/stmr/websvc/ws";
//		System.out.println("Param:" + SAEALL_IP + SAEALL_PORT + SAEALL_PATH + DEPT + ORG);
		
		//add.... kdy..
		
		String serviceURL = "http://" + SAEALL_IP + ":" + SAEALL_PORT + SAEALL_PATH;
		
		SOWNN00247PortTypeProxy		sOWNN00247PortTypeProxy		= new SOWNN00247PortTypeProxy(serviceURL);
	
		ResponseTypeDATAMessageBodyList[]	typebody15 = {};
		List listbody15;
		ResponseTypeDATAMessageBodyList li;
		
		try{
			
			requestTypeDATAMessageBody.setMw_take_no(in_mw_take_no);
			requestTypeDATAMessage.setBody(requestTypeDATAMessageBody);
			requestTypeDATA.setMessage(requestTypeDATAMessage);
			requestType.setMSGKEY("");
			requestType.setRESULTCODE("");
			requestType.setORGCD("");
			requestType.setDATA(requestTypeDATA);
			requestType.setIFID("SOWNN00247");
			
		//	System.out.println(in_mw_take_no);
			
			ResponseType SOWNN002162mtemp = sOWNN00247PortTypeProxy.SOWNN00216(requestType);
			
		//	System.out.println("222222");
		
			if(SOWNN002162mtemp ==  null)
			{
				System.out.println(" DATA NULL !!");
			}
			else
			{
//				System.out.println(in_mw_take_no);
				
				if(SOWNN002162mtemp != null)
				{
					ResponseTypeDATA tebece0	= SOWNN002162mtemp.getDATA();
					
					if(tebece0 != null)
					{
						ResponseTypeDATAMessage tebece1 = tebece0.getMessage();		
					
						if(tebece1 != null)
						{
							typebody15	= tebece1.getBody().getList();
							listbody15	= java.util.Arrays.asList(typebody15);
							
							li	= (ResponseTypeDATAMessageBodyList)listbody15.get(0);

							try
							{
								request.setAttribute("REQ_NO_MIN", in_mw_take_no);		//	접수번호
							//	request.setAttribute("SIGUNGU", li.getTake_cgg_code());	//	시군구코드
								request.setAttribute("GUBUN_MIN", li.getMw_gbn_cn());		//	민원구분
								request.setAttribute("REQ_DEP_MIN", li.getTake_dep_nm());	//	접수부서 코드
								request.setAttribute("REQ_DATE_MIN", util.Date_Paste(li.getTake_ymd()));		//	접수일자
								request.setAttribute("PREDATE_MIN", util.Date_Paste(li.getDeal_plan_ymd()));	//	접수예정일자
								request.setAttribute("REQ_SET_MIN", li.getTake_se());		//	접수구분
								request.setAttribute("MANAGE_DEP_MIN", li.getDpp_usr_dept_name());	//	처리담당부서
								request.setAttribute("MANAGER_MIN", li.getDpp_usr_nm());		//	처리담당사용자명
								request.setAttribute("REQ_NM_MIN", li.getTake_man_name());		//	접수자사용자명
								request.setAttribute("NOTES_MIN", li.getMw_notes());//li.getMw_afr_shtnm());		//	li.getMw_notes());	//	민원요지
								request.setAttribute("AGENT_NM_MIN", li.getAgncy_nm());		//	대리인명
								request.setAttribute("AGENT_TEL_MIN", li.getAgncy_telno());	//	대리인연락처
								request.setAttribute("TEL_MIN", li.getMw_aplct_telno());	//	민원신청인 전화번호
								request.setAttribute("HP_MIN", li.getMw_aplct_hpno());		//	민원신청인 핸드폰
								request.setAttribute("ADDR1_MIN", li.getMw_aplct_addr());	//	민원신청인 주소
								request.setAttribute("POST_MIN", util.Post_Paste(li.getPost_no()));			//	우편번호
								request.setAttribute("EMAIL_MIN", li.getMw_aplct_email());	//	E-MAIL
								
//								if(li.getMw_aplct_nm()	== null	||	li.getMw_aplct_nm().trim().equals(""))
//									request.setAttribute("NAME_MIN", li.getWrkr_bup_nm());	//	사업자법인명
//								else if(li.getWrkr_bup_nm()	== null	||	li.getWrkr_bup_nm().trim().equals(""))
//									request.setAttribute("NAME_MIN", li.getMw_aplct_nm());	//	민원신청인명
								if(li.getMw_aplct_nm()	!= null	||	!"".equals(li.getMw_aplct_nm().trim()))
									request.setAttribute("NAME_MIN", li.getMw_aplct_nm());	//	민원신청인명
								else
									request.setAttribute("NAME_MIN", "");	//	민원신청인명
								
								
								//	SSN
								List	ssn	= util.SubString_SSN(li.getMw_aplct_sid());
								request.setAttribute("min_ssn1", ssn.get(0));
								request.setAttribute("min_ssn2", ssn.get(1));
								
								//	BIZSSN
								List	bizssn	= util.SubString_BIZSSN(li.getWrkr_bup_no_one());
								request.setAttribute("jumin_bizssn1", bizssn.get(0));
								request.setAttribute("jumin_bizssn2", bizssn.get(1));
								request.setAttribute("jumin_bizssn3", bizssn.get(2));
								
								
//								System.out.println("getMw_aplct_nm :" + li.getMw_aplct_nm() + ";");
//								System.out.println("getWrkr_bup_nm :" + li.getWrkr_bup_nm() + ";");						
//								
//								System.out.println("getMw_afr_shtnm :" + li.getMw_afr_shtnm());
//								System.out.println("getMw_notes :" + li.getMw_notes());
//								
//								System.out.println("getWrkr_bup_no_one :" + li.getWrkr_bup_no_one());
//								System.out.println("getWrkr_bup_no_two :" + li.getWrkr_bup_no_two());
//								
//								System.out.println("getMw_aplct_telno :" + li.getMw_aplct_telno());
//								System.out.println("getMw_aplct_hpno :" + li.getMw_aplct_hpno());
							}
							catch(Exception e)
							{
								e.printStackTrace();
							}
							finally
							{
								listbody15	= null;
							}
						}
					}
				}
			}	
		}
		catch(Exception e)
		{
			String	errReason	= e.toString();
			System.out.println(errReason);
		}
		finally
		{
		//	listbody15.clear();
			System.runFinalization();
			System.gc();
		}

	
	//	return new ModelAndView("/sampleSOWNN00216PortTypeProxy/testOutput");
	}
}