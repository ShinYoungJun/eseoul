//	2009		Kim Yun Seo
//
//	request	${totalcnt}
//	request	${pageing}
//	request	${currentPage}

package main.java.common.util.catUtil;

import javax.servlet.http.HttpServletRequest;

public class Pageing{

	public	int	execute(HttpServletRequest request, int totalCnt, int currentPage, int listCnt)
	{
		String	sPageing	= "";
		int 	nowPage	 	= 0;							// 현재 페이지 번호
		int		pageCount	= ((totalCnt-1)/listCnt)+1;		// 아랫단 페이징 목록수.
		int		tempPage	= ((pageCount-1)/10);			// 다음 열개 페이지 계산을 위한 임시 페이지 번호
		int 	lastPage	= pageCount%10;					// 10페이지씩 보여지는 숫자의 마지막 페이지 (예 36페이지의 경우 10, 20, 26)
		
//		System.out.println("totalCnt : " + totalCnt);
//		System.out.println("currentPage : " + currentPage);
//		System.out.println("listCnt : " + listCnt);
//		
//		System.out.println("pageCount : " + pageCount);
//		System.out.println("tempPage : " + tempPage);
	
		if(lastPage==0 && pageCount!=0)
			lastPage = 10;
		
		if(tempPage > (int)((currentPage-1)/10))
			lastPage = 10;
		
//		System.out.println("lastPage : " + lastPage);
		
		if(currentPage > 1)
			sPageing += "<td><a href=javascript:Page('1')><img src='../../../img/prev_icon2.gif' width='13' height='11' border='0'></a></td>";
		else
			sPageing += "<td><img src='../../../img/prev_icon2.gif' width='13' height='11' border='0'></td>";

		if(((currentPage - 1)/10)==0)
			sPageing += "<td><img src='../../../img/prev_icon.gif' width='12' height='11' border='0'></td>";
		else
			sPageing += "<td><a href=javascript:Page('" + (((int)((currentPage-1)/10)-1)*10+1) + "')><img src='../../../img/prev_icon.gif' width='12' height='11' border='0'></a></td>";

		sPageing += "<td width='15'></td><td align='center'>";
		
		for(int i = 1	; i <= lastPage	; i++)
		{
			nowPage = (int)((currentPage-1)/10)*10 + i;
			
			if(currentPage==nowPage)
				sPageing += "<a href=javascript:Page('') class='list'>" + nowPage + "</a> ";
			else
				sPageing += "<a href=javascript:Page('" + nowPage + "') class='list'><font color=\'#0000FF\'>" + nowPage + "</a> ";
		}
		
		sPageing += "</td><td width='15'>&nbsp;</td>";
		
		if(((currentPage - 1)/10)>=tempPage)
			sPageing += "<td><img src='../../../img/next_icon.gif' width='12' height='11' border='0'></td>";
		else
			sPageing += "<td><a href=javascript:Page('" + (((int)((currentPage-1)/10)+1)*10+1) + "')><img src='../../../img/next_icon.gif' width='12' height='11' border='0'></a></td>";

		if(pageCount == currentPage)
			sPageing += "<td><img src='../../../img/next_icon2.gif' width='13' height='11' border='0'></td>";
		else
			sPageing += "<td><a href=javascript:Page('" + pageCount + "')><img src='../../../img/next_icon2.gif' width='13' height='11' border='0'></a></td>";

		request.setAttribute("totalcnt", Integer.toString(totalCnt));
		request.setAttribute("pageing", sPageing);
		request.setAttribute("currentPage", Integer.toString(currentPage));
		
	//	System.out.println((currentPage/10));
		
		int	rowCol	= ((currentPage * listCnt) - listCnt) + 1;
		
		return	rowCol;
	}
}
