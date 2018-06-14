package main.java.schedule.service;

import java.util.List;
import java.util.Map;
import main.java.schedule.model.LogBean;
import org.springframework.dao.DataAccessException;


public interface IScheduleService{
	
	// 가판노점 수납정보 업데이트
	public void gapanTaxationInfoUpdate();
	
	// 도로 수납정보 업데이트
	public void taxationInfoUpdate();
	
	// 수납정보 저장
	public LogBean insertSunapInfo(LogBean objLogBean);
	
	// 공시지가 업데이트
	public void cpBd600Update();
		
}