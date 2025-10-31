package ex03;

/*
 * 싱글톤 - 객체 생성을 1개만 생성해서 공유한다.
 */
public class Singleton {

	//Private 접근 권할을 같는 정적 필드 선언과 초기화
	private static Singleton singleton = new Singleton();
	
	
	//Private 접근 권할을 갖는 생성자 선언
	private Singleton() {}
	
	
	//public 접근 권한을 갖는 정적 메소드 선언
	public static Singleton getIinstance() {
		return singleton;
	}
}
class Sample{
	public Sample() {}
	
	
	
}
