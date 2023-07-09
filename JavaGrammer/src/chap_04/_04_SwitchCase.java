package chap_04;

public class _04_SwitchCase {
    public static void main(String[] args) {
        // Switch Case
        int ranking =1;

        if (ranking == 1){
            System.out.println("전액 장학금");
        } else if (ranking == 2 || ranking == 3){
            System.out.println("반액 장학금");
        } else {
            System.out.println("장학금 대상 아님");
        }
        System.out.println("조회 완료 #1");

        // Switch Case 문 활용
        ranking =1;
        switch (ranking){
            case 1: // ranking 1일 경우
                System.out.println("전액 장학금");
                break; // break 없으면 계속 아래 라인 실행
            case 2: // ranking 2일 경우
                System.out.println("반액 장학금");
                break;
            case 3:
                System.out.println("반액 장학금");
                break;
            default: // 모든 케이스에 해당하지 않을 경우
                System.out.println("장학금 대상 아님");

        }
        System.out.println("조회 완료 #2");

        // break문 없을 경우
        int grade = 3;
        int price = 7000;
        switch (grade){
            case 1:
                price += 1000; // 10000원
            case 2:
                price += 1000; // 9000원
            case 3:
                price += 1000; // 8000원
                break;
        }
        System.out.println(grade + "등급 제품의 가격 : " + price + "원");

    }
}
