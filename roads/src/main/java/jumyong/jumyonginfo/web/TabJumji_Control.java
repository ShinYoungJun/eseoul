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
	
	
	//	점용지정보 보기
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
				//	request.setAttribute("mul_spc_cd", commonCode.executeCommonCode("MUL_SPC_CD", null, "선택"));
					request.setAttribute("mul_spc_cd", commonCode.executeSearchCommonCode("MUL_SPC_CD", Bean.getSPC_CD()));
					
				
					Bean.setMUL_FROMDATE(util.Date_Paste(Bean.getMUL_FROMDATE()));		//	점용시작일
					Bean.setMUL_TODATE(util.Date_Paste(Bean.getMUL_TODATE()));			//	점용종료일
					Bean.setWORK_FROMDATE(util.Date_Paste(Bean.getWORK_FROMDATE()));	//	공사 시작일
					Bean.setWORK_TODATE(util.Date_Paste(Bean.getWORK_TODATE()));		//	공사 종료일
					Bean.setFINISH_DATE(util.Date_Paste(Bean.getFINISH_DATE()));		//	준공일자
					Bean.setDUE_DATE(util.Date_Paste(Bean.getDUE_DATE()));				// 일시점용 만료일자
					Bean.setSIGUNGU(commonCode.SearchGuName(Bean.getSIDO(), Bean.getSIGUNGU()));	//	시 이름입력
					
					//	점용지 지번
					if(Bean.getBUBUN()	!= null)
					{
						if(!Bean.getBUBUN().trim().equals(""))
							Bean.setBUBUN("-" + Bean.getBUBUN() + "번지");
						else	Bean.setBONBUN(Bean.getBONBUN() + "번지");
					}
					else	Bean.setBONBUN(Bean.getBONBUN() + "번지");
						
					if(Bean.getBAN()	!= null)
						if(!Bean.getBAN().trim().equals(""))
							Bean.setBAN("/" + Bean.getBAN());
					
					//	건물 정보
					if(Bean.getBD_DONG()	!= null)
						if(!Bean.getBD_DONG().trim().equals(""))
							Bean.setBD_NM(Bean.getBD_NM() + " " + Bean.getBD_DONG() + "동");
					
					if(Bean.getBD_HO()	!= null)
						if(!Bean.getBD_HO().trim().equals(""))
							Bean.setBD_NM(Bean.getBD_NM() + " " + Bean.getBD_HO() + "호");
					
					//	공사 기간
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
	
	//	점용지정보 수정
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
				
				//	점용지
				request.setAttribute("sigungu_code", commonCode.executeGuCode(Bean.getSIDO(), Bean.getSIGUNGU()));
				request.setAttribute("bjdong_code", commonCode.executeBJDongCode(Bean.getSIDO(), Bean.getSIGUNGU(), Bean.getBJ_CD()));
				request.setAttribute("hjdong_code", commonCode.executeHJDongCode(Bean.getSIDO(), Bean.getSIGUNGU(), Bean.getHJ_CD()));
				request.setAttribute("mul_spc_cd", commonCode.executeCommonCode("MUL_SPC_CD", Bean.getSPC_CD(), null));
				
				Bean.setSIGUNGU_NM(commonCode.SearchGuName(Bean.getSIDO(), Bean.getSIGUNGU()));	//	구 이름입력
				Bean.setMUL_FROMDATE(util.Date_Paste(Bean.getMUL_FROMDATE()));		//	점용시작일
				Bean.setMUL_TODATE(util.Date_Paste(Bean.getMUL_TODATE()));			//	점용종료일
				Bean.setWORK_FROMDATE(util.Date_Paste(Bean.getWORK_FROMDATE()));	//	공사 시작일
				Bean.setWORK_TODATE(util.Date_Paste(Bean.getWORK_TODATE()));		//	공사 종료일
				Bean.setFINISH_DATE(util.Date_Paste(Bean.getFINISH_DATE()));		//	준공일자
				Bean.setDUE_DATE(util.Date_Paste(Bean.getDUE_DATE()));	// 일시점용 만료일자
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
	
	//	점용지 정보 수정 처리
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

	//	점용지 정보 수정
	public void		Jumji_Modify_Execute(HttpServletRequest request,HttpServletResponse response, String adminno) throws Exception 
	{
		HttpSession session = request.getSession();		
		String 		userId	= (String)session.getAttribute("sessionUserId");
		
		try{
			if(userId != null){
				PlaceBean	Bean	= new PlaceBean();
				
				bind(request, Bean);
				
				Bean.setMUL_FROMDATE(util.Date_Cut(Bean.getMUL_FROMDATE()));	//	점용시작일
				Bean.setMUL_TODATE(util.Date_Cut(Bean.getMUL_TODATE()));		//	점용종료일
				Bean.setWORK_FROMDATE(util.Date_Cut(Bean.getWORK_FROMDATE()));	//	공사 시작일
				Bean.setWORK_TODATE(util.Date_Cut(Bean.getWORK_TODATE()));		//	공사 종료일
				Bean.setFINISH_DATE(util.Date_Cut(Bean.getFINISH_DATE()));		//	준공일자
				Bean.setDUE_DATE(util.Date_Cut(Bean.getDUE_DATE()));		// 일시점용 만료일자
				Bean.setMUL_POST(util.Post_Cut(Bean.getMUL_POST()));			//	우편번호
				
				Bean.setADMIN_NO(adminno);
				Bean.setWORK_ID(userId);
				
				
				//공시지가 적용 지번 저장
				IJumyonginfoService.executeDeletePlaceWithAddr(adminno);
				
	            String[] WITH_ADDR_PNU = request.getParameterValues("WITH_ADDR_PNU");
	            String[] WITH_ADDR_TEXT = request.getParameterValues("WITH_ADDR_TEXT");
	            
	            for(int i = 0 ; i < WITH_ADDR_PNU.length ; i++){
	            	IJumyonginfoService.executeInsertPlaceWithAddr(adminno, WITH_ADDR_PNU[i], WITH_ADDR_TEXT[i]);	
	            }
				
				//	세션에서 시도 코드를 가져온다.
				String	SIDO_CD	= util.getSidoCode(getMessageSourceAccessor());
				
				Bean.setSIDO(SIDO_CD);
				Bean.setSIGUNGU(Bean.getSIGUNGU());
				
				IJumyonginfoService.executeJumji_Modify(Bean);
				
			}
		}catch(Exception e){	
			System.out.println("error:"+e.toString());	
		}	
	}
	
	//	인접지 정보  수정
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
				
				
				//오늘 날짜 
				Calendar  cal  =  Calendar.getInstance();
				SimpleDateFormat  sdf  =  new SimpleDateFormat("yyyy");      // 데이터 출력 형식 지정
				String  Year  =  sdf.format (cal.getTime());      // 오늘 날짜 변수에 저장
			
				
				
//				list 	= IJumyonginfoService.executeTotal_With(ADMIN_NO);								
//				
				request.setAttribute("ADMIN_NO",ADMIN_NO );
				request.setAttribute("GU_CD", GU_CD);
				request.setAttribute("BJ_CD",BJ_CD );
				
//				System.out.println("#############카운트 : " + list.size());
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
	
//	 정기분 면적 선택 리스트
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
							
				//오늘 날짜 
				Calendar  cal  =  Calendar.getInstance();
				SimpleDateFormat  sdf  =  new SimpleDateFormat("yyyyMMdd");      // 데이터 출력 형식 지정
				String  toDate  =  sdf.format (cal.getTime());      // 오늘 날짜 변수에 저장
			
				
				try
				{
					Map a = IJumyonginfoService.get_Price(ADMIN_NO,BONBUN,BUBUN);
					request.setAttribute("YEAR",YEAR);
					
					//System.out.println("a.size()==== " + a.size() );
					if(a.size() > 0)
					{
					
					request.setAttribute("SI_NM",a.get("SI_NM")+"시");
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
						request.setAttribute("SI_NM","해당 주소의 공시지가가 없습니다.");
				}catch(Exception err)
				{
					request.setAttribute("SI_NM","해당 주소의 공시지가가 없습니다.");
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
