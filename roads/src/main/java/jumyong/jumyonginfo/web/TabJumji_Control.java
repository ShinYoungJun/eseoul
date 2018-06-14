//	2009		Kim Yun Seo

package main.java.jumyong.jumyonginfo.web;


import java.io.StringReader;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.jdom.Document;
import org.jdom.Element;
import org.jdom.input.SAXBuilder;
import org.jdom.output.XMLOutputter;
import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import com.sun.java.swing.plaf.windows.resources.windows;

import main.java.jumyong.jumyonginfo.model.AppealBean;
import main.java.jumyong.jumyonginfo.model.PlaceBean;
import main.java.jumyong.jumyonginfo.model.TotalWIthBean;
import main.java.jumyong.jumyonginfo.service.IMinwoninfoService;
import main.java.common.commonCode.service.CommonCodeService;
import main.java.common.util.catUtil.Util;


public class TabJumji_Control	extends MultiActionController {

	private	IMinwoninfoService	IJumyonginfoService	= null;
	private	CommonCodeService	commonCode			= null;
	private	Util				util				= new Util();

	
	public void setJumyonginfoService(IMinwoninfoService jumyonginfoService) 
	{
		this.IJumyonginfoService = jumyonginfoService;
	}
	
	public void setCommonCodeService(CommonCodeService commonCode) 
	{
		this.commonCode 	= commonCode;
	}
	
	
	//	���������� ����
	public ModelAndView		Jumji_View(HttpServletRequest request,HttpServletResponse response) throws Exception 
	{
		HttpSession session = request.getSession();		
		String 		userId	= (String)session.getAttribute("sessionUserId");					
		PlaceBean	Bean	= new PlaceBean();
		
		try{
			if(userId != null){
							
				String 		adminno = ServletRequestUtils.getStringParameter(request, "ADMIN_NO", "");
				String  SECTION = ServletRequestUtils.getStringParameter(request, "SECTION", "");
		
				List		list 	= IJumyonginfoService.executeJumji_View(adminno);				
		
				if(list.size()<=0)
					Bean	= null;
				else
				{
					Bean	= (PlaceBean)list.get(0);
					
					request.setAttribute("use_type", commonCode.executeSearchCommonCode("use_type", Bean.getTYPE()));
					request.setAttribute("occupancy_type", commonCode.executeSearchCommonCode("occupancy_type", Bean.getSECTION()));
					request.setAttribute("use_owner_Group", commonCode.executeSearchCommonCode("use_ownerGroup", Bean.getOWNER_SET()));
					request.setAttribute("taxation_section", commonCode.executeSearchCommonCode("taxation_section", Bean.getTAX_SET()));
					
					request.setAttribute("bjdong_code", commonCode.executeSearchBJDongCode(Bean.getSIDO(), Bean.getSIGUNGU(), Bean.getBJ_CD()));
					request.setAttribute("hjdong_code", commonCode.executeSearchHJDongCode(Bean.getSIDO(), Bean.getSIGUNGU(), Bean.getHJ_CD()));
				//	request.setAttribute("mul_spc_cd", commonCode.executeCommonCode("MUL_SPC_CD", null, "����"));
					request.setAttribute("mul_spc_cd", commonCode.executeSearchCommonCode("MUL_SPC_CD", Bean.getSPC_CD()));
					
				
					Bean.setMUL_FROMDATE(util.Date_Paste(Bean.getMUL_FROMDATE()));		//	���������
					Bean.setMUL_TODATE(util.Date_Paste(Bean.getMUL_TODATE()));			//	����������
					Bean.setWORK_FROMDATE(util.Date_Paste(Bean.getWORK_FROMDATE()));	//	���� ������
					Bean.setWORK_TODATE(util.Date_Paste(Bean.getWORK_TODATE()));		//	���� ������
					Bean.setFINISH_DATE(util.Date_Paste(Bean.getFINISH_DATE()));		//	�ذ�����
					Bean.setDUE_DATE(util.Date_Paste(Bean.getDUE_DATE()));				// �Ͻ����� ��������
					Bean.setSIGUNGU(commonCode.SearchGuName(Bean.getSIDO(), Bean.getSIGUNGU()));	//	�� �̸��Է�
					
					//	������ ����
					if(Bean.getBUBUN()	!= null)
					{
						if(!Bean.getBUBUN().trim().equals(""))
							Bean.setBUBUN("-" + Bean.getBUBUN() + "����");
						else	Bean.setBONBUN(Bean.getBONBUN() + "����");
					}
					else	Bean.setBONBUN(Bean.getBONBUN() + "����");
						
					if(Bean.getBAN()	!= null)
						if(!Bean.getBAN().trim().equals(""))
							Bean.setBAN("/" + Bean.getBAN());
					
					//	�ǹ� ����
					if(Bean.getBD_DONG()	!= null)
						if(!Bean.getBD_DONG().trim().equals(""))
							Bean.setBD_NM(Bean.getBD_NM() + " " + Bean.getBD_DONG() + "��");
					
					if(Bean.getBD_HO()	!= null)
						if(!Bean.getBD_HO().trim().equals(""))
							Bean.setBD_NM(Bean.getBD_NM() + " " + Bean.getBD_HO() + "ȣ");
					
					//	���� �Ⱓ
					if(Bean.getWORK_TODATE()	!= null)
						if(!Bean.getWORK_TODATE().trim().equals(""))
							Bean.setWORK_FROMDATE(Bean.getWORK_FROMDATE() + " ~ " + Bean.getWORK_TODATE());
				}
				
				request.setAttribute("ADMIN_NO", adminno);
				request.setAttribute("board", Bean);
				request.setAttribute("priceAddrList", IJumyonginfoService.executeSelectPlaceWithAddr(adminno));
				request.setAttribute("SECTION", SECTION);
			}
		}catch(Exception e){	
			System.out.println("error:"+e.toString());	
		}	
		return new ModelAndView("/jumyong/jumyonginfo/tab/jumji_view");
	}
	
	//	���������� ����
	public ModelAndView		Jumji_Modify(HttpServletRequest request,HttpServletResponse response) throws Exception 
	{
		HttpSession session = request.getSession();		
		String 		userId	= (String)session.getAttribute("sessionUserId");					
		PlaceBean	Bean	= new PlaceBean();
		
		try{
			if(userId != null){
				String 		adminno = ServletRequestUtils.getStringParameter(request, "ADMIN_NO", "");
		
				List		list 	= IJumyonginfoService.executeJumji_View(adminno);								
				
				Bean	= (PlaceBean)list.get(0);
				
				request.setAttribute("use_type", commonCode.executeCommonCode("use_type", Bean.getTYPE(), null));
				request.setAttribute("occupancy_type", commonCode.executeCommonCode("occupancy_type", Bean.getSECTION(), null));
				request.setAttribute("use_owner_Group", commonCode.executeCommonCode("use_ownerGroup", Bean.getOWNER_SET(), null));
				request.setAttribute("taxation_section", commonCode.executeCommonCode("taxation_section", Bean.getTAX_SET(), null));
				
				//	������
				request.setAttribute("sigungu_code", commonCode.executeGuCode(Bean.getSIDO(), Bean.getSIGUNGU()));
				request.setAttribute("bjdong_code", commonCode.executeBJDongCode(Bean.getSIDO(), Bean.getSIGUNGU(), Bean.getBJ_CD()));
				request.setAttribute("hjdong_code", commonCode.executeHJDongCode(Bean.getSIDO(), Bean.getSIGUNGU(), Bean.getHJ_CD()));
				request.setAttribute("mul_spc_cd", commonCode.executeCommonCode("MUL_SPC_CD", Bean.getSPC_CD(), null));
				
				Bean.setSIGUNGU_NM(commonCode.SearchGuName(Bean.getSIDO(), Bean.getSIGUNGU()));	//	�� �̸��Է�
				Bean.setMUL_FROMDATE(util.Date_Paste(Bean.getMUL_FROMDATE()));		//	���������
				Bean.setMUL_TODATE(util.Date_Paste(Bean.getMUL_TODATE()));			//	����������
				Bean.setWORK_FROMDATE(util.Date_Paste(Bean.getWORK_FROMDATE()));	//	���� ������
				Bean.setWORK_TODATE(util.Date_Paste(Bean.getWORK_TODATE()));		//	���� ������
				Bean.setFINISH_DATE(util.Date_Paste(Bean.getFINISH_DATE()));		//	�ذ�����
				Bean.setDUE_DATE(util.Date_Paste(Bean.getDUE_DATE()));	// �Ͻ����� ��������
				Bean.setMUL_POST(util.Post_Paste(Bean.getMUL_POST()));		//
				
				
				
				request.setAttribute("board", Bean);
				request.setAttribute("priceAddrList", IJumyonginfoService.executeSelectPlaceWithAddr(adminno));
				request.setAttribute("ADMIN_NO", adminno);
			}
		}catch(Exception e){	
			System.out.println("error:"+e.toString());	
		}	
		return new ModelAndView("/jumyong/jumyonginfo/tab/jumji_modify");
	}
	
	//	������ ���� ���� ó��
	public ModelAndView		Jumji_Modify_Prc(HttpServletRequest request,HttpServletResponse response) throws Exception 
	{
		try{
			String 	adminno = ServletRequestUtils.getStringParameter(request, "ADMIN_NO", "");
		
			Jumji_Modify_Execute(request, response, adminno);
			
			request.setAttribute("ADMIN_NO", adminno);
		}catch(Exception e){	
			System.out.println("error:"+e.toString());	
		}	
		return	Jumji_View(request, response);
	}

	//	������ ���� ����
	public void		Jumji_Modify_Execute(HttpServletRequest request,HttpServletResponse response, String adminno) throws Exception 
	{
		HttpSession session = request.getSession();		
		String 		userId	= (String)session.getAttribute("sessionUserId");
		
		try{
			if(userId != null){
				PlaceBean	Bean	= new PlaceBean();
				
				bind(request, Bean);
				
				Bean.setMUL_FROMDATE(util.Date_Cut(Bean.getMUL_FROMDATE()));	//	���������
				Bean.setMUL_TODATE(util.Date_Cut(Bean.getMUL_TODATE()));		//	����������
				Bean.setWORK_FROMDATE(util.Date_Cut(Bean.getWORK_FROMDATE()));	//	���� ������
				Bean.setWORK_TODATE(util.Date_Cut(Bean.getWORK_TODATE()));		//	���� ������
				Bean.setFINISH_DATE(util.Date_Cut(Bean.getFINISH_DATE()));		//	�ذ�����
				Bean.setDUE_DATE(util.Date_Cut(Bean.getDUE_DATE()));		// �Ͻ����� ��������
				Bean.setMUL_POST(util.Post_Cut(Bean.getMUL_POST()));			//	�����ȣ
				
				Bean.setADMIN_NO(adminno);
				Bean.setWORK_ID(userId);
				
				
				//�������� ���� ���� ����
				IJumyonginfoService.executeDeletePlaceWithAddr(adminno);
				
	            String[] WITH_ADDR_PNU = request.getParameterValues("WITH_ADDR_PNU");
	            String[] WITH_ADDR_TEXT = request.getParameterValues("WITH_ADDR_TEXT");
	            
	            for(int i = 0 ; i < WITH_ADDR_PNU.length ; i++){
	            	IJumyonginfoService.executeInsertPlaceWithAddr(adminno, WITH_ADDR_PNU[i], WITH_ADDR_TEXT[i]);	
	            }
				
				//	���ǿ��� �õ� �ڵ带 �����´�.
				String	SIDO_CD	= util.getSidoCode(getMessageSourceAccessor());
				
				Bean.setSIDO(SIDO_CD);
				Bean.setSIGUNGU(Bean.getSIGUNGU());
				
				IJumyonginfoService.executeJumji_Modify(Bean);
				
			}
		}catch(Exception e){	
			System.out.println("error:"+e.toString());	
		}	
	}
	
	//	������ ����  ����
	public ModelAndView		Total_With(HttpServletRequest request,HttpServletResponse response) throws Exception 
	{
		HttpSession session = request.getSession();		
		String 		userId	= (String)session.getAttribute("sessionUserId");					
		
		List list = null;
		
		try{
			if(userId != null){
				
				String ADMIN_NO = ServletRequestUtils.getStringParameter(request,"adminNo","");
				String GU_CD = ServletRequestUtils.getStringParameter(request,"guCD","");
				String BJ_CD = ServletRequestUtils.getStringParameter(request,"bjCD","");
				
				
				//���� ��¥ 
				Calendar  cal  =  Calendar.getInstance();
				SimpleDateFormat  sdf  =  new SimpleDateFormat("yyyy");      // ������ ��� ���� ����
				String  Year  =  sdf.format (cal.getTime());      // ���� ��¥ ������ ����
			
				
				
//				list 	= IJumyonginfoService.executeTotal_With(ADMIN_NO);								
//				
				request.setAttribute("ADMIN_NO",ADMIN_NO );
				request.setAttribute("GU_CD", GU_CD);
				request.setAttribute("BJ_CD",BJ_CD );
				
//				System.out.println("#############ī��Ʈ : " + list.size());
				System.out.println("#############BJDONG : " + commonCode.executeBJDongName("11",GU_CD,BJ_CD) );
				System.out.println("#############YEAR : " + commonCode.executeRegYear(ADMIN_NO));
				
				request.setAttribute("BJ_NM",commonCode.executeBJDongName("11",GU_CD,BJ_CD));
				request.setAttribute("YEAR",Year);
				

			}
		}catch(Exception e){	
			System.out.println("error:"+e.toString());	
		}	
		return new ModelAndView("/jumyong/jumyonginfo/tab/total_with", "blist", list);
	}
	
//	 ����� ���� ���� ����Ʈ
	public ModelAndView 	getPrice(HttpServletRequest request,HttpServletResponse response) throws Exception 
	{
		HttpSession session = request.getSession();
		String 		userId	= (String)session.getAttribute("sessionUserId");	
		
		try{
			if(userId != null)
			{
				String ADMIN_NO = ServletRequestUtils.getStringParameter(request,"ADMIN_NO","");
				String BONBUN = ServletRequestUtils.getStringParameter(request,"BONBUN","");
				String BUBUN = ServletRequestUtils.getStringParameter(request,"BUBUN","");
				String YEAR = ServletRequestUtils.getStringParameter(request,"YEAR","");
				
				
				
				//System.out.println(admin_no);
				//System.out.println(year);								
							
				//���� ��¥ 
				Calendar  cal  =  Calendar.getInstance();
				SimpleDateFormat  sdf  =  new SimpleDateFormat("yyyyMMdd");      // ������ ��� ���� ����
				String  toDate  =  sdf.format (cal.getTime());      // ���� ��¥ ������ ����
			
				
				try
				{
					Map a = IJumyonginfoService.get_Price(ADMIN_NO,BONBUN,BUBUN);
					request.setAttribute("YEAR",YEAR);
					
					//System.out.println("a.size()==== " + a.size() );
					if(a.size() > 0)
					{
					
					request.setAttribute("SI_NM",a.get("SI_NM")+"��");
					request.setAttribute("GU_NM",a.get("GU_NM"));
					request.setAttribute("BJ_NM",a.get("BJ_NM"));
					if(a.get("BUBUN")==null ||a.get("BUBUN").equals("")){
						request.setAttribute("BUNJI",a.get("BONBUN"));
					}else{
						request.setAttribute("BUNJI",a.get("BONBUN")+"-"+a.get("BUBUN"));
					}								
						
						//System.out.println("toDate === " + toDate);
						//System.out.println("year ===" + year);
						
						int i = Integer.parseInt(a.get("DB_CRE_MON").toString().substring(0,4)) - Integer.parseInt(YEAR);
						String giga = "";
						//System.out.println("#################i:"+i);
						if(i == 0 || i < 0)
							giga = a.get("JIGA").toString();
						else if(i == 1)
							giga = a.get("JIGA_PY").toString();
						else if(i == 2)
							giga = a.get("JIGA_2PY").toString();
						else if(i == 3)
							giga = a.get("JIGA_3PY").toString();
						else if(i == 4)
							giga = a.get("JIGA_4PY").toString();
						
						//System.out.println("%%%%%%%%%%%%%%%%giga:"+giga);
						request.setAttribute("giga",giga);
					}else
						request.setAttribute("SI_NM","�ش� �ּ��� ���������� �����ϴ�.");
				}catch(Exception err)
				{
					request.setAttribute("SI_NM","�ش� �ּ��� ���������� �����ϴ�.");
					request.setAttribute("giga","0");
					System.out.println(err.toString());
				}
			}
		}catch(Exception e){
			System.out.println("error:"+e.toString());
		}
		return new ModelAndView("/jumyong/jumyonginfo/tab/officialLandPrice" );
	}
	
	
}
