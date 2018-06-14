//	2009		Kim Yun Seo

package main.java.jumyong.minwon.service;

import java.util.List;
import java.util.Map;

import main.java.jumyong.minwon.dao.IMinwonDao;
import main.java.jumyong.minwon.model.Admin_BaseBean;
import main.java.jumyong.minwon.model.AppealBean;
import main.java.jumyong.minwon.model.PlaceBean;
import main.java.jumyong.minwon.model.MinwonBean;
import main.java.jumyong.minwon.model.JumjiSearchBean;
import main.java.jumyong.minwon.model.TotalWIthBean;


public class MinwonService implements IMinwonService {

	private IMinwonDao iMinwonDao = null;
	
	//민원조회 관리 Service와 DAO를 연결
	public void setJumyong_minwonDao(IMinwonDao jumyong_minwonDao)
	{
	    this.iMinwonDao = jumyong_minwonDao;
	}
	
	//민원 조회 리스트
	public List executeSearch(String strName, int intRn1, int intRn2)
	{
		return iMinwonDao.executeSearch(strName, intRn1, intRn2);
	}
	
	//민원 조회 리스트 카운트
	public int	executeCount(String strName)
	{
		return iMinwonDao.executeCount(strName);
	}
	
	//	ADMIN_BASE 등록
	public boolean executeAdmin_Base_Register(Admin_BaseBean Bean)
	{
		return iMinwonDao.executeAdmin_Base_Register(Bean);
	}
	
	//민원, 점용인정보 등록
	public boolean executeAppeal_Register(AppealBean Bean)
	{
		System.out.println("MinwonService.executeAppeal_Register");
		return iMinwonDao.executeAppeal_Register(Bean);
	}
	
	//점용지 정보 등록
	public boolean executePlace_Register(PlaceBean Bean)
	{
		return iMinwonDao.executePlace_Register(Bean);
	}
	
	//민원정보 보기
	public List executeMinwon_View(String strAdmin_no)
	{
		return iMinwonDao.executeMinwon_View(strAdmin_no);
	}
	
	//	민원정보 등록
	public boolean executeMinwon_Register(MinwonBean Bean)
	{
		return iMinwonDao.executeMinwon_Register(Bean);
	}
	
	//점용지정보 보기
	public List executeJumji_View(String strAdmin_no)
	{
		return iMinwonDao.executeJumji_View(strAdmin_no);
	}
	
	//점용지정보  수정
	public boolean executeJumji_Modify(PlaceBean Bean)
	{
		return iMinwonDao.executeJumji_Modify(Bean);
	}
	
	//점용지 체크
	public int	executeJumji_Check(String strAdmin_no)
	{
		return iMinwonDao.executeJumji_Check(strAdmin_no);
	}
    //	점용인 정보 수정
	public boolean executeUpdateJumin(AppealBean Bean)
	{
		return iMinwonDao.executeUpdateJumin(Bean);
	}	
    //	관리자 생성 1단계 (법정동으로 관리번호 갯수 확인)
	public	int		executeCheck_AdminnoCount(String BJ_CD)
	{
		return iMinwonDao.executeCheck_AdminnoCount(BJ_CD);
	}
	
	//관리자 생성 2단계 (동일 관리번호 유무 확인)
	public	int		executeCheck_Adminno(String ADMIN_NO)
	{
		return iMinwonDao.executeCheck_Adminno(ADMIN_NO);
	}
	
	//관련 점용지 조회
	public	List	executeSearch_Jumji(JumjiSearchBean Bean, int intRn1, int intRn2)
	{
		return iMinwonDao.executeSearch_Jumji(Bean, intRn1, intRn2);
	}
	
	//관련 점용지 조회 카운트
	public	int	executeSearch_JumjiCount(JumjiSearchBean Bean)
	{
		return iMinwonDao.executeSearch_JumjiCount(Bean);
	}
	
	//관련 점용지 조회 카운트
	public	int	getJumyong_JibunInfo(String bj_cd, String hj_cd, String spc_cd, String bonbun, String bubun)
	{
		return iMinwonDao.getJumyong_JibunInfo(bj_cd, hj_cd, spc_cd, bonbun, bubun);
	}
	
	//공시지가 가져오기
	public	Map	get_Price(String address, String bonbun, String bubun)
	{
		return iMinwonDao.get_Price(address, bonbun, bubun);
	}
	
	//공시지가 적용지번 삭제
    public void executeDeletePlaceWithAddr(String adminNo){
    	iMinwonDao.executeDeletePlaceWithAddr(adminNo);
    }
    
    //공시지가 적용지번 추가
    public void executeInsertPlaceWithAddr(String adminNo,String pnu,String addr){
    	iMinwonDao.executeInsertPlaceWithAddr(adminNo, pnu, addr);
    }
}
