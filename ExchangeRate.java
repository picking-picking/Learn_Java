import java.util.Scanner;


public class ExchangeRate {
    public static void main(String[] args) {
        System.out.println("금액을 입력하세요");
        Scanner menu = new Scanner(System.in);
        String input = menu.nextLine();

        int sum = Integer.parseInt(input) * 1173;//2021년 9월 24일 기준 입니다
        System.out.println("입력하신 금액" + input  + "달러 => 한화로 약 " + sum + "원 입니다.");



    }
}
