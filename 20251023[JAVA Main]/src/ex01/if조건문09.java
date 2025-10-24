package ex01;

public class if조건문09 {

	public static void main(String[] args) {

		
		/*
		 *  nuber 90 >= A
		 *  nuber  80 >= B
		 *  nuber 70 >= C
		 *  nuber 60 >= D
		 *  nuber 60 < F 
		 *
		 */
			
		
		
		int num = (int)(Math.random()*100)+1;
		System.out.print(num + " 점수는 : ");
		
	    switch(num / 10) {
	    case 10:
	    case 9 :
	    	System.out.println("A");
	    	break;
	   
	    case 8 :
	    	System.out.println("B");
	    	break;
	    
	    case 7 :
	    	System.out.println("C");
	    	break;
	    
	    case 6 :
	    	System.out.println("D");
	    	break;
	   	   
	    default:
	    	System.out.println("F");
	    }
		
		System.out.println("-------프로그램 종료-----------");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
