//	2009		Kim Yun Seo

package main.java.jumyong.saewe.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

import javax.sql.DataSource;

import main.java.jumyong.saewe.model.PlaceWithAddrBean;
import main.java.jumyong.saewe.model.AppealBean;
import main.java.jumyong.saewe.model.TaxationBean;
import main.java.jumyong.saewe.model.PlaceBean;
import main.java.jumyong.saewe.model.CalculationBean;
import main.java.jumyong.saewe.model.SaeweBean;
import main.java.common.util.BeanUtil;
import main.java.common.util.catUtil.Util;

import org.springframework.context.support.MessageSourceAccessor;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.object.MappingSqlQuery;
import org.springframework.jdbc.object.SqlUpdate;


public class SaeweMapDao {
	private	Util				util			= new Util();
	
    protected	class	Search	extends	MappingSqlQuery
    {
        protected 	Search(DataSource ds, MessageSourceAccessor msa)
        {
          	super(ds, msa.getMessage("Querys.jumyong.saewe.Search"));
          	
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
        	SaeweBean	Bean	= new SaeweBean();
        	
        	BeanUtil.mappingBean(Bean, rs);
        	/*
        	System.out.println("Querys.jumyong.saewe.Search!!!!!!!!!!!");
        	Bean.setADMIN_NO(rs.getString("ADMIN_NO"));
        	Bean.setUSE_SECTION(rs.getString("USE_SECTION"));
        	Bean.setTYPE(rs.getString("TYPE"));
        	Bean.setSECTION(rs.getString("SECTION"));
        	Bean.setNAME(rs.getString("NAME"));
        	Bean.setREQ_DATE(rs.getString("UP_DATE"));
        	Bean.setMUL_FROMDATE(rs.getString("MUL_FROMDATE"));
        	Bean.setMUL_TODATE(rs.getString("MUL_TODATE"));
        	Bean.setTAX_YN(rs.getString("TAX_YN"));
        	Bean.setCAL_YN(rs.getString("CAL_YN"));
        	Bean.setRN(rs.getString("RN"));
        	Bean.setSEQ(rs.getString("SEQ"));
        	Bean.setSUM_YEAR(rs.getString("YEAR"));
        	Bean.setTAX_NO(rs.getString("TAX_NO"));
        	Bean.setPARTLY_PERIOD(rs.getString("PARTLY_PERIOD"));
        	Bean.setTOTAL_PERIOD(rs.getString("TOTAL_PERIOD"));
        	Bean.setREFUND_YN(rs.getString("REFUND_YN"));
        	Bean.setAREA(String.valueOf(rs.getFloat("AREA")));
        	
        	Bean.setTAX_DATE(rs.getString("TAX_DATE"));
        	Bean.setBONSE(rs.getString("BONSE"));
        	Bean.setVAT(rs.getString("VAT"));
        	
        	
        	Bean.setPURPOSE_NM(rs.getString("PURPOSE_NM"));
        	Bean.setTAXCODE_NM(rs.getString("TAXCODE_NM"));
        	
        	
        	Bean.setOWNER_SET_NM(rs.getString("OWNER_SET_NM"));
        	Bean.setTAX_SET_NM(rs.getString("TAX_SET_NM"));
        	
        	Bean.setGU_NM(rs.getString("GU_NM"));
        	Bean.setBJ_NM(rs.getString("BJ_NM"));
        	Bean.setHJ_NM(rs.getString("HJ_NM"));
        	Bean.setJIBUN(rs.getString("JIBUN"));
        	
        	Bean.setSUNAP_DATE(rs.getString("SUNAP_DATE"));
        	
        	//********** BEGIN_����_20120321
        	Bean.setEXPONENT(rs.getString("EXPONENT"));
        	Bean.setBUSINESSADDR(rs.getString("BUSINESSADDR"));
        	//********** END_����_20120321
        	//********** BEGIN_KANG_20120417
        	Bean.setCOMPANY_NAME(rs.getString("COMPANY_NAME"));
        	Bean.setEMAIL(rs.getString("EMAIL"));
        	//********** END_KANG_20120417
        	//********** BEGIN_KANG_20120710
        	Bean.setBIZSSN(rs.getString("BIZSSN"));
        	Bean.setBIZ_STATUS(rs.getString("BIZ_STATUS"));
        	Bean.setBIZ_TYPES(rs.getString("BIZ_TYPES"));
        	//********** END_KANG_20120710
			*/
        	return	Bean;
        }
    }

    protected	class	Search_Ilgwal	extends	MappingSqlQuery
    {
        protected 	Search_Ilgwal(DataSource ds, MessageSourceAccessor msa)
        {
          	super(ds, msa.getMessage("Querys.jumyong.saewe.Search_Ilgwal"));
          	
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
          	
          	declareParameter(new SqlParameter(Types.VARCHAR));
        	declareParameter(new SqlParameter(Types.VARCHAR));
        	declareParameter(new SqlParameter(Types.VARCHAR));
          	declareParameter(new SqlParameter(Types.VARCHAR));
          	declareParameter(new SqlParameter(Types.VARCHAR));
          	
          	declareParameter(new SqlParameter(Types.VARCHAR));
      		declareParameter(new SqlParameter(Types.VARCHAR));
      		declareParameter(new SqlParameter(Types.VARCHAR));
	     }
        
        protected	Object mapRow(ResultSet rs, int rownum)	throws	SQLException
        {	
        	TaxationBean	Bean	= new TaxationBean();

        	Bean.setSIGU_CD(rs.getString("SIGU_CD"));						//�ñ��ڵ� 
        	Bean.setTAX_CD(rs.getString("TAX_CD"));							//�����ڵ�
        	Bean.setTAX_YM(rs.getString("TAX_YM"));							//�������
        	Bean.setTAX_GUBUN(rs.getString("TAX_GUBUN"));					//��������
        	Bean.setTAX_SET(rs.getString("TAX_SET"));						//���Ա���

        	Bean.setDEPT_CD(rs.getString("DEPT_CD"));						//�μ��ڵ�
			Bean.setTAX_NO(rs.getString("TAX_NO"));							//������ȣ
        	Bean.setSIDO(rs.getString("SIDO"));								//�õ��ڵ�
        	Bean.setTAXPAYER_ID(rs.getString("SSN"));						//������ID
        	Bean.setTAXPAYER_NM(rs.getString("NAME"));						//�����ڸ�
        	
        	Bean.setTAXPAYER_SET(rs.getString("TAXPAYER_SET"));				//�����ڱ���
        	Bean.setSUBUSEO_CD(rs.getString("SUBUSEO_CD"));					//�����μ��ڵ�
			Bean.setTAX_DATE(rs.getString("TAX_DATE"));						//��������
			Bean.setINDATE(rs.getString("INDATE"));							//��������
			Bean.setOVERDATE(rs.getString("OVERDATE"));						//����������
			
//			Bean.setNAPBU_YMD(rs.getString("TAX_DATE"));					//��������
			Bean.setBONSE(Integer.toString(rs.getInt("BONSE")));			//�����ݾ�
			Bean.setSISE(Integer.toString(rs.getInt("SISE")));				//�ü�
			Bean.setGUSE(Integer.toString(rs.getInt("GUSE")));				//����
			Bean.setGUKSE(Integer.toString(rs.getInt("GUKSE")));			//����
			Bean.setGIGUM(Integer.toString(rs.getInt("GIGUM")));			//���
			
			Bean.setHP(rs.getString("HP"));									//�������޴�����ȣ
			Bean.setTEL(rs.getString("TEL"));								//��������ȭ��ȣ
			Bean.setEMAIL(rs.getString("EMAIL"));							//������EMAIL
			
			//********** BEGIN_����_20120216
			//Bean.setPOST(rs.getString("POST"));								//�����ڿ����ȣ
			Bean.setPOST(rs.getString("TOPOST"));							//�����ڿ����ȣ
			//********** END_����_20120216					
			
			// ���� �ι� �߰� ����۴��� �ּҷ� ����
			Bean.setADDR1(rs.getString("TOADDR1"));							//�����ڿ����ȣ�ּ�
			String JIBUN	=	"";
			String TOBON	= rs.getString("TOBON")==null?"":rs.getString("TOBON");
			String TOBU		= rs.getString("TOBU")==null?"":rs.getString("TOBU");
			String TOSAN	= rs.getString("TOSAN")==null?"":rs.getString("TOSAN");	
			JIBUN += TOSAN.equals("1")?"�� ":"";
			JIBUN += TOBON;
			JIBUN += TOBU.equals("")?"":"-"+TOBU;
			JIBUN += JIBUN.length()>0?" ":"";
			Bean.setADDR2(JIBUN+rs.getString("TOADDR2"));							//�����ڻ��ּ�
			Bean.setROAD_ADD(rs.getString("ROAD_ADDR"));					//�����ڵ��θ��ּ�
			
			//********** BEGIN_����_20120216
			Bean.setSI(rs.getString("TOSI"));
			Bean.setGUN(rs.getString("TOGUN"));
			Bean.setDORO_NM(rs.getString("TO_DORO_NM"));
			Bean.setABD_NM(rs.getString("TO_BD_NM"));
			Bean.setBD_DET_NM(rs.getString("TO_BD_DET_NM"));
			Bean.setBD_BON(rs.getString("TO_BD_BON"));
			Bean.setBD_BU(rs.getString("TO_BD_BU"));			
			//********** END_����_20120216
			
			Bean.setLIVE(rs.getString("LIVE"));								//���ֻ���
			Bean.setOBJ_SET(rs.getString("OBJ_SET"));						//���Ǳ���
			Bean.setBD_NM(rs.getString("BD_NM"));							//���Ǹ�
			
			Bean.setSIGUNGU(rs.getString("SIGUNGU"));						//����OCR�ñ��ڵ�
			Bean.setBJ_CD(rs.getString("BJ_CD"));							//���ǹ��������ڵ�
			Bean.setSPC_CD(rs.getString("SPC_CD"));							//����Ư�����ڵ�
			Bean.setBONBUN(rs.getString("BONBUN"));							//���Ǻ���
			Bean.setBUBUN(rs.getString("BUBUN"));							//���Ǻι�
			
			Bean.setTONG(rs.getString("TONG"));								//������
			Bean.setBAN(rs.getString("BAN"));								//���ǹ�
//			Bean.setMUL_APT_NM(rs.getString("BD_NM"));						//���Ǿ���Ʈ��
			Bean.setBD_DONG(rs.getString("BD_DONG"));						//���ǵ�
			Bean.setBD_HO(rs.getString("BD_HO"));							//����ȣ
			Bean.setMUL_POST(rs.getString("MUL_POST"));						//���ǿ����ȣ
			
			Bean.setNEAR_ADDR1(rs.getString("WITH_ADDR1"));					//���ǿ����ȣ�ּ�
			Bean.setNEAR_ADDR2(rs.getString("WITH_ADDR2"));					//���ǻ��ּ�
			Bean.setHJ_CD(rs.getString("HJ_CD"));							//�������ڵ�
			Bean.setFORM_ADJUST(rs.getString("FORM_ADJUST"));				//�׸�1(���������)
			Bean.setPURPOSE_NM(rs.getString("PURPOSE_NM"));					//�׸�2(�������)
			
			Bean.setTYPE_NM(rs.getString("TYPE_NM"));						//�׸�3(����)
			Bean.setAREA(rs.getString("AREA"));							    //�׸�5(�������)
			Bean.setADMIN_NO(rs.getString("ADMIN_NO"));						//�׸�6(������ȣ)
			Bean.setADD_SET(rs.getString("ADD_SET"));                       //����������
			Bean.setRATE(Integer.toString(rs.getInt("RATE")));			    //Ư������ 		
			
			Bean.setRATE_CAUSE(rs.getString("RATE_CAUSE"));					//Ư�������������
			Bean.setNOTES(rs.getString("NOTES"));						    //���
			Bean.setOCR_SIGU_CD(rs.getString("OCR_SIGU_CD"));				//OCR�ñ��ڵ�
			Bean.setOCR_BUSEO_CD(rs.getString("OCR_BUSEO_CD"));				//OCR�μ��ڵ�
			Bean.setVAT(Integer.toString(rs.getInt("VAT")));				//�ΰ�����ü�ݾ�
			
			Bean.setADD_YN(rs.getString("ADD_YN"));							//����ݸ�������	
			Bean.setLIMIT_SUM(Integer.toString(rs.getInt("LIMIT_SUM")));
			Bean.setLIMIT_CNT(Integer.toString(rs.getInt("LIMIT_CNT")));
			Bean.setINTAX(Integer.toString(rs.getInt("INTAX")));
			Bean.setOVERTAX(Integer.toString(rs.getInt("OVERTAX")));
			
			Bean.setFORM1(rs.getString("FORM1"));
			Bean.setFORM2(rs.getString("FORM2"));
			Bean.setGU_CODE(rs.getString("SIGUNGU"));
//			Bean.setBUNNAP_NO(rs.getString("BUNNAP_NO"));
			Bean.setYEAR(rs.getString("YEAR"));
//			Bean.setSUSI_NO(rs.getString("SUSI_NO"));
			Bean.setTAX_YN(rs.getString("TAX_YN"));
//			
			Bean.setGU_NM(rs.getString("GU_NM"));
//			Bean.setDEPT_NM(rs.getString("DEPT_NM"));
			Bean.setSECTION(rs.getString("SECTION"));
//			Bean.setUSE_DATE(util.Date_Paste(rs.getString("MUL_FROMDATE"))+"~"+util.Date_Paste(rs.getString("MUL_TODATE")));//�׸�4(���Ⱓ)
			Bean.setMUL_FROMDATE(util.Date_Paste(rs.getString("MUL_FROMDATE")));	//�׸�4(���,���� �ϰ��   �����۱Ⱓ)
			Bean.setMUL_TODATE(util.Date_Paste(rs.getString("MUL_TODATE")));		//�׸�4(���,���� �ϰ��   �������Ⱓ)
			Bean.setTOTAL_PERIOD(rs.getString("TOTAL_PERIOD"));						//�׸�4(�Ͻ� �ϰ��   �����۱Ⱓ)
			
			Bean.setPARTLY_PERIOD(rs.getString("PARTLY_PERIOD"));					//�׸�4(�Ͻ� �ϰ��   �������Ⱓ)
			Bean.setFROMDATE(util.Date_Paste(rs.getString("FROMDATE")));	//�׸�4-����Ⱓ���� ����
			Bean.setTODATE(util.Date_Paste(rs.getString("TODATE")));		//�׸�4-����Ⱓ���� ����
        	
        	return	Bean;
        }
    } 
    
    protected	class	SanchulSearch	extends	MappingSqlQuery
    {
        protected 	SanchulSearch(DataSource ds, MessageSourceAccessor msa)
        {
          	super(ds, msa.getMessage("Querys.jumyong.saewe.SanchulSearch"));
          	
          	declareParameter(new SqlParameter(Types.VARCHAR));
        	declareParameter(new SqlParameter(Types.VARCHAR));
      		declareParameter(new SqlParameter(Types.VARCHAR));
	        declareParameter(new SqlParameter(Types.VARCHAR));
        }
        
        protected	Object mapRow(ResultSet rs, int rownum)	throws	SQLException
        {
        	CalculationBean	Bean	= new CalculationBean();

        	Bean.setADMIN_NO(rs.getString("ADMIN_NO"));
        	Bean.setYEAR(rs.getString("YEAR"));
        	Bean.setSEQ(rs.getString("SEQ"));
        	Bean.setPRICE(rs.getString("PRICE"));
        	//Bean.setAREA_AFTER(rs.getString("AREA_AFTER"));
        	Bean.setAREA_AFTER(String.valueOf(rs.getFloat("AREA")));
        	Bean.setRATE(String.valueOf(rs.getFloat("RATE")));
        	//Bean.setFROMDATE(rs.getString("FROMDATE"));
        	//Bean.setTODATE(rs.getString("TODATE"));
        	//Bean.setSUM_YEAR(rs.getString("SUM_YEAR"));
        	Bean.setSUM_ADJUST(rs.getString("SUM"));			//�������� �����
        	Bean.setFROMDATE(NullCheck(rs.getString("FROMDATE")));
        	Bean.setTODATE(NullCheck(rs.getString("TODATE")));
        	
        //	if(Bean.getFROMDATE() != null	||	Bean.getFROMDATE().trim().equals(""))
        //		Bean.setSANCHUL_DATE(Bean.getFROMDATE() + " ~ " + Bean.getTODATE());
        	
        	return	Bean;
        }
    }
    
    protected	class	SanchulInfo_View	extends	MappingSqlQuery
    {
        protected 	SanchulInfo_View(DataSource ds, MessageSourceAccessor msa)
        {
          	super(ds, msa.getMessage("Querys.jumyong.saewe.SanchulInfo_View"));
          	
      		declareParameter(new SqlParameter(Types.VARCHAR));
      		declareParameter(new SqlParameter(Types.VARCHAR));
        }
        
        protected	Object mapRow(ResultSet rs, int rownum)	throws	SQLException
        {
        	CalculationBean	Bean	= new CalculationBean();

        	Bean.setADMIN_NO(NullCheck(rs.getString("ADMIN_NO")));
        	Bean.setYEAR(NullCheck(rs.getString("YEAR")));
        	Bean.setSEQ(NullCheck(rs.getString("SEQ")));
        	Bean.setPRICE(NullCheck(rs.getString("PRICE")));
        	//Bean.setAREA_AFTER(NullCheck(rs.getString("AREA_AFTER")));
        	Bean.setAREA_AFTER(NullCheck(String.valueOf(rs.getFloat("AREA"))));
        	Bean.setRATE(String.valueOf(rs.getFloat("RATE")));
        	//Bean.setSUM_LASTYEAR(NullCheck(rs.getString("SUM_LASTYEAR")));
        	//Bean.setSUM_YEAR(NullCheck(rs.getString("SUM_YEAR")));
        	Bean.setSUM_ADJUST(NullCheck(rs.getString("SUM")));
        	Bean.setFROMDATE(NullCheck(rs.getString("FROMDATE")));
        	Bean.setTODATE(NullCheck(rs.getString("TODATE")));
        	Bean.setFORM_ADJUST(NullCheck(rs.getString("FORM_ADJUST")));
        	//Bean.setFORM(NullCheck(rs.getString("FORM")));
        	//Bean.setADJUSTMENT(String.valueOf(rs.getFloat("ADJUSTMENT")));
             	
        //	System.out.println(rs.getFloat("RATE"));
        //	System.out.println(String.valueOf(rs.getFloat("RATE")));
        
        	return	Bean;
        }
    }
    
    //	������ ����
    protected	class	Jumin_View	extends	MappingSqlQuery
    {
        protected 	Jumin_View(DataSource ds, MessageSourceAccessor msa)
        {
          	super(ds, msa.getMessage("Querys.jumyong.saewe.Jumin_View"));
          	
	        declareParameter(new SqlParameter(Types.VARCHAR));
        }
        
        protected	Object mapRow(ResultSet rs, int rownum)	throws	SQLException
        {
        	AppealBean	Bean	= new AppealBean();
        	
        	System.out.println(" !! Querys.jumyong.saewe.Jumin_View !!!0117");
        	
        	Bean.setADMIN_NO(rs.getString("ADMIN_NO"));
  			Bean.setNAME(rs.getString("NAME"));
			Bean.setSSN(rs.getString("SSN"));
			Bean.setBIZSSN(rs.getString("BIZSSN"));
			Bean.setBIZ_STATUS(rs.getString("BIZ_STATUS"));
			Bean.setBIZ_TYPES(rs.getString("BIZ_TYPES"));
			Bean.setPOST(rs.getString("POST"));
			Bean.setADDR1(rs.getString("ADDR1"));
			Bean.setADDR2(rs.getString("ADDR2"));
			Bean.setEMAIL(rs.getString("EMAIL"));
			Bean.setTEL(rs.getString("TEL"));
			Bean.setHP(rs.getString("HP"));
			Bean.setTOPOST(rs.getString("TOPOST"));
			Bean.setTOADDR1(rs.getString("TOADDR1"));
			Bean.setTOADDR2(rs.getString("TOADDR2"));
			Bean.setTOTEL(rs.getString("TOTEL"));
			Bean.setTOHP(rs.getString("TOHP"));	
			Bean.setTOMAIL(rs.getString("TOMAIL"));
			Bean.setBEFORE_PERMISSION(rs.getString("B_PERMISSION"));
			Bean.setREFERENCE(rs.getString("REFERENCE"));
			Bean.setTONM(rs.getString("TONM"));
			
			Bean.setSAN(rs.getString("SAN"));
			Bean.setTOSAN(rs.getString("TOSAN"));
			Bean.setBON(rs.getString("BON"));
			Bean.setBU(rs.getString("BU"));
			Bean.setTOBON(rs.getString("TOBON"));
			Bean.setTOBU(rs.getString("TOBU"));
			
			Bean.setSI(rs.getString("SI"));
			Bean.setGUN(rs.getString("GUN"));
			Bean.setDORO_NM(rs.getString("DORO_NM"));
			Bean.setBD_BON(rs.getString("BD_BON"));
			Bean.setBD_BU(rs.getString("BD_BU"));
			Bean.setBD_NM(rs.getString("BD_NM")); 
			Bean.setBD_DET_NM(rs.getString("BD_DET_NM"));
			
			Bean.setTOSI(rs.getString("TOSI"));
			Bean.setTOGUN(rs.getString("TOGUN"));
			Bean.setTODORO_NM(rs.getString("TO_DORO_NM"));
			Bean.setTOBD_BON(rs.getString("TO_BD_BON"));
			Bean.setTOBD_BU(rs.getString("TO_BD_BU"));
			Bean.setTOBD_NM(rs.getString("TO_BD_NM")); 
			Bean.setTOBD_DET_NM(rs.getString("TO_BD_DET_NM")); 
			
			
			
        	return	Bean;
        }
    }
    
    //	������ ����
    protected	class	Jumji_View	extends	MappingSqlQuery
    {
        protected 	Jumji_View(DataSource ds, MessageSourceAccessor msa)
        {
          	super(ds, msa.getMessage("Querys.jumyong.saewe.Jumji_View"));
          	
	        declareParameter(new SqlParameter(Types.VARCHAR));
        }
        
        protected	Object mapRow(ResultSet rs, int rownum)	throws	SQLException
        {
        	PlaceBean	Bean	= new PlaceBean();

			Bean.setADMIN_NO(rs.getString("ADMIN_NO"));
			Bean.setTYPE(rs.getString("TYPE"));
			Bean.setSECTION(rs.getString("SECTION"));
			Bean.setPURPOSE_CD(rs.getString("PURPOSE_CD"));
			Bean.setPARKING_NUM(rs.getString("PARKING_NUM"));
			
			Bean.setOWNER_SET(rs.getString("OWNER_SET"));
			Bean.setTAX_SET(rs.getString("TAX_SET"));
			Bean.setMUL_POST(rs.getString("MUL_POST"));
			Bean.setSIDO(rs.getString("SIDO"));
			Bean.setSIGUNGU(rs.getString("SIGUNGU"));
			
			Bean.setBJ_CD(rs.getString("BJ_CD"));
			Bean.setHJ_CD(rs.getString("HJ_CD"));
			Bean.setSPC_CD(rs.getString("SPC_CD"));
			Bean.setBONBUN(rs.getString("BONBUN"));
			Bean.setBUBUN(rs.getString("BUBUN"));
			
			Bean.setTONG(rs.getString("TONG"));
			Bean.setBAN(rs.getString("BAN"));
			Bean.setBD_NM(rs.getString("BD_NM"));
			Bean.setBD_DONG(rs.getString("BD_DONG"));
			Bean.setBD_HO(rs.getString("BD_HO"));
			
			Bean.setMUL_FROMDATE(rs.getString("MUL_FROMDATE"));
			Bean.setMUL_TODATE(rs.getString("MUL_TODATE"));
			Bean.setWORK_FROMDATE(rs.getString("WORK_FROMDATE"));
			Bean.setWORK_TODATE(rs.getString("WORK_TODATE"));
			Bean.setEXE_INFO(rs.getString("EXE_INFO"));
			
			Bean.setRIVER_NM(rs.getString("RIVER_NM"));			
			Bean.setWITH_POST(rs.getString("WITH_POST"));
			Bean.setWITH_ADDR1(rs.getString("WITH_ADDR1"));
			Bean.setWITH_ADDR2(rs.getString("WITH_ADDR2"));
			Bean.setTOTAL_PERIOD(rs.getString("TOTAL_PERIOD"));
			
			Bean.setPARTLY_PERIOD(rs.getString("PARTLY_PERIOD"));
			Bean.setROAD_ADDR(rs.getString("ROAD_ADDR"));
			Bean.setROAD_BON(rs.getString("ROAD_BON"));
			Bean.setROAD_BU(rs.getString("ROAD_BU"));
			Bean.setREFERENCE(rs.getString("REFERENCE"));
			
			Bean.setWITH_SUM_PRICE(rs.getString("WITH_SUM_PRICE"));			
			Bean.setAREA_SIZE(String.valueOf(rs.getFloat("AREA_SIZE")));
			Bean.setRIVER_RANK(rs.getString("RIVER_RANK"));
			
			Bean.setREDUCTION_RATE(String.valueOf(rs.getFloat("REDUCTION_RATE")));
			Bean.setREDUCTION_REASON(rs.getString("REDUCTION_REASON"));
			Bean.setPERCENT_RATE(String.valueOf(rs.getFloat("PERCENT_RATE")));
			Bean.setPERCENT_REASON(rs.getString("PERCENT_REASON"));
			
        	return	Bean;
        }
    }
    
    //	�ΰ����� ���κ���
    protected	class	Bugwa_View	extends	MappingSqlQuery
    {
        protected 	Bugwa_View(DataSource ds, MessageSourceAccessor msa)
        {
          	super(ds, msa.getMessage("Querys.jumyong.saewe.Bugwa_View"));
          	
	        declareParameter(new SqlParameter(Types.VARCHAR));
	        declareParameter(new SqlParameter(Types.VARCHAR));
        }
        
        protected	Object mapRow(ResultSet rs, int rownum)	throws	SQLException
        {
        	TaxationBean	Bean	= new TaxationBean();
        	
        	Bean.setSIGU_CD(rs.getString("SIGU_CD"));						//�ñ��ڵ� 
        	Bean.setTAX_CD(rs.getString("TAX_CD"));							//�����ڵ�
        	Bean.setTAX_YM(rs.getString("TAX_YM"));							//�������
        	Bean.setTAX_GUBUN(rs.getString("TAX_GUBUN"));					//��������
        	Bean.setTAX_SET(rs.getString("TAX_SET"));						//���Ա���
        	Bean.setDEPT_CD(rs.getString("DEPT_CD"));						//�μ��ڵ�
			Bean.setTAX_NO(rs.getString("TAX_NO"));							//������ȣ
        	Bean.setSIDO(rs.getString("SIDO"));								//�õ��ڵ�
        	Bean.setTAXPAYER_ID(rs.getString("SSN"));						//������ID
        	Bean.setTAXPAYER_NM(rs.getString("NAME"));						//�����ڸ�
        	Bean.setTAXPAYER_SET(rs.getString("TAXPAYER_SET"));				//�����ڱ���
        	Bean.setSUBUSEO_CD(rs.getString("SUBUSEO_CD"));					//�����μ��ڵ�
			Bean.setTAX_DATE(rs.getString("TAX_DATE"));						//��������
			Bean.setINDATE(rs.getString("INDATE"));							//��������
			Bean.setOVERDATE(rs.getString("OVERDATE"));						//����������
			Bean.setBONSE(Integer.toString(rs.getInt("BONSE")));			//�����ݾ�
			Bean.setSISE(Integer.toString(rs.getInt("SISE")));				//�ü�
			Bean.setGUSE(Integer.toString(rs.getInt("GUSE")));				//����
			Bean.setGUKSE(Integer.toString(rs.getInt("GUKSE")));			//����
			Bean.setGIGUM(Integer.toString(rs.getInt("GIGUM")));			//���
			Bean.setHP(rs.getString("HP"));									//�������޴�����ȣ
			Bean.setTEL(rs.getString("TEL"));								//��������ȭ��ȣ
			Bean.setEMAIL(rs.getString("EMAIL"));							//������EMAIL
			
			//********** BEGIN_����_20120216
			//Bean.setPOST(rs.getString("POST"));								//�����ڿ����ȣ
			Bean.setPOST(rs.getString("TOPOST"));							//�����ڿ����ȣ
			//********** END_����_20120216		
			
			// ���� �ι� �߰� ����۴��� �ּҷ� ����
			Bean.setADDR1(rs.getString("TOADDR1"));							//�����ڿ����ȣ�ּ�
			String JIBUN	=	"";
			String TOBON	= rs.getString("TOBON")==null?"":rs.getString("TOBON");
			String TOBU		= rs.getString("TOBU")==null?"":rs.getString("TOBU");
			String TOSAN	= rs.getString("TOSAN")==null?"":rs.getString("TOSAN");	
			JIBUN += TOSAN.equals("1")?"�� ":"";
			JIBUN += TOBON;
			JIBUN += TOBU.equals("")?"":"-"+TOBU;
			JIBUN += JIBUN.length()>0?" ":"";
			
			Bean.setADDR2(JIBUN+rs.getString("TOADDR2"));							//�����ڻ��ּ�
			
			
			Bean.setROAD_ADD(rs.getString("ROAD_ADDR"));					//�����ڵ��θ��ּ�
			
			//********** BEGIN_����_20120216
			Bean.setSI(rs.getString("TOSI"));
			Bean.setGUN(rs.getString("TOGUN"));
			Bean.setDORO_NM(rs.getString("TO_DORO_NM"));
			Bean.setABD_NM(rs.getString("TO_BD_NM"));
			Bean.setBD_DET_NM(rs.getString("TO_BD_DET_NM"));
			Bean.setBD_BON(rs.getString("TO_BD_BON"));
			Bean.setBD_BU(rs.getString("TO_BD_BU"));			
			//********** END_����_20120216
			
			Bean.setLIVE(rs.getString("LIVE"));								//���ֻ���
			Bean.setOBJ_SET(rs.getString("OBJ_SET"));						//���Ǳ���
			Bean.setBD_NM(rs.getString("BD_NM"));							//���Ǹ�
			Bean.setSIGUNGU(rs.getString("SIGUNGU"));						//����OCR�ñ��ڵ�
			Bean.setBJ_CD(rs.getString("BJ_CD"));							//���ǹ��������ڵ�
			Bean.setSPC_CD(rs.getString("SPC_CD"));							//����Ư�����ڵ�
			Bean.setBONBUN(rs.getString("BONBUN"));							//���Ǻ���
			Bean.setBUBUN(rs.getString("BUBUN"));							//���Ǻι�
			Bean.setTONG(rs.getString("TONG"));								//������
			Bean.setBAN(rs.getString("BAN"));								//���ǹ�
			Bean.setBD_DONG(rs.getString("BD_DONG"));						//���ǵ�
			Bean.setBD_HO(rs.getString("BD_HO"));							//����ȣ
			Bean.setMUL_POST(rs.getString("MUL_POST"));						//���ǿ����ȣ
			Bean.setNEAR_ADDR1(rs.getString("WITH_ADDR1"));					//���ǿ����ȣ�ּ�
			Bean.setNEAR_ADDR2(rs.getString("WITH_ADDR2"));					//���ǻ��ּ�
			Bean.setHJ_CD(rs.getString("HJ_CD"));							//�������ڵ�
			Bean.setFORM_ADJUST(rs.getString("FORM_ADJUST"));				//�׸�1(���������)
			Bean.setPURPOSE_NM(rs.getString("PURPOSE_NM"));					//�׸�2(�������)
			Bean.setTYPE_NM(rs.getString("TYPE_NM"));						//�׸�3(����)
			Bean.setAREA(rs.getString("AREA"));							    //�׸�5(�������)
			Bean.setADMIN_NO(rs.getString("ADMIN_NO"));						//�׸�6(������ȣ)
			Bean.setADD_SET(rs.getString("ADD_SET"));                       //����������
			Bean.setRATE(Integer.toString(rs.getInt("RATE")));			    //Ư������ 		
			Bean.setRATE_CAUSE(rs.getString("RATE_CAUSE"));					//Ư�������������
			Bean.setNOTES(rs.getString("NOTES"));						    //���
			Bean.setOCR_SIGU_CD(rs.getString("OCR_SIGU_CD"));				//OCR�ñ��ڵ�
			Bean.setOCR_BUSEO_CD(rs.getString("OCR_BUSEO_CD"));				//OCR�μ��ڵ�
			Bean.setADD_YN(rs.getString("ADD_YN"));							//����ݸ�������	
			
			Bean.setLIMIT_SUM(Integer.toString(rs.getInt("LIMIT_SUM")));
			Bean.setLIMIT_CNT(Integer.toString(rs.getInt("LIMIT_CNT")));
			Bean.setINTAX(Integer.toString(rs.getInt("INTAX")));
			Bean.setOVERTAX(Integer.toString(rs.getInt("OVERTAX")));
			Bean.setFORM1(rs.getString("FORM1"));
			Bean.setFORM2(rs.getString("FORM2"));
			Bean.setGU_CODE(rs.getString("SIGUNGU"));
			Bean.setYEAR(rs.getString("CAL_YEAR"));
			Bean.setTAX_YN(rs.getString("TAX_YN"));
			Bean.setSECTION(rs.getString("SECTION"));
			Bean.setMUL_FROMDATE(util.Date_Paste(rs.getString("MUL_FROMDATE")));	//�׸�4(���,���� �ϰ��   �����۱Ⱓ)
			Bean.setMUL_TODATE(util.Date_Paste(rs.getString("MUL_TODATE")));		//�׸�4(���,���� �ϰ��   �������Ⱓ)
			Bean.setTOTAL_PERIOD(rs.getString("TOTAL_PERIOD"));						//�׸�4(�Ͻ� �ϰ��   �����۱Ⱓ)
			Bean.setPARTLY_PERIOD(rs.getString("PARTLY_PERIOD"));					//�׸�4(�Ͻ� �ϰ��   �������Ⱓ)
			
			Bean.setFROMDATE(util.Date_Paste(rs.getString("FROMDATE")));	//�׸�4-����Ⱓ���� ����
			Bean.setTODATE(util.Date_Paste(rs.getString("TODATE")));		//�׸�4-����Ⱓ���� ����
			Bean.setSEQ(rs.getString("CSEQ"));
			Bean.setROAD_BON(rs.getString("ROAD_BON"));			
			Bean.setROAD_BU(rs.getString("ROAD_BU"));
			
			Bean.setSUM_ADJUST(rs.getString("SUM_ADJUST"));
			Bean.setVAT(rs.getString("VAT"));
			Bean.setCVAT(rs.getString("CVAT"));
			Bean.setSSN(rs.getString("SSN"));
			Bean.setSUNAP_DATE(rs.getString("SUNAP_DATE"));
			
			//********** BEGIN_mihong_20150904
			Bean.setREDUCTION_RATE(rs.getString("REDUCTION_RATE"));	//������
			//********** END_mihong_20150904
			
			System.out.println("�ΰ��� : : :"+Bean.getVAT());
			
        	return	Bean;
        }
    }
    
    //	�ΰ����� ����
    protected	class	Bugwa_Modify	extends	SqlUpdate
    {
    	protected	Bugwa_Modify(DataSource ds, MessageSourceAccessor msa)
        {
            super(ds, msa.getMessage("Querys.jumyong.saewe.Bugwa_Modify"));
         
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
            
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));            
        }
    }
    
    //	�ΰ����� �Է�
    protected	class	Bugwa_Register	extends	SqlUpdate
    {
    	protected	Bugwa_Register(DataSource ds, MessageSourceAccessor msa)
        {
            super(ds, msa.getMessage("Querys.jumyong.saewe.Bugwa_Register"));
         
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
            
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            
            declareParameter(new SqlParameter(Types.VARCHAR));
            
                   
        }
    }
    
    
    //	�ΰ������� �ʿ��� ������, ������ ������ �����´�.
    protected	class	Bugwa_DataInfo	extends	MappingSqlQuery
    {
        protected 	Bugwa_DataInfo(DataSource ds, MessageSourceAccessor msa)
        {
          	super(ds, msa.getMessage("Querys.jumyong.saewe.Bugwa_DataInfo"));
          	
	        declareParameter(new SqlParameter(Types.VARCHAR));
	        declareParameter(new SqlParameter(Types.VARCHAR));
        }
        
        protected	Object mapRow(ResultSet rs, int rownum)	throws	SQLException
        {
        	SaeweBean	Bean	= new SaeweBean();

    		//	Bean.setADMIN_NO(rs.getString("ADMIN_NO"));
			//Bean.setGU_CODE(rs.getString("GU_CODE"));
			Bean.setTAX_SET(rs.getString("TAX_SET"));			//���Ա���
			Bean.setSUM_ADJUST(rs.getString("SUM"));
			Bean.setVAT(rs.getString("VAT"));
			Bean.setFROMDATE(NullCheck(rs.getString("FROMDATE")));
			Bean.setTODATE(NullCheck(rs.getString("TODATE")));
			Bean.setYEAR(rs.getString("YEAR"));
			
        	return	Bean;
        }
    }
    
    //	�ΰ����� ����
    protected	class	BugwaDelete	extends	SqlUpdate
    {
        protected 	BugwaDelete(DataSource ds, MessageSourceAccessor msa)
        {
          	super(ds, msa.getMessage("Querys.jumyong.saewe.BugwaDelete"));
          	
	        declareParameter(new SqlParameter(Types.VARCHAR));
	        declareParameter(new SqlParameter(Types.VARCHAR));
        }
    }
    
    
    //	���ܼ��� �ΰ�		-	�ΰ����� ���̺� �ΰ� ���� Ȯ��
    protected	class	SaeweSuipBugwa_Check	extends	MappingSqlQuery
    {
        protected 	SaeweSuipBugwa_Check(DataSource ds, MessageSourceAccessor msa)
        {
          	super(ds, msa.getMessage("Querys.jumyong.saewe.SaeweSuipBugwa_Check"));
          	
	        declareParameter(new SqlParameter(Types.VARCHAR));
	        declareParameter(new SqlParameter(Types.VARCHAR));
        }
        
        protected	Object mapRow(ResultSet rs, int rownum)	throws	SQLException
        {
        //	SaeweBean	Bean	= new SaeweBean();

		//	Bean.setTAX_YN(rs.getString("TAX_YN"));
			
        	return	rs.getString("TAX_YN");
        }
    }
    
    //	���ܼ��� �ΰ�		-	�ΰ����� ���̺� �ΰ� ���
    protected	class	SaeweSuipBugwa_Taxation_Info	extends	SqlUpdate
    {
    	protected	SaeweSuipBugwa_Taxation_Info(DataSource ds, MessageSourceAccessor msa)
        {
            super(ds, msa.getMessage("Querys.jumyong.saewe.SaeweSuipBugwa_Taxation_Info"));
         
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
        }
    }
    
    //	���ܼ��� �ΰ�		-	�������� ���̺� �ΰ� ���
    protected	class	SaeweSuipBugwa_Admin_Base	extends	SqlUpdate
    {
    	protected	SaeweSuipBugwa_Admin_Base(DataSource ds, MessageSourceAccessor msa)
        {
            super(ds, msa.getMessage("Querys.jumyong.saewe.SaeweSuipBugwa_Admin_Base"));
         
            declareParameter(new SqlParameter(Types.VARCHAR));
        }
    }

    //	���ܼ��� �ΰ�		-	cal_sum_info tax_seq�� 1�� set
    protected	class	SetCal_Sum_Info_taxseq	extends	SqlUpdate
    {
    	protected	SetCal_Sum_Info_taxseq(DataSource ds, MessageSourceAccessor msa)
        {
            super(ds, msa.getMessage("Querys.jumyong.saewe.SetCal_Sum_Info_taxseq"));
         
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
        }
    }
    
    protected	String	NullCheck(String str)
    {
    	if(str	==	null)
    		str	= "";
    	
    	return	str;
    }
    
    
    // ���ܼ��� ����� �ϰ� �ΰ�
	protected	class	executeSearch_Ilgwal_junggi	extends	MappingSqlQuery
    {
        protected 	executeSearch_Ilgwal_junggi(DataSource ds, MessageSourceAccessor msa)
        {
          	super(ds, msa.getMessage("Querys.jumyong.saewe.Search_Ilgwal_junggi"));       	
          	
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
          	
          	declareParameter(new SqlParameter(Types.VARCHAR));
        	declareParameter(new SqlParameter(Types.VARCHAR));

	     }
        
        protected	Object mapRow(ResultSet rs, int rownum)	throws	SQLException
        {	
        	TaxationBean	Bean	= new TaxationBean();

        	Bean.setSIGU_CD(rs.getString("SIGU_CD"));						//�ñ��ڵ� 
        	Bean.setTAX_CD(rs.getString("TAX_CD"));							//�����ڵ�
        	Bean.setTAX_YM(rs.getString("TAX_YM"));							//�������
        	Bean.setTAX_GUBUN(rs.getString("TAX_GUBUN"));					//��������
        	Bean.setTAX_SET(rs.getString("TAX_SET"));						//���Ա���

        	Bean.setDEPT_CD(rs.getString("DEPT_CD"));						//�μ��ڵ�
			Bean.setTAX_NO(rs.getString("TAX_NO"));							//������ȣ
        	Bean.setSIDO(rs.getString("SIDO"));								//�õ��ڵ�
        	Bean.setTAXPAYER_ID(rs.getString("SSN"));						//������ID
        	Bean.setTAXPAYER_NM(rs.getString("NAME"));						//�����ڸ�
        	
        	Bean.setTAXPAYER_SET(rs.getString("TAXPAYER_SET"));				//�����ڱ���
        	Bean.setSUBUSEO_CD(rs.getString("SUBUSEO_CD"));					//�����μ��ڵ�
			Bean.setTAX_DATE(rs.getString("TAX_DATE"));						//��������
			Bean.setINDATE(rs.getString("INDATE"));							//��������
			Bean.setOVERDATE(rs.getString("OVERDATE"));						//����������
			
//			Bean.setNAPBU_YMD(rs.getString("TAX_DATE"));					//��������
			Bean.setBONSE(Integer.toString(rs.getInt("BONSE")));			//�����ݾ�
			Bean.setSISE(Integer.toString(rs.getInt("SISE")));				//�ü�
			Bean.setGUSE(Integer.toString(rs.getInt("GUSE")));				//����
			Bean.setGUKSE(Integer.toString(rs.getInt("GUKSE")));			//����
			Bean.setGIGUM(Integer.toString(rs.getInt("GIGUM")));			//���
			
			Bean.setHP(rs.getString("HP"));									//�������޴�����ȣ
			Bean.setTEL(rs.getString("TEL"));								//��������ȭ��ȣ
			Bean.setEMAIL(rs.getString("EMAIL"));							//������EMAIL
			
			
			//********** BEGIN_����_20120326
			//Bean.setPOST(rs.getString("POST"));							//�����ڿ����ȣ
			Bean.setPOST(rs.getString("TOPOST"));							//�����ڿ����ȣ
			//********** END_����_20120326					
			// ���� �ι� �߰� ����۴��� �ּҷ� ����
			Bean.setADDR1(rs.getString("TOADDR1"));							//�����ڿ����ȣ�ּ�
			String JIBUN	=	"";
			String TOBON	= rs.getString("TOBON")==null?"":rs.getString("TOBON");
			String TOBU		= rs.getString("TOBU")==null?"":rs.getString("TOBU");
			String TOSAN	= rs.getString("TOSAN")==null?"":rs.getString("TOSAN");	
			JIBUN += TOSAN.equals("1")?"�� ":"";
			JIBUN += TOBON;
			JIBUN += TOBU.equals("")?"":"-"+TOBU;
			JIBUN += JIBUN.length()>0?" ":"";
			Bean.setADDR2(JIBUN+rs.getString("TOADDR2"));							//�����ڻ��ּ�
			
			//********** BEGIN_����_20120326
			Bean.setSI(rs.getString("TOSI"));
			Bean.setGUN(rs.getString("TOGUN"));
			Bean.setDORO_NM(rs.getString("TO_DORO_NM"));
			Bean.setABD_NM(rs.getString("TO_BD_NM"));
			Bean.setBD_DET_NM(rs.getString("TO_BD_DET_NM"));
			Bean.setBD_BON(rs.getString("TO_BD_BON"));
			Bean.setBD_BU(rs.getString("TO_BD_BU"));			
			//********** END_����_20120326
			
			Bean.setROAD_ADD(rs.getString("ROAD_ADDR"));					//�����ڵ��θ��ּ�
			Bean.setLIVE(rs.getString("LIVE"));								//���ֻ���
			Bean.setOBJ_SET(rs.getString("OBJ_SET"));						//���Ǳ���
			Bean.setBD_NM(rs.getString("BD_NM"));							//���Ǹ�
			
			Bean.setSIGUNGU(rs.getString("SIGUNGU"));						//����OCR�ñ��ڵ�
			Bean.setBJ_CD(rs.getString("BJ_CD"));							//���ǹ��������ڵ�
			Bean.setSPC_CD(rs.getString("SPC_CD"));							//����Ư�����ڵ�
			Bean.setBONBUN(rs.getString("BONBUN"));							//���Ǻ���
			Bean.setBUBUN(rs.getString("BUBUN"));							//���Ǻι�
			
			Bean.setTONG(rs.getString("TONG"));								//������
			Bean.setBAN(rs.getString("BAN"));								//���ǹ�
//			Bean.setMUL_APT_NM(rs.getString("BD_NM"));						//���Ǿ���Ʈ��
			Bean.setBD_DONG(rs.getString("BD_DONG"));						//���ǵ�
			Bean.setBD_HO(rs.getString("BD_HO"));							//����ȣ
			Bean.setMUL_POST(rs.getString("MUL_POST"));						//���ǿ����ȣ
			
			Bean.setNEAR_ADDR1(rs.getString("WITH_ADDR1"));					//���ǿ����ȣ�ּ�
			Bean.setNEAR_ADDR2(rs.getString("WITH_ADDR2"));					//���ǻ��ּ�
			Bean.setHJ_CD(rs.getString("HJ_CD"));							//�������ڵ�
			Bean.setFORM_ADJUST(rs.getString("FORM_ADJUST"));				//�׸�1(���������)
			Bean.setPURPOSE_NM(rs.getString("PURPOSE_NM"));					//�׸�2(�������)
			
			Bean.setTYPE_NM(rs.getString("TYPE_NM"));						//�׸�3(����)
			Bean.setAREA(rs.getString("AREA"));							    //�׸�5(�������)
			Bean.setADMIN_NO(rs.getString("ADMIN_NO"));						//�׸�6(������ȣ)
			Bean.setADD_SET(rs.getString("ADD_SET"));                       //����������
			Bean.setRATE(Integer.toString(rs.getInt("RATE")));			    //Ư������ 		
			
			Bean.setRATE_CAUSE(rs.getString("RATE_CAUSE"));					//Ư�������������
			Bean.setNOTES(rs.getString("NOTES"));						    //���
			Bean.setOCR_SIGU_CD(rs.getString("OCR_SIGU_CD"));				//OCR�ñ��ڵ�
			Bean.setOCR_BUSEO_CD(rs.getString("OCR_BUSEO_CD"));				//OCR�μ��ڵ�
			Bean.setVAT(Integer.toString(rs.getInt("VAT")));				//�ΰ�����ü�ݾ�
			
			Bean.setADD_YN(rs.getString("ADD_YN"));							//����ݸ�������	
			Bean.setLIMIT_SUM(Integer.toString(rs.getInt("LIMIT_SUM")));
			Bean.setLIMIT_CNT(Integer.toString(rs.getInt("LIMIT_CNT")));
			Bean.setINTAX(Integer.toString(rs.getInt("INTAX")));
			Bean.setOVERTAX(Integer.toString(rs.getInt("OVERTAX")));
			
			Bean.setFORM1(rs.getString("FORM1"));
			Bean.setFORM2(rs.getString("FORM2"));
			Bean.setGU_CODE(rs.getString("SIGUNGU"));
//			Bean.setBUNNAP_NO(rs.getString("BUNNAP_NO"));
			Bean.setYEAR(rs.getString("YEAR"));
//			Bean.setSUSI_NO(rs.getString("SUSI_NO"));
			Bean.setTAX_YN(rs.getString("TAX_YN"));
//			
			Bean.setGU_NM(rs.getString("GU_NM"));
//			Bean.setDEPT_NM(rs.getString("DEPT_NM"));
			Bean.setSECTION(rs.getString("SECTION"));
//			Bean.setUSE_DATE(util.Date_Paste(rs.getString("MUL_FROMDATE"))+"~"+util.Date_Paste(rs.getString("MUL_TODATE")));//�׸�4(���Ⱓ)
			Bean.setMUL_FROMDATE(util.Date_Paste(rs.getString("MUL_FROMDATE")));	//�׸�4(���,���� �ϰ��   �����۱Ⱓ)
			Bean.setMUL_TODATE(util.Date_Paste(rs.getString("MUL_TODATE")));		//�׸�4(���,���� �ϰ��   �������Ⱓ)
			Bean.setTOTAL_PERIOD(rs.getString("TOTAL_PERIOD"));						//�׸�4(�Ͻ� �ϰ��   �����۱Ⱓ)
			
			Bean.setPARTLY_PERIOD(rs.getString("PARTLY_PERIOD"));					//�׸�4(�Ͻ� �ϰ��   �������Ⱓ)
			Bean.setFROMDATE(util.Date_Paste(rs.getString("FROMDATE")));	//�׸�4-����Ⱓ���� ����
			Bean.setTODATE(util.Date_Paste(rs.getString("TODATE")));		//�׸�4-����Ⱓ���� ����
        	
			Bean.setSEQ(rs.getString("CSEQ"));
			Bean.setROAD_BON(rs.getString("ROAD_BON"));			
			Bean.setROAD_BU(rs.getString("ROAD_BU"));
			
			Bean.setSUM_ADJUST(rs.getString("SUM_ADJUST"));
			Bean.setVAT(rs.getString("VAT"));
			
			Bean.setSSN(rs.getString("SSN"));
			
        	return	Bean;
        }
        

        
    }
	
    // �߰� ���ܼ���
	protected	class	execute_Get_AddInfo	extends	MappingSqlQuery
    {
        protected 	execute_Get_AddInfo(DataSource ds, MessageSourceAccessor msa)
        {
          	super(ds, msa.getMessage("Querys.jumyong.saewe.Get_AddInfo"));
          	
          	declareParameter(new SqlParameter(Types.VARCHAR));
	     }
        
        protected	Object mapRow(ResultSet rs, int rownum)	throws	SQLException
        {	
        	TaxationBean	Bean	= new TaxationBean();
        	Bean.setTAXPAYER_ID(rs.getString("TAXPAYER_ID"));
			Bean.setFORM1(rs.getString("FORM1"));
			Bean.setFORM2(rs.getString("FORM2"));
			
        	return	Bean;
        }
    }
	
	
    //	�������� �������� ��ȸ
    protected	class	SelectPlaceWithAddr	extends	MappingSqlQuery
    {
        protected 	SelectPlaceWithAddr(DataSource ds, MessageSourceAccessor msa)
        {
          	super(ds, msa.getMessage("Querys.jumyong.saewe.SelectPlaceWithAddr"));
          	
	        declareParameter(new SqlParameter(Types.VARCHAR));
        }
        
        protected	Object mapRow(ResultSet rs, int rownum)	throws	SQLException
        {
        	PlaceWithAddrBean Bean = new PlaceWithAddrBean();
        	
        	Bean.setSEQ(rs.getString("SEQ"));
        	Bean.setADMIN_NO(rs.getString("ADMIN_NO"));
        	Bean.setPNU(rs.getString("PNU"));
        	Bean.setADDR(rs.getString("ADDR"));
			
        	return	Bean;
        }
    }

}
