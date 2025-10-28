package ex04;

import java.util.Arrays;

public class 연습문제 {

	public static void main(String[] args) {

		/*
		 * 1.배열 10개 방에다 랜덤하게 1~100사이 값을 저장
		 * 2.배열에서 최대값, 최소값을  출력
		 * 3. 배열 10개 방에 10개의 총합, 평균을 구한다.`
		 * 4. 10개 값을 정렬한다.
		 * 
		 * 코드는 중괄호를 기준으로 위에서부터 순서대로 진행 됨을 잊지 말자!!
		 * 중괄호의 안과 밖을 구분하는 것에 익숙해지자.
		 */
	   
		//배열 10개	
      int[] number = new int[10];
       
      //랜덤으로 1~100 숫자 생성 하여 10개 배열
       for(int i=0; i<number.length; i++) {
    	   number[i] = (int)(Math.random()*100)+1;
       }
		System.out.println(Arrays.toString(number));
		
		//max, min 배열 새로 생성 - max와 min의 변수를 먼저 선언함
		 int max, min;
		 max = min = number[0];
		 for(int i=0; i<number.length; i++){
		
			 //max가 넘버보다 작을 때
			 if(max < number[i])
				 max = number[i];
			 
			 if (min > number[i])
				 min = number[i];
				 
		 }
		 
		System.out.println("max : " + max);
		System.out.println("min : " + min);
		
		
		//총점, 평균 구하기.
		
		 int sum = 0;
		 double avg = 0;
		 
		 for(int i=0; i<10; i++) {
			 sum += number[i];
			 
		 } // for end
		 avg = (double)sum/number.length;
		 System.out.println("총점 : " + sum);
		 System.out.println("평균 : " + avg);
		 
		
		 
		 //오름차순 정리하기
		 
		 for(int i=0; i<number.length; i++) {
			 for(int j=0; j < number.length -1 -i; j++) {
				 if(number[j] > number[j+1]) {
					 int tmp = number[j];
					 number[j] = number[j+1];
					 number[j+1] = tmp;
				 } // if end
			 }//for end j
		 }// for end i
		 System.out.println(" 정렬 : " +Arrays.toString(number));
		 
		 
		 
		 
		 
		 
	} //main end

}//class end
