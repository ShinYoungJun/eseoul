
package main.java.rojum.survey.service;

import java.util.List;
import java.util.Map;

import main.java.rojum.survey.model.GapanBaseBean;
import main.java.rojum.survey.model.GapanHeadBean;
import main.java.rojum.survey.model.GapanInfoBean;
import main.java.rojum.survey.model.SearchBean;

public interface ISurveyService{
	
	// 가판번호 조회
	public	String	executeCheck_Gapanno(String gapanNo);
	
	//가판 BASE 등록
	public	boolean	executeGapan_Base_Register(GapanBaseBean Bean);
	
	//가판 운영자, 동업자 정보 등록
	public	boolean	executeGapan_Head_Register(GapanHeadBean Bean);
	
	//	GAPAN_INFO  테이블에 등록
	public	boolean	executeGapan_Info_Register(GapanInfoBean Bean);
	
    //기본정보 복사
    public	boolean	insertCopyGapanBase(String newGapanNo, String oldGapanNo);
    
    //운영자 정보 복사
    public	boolean	insertCopyGapanHead(String newGapanNo, String oldGapanNo);
    
    //시설운영정보 복사
    public	boolean	insertCopyGapanInfo(String newGapanNo, String oldGapanNo);
     
	//실태조사 조회
    public List getSurveyList(SearchBean objectSearchBean);

	//실태조사 카운트
    public Map getSurveyListCount(SearchBean objectSearchBean);
    
    //거리조성 변경
    public boolean modifySpecialStreet(GapanInfoBean bean);
    
    

}