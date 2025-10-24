package solo1;


import java.util.HashSet;
import java.util.Set;

public class 로또 {
    public static void main(String[] args) {

        Set<Integer> lotto = new HashSet<>();

        // 중복 없이 6개의 랜덤 숫자 생성
        while (lotto.size() < 6) {
            int num = (int)(Math.random() * 45) + 1;
            lotto.add(num); // HashSet은 중복을 자동으로 제거
        }

        // 출력
        for (int n : lotto) {
            System.out.println(n);
        }

        System.out.println("-------당첨 기원-----------");
    }
}