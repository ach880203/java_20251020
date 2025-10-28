package ex03;

import java.util.Arrays;

public class LottoEX04 {

	public static void main(String[] args) {

		 /*
		  * 로또 프로그램
		  * 배열 6칸짜리 int 배열
		  * 로또는 1 ~ 45 랜덤하게 저장
		  * 단, 중복불가
		  */
		
	   int[] lotto = new int[6];
	   
	   for(int i=0; i<lotto.length; i++) {
		   int  tmp = (int)(Math.random()*45)+1;
		   boolean find = false;
		
	 	
	   for(int j=0; j<i; j++) {
		   if(tmp == lotto[j]) {
			   find = true;
			   break;}

              }
	   if(find) {
		   i--;
		   continue;
	   }
	   lotto[i] = tmp;
         }
	System.out.println(Arrays.toString(lotto));
	}
	}