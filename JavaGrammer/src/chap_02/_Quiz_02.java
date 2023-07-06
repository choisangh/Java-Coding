package chap_02;

public class _Quiz_02 {
    public static void main(String[] args) {
        System.out.println(check(121));
        System.out.println(check(100));



    }

    public static String check(int height) {
        String result = (height >= 120) ? ("키가 "+height+"cm 이므로 탑승 가능합니다."):("키가 "+height+"cm 이므로 탑승 불가능합니다.");
        return result;

    }
}
