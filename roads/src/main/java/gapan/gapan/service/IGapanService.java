package main.java.gapan.gapan.service;

import java.util.List;

import main.java.gapan.gapan.model.BloomBean;
import main.java.gapan.gapan.model.FamilyBean;
import main.java.gapan.gapan.model.GapanBaseBean;
import main.java.gapan.gapan.model.GapanBean;
import main.java.gapan.gapan.model.GapanHeadBean;
import main.java.gapan.gapan.model.GapanInfoBean;
import main.java.gapan.gapan.model.OperBean;
import main.java.gapan.gapan.model.JumjiSearchBean;
import main.java.jumyong.minwon.model.MinwonBean;

public interface IGapanService {

	public	List	executeSearch(GapanBean Bean, int intRn1,int intRn2);
	public	int		executeCount(GapanBean Bean);
	public  List getOperatorInfo(String gapanNo);
	public 	FamilyBean getFamilyInfo(String gapanNo);
	public 	BloomBean getBloomInfo(String gapanNo);
	public 	OperBean getOperInfo(String gapanNo);

	//예) 740101_4_0001   //(구코드+법정동코드) + _4_ + SEQ 
	public 	String executeCheck_Gapanno(String gapan_num);					//가판번호를 생성하기 위해 해당 주민번호로 등록된 민원이 있는지 조회
	public 	boolean executeGapan_Base_Register(GapanBaseBean Bean);			//GAPAN_BASE에 저장 한다.
	public	boolean	executeMinwon_Register(MinwonBean Bean);				//민원 정보를 저장한다.
	public boolean executeGapan_Head_Register(GapanHeadBean gapanHeadBean);	//가판 운영자, 동업자 정보를 저장
	public boolean executeGapan_Info_Register(GapanInfoBean gapanInfoBean);	//시설, 운영 정보를 저장
	
	public	List	executeSearch_Jumji(JumjiSearchBean Bean, int intRn1, int intRn2);
	public	int		executeSearch_JumjiCount(JumjiSearchBean Bean);
}

