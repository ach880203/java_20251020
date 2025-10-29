package ex11;

public class StaticEx01 {

	int number; // 인스턴스 멤버
	static int ban; // 정적 멤버

	void func() { // 인스턴스 메소드
		System.out.println("number : " + number);
	}

	static void test() { // 정적 메소드
		System.out.println("ban : " + ban);
	}
}

// static이 붙어있지 않은 변수는 이 클래스를 벗어나면 사용할 수 없다.
