package day18;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExbDateEx1 {

	public static void main(String[] args) {
		/*date클래스는 날짜 클래스
		 * Calendar와 달리 요일 , 년, 월, 일정보를 쉽게 확인하는 기능이 없다.*/
		Date date1 = new Date();
		System.out.println(date1);
		//Date 를 String으로 변환
		//SimpleDateFormat을 이용해 원하는 문자열 패턴으로 바꿈
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); 
		String str = format.format(date1);
		System.out.println(str);
		
		format = new SimpleDateFormat("yyyy년 MM월 dd일");
		String str2 = format.format(date1);
		System.out.println(str2);
		System.out.println(date1.getDay());
		
		//String을 Date로
		try {
			String strDate1 = "2021-11-13 10:08:10";
			format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
			Date date2;
			date2 = format.parse(strDate1);
			System.out.println(date2);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

}
