package com.spring.common;

public class MyUtil {
	/*
	 * ��ü ������ �� ���ϱ�
	 * numPerPage : �� ȭ�鿡 ǥ���� ������ ��
	 * dataCount : ��ü ������ ��
	 */

	public int getPageCount(int numPerPage, int dataCount){
		int pageCount = 0;
		
		pageCount = dataCount/numPerPage;
		if(dataCount%numPerPage != 0)
			pageCount++;	//������ �� ����
		
		return pageCount;
	}
	
	/*
	 * ����¡ ó�� �޼ҵ� get���
	 * current_page : ���� ǥ���� ������
	 * total_page : ��ü ������ ��
	 * list_url : ��ũ ������ url
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
		
	//currentPageSetup : ǥ���� ù ������ -1�� ��
		currentPageSetup = (current_page/numPerBlock)*numPerBlock;
		if(current_page%numPerBlock==0)
			currentPageSetup = currentPageSetup-numPerBlock;
		
	//1,[perv]
		n = current_page-numPerBlock;
		if(total_page>numPerBlock&&currentPageSetup>0){
			sb.append("<a href=\""+list_url+"pageNum=1\">1</a>&nbsp;");
			sb.append("<a href=\""+list_url+"pageNum="+n+"\">prev</a>]&nbsp;");
		}
		
	//�ٷΰ��� ������
		page = currentPageSetup + 1;
		while(page <=total_page&&page<=(currentPageSetup+numPerBlock)){
			if(page==current_page){
				sb.append("<font color=\"#4376b5\">"+page+"</font>&nbsp;");
			}else{
				sb.append("<a href=\""+list_url+"pageNum="+page+"\">"+page+"</a>&nbsp;");
			}
		page++;
		}
		
		//[Next], ������ ������
		n = current_page+numPerBlock;
		if(total_page-currentPageSetup > numPerBlock){
			sb.append("[<a href=\""+list_url+"pagNum="+n+"\">Next</a>]&nbsp;");
			sb.append("<a href=\""+list_url+"pagNum="+total_page+"\">"+total_page+"</a>");
		}
		
		return sb.toString();
	}
}
