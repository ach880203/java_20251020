package ex01;

public class 증감연산자 {

/*
 * ++A : 선위 연산자(증감)
 * B++ : 후위 연산자
 * --A : 감소
 * B--
 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 System.out.println("기존 숫자 10으로 시작");
		 int iNum = 10;
		 System.out.println(iNum);

		 
		 System.out.println("iNum 1증가 - 1");
		         iNum = iNum+1;
		         System.out.println(iNum);
		
		 
		 System.out.println("iNum 1증가 - 2");
		 		 iNum += 1;
				 System.out.println(iNum);
				 
				 
		 System.out.println("iNum 1증가 - 3");
			++iNum;
			System.out.println(iNum);
			
			
	     System.out.println("iNum 1증가 - 4");
			iNum++;
			System.out.println(iNum);
		
			System.out.println("-----------------------------------------------");
			
		System.out.println("선위 연산자 1증가 - 5");
		int iNum2 = 1;
		int iA = ++iNum2;
		/*
		 * iNum2 += 1;
		 * int iA = iNum2;
		 */
		System.out.println(iA); 
		System.out.println(iNum2);
		
		
		System.out.println("후위 연산자 1증가 - 6");
		iNum2 = 1;
		int iB = iNum2++;
		/*
		 * int iB = iNum2;
		 * iNum2 += 1;
		 */
		System.out.println(iB); 
		System.out.println(iNum2);
		
		System.out.println("-------------------------------------------------------");
		System.out.println("선위, 후위의 계산 예제");
		int x = 1;
		int y = 1;
		int result1 = ++x + 10;//x가 result1로 이동 하는 중 ++을 만나 1이 선 증가되고 후에 +10을 만나 10이 증가된어 12. 
		int result2 = y++ + 10;//y가 result2로 이동 후 +10을 11이되고 후에 ++을 만나 y가 1증가 2가 된다.
		System.out.println(result1);
		System.out.println(result2);
		
		/*
		 * 이것이 자바다 책. 82p~83p 참고
		 */
		
	
		
		
	}

}
