/*********************************************************************************************************
 				*최초작성일 : 2006.07.12
				*최초작성자 : jklee, jhlee
				*주요처리내용 : QA게시판 관련 db작업을 처리
				*수정일 :
				*수정자 :
				*수정내용 :
 *********************************************************************************************************/

package main.java.schedule.dao;

import main.java.schedule.model.LogBean;

public interface IScheduleDao {	
	// 가판/노점 수납정보 업데이트
	public void gapanTaxationInfoUpdate();
	
	// 도로 수납정보 업데이트
	public void taxationInfoUpdate();
	
	// 수납정보 저장
	public LogBean insertSunapInfo(LogBean objLogBean);
	
	// 공시지가 업데이트
	public void cpBd600Update();

	

}