package main.java.admin.model;

import main.java.common.model.RoadsBaseBean;

public class GradeCodeBean extends RoadsBaseBean {

	private String GRADE_CODE = "";

	private String GRADE_NAME = "";

	public String getGRADE_CODE() {
		return GRADE_CODE;
	}

	public void setGRADE_CODE(String grade_code) {
		GRADE_CODE = grade_code;
	}

	public String getGRADE_NAME() {
		return GRADE_NAME;
	}

	public void setGRADE_NAME(String grade_name) {
		GRADE_NAME = grade_name;
	}
}