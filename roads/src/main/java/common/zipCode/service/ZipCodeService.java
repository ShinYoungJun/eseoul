//	2009		Kim Yun Seo

package main.java.common.zipCode.service;

import java.util.List;

import main.java.common.zipCode.dao.IZipCodeDao;


public class ZipCodeService	implements	IZipCodeService{

	private IZipCodeDao	iZipCodeDao	= null;

	public	void	setZipCodeDao(IZipCodeDao zipCodeDao)
	{
		this.iZipCodeDao = zipCodeDao;
	}
	
	public List executeZipCodeDoro_nmList(String strDoro_nm)
	{
		return	iZipCodeDao.executeZipCodeDoro_nmList(strDoro_nm);
	}
	
	//********** BEGIN_현진_20120208
	public List executeZipCodeZero_nmList(String strTown, String strDoro_nm, String jibun, String jibu)
	{
		return	iZipCodeDao.executeZipCodeZero_nmList(strTown, strDoro_nm,jibun,jibu );
	}

	public List executeZipCodeList(String strTown, String jibun, String jibu)
	{
		return	iZipCodeDao.executeZipCodeList(strTown,jibun,jibu);
	}

	public List executeBeforeJibun(String ZIP_CL, String SI_NM, String SGG_NM, String EMD_NM, String BON, String BU){
		return	iZipCodeDao.executeBeforeJibun(ZIP_CL,SI_NM,SGG_NM,EMD_NM,BON,BU);
	}	
	public List executeToJibun(String ZIP_CL, String SI_NM, String SGG_NM, String DORO_NM, String BD_BON, String BD_BU){		
		return	iZipCodeDao.executeToJibun(ZIP_CL, SI_NM,SGG_NM,DORO_NM,BD_BON,BD_BU);	
	}
	public List executeJibunConfirm(String ZIP_CL, String SI_NM, String SGG_NM, String EMD_NM, String BON, String BU, String DORO_NM, String BD_BON, String BD_BU){
		return	iZipCodeDao.executeJibunConfirm(ZIP_CL,SI_NM,SGG_NM,EMD_NM,BON,BU,DORO_NM,BD_BON,BD_BU);
	}
	public List executeToDoroNm(String ZIP_CL, String SI_NM, String SGG_NM, String DORO_NM){
		return	iZipCodeDao.executeToDoroNm(ZIP_CL, SI_NM,SGG_NM,DORO_NM);

	}
	public List executeBeforeEmd(String ZIP_CL, String SI_NM, String SGG_NM, String EMD_NM){
		return	iZipCodeDao.executeBeforeEmd(ZIP_CL, SI_NM,SGG_NM,EMD_NM);
	}
	public List executeZipCodeEmd_nmList(String strTown){
		return	iZipCodeDao.executeZipCodeEmd_nmList(strTown);
	}
	public List executeZipCodeDoroEmd(String strTown, String strDoro_nm){
		return	iZipCodeDao.executeZipCodeDoroEmd(strTown, strDoro_nm);
	}

	//********** END_현진_20120209

}
