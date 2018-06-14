package com.spring.common;

public class MyUtil {
	/*
	 * 전체 페이지 수 구하기
	 * numPerPage : 한 화면에 표시할 데이터 수
	 * dataCount : 전체 데이터 수
	 */

	public int getPageCount(int numPerPage, int dataCount){
		int pageCount = 0;
		
		pageCount = dataCount/numPerPage;
		if(dataCount%numPerPage != 0)
			pageCount++;	//페이지 수 증가
		
		return pageCount;
	}
	
	/*
	 * 페이징 처리 메소드 get방식
	 * current_page : 현재 표시할 페이지
	 * total_page : 전체 페이지 수
	 * list_url : 링크 설정할 url
	 */
	
	public String pageIndexList(int current_page, int total_page, String list_url){
		int numPerBlock = 10;
		int currentPageSetup;
		int n, page;
		StringBuffer sb = new StringBuffer();
		
		if(current_page==0||total_page==0)
			return"";
		
		if(list_url.indexOf("?")!=-1){
			list_url = list_url + "&";
		}else{
			list_url = list_url + "?";
		}
		
	//currentPageSetup : 표시할 첫 페이지 -1의 값
		currentPageSetup = (current_page/numPerBlock)*numPerBlock;
		if(current_page%numPerBlock==0)
			currentPageSetup = currentPageSetup-numPerBlock;
		
	//1,[perv]
		n = current_page-numPerBlock;
		if(total_page>numPerBlock&&currentPageSetup>0){
			sb.append("<a href=\""+list_url+"pageNum=1\">1</a>&nbsp;");
			sb.append("<a href=\""+list_url+"pageNum="+n+"\">prev</a>]&nbsp;");
		}
		
	//바로가기 페이지
		page = currentPageSetup + 1;
		while(page <=total_page&&page<=(currentPageSetup+numPerBlock)){
			if(page==current_page){
				sb.append("<font color=\"#4376b5\">"+page+"</font>&nbsp;");
			}else{
				sb.append("<a href=\""+list_url+"pageNum="+page+"\">"+page+"</a>&nbsp;");
			}
		page++;
		}
		
		//[Next], 마지막 페이지
		n = current_page+numPerBlock;
		if(total_page-currentPageSetup > numPerBlock){
			sb.append("[<a href=\""+list_url+"pagNum="+n+"\">Next</a>]&nbsp;");
			sb.append("<a href=\""+list_url+"pagNum="+total_page+"\">"+total_page+"</a>");
		}
		
		return sb.toString();
	}
}
