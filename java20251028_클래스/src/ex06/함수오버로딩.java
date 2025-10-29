package ex06;

public class 함수오버로딩 {

	public static void main(String[] args) {
            func();
            func(10);
            func("홍길동");
            func(10,20);
           // func(10,20,30); 함수가 준비된 갯수 이상으로 작성하면 오류가 난다. -주석 풀면 알 수 있음- 
	
	}
	
	
	static void func() {
		System.out.println("-------------------");
	}

	
	static void func(int n) {
		System.out.println("-----" + n + "------");
	}

	
	static void func(String s) {
		System.out.println("-----" + s + "------");
	}
	
	static void func(int n1, int n2) {
		System.out.println("-----" + (n1+n2) + "--------");
	}
	
	
	
	
}
