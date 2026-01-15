package expractice;


/*
 * 어떤 시스템에서
 * 사용자가 입력한 아이디와 비밀번호가
 * 이미 등록괸 정보와 일치하는지 검사하려고 한다.
 * 이 검사를 BiPrdicate<String, String> 로 구현하시오.
 * String savedId = "admin";
 * String savedPw = "1234";
 */
import java.util.function.BiPredicate;

public class LP_BiPredicate {

	public static void main(String[] args) {
		
		BiPredicate<String, String> f = (id, pw) -> id.equals("admin") && pw.equals("1234") ? true : false;
		
		boolean flag = f.test("admin", "1234");
		
		if(flag == false) {
			System.out.println("로그인 실패");
		}else {
			System.out.println("로그인 성공");
		}
		
		
	}
	
}
