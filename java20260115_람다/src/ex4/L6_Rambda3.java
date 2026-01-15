package ex4;

//문자열 넘겨주면 문자열 길이를 계산해서 반환..
//1. 클래스 구현체 만들기
//2. 익명함수 변경
//3.람다 변경
@FunctionalInterface
interface StringLength{
	int getLength(String s);
}

class Length implements StringLength{

	@Override
	public int getLength(String s) {
		return s.length();
	}

}
public class L6_Rambda3 {
	
	public static void main(String[] args) {
		
		//1. StringLength s = new Length();
		
		/* 2.
		 * StringLength s = new StringLength() {
		 * 
		 *    @Override public int getLength(String s) { 
		 *       return s.length(); 
		 *    } 
		 * };
		 */
		
		//3.
		StringLength s1 = s -> s.length();
		
		int len = s1.getLength("이 문장의 길이는?");
		System.out.println(len);
	
}
	}

