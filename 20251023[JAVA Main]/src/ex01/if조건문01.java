package ex01;

public class if조건문01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 * number >= 90 A
		 * number >= 98 B
		 * number < 98 C
		 *
		 *  상위 식부터 순서대로 진행이 되고, 
		 *  조건에 부합하면 else는 뛰어넘고 결과 값으로 넘어간다.
		 */
		
		
		int number = 95;
		
		if (number >= 90) {
			System.out.println(" A 학점");
		}else if( number > 80){
			System.out.println(" B 학점. ");
		}else  {
			
			System.out.println(" C 학점. ");
		}

		//if (number < 20) {System.out.println(" 당신은 미성년입니다. ");		}
	
		
		System.out.println("-------프로그램 종료-----------");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
