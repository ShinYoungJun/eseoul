/*********************************************************************************************************
 				*�����ۼ��� : 2006.07.12
				*�����ۼ��� : jklee, jhlee
				*�ֿ�ó������ : QA�Խ��� ���� db�۾��� ó��
				*������ :
				*������ :
				*�������� :
 *********************************************************************************************************/

package main.java.schedule.dao;

import main.java.schedule.model.LogBean;

public interface IScheduleDao {	
	// ����/���� �������� ������Ʈ
	public void gapanTaxationInfoUpdate();
	
	// ���� �������� ������Ʈ
	public void taxationInfoUpdate();
	
	// �������� ����
	public LogBean insertSunapInfo(LogBean objLogBean);
	
	// �������� ������Ʈ
	public void cpBd600Update();

	

}