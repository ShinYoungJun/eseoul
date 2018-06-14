//	2009		Kim Yun Seo

package main.java.common.zipCode.service;

import java.util.List;


public interface IZipCodeService {

	//********** BEGIN_현진_20120210
	public List executeZipCodeList(String strTown, String jibun, String jibu);
	//********** END_현진_20120210
		
	public List executeZipCodeDoro_nmList(String strDoro_nm);
	
	//********** BEGIN_현진_20120208
	//public List executeZipCodeZero_nmList();
	public List executeZipCodeZero_nmList(String strTown, String strDoro_nm, String jibun, String jibu);
	 //********** END_현진_20120208
	
	//********** BEGIN_현진_20120209
	public List executeJibunConfirm(String ZIP_CL, String SI_NM, String SGG_NM, String EMD_NM, String BON, String BU, String DORO_NM, String BD_BON, String BD_BU);
	public List executeToDoroNm(String ZIP_CL, String SI_NM, String SGG_NM, String DORO_NM);	
	public List executeToJibun(String ZIP_CL, String SI_NM, String SGG_NM, String DORO_NM, String BD_BON, String BD_BU);
	public List executeBeforeEmd(String ZIP_CL, String SI_NM, String SGG_NM, String EMD_NM);
	public List executeBeforeJibun(String ZIP_CL, String SI_NM, String SGG_NM, String EMD_NM, String BON, String BU);
	public List executeZipCodeEmd_nmList(String strTown);
	public List executeZipCodeDoroEmd(String strTown, String strDoro_nm);
	//********** END_현진_20120209	


}
