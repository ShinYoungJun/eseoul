package main.java.admin.dao;

import java.util.List;

import main.java.admin.model.BoardBean;
import main.java.admin.model.UserRegBean;

public interface IUserRegDao {

	public List retrieveUserList(int intCurrentPage,int intCountPerPage,String userGrade,String userParty,String deptName,String userName,String certYN);
	public boolean updateUserInfo(UserRegBean objUserRegBean);
	public boolean insertUserInfo(UserRegBean objUserRegBean);
	public int getUserTotalCount(String userGrade, String userParty, String deptName, String userName, String certYN);
	public UserRegBean getUserDetail(String userId);
	//public List userAuthorityList(String userGrade);
	public List userAuthorityList();
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
    public void setPwNum(String id, int count);
	
    public String checkPwd(String userId);
    public void setNewPwd(UserRegBean userBean);
    
    public void setLoginDate(String id, String todate);	//사용자마지막접속일업데이트
}
