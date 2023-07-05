package chap_01;

public class _Quiz_01 {
    public static void main(String[] args) {
        // 버스 도착 정보 출력 프로그램
        // 각 정보는 적절한 자료형의 변수에 정의
        // 버스 번호는 "1234", "상암08"과 같은 형태
        // 남은 시간은 분 단위 (예: 3분, 5분)
        // 남은 거리는 km 단위 (예: 1.5km, 0.8km)
        String busNumber = "상암08";
        int remainMinutes = 3;
        double remainDistance = 1.5;

        System.out.println("상암08" + "버스");
        System.out.println("약 " + remainMinutes + "분 후 도착");
        System.out.println("남은 거리 " + remainDistance + "km");

    }


}
