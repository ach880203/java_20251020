package ex03;

public class SingletonWxemple {

	public static void main(String[] args) {

		/*
		Singleton obj1 = new Singleton(); //컴파일 에러
		Singleton obj2 = new Singleton(); //컴파일 에러
		*/

		
		//정적 메소드를 호출해서 싱글톤 객체를 얻음
		Singleton obj1 = Singleton.getIinstance();
		Singleton obj2 = Singleton.getIinstance();
		
		
		//동일한 객체를 참조하는 확인
		if(obj1 == obj2) {
			System.out.println("같은 Singleton 객체 입니다.");
		}else {
			
			System.out.println("다른 Singleton 객체 입니다.");
		}
	Sample sam1 = new Sample();
	Sample sam2 = new Sample();
			
			if(sam1.equals(sam2)) {
				System.out.println("같은 Sample 객체");
			}else {
				System.out.println("다른 Sample 객체");
			}
	}

}
