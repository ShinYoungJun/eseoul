package main.java.jumyong.minwon.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import main.java.jumyong.minwon.service.IMinwonService;
import main.java.common.util.StringUtil;
import main.java.common.util.catUtil.Util;
import main.java.jumyong.saewe.model.BugaRegistBean;
import main.java.jumyong.saewe.model.TaxationBean;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import BugaWebService.BugaWSProxy;
import BugaWebService_pkg.Bu04BugaWSDTO;
import BugaWebService_pkg.Bu04SemokWSDTO;
import BugaWebService_pkg.Bu04SemokWSRACSDTO;
import BugaWebService_pkg.Bu04UserInfoWSDTO;
import BugaWebService_pkg.BugaWS;



public class JibunWebControl extends MultiActionController {

	/**
	 * ����������ȸ 
	 * 
	 * @param HttpServletRequest 
	 *            request
	 * @param HttpServletResponce
	 *            responce
	 * @return ModelAndView
	 */
	private	Util			util	= new Util();
	private	StringUtil	stringUtil	= new StringUtil();
	
	public String	getJumyong_JibunInfo(String BJ_CD, String HJ_CD, String SPC_CD, String BONBUN, String BUBUN, IMinwonService iMinwonService) throws Exception 
	{
		String	Xml	= ""; 
		 
		//getSemokInfo �Է��Ķ����
		String bj_cd	= BJ_CD;
		String hj_cd = HJ_CD;
		String spc_cd = SPC_CD;
		String bonbun = BONBUN;
		String bubun = BUBUN;
		
		
		//���� �Ķ����
	    String returnNum = "";
		
		try{
				returnNum = String.valueOf(iMinwonService.getJumyong_JibunInfo(bj_cd, hj_cd, spc_cd, bonbun, bubun));
				
				//	XML�� ���� ������.
				Xml	= "<?xml version=\"1.0\" encoding=\"euc-kr\"?>";
				Xml	+= "<lists>";
				
				Xml	+= util.XmlNodeMake("returnNum", returnNum);
				
				Xml	+= "</lists>";
			
		}catch(Exception e){
			
			String errReason = e.toString();
			System.out.println(errReason);
			
		}
	
		return Xml;//new ModelAndView("/sampleBugaWSProxy/testOutput");
	}
	
}