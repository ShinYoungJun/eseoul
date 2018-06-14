
package main.java.schedule.service;

import java.util.List;
import java.util.Map;
import main.java.jumyong.jumyong.model.ProductBean;
import main.java.schedule.dao.IScheduleDao;
import main.java.schedule.model.LogBean;
import org.springframework.dao.DataAccessException;

public class ScheduleService implements IScheduleService {
	
	private IScheduleDao objScheduleDao = null;

	public void setScheduleDao(IScheduleDao newScheduleDao) {
	    this.objScheduleDao = newScheduleDao;
	}
	
	
	// 가판/노점 수납정보 업데이트
	public void gapanTaxationInfoUpdate(){
		objScheduleDao.gapanTaxationInfoUpdate();
	}
	
	// 도로 수납정보 업데이트
	public void taxationInfoUpdate(){
		objScheduleDao.taxationInfoUpdate();
	}
	
	// 수납정보 저장
	public LogBean insertSunapInfo(LogBean objLogBean){
		return objScheduleDao.insertSunapInfo(objLogBean);
	}
	
	
	// 공시지가 업데이트
	public void cpBd600Update(){
		objScheduleDao.cpBd600Update();
	}

}