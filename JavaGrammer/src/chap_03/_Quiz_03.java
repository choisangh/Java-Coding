package chap_03;

public class _Quiz_03 {
    public static void main(String[] args) {
        System.out.println(solution("901231-1234567"));

    }
    public static String solution(String id_code){
        String answer = id_code.substring(0,8);
        return answer;
    }
}
