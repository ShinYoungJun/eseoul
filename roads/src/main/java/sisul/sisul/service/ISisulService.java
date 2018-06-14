//	2009		Kim Yun Seo

package main.java.sisul.sisul.service;

import java.util.List;

import main.java.sisul.sisul.model.AppealBean;
import main.java.sisul.sisul.model.EqCalculationBean;


public interface ISisulService {

	public	List	executeSearch(int intRn1,int intRn2);
	public	int		executeCount();
	
	public	List	executeJumin_View(String strAdmin_no);
	public	boolean	executeJumin_Modify(AppealBean Bean);

	public	boolean	executeMulgun_Register(EqCalculationBean Bean);
}
