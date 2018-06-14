//	2009		Kim Yun Seo

package main.java.jumyong.minwon.service;

import java.util.List;
import java.util.Map;

import main.java.jumyong.minwon.model.Admin_BaseBean;
import main.java.jumyong.minwon.model.AppealBean;
import main.java.jumyong.minwon.model.PlaceBean;
import main.java.jumyong.minwon.model.MinwonBean;
import main.java.jumyong.minwon.model.JumjiSearchBean;
import main.java.jumyong.minwon.model.TotalWIthBean;

public interface IMinwonService {

	public	List	executeSearch(String strName, int intRn1,int intRn2);
	public	int		executeCount(String strName);

	public	List	executeMinwon_View(String strAdmin_no);
	public	boolean	executeMinwon_Register(MinwonBean Bean);	
	
	public	List	executeJumji_View(String strAdmin_no);
	public	boolean	executeJumji_Modify(PlaceBean Bean);	
	public	int		executeJumji_Check(String strAdmin_no);
	
	public	boolean	executeUpdateJumin(AppealBean Bean);
	
	public	boolean	executeAdmin_Base_Register(Admin_BaseBean Bean);
	public 	boolean executeAppeal_Register(AppealBean Bean);
	public 	boolean executePlace_Register(PlaceBean Bean);
	
	public	int		executeCheck_AdminnoCount(String BJ_CD);
	public	int		executeCheck_Adminno(String ADMIN_NO);
	
	public	List	executeSearch_Jumji(JumjiSearchBean Bean, int intRn1, int intRn2);
	public	int		executeSearch_JumjiCount(JumjiSearchBean Bean);
	
	public	int		getJumyong_JibunInfo(String bj_cd, String hj_cd, String spc_cd, String bonbun, String bubun);
	//공시지가 조회
	public	Map	get_Price(String address, String bonbun, String bubun);
	
	//공시지가 적용지번 삭제
    public void executeDeletePlaceWithAddr(String adminNo);
    //공시지가 적용지번 추가
    public void executeInsertPlaceWithAddr(String adminNo,String pnu,String addr);
	
}
