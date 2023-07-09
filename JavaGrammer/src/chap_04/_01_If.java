package chap_04;

public class _01_If {
    public static void main(String[] args) {
        // 조건문 If
        int hour = 10;

        // if 문 내에서 하나의 문장을 실행할 때는 {} 생략 가능

        if (hour < 13)
            System.out.println("아이스 아메리카노 +1");

        if (hour < 14){
            System.out.println("아이스 아메리카노 +1");
            System.out.println("샷추가");
        }
        System.out.println("커피 주문 완료");

        // 오후 2시 이전, 모닝 커피를 마시지 않는 경우?
        hour = 10;
        boolean morningCoffee = false;
        if (hour < 14 && morningCoffee == false){
            System.out.println("아이스 아메리카노 +1");
        }
        System.out.println("커피 주문 완료");

    }
}
