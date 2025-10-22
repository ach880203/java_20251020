package ex03;

public class VariableUseEXample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 시간을 적는 연습
		 */

		int hour = 2;
		int minute = 4;
		System.out.println(hour + "시간 " + minute + "분");

		int totalminute = (hour * 60) + minute;
		System.out.println("총 " + totalminute + "분");

		/*
		 * 연산 
		 * 정수+정수=정수 
		 * 정수+실수=실수 
		 * 실수+실수=실수
		 */
		System.out.println(minute / hour);
		System.out.println(minute / (double) hour);
//                                     이게 강제 형변환
		/*
		 * "kor" , "한글" ==> 문자열 
		 * 정수 + 문자열 => 문자열 
		 * 실수 + 문자열 => 문자열
		 */

	}

}
