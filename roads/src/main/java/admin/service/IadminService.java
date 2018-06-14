package main.java.admin.service;

import java.util.List;
import java.util.Map;
//********** BEGIN_현진_20120311
import main.java.admin.model.SectionBean;
//********** END_현진_20120311


public interface IadminService {
	public int executeCountGapan(String gu_cd, String gapanNo, String surveyYear);
	public void executeDeleteGapan(String gu_cd, String gapanNo, String surveyYear);	
	
    //********** BEGIN_현진_20120306
    // public void executeMoveGapan(String gu_cd, String gapanNo, String beforeYear, String afterYear);
    public List getBeforeGapanNo(String gu_cd, String gapanNo, String beforeYear);
    public List getGapanInfo(String gapanNo, String SURVEY_YEAR);
    public List getGapanHead(String gapanNo);
    public List getGapanBase(String gapanNo);
  //********** END_현진_20120306
    
    //********** BEGIN_현진_20120309
    public int getSectionCount(String gu_cd);
	public List getSectionList(String gu_cd, int intCurrentPage, int intCountPerPage);		
  //********** END_현진_20120309  

	//********** BEGIN_현진_20120311
	public boolean setSectionInsert(SectionBean bean);
	public boolean setSectionUpdate(SectionBean bean, String modyGU_CD, String modyGUGAN_CD);
	public boolean sectionDelete(SectionBean bean);
	public List getSectionSelectList(SectionBean bean);
	//********** END_현진_20120311
	//********** BEGIN_현진_20120319
	public boolean changeGapanUpdate(String UPDATE, String SURVEY_YEAR);
	//********** END_현진_20120319
}