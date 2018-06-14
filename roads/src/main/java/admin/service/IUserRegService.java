package main.java.admin.service;

import java.util.List;

import main.java.admin.model.UserRegBean;

public interface IUserRegService {

	public List retrieveUserList(int intCurrentPage,int intCountPerPage,String userGrade,String siguCode,String deptCode,String userName,String certYN);
	public boolean insertUserInfo(UserRegBean objUserRegBean);
	public int getUserTotalCount(String userGrade, String siguCode, String deptCode, String userName, String certYN);
	public UserRegBean getUserDetail(String userId);
	//public List userAuthorityList(String userGrade);
	public List userAuthorityList();
	public boolean updateUserInfo(UserRegBean objUserRegBean);
	public UserRegBean deleteUserInfo(UserRegBean objUserRegBean);
	public UserRegBean updateConfirm(UserRegBean objUserRegBean);
	public void updateAuthority(String user_id, int grade, String userGrade);
	public List getGuCode();
	public List getNewGuCode();
	public List getDeptCode(String siguCode);
	public List retrieveNoticeList(String popup);
	public int checkUserId(String userId);
	public int getGrade_menu(String u_id);
	public int getPwNum(String id);
	//	비밀번호 오류 업데이트
    public void setPwNum(String id, int count);

    public String checkPwd(String userId);
    public void setNewPwd(UserRegBean userBean);
    
    public void setLoginDate(String id, String todate);	//사용자마지막접속일업데이트
}