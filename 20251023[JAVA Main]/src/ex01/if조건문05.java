package ex01;

import java.util.Scanner;

public class if조건문05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 * 
		 *  버스요금 계산표
		 *  요금 : 2000
		 *  65세 이상 : 무료
		 *  20 ~ 64 : 할인률 0%
		 *  15 ~ 19 : 할인률 20%
		 *  7 ~ 14 : 할인률 50%
		 *  6세 미만 : 무료
		 *  
		 */
		
		/*
	    int age = 54;
		int M = 2000;
		int S = 20 /100 ;
		int S1 = 50 / 100;
		
		if (age >= 65) {
			System.out.println( "나이" + age + "는 무료입니다. ");
		}
		else if (age >= 20){
			System.out.println("나이 " + age + "세는 " + M + "원입니다." );
		}
	    else if (age >= 15) {
				System.out.println("나이 " + age + "세는 " + (M - (M * S)) + "원입니다.");
			}
		else if(age >= 7){
				System.out.println("나이 " + age + "세는 " + (M - (M * S1)) + "원입니다.");
	    }
		else {
			System.out.println( "나이 " + age + "세는 무료입니다. ");
		}
		
		System.out.println("-------프로그램 종료-----------");
		*/
		
		
		    int age = 43;
			int fee = 2000;
			double rate = 0;
			
			if (age >= 65) {
				fee = 0;
			}
			else if (age >= 20 & age < 65){
                rate = 0;
			}
		    else if (age >= 15 & age < 20) {
                rate = 0.2;
		    }
			else if(age >= 7 & age < 15){
                rate = 0.5;
			}
			else {
                fee = 0;
			}
			if(fee != 0) {
				fee = (int)( fee * ( 1 - rate ) );
			}
			
			System.out.println("나이 " + age + "세는 " + fee + "원 입니다.");
			System.out.println("-------프로그램 종료-----------");
			
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
