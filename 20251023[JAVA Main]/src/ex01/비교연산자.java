package ex01;

public class 비교연산자 {
 public static void main(String[] args) {
	
	 int numA = 5;
	 int numB =10;
	 
	 System.out.println(numA == numB);
	 System.out.println(numA != numB);
	 System.out.println(numA > numB);
	 System.out.println(numA >= numB);
	 System.out.println(numA < numB);
	 System.out.println(numA <= numB);
	 
	 System.out.println("------------------------------------------------------");
	 
	 String s1 = "korea";
	 String s2 = "korea";
	 //System.out.println(s1==s2); s1과 s2의 korea값은 같은 주소 안에서 서로 공유 되고 있다.
	 System.out.println(s1.equals(s2));
	 
	 /* equals()를 주로 사용한다. 
	  * 부호를 이용한것은 자체를 비교하는 것이 아니라 값이 저장된 주소의 값을 비교하는 것이기에
	  * 서로 다른 주소레 새롭게 만들어진 값은 비교가 안된다. 
	  */
	 
	 
	 System.out.println("------------------------------------------------------");
	 
	 //Scanner sc = new Scanner(System.in);
	 String s3 = new String("korea");
	 String s4 = new String("korea");
	 //System.out.println(s3 == s4); xxxxx 이렇게는 어지간 하면 사용하지 않는다.
	 System.out.println(s3.equals(s4));
	 
	 
	 
	 System.out.println("-------------논리 연산---------------------------");
	 numA = 5;
	 numB = 10;
	 int numC = 3;
	 int numD = 9;
	 
	 System.out.println(numA < numB);
	 System.out.println(numC < numD);
	 
	 //AND 회로
	 System.out.println ((numA > numB) && (numC > numD)); //F
	 System.out.println ((numA > numB) && (numC < numD)); //F
	 System.out.println ((numA < numB) && (numC > numD)); //F
	 System.out.println ((numA < numB) && (numC < numD)); //T
	 
	 //OR 회로
	 System.out.println ((numA > numB) | (numC > numD)); //F
	 System.out.println ((numA < numB) | (numC > numD)); //T
	 System.out.println ((numA > numB) | (numC < numD)); //T
	 System.out.println ((numA < numB) | (numC < numD)); //T
	 
	 //NOT
	 System.out.println (!(6 > 5)); //F !답을 부정하는 부호이다.
	 
	 //XOR
	 System.out.println (15 ^ 12); //F ^베타논리합
	 
	 
	 
	 
	 
	 
	 
	 
	 
}    
}
