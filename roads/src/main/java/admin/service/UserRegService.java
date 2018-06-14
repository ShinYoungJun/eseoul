package main.java.admin.service;

import java.util.List;
import main.java.admin.dao.IUserRegDao;
import main.java.admin.model.BoardBean;
import main.java.admin.model.UserRegBean;

public class UserRegService implements IUserRegService {

	private IUserRegDao objUserRegDao = null;

	public void setUserRegDao(IUserRegDao newUserRegDao) {
		this.objUserRegDao = newUserRegDao;
	}

	public List retrieveUserList(int intCurrentPage,int intCountPerPage, String userGrade,String siguCode,String deptCode,String userName,String certYN) {
	
		return objUserRegDao.retrieveUserList(intCurrentPage,intCountPerPage,userGrade,siguCode,deptCode,userName,certYN);
	}

	public boolean insertUserInfo(UserRegBean objUserRegBean) {

		return objUserRegDao.insertUserInfo(objUserRegBean);

	}

	public int getUserTotalCount(String userGrade, String siguCode, String deptCode, String userName, String certYN) {
		
		return objUserRegDao.getUserTotalCount(userGrade, siguCode, deptCode, userName, certYN);
	}

	public UserRegBean getUserDetail(String userId) {
	
		return objUserRegDao.getUserDetail(userId);
	}
	
	public List userAuthorityList() {
		
		return objUserRegDao.userAuthorityList();
	}

	public boolean updateUserInfo(UserRegBean objUserRegBean) {

		return objUserRegDao.updateUserInfo(objUserRegBean);
	}

	public UserRegBean deleteUserInfo(UserRegBean objUserRegBean) {

		objUserRegDao.deleteUserInfo(objUserRegBean);
		return null;
	}

	public UserRegBean updateConfirm(UserRegBean objUserRegBean) {

		objUserRegDao.updateConfirm(objUserRegBean);
		return null;
	}
	
	public void updateAuthority(String user_id, int grade, String userGrade) {

		objUserRegDao.updateAuthority(user_id, grade, userGrade);
		
	}	

	public List getGuCode() {

		return objUserRegDao.getGuCode();
	}
	
	public List getNewGuCode() {

		return objUserRegDao.getNewGuCode();
	}
	
	public List getDeptCode(String siguCode) {
		
		return objUserRegDao.getDeptCode(siguCode);
	}
	
	public List retrieveNoticeList(String popup) {
		
		return objUserRegDao.retrieveNoticeList(popup);
	}

	public int checkUserId(String userId) {
		
		return objUserRegDao.checkUserId(userId);
	}
	public int getGrade_menu(String u_id){
		return objUserRegDao.getGrade_menu(u_id);
	}

	@Override
	public int getPwNum(String id) {
		return objUserRegDao.getPwNum(id);
	}

	@Override
	public void setPwNum(String id, int count) {
		objUserRegDao.setPwNum(id, count);
		
	}

	@Override
	public String checkPwd(String userId) {
		return objUserRegDao.checkPwd(userId);
	}

	@Override
	public void setNewPwd(UserRegBean userBean) {
		objUserRegDao.setNewPwd(userBean);
	}
	@Override
	public void setLoginDate(String id, String todate) {
		objUserRegDao.setLoginDate(id, todate);		
	}
}