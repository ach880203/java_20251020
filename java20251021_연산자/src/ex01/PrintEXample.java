package ex01;

public class PrintEXample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("hello, java");

		/*
		 * 20251021 안창현 만듬 연습을 목적으로 함
		 */

		/*
		 * 1.한 파일에는 한 클래스만 있는 거이 일반적이다. 2. 두 개의 클래스다 존재할떄는 Public은 한 곳에만 기입한다. -->Public
		 * 키워드가 있는곳이 클래스명이 파일명이 된다. 3. Public이 없는 클래스가 여려개 있으면 파일명은 아무거나 해도 된다. 단,
		 * mailn함수가 있다면 main함수가 있는 곳 클래스명을 파일명으로한다.
		 */

		System.out.print("안창현");

		int u = 20;

		System.out.println("드디어" + u + "오예");
		System.out.println("이해" + u + "오예");
		System.out.println("함" + u + "오예");
		System.out.println("뭐" + u + "오예");
		System.out.println("별거" + u + "오예");
		System.out.println("아니네~" + u + "오예");

		// sysout

		float f = 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f
				+ 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f
				+ 0.1f;

		System.out.println(f);

		double c = 0.1 + 0.1 + 0.1;

		System.out.println(c);

		float x = 0;

		for (int i = 0; i < 30; i++)
			x += 0.1f;

		System.out.println(x);
	
		double p = 0.1;
		
		for (int i=0; i<30; )
		
			 			 
	    System.out.println(p);

//		  이 주석은 전부 다 안나온다~

		// 이 주석은 한 줄만 안나온다~

//		이 친구는 줄 바꿈이 없음 System.out.print("");
//		이 친구는 줄 바꿈이 있음 system.out.println("");

	}

}

class Test {

}
