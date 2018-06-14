//	2009		Kim Yun Seo

package main.java.common.commonCode.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import main.java.common.commonCode.dao.CommonCodeDao;
import main.java.common.commonCode.model.CommonCodeBean;
import main.java.common.commonCode.model.ContactSysInfoBean;
import main.java.common.commonCode.model.DongCodeBean;
import main.java.common.commonCode.model.HistoryBean;
import main.java.common.commonCode.model.RefDeptCodeBean;
import main.java.common.commonCode.model.RefGuCodeBean;
import main.java.common.commonCode.model.TaxCodeBean;
import main.java.common.commonCode.model.UserBean;
//********** BEGIN_����_20120312
import main.java.admin.model.SectionBean; 
//********** END_����_20120312
//********** BEGIN_����_20120314
import main.java.admin.model.RefSectionMappingBean;
//********** END_����_20120314
//********** BEGIN_����_20120319
import main.java.admin.model.PurposeCodeBean;
//********** END_����_20120319
//********** BEGIN_KANG_20120409
import main.java.admin.model.OfficeCodeBean;
//********** END_KANG_20120409


import org.springframework.web.servlet.mvc.multiaction.MultiActionController;


public class CommonCodeService	extends MultiActionController {

	private	CommonCodeDao	commonCode	= null;
	
	
	public void setCommonCodeDao(CommonCodeDao commonCode) {
	    this.commonCode = commonCode;
	}
	
	
	public List getAddrPNU(String admin_no){		
		System.out.println("admin_no!!:"+admin_no);
		return commonCode.executeGetAddrPNU(admin_no);
	} 
	
	public String	executeCommonCode(String Type, String Code, String Title)
	{
		return CommonCode(Type, Code, Title);
	}
	
	//�����ڵ� �̸��� �����´�. Type�� Code�� null�� �ɼ� ����.
	public String	executeCommonCodeNm(String Type, String Code)
	{
		String	CommonCodeNm	= "";
		List	list		= commonCode.executeCommonCode(Type);
		
		if(Type == null || Code == null){ 	return "";	}
		
		CommonCodeBean	Bean	= new CommonCodeBean();
		
		for(int	i = 0	;	i < list.size()	;	i++)
		{
			Bean	= (CommonCodeBean)list.get(i);
			
			if(Code.trim().equals(Bean.getCODE().trim())){
				CommonCodeNm = Bean.getNAME();
			}
		}
		
		return CommonCodeNm;
	}
	
	public String	executeGapanCode(String Type, String Code, String Title)
	{
		return GapanCode(Type, Code, Title);
	}
	
	//	�����ڵ�
	public String	executeSearchCommonCode(String Type, String Code)
	{
		List	list	= commonCode.executeCommonCode(Type);

		CommonCodeBean	Bean	= new CommonCodeBean();
		
		for(int	i = 0	;	i < list.size()	;	i++)
		{
			Bean	= (CommonCodeBean)list.get(i);
			
			if(Bean.getCODE().trim().equals(Code))
				return	Bean.getNAME();
		}
		
		return "";
	}	
	
	/**
	 * type�� �ڵ� ����Ʈ 
	 * @param type
	 * @return List<Map<code, name>>
	 */
	@SuppressWarnings("unchecked")
	public Map<Integer, String> getCommonCodes(String type) {
		List<CommonCodeBean> beans =   commonCode.executeCommonCode(type);
		Map<Integer, String> map = new HashMap<Integer,String>();
		if (beans != null && beans.size() > 0) {
			for ( CommonCodeBean bean : beans) {
				int code = Integer.parseInt(bean.getCODE());
				String name = bean.getNAME();
				map.put(code, name);
			}
			return map;
		}
		return null;
	}
	
	//	�����ڵ�
	public String	executeTaxCode(String TAXACC, String Code, String Title)
	{
		return TaxCode(TAXACC, Code, Title);
	}
	
	//	SI �̸�
	public String	executeSiNm(String SI_NM)
	{
		String	Si_Name	= "";
		
		Si_Name	= commonCode.getCommonSiName(SI_NM);
		
		return Si_Name;
	}
	
	//	������
	public String	executeBJDongCode(String SI_NM, String GU_NM, String BJ_CD)
	{
		String	CommonCode	= "";
		
		if(BJ_CD	==	null)
			CommonCode	= CommonBJDongCodeRegister(SI_NM, GU_NM);
		else
			CommonCode	= CommonBJDongCodeModify(SI_NM, GU_NM, BJ_CD.trim());
		
		return CommonCode;
	}
	
	//	������
	public String	executeSearchBJDongCode(String SI_NM, String GU_NM, String BJ_CD)
	{
		List	list	= commonCode.executeBJDongCode_NM(SI_NM, GU_NM);
		
		DongCodeBean	Bean	= new DongCodeBean();

		for(int	i = 0	;	i < list.size()	;	i++)
		{
			Bean	= (DongCodeBean)list.get(i);
			
			if(Bean.getBJ_CD().trim().equals(BJ_CD))
				return	Bean.getBJ_NM();
		}
	
		return "";
	}
	
	//	������
	public String	executeHJDongCode(String SI_NM, String GU_NM, String HJ_CD)
	{
		String	CommonCode	= "";
		
		if(HJ_CD	==	null)
			CommonCode	= CommonHJDongCodeRegister(SI_NM, GU_NM);
		else
			CommonCode	= CommonHJDongCodeModify(SI_NM, GU_NM, HJ_CD.trim());
		
		return CommonCode;
	}
	
	//	������
	public String	executeSearchHJDongCode(String SI_NM, String GU_NM, String HJ_CD)
	{
		List	list	= commonCode.executeHJDongCode(SI_NM, GU_NM);

		DongCodeBean	Bean	= new DongCodeBean();
		
		for(int	i = 0	;	i < list.size()	;	i++)
		{
			Bean	= (DongCodeBean)list.get(i);
			
			if(Bean.getHJ_CD().trim().equals(HJ_CD))
				return	Bean.getHJ_NM();
		}
	
		return "";
	}

	private String	CommonCode(String Type, String Code, String Title)
	{
		String	CommonCode	= "";
		List	list		= commonCode.executeCommonCode(Type);
		
		if(Title	!= null)
			CommonCode	= "<option value='' selected>::" + Title + "::</option>";
			
		CommonCodeBean	Bean	= new CommonCodeBean();
		
		for(int	i = 0	;	i < list.size()	;	i++)
		{
			Bean	= (CommonCodeBean)list.get(i);
			
			if(!Bean.getNAME().trim().equals(""))
			{
				if(Bean.getCODE().trim().equals(Code))
					CommonCode	+= "<option value=" + Bean.getCODE() + " selected>" + Bean.getNAME() + "</option>";
				else
					CommonCode	+= "<option value=" + Bean.getCODE() + ">" + Bean.getNAME() + "</option>";
			}
		}
		
		return CommonCode;
	}
	
	
	private String	GapanCode(String Type, String Code, String Title)
	{
		String	GapanCode	= "";
		List	list		= commonCode.executeGapanCode(Type);
		
		if(Title	!= null)
			GapanCode	= "<option value='' selected>" + Title + "</option>";
			
		CommonCodeBean	Bean	= new CommonCodeBean();
		
		for(int	i = 0	;	i < list.size()	;	i++)
		{
			Bean	= (CommonCodeBean)list.get(i);
			
			if(!Bean.getNAME().trim().equals(""))
			{
				if(Bean.getCODE().trim().equals(Code))
					GapanCode	+= "<option value=" + Bean.getCODE() + " selected>" + Bean.getNAME() + "</option>";
				else
					GapanCode	+= "<option value=" + Bean.getCODE() + ">" + Bean.getNAME() + "</option>";
			}
		}
		
		return GapanCode;
	}

	
	private String	CommonBJDongCodeRegister(String SI_NM, String GU_NM)
	{
		String	CommonCode	= "<option value='' selected>::������::</option>";
		List	list		= commonCode.executeBJDongCode(SI_NM, GU_NM);
		
		DongCodeBean	Bean	= new DongCodeBean();
		
		for(int	i = 0	;	i < list.size()	;	i++)
		{
			Bean	= (DongCodeBean)list.get(i);
			
			if(!Bean.getBJ_CD().trim().equals("00000"))
			{
				CommonCode	+= "<option value=" + Bean.getBJ_CD() + ">" + Bean.getBJ_NM() + "</option>";
			}
		}
		
		return CommonCode;
	}
	

	private String	CommonBJDongCodeModify(String SI_NM, String GU_NM, String BJ_CD)
	{
		String	CommonCode	= "";
		List	list		= commonCode.executeBJDongCode(SI_NM, GU_NM);

		DongCodeBean	Bean	= new DongCodeBean();
		
		for(int	i = 0	;	i < list.size()	;	i++)
		{
			Bean	= (DongCodeBean)list.get(i);
			
			if(!Bean.getBJ_CD().trim().equals("00000"))
			{
				if(Bean.getBJ_CD().trim().equals(BJ_CD))
					CommonCode	+= "<option value=" + Bean.getBJ_CD() + " selected>" + Bean.getBJ_NM() + "</option>";
				else
					CommonCode	+= "<option value=" + Bean.getBJ_CD() + ">" + Bean.getBJ_NM() + "</option>";
			}
		}
	
		return CommonCode;
	}
	
	
	public String	CommonBJDongCodeSearch(String SI_NM, String GU_NM, String BJ_CD)
	{
		String	CommonCode	= "<option value='' selected>::������::</option>";
		List	list		= commonCode.executeBJDongCode(SI_NM, GU_NM);

		DongCodeBean	Bean	= new DongCodeBean();
		
		for(int	i = 0	;	i < list.size()	;	i++)
		{
			Bean	= (DongCodeBean)list.get(i);
			
			if(!Bean.getBJ_CD().trim().equals("00000"))
			{
				if(Bean.getBJ_CD().trim().equals(BJ_CD))
					CommonCode	+= "<option value=" + Bean.getBJ_CD() + " selected>" + Bean.getBJ_NM() + "</option>";
				else
					CommonCode	+= "<option value=" + Bean.getBJ_CD() + ">" + Bean.getBJ_NM() + "</option>";
			}
		}
	
		return CommonCode;
	}

	/**
	 * ���ڵ尡 ������� ��쿡 ����� ��ü���� ���� ��������
	 * @param GUGAN_CD
	 * @return
	 */
	public String	CommonGapanSeoulGuganCodeSearch(String GUGAN_CD)
	{
		/* 20130605 id=sungh83 */
		String	CommonCode	= "<option value='' selected>::���� ����::</option>";
		List	list		= commonCode.executeGapanSeoulGuganCode(); 
		SectionBean	Bean	= new SectionBean();
		String name="";
		for(int	i = 0	;	i < list.size()	;	i++)
		{
			Bean	= (SectionBean)list.get(i);
			name = "�� " + Bean.getGUGAN_CD() +"���� -  "+ Bean.getGUGAN_NAME() ;
			if(!Bean.getGUGAN_CD().trim().equals("")){
			/*	
				if(Bean.getGUGAN_CD().trim().equals(GUGAN_CD))
					CommonCode	+= "<option value=" + Bean.getGUGAN_CD() + " selected>" + name + "</option>";
				else
			*/	
					CommonCode	+= "<option value=" + Bean.getGUGAN_CD() + ">" + name + "</option>";
			}
				
		}
		return CommonCode;
	}
	
	/**
	 * ���ڵ尡 ����� ������ �� ��� ����� ���� �� ���� ��������
	 * @param GU_CD
	 * @param GUGAN_CD
	 * @return
	 */
	public String	CommonGapanGuganCodeSearch(String GU_CD, String GUGAN_CD)
	{
		/* BEGIN_����_20120312 */ 
		String	CommonCode	= "<option value='' selected>::���� ����::</option>";
		List	list		= commonCode.executeGapanGuganCode(GU_CD);

		SectionBean	Bean	= new SectionBean();
		String name="";
		for(int	i = 0	;	i < list.size()	;	i++)
		{
			Bean	= (SectionBean)list.get(i);
			name = "�� " + Bean.getGUGAN_CD() +"���� -  "+ Bean.getGUGAN_NAME() ;
			if(!Bean.getGUGAN_CD().trim().equals("")){
				if(Bean.getGUGAN_CD().trim().equals(GUGAN_CD))
					CommonCode	+= "<option value=" + Bean.getGUGAN_CD() + " selected>" + name + "</option>";
				else
					CommonCode	+= "<option value=" + Bean.getGUGAN_CD() + ">" + name + "</option>";
			}
				
		}
		return CommonCode;
	}
	
	
	public String	CommonGapanGuganCodeName(String GU_CD, String SURVEY_YEAR)
	{
		List	list	= commonCode.executeGapanGuganCodeName(GU_CD, SURVEY_YEAR);
		
		if(list	!= null)
		{
			String REG_SEQ	= (String)list.get(0);
			
			return	REG_SEQ;
		}
		
		return null;
	}
	//********** END_����_20120312

	private String	CommonHJDongCodeRegister(String SI_NM, String GU_NM)
	{
		String	CommonCode	= "<option value='' selected>::������::</option>";
		List	list		= commonCode.executeHJDongCode(SI_NM, GU_NM);
		
		DongCodeBean	Bean	= new DongCodeBean();

		for(int	i = 0	;	i < list.size()	;	i++)
		{
			Bean	= (DongCodeBean)list.get(i);
			
			if(!Bean.getHJ_CD().trim().equals("00000"))
			{
				CommonCode	+= "<option value=" + Bean.getHJ_CD() + ">" + Bean.getHJ_NM() + "</option>";
			}
		}
		
		return CommonCode;
	}
	

	private String	CommonHJDongCodeModify(String SI_NM, String GU_NM, String HJ_CD)
	{
		String	CommonCode	= "";
		List	list		= commonCode.executeHJDongCode(SI_NM, GU_NM);

		DongCodeBean	Bean	= new DongCodeBean();
		
		for(int	i = 0	;	i < list.size()	;	i++)
		{
			Bean	= (DongCodeBean)list.get(i);
			
			if(!Bean.getHJ_CD().trim().equals("00000"))
			{
				if(Bean.getHJ_CD().trim().equals(HJ_CD))
					CommonCode	+= "<option value=" + Bean.getHJ_CD() + " selected>" + Bean.getHJ_NM() + "</option>";
				else
					CommonCode	+= "<option value=" + Bean.getHJ_CD() + ">" + Bean.getHJ_NM() + "</option>";
			}
		}
	
		return CommonCode;
	}
	
	
	public String	CommonHJDongCodeSearch(String SI_NM, String GU_NM, String HJ_CD)
	{
		String	CommonCode	= "<option value='' selected>::������::</option>";
		List	list		= commonCode.executeHJDongCode(SI_NM, GU_NM);

		DongCodeBean	Bean	= new DongCodeBean();
		
		for(int	i = 0	;	i < list.size()	;	i++)
		{
			Bean	= (DongCodeBean)list.get(i);
			
			if(!Bean.getHJ_CD().trim().equals("00000"))
			{
				if(Bean.getHJ_CD().trim().equals(HJ_CD))
					CommonCode	+= "<option value=" + Bean.getHJ_CD() + " selected>" + Bean.getHJ_NM() + "</option>";
				else
					CommonCode	+= "<option value=" + Bean.getHJ_CD() + ">" + Bean.getHJ_NM() + "</option>";
			}
		}
	
		return CommonCode;
	}
	
	
	private String	TaxCode(String TAXACC, String Code, String Title)
	{
		String	TaxCode	= "";
		List	list		= commonCode.executeTaxCode(TAXACC);
		
		if(Title	!= null)
			TaxCode	= "<option value='' selected>::" + Title + "::</option>";
			
		TaxCodeBean	Bean	= new TaxCodeBean();
		
		for(int	i = 0	;	i < list.size()	;	i++)
		{
			Bean	= (TaxCodeBean)list.get(i);
			
			if(!Bean.getTAXNAME().trim().equals(""))
			{
				if(Bean.getTAXCODE().trim().equals(Code))
					TaxCode	+= "<option value=" + Bean.getTAXCODE() + " selected>" + Bean.getTAXNAME() + "</option>";
				else
					TaxCode	+= "<option value=" + Bean.getTAXCODE() + ">" + Bean.getTAXNAME() + "</option>";
			}
		}
		
		return TaxCode;
	}
	
	
	//	�� �̸��� �����´�. (REF_DONGCODE TABLE)
	public	String	SearchGuName(String SI_CD, String GU_CD)
	{
		List	list	= commonCode.executeSearchGuName(SI_CD, GU_CD);
		
		UserBean	Bean	= new UserBean();
		
		for(int	i = 0	;	i < list.size()	;	i++)
		{
			Bean	= (UserBean)list.get(i);
			
			return	Bean.getSIGU_CD().trim();
		}
		
		return	null;
	}
	
	
	public String	executeSearchTaxCode(String TAXACC, String Code)
	{
		System.out.println("TAXACC ==>" + TAXACC);
		System.out.println("Code ==>" + Code);
		List	list	= commonCode.executeTaxCode(TAXACC);
		
		TaxCodeBean	Bean	= new TaxCodeBean();
		
		for(int	i = 0	;	i < list.size()	;	i++)
		{
			Bean	= (TaxCodeBean)list.get(i);
			
			if(Bean.getTAXCODE().trim().equals(Code))
				return	Bean.getTAXNAME();
		}
		
		return "";
	}
	
	public List	getTaxCodeList()
	{
		List	list	= commonCode.executeTaxCode("%");
		
		return list;
	}
	
	
	
	//	������ ������ �����´�.
	public UserBean	executeUserSearch(String USERID)
	{
		List	list	= commonCode.executeUserSearch(USERID);
		
		UserBean	Bean	= new UserBean();
		String		SIGU_CD	= null;
		
		if(list	!= null)
		{
			Bean	= (UserBean)list.get(0);
			
			System.out.println(":::::::::::::::::::::::::::::::::::::::" + Bean.getSIGU_CD().toString());
			
			SIGU_CD	= Bean.getSIGU_CD().substring(2, 5);
			
			Bean.setSIGU_CD(SIGU_CD);
			
			return	Bean;
		}
		
		return null;
	}
	
//	������ ������ �����´�.
	public ContactSysInfoBean executeContactsys_Info(String sido_cd, String sigu_cd)
	{
		List	list	= commonCode.executeContactsys_Info(sido_cd, sigu_cd);
		
		ContactSysInfoBean	contactSysInfoBean	= new ContactSysInfoBean();

		if(list != null && list.size() > 0)
		{
			contactSysInfoBean	= (ContactSysInfoBean)list.get(0);
			
			return	contactSysInfoBean;
		}
		
		return contactSysInfoBean;
	}
	
	public RefDeptCodeBean getRef_DeptCode(String siguCode) {
		List	list	= commonCode.executeRef_DeptCode(siguCode);
		
		RefDeptCodeBean	refDeptCodeBean	= new RefDeptCodeBean();
		
		if(list	!= null)
		{
			
			refDeptCodeBean	= (RefDeptCodeBean)list.get(0);
			
			return	refDeptCodeBean;
		}
		
		return null;
	}
	
	/**
	 * �ñ��ڵ��� �μ� ��ȸ.
	 * args���� orgcode,�� deptcode�� �ɼ����� ���޵ɼ� �ִ�.
	 * @param siguCode
	 * @param args
	 * @return
	 */
	public List<RefDeptCodeBean> getRefDepts(String siguCode, String... args) {
		@SuppressWarnings("unchecked")
		List<RefDeptCodeBean> list = commonCode.executeRef_DeptCode(siguCode);
		String orgCd = null, deptCd = null;
		boolean checkOrg = false;
		boolean checkDept = false;
		if (args != null) {
			if (args.length == 2) {
				checkOrg = true;
				checkDept = true;
				orgCd = args[0];
				deptCd = args[1];
			} else if (args.length == 1) {
				checkOrg = true;
				orgCd = args[0];
			}
		}
		
		if (list != null && list.size() > 0) {
			int size = list.size();
			for (int i = 0; i< size; i++) {
				RefDeptCodeBean bean = list.get(i);
				if (checkOrg && orgCd != null && !bean.getORG_CD().equals(orgCd)) {
					list.remove(i);
					size = list.size();
					i--;
					continue;
				}
				if (checkDept && deptCd != null && !bean.getDEPT_CD().equals(deptCd)) {
					list.remove(i);
					size = list.size();
					i--;
					continue;
				}
			}
		}
		
		return list;
	}
	
	public String genRefDeptList2Html(String siguCode, String selected) {
//		logger.info(String.format("genRefDeptList2HTML(%s, %s)", siguCode, selected));
		@SuppressWarnings("unchecked")
		List<RefDeptCodeBean> list = commonCode.executeRef_DeptCode(siguCode);
//		logger.info(String.format("genRefDeptList2HTML(%s, %s) list = %d", siguCode, selected, list.size()));


		if (list != null && list.size() > 0) {
			StringBuilder sb = new StringBuilder();
			for (RefDeptCodeBean bean : list) {
				sb.append(String.format(
						"<option value='%s' %s>%s</option>",
						bean.getDEPT_CD(), 
						bean.getDEPT_CD().equals(selected) ? "selected" : "",
						bean.getDEPT_NM()));
			}
			return sb.toString();
		} 
		return "";
		
	}
	
	// occupancy_type �ڵ��� ��� ��� ��� ���ο� ���� ����
	public String	executeCommonCode_occupancy(String Type, String Code, String Title)
	{
		String	CommonCode	= "";
		List	list		= commonCode.executeCommonCode(Type);
		
		if(Title	!= null)
			CommonCode	= "<option value='' selected>::" + Title + "::</option>";
			
		CommonCodeBean	Bean	= new CommonCodeBean();
		
		for(int	i = 0	;	i < list.size()	;	i++)
		{
			Bean	= (CommonCodeBean)list.get(i);
			
			if( !"4".equals(Bean.getCODE().trim()) ){
				if(!Bean.getNAME().trim().equals(""))
				{
					if(Bean.getCODE().trim().equals(Code))
						CommonCode	+= "<option value=" + Bean.getCODE() + " selected>" + Bean.getNAME() + "</option>";
					else
						CommonCode	+= "<option value=" + Bean.getCODE() + ">" + Bean.getNAME() + "</option>";
				}
			}
		}
		
		return CommonCode;
	}
	
	public String executeBJDongName(String SI_CD, String GU_CD, String BJ_CD){
		return commonCode.executeBJDongName(SI_CD,GU_CD,BJ_CD); 
	}
	
	public String executeRegYear(String ADMIN_NO){
		return commonCode.executeRegYear(ADMIN_NO); 
	}
    // �ΰ���ġ�� �ݿ� ���� �Ǵ�
	public boolean inquiryVatYN(String ADMIN_NO){
		return commonCode.inquiryVatYN(ADMIN_NO);
		
	}
	
	public String executeGuCode(String user_gu_cd,String gu_cd){
		
		String	CommonCode	= "";
		List	list		= commonCode.executeGuCdList();
		
		RefGuCodeBean	Bean	= new RefGuCodeBean();
		
		for(int	i = 0	;	i < list.size()	;	i++)
		{
			Bean	= (RefGuCodeBean)list.get(i);
			
			if(Bean.getGU_CD().equals("000"))
				CommonCode += "<option value='' selected>::����::</option>"; 
			else if(Bean.getGU_CD().trim().equals(gu_cd))
				CommonCode	+= "<option value=" + Bean.getGU_CD() + " selected>" + Bean.getGU_NM() + "</option>";
			else
				CommonCode	+= "<option value=" + Bean.getGU_CD() + ">" + Bean.getGU_NM() + "</option>";
		}
		
		return CommonCode;
	}
	
	/**
	 * ���� �������� HTML ������ �ɼǸ���Ʈ��  ��ȯ
	 * @param user_gu_cd
	 * @param gu_cd
	 * @return
	 */
	public String executeGuCdList(String user_gu_cd,String gu_cd){
		
		String	CommonCode	= "";
		List<RefGuCodeBean>	list = commonCode.executeGuCdList();
		
		RefGuCodeBean	Bean	= new RefGuCodeBean();
	//	System.out.println("������ڵ�"+user_gu_cd);
		
		if(user_gu_cd.equals("000")){
			CommonCode	+= "<option>" + ":: ���� ::" + "</option>";
		}
		
		for(int	i = 0	;	i < list.size()	;	i++)
		{
			Bean	= list.get(i);
			
			if(user_gu_cd.equals("000")){
			    
				if(Bean.getGU_CD().trim().equals(gu_cd))
					CommonCode	+= "<option value=" + Bean.getGU_CD() + " selected>" + Bean.getGU_NM() + "</option>";
				else
					CommonCode	+= "<option value=" + Bean.getGU_CD() + ">" + Bean.getGU_NM() + "</option>";
			}else{
				if(Bean.getGU_CD().trim().equals(gu_cd))
					CommonCode	+= "<option value=" + Bean.getGU_CD() + " selected>" + Bean.getGU_NM() + "</option>";
			}
		}
		
		return CommonCode;
	}
	
	//********** BEGIN_����_20120314
	public String executeSectionList(String USING_MODE, String SECTION){
		
		String	CommonCode	= "<option value='0' selected>:: ���� ::</option>";
		List	list		= commonCode.executeSectionList(USING_MODE);
		
		RefSectionMappingBean	Bean	= new RefSectionMappingBean();
		
		for(int	i = 0	;	i < list.size()	;	i++)
		{
			Bean	= (RefSectionMappingBean)list.get(i);
			
			if(Bean.getSECTION().trim().equals(SECTION))
				CommonCode	+= "<option value=" + Bean.getSECTION() + " selected>" + Bean.getSECTION_NAME() + "</option>";
			else
				CommonCode	+= "<option value=" + Bean.getSECTION() + ">" + Bean.getSECTION_NAME() + "</option>";
		}
		
		return CommonCode;
	}
	
	//********** BEGIN_����_20120319
	//********** BEGIN_KANG_20120409
	public String executeOfficeList(String gu_code, String office){
		
		String	CommonCode	= "<option value='0' selected>:: ���� ::</option>";
		List	list		= commonCode.executeOfficeList(gu_code,office);
		
		OfficeCodeBean	Bean	= new OfficeCodeBean();
		
		for(int	i = 0	;	i < list.size()	;	i++)
		{
			Bean	= (OfficeCodeBean)list.get(i);
			
			if(Bean.getJIJUM_CD().trim().equals(office))
				CommonCode	+= "<option value=" + Bean.getJIJUM_CD() + "/" + Bean.getJIJUM_NM() + " selected>" + Bean.getJIJUM_NM() + "</option>";
			else
				CommonCode	+= "<option value=" + Bean.getJIJUM_CD() + "/" + Bean.getJIJUM_NM() + ">" + Bean.getJIJUM_NM() + "</option>";
		}
		
		return CommonCode;
	}
	
	//********** END_KANG_20120409
	
	public String executePurposeCodeDetailModify(PurposeCodeBean bean){
		
		String	PurposeCode	= "";
		boolean result	= commonCode.executePurposeCodeDetailModify(bean);
		
	
		if(result){
			PurposeCode += "�����Ǿ����ϴ�." + "/";
		}else{
			PurposeCode += "�����Ͽ����ϴ�" + "/";
		}
		PurposeCode += bean.getYOYUL() + "/";
		PurposeCode += bean.getCHECK_YN() + "/";
		PurposeCode += bean.getGIGAN() + "/";
		PurposeCode += bean.getDANWII() + "/";
		PurposeCode += bean.getMOMEY() + "/";
		
		return PurposeCode;
	}
	
	
	public String executePurposeCodeDetailSelect(PurposeCodeBean bean){
		
		String	PurposeCode	= "";
		List	list		= commonCode.executePurposeCodeDetailSelect(bean);
		
		PurposeCodeBean	Bean	= new PurposeCodeBean();		
		Bean	= (PurposeCodeBean)list.get(0);
			
		PurposeCode += Bean.getYOYUL() + "/";
		PurposeCode += Bean.getCHECK_YN() + "/";
		PurposeCode += Bean.getGIGAN() + "/";
		PurposeCode += Bean.getDANWII() + "/";
		PurposeCode += Bean.getMOMEY() + "/";
		PurposeCode += Bean.getCODE() + "/";
		
		return PurposeCode;
	}
		
	//********** END_����_20120319
	//********** BEGIN_����_20120320
	public List executePurposeCodeSelect(PurposeCodeBean bean){
		
		String	PurposeCode	= "";
		List	list		= commonCode.executePurposeCodeDetailSelect(bean);
		return list;
	}
	
	public PurposeCodeBean executePurposeNewInsertList(PurposeCodeBean bean){
		
		PurposeCodeBean Bean = new PurposeCodeBean();
		PurposeCodeBean Temp = new PurposeCodeBean();
		Bean.setSECTION_NAME(commonCode.executePurposeNewInsertList(bean));
		
		List<PurposeCodeBean> ClassCdlist = commonCode.executePurposeNewInsertListClassCd(bean);
		if(ClassCdlist.size()>0){
			Temp = (PurposeCodeBean)ClassCdlist.get(0);
			Bean.setCLASS_CD(Temp.getCLASS_CD());
			Bean.setCLASS_NM(Temp.getCLASS_NM());
		}
		List<PurposeCodeBean> SortCdlist = commonCode.executePurposeNewInsertListSortCd(bean);
		if(SortCdlist.size()>0){
			Temp = (PurposeCodeBean)SortCdlist.get(0);
			Bean.setSORT_CD(Temp.getSORT_CD());
			Bean.setSORT_NM(Temp.getSORT_NM());
		}
		
		return Bean;
	}
	
	public String executePurposeNewClassCd(PurposeCodeBean bean){
		return commonCode.executePurposeNewClassCd(bean);
	}
	public String executePurposeNewSortCd(PurposeCodeBean bean){
		return commonCode.executePurposeNewSortCd(bean);
	}
	public String executePurposeNewKindCd(PurposeCodeBean bean){
		return commonCode.executePurposeNewKindCd(bean);
	}
	
	public boolean purposeCodeNewListInsert(PurposeCodeBean bean){
		return commonCode.purposeCodeNewListInsert(bean);
	}
	public boolean purposeCodeNewListDelete(PurposeCodeBean bean){
		return commonCode.purposeCodeNewListDelete(bean);
	}
	public boolean purposeCodeNewListUpdateClassNm(PurposeCodeBean bean, String modySECTION, String modyCODE){
		return commonCode.purposeCodeNewListUpdateClassNm(bean, modySECTION, modyCODE);
	}
	public boolean purposeCodeNewListUpdateSortNm(PurposeCodeBean bean, String modySECTION, String modyCODE){
		return commonCode.purposeCodeNewListUpdateSortNm(bean, modySECTION, modyCODE);
	}
	public boolean purposeCodeNewListUpdateKindNm(PurposeCodeBean bean, String modySECTION, String modyCODE){
		return commonCode.purposeCodeNewListUpdateKindNm(bean, modySECTION, modyCODE);
	}
	//********** END_����_20120320

	
	
	public String executeSectionUsing(String Using){
		
		String	CommonCode	= "";
		List	list		= commonCode.executeSectionUsing();
		
		RefSectionMappingBean	Bean	= new RefSectionMappingBean();
		String value = "";
		for(int	i = 0	;	i < list.size()	;	i++)
		{
			Bean	= (RefSectionMappingBean)list.get(i);
			
			if(Bean.getUSING_MODE().equals("1")){ value = "���� ����"; }
			if(Bean.getUSING_MODE().equals("2")){ value = "�ü��� ����"; }
			if(Bean.getUSING_MODE().equals("3")){ value = "�����󿵾��ü� ����"; }
			if(Bean.getUSING_MODE().equals("4")){ value = "�Ÿ����� ��ġ�� ����"; }
				
			if(Bean.getUSING_MODE().trim().equals(Using))
				CommonCode	+= "<option value=" + Bean.getUSING_MODE() + " selected>" + value + "</option>";
			else
				CommonCode	+= "<option value=" + Bean.getUSING_MODE() + ">" + value + "</option>";
		}
		
		return CommonCode;
	}
	
	//********** END_����_20120314

	//�̷����� �߰�
	public boolean insertHistoryInfo(HistoryBean bean){
		return commonCode.insertHistoryInfo(bean);
	}
	
	//********** BEGIN_����_20120228
	public	List	executeUserDeptSearch(String orgCd){
		return commonCode.executeUserDeptSearch(orgCd);
	}
	//********** END_����_20120228

	
}
