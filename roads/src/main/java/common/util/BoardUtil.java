
package main.java.common.util;

public class BoardUtil{
	
	private static final String BEGIN_IMG_TAG		=	"<img src='/img/prev_icon2.gif' width='13' height='11' border='0' alt='처음'>";
	private static final String END_IMG_TAG			=	"<img src='/img/next_icon2.gif' width='13' height='11' border='0' alt='끝'>";	
	private static final String PREV_IMG_TAG		=	"<img src='/img/prev_icon.gif' width='12' height='11' border='0' alt='이전'>";
	
	
	private static final String NEXT_IMG_TAG		=	"<img src='/img/next_icon.gif' width='12' height='11' border='0' alt=다음>";
	
	private static final String SMALL_BEGIN_IMG_TAG	=	"<img src=/images/gismap/button/btn_s_first.gif border=0 alt=처음>";
	private static final String SMALL_END_IMG_TAG	=	"<img src=/images/gismap/button/btn_s_end.gif border=0 alt=끝>";
	private static final String SMALL_PREV_IMG_TAG	=	"<img src=/images/gismap/button/btn_s_prev.gif border=0 alt=이전>";
	private static final String SMALL_NEXT_IMG_TAG	=	"<img src=/images/gismap/button/btn_s_next.gif border=0 alt=다음>";
	private static String 	ActionUrl	=	"";
	private static int 		CountPerPage	=	0;
	private static final int intPageGroupSize = 10;	// 페이지 리스트 사이즈

	
	/**
	 * 페이지수를 계산해 리턴
	 * @param	int	intCurrentPage	현재보여줄 페이지번호
	 * @param	int	intCountPerPage	페이지당 보여줄 게시물 수
	 * @param	int intTotalNo	전체게시물수
	 * @return	int	페이지수 
	 */
    public static int endPage(int intCurrentPage, int intCountPerPage, int intTotalNo) {
        int intExtra = intTotalNo % intCountPerPage;
        
        if ( intExtra > 0 ){           
            return (intTotalNo - intExtra )/intCountPerPage + 1;
        } else {
            return intTotalNo/intCountPerPage;
        }
    }
    
	/**
	 * 페이징 표시 문자열을 생성해 리턴 
 	 * @param int intCurrentPage 현재페이지번호, 
 	 * @param int intCountPerPage 한페이지당 출력할 게시물 수
 	 * @param String strActionUrl 리스트를 보여줄 요청 이름
 	 * @param int intTotalCount 게시판 전체 게시물 수
	 * @return String 페이징 표시 문자열
	 */
 	public static String getDividePageForm(int intCurrentPage, int intCountPerPage,  String strSearchType, String strKeyword, String strActionUrl, int intTotCount) {

 		StringBuffer strPagingBuf 	= new StringBuffer();
 		int intPageTotal			=	0;
 		int intPageGroupStart		=	0;	// 페이지 리스트 그룹시작번
 		int intPageGroupEnd			=	0;	// 페이지 리스트 그룹 끝번 		
 		CountPerPage				= intCountPerPage;
 		ActionUrl					= strActionUrl;

		intPageTotal				= (intTotCount-1)/CountPerPage;	//11
        intPageGroupStart			= (int)((intCurrentPage-1)/intPageGroupSize) * intPageGroupSize;	//
        if(intPageGroupStart<0)
        	intPageGroupStart=0;

        intPageGroupEnd   	= intPageGroupStart + intPageGroupSize;

        if (intPageGroupEnd>intPageTotal)
        	intPageGroupEnd = intPageTotal + 1;

        boolean hasPreviousPage = intCurrentPage-intPageGroupSize>=0;
        boolean hasNextPage     = intPageGroupStart+intPageGroupSize < intPageTotal+1;

        strPagingBuf.append(makeButtonLink(1, BEGIN_IMG_TAG, strSearchType, strKeyword));

        if (hasPreviousPage) {
        	if(intPageGroupStart ==0)
        		strPagingBuf.append(makeButtonLink(1, PREV_IMG_TAG, strSearchType, strKeyword));
        	else
        		strPagingBuf.append(makeButtonLink(intPageGroupStart, PREV_IMG_TAG, strSearchType, strKeyword));
        } // end if

        strPagingBuf.append("<td width='15'></td><td style=\"");
        strPagingBuf.append("padding:0 8 0 8\""); 
        strPagingBuf.append(">");
        
        for(int i=intPageGroupStart; i<intPageGroupEnd ;i++){
        	if (i+1==intCurrentPage) {
        		strPagingBuf.append("<a href='javascript:;' class=list>") 
        		.append(i+1)
        		.append("</a>");
        	} else {
        		strPagingBuf.append(makeLink(i+1, ""+(i+1)+"", strSearchType, strKeyword));
        	} // end if
 			if( i < (intPageGroupEnd-1) ){
 				strPagingBuf.append(" ");
 			}        	
        } // end for
        strPagingBuf.append("</td><td width='15'></td>");    
        
        if (hasNextPage) {
        	strPagingBuf.append(makeButtonLink(intPageGroupEnd+1, NEXT_IMG_TAG, strSearchType, strKeyword));
        } // end if

        strPagingBuf.append(makeButtonLink(intPageTotal+1, END_IMG_TAG, strSearchType, strKeyword));
        
        return strPagingBuf.toString();
 	}
 	

 	/**
 	 * 이미지파일에 대한 링크태그를 구성한다. (first.gif, prev.gif, next.gif, end.gif에 대한 이미지)
 	 * **/
    private static	String makeButtonLink(int intPageNum, String strLinkImg, String strSearchType, String strKeyword) {
        StringBuffer strLinkBuf = new StringBuffer();
        strLinkBuf.append("<td align='center'><a href=\"")
 		.append(ActionUrl)
 		.append("?currentPage=")
 		.append(intPageNum)
 		.append("&countPerPage=")
 		.append(CountPerPage)
 		.append("&searchType=")
 		.append(strSearchType)
 		//.append("&keyword=")
 		.append("&")
 		.append(strKeyword)
 		.append("\">")			
 		.append("<font color='#0000FF'>")
 		.append(strLinkImg)
        .append("</a></td>");
        return strLinkBuf.toString();
    }	 	

 	/**
 	 * 페이지번호에 대한 링크태그를 구성한다.
 	 * **/
    
    private static	String makeLink(int intPage, String strLinkNum, String strSearchType, String strKeyword) {
        StringBuffer strLinkBuf = new StringBuffer();
        strLinkBuf.append("<a class='list' href=\"")
 		.append(ActionUrl)
 		.append("?currentPage=")
 		.append(intPage)
 		.append("&countPerPage=")
 		.append(CountPerPage)
 		.append("&searchType=")
 		.append(strSearchType)
 		//.append("&keyword=")
 		.append("&")
 		.append(strKeyword)
 		.append("\">")
 		.append("<font color='#0000FF'>")
 		.append(strLinkNum)
        .append("</a>");
        return strLinkBuf.toString();
    }	
 	
	/**
  	 * 답변글인 경우, 게시물 제목에 붙일 indent를 리턴
	 * @param	String strTitle	indent를 붙일 문자열
	 * @param	String strStep	indent depth
	 * @return	String	indent가 추가된 문자열 
	*/
	public	static String addIndentMark(String strStep){
		
		if(strStep.equals("0"))
			return "";
		
		String strIndent = "&nbsp;";
		StringBuffer strBuf = new StringBuffer();
		for(int i=0; i <strStep.length() ; i++){
			strBuf.append(strIndent);			
		}
		strBuf.append("<img src=/images/button/re.gif border=0> ");
		return strBuf.toString();
	}	
	
	/**
	 * 페이징 표시 문자열을 생성해 리턴 - 파라메터를 동적으로 붙일수 있음
 	 * @param int intCurrentPage 현재페이지번호, 
 	 * @param int intCountPerPage 한페이지당 출력할 게시물 수
 	 * @param String strActionUrl 리스트를 보여줄 요청 이름
 	 * @param int intTotalCount 게시판 전체 게시물 수
	 * @return String 페이징 표시 문자열
	 */
	public static String getDividePageFormByParams(int intCurrentPage, int intCountPerPage,  String strParams, String strActionUrl, int intTotCount) {

		StringBuffer strPagingBuf = new StringBuffer();
		int intPageTotal	=	0;
		int intPageGroupStart	=	0;	// 페이지 리스트 그룹시작번
		int intPageGroupEnd	=	0;	// 페이지 리스트 그룹 끝번 		
		CountPerPage	=	intCountPerPage;
		ActionUrl		=	strActionUrl;
		intPageTotal	=	(intTotCount-1)/CountPerPage;
	    intPageGroupStart	= (int)((intCurrentPage-1)/intPageGroupSize) * intPageGroupSize;	//
        if(intPageGroupStart<0)
        	intPageGroupStart=0;
        	
	    intPageGroupEnd   = intPageGroupStart + intPageGroupSize;

    if (intPageGroupEnd>intPageTotal)
    	intPageGroupEnd = intPageTotal + 1;

    boolean hasPreviousPage = intCurrentPage-intPageGroupSize>=0;
    boolean hasNextPage     = intPageGroupStart+intPageGroupSize < intPageTotal+1;

    strPagingBuf.append(makeButtonLinkByParams(1, BEGIN_IMG_TAG, strParams));

    if (hasPreviousPage) {
    	if(intPageGroupStart ==0)
        		strPagingBuf.append(makeButtonLinkByParams(1, PREV_IMG_TAG, strParams));
        else
	    	strPagingBuf.append(makeButtonLinkByParams(intPageGroupStart, PREV_IMG_TAG, strParams));
    } // end if

    strPagingBuf.append("<td style=\"");
    strPagingBuf.append("padding:0 8 0 8\""); 
    strPagingBuf.append("class='list'>");
    strPagingBuf.append("page\">");        
    
    for(int i=intPageGroupStart; i<intPageGroupEnd ;i++){
    	if (i+1==intCurrentPage) {
    		strPagingBuf.append(i+1);
    	} else {
    		strPagingBuf.append("<font color='#0000FF'>")
    		.append(makeLinkByParams(i+1, ""+(i+1)+"", strParams));
    	} // end if
			if( i < (intPageGroupEnd-1) ){
				strPagingBuf.append(" | ");
			}        	
    } // end for
    strPagingBuf.append("</td>");    
    
    if (hasNextPage) {
    	strPagingBuf.append(makeButtonLinkByParams(intPageGroupEnd+1, NEXT_IMG_TAG, strParams));
    } // end if

    strPagingBuf.append(makeButtonLinkByParams(intPageTotal+1, END_IMG_TAG, strParams));
    return strPagingBuf.toString();

	}
	

	/**
	 * 이미지파일에 대한 링크태그를 구성한다. (first.gif, prev.gif, next.gif, end.gif에 대한 이미지)
	 * **/
private static	String makeButtonLinkByParams(int intPageNum, String strLinkImg, String strParams) {
    StringBuffer strLinkBuf = new StringBuffer();
    strLinkBuf.append("<td align=center'><a href=\"")
		.append(ActionUrl)
		.append("?currentPage=")
		.append(intPageNum)
		.append("&countPerPage=")
		.append(CountPerPage)
		.append("&")
		.append(strParams)
		.append("\">")			
		.append(strLinkImg)
    .append("</a></td>");
    return strLinkBuf.toString();
}	 	

	/**
	 * 페이지번호에 대한 링크태그를 구성한다.
	 * **/

private static	String makeLinkByParams(int intPage, String strLinkNum, String strParams) {
    StringBuffer strLinkBuf = new StringBuffer();
    strLinkBuf.append("<a class='list' href=\"")
		.append(ActionUrl)
		.append("?currentPage=")
		.append(intPage)
		.append("&countPerPage=")
		.append(CountPerPage)
		.append("&")
		.append(strParams)
		.append("\">")			
		.append("<font color='#0000FF'>")
		.append(strLinkNum)
    .append("</a>");
    return strLinkBuf.toString();
}	

/**
	 * 페이징 표시 문자열을 생성해 리턴 - 파라메터를 동적으로 붙일수 있음 - prev,next버튼을 맵 브라우저용 작은이미지로 사용
 	 * @param int intCurrentPage 현재페이지번호, 
 	 * @param int intCountPerPage 한페이지당 출력할 게시물 수
 	 * @param String strActionUrl 리스트를 보여줄 요청 이름
 	 * @param int intTotalCount 게시판 전체 게시물 수
	 * @return String 페이징 표시 문자열
	 */
	public static String getDividePageFormByParamsInMap(int intCurrentPage, int intCountPerPage,  String strParams, String strActionUrl, int intTotCount, int intPageGroupCnt) {

		StringBuffer strPagingBuf = new StringBuffer();
		int intPageTotal	=	0;
		int intPageGroupStart	=	0;	// 페이지 리스트 그룹시작번
		int intPageGroupEnd	=	0;	// 페이지 리스트 그룹 끝번 	
		CountPerPage	=	intCountPerPage;
		ActionUrl	=	strActionUrl;
		intPageTotal	=	(intTotCount-1)/CountPerPage;
	    intPageGroupStart	= (int)((intCurrentPage-1)/intPageGroupCnt) * intPageGroupCnt;	//

        if(intPageGroupStart<0)
        	intPageGroupStart=0;

	    intPageGroupEnd   = intPageGroupStart + intPageGroupCnt;

	    if (intPageGroupEnd>intPageTotal)
	    	intPageGroupEnd = intPageTotal + 1;

	    boolean hasPreviousPage = intCurrentPage-intPageGroupCnt>=0;
	    boolean hasNextPage     = intPageGroupStart+intPageGroupCnt < intPageTotal+1;

    strPagingBuf.append(makeButtonLinkByParams(1, SMALL_BEGIN_IMG_TAG, strParams));

    if (hasPreviousPage) {
    	if(intPageGroupStart ==0)
        		strPagingBuf.append(makeButtonLinkByParams(1, SMALL_PREV_IMG_TAG, strParams));
        else
    		strPagingBuf.append(makeButtonLinkByParams(intPageGroupStart, SMALL_PREV_IMG_TAG, strParams));
    } // end if

    strPagingBuf.append("<td style=\"");
    strPagingBuf.append("padding:0 8 0 8\""); 
    strPagingBuf.append("class='list'>");
    strPagingBuf.append("page\">");        
    
    for(int i=intPageGroupStart; i<intPageGroupEnd ;i++){
    	if (i+1==intCurrentPage) {
    		strPagingBuf.append(i+1);
    	} else {
    		strPagingBuf.append("<font color='#0000FF'>")
    		.append(makeLinkByParams(i+1, ""+(i+1)+"", strParams));
    	} // end if
			if( i < (intPageGroupEnd-1) ){
				strPagingBuf.append(" | ");
			}        	
    } // end for
    strPagingBuf.append("</td>");    
    
    if (hasNextPage) {
    	strPagingBuf.append(makeButtonLinkByParams(intPageGroupEnd+1, SMALL_NEXT_IMG_TAG, strParams));
    } // end if

    strPagingBuf.append(makeButtonLinkByParams(intPageTotal+1, SMALL_END_IMG_TAG, strParams));
    return strPagingBuf.toString();

	}
}