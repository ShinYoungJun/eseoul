
package main.java.gapan.junggi.web;


import main.java.common.util.BoardUtil;
import main.java.common.util.Globals;
import main.java.common.util.catUtil.Pageing;
import main.java.common.util.catUtil.Util;

import java.text.SimpleDateFormat;
import java.util.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;
import org.springframework.web.bind.ServletRequestUtils;

import main.java.gapan.jumyong.service.IJumyongService;


import main.java.gapan.jumyong.model.ProductBean;

import main.java.gapan.junggi.service.*;

public class JunggiBoardFormControl extends SimpleFormController {	
	
  	/**
  	 * CALCULATION ����Ʈ ��ȸ
	 * @param HttpServletRequest request
	 * @param HttpServletResponce responce
	 * @return ModelAndView
	 */
	
	private IJunggiService objJunggiService = null;
	private IJumyongService objJumyongService = null;
	private	Pageing	pageing	= new Pageing();
	private	Util util = new Util();
	
	public void setGapan_junggiService (JunggiService newObjJunggiService)
	{
		this.objJunggiService = newObjJunggiService;
	}
	
	public void setGapan_jumyongService(IJumyongService newObjJumyongService) {
		this.objJumyongService = newObjJumyongService;
	}
	
	public JunggiBoardFormControl() {
		setBindOnNewForm(true);
	}
	
	protected Object formBackingObject(HttpServletRequest request)
	throws ServletException {
		
		try
		{	
			// ���⵵ ���
			Calendar cal = Calendar.getInstance();
			SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd");			  
			String thisDate = formatter.format(cal.getTime());			
			String thisYear = thisDate.substring(0,4);
			
			String mode = ServletRequestUtils.getStringParameter(request,"mode");
			String gapan_no = ServletRequestUtils.getStringParameter(request,"gapan_no");
			String cal_sum_seq = ServletRequestUtils.getStringParameter(request,"cal_sum_seq","");
			String seq = ServletRequestUtils.getStringParameter(request,"seq","");			
			String strCurrentPage = ServletRequestUtils.getStringParameter(request, "currentPage", Globals.DEFAULT_CURRENT_PAGE);
			String strCountPerPage = ServletRequestUtils.getStringParameter(request, "countPerPage", "4");
			String year = ServletRequestUtils.getStringParameter(request,"year",thisYear);
			
			int countPerPage = Integer.parseInt(strCountPerPage);
			
			request.setAttribute("gapan_no", gapan_no);
			request.setAttribute("currentPage", strCurrentPage);
			request.setAttribute("mode", mode);
			
//			System.out.println("gapan_no== " + gapan_no);
//			System.out.println("mode=== " + mode);
			
			//////////////�հ踮��Ʈ
			// �հ踮��Ʈ ���� �� ����¡
			int listCount = objJunggiService.getcal_sum_infoListCount(gapan_no, year);
			
			int	rowCol = pageing.execute(request, listCount, Integer.parseInt(strCurrentPage), 10);
			
			List cal_sum_infoList = objJunggiService.cal_sum_infoList(gapan_no, year, rowCol, rowCol+3);
			request.setAttribute("cal_sum_infoList", cal_sum_infoList);
			//System.out.println("cal_sum_infoList.size() == " + cal_sum_infoList.size());
						
		
			////////////�⵵�� ����Ʈ
			if(cal_sum_seq == null || cal_sum_seq.equals("")||cal_sum_seq.equals("null"))  
			{					
				cal_sum_seq = ((ProductBean)cal_sum_infoList.get(0)).getSEQ();
			}
			//System.out.println("cal_sum_seq== " + cal_sum_seq);
			request.setAttribute("cal_sum_seq", cal_sum_seq);			
			
			List ImpositionInfoByCalSumList = objJunggiService.ImpositionInfoByCalSumList(cal_sum_seq);
			request.setAttribute("ImpositionInfoByCalSumList", ImpositionInfoByCalSumList);			
			
			int listSize = ImpositionInfoByCalSumList.size();
			request.setAttribute("listSize", String.valueOf((listSize)));
			ProductBean pb = new ProductBean();		
			
			
			////////////info
			if(listSize > 0) // �⵵�� ����Ʈ�� ������
			{	
				if(seq == null || seq.equals("")||seq.equals("null"))  
				{	
					seq = ((ProductBean)ImpositionInfoByCalSumList.get(0)).getSEQ();
				}
				
				// ���� �� 
				float area_all = 0;
				for( int i = 0; i < listSize; i++ ){
					ProductBean bean =  (ProductBean)ImpositionInfoByCalSumList.get(i);

				}
//				System.out.println("���� �� area_all === " + area_all);
				request.setAttribute("area_all" ,String.valueOf(area_all));
				
				//info����
				pb = objJunggiService.impositionInfo(gapan_no, seq);
				
				
				//float area = objJunggiService.getProductAreaSum(pb.getFIRST_SEQ());
				//pb.setAREA_AFTER(area);  �̻��ؼ� ����..					

				
				//��¥�� �뽬(-) �߰�
				if(pb.getFROMDATE() != null) pb.setFROMDATE(addDash(pb.getFROMDATE()));			
				if(pb.getTODATE() != null) pb.setTODATE(addDash(pb.getTODATE()));		
				
				//��¥�� �뽬(-) �߰� ��
			}
			request.setAttribute("seq", seq);
			
			//forwview ����
			String strFormView = "/gapan/junggi/info_product";
			setFormView(strFormView);

		
			
			if( "add".equals(mode) ) {
				
				request.setAttribute("yearAdd", String.valueOf(Integer.parseInt(thisYear)+1));
				
				String yearVal1  = String.valueOf(Integer.parseInt(pb.getYEAR())+1);				
				
				if(objJunggiService.GetCountSameCal(pb.getFIRST_SEQ(),pb.getYEAR()) >1)
				{
					pb.setUSE_SECTION("2");
					pb.setUSE_SECTIONNAME("����");
					
				}
				
				
				pb.setFORM("");
				pb.setFORM_ADJUST("");				
				pb.setFROMDATE(yearVal1+"0101");
				pb.setTODATE(yearVal1+"1231");
				//pb.setTAX_DATE(yearVal1+"-03-10");		// �ΰ�����
				pb.setTAX_DATE(util.Date_Paste(thisDate));
				pb.setINDATE(yearVal1+"-03-31");		// ���⳻����
				pb.setOVERDATE(yearVal1+"-04-30");		// ����������
				
				request.setAttribute("old_use_section",pb.getTAX_GUBUN());				
				request.setAttribute("old_price",String.valueOf(pb.getPRICE()));
				request.setAttribute("old_rate",String.valueOf(pb.getRATE()));
				
				request.setAttribute("old_area_after",String.valueOf(pb.getAREA_AFTER()));
				
				
			}else
			{
				request.setAttribute("old_use_section",pb.getOLD_TAX_GUBUN());
				request.setAttribute("old_price",String.valueOf(pb.getPRICE()));
				request.setAttribute("old_rate",String.valueOf(pb.getRATE()));
				
				request.setAttribute("old_area_after",String.valueOf(pb.getAREA_AFTER()));
				
			}
			
			
			//��¥�� �뽬(-) �߰�						
			if(pb.getFROMDATE() != null) pb.setFROMDATE(addDash(pb.getFROMDATE()));			
			if(pb.getTODATE() != null) pb.setTODATE(addDash(pb.getTODATE()));			
			
			
			
			
			// ������ ������ ���ư� ������
			//setSuccessView("redirect:/gapan/junggi/junggi_view.do?gapan_no="+gapan_no);
			//System.out.println("setSuccessView == " + getSuccessView().toString() );
			
			return pb;
			
		}catch(Exception err)
		{
			System.out.println(err.toString());
		}
		
		ProductBean pb2 = new ProductBean();
		
		
				
		return pb2;
		
	}	
		
	protected ModelAndView onSubmit(HttpServletRequest request
			, HttpServletResponse response, Object command
			, BindException errors) throws Exception	 {
		try
		{
			//�Է� ���� ���� mode�� ������ ��		
			String mode = ServletRequestUtils.getStringParameter(request,"mode");
			
			//System.out.println("submit : mode === " + mode);
			
			ProductBean objProductBean = (ProductBean)command;
			
			objProductBean.setFROMDATE( removeDash(objProductBean.getFROMDATE()));
			objProductBean.setTODATE(removeDash(objProductBean.getTODATE()));
			
			
			if("add".equals(mode))
			{	
				
				if(objJunggiService.cal_sum_exist(objProductBean.getGAPAN_NO(),objProductBean.getYEAR()) > 0){		//�̹� �ش翬�� ����� ���� �� ������ return
					
					String strFormView = "redirect:/gapan/junggi/junggi_view.do?gapan_no="+objProductBean.getGAPAN_NO()+"&year="+objProductBean.getYEAR()+"&message=�̹� �ش�⵵ ������� �ֽ��ϴ�.";
					setSuccessView(strFormView);
					
				}
				else{
					
					String strFormView = "redirect:/gapan/junggi/junggi_view.do?gapan_no="+objProductBean.getGAPAN_NO()+"&year="+objProductBean.getYEAR()+"&message=����Ǿ����ϴ�.";
					setSuccessView(strFormView);
					
					//�⵵�� �´� cal_sum_seq �ִ��� �˻� ������ �������� ������ 0
					int cal_sum_seq = objJunggiService.getCal_tax_seq(objProductBean.getGAPAN_NO(),objProductBean.getYEAR());
					
					objProductBean.setUSE_SECTION("1"); // �����
					objProductBean.setTAX_GUBUN("1");
	
					if( cal_sum_seq == 0)
					{	
						//cal_sum_seq ���� ���� ��������												
						cal_sum_seq = objJunggiService.getCal_Sum_Seq();
						
						//calculation �� �Է�
						objProductBean.setCAL_SUM_SEQ(String.valueOf(cal_sum_seq));
						objJunggiService.insertProduct(objProductBean);
						
						//cal_sum_info �� �Է�
						objProductBean.setSEQ(String.valueOf(cal_sum_seq));
						//pb2.setFORM_ADJUST(objJumyongService.FormAdjustList(cal_sum_seq));
						objProductBean.setTAX_SEQ(String.valueOf(cal_sum_seq));
						objJunggiService.Cal_Sum_InfoInsert(objProductBean);
						
						//taxation�� �Է�
						objProductBean.setTAX_DATE(util.Date_Cut(objProductBean.getTAX_DATE()));
						objProductBean.setINDATE(util.Date_Cut(objProductBean.getINDATE()));							
						objProductBean.setOVERDATE(util.Date_Cut(objProductBean.getOVERDATE()));
						objProductBean.setFORM1(objProductBean.getFORM_ADJUST());
						objProductBean.setFORM2(objProductBean.getFORM());						
						objProductBean.setTAX_NO("");
						objProductBean.setTAX_YM(objProductBean.getTAX_DATE().substring(0,6));
						objProductBean.setSEQ(objProductBean.getCAL_SUM_SEQ());
						
						long sum = Long.parseLong(String.valueOf(objProductBean.getSUM_ADJUST()));				
						sum = sum/100*100;
						long vat = sum/10 ;
						//if( objProductBean.getTAX_CD() != null && !"".equals(objProductBean.getTAX_CD()) ){
						//	String cd = objProductBean.getTAX_CD().substring(0,2);
						//	if( "10".equals(cd) ){
								objProductBean.setBONSE(String.valueOf(sum));
								objProductBean.setSISE(String.valueOf(sum));
								objProductBean.setGUSE(String.valueOf(0));
						//	}else if ( "50".equals(cd) ){
						//		objProductBean.setBONSE(String.valueOf(sum));
						//		objProductBean.setGUSE(String.valueOf(sum));
						//		objProductBean.setSISE(String.valueOf(0));
						//	}
						//}
						objProductBean.setINTAX(String.valueOf(sum));
						objProductBean.setVAT(String.valueOf(vat));
						objJunggiService.executeBugwa_Register(objProductBean);
						
					}else
					{	
						// calculation �� �Է�
						objProductBean.setCAL_SUM_SEQ(String.valueOf(cal_sum_seq));
						objJumyongService.insertProduct(objProductBean);
						
						// calculation ���� ����
						//objJumyongService.updateProduct(objProductBean);
						objJunggiService.updateProduct(objProductBean);
						
						// cal_sum_info ����
						//int cal_sum_seq = objJunggiService.getCal_tax_seq(objProductBean.getADMIN_NO(),objProductBean.getYEAR());
						cal_sum_seq = Integer.parseInt(objProductBean.getCAL_SUM_SEQ());
//						System.out.println("CAL_SUM_SEQ==== " + cal_sum_seq);
						objJunggiService.updateCal_sum_info(objProductBean);
						
						
						// gapan_taxaion_info ����
						objProductBean.setTAX_DATE(util.Date_Cut(objProductBean.getTAX_DATE()));
						objProductBean.setINDATE(util.Date_Cut(objProductBean.getINDATE()));
						objProductBean.setOVERDATE(util.Date_Cut(objProductBean.getOVERDATE()));
						objProductBean.setFORM1(objProductBean.getFORM_ADJUST());
						objProductBean.setFORM2(objProductBean.getFORM());
						objProductBean.setTAX_YM(objProductBean.getTAX_DATE().substring(0,6));
						objProductBean.setSEQ(objProductBean.getCAL_SUM_SEQ());
						long sum = Long.parseLong(String.valueOf(objProductBean.getSUM_ADJUST()));				
						sum = sum/100*100;
						long vat = sum/10 ;
						//if( objProductBean.getTAX_CD() != null && !"".equals(objProductBean.getTAX_CD()) ){
							//String cd = objProductBean.getTAX_CD().substring(0,2);
							//if( "10".equals(cd) ){
								objProductBean.setBONSE(String.valueOf(sum));
								objProductBean.setSISE(String.valueOf(sum));
								objProductBean.setGUSE(String.valueOf(0));
							//}else if ( "50".equals(cd) ){
							//	objProductBean.setBONSE(String.valueOf(sum));
							//	objProductBean.setGUSE(String.valueOf(sum));
							//	objProductBean.setSISE(String.valueOf(0));
							//}
						//}
						objProductBean.setINTAX(String.valueOf(sum));
						objProductBean.setVAT(String.valueOf(vat));
						objJunggiService.updateTaxation_info(objProductBean);
	
						//form_adjust ������Ʈ
//						objProductBean.setFORM_ADJUST(objJumyongService.FormAdjustList(cal_sum_seq));
//						
//						//sum_adjust ������Ʈ
//						ProductBean pb_sum =  objJunggiService.SumBysumSeq(String.valueOf(cal_sum_seq));						
//						System.out.println("sum_adjust11="+pb_sum.getSUM_ADJUST());						
//						objProductBean.setSUM_ADJUST(pb_sum.getSUM_ADJUST());
//						
//						//area ������Ʈ
//						objProductBean.setAREA_AFTER(pb_sum.getAREA_AFTER());						
//						objProductBean.setSEQ(String.valueOf(cal_sum_seq));
//						objJunggiService.CalSumAddUpdate(objProductBean);
					}
						
					//�ΰ� , �̺ΰ� -> �̺ΰ��� ����						
					//objJunggiService.setTaxYn(objProductBean.getGAPAN_NO());
					
						
				} // �ش�⵵ ����� ���� üũ end	
				
			}
			else if("edit".equals(mode))
			{	
				
				int cal_sum_seq = Integer.parseInt(objProductBean.getCAL_SUM_SEQ());
//				System.out.println("CAL_SUM_SEQ==== " + cal_sum_seq);
				
				
				String strFormView = "redirect:/gapan/junggi/junggi_view.do?gapan_no="+objProductBean.getGAPAN_NO()+"&year="+objProductBean.getYEAR()+"&cal_sum_seq="+cal_sum_seq+"&message=�����Ǿ����ϴ�.";
				setSuccessView(strFormView);
				
				//calculation ���� ����				
				//objJumyongService.updateProduct(objProductBean);				
				objJunggiService.updateProduct(objProductBean);
				
				// cal_sum_info ����
				//int cal_sum_seq = objJunggiService.getCal_tax_seq(objProductBean.getADMIN_NO(),objProductBean.getYEAR());
				objJunggiService.updateCal_sum_info(objProductBean);
				
				
				// gapan_taxaion_info ����
				objProductBean.setTAX_DATE(util.Date_Cut(objProductBean.getTAX_DATE()));
				objProductBean.setINDATE(util.Date_Cut(objProductBean.getINDATE()));
				objProductBean.setOVERDATE(util.Date_Cut(objProductBean.getOVERDATE()));
				objProductBean.setFORM1(objProductBean.getFORM_ADJUST());
				objProductBean.setFORM2(objProductBean.getFORM());
				objProductBean.setTAX_YM(objProductBean.getTAX_DATE().substring(0,6));
				objProductBean.setSEQ(objProductBean.getCAL_SUM_SEQ());
				long sum = Long.parseLong(String.valueOf(objProductBean.getSUM_ADJUST()));		
				sum = sum/100*100;			
				long vat = sum/10 ;
				//if( objProductBean.getTAX_CD() != null && !"".equals(objProductBean.getTAX_CD()) ){
				//	String cd = objProductBean.getTAX_CD().substring(0,2);
				//	if( "10".equals(cd) ){
						objProductBean.setBONSE(String.valueOf(sum));
						objProductBean.setSISE(String.valueOf(sum));
						objProductBean.setGUSE(String.valueOf(0));
				//	}else if ( "50".equals(cd) ){
				//		objProductBean.setBONSE(String.valueOf(sum));
				//		objProductBean.setGUSE(String.valueOf(sum));
				//		objProductBean.setSISE(String.valueOf(0));
				//	}
				//}
				objProductBean.setINTAX(String.valueOf(sum));
				objProductBean.setVAT(String.valueOf(vat));
				objJunggiService.updateTaxation_info(objProductBean);
				

			}
			
		
		}catch(Exception err)
		{
			System.out.println(err.toString());
		}
		
		return new ModelAndView(getSuccessView());
	}
	
	public String addDash(String val1)
	{
		if(val1.length() > 8)
		return val1.substring(0,4)+"-"+val1.substring(4,6)+"-"+val1.substring(6,8);
		else return val1;
	}
	
	public String removeDash(String val1)
	{			
		String[] components = val1.split("-");		
		String returnVal = "";		
		for(int i=0;i<components.length;i++)
			returnVal = returnVal + components[i].toString();
		
		return returnVal;		
	}
	
	public String removeDash1(String val1)
	{			
		String[] components = val1.split(".");		
		String returnVal = "";		
		for(int i=0;i<components.length;i++)
			returnVal = returnVal + components[i].toString();
		
		return returnVal;		
	}
	
	
}
