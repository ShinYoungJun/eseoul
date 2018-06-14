package main.java.common.model;

import java.util.ArrayList;
import java.util.List;
import main.java.common.model.RoadsBaseBean;

public class RoadsFileBean extends RoadsBaseBean {
	   
		private List listFiles 			= null;
		private BoardFileBean objFile	= null;
	   
		public RoadsFileBean() {
			listFiles = new ArrayList();
		}

		public BoardFileBean getFileBean() {
			return objFile;
		}

		public void setFileBean(BoardFileBean objFile) {
			this.objFile = objFile;
		}

		public void addFileBean(BoardFileBean objFile) {
			if (objFile != null) {
				listFiles.add(objFile);
			}
		}

		public void setFileBeans(List listFiles) {
			this.listFiles = listFiles;
		}

		public List getFileBeans() {
			return listFiles;
		}
}