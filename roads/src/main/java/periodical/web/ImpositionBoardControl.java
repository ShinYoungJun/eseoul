/***********************************
 * 수정일 : 2007.9.27
 * 최종수정자 : 최진용
 * 수정내용 :
 ***********************************/

package main.java.periodical.web;


import main.java.common.util.Globals;

import java.net.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.bind.RequestUtils;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import java.util.List;

import main.java.periodical.service.*;

public class ImpositionBoardControl extends MultiActionController {
	
  	/**
  	 * QABoard 리스트 조회 (login 안한상태에 보이는 리스트)
	 * @param HttpServletRequest request
	 * @param HttpServletResponce responce
	 * @return ModelAndView
	 */
	
	private IImpositionService objImpositionService = null;
	
	public void setImpositionService (ImpositionService newObjImpositionService)
	{
		this.objImpositionService = newObjImpositionService;
	}
	
	
	
	public ModelAndView impositionList(HttpServletRequest request,HttpServletResponse response) throws Exception {
		
		String strCurrentPage="";
		
		if(strCurrentPage.equals(""))
			strCurrentPage = "1090";
		
		List aa1 =  objImpositionService.periodicalBoardList();
		
		System.out.println("크기는"+aa1.get(0).toString());
			
		return new ModelAndView("/junggi/imposition/search","blist",aa1);
	}
	
}