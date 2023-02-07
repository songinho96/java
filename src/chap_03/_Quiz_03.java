package chap_03;
// "901231-1234567" 인 경우 901231-1 까지 출력
// "030708-4567890" 인 경우 030708-4 까지 출력

public class _Quiz_03 {
    public static void main(String[] args) {
        String manNum = "901231-1234567"; // 주민등록번호 13자리
        String womanNum = "030708-4567890";

        System.out.println(manNum.substring(0,manNum.lastIndexOf("2"))); // 0 위치부터 9위치 직전까
        System.out.println(womanNum.substring(0,womanNum.lastIndexOf("5")));
    }
}
