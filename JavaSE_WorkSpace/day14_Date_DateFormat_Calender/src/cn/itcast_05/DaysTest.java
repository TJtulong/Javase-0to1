package cn.itcast_05;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import org.omg.Messaging.SyncScopeHelper;

//��һ���㿪�����������
public class DaysTest {
	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		System.out.println("��������ĳ���������");
		String line = sc.nextLine();

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date d = sdf.parse(line);

		long myTime = d.getTime();
		long nowTime = System.currentTimeMillis();

		long time = nowTime - myTime;
		long day = time / 1000 / 60 / 60 / 24;
		System.out.println("����������" + day + "��");
	}
}
