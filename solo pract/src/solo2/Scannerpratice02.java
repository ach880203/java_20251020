package solo2;
import java.util.Scanner;

public class Scannerpratice02 {

		
		    static int doubleIt(int n) {
		        return n * 2;
		    }

		    public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		        System.out.print("숫자 입력: ");
		        int x = sc.nextInt();          // 1) 입력
		        int y = doubleIt(x);           // 2) 처리(메서드 호출)
		        System.out.println(y);         // 3) 출력
		        sc.close();
		    }
		}
	
		
		
