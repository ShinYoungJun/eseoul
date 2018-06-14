
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
	
	
	// ����/���� �������� ������Ʈ
	public void gapanTaxationInfoUpdate(){
		objScheduleDao.gapanTaxationInfoUpdate();
	}
	
	// ���� �������� ������Ʈ
	public void taxationInfoUpdate(){
		objScheduleDao.taxationInfoUpdate();
	}
	
	// �������� ����
	public LogBean insertSunapInfo(LogBean objLogBean){
		return objScheduleDao.insertSunapInfo(objLogBean);
	}
	
	
	// �������� ������Ʈ
	public void cpBd600Update(){
		objScheduleDao.cpBd600Update();
	}

}