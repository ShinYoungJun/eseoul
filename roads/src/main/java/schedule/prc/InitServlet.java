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
		
		// �������� ������Ʈ
		
		
		// FTP �ʱ�ȭ
		FTPUtil ftp = new FTPUtil();
		ftp.init(Globals.TAX_FTP_HOST, Globals.TAX_FTP_ID, Globals.TAX_FTP_PWD,
				Integer.parseInt(Globals.TAX_FTP_PORT));

		// ���� ��¥ ��¥ ���ϱ�
		Calendar cal = null;
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd"); // ������ ��� ���� ����

		// 1����ġ ��Ž��
		for (int cDay = 0; cDay < 7; cDay++) {

			cal = Calendar.getInstance();
			cal.set(cal.get(Calendar.YEAR), cal.get(Calendar.MONTH),
					cal.get(Calendar.DATE) - cDay);
			String toDate = sdf.format(cal.getTime());

			// �޾ƿ� ���� �̸� ����
			String targetFileName = "roads_log." + toDate + ".rpt";
			System.out.println(targetFileName + "���ϴٿ�ε� �м�����");

			File readFile = new File(Globals.SUNAPLOGUPLOADPATH
					+ targetFileName);

			// ���Ͼ������� ����
			if (readFile.length() == 0) {

				// FTP���� �ٿ�ޱ�
				//System.out.println(targetFileName + "���ϴٿ�ε� ����");

				ftp.download(toDate.substring(0, 6) + "/", targetFileName,
						Globals.SUNAPLOGUPLOADPATH + targetFileName);
				//System.out.println("FTP�ٿ�ε� �Ϸ�");

				// ���� �о����
				BufferedReader br = null;
				LogBean bean = null;

				readFile = new File(Globals.SUNAPLOGUPLOADPATH + targetFileName);

				try {
					br = new BufferedReader(new FileReader(readFile));

					System.out.println("���� �о����!");
					int _count = 0;

					String line = null;
					while ((line = br.readLine()) != null) {
						// ���� �� ���� ,�� �����Ͽ� ��Ʈ�� �迭�� ����
						bean = new LogBean();
						String[] element = line.split("\t");
						Field _field[] = bean.getClass().getDeclaredFields();

						// ���������� Ȯ��!
						if (element[0].length() == 8) {
							for (int i = 0; i < element.length; i++) {
								_field[i].setAccessible(true);
								_field[i].set(bean, element[i]);
							}

							_count++;
							// DB�� �ֱ�
							objScheduleService.insertSunapInfo(bean);
						}

					}

					System.out.println("������ ����Ʈ::" + _count);

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
				System.out.println("�̹� �߰��� ����Ÿ!");
			}
		}
		ftp.disconnection();

		// 1����ġ Ž�� ��
		
		//����/���� �������� ������Ʈ
		objScheduleService.gapanTaxationInfoUpdate();
		
		//���� �������� ������Ʈ
		objScheduleService.taxationInfoUpdate();
		
		
		//�������� ������Ʈ üũ
		objScheduleService.cpBd600Update();
		
		
	}
}
