package java_20251027_문자열;

public class CharAtEx01 {

	public static void main(String[] args) {

		String subject = "자바 프로그래밍";
        //"자바 프로그래밍"에서 해당하는 insdex번호 한 문자 추출
		char ch = subject.charAt(0);

		System.out.println(ch);

		// 문자열 길이 ("자바 프로그래밍" 문자열 길이 추출)
		int len = subject.length(); // 많이 사용한다 기억하자. 예로 페스워드, 아이디등 길이를 정해놓은 부분에서 사용한다.
		System.out.println("문자열 길이 : " + len);

		
		// 문자열 대체
		// "자바 프로그래밍" 문장에서 자바를 팡이썬으로 변경해서 새로운 문자열 생성
		System.out.println("-----------문자열 대체--------");
		System.out.println("before: " + subject);
		subject = subject.replace("자바", "파이썬");
		System.out.println("after : " + subject);

		
		System.out.println("-------문자열 잘라내기----------");
		// index 4번쨰 위치에서 전부다 문자 추출
		String sub2 = subject.substring(4); 
		System.out.println(sub2);
		
		// index 44번쨰 위치에서 6전까지 추출(4, 5를 추출하라는 의미.)
		String sub3 = subject.substring(4, 6); 
		System.out.println(sub3);

		System.out.println("---------문자열 찾기-------");
		//"파이썬 프로그래밍"에서 프로라는 단어는 몇 번째 index에 있는가?
		int index = subject.indexOf("프로그래밍");
		System.out.println("문자열 찾기 : " + index);
		
		// 만약 -1이 추출되면 해당하는 단어가 없다는 의미.
		index = subject.indexOf("프로그램");
		System.out.println("문자열 찾기 : " + index);
		
		
		System.out.println("---------문자열 분리!!많이 사용한다!!-------");
		//"파이썬 프로그래밍" 문자열을 공난 기준으로 분리
		String[] sub4 = subject.split(" ");//꼭 사이를 듸어 줘야함.
		System.out.println(sub4[0]);
		System.out.println(sub4[1]);
		
		System.out.println("--------- -문자열 합치기 -------------");
		String s = "대한";
		String s2 = "민국";
		//s가 가지고 있는 "대한"에 s2가 가지고있는 "민국"을 합쳐서 새로운 문자열 대한민국을 생성
		String s3 = s.concat(s2);
		System.out.println(s3);
		
				
		
		
		
		
		
		
		
	}
	
}