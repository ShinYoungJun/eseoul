
package main.java.common.util;

public class BoardUtil{
	
	private static final String BEGIN_IMG_TAG		=	"<img src='/img/prev_icon2.gif' width='13' height='11' border='0' alt='ó��'>";
	private static final String END_IMG_TAG			=	"<img src='/img/next_icon2.gif' width='13' height='11' border='0' alt='��'>";	
	private static final String PREV_IMG_TAG		=	"<img src='/img/prev_icon.gif' width='12' height='11' border='0' alt='����'>";
	
	
	private static final String NEXT_IMG_TAG		=	"<img src='/img/next_icon.gif' width='12' height='11' border='0' alt=����>";
	
	private static final String SMALL_BEGIN_IMG_TAG	=	"<img src=/images/gismap/button/btn_s_first.gif border=0 alt=ó��>";
	private static final String SMALL_END_IMG_TAG	=	"<img src=/images/gismap/button/btn_s_end.gif border=0 alt=��>";
	private static final String SMALL_PREV_IMG_TAG	=	"<img src=/images/gismap/button/btn_s_prev.gif border=0 alt=����>";
	private static final String SMALL_NEXT_IMG_TAG	=	"<img src=/images/gismap/button/btn_s_next.gif border=0 alt=����>";
	private static String 	ActionUrl	=	"";
	private static int 		CountPerPage	=	0;
	private static final int intPageGroupSize = 10;	// ������ ����Ʈ ������

	
	/**
	 * ���������� ����� ����
	 * @param	int	intCurrentPage	���纸���� ��������ȣ
	 * @param	int	intCountPerPage	�������� ������ �Խù� ��
	 * @param	int intTotalNo	��ü�Խù���
	 * @return	int	�������� 
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
	 * ����¡ ǥ�� ���ڿ��� ������ ���� 
 	 * @param int intCurrentPage ������������ȣ, 
 	 * @param int intCountPerPage ���������� ����� �Խù� ��
 	 * @param String strActionUrl ����Ʈ�� ������ ��û �̸�
 	 * @param int intTotalCount �Խ��� ��ü �Խù� ��
	 * @return String ����¡ ǥ�� ���ڿ�
	 */
 	public static String getDividePageForm(int intCurrentPage, int intCountPerPage,  String strSearchType, String strKeyword, String strActionUrl, int intTotCount) {

 		StringBuffer strPagingBuf 	= new StringBuffer();
 		int intPageTotal			=	0;
 		int intPageGroupStart		=	0;	// ������ ����Ʈ �׷���۹�
 		int intPageGroupEnd			=	0;	// ������ ����Ʈ �׷� ���� 		
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
 	 * �̹������Ͽ� ���� ��ũ�±׸� �����Ѵ�. (first.gif, prev.gif, next.gif, end.gif�� ���� �̹���)
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
 	 * ��������ȣ�� ���� ��ũ�±׸� �����Ѵ�.
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
  	 * �亯���� ���, �Խù� ���� ���� indent�� ����
	 * @param	String strTitle	indent�� ���� ���ڿ�
	 * @param	String strStep	indent depth
	 * @return	String	indent�� �߰��� ���ڿ� 
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
	 * ����¡ ǥ�� ���ڿ��� ������ ���� - �Ķ���͸� �������� ���ϼ� ����
 	 * @param int intCurrentPage ������������ȣ, 
 	 * @param int intCountPerPage ���������� ����� �Խù� ��
 	 * @param String strActionUrl ����Ʈ�� ������ ��û �̸�
 	 * @param int intTotalCount �Խ��� ��ü �Խù� ��
	 * @return String ����¡ ǥ�� ���ڿ�
	 */
	public static String getDividePageFormByParams(int intCurrentPage, int intCountPerPage,  String strParams, String strActionUrl, int intTotCount) {

		StringBuffer strPagingBuf = new StringBuffer();
		int intPageTotal	=	0;
		int intPageGroupStart	=	0;	// ������ ����Ʈ �׷���۹�
		int intPageGroupEnd	=	0;	// ������ ����Ʈ �׷� ���� 		
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
	 * �̹������Ͽ� ���� ��ũ�±׸� �����Ѵ�. (first.gif, prev.gif, next.gif, end.gif�� ���� �̹���)
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
	 * ��������ȣ�� ���� ��ũ�±׸� �����Ѵ�.
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
	 * ����¡ ǥ�� ���ڿ��� ������ ���� - �Ķ���͸� �������� ���ϼ� ���� - prev,next��ư�� �� �������� �����̹����� ���
 	 * @param int intCurrentPage ������������ȣ, 
 	 * @param int intCountPerPage ���������� ����� �Խù� ��
 	 * @param String strActionUrl ����Ʈ�� ������ ��û �̸�
 	 * @param int intTotalCount �Խ��� ��ü �Խù� ��
	 * @return String ����¡ ǥ�� ���ڿ�
	 */
	public static String getDividePageFormByParamsInMap(int intCurrentPage, int intCountPerPage,  String strParams, String strActionUrl, int intTotCount, int intPageGroupCnt) {

		StringBuffer strPagingBuf = new StringBuffer();
		int intPageTotal	=	0;
		int intPageGroupStart	=	0;	// ������ ����Ʈ �׷���۹�
		int intPageGroupEnd	=	0;	// ������ ����Ʈ �׷� ���� 	
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