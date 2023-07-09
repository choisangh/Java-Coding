package chap_04;

public class _05_For {
    public static void main(String[] args) {
        // 반복문 For
        System.out.println("어서오세요");

        // for (선언; 조건; 증감)
        for (int i = 0; i < 10; i++) {
            System.out.println("어서오세요. " + i);


        }

        // 짝수만 출력
        for (int i = 0; i < 10; i += 2) {
            System.out.println("짝수 " + i);
        }

        // 홀수만 출력
        for (int i = 1; i < 10; i += 2) {
            System.out.println("홀수 " + i);
        }

        // 거꾸로
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }

        // 1부터 10까지 수들의 합
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println(sum);

    }
}
