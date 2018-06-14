package main.java.mdb.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import main.java.mdb.model.GapanBaseBean;
import main.java.mdb.model.GapanHeadBean;
import main.java.mdb.model.GapanInfoBean;
import main.java.mdb.model.GapanUserBean;
import main.java.mdb.model.MdbBean;
import main.java.mdb.util.EncryptData;


public class MdbDao {

	public List GetUploadInit(MdbConnection dbConn){
		List list = new ArrayList();
		Connection conn = null;    
		PreparedStatement psmt = null;   
		ResultSet rs = null;   
		
		try{
		
   	    StringBuffer sql = new StringBuffer();
		
		sql.append(" SELECT B.GAPAN_NO, H.OWNER_NAME, H.OWNER_SSN, I.PLACE_A, I.PICKUP_DATE, "); 
		sql.append(" B.UP_DATE, I.RETURN_YN, I.RETURN_DATE, I.MAINTN_OB, I.TAXTATION_AT, ");
		sql.append(" I.MODIFY_YN, I.WITH_ADDR, I.WITH_INFO, H.OWNER_TEL, H.OWNER_HP, "); 
		sql.append(" H.OWNER_TOPOST, H.OWNER_TOADDR1, H.OWNER_TOADDR2 ");
		sql.append(" FROM GAPAN_BASE B, GAPAN_HEAD H, GAPAN_INFO I ");
		sql.append(" WHERE B.GAPAN_NO = H.GAPAN_NO AND B.GP_TYPE = H.GP_TYP ");
		sql.append(" AND B.GAPAN_NO = I.GAPAN_NO AND B.GP_TYPE = I.GP_TYP AND B.GP_TYPE='002' AND I.PICKUP_YN <> '1' ");
		sql.append(" AND (I.MODIFY_YN ='u' OR MODIFY_YN='U' OR MODIFY_YN='i' OR MODIFY_YN='I' OR MODIFY_YN='d' OR MODIFY_YN='D') ");
		sql.append(" ORDER BY B.UP_DATE DESC ");

		
		System.out.println(sql);
		conn = dbConn.getConnection();     
		psmt = conn.prepareStatement(sql.toString());
		
		rs = psmt.executeQuery();   
		   
		
		EncryptData enc = new EncryptData();
		String WITH_ADDR = "";
		String WITH_INFO = "";
		String OWNER_NAME = "";
		String OWNER_TOADDR1 = "";
		String OWNER_TOADDR2 = "";
		String OWNER_HP = "";
		String OWNER_SSN = "";
		String OWNER_TOPOST = "";
			
		
		while (rs.next()) {   
			MdbBean bean = new MdbBean();
			
			WITH_ADDR =rs.getString("WITH_ADDR"); 
			WITH_INFO = rs.getString("WITH_INFO");
			OWNER_NAME = rs.getString("OWNER_NAME");
			OWNER_TOADDR1 = rs.getString("OWNER_TOADDR1");
			OWNER_TOADDR2 = rs.getString("OWNER_TOADDR2");
			OWNER_HP = rs.getString("OWNER_HP");
			OWNER_SSN = rs.getString("OWNER_SSN");
			OWNER_TOPOST = rs.getString("OWNER_TOPOST");
				
			if(WITH_ADDR !=null && !WITH_ADDR.equals("")) bean.setWITH_ADDR(new String(WITH_ADDR.getBytes("8859_1"), "euc-kr"));
			else bean.setWITH_ADDR(WITH_ADDR);
	
			if(WITH_INFO !=null && !WITH_INFO.equals("")) bean.setWITH_INFO(new String(WITH_INFO.getBytes("8859_1"), "euc-kr"));
			else bean.setWITH_INFO(WITH_INFO);
			
			if(OWNER_NAME != null && !OWNER_NAME.equals("")) bean.setOWNER_NAME(new String(OWNER_NAME.getBytes("8859_1"), "euc-kr"));
			else bean.setOWNER_NAME(OWNER_NAME);
			
			if(OWNER_TOADDR1 != null && !OWNER_TOADDR1.equals("")) bean.setOWNER_TOADDR1(new String(OWNER_TOADDR1.getBytes("8859_1"), "euc-kr"));
			else bean.setOWNER_TOADDR1(OWNER_TOADDR1);
			
			if(OWNER_TOADDR2 != null && !OWNER_TOADDR2.equals("")) bean.setOWNER_TOADDR2(new String(OWNER_TOADDR2.getBytes("8859_1"), "euc-kr"));
			else bean.setOWNER_TOADDR2(OWNER_TOADDR2);

			if(OWNER_HP != null && !OWNER_HP.equals("")) bean.setOWNER_HP(enc.DecryptCode(OWNER_HP, "roadsdb"));
			else bean.setOWNER_HP(OWNER_HP);		
			
			if(OWNER_SSN != null && !OWNER_SSN.equals("")) bean.setOWNER_SSN(enc.DecryptCode(OWNER_SSN, "roadsdb"));
			else bean.setOWNER_SSN(OWNER_SSN);

			bean.setGAPAN_NO(rs.getString("GAPAN_NO"));	
			bean.setPLACE_A(rs.getString("PLACE_A"));
			bean.setPICKUP_DATE(rs.getString("PICKUP_DATE"));
			bean.setUP_DATE(rs.getString("UP_DATE"));
			bean.setRETURN_YN(rs.getString("RETURN_YN"));
			bean.setRETURN_DATE(rs.getString("RETURN_DATE"));
			bean.setMAINTN_OB(rs.getString("MAINTN_OB"));
			bean.setTAXTATION_AT(rs.getString("TAXTATION_AT"));
			bean.setMODIFY_YN(rs.getString("MODIFY_YN"));		
			
			bean.setOWNER_TEL(rs.getString("OWNER_TEL"));
			
			if(OWNER_TOPOST != null && !OWNER_TOPOST.equals("") && OWNER_TOPOST.length() == 6) {
				OWNER_TOPOST = OWNER_TOPOST.substring(0, 3) + "-"+ OWNER_TOPOST.substring(3,6);
			}
				
			bean.setOWNER_TOPOST(OWNER_TOPOST);
  		
		    list.add(bean);
		   
		    }  
		    
		rs.close();
		psmt.close();
		conn.close();
	}catch(Exception ex){
		ex.printStackTrace();
	}
	
	return list;
	}
	
	public List GetGapanInfo(MdbConnection dbConn, String gapan_no){
		
		List list = new ArrayList();
		Connection conn = null;    
		PreparedStatement psmt = null;   
		ResultSet rs = null;   
		
		try{
		
   	    StringBuffer sql = new StringBuffer();
		
		sql.append("SELECT GAPAN_NO, X_COORD, Y_COORD, GP_TYP, PURPOSE_CD, WITH_PNU, WITH_ADDR, WITH_INFO, ROAD_INFO, ");
		sql.append("AR_SEL, AR_TXT, UC_SEL, UC_TXT, FOUND_DATE, FT_TYP, FT_SEL, FACIL_L, FACIL_W, ");
		sql.append("FACIL_H, PLACE_L, PLACE_H, PLACE_A, CAR_NUM, CAR_TON, SPECIAL_ST, TAXTATION_AT,");
		sql.append("MAINTN_OB, MT_SEL, DP_SEL, DP_TXT, SG_TYP, SG_SEL, SG_ITM, LIQUOR_SL, LPGAS_US,");
		sql.append("OPEN_TIME, CLOSE_TIME, MEM_NUM, PERMIT_DATE, DAY_SALES, UN_TYP, UN_TXT, NOTES, TYPE,");
		sql.append("SECTION, OWNER_SET, TAX_SET, MUL_FROMDATE, MUL_TODATE, HJ_CD, DISUSE_DATE, DISUSE_REASON, DISUSE_MANAGER,");
		sql.append("OLD_SECTION, REDUCTION_RATE, REDUCTION_REASON, PICKUP_DATE, RETURN_DATE, RETURN_YN, FT_ETC, PICKUP_YN,");
		sql.append("MODIFY_YN, SF_VALUE, HISTORY, MAKE_YM FROM GAPAN_INFO WHERE GAPAN_NO = ? ");
		sql.append("AND GP_TYP='002' AND (MODIFY_YN='u' OR MODIFY_YN='U' OR MODIFY_YN='i' OR MODIFY_YN='I' OR MODIFY_YN = 'd' OR MODIFY_YN='D' )");
		

		conn = dbConn.getConnection();     
		psmt = conn.prepareStatement(sql.toString());
		psmt.setString(1, gapan_no);
	       
		
		System.out.println(sql.toString());
		
		rs = psmt.executeQuery();   
		   
	
		
		while (rs.next()) {   
		    //bean.setGAPAN_NO(new String(rs.getString("GAPAN_NO").getBytes("8859_1"), "euc-kr"));
		   GapanInfoBean bean = new GapanInfoBean();
		   bean.setGAPAN_NO(rs.getString("GAPAN_NO"));		    	
		   bean.setX_COORD(rs.getString("X_COORD")); 
		   bean.setY_COORD(rs.getString("Y_COORD")); 
		   bean.setGP_TYP(rs.getString("GP_TYP")); 
		   bean.setPURPOSE_CD(rs.getString("PURPOSE_CD"));   	
		   bean.setWITH_PNU(rs.getString("WITH_PNU")); 
		   bean.setWITH_ADDR(rs.getString("WITH_ADDR"));
		   bean.setWITH_INFO(rs.getString("WITH_INFO")); 
		   bean.setROAD_INFO(rs.getString("ROAD_INFO")); 
		   bean.setAR_SEL(rs.getString("AR_SEL")); 
		   
		   bean.setAR_TXT(rs.getString("AR_TXT")); 
		   bean.setUC_SEL(rs.getString("UC_SEL")); 
		   bean.setUC_TXT(rs.getString("UC_TXT")); 
		   bean.setFOUND_DATE(rs.getString("FOUND_DATE")); 
		   bean.setFT_TYP(rs.getString("FT_TYP")); 		   
		   bean.setFT_SEL(rs.getString("FT_SEL")); 
		   bean.setFACIL_L(rs.getString("FACIL_L")); 
		   bean.setFACIL_W(rs.getString("FACIL_W"));
		   bean.setFACIL_H(rs.getString("FACIL_H")); 
		   
		   
		   bean.setPLACE_L(rs.getString("PLACE_L")); 
		   bean.setPLACE_H(rs.getString("PLACE_H")); 
		   bean.setPLACE_A(rs.getString("PLACE_A")); 
		   bean.setCAR_NUM(rs.getString("CAR_NUM")); 
		   bean.setCAR_TON(rs.getString("CAR_TON")); 	   
		   bean.setSPECIAL_ST(rs.getString("SPECIAL_ST")); 
		   bean.setTAXTATION_AT(rs.getString("TAXTATION_AT"));
		   bean.setMAINTN_OB(rs.getString("MAINTN_OB")); 
		   bean.setMT_SEL(rs.getString("MT_SEL")); 
		   bean.setDP_SEL(rs.getString("DP_SEL")); 
		   
		   bean.setDP_TXT(rs.getString("DP_TXT")); 
		   bean.setSG_TYP(rs.getString("SG_TYP"));
		   bean.setSG_SEL(rs.getString("SG_SEL"));
		   bean.setSG_ITM(rs.getString("SG_ITM"));
		   bean.setLIQUOR_SL(rs.getString("LIQUOR_SL"));
		   bean.setLPGAS_US(rs.getString("LPGAS_US"));
		   bean.setOPEN_TIME(rs.getString("OPEN_TIME")); 
		   bean.setCLOSE_TIME(rs.getString("CLOSE_TIME")); 
		   bean.setMEM_NUM(rs.getString("MEM_NUM")); 
		   bean.setPERMIT_DATE(rs.getString("PERMIT_DATE"));
		   
		   bean.setDAY_SALES(rs.getString("DAY_SALES"));
		   bean.setUN_TYP(rs.getString("UN_TYP")); 
		   bean.setUN_TXT(rs.getString("UN_TXT")); 
		   bean.setNOTES(rs.getString("NOTES"));
		   bean.setTYPE(rs.getString("TYPE"));	   
		   bean.setSECTION(rs.getString("SECTION")); 
		   bean.setOWNER_SET(rs.getString("OWNER_SET")); 
		   bean.setTAX_SET(rs.getString("TAX_SET")); 
		   bean.setMUL_FROMDATE(rs.getString("MUL_FROMDATE")); 
		   bean.setMUL_TODATE(rs.getString("MUL_TODATE")); 
		   
		   bean.setHJ_CD(rs.getString("HJ_CD")); 
		   bean.setDISUSE_DATE(rs.getString("DISUSE_DATE")); 
		   bean.setDISUSE_REASON(rs.getString("DISUSE_REASON")); 
		   bean.setDISUSE_MANAGER(rs.getString("DISUSE_MANAGER"));
		   bean.setOLD_SECTION(rs.getString("OLD_SECTION"));   
		   bean.setREDUCTION_RATE(rs.getString("REDUCTION_RATE"));
		   bean.setREDUCTION_REASON(rs.getString("REDUCTION_REASON")); 
		   bean.setPICKUP_DATE(rs.getString("PICKUP_DATE")); 
		   
		   bean.setRETURN_DATE(rs.getString("RETURN_DATE")); 
		   
		   bean.setRETURN_YN(rs.getString("RETURN_YN")); 
		   bean.setFT_ETC(rs.getString("FT_ETC"));
		   bean.setPICKUP_YN(rs.getString("PICKUP_YN"));
		   bean.setMODIFY_YN(rs.getString("MODIFY_YN"));
		   bean.setSF_VALUE(rs.getString("SF_VALUE"));    
		   bean.setHISTORY(rs.getString("HISTORY"));
		   bean.setMAKE_YM(rs.getString("MAKE_YM")); 
		    		
		    list.add(bean);
		    
		    }  
		    
		rs.close();
		psmt.close();
		conn.close();
	}catch(Exception ex){
		ex.printStackTrace();
	}
	
	return list;
	
	}
	
	
	public List GetGapanHead(MdbConnection dbConn, String gapan_no){
		
		List list = new ArrayList();
		Connection conn = null;    
		PreparedStatement psmt = null;   
		ResultSet rs = null;   
		
		try{
		
   	    StringBuffer sql = new StringBuffer();
		
   	    sql.append("SELECT ");
		sql.append("GAPAN_NO, GP_TYP, OWNER_NAME, OWNER_IDCHK, OWNER_SSN, OWNER_GENDER, OWNER_AGE, OWNER_POST, OWNER_ADDR1,  ");		
		sql.append("OWNER_SAN, OWNER_JIBUN, OWNER_ADDR2, OWNER_SAME, OWNER_TOPOST, OWNER_TOADDR1, OWNER_TOSAN, OWNER_TOJIBUN, OWNER_TOADDR2,  ");
		sql.append("OWNER_TEL, OWNER_HP, RT_SEL, RT_TXT, LC_SEL, LC_TXT, ESTATE_MOVE, ESTATE_REAL, ");
		sql.append("PARTN_NAME, PT_SEL, PARTN_SSN, PARTN_GENDER, PARTN_AGE, PARTN_OSAM, PARTN_POST, PARTN_ADDR1, PARTN_SAN,  ");
		sql.append("PARTN_JIBUN, PARTN_ADDR2, PARTN_SAME, PARTN_TOPOST, PARTN_TOADDR1, PARTN_TOSAN, PARTN_TOJIBUN, PARTN_TOADDR2, PARTN_TEL,  ");
		sql.append("PARTN_HP, ADDR_CHECK1, ADDR_CHECK2  ");
		sql.append("FROM GAPAN_HEAD WHERE GAPAN_NO = ?  AND GP_TYP='002' ");
		
		

		conn = dbConn.getConnection();     
		psmt = conn.prepareStatement(sql.toString());
		psmt.setString(1, gapan_no);
	       
		
		System.out.println(sql.toString());
		
		rs = psmt.executeQuery();   
		   
		while (rs.next()) {   
		    //bean.setGAPAN_NO(new String(rs.getString("GAPAN_NO").getBytes("8859_1"), "euc-kr"));
		   GapanHeadBean bean = new GapanHeadBean();
		   
		 bean.setGAPAN_NO(rs.getString("GAPAN_NO")); 
		 bean.setGP_TYP(rs.getString("GP_TYP"));
		 bean.setOWNER_NAME(rs.getString("OWNER_NAME")); 
		 bean.setOWNER_IDCHK(rs.getString("OWNER_IDCHK")); 
		 bean.setOWNER_SSN(rs.getString("OWNER_SSN")); 		   
		 bean.setOWNER_GENDER(rs.getString("OWNER_GENDER")); 
		 bean.setOWNER_AGE(rs.getString("OWNER_AGE")); 
		 bean.setOWNER_POST(rs.getString("OWNER_POST")); 
		 bean.setOWNER_ADDR1(rs.getString("OWNER_ADDR1"));	
		 bean.setOWNER_SAN(rs.getString("OWNER_SAN")); 		   
		 bean.setOWNER_JIBUN(rs.getString("OWNER_JIBUN")); 
		 bean.setOWNER_ADDR2 (rs.getString("OWNER_ADDR2"));
		 bean.setOWNER_SAME (rs.getString("OWNER_SAME"));
		 bean.setOWNER_TOPOST (rs.getString("OWNER_TOPOST"));
		 bean.setOWNER_TOADDR1 (rs.getString("OWNER_TOADDR1"));		   
		 bean.setOWNER_TOSAN (rs.getString("OWNER_TOSAN"));
		 bean.setOWNER_TOJIBUN (rs.getString("OWNER_TOJIBUN"));
		 bean.setOWNER_TOADDR2(rs.getString("OWNER_TOADDR2")); 
		 bean.setOWNER_TEL (rs.getString("OWNER_TEL"));
		 bean.setOWNER_HP (rs.getString("OWNER_HP"));		   
		 
		 bean.setRT_SEL (rs.getString("RT_SEL"));
		 bean.setRT_TXT(rs.getString("RT_TXT")); 
		 bean.setLC_SEL(rs.getString("LC_SEL")); 
		 bean.setLC_TXT(rs.getString("LC_TXT")); 		   
		 bean.setESTATE_MOVE(rs.getString("ESTATE_MOVE")); 
		 bean.setESTATE_REAL(rs.getString("ESTATE_REAL")); 
		 bean.setPARTN_NAME(rs.getString("PARTN_NAME")); 
		 bean.setPT_SEL(rs.getString("PT_SEL")); 
		 bean.setPARTN_SSN (rs.getString("PARTN_SSN"));		   
		 bean.setPARTN_GENDER (rs.getString("PARTN_GENDER"));
		 bean.setPARTN_AGE (rs.getString("PARTN_AGE"));
		 bean.setPARTN_OSAM(rs.getString("PARTN_OSAM")); 
		 bean.setPARTN_POST (rs.getString("PARTN_POST"));
		 bean.setPARTN_ADDR1 (rs.getString("PARTN_ADDR1"));		   
		 bean.setPARTN_SAN(rs.getString("PARTN_SAN"));  
		 bean.setPARTN_JIBUN(rs.getString("PARTN_JIBUN")); 
		 bean.setPARTN_ADDR2(rs.getString("PARTN_ADDR2"));
		 bean.setPARTN_SAME(rs.getString("PARTN_SAME"));
		 bean.setPARTN_TOPOST	(rs.getString("PARTN_TOPOST"));	   
		 bean.setPARTN_TOADDR1(rs.getString("PARTN_TOADDR1")); 
		 bean.setPARTN_TOSAN(rs.getString("PARTN_TOSAN")); 
		 bean.setPARTN_TOJIBUN (rs.getString("PARTN_TOJIBUN"));
		 bean.setPARTN_TOADDR2 (rs.getString("PARTN_TOADDR2"));
		 bean.setPARTN_TEL  (rs.getString("PARTN_TEL"));	
		 bean.setPARTN_HP (rs.getString("PARTN_HP"));
		 
		 bean.setADDR_CHECK1 (rs.getString("ADDR_CHECK1"));
		 bean.setADDR_CHECK2 (rs.getString("ADDR_CHECK2"));
		   
		    		
		    list.add(bean);
		    
		    }  
		    
		rs.close();
		psmt.close();
		conn.close();
	}catch(Exception ex){
		ex.printStackTrace();
	}
	
	return list;
		
		
		
	}
	
	public List GetGapanBase(MdbConnection dbConn, String gapan_no){
		
		List list = new ArrayList();
		Connection conn = null;    
		PreparedStatement psmt = null;   
		ResultSet rs = null;   
		
		try{
		
   	    StringBuffer sql = new StringBuffer();
		
   	    sql.append("SELECT ");
   	    sql.append("GAPAN_NO, GP_TYP, REG_DATE, UP_DATE, MANAGER, FINISH_ID, CLOSE_DATE, CLOSE_ID, CLOSE_REASON ");
		sql.append("FROM GAPAN_BASE WHERE GAPAN_NO = ?  AND GP_TYP='002' ");
		
		

		conn = dbConn.getConnection();     
		psmt = conn.prepareStatement(sql.toString());
		psmt.setString(1, gapan_no);
	       
		
		System.out.println(sql.toString());
		
		rs = psmt.executeQuery();   
		   
		while (rs.next()) {   
		    //bean.setGAPAN_NO(new String(rs.getString("GAPAN_NO").getBytes("8859_1"), "euc-kr"));
		   GapanBaseBean bean = new GapanBaseBean();
		   
		 bean.setGAPAN_NO(rs.getString("GAPAN_NO")); 
		 bean.setGP_TYP(rs.getString("GP_TYP"));
		 bean.setREG_DATE(rs.getString("REG_DATE"));
		 bean.setUP_DATE(rs.getString("UP_DATE"));
		 bean.setMANAGER(rs.getString("MANAGER"));
		 bean.setFINISH_ID(rs.getString("FINISH_ID"));
		 bean.setCLOSE_DATE(rs.getString("CLOSE_DATE"));
		 bean.setCLOSE_ID(rs.getString("CLOSE_ID"));
		 bean.setCLOSE_REASON(rs.getString("CLOSE_REASON"));
		   
		    		
		    list.add(bean);
		    
		    }  
		    
		rs.close();
		psmt.close();
		conn.close();
	}catch(Exception ex){
		ex.printStackTrace();
	}
	
	return list;
		
		
		
	}
	
public List GetGapanUser(MdbConnection dbConn){
		
		List list = new ArrayList();
		Connection conn = null;    
		PreparedStatement psmt = null;   
		ResultSet rs = null;   
		
		try{
		
   	    StringBuffer sql = new StringBuffer();
		
   	    sql.append("SELECT ");
   	    sql.append("USER_ID, USER_PW, USER_NAME, SGG_NM, DEPT_NM, GP_TYP, USE_MODE ");
		sql.append("FROM GAPAN_USER WHERE UPDATE_YN = '1' ");
		
		conn = dbConn.getConnection();     
		psmt = conn.prepareStatement(sql.toString());
		
		
		System.out.println(sql.toString());
		
		rs = psmt.executeQuery();   
		   
		while (rs.next()) {   
		    //bean.setGAPAN_NO(new String(rs.getString("GAPAN_NO").getBytes("8859_1"), "euc-kr"));
		   GapanUserBean bean = new GapanUserBean();
		   
		   bean.setUSER_ID(rs.getString("USER_ID"));
		   bean.setUSER_PW(rs.getString("USER_PW"));
		   bean.setUSER_NAME(rs.getString("USER_NAME"));
		   bean.setSGG_NM(rs.getString("SGG_NM"));
		   bean.setDEPT_NM(rs.getString("DEPT_NM"));
		   bean.setGP_TYP(rs.getString("GP_TYP"));
		   bean.setUSE_MODE(rs.getString("USE_MODE"));
	    		
		    list.add(bean);
		    
		    }  
		    
		rs.close();
		psmt.close();
		conn.close();
	}catch(Exception ex){
		ex.printStackTrace();
	}
	
	return list;
		
		
		
	}
	
	
	
public int InsertGapanInfo(MdbConnection dbConn, List list){
				
		Connection conn = null;    
		PreparedStatement psmt = null;
		
		   
		int a = 0;
		
		try{
			
		conn = dbConn.getConnection();
		
		for(int j=0;j<list.size();j++){	
		
		GapanInfoBean bean = (GapanInfoBean)list.get(j);
		
   	    StringBuffer sql = new StringBuffer();
   	  

   				
		if(bean.getWITH_ADDR()!=null && !bean.getWITH_ADDR().equals("")) bean.setWITH_ADDR(new String(bean.getWITH_ADDR().getBytes("euc-kr"), "ISO-8859-1"));
		if(bean.getWITH_INFO()!=null && !bean.getWITH_INFO().equals("")) bean.setWITH_INFO(new String(bean.getWITH_INFO().getBytes("euc-kr"), "ISO-8859-1"));
		if(bean.getROAD_INFO()!=null && !bean.getROAD_INFO().equals("")) bean.setROAD_INFO(new String(bean.getROAD_INFO().getBytes("euc-kr"), "ISO-8859-1"));		
			
		if(bean.getCAR_TON()!=null && !bean.getCAR_TON().equals("")) bean.setCAR_TON(new String(bean.getCAR_TON().getBytes("euc-kr"), "ISO-8859-1"));
		if(bean.getDISUSE_REASON()!=null && !bean.getDISUSE_REASON().equals("")) bean.setDISUSE_REASON(new String(bean.getDISUSE_REASON().getBytes("euc-kr"), "ISO-8859-1"));
		if(bean.getDISUSE_MANAGER()!=null && !bean.getDISUSE_MANAGER().equals("")) bean.setDISUSE_MANAGER(new String(bean.getDISUSE_MANAGER().getBytes("euc-kr"), "ISO-8859-1"));
		if(bean.getREDUCTION_REASON()!=null && !bean.getREDUCTION_REASON().equals("")) bean.setREDUCTION_REASON(new String(bean.getREDUCTION_REASON().getBytes("euc-kr"), "ISO-8859-1"));

		if(bean.getDP_TXT()!=null && !bean.getDP_TXT().equals("")) bean.setDP_TXT(new String(bean.getDP_TXT().getBytes("euc-kr"), "ISO-8859-1"));
		
		if(bean.getAR_TXT()!=null && !bean.getAR_TXT().equals("")) bean.setAR_TXT(new String(bean.getAR_TXT().getBytes("euc-kr"), "ISO-8859-1"));
		if(bean.getUC_TXT()!=null && !bean.getUC_TXT().equals("")) bean.setUC_TXT(new String(bean.getUC_TXT().getBytes("euc-kr"), "ISO-8859-1"));
		else bean.setUC_TXT("");
		
		if(bean.getUN_TXT()!=null && !bean.getUN_TXT().equals("")) bean.setUN_TXT(new String(bean.getUN_TXT().getBytes("euc-kr"), "ISO-8859-1"));
		else bean.setUN_TXT("");
		
		if(bean.getFT_ETC()!=null && !bean.getFT_ETC().equals("")) bean.setFT_ETC(new String(bean.getFT_ETC().getBytes("euc-kr"), "ISO-8859-1"));
		else bean.setFT_ETC("");
		
		if(bean.getNOTES()!=null && !bean.getNOTES().equals("")) bean.setNOTES(new String(bean.getNOTES().getBytes("euc-kr"), "ISO-8859-1"));
		if(bean.getCAR_NUM()!=null && !bean.getCAR_NUM().equals("")) bean.setCAR_NUM(new String(bean.getCAR_NUM().getBytes("euc-kr"), "ISO-8859-1"));	
		if(bean.getHISTORY()!=null && !bean.getHISTORY().equals("")) bean.setHISTORY(new String(bean.getHISTORY().getBytes("euc-kr"), "ISO-8859-1"));
		
		
		//현장 조사 시스템 에서는 정비대상이 2, 도로점용시스템에서는 0으로 인식하기 때문에 다운로드 시 바꿔줘야 함.
		if(bean.getMAINTN_OB().equals("0")) bean.setMAINTN_OB("2");
		
		
		sql.append("INSERT INTO GAPAN_INFO(");
		sql.append("GAPAN_NO, X_COORD, Y_COORD, GP_TYP, PURPOSE_CD, WITH_PNU, WITH_ADDR, WITH_INFO, ROAD_INFO, ");		
		sql.append("AR_SEL, AR_TXT, UC_SEL, UC_TXT, FOUND_DATE, FT_TYP, FT_SEL, FACIL_L, FACIL_W,  ");
		sql.append("FACIL_H, PLACE_L, PLACE_H, PLACE_A, CAR_NUM, CAR_TON, SPECIAL_ST, TAXTATION_AT,");
		sql.append("MAINTN_OB, MT_SEL, DP_SEL, DP_TXT, SG_TYP, SG_SEL, SG_ITM, LIQUOR_SL, LPGAS_US,");
		sql.append("OPEN_TIME, CLOSE_TIME, MEM_NUM, PERMIT_DATE, DAY_SALES, UN_TYP, UN_TXT, NOTES, TYPE,");
		sql.append("SECTION, OWNER_SET, TAX_SET, MUL_FROMDATE, MUL_TODATE, HJ_CD, DISUSE_DATE, DISUSE_REASON, DISUSE_MANAGER,");
		sql.append("OLD_SECTION, REDUCTION_RATE, REDUCTION_REASON, PICKUP_DATE, RETURN_DATE, RETURN_YN, FT_ETC, PICKUP_YN,");
		sql.append("MODIFY_YN, SF_VALUE, HISTORY, MAKE_YM) ");
	
		sql.append("VALUES('"+bean.getGAPAN_NO()+"','"+bean.getX_COORD()+"','"+bean.getY_COORD()+"','"+bean.getGP_TYP()+"','"+bean.getPURPOSE_CD()+"'");	
		sql.append(", '"+bean.getWITH_PNU()+"','"+bean.getWITH_ADDR()+"','"+bean.getWITH_INFO()+"','"+bean.getROAD_INFO()+"'");
		
		sql.append(",'"+bean.getAR_SEL()+"','"+bean.getAR_TXT()+"','"+bean.getUC_SEL()+"','"+bean.getUC_TXT()+"','"+bean.getFOUND_DATE()+"'");
		sql.append(", '"+bean.getFT_TYP()+"','"+bean.getFT_SEL()+"','"+bean.getFACIL_L()+"','"+bean.getFACIL_W()+"'");
		
		sql.append(", '"+bean.getFACIL_H()+"','"+bean.getPLACE_L()+"','"+bean.getPLACE_H()+"','"+bean.getPLACE_A()+"'");
		sql.append(", '"+bean.getCAR_NUM()+"','"+bean.getCAR_TON()+"','"+bean.getSPECIAL_ST()+"','"+bean.getTAXTATION_AT()+"'");
		
		sql.append(", '"+bean.getMAINTN_OB()+"','"+bean.getMT_SEL()+"','"+bean.getDP_SEL()+"','"+bean.getDP_TXT()+"','"+bean.getSG_TYP()+"'");
		sql.append(", '"+bean.getSG_SEL()+"','"+bean.getSG_ITM()+"','"+bean.getLIQUOR_SL()+"','"+bean.getLPGAS_US()+"'");
		
		sql.append(", '"+bean.getOPEN_TIME()+"','"+bean.getCLOSE_TIME()+"','"+bean.getMEM_NUM()+"','"+bean.getPERMIT_DATE()+"','"+bean.getDAY_SALES()+"'");
		sql.append(", '"+bean.getUN_TYP()+"','"+bean.getUN_TXT()+"','"+bean.getNOTES()+"','"+bean.getTYPE()+"'");
		
		sql.append(", '"+bean.getSECTION()+"','"+bean.getOWNER_SET()+"','"+bean.getTAX_SET()+"','"+bean.getMUL_FROMDATE()+"','"+bean.getMUL_TODATE()+"'");
		sql.append(", '"+bean.getHJ_CD()+"','"+bean.getDISUSE_DATE()+"','"+bean.getDISUSE_REASON()+"','"+bean.getDISUSE_MANAGER()+"'");
		
		sql.append(", '"+bean.getOLD_SECTION()+"','"+bean.getREDUCTION_RATE()+"','"+bean.getREDUCTION_REASON()+"','"+bean.getPICKUP_DATE()+"'");
		sql.append(", '"+bean.getRETURN_DATE()+"','"+bean.getRETURN_YN()+"','"+bean.getFT_ETC()+"','"+bean.getPICKUP_YN()+"'");
		
		sql.append(", '"+bean.getMODIFY_YN()+"',"+bean.getSF_VALUE()+",'"+bean.getHISTORY()+"','"+bean.getMAKE_YM()+"')"); 
		
		
	
		psmt = conn.prepareStatement(sql.toString());

		a = psmt.executeUpdate();
		
		
		psmt.close();
	
		
		}
		conn.close();
		
		
	}catch(Exception ex){
		ex.printStackTrace();
	}
	return a;
	
	}


public int InsertGapanHead(MdbConnection dbConn, List list){
				
		Connection conn = null;    
		PreparedStatement psmt = null;
		   
		int a = 0;
		
		try{
			
		conn = dbConn.getConnection();
		
		//EncryptData enc = new EncryptData();
		
		for(int j=0;j<list.size();j++){	
		
		GapanHeadBean bean = (GapanHeadBean)list.get(j);
		
   	    StringBuffer sql = new StringBuffer();
   	  
   				
		if(bean.getOWNER_NAME()!=null && !bean.getOWNER_NAME().equals("")) bean.setOWNER_NAME(new String(bean.getOWNER_NAME().getBytes("euc-kr"), "ISO-8859-1"));
		if(bean.getOWNER_ADDR1()!=null && !bean.getOWNER_ADDR1().equals("")) bean.setOWNER_ADDR1(new String(bean.getOWNER_ADDR1().getBytes("euc-kr"), "ISO-8859-1"));
		if(bean.getOWNER_ADDR2()!=null && !bean.getOWNER_ADDR2().equals("")) bean.setOWNER_ADDR2(new String(bean.getOWNER_ADDR2().getBytes("euc-kr"), "ISO-8859-1"));		
		if(bean.getOWNER_TOADDR1()!=null && !bean.getOWNER_TOADDR1().equals(""))  bean.setOWNER_TOADDR1(new String(bean.getOWNER_TOADDR1().getBytes("euc-kr"), "ISO-8859-1"));	
		if(bean.getOWNER_TOADDR2()!=null && !bean.getOWNER_TOADDR2().equals("")) bean.setOWNER_TOADDR2(new String(bean.getOWNER_TOADDR2().getBytes("euc-kr"), "ISO-8859-1"));
		
		if(bean.getRT_TXT()!=null && !bean.getRT_TXT().equals("")) bean.setRT_TXT(new String(bean.getRT_TXT().getBytes("euc-kr"), "ISO-8859-1"));
		if(bean.getLC_TXT()!=null && !bean.getLC_TXT().equals("")) bean.setLC_TXT(new String(bean.getLC_TXT().getBytes("euc-kr"), "ISO-8859-1"));
		if(bean.getESTATE_MOVE()!=null && !bean.getESTATE_MOVE().equals("")) bean.setESTATE_MOVE(new String(bean.getESTATE_MOVE().getBytes("euc-kr"), "ISO-8859-1"));
		if(bean.getESTATE_REAL()!=null && !bean.getESTATE_REAL().equals("")) bean.setESTATE_REAL(new String(bean.getESTATE_REAL().getBytes("euc-kr"), "ISO-8859-1"));
		
		if(bean.getPARTN_NAME()!=null && !bean.getPARTN_NAME().equals("")) bean.setPARTN_NAME(new String(bean.getPARTN_NAME().getBytes("euc-kr"), "ISO-8859-1"));
		if(bean.getPARTN_ADDR1()!=null && !bean.getPARTN_ADDR1().equals("")) bean.setPARTN_ADDR1(new String(bean.getPARTN_ADDR1().getBytes("euc-kr"), "ISO-8859-1"));
		if(bean.getPARTN_ADDR2()!=null && !bean.getPARTN_ADDR2().equals("")) bean.setPARTN_ADDR2(new String(bean.getPARTN_ADDR2().getBytes("euc-kr"), "ISO-8859-1"));
		if(bean.getPARTN_TOADDR1()!=null && !bean.getPARTN_TOADDR1().equals("")) bean.setPARTN_TOADDR1(new String(bean.getPARTN_TOADDR1().getBytes("euc-kr"), "ISO-8859-1"));
		if(bean.getPARTN_TOADDR2()!=null && !bean.getPARTN_TOADDR2().equals("")) bean.setPARTN_TOADDR2(new String(bean.getPARTN_TOADDR2().getBytes("euc-kr"), "ISO-8859-1"));
		
		if(bean.getNOTE()!=null && !bean.getNOTE().equals("")) bean.setNOTE(new String(bean.getNOTE().getBytes("euc-kr"), "ISO-8859-1"));
		
	
		
		sql.append("INSERT INTO GAPAN_HEAD(");
		sql.append("GAPAN_NO, GP_TYP, OWNER_NAME, OWNER_IDCHK, OWNER_SSN, OWNER_GENDER, OWNER_AGE, OWNER_POST, OWNER_ADDR1,  ");		
		sql.append("OWNER_SAN, OWNER_JIBUN, OWNER_ADDR2, OWNER_SAME, OWNER_TOPOST, OWNER_TOADDR1, OWNER_TOSAN, OWNER_TOJIBUN, OWNER_TOADDR2,  ");
		sql.append("OWNER_TEL, OWNER_HP, RT_SEL, RT_TXT, LC_SEL, LC_TXT, ESTATE_MOVE, ESTATE_REAL, ");
		sql.append("PARTN_NAME, PT_SEL, PARTN_SSN, PARTN_GENDER, PARTN_AGE, PARTN_OSAM, PARTN_POST, PARTN_ADDR1, PARTN_SAN,  ");
		sql.append("PARTN_JIBUN, PARTN_ADDR2, PARTN_SAME, PARTN_TOPOST, PARTN_TOADDR1, PARTN_TOSAN, PARTN_TOJIBUN, PARTN_TOADDR2, PARTN_TEL,  ");
		sql.append("PARTN_HP, ADDR_CHECK1, ADDR_CHECK2 ) ");

		sql.append("VALUES('"+bean.getGAPAN_NO()+"','"+bean.getGP_TYP()+"','"+bean.getOWNER_NAME()+"','"+bean.getOWNER_IDCHK()+"','"+bean.getOWNER_SSN()+"'");	
		sql.append(", '"+bean.getOWNER_GENDER()+"','"+bean.getOWNER_AGE()+"','"+bean.getOWNER_POST()+"','"+bean.getOWNER_ADDR1()+"'");
		
		sql.append(",'"+bean.getOWNER_SAN()+"','"+bean.getOWNER_JIBUN()+"','"+bean.getOWNER_ADDR2()+"','"+bean.getOWNER_SAME()+"','"+bean.getOWNER_TOPOST()+"'");
		sql.append(", '"+bean.getOWNER_TOADDR1()+"','"+bean.getOWNER_TOSAN()+"','"+bean.getOWNER_TOJIBUN()+"','"+bean.getOWNER_TOADDR2()+"'");
		
		sql.append(", '"+bean.getOWNER_TEL()+"','"+bean.getOWNER_HP()+"','"+bean.getRT_SEL()+"','"+bean.getRT_TXT()+"'");
		sql.append(", '"+bean.getLC_SEL()+"','"+bean.getLC_TXT()+"','"+bean.getESTATE_MOVE()+"','"+bean.getESTATE_REAL()+"'");
		
        sql.append(", '"+bean.getPARTN_NAME()+"','"+bean.getPT_SEL()+"','"+bean.getPARTN_SSN()+"','"+bean.getPARTN_GENDER()+"','"+bean.getPARTN_AGE()+"'");
		sql.append(", '"+bean.getPARTN_OSAM()+"','"+bean.getPARTN_POST()+"','"+bean.getPARTN_ADDR1()+"','"+bean.getPARTN_SAN()+"'");
		
		sql.append(", '"+bean.getPARTN_JIBUN()+"','"+bean.getPARTN_ADDR2()+"','"+bean.getPARTN_SAME()+"','"+bean.getPARTN_TOPOST()+"','"+bean.getPARTN_TOADDR1()+"'");
		sql.append(", '"+bean.getPARTN_TOSAN()+"','"+bean.getPARTN_TOJIBUN()+"','"+bean.getPARTN_TOADDR2()+"','"+bean.getPARTN_TEL()+"'");
		
		sql.append(", '"+bean.getPARTN_HP()+"','"+bean.getADDR_CHECK1()+"','"+bean.getADDR_CHECK2()+"')");
		

	/*	System.out.println(sql.toString());
		System.out.println("NOTE : "+bean.getNOTE());*/
		
		psmt = conn.prepareStatement(sql.toString());
		
		a = psmt.executeUpdate();
		
	//	System.out.println("성공&실패 : "+a);
		psmt.close();
	
		
		}
		conn.close();
		
		
	}catch(Exception ex){
		ex.printStackTrace();
	}
	return a;
	
	}

public int InsertGapanBase(MdbConnection dbConn, List list){
	
	Connection conn = null;    
	PreparedStatement psmt = null;
	   
	int a = 0;
	
	try{
		
	conn = dbConn.getConnection();
	
	for(int j=0;j<list.size();j++){	
	
	GapanBaseBean bean = (GapanBaseBean)list.get(j);
	
	    StringBuffer sql = new StringBuffer();
	  				
	if(bean.getMANAGER()!=null && !bean.getMANAGER().equals("")) bean.setMANAGER(new String(bean.getMANAGER().getBytes("euc-kr"), "ISO-8859-1"));
	else bean.setMANAGER("");
	if(bean.getFINISH_ID()!=null && !bean.getFINISH_ID().equals("")) bean.setFINISH_ID(new String(bean.getFINISH_ID().getBytes("euc-kr"), "ISO-8859-1"));
	else bean.setFINISH_ID("");
	if(bean.getCLOSE_ID()!=null && !bean.getCLOSE_ID().equals("")) bean.setCLOSE_ID(new String(bean.getCLOSE_ID().getBytes("euc-kr"), "ISO-8859-1"));
	else bean.setCLOSE_ID("");
	if(bean.getCLOSE_REASON()!=null && !bean.getCLOSE_REASON().equals("")) bean.setCLOSE_REASON(new String(bean.getCLOSE_REASON().getBytes("euc-kr"), "ISO-8859-1"));
	else bean.setCLOSE_REASON("");
	
	if(bean.getREG_DATE()==null) bean.setREG_DATE("");
	if(bean.getUP_DATE()==null) bean.setUP_DATE("");
	if(bean.getCLOSE_DATE()==null) bean.setCLOSE_DATE("");
		
	sql.append("INSERT INTO GAPAN_BASE(");
	sql.append("GAPAN_NO, GP_TYP, REG_DATE, UP_DATE, MANAGER, FINISH_ID, CLOSE_DATE, CLOSE_ID, CLOSE_REASON ) ");		
	sql.append("VALUES(? , ? , ? , ? , ? ,? ,? ,? ,? )");

	//System.out.println(sql.toString());

	psmt = conn.prepareStatement(sql.toString());
	
	psmt.setString(1, bean.getGAPAN_NO());
	psmt.setString(2, bean.getGP_TYP());
	psmt.setString(3, bean.getREG_DATE());
	psmt.setString(4, bean.getUP_DATE());
	psmt.setString(5, bean.getMANAGER());
	psmt.setString(6, bean.getFINISH_ID());
	psmt.setString(7, bean.getCLOSE_DATE());
	psmt.setString(8, bean.getCLOSE_ID());
	psmt.setString(9, bean.getCLOSE_REASON());
	
	a = psmt.executeUpdate();
	
	//System.out.println("성공&실패 : "+a);
	psmt.close();

	
	}
	conn.close();
	
	
}catch(Exception ex){
	ex.printStackTrace();
}
return a;

}

public int InsertGapanUser(MdbConnection dbConn, List list){
	
	Connection conn = null;    
	PreparedStatement psmt = null;
	   
	int a = 0;
	
	try{
		
	conn = dbConn.getConnection();
	
	for(int j=0;j<list.size();j++){	
	
	GapanUserBean bean = (GapanUserBean)list.get(j);
	
	    StringBuffer sql = new StringBuffer();
	  				
	
	//if(bean.getUSER_ID()!=null && !bean.getUSER_ID().equals("")) bean.setUSER_ID(new String(bean.getUSER_ID().getBytes("euc-kr"), "ISO-8859-1"));    
	if(bean.getUSER_NAME()!=null && !bean.getUSER_NAME().equals("")) bean.setUSER_NAME(new String(bean.getUSER_NAME().getBytes("euc-kr"), "ISO-8859-1"));	
	if(bean.getSGG_NM()!=null && !bean.getSGG_NM().equals("")) bean.setSGG_NM(new String(bean.getSGG_NM().getBytes("euc-kr"), "ISO-8859-1"));	
	if(bean.getDEPT_NM()!=null && !bean.getDEPT_NM().equals("")) bean.setDEPT_NM(new String(bean.getDEPT_NM().getBytes("euc-kr"), "ISO-8859-1"));
		
	
	if(bean.getUSE_MODE()==null) bean.setUSE_MODE("");
	if(bean.getUPDATE_YN()==null) bean.setUPDATE_YN("");
	
	sql.append("INSERT INTO GAPAN_USER(");
	sql.append("USER_ID, USER_PW, USER_NAME, SGG_NM, DEPT_NM, GP_TYP, USE_MODE, UPDATE_YN) ");		
	//sql.append("USER_ID, USER_PW)");
	
	
	sql.append(" VALUES('"+bean.getUSER_ID()+"','"+bean.getUSER_PW()+"','"+bean.getUSER_NAME()+"','"+bean.getSGG_NM()+"','"+bean.getDEPT_NM()+"'");	
	sql.append(", '"+bean.getGP_TYP()+"','"+bean.getUSE_MODE()+"','"+bean.getUPDATE_YN()+"')");

	//System.out.println(sql.toString());

	psmt = conn.prepareStatement(sql.toString());

	a = psmt.executeUpdate();
	
	//System.out.println("성공&실패 : "+a);
	psmt.close();

	
	}
	conn.close();
	
	
}catch(Exception ex){
	ex.printStackTrace();
}
return a;

}
	
}
