package main.java.rojum.owner.model;

import main.java.common.model.RoadsBaseBean;

public class SearchBean extends RoadsBaseBean {

		private String OWNER_NAME = "";
		private String FROMDATE = "";
		private String TODATE = "";
		private String GU_CD = "";
		private String CURRENT_PAGE = "";
		private String COUNTER_PER_PAGE = "";
		
		
		public String getGU_CD() {
			return GU_CD;
		}
		public void setGU_CD(String gU_CD) {
			GU_CD = gU_CD;
		}
		public String getOWNER_NAME() {
			return OWNER_NAME;
		}
		public void setOWNER_NAME(String oWNER_NAME) {
			OWNER_NAME = oWNER_NAME;
		}
		public String getFROMDATE() {
			return FROMDATE;
		}
		public void setFROMDATE(String fROMDATE) {
			FROMDATE = fROMDATE;
		}
		public String getTODATE() {
			return TODATE;
		}
		public void setTODATE(String tODATE) {
			TODATE = tODATE;
		}
		public String getCURRENT_PAGE() {
			return CURRENT_PAGE;
		}
		public void setCURRENT_PAGE(String cURRENT_PAGE) {
			CURRENT_PAGE = cURRENT_PAGE;
		}
		public String getCOUNTER_PER_PAGE() {
			return COUNTER_PER_PAGE;
		}
		public void setCOUNTER_PER_PAGE(String cOUNTER_PER_PAGE) {
			COUNTER_PER_PAGE = cOUNTER_PER_PAGE;
		}
		
	}
