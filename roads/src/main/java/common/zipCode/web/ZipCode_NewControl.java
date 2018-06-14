package main.java.common.zipCode.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import main.java.common.zipCode.model.ZipCodeBean;
import main.java.common.zipCode.service.IZipCodeService;

import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import java.util.List;

public class ZipCode_NewControl	extends MultiActionController{

	private	IZipCodeService		iZipCodeService	= null;

	public void setZipCodeService(IZipCodeService zipCodeService)
	{
		this.iZipCodeService = zipCodeService;
	}

	public	ModelAndView	ZipCode_New(HttpServletRequest request, HttpServletResponse response) throws Exception
	{
		String strTown 			= ServletRequestUtils.getStringParameter(request, "town", "");
		String strDoro_nm 			= ServletRequestUtils.getStringParameter(request, "doro_nm", "");
		
		String openerPost 		= ServletRequestUtils.getStringParameter(request, "openerPost", "");
		String openerAddr 		= ServletRequestUtils.getStringParameter(request, "openerAddr", "");
		String openerAddrNew 	= ServletRequestUtils.getStringParameter(request, "openerAddrNew", "");
		String openerSi 		= ServletRequestUtils.getStringParameter(request, "openerSi", "");
		String openerGun 		= ServletRequestUtils.getStringParameter(request, "openerGun", "");
		String openerDoro 		= ServletRequestUtils.getStringParameter(request, "openerDoro", "");
		String openerBd 		= ServletRequestUtils.getStringParameter(request, "openerBd", "");
		//********** BEGIN_현진_20120209
		String openerEmd 		= ServletRequestUtils.getStringParameter(request, "openerEmd", "");
		//********** END_현진_20120209
		//********** BEGIN_현진_20120210

		String openerBon 		= ServletRequestUtils.getStringParameter(request, "openerBon", "");
		String openerBu 		= ServletRequestUtils.getStringParameter(request, "openerBu", "");
		String jibun 		= ServletRequestUtils.getStringParameter(request, "jibun", "");
		String jibu 		= ServletRequestUtils.getStringParameter(request, "jibu", "");
		//********** END_현진_20120210
			
		
		// added by samlee .
		request.setAttribute("mode", "result");
		request.setAttribute("town", strTown);
		request.setAttribute("doro_nm", strDoro_nm);
		
		request.setAttribute("openerPost", openerPost);
		request.setAttribute("openerAddr", openerAddr);
		request.setAttribute("openerAddrNew", openerAddrNew); 

		request.setAttribute("openerSi", openerSi);
		request.setAttribute("openerGun", openerGun);
		request.setAttribute("openerDoro", openerDoro);
		request.setAttribute("openerBd", openerBd); 
		//********** BEGIN_현진_20120209
		request.setAttribute("openerEmd", openerEmd);		
		request.setAttribute("jibun", jibun);
		request.setAttribute("jibu", jibu);
		request.setAttribute("openerBon", openerBon);
		request.setAttribute("openerBu", openerBu);
		//********** END_현진_20120210
		
		List result = null;
		
		if((strTown.equals("")||strTown == null)&&(strDoro_nm.equals("")||strDoro_nm == null)){
			result = null;
		}else if((strTown.equals("")||strTown==null)&&(!(strDoro_nm.equals(""))&&(strDoro_nm!=null)) ){
			System.out.println("here.???");
			result = iZipCodeService.executeZipCodeDoro_nmList(strDoro_nm);
		}else if((!(strTown.equals(""))&& strTown != null) && (strDoro_nm.equals("")||strDoro_nm == null) ){
			System.out.println("there.???");
			if(!(jibun.equals(""))&&(jibun!=null)){
				System.out.println("번지가 있을 때");
				result = iZipCodeService.executeZipCodeList(strTown, jibun, jibu);	
			}else{
				System.out.println("번지가 없을 대");
				result = iZipCodeService.executeZipCodeEmd_nmList(strTown);
			}			
		}else{
			System.out.println("last one");
			if(!(jibun.equals(""))&&(jibun!=null)){
				System.out.println("번지가 있을 때");
				result = iZipCodeService.executeZipCodeZero_nmList(strTown, strDoro_nm, jibun, jibu);	
			}else{
				System.out.println("번지가 없을 대");
				result = iZipCodeService.executeZipCodeDoroEmd(strTown, strDoro_nm);
			}
				
		}
		return	new ModelAndView("/common/zipCode/ZipCode_New", "zipCode_New", result);
		
	}
	
	public	ModelAndView ZipCode_jibun(HttpServletRequest request, HttpServletResponse response) throws Exception	{
		
		ZipCodeBean	Bean	= new ZipCodeBean();
		bind(request,Bean);
		String ZIP_CL	   	= Bean.getZIP_CL();
		ZIP_CL = ZIP_CL.replace("-", "");
		String SI_NM   	   	= Bean.getSI_NM();                 
		String SGG_NM      	= Bean.getSGG_NM();                
		String EMD_NM      	= Bean.getEMD_NM();                
		String RI_NM       	= Bean.getRI_NM();                 
		String BD_NM       	= Bean.getBD_NM();                 
		String DORO_NM     	= Bean.getDORO_NM();               
		String BON			= Bean.getBON().trim();		           
		String BU			= Bean.getBU().trim();				
		String BD_BON	   	= Bean.getBD_BON().trim();	          
		String BD_BU	   	= Bean.getBD_BU().trim();	       
		String ADDR2 		= ServletRequestUtils.getStringParameter(request, "ADDR2", "");
		String BD_DET_NM 	= ServletRequestUtils.getStringParameter(request, "BD_DET_NM", "");

		request.setAttribute("oADDR1",ServletRequestUtils.getStringParameter(request,"oADDR1", ""));
		request.setAttribute("oBON",ServletRequestUtils.getStringParameter(request,"oBON", ""));     	
		request.setAttribute("oBU",ServletRequestUtils.getStringParameter(request,"oBU", ""));      	
		request.setAttribute("oADDR2",ServletRequestUtils.getStringParameter(request,"oADDR2", ""));    	
		request.setAttribute("oADDR1_NEW",ServletRequestUtils.getStringParameter(request,"oADDR1_NEW", ""));	
		request.setAttribute("oBD_BON",ServletRequestUtils.getStringParameter(request,"oBD_BON", ""));   	
		request.setAttribute("oBD_BU",ServletRequestUtils.getStringParameter(request,"oBD_BU", ""));    	
		request.setAttribute("oBD_NM",ServletRequestUtils.getStringParameter(request,"oBD_NM", ""));	
		request.setAttribute("oBD_DET_NM",ServletRequestUtils.getStringParameter(request,"oBD_DET_NM", ""));	
		request.setAttribute("oSI_NM",ServletRequestUtils.getStringParameter(request,"oSI_NM", ""));   	
		request.setAttribute("oSGG_NM",ServletRequestUtils.getStringParameter(request,"oSGG_NM", ""));   	
		request.setAttribute("oDORO_NM",ServletRequestUtils.getStringParameter(request,"oDORO_NM", "")); 	
		request.setAttribute("oZIP_CL",ServletRequestUtils.getStringParameter(request,"oZIP_CL", ""));
		request.setAttribute("oEMD_NM",ServletRequestUtils.getStringParameter(request,"oEMD_NM", ""));		
		request.setAttribute("FRM",ServletRequestUtils.getStringParameter(request,"FRM", ""));

		request.setAttribute("ZIP_CL",	ZIP_CL);	     
		request.setAttribute("SI_NM",   SI_NM);           
		request.setAttribute("SGG_NM",  SGG_NM);           
		request.setAttribute("EMD_NM",  EMD_NM);           
		request.setAttribute("RI_NM",   RI_NM);            
		request.setAttribute("BD_NM",   BD_NM);            
		request.setAttribute("DORO_NM", DORO_NM);          
		request.setAttribute("BON",	BON);			
		request.setAttribute("BU",	BU);					
		request.setAttribute("BD_BON",	BD_BON);	     
		request.setAttribute("BD_BU",	BD_BU);	 
		request.setAttribute("ADDR2",	ADDR2);	    
		request.setAttribute("BD_NM",	BD_NM);
		request.setAttribute("BD_DET_NM",	BD_DET_NM);	   		
				
		List result = null;
		String mode = "";
		
		if((EMD_NM.equals("")||EMD_NM==null)&&(DORO_NM.equals("")||DORO_NM==null)){			
			mode = "null";
		}else if((EMD_NM.equals("")||EMD_NM== null)&&(!(DORO_NM.equals(""))&&DORO_NM!=null)){
			System.out.println("도로명만 있을 때 ");
			mode = "toBe";
			if(BD_BON.equals("")||BD_BON==null){
				result = iZipCodeService.executeToDoroNm(ZIP_CL,SI_NM,SGG_NM,DORO_NM);					
			}else{
				result = iZipCodeService.executeToJibun(ZIP_CL,SI_NM,SGG_NM,DORO_NM,BD_BON,BD_BU);
			}			
		}else if((DORO_NM.equals("")||DORO_NM== null)&&(!(EMD_NM.equals(""))&&EMD_NM!=null)){
			System.out.println("동명만 있을 때");
			mode = "before";
			if(BON.equals("")||BON==null){
				result = iZipCodeService.executeBeforeEmd(ZIP_CL,SI_NM,SGG_NM,EMD_NM);
			}else{
				result = iZipCodeService.executeBeforeJibun(ZIP_CL,SI_NM,SGG_NM,EMD_NM,BON,BU);				
			}
		}else{
			System.out.println("도로명 동명 둘다 있을 때");				
			if((BD_BON.equals("")||BD_BON==null) && (!(BON.equals(""))&&(BON!=null))){
				System.out.println("읍면동 번지만 있을 때");
				mode = "before";
				result = iZipCodeService.executeBeforeJibun(ZIP_CL,SI_NM,SGG_NM,EMD_NM,BON,BU);	
				System.out.println(result.size());
			}else if((BON.equals("")||BON==null) && (!(BD_BON.equals(""))&&!(BD_BON==null))){
				System.out.println("도로명 번지만 있을 때");
				mode = "toBe";				
				result = iZipCodeService.executeToJibun(ZIP_CL,SI_NM,SGG_NM,DORO_NM,BD_BON,BD_BU);			
			}else if(!(BON.equals(""))&&!(BON==null)&&!(BD_BON.equals(""))&&!(BD_BON==null)){
				System.out.println("번지수 둘 다 잇을때");
				mode = "all";
				result = iZipCodeService.executeJibunConfirm(ZIP_CL,SI_NM,SGG_NM,EMD_NM,BON,BU,DORO_NM,BD_BON,BD_BU);	
			}else {
				mode = "notJibun";
				result = null;				
			}
		}
		request.setAttribute("mode", mode);
		return	new ModelAndView("/common/zipCode/ZipCode_jibun", "ZipCode_jibun", result);
				
	}
}
