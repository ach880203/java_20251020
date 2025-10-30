package ex13;

public class StudentMain {

	public static void main(String[] args) {

		
		Student  s = new Student("홍길동",1,1,100,60,76);
		
		System.out.println("이름 : " + s.getName());
		System.out.println("총점 : " + s.getTotal());
		System.out.println("평균 : " + s.getAverage());
		System.out.printf("평균2 : %.2f\n " , s.getAverage2());
		
		
//		float num = 100.25f;
//		System.out.printf("점수 %.2f : ", num); //실수 출력 %.xf는 x에 소수점 단위 입력하면 표시됨.
//		System.out.printf("점수 %d : ", 100); //정수 출력
//		
		
		System.out.println(s.info());
		
		
	}
          

}
