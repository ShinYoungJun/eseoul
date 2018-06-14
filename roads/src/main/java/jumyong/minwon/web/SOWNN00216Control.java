package main.java.jumyong.minwon.web;

import java.util.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import main.java.common.util.catUtil.Util;

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
		
//		String serviceURL = "http://10.46.147.212.:3100/stmr/websvc/ws";
//		String serviceURL = "http://98.2.9.22:3100/stmr/websvc/ws";
		String serviceURL = "http://" + SAEALL_IP + ":" + SAEALL_PORT + SAEALL_PATH;
		System.out.println("Param:" + SAEALL_IP + SAEALL_PORT + SAEALL_PATH + DEPT + ORG);
		
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
			requestType.setIFID("SOWNN00216");
			
		//	System.out.println(in_mw_take_no);
			
			ResponseType SOWNN002162mtemp = sOWNN00247PortTypeProxy.SOWNN00216(requestType);
			
		//	System.out.println("222222");
		
			if(SOWNN002162mtemp ==  null)
			{
				System.out.println(" DATA NULL !!");
			}
			else
			{
				System.out.println(in_mw_take_no);
				
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
								request.setAttribute("REQ_NO_MIN", in_mw_take_no);		//	������ȣ
							//	request.setAttribute("SIGUNGU", li.getTake_cgg_code());	//	�ñ����ڵ�
								request.setAttribute("GUBUN_MIN", li.getMw_gbn_cn());		//	�ο�����
								request.setAttribute("REQ_DEP_MIN", li.getTake_dep_nm());	//	�����μ� �ڵ�
								request.setAttribute("REQ_DATE_MIN", util.Date_Paste(li.getTake_ymd()));		//	��������
								request.setAttribute("PREDATE_MIN", util.Date_Paste(li.getDeal_plan_ymd()));	//	������������
								request.setAttribute("REQ_SET_MIN", li.getTake_se());		//	��������
								request.setAttribute("MANAGE_DEP_MIN", li.getDpp_usr_dept_name());	//	ó�����μ�
								request.setAttribute("MANAGER_MIN", li.getDpp_usr_nm());		//	ó��������ڸ�
								request.setAttribute("REQ_NM_MIN", li.getTake_man_name());		//	�����ڻ���ڸ�
								request.setAttribute("NOTES_MIN", li.getMw_notes());//li.getMw_afr_shtnm());		//	li.getMw_notes());	//	�ο�����
								request.setAttribute("AGENT_NM_MIN", li.getAgncy_nm());		//	�븮�θ�
								
//								request.setAttribute("AGENT_TEL_MIN", li.getAgncy_telno());	//	�븮�ο���ó
								
								/*if (li.getAgncy_telno() == null)
								{
									request.setAttribute("min_agent_tel1", "");	//	�븮�ο���ó1
									request.setAttribute("min_agent_tel2", "");	//	�븮�ο���ó2
									request.setAttribute("min_agent_tel3", "");	//	�븮�ο���ó3
								}
								else if(li.getAgncy_telno().length() == 10)
								{
									request.setAttribute("min_agent_tel1", li.getAgncy_telno().substring(0, 2));	//	�븮�ο���ó1
									request.setAttribute("min_agent_tel2", li.getAgncy_telno().substring(2, 4));	//	�븮�ο���ó2
									request.setAttribute("min_agent_tel3", li.getAgncy_telno().substring(6, 4));	//	�븮�ο���ó3
								}
								else if(li.getMw_aplct_telno().length() == 11)
								{
									request.setAttribute("min_agent_tel1", li.getAgncy_telno().substring(0, 3));	//	�븮�ο���ó1
									request.setAttribute("min_agent_tel2", li.getAgncy_telno().substring(3, 4));	//	�븮�ο���ó2
									request.setAttribute("min_agent_tel3", li.getAgncy_telno().substring(7, 4));	//	�븮�ο���ó3
								}
								else
								{
									request.setAttribute("min_agent_tel1", li.getAgncy_telno().substring(0, 2));	//	�븮�ο���ó1
									request.setAttribute("min_agent_tel2", li.getAgncy_telno().substring(2, 3));	//	�븮�ο���ó2
									request.setAttribute("min_agent_tel3", li.getAgncy_telno().substring(5, 4));	//	�븮�ο���ó3
								}2009.08.06*/

								
								request.setAttribute("min_agent_tel", li.getAgncy_telno()==null ? "" : li.getAgncy_telno());	//	�븮�ο���ó
																
								
//								request.setAttribute("TEL_MIN", li.getMw_aplct_telno());	//	�ο���û�� ��ȭ��ȣ
								/*if(li.getMw_aplct_telno() == null)
								{
									request.setAttribute("min_tel1", "");	//	�ο���û�� ����ó1
									request.setAttribute("min_tel2", "");	//	�ο���û�� ����ó2
									request.setAttribute("min_tel3", "");	//	�ο���û�� ����ó3
								}
								else if(li.getMw_aplct_telno().length() == 10)
								{
									request.setAttribute("min_tel1", li.getMw_aplct_telno().substring(0, 2));	//	�ο���û�� ����ó1
									request.setAttribute("min_tel2", li.getMw_aplct_telno().substring(2, 4));	//	�ο���û�� ����ó2
									request.setAttribute("min_tel3", li.getMw_aplct_telno().substring(6, 4));	//	�ο���û�� ����ó3
								}
								else if(li.getMw_aplct_telno().length() == 11)
								{
									request.setAttribute("min_tel1", li.getMw_aplct_telno().substring(0, 3));	//	�ο���û�� ����ó1
									request.setAttribute("min_tel2", li.getMw_aplct_telno().substring(3, 4));	//	�ο���û�� ����ó2
									request.setAttribute("min_tel3", li.getMw_aplct_telno().substring(7, 4));	//	�ο���û�� ����ó3
								}2009.08.06*/ 
  
								request.setAttribute("min_tel", li.getMw_aplct_telno()==null ? "" : li.getMw_aplct_telno() );	//	�ο���û�� ����ó
								
								//request.setAttribute("HP_MIN", li.getMw_aplct_hpno());		//	�ο���û�� �ڵ���
								/*List hp_list = util.StringToken_Three(li.getMw_aplct_hpno());
								request.setAttribute("min_hp1", hp_list.get(0));
								request.setAttribute("min_hp2", hp_list.get(1));
								request.setAttribute("min_hp3", hp_list.get(2)); 2009.08.06 */

								request.setAttribute("min_hp", li.getMw_aplct_hpno()==null ? "" : li.getMw_aplct_hpno() );	//	�ο���û�� �ڵ���
								
								request.setAttribute("ADDR1_MIN", li.getMw_aplct_addr());	//	�ο���û�� �ּ�
								request.setAttribute("POST_MIN", util.Post_Paste(li.getPost_no()));			//	�����ȣ
								
								request.setAttribute("EMAIL_MIN", li.getMw_aplct_email());	//	E-MAIL
								
//								if(li.getMw_aplct_nm()	== null	||	li.getMw_aplct_nm().trim().equals(""))
//									request.setAttribute("NAME_MIN", li.getWrkr_bup_nm());	//	����ڹ��θ�
//								else if(li.getWrkr_bup_nm()	== null	||	li.getWrkr_bup_nm().trim().equals(""))
//									request.setAttribute("NAME_MIN", li.getMw_aplct_nm());	//	�ο���û�θ�
								if(li.getMw_aplct_nm()	!= null	||	!"".equals(li.getMw_aplct_nm().trim()))
									request.setAttribute("NAME_MIN", li.getMw_aplct_nm());	//	�ο���û�θ�
								else
									request.setAttribute("NAME_MIN", "");	//	�ο���û�θ�
								
								//	SSN
								List	ssn	= util.SubString_SSN(li.getMw_aplct_sid());
								request.setAttribute("min_ssn1", ssn.get(0));
								request.setAttribute("min_ssn2", ssn.get(1));
								
								//	BIZSSN
								List	bizssn	= util.SubString_BIZSSN(li.getWrkr_bup_no_one());
								request.setAttribute("jumin_bizssn1", bizssn.get(0));
								request.setAttribute("jumin_bizssn2", bizssn.get(1));
								request.setAttribute("jumin_bizssn3", bizssn.get(2));
								
								System.out.println("getMw_aplct_nm :" + li.getMw_aplct_nm() + ";");
								System.out.println("getWrkr_bup_nm :" + li.getWrkr_bup_nm() + ";");						
								
								System.out.println("getMw_afr_shtnm :" + li.getMw_afr_shtnm());
								System.out.println("getMw_notes :" + li.getMw_notes());
								
								System.out.println("getWrkr_bup_no_one :" + li.getWrkr_bup_no_one());
								System.out.println("getWrkr_bup_no_two :" + li.getWrkr_bup_no_two());
								
								System.out.println("getMw_aplct_telno :" + li.getMw_aplct_telno());
								System.out.println("getMw_aplct_hpno :" + li.getMw_aplct_hpno());
								

							}
							catch(Exception e)
							{
								e.printStackTrace();
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
		}
		catch(Exception e)
		{
			String	errReason	= e.toString();
			System.out.println(errReason);
		}
		finally
		{
			li			= null;
			listbody15	= null;
			typebody15	= null;
			sOWNN00247PortTypeProxy		= null;
			requestType					= null;
			requestTypeDATA				= null;
			requestTypeDATAMessage		= null;
			requestTypeDATAMessageBody	= null;
			util		= null;
			
			System.runFinalization();
			System.gc();
		}

	//	return new ModelAndView("/sampleSOWNN00216PortTypeProxy/testOutput");
	}
}