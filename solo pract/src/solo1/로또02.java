package solo1;

import java.util.Set;
import java.util.TreeSet;

public class 로또02 {
    public static void main(String[] args) {
    	
    	
    	// TreeSet은 자동으로 오름차순 정렬됨
        Set<Integer> lotto = new TreeSet<>();

        // 중복 없이 6개의 랜덤 숫자 생성
        while (lotto.size() < 6) {
            int num = (int)(Math.random() * 45) + 1;
            lotto.add(num);
        }

        // 출력
        for (int n : lotto) {
            System.out.println(n);
        }

        System.out.println("-------당첨 기원-----------");
        

    }
}