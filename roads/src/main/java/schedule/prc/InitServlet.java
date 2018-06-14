package main.java.schedule.prc;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Field;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import main.java.common.util.Globals;
import main.java.jumyong.jumyong.service.IJumyongService;
import main.java.schedule.model.LogBean;
import main.java.schedule.service.IScheduleService;
import main.java.schedule.util.FTPUtil;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

public class InitServlet extends QuartzJobBean {

	private IScheduleService objScheduleService = null;

	public void setScheduleService(IScheduleService newObjScheduleService) {
		this.objScheduleService = newObjScheduleService;
	}

	protected void executeInternal(JobExecutionContext arg0)
			throws JobExecutionException {
		
		// 수납정보 업데이트
		
		
		// FTP 초기화
		FTPUtil ftp = new FTPUtil();
		ftp.init(Globals.TAX_FTP_HOST, Globals.TAX_FTP_ID, Globals.TAX_FTP_PWD,
				Integer.parseInt(Globals.TAX_FTP_PORT));

		// 오늘 날짜 날짜 구하기
		Calendar cal = null;
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd"); // 데이터 출력 형식 지정

		// 1주일치 재탐색
		for (int cDay = 0; cDay < 7; cDay++) {

			cal = Calendar.getInstance();
			cal.set(cal.get(Calendar.YEAR), cal.get(Calendar.MONTH),
					cal.get(Calendar.DATE) - cDay);
			String toDate = sdf.format(cal.getTime());

			// 받아올 파일 이름 생성
			String targetFileName = "roads_log." + toDate + ".rpt";
			System.out.println(targetFileName + "파일다운로드 분석시작");

			File readFile = new File(Globals.SUNAPLOGUPLOADPATH
					+ targetFileName);

			// 파일없을때만 동작
			if (readFile.length() == 0) {

				// FTP에서 다운받기
				//System.out.println(targetFileName + "파일다운로드 시작");

				ftp.download(toDate.substring(0, 6) + "/", targetFileName,
						Globals.SUNAPLOGUPLOADPATH + targetFileName);
				//System.out.println("FTP다운로드 완료");

				// 파일 읽어오기
				BufferedReader br = null;
				LogBean bean = null;

				readFile = new File(Globals.SUNAPLOGUPLOADPATH + targetFileName);

				try {
					br = new BufferedReader(new FileReader(readFile));

					System.out.println("파일 읽어오기!");
					int _count = 0;

					String line = null;
					while ((line = br.readLine()) != null) {
						// 읽을 한 줄을 ,로 구분하여 스트링 배열로 리턴
						bean = new LogBean();
						String[] element = line.split("\t");
						Field _field[] = bean.getClass().getDeclaredFields();

						// 데이터인지 확인!
						if (element[0].length() == 8) {
							for (int i = 0; i < element.length; i++) {
								_field[i].setAccessible(true);
								_field[i].set(bean, element[i]);
							}

							_count++;
							// DB에 넣기
							objScheduleService.insertSunapInfo(bean);
						}

					}

					System.out.println("데이터 임포트::" + _count);

				} catch (Exception e) {
					 //e.printStackTrace();
				} finally {
					try {
						if (br != null)
							br.close();
					} catch (Exception ignore) {

					}
				}

			} else {
				System.out.println("이미 추가된 데이타!");
			}
		}
		ftp.disconnection();

		// 1주일치 탐색 끝
		
		//가판/노점 수납정보 업데이트
		objScheduleService.gapanTaxationInfoUpdate();
		
		//도로 수납정보 업데이트
		objScheduleService.taxationInfoUpdate();
		
		
		//공시지가 업데이트 체크
		objScheduleService.cpBd600Update();
		
		
	}
}
