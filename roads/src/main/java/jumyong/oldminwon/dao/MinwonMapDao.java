//	2009		Jeon Seoung Won

package main.java.jumyong.oldminwon.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

import javax.sql.DataSource;

import main.java.common.dao.RoadsJdbcDaoSupport;
import main.java.common.util.catUtil.Util;
import main.java.jumyong.oldminwon.model.Apjy01mr1Bean;
import main.java.jumyong.oldminwon.model.Apjy20mr1Bean;
import main.java.jumyong.oldminwon.model.Apjy30mr1Bean;
import main.java.jumyong.oldminwon.model.MinwonBean;
import main.java.jumyong.oldminwon.model.SangseMinwonBean;
import main.java.jumyong.oldminwon.model.ZipBean;

import org.springframework.context.support.MessageSourceAccessor;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.object.MappingSqlQuery;

public class MinwonMapDao extends RoadsJdbcDaoSupport
{
	Util util = new Util();
	
    protected	class	Search	extends	MappingSqlQuery
    {
        protected 	Search(DataSource ds, MessageSourceAccessor msa)
        {
          	super(ds, msa.getMessage("Querys.jumyong.oldminwon.Search"));
          	
          	declareParameter(new SqlParameter(Types.VARCHAR));
      		declareParameter(new SqlParameter(Types.VARCHAR));
      		declareParameter(new SqlParameter(Types.VARCHAR));
      		declareParameter(new SqlParameter(Types.VARCHAR));
      		declareParameter(new SqlParameter(Types.VARCHAR));
      		declareParameter(new SqlParameter(Types.VARCHAR));
      		declareParameter(new SqlParameter(Types.VARCHAR));
      		declareParameter(new SqlParameter(Types.VARCHAR));
      		
      		declareParameter(new SqlParameter(Types.VARCHAR));
      		declareParameter(new SqlParameter(Types.VARCHAR));
      		
      		declareParameter(new SqlParameter(Types.INTEGER));
      		declareParameter(new SqlParameter(Types.INTEGER));
        }
        
        protected	Object mapRow(ResultSet rs, int rownum)	throws	SQLException
        {
        	MinwonBean	Bean	= new MinwonBean();

        	Bean.setSERIAL_NBR(rs.getString("SERIAL_NBR"));
        	Bean.setJUMNM(rs.getString("JUMNM"));
        	Bean.setHJNM(rs.getString("HJNM"));
        	Bean.setJIBUN(rs.getString("JIBUN"));
        	Bean.setBUN(rs.getString("BUN"));
        	Bean.setJI(rs.getString("JI"));
        	Bean.setGU_CODE(rs.getString("GU_CODE"));
        	Bean.setJUMMOK_NM(rs.getString("JUMMOK_NM"));
        	
        	String heoga = rs.getString("HEOGA");
        	String jimok = rs.getString("JIMOK");
        	
        	
        	if(heoga.equals("1")){
        		Bean.setHEOGA_NM("허가");
        	}else if(heoga.equals("2")){
        		Bean.setHEOGA_NM("직권");
        	}else if(heoga.equals("3")){
        		Bean.setHEOGA_NM("폐쇄");
        	}else if(heoga.equals("4")){
        		Bean.setHEOGA_NM("기타");
        	}
        	
        	if(jimok.equals("1")){
        		Bean.setJIMOK_NM("도로");
        	}else if(jimok.equals("2")){
        		Bean.setJIMOK_NM("하천");
        	}else if(jimok.equals("3")){
        		Bean.setJIMOK_NM("구거");
        	}else if(jimok.equals("4")){
        		Bean.setJIMOK_NM("기타");
        	}
        	
        	Bean.setJUMYO(String.valueOf(rs.getFloat("JUMYO")));
        	Bean.setJUMDAN(String.valueOf(rs.getFloat("JUMDAN")));        	
        	Bean.setHH_DATE(rs.getString("H_DATE"));

        	
        	return	Bean;
        }
    }
    
    protected	class	View	extends	MappingSqlQuery
    {
    	protected 	View(DataSource ds, MessageSourceAccessor msa)
    	{
    		super(ds, msa.getMessage("Querys.jumyong.oldminwon.View"));
    		
    		declareParameter(new SqlParameter(Types.VARCHAR));
    		declareParameter(new SqlParameter(Types.VARCHAR));
    	}
    	
    	protected	Object mapRow(ResultSet rs, int rownum)	throws	SQLException
    	{
    		Apjy20mr1Bean	Bean	= new Apjy20mr1Bean();
    		
    		Bean.setSERIAL_NBR(rs.getString("SERIAL_NBR"));
    		Bean.setDP_JY(rs.getString("DP_JY"));
    		Bean.setBJDONG(rs.getString("BJDONG"));
    		Bean.setHJDONG(rs.getString("HJDONG"));
    		Bean.setSAN(rs.getString("SAN"));
    		Bean.setBUN(rs.getString("BUN"));
    		Bean.setJI(rs.getString("JI"));
    		Bean.setJIMOK(rs.getString("JIMOK"));
    		Bean.setJUMDAN(String.valueOf(rs.getFloat("JUMDAN")));
    		Bean.setSOYU(rs.getString("SOYU"));
    		Bean.setJIBUN(rs.getString("JIBUN"));
    		Bean.setDOMN(rs.getString("DOMN"));
    		Bean.setNOSUN(rs.getString("NOSUN"));         
    		Bean.setHEOGA(rs.getString("HEOGA"));         
    		Bean.setHEO_NBR(rs.getString("HEO_NBR"));       
    		Bean.setHEO_DATE(rs.getString("HEO_DATE"));      
    		Bean.setFJUM(rs.getString("FJUM"));          
    		Bean.setJUMMOK(rs.getString("JUMMOK"));        
    		Bean.setHF_DATE(util.Date_Paste(rs.getString("HF_DATE")));       
    		Bean.setHL_DATE(util.Date_Paste(rs.getString("HL_DATE")));       
    		Bean.setJUMYO(String.valueOf(rs.getFloat("JUMYO")));
    		Bean.setSEGUBUN(rs.getString("SEGUBUN"));       
    		Bean.setJUMNM(rs.getString("JUMNM"));         
    		Bean.setID_GUBUN(rs.getString("ID_GUBUN"));      
    		Bean.setID_NO(rs.getString("ID_NO"));         
    		Bean.setJUMADDR(rs.getString("JUMADDR"));       
    		Bean.setJUMTEL(rs.getString("JUMTEL"));        
    		Bean.setPOST1(rs.getString("POST1"));         
    		Bean.setPOST2(rs.getString("POST2"));         
    		Bean.setREMARKS(rs.getString("REMARKS"));       
    		Bean.setUP_DATE(rs.getString("UP_DATE"));       
    		Bean.setJUMIN1(rs.getString("JUMIN1"));        
    		Bean.setJUMIN2(rs.getString("JUMIN2"));        
    		Bean.setGYE_GUBUN(rs.getString("GYE_GUBUN"));     
    		Bean.setGU_CODE(rs.getString("GU_CODE"));       
    		Bean.setGSAMT(util.Comma_Paste(rs.getString("GSAMT")));         
    		Bean.setKAMACKYUL(rs.getString("KAMACKYUL"));     
    		Bean.setSOONAP_JUMIN1(rs.getString("SOONAP_JUMIN1")); 
    		Bean.setBIZ_NO(rs.getString("BIZ_NO"));        
    		Bean.setKSIC_CODE(rs.getString("KSIC_CODE"));     
    		Bean.setTMX(rs.getString("TMX"));          
    		Bean.setTMY(rs.getString("TMY"));
    		Bean.setJUMMOK_NAME(rs.getString("JUMMOK_NAME"));
    		  
    		return	Bean;
    	}
    }
    
    protected	class	SangseSearch	extends	MappingSqlQuery
    {
        protected 	SangseSearch(DataSource ds, MessageSourceAccessor msa)
        {
          	super(ds, msa.getMessage("Querys.jumyong.oldminwon.SangseSearch"));
          	
          	declareParameter(new SqlParameter(Types.VARCHAR));
      		declareParameter(new SqlParameter(Types.VARCHAR));
      		declareParameter(new SqlParameter(Types.INTEGER));
      		declareParameter(new SqlParameter(Types.INTEGER));
        }
        
        protected	Object mapRow(ResultSet rs, int rownum)	throws	SQLException
        {
        	SangseMinwonBean Bean = new SangseMinwonBean();

        	Bean.setYY(rs.getString("YY"));
        	Bean.setGUBUN(rs.getString("GUBUN"));
        	Bean.setBUKWA_NBR(rs.getString("BUKWA_NBR"));
        	Bean.setHEOGA(rs.getString("HEOGA"));
        	Bean.setBUKWA_AMT(util.Comma_Paste(rs.getString("BUKWA_AMT")));
        	Bean.setBUKWA_DATE(rs.getString("BUKWA_DATE"));
        	Bean.setHF_DATE(rs.getString("HF_DATE"));
        	Bean.setHL_DATE(rs.getString("HL_DATE"));
        	Bean.setILKWAL_NBR(rs.getString("ILKWAL_NBR"));
        	
        	Bean.setJUMNM(rs.getString("JUMNM"));
        	Bean.setJUMDAN(String.valueOf(rs.getFloat("JUMDAN")));
        	
        	if(Bean.getBUKWA_NBR() == null || Bean.getBUKWA_NBR().equals("")){
				Bean.setBUKWA_NBR("-");
			}
			if(Bean.getBUKWA_AMT() == null || Bean.getBUKWA_AMT().equals("")){
				Bean.setBUKWA_AMT("-");
			}
			if(Bean.getBUKWA_DATE() == null || Bean.getBUKWA_DATE().equals("")){
				Bean.setBUKWA_DATE("-");
			}
        	

        	return	Bean;
        }
    }
    
    protected	class	SangseView	extends	MappingSqlQuery
    {
        protected 	SangseView(DataSource ds, MessageSourceAccessor msa)
        {
          	super(ds, msa.getMessage("Querys.jumyong.oldminwon.SangseView"));
          	
      		declareParameter(new SqlParameter(Types.VARCHAR));
      		declareParameter(new SqlParameter(Types.VARCHAR));
      		declareParameter(new SqlParameter(Types.VARCHAR));
      		declareParameter(new SqlParameter(Types.VARCHAR));
        }
        
        protected	Object mapRow(ResultSet rs, int rownum)	throws	SQLException
        {
        	SangseMinwonBean	Bean	= new SangseMinwonBean();
        	
			Bean.setYY(rs.getString("YY"));
			Bean.setGUBUN(rs.getString("GUBUN"));
			Bean.setHEOGA(rs.getString("HEOGA"));
			Bean.setSEGUBUN(rs.getString("SEGUBUN"));
			Bean.setHF_DATE(rs.getString("HF_DATE"));
			
			Bean.setHL_DATE(rs.getString("HL_DATE"));
			Bean.setJUN_JUMACK(rs.getString("JUN_JUMACK"));
			Bean.setCUR_JUMACK(rs.getString("CUR_JUMACK"));
			Bean.setSANCHUL1(rs.getString("SANCHUL1"));
			Bean.setSANCHUL2(rs.getString("SANCHUL2"));
			
			Bean.setBUKWA_NBR(rs.getString("BUKWA_NBR"));
			Bean.setBUKWA_AMT(rs.getString("BUKWA_AMT"));
			Bean.setBUKWA_DATE(rs.getString("BUKWA_DATE"));
			Bean.setACC(rs.getString("ACC"));
			Bean.setMOK(rs.getString("MOK"));
			
			Bean.setSEMOK(rs.getString("SEMOK"));
			
			

			 
        	return	Bean;
        }
    }
    
    protected	class	Zip	extends	MappingSqlQuery
    {
    	protected 	Zip(DataSource ds, MessageSourceAccessor msa)
    	{
    		super(ds, msa.getMessage("Querys.jumyong.oldminwon.Zip"));
    		
    		declareParameter(new SqlParameter(Types.VARCHAR));
    		declareParameter(new SqlParameter(Types.VARCHAR));
    	}
    	
    	protected	Object mapRow(ResultSet rs, int rownum)	throws	SQLException
    	{
    		ZipBean	Bean	= new ZipBean();
    		
    		Bean.setZIP_CL(rs.getString("ZIP_CL"));
    		Bean.setORDER_CN(rs.getString("ORDER_CN"));
    		Bean.setSI_NM(rs.getString("SI_NM"));
    		Bean.setSGG_NM(rs.getString("SGG_NM"));
    		Bean.setEMD_NM(rs.getString("EMD_NM"));
    		
    		Bean.setRI_NM(rs.getString("RI_NM"));
    		Bean.setISLAND_NM(rs.getString("ISLAND_NM"));
    		Bean.setLNDN_CM(rs.getString("LNDN_CM"));
    		Bean.setBD_NM(rs.getString("BD_NM"));
    		
    		return	Bean;
    	}
    }
    
    
    protected	class	getJummokList	extends	MappingSqlQuery
    {
    	protected 	getJummokList(DataSource ds, MessageSourceAccessor msa)
    	{
    		super(ds, msa.getMessage("Querys.jumyong.oldminwon.getJummokList"));
    		
    		declareParameter(new SqlParameter(Types.VARCHAR));
    		declareParameter(new SqlParameter(Types.VARCHAR));
    	}
    	
    	protected	Object mapRow(ResultSet rs, int rownum)	throws	SQLException
    	{
    		Apjy01mr1Bean Bean = new Apjy01mr1Bean();
    		Bean.setNO(rs.getString("NO"));
    		Bean.setNAME(rs.getString("NAME"));
    		
    		return	Bean;
    	}
    }
    
    
    
    protected	class	getHistoryList	extends	MappingSqlQuery
    {
    	protected 	getHistoryList(DataSource ds, MessageSourceAccessor msa)
    	{
    		super(ds, msa.getMessage("Querys.jumyong.oldminwon.getHistoryList"));
    		
    		declareParameter(new SqlParameter(Types.VARCHAR));
    		declareParameter(new SqlParameter(Types.VARCHAR));
    	}
    	
    	protected	Object mapRow(ResultSet rs, int rownum)	throws	SQLException
    	{
    		Apjy30mr1Bean Bean = new Apjy30mr1Bean();
    		Bean.setGU_CODE(rs.getString("GU_CODE"));
    		Bean.setGUBUN(rs.getString("GUBUN"));
    		Bean.setGUNGE(rs.getString("GUNGE"));
    		Bean.setJUMIN1(rs.getString("JUMIN1"));
    		Bean.setJUMIN2(rs.getString("JUMIN2"));
    		Bean.setSAYU(rs.getString("SAYU"));
    		Bean.setSERIAL_NBR(rs.getString("SERIAL_NBR"));
    		Bean.setUP_DATE(rs.getString("UP_DATE"));
    		Bean.setWRITEDATE(rs.getString("WRITEDATE"));	
    		
        	if(Bean.getGUBUN().equals("1")){
        		Bean.setGUBUN("도로");
        	}else if(Bean.getGUBUN().equals("2")){
        		Bean.setGUBUN("하천");
        	}else if(Bean.getGUBUN().equals("3")){
        		Bean.setGUBUN("구거");
        	}else if(Bean.getGUBUN().equals("4")){
        		Bean.setGUBUN("기타");
        	}
        	
        	if(Bean.getGUNGE() == null || Bean.getGUNGE().equals("")){
				Bean.setGUNGE("-");
			}
			if(Bean.getUP_DATE() == null || Bean.getUP_DATE().equals("")){
				Bean.setUP_DATE("-");
			}
    		
    		return	Bean;
    	}
    }
  
}
