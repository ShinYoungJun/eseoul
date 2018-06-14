package main.java.schedule.service;

import java.util.List;
import java.util.Map;
import main.java.schedule.model.LogBean;
import org.springframework.dao.DataAccessException;


public interface IScheduleService{
	
	// ���ǳ��� �������� ������Ʈ
	public void gapanTaxationInfoUpdate();
	
	// ���� �������� ������Ʈ
	public void taxationInfoUpdate();
	
	// �������� ����
	public LogBean insertSunapInfo(LogBean objLogBean);
	
	// �������� ������Ʈ
	public void cpBd600Update();
		
}