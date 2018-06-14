package com.file;

import org.springframework.web.multipart.MultipartFile;

public class FileCommand {

	private String mode;
    
	//게시판에 추가
	private String name, notice, title, content, ip, created, hitcount, organ, department, phone, email;
	private int sid, div, div_sid;
	//연락처에 추가
	private String user_id, org_cd, gu_nm, or_nm, t_nm, dam_nm, dam_ph, dam_em, teem_nm, teem_ph, goa_nm, goa_ph, fax, memo;
	//요건 파일
	private String saveFileName, originalFileName;
	
	/* 201409 kny inquiry */
	private String term, reception, docnum;
	
	public String getTerm() {
		return term;
	}
	public void setTerm(String term) {
		this.term = term;
	}
	public String getReception() {
		return reception;
	}
	public void setReception(String reception) {
		this.reception = reception;
	}
	public String getDocnum() {
		return docnum;
	}
	public void setDocnum(String docnum) {
		this.docnum = docnum;
	}
	public int getDiv_sid(){
		return div_sid;
	}
	public void setDiv_sid(int div_sid){
		this.div_sid = div_sid;
	}
	public int getDiv(){
		return div;
	}
	public void setDiv(int div){
		this.div = div;
	}
	public String getUser_id(){
		return user_id;
	}
	public void setUser_id(String user_id){
		this.user_id = user_id;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getNotice() {
		return notice;
	}

	public void setNotice(String notice) {
		this.notice = notice;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getCreated() {
		return created;
	}

	public void setCreated(String created) {
		this.created = created;
	}

	public String getHitcount() {
		return hitcount;
	}

	public void setHitcount(String hitcount) {
		this.hitcount = hitcount;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	private long fileSize;
	private long fileSize1;
	private long fileSize2;
	private long fileSize3;
	
	private MultipartFile upload; // 업로드된 파일 저장용 변수
	private MultipartFile upload1;
	private MultipartFile upload2;
	private MultipartFile upload3;
	
	private String originalFileName1;
	private String originalFileName2;
	private String originalFileName3;
	
	private String SaveFileName1;
	private String SaveFileName2;
	private String SaveFileName3;
	
	public String getOriginalFileName3() {
		return originalFileName3;
	}
	public void setOriginalFileName3(String originalFileName3) {
		this.originalFileName3 = originalFileName3;
	}
	public String getOriginalFileName1() {
		return originalFileName1;
	}
	public void setOriginalFileName1(String originalFileName1) {
		this.originalFileName1 = originalFileName1;
	}
	public String getOriginalFileName2() {
		return originalFileName2;
	}
	public void setOriginalFileName2(String originalFileName2) {
		this.originalFileName2 = originalFileName2;
	}
	public long getFileSize1() {
		return fileSize1;
	}
	public void setFileSize1(long fileSize1) {
		this.fileSize1 = fileSize1;
	}
	public long getFileSize2() {
		return fileSize2;
	}
	public void setFileSize2(long fileSize2) {
		this.fileSize2 = fileSize2;
	}
	public long getFileSize3() {
		return fileSize3;
	}
	public void setFileSize3(long fileSize3) {
		this.fileSize3 = fileSize3;
	}
	public MultipartFile getUpload1() {
		return upload1;
	}
	public void setUpload1(MultipartFile upload1) {
		this.upload1 = upload1;
	}
	public MultipartFile getUpload2() {
		return upload2;
	}
	public void setUpload2(MultipartFile upload2) {
		this.upload2 = upload2;
	}
	public MultipartFile getUpload3() {
		return upload3;
	}
	public void setUpload3(MultipartFile upload3) {
		this.upload3 = upload3;
	}
	public String getSaveFileName1() {
		return SaveFileName1;
	}
	public void setSaveFileName1(String saveFileName1) {
		SaveFileName1 = saveFileName1;
	}
	public String getSaveFileName2() {
		return SaveFileName2;
	}
	public void setSaveFileName2(String saveFileName2) {
		SaveFileName2 = saveFileName2;
	}
	public String getSaveFileName3() {
		return SaveFileName3;
	}
	public void setSaveFileName3(String saveFileName3) {
		SaveFileName3 = saveFileName3;
	}
	public String getSaveFileName() {
		return saveFileName;
	}

	public void setSaveFileName(String saveFileName) {
		this.saveFileName = saveFileName;
	}

	public String getOriginalFileName() {
		return originalFileName;
	}

	public void setOriginalFileName(String originalFileName) {
		this.originalFileName = originalFileName;
	}

	public long getFileSize() {
		return fileSize;
	}

	public void setFileSize(long fileSize) {
		this.fileSize = fileSize;
	}

	public String getMode() {
		return mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public MultipartFile getUpload() {
		return upload;
	}

	public void setUpload(MultipartFile upload) {
		this.upload = upload;
	}
	public String getOrgan(){
		return organ;
	}
	public String getDepartment(){
		return department;
	}
	public String getphone(){
		return phone;
	}
	public String getEmail(){
		return email;
	}
	public void setOrgan(String organ) {
		this.organ = organ;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	//검색 함수
	public String getTitleSearch() {
		return title;
	}
	public String getNameSearch() {
		return name;
	}
	//연락처 get&set
	public String getOrg_cd(){
		return org_cd;
	}
	public void setOrg_cd(String org_cd){
		this.org_cd = org_cd;
	}
	public String getGu_nm(){
		return gu_nm;
	}
	public void setGu_nm(String gu_nm){
		this.gu_nm = gu_nm;
	}
	public String getOr_nm(){
		return or_nm;
	}
	public void setOr_nm(String or_nm){
		this.or_nm = or_nm;
	}
	public String getT_nm(){
		return t_nm;
	}
	public void setT_nm(String t_nm){
		this.t_nm = t_nm;
	}
	public String getDam_nm(){
		return dam_nm;
	}
	public void setDam_nm(String dam_nm){
		this.dam_nm = dam_nm;
	}
	public String getDam_ph(){
		return dam_ph;
	}
	public void setDam_ph(String dam_ph){
		this.dam_ph = dam_ph;
	}
	public String getDam_em(){
		return dam_em;
	}
	public void setDam_em(String dam_em){
		this.dam_em = dam_em;
	}
	public String getTeem_nm(){
		return teem_nm;
	}
	public void setTeem_nm(String teem_nm){
		this.teem_nm = teem_nm;
	}
	public String getTeem_ph(){
		return teem_ph;
	}
	public void setTeem_ph(String teem_ph){
		this.teem_ph = teem_ph;
	}
	public String getGoa_nm(){
		return goa_nm;
	}
	public void setGoa_nm(String goa_nm){
		this.goa_nm = goa_nm;
	}
	public String getGoa_ph(){
		return goa_ph;
	}
	public void setGoa_ph(String goa_ph){
		this.goa_ph = goa_ph;
	}
	public String getFax(){
		return fax;
	}
	public void setFax(String fax){
		this.fax = fax;
	}
	public String getMemo(){
		return memo;
	}
	public void setMemo(String memo){
		this.memo = memo;
	}
}
