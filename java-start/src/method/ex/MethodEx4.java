package method.ex;

import java.util.Scanner;

public class MethodEx4 {
    static int BALANCE = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("-------------------------------");
            System.out.println("1.입금 | 2.출금 | 3.잔액 확인 | 4.종료");
            System.out.println("선택: ");
            int menuNum = scanner.nextInt();
            int money = 0;


            if (menuNum == 1) {
                System.out.println("입금 금액을 입력하세요 :");
                money = scanner.nextInt();
                payMoney("deposit", money);
            } else if (menuNum == 2) {
                System.out.println("출금 금액을 입력하세요 :");
                money = scanner.nextInt();
                if(money > BALANCE){
                    System.out.println("잔액이 부족합니다.");
                } else {
                    payMoney("withdraw", money);
                }
            } else if (menuNum == 3) {
                System.out.println("현재 잔액 : " + BALANCE);
            } else if (menuNum == 4) {
                break;
            }

        }
    }

    public static void payMoney(String type, int money) {
        if (type.equals("deposit")) {
            BALANCE += money;
            System.out.println(money + "원을 입금하였습니다. 현재 잔액:" + BALANCE);
        } else if (type.equals("withdraw")) {
            BALANCE -= money;
            System.out.println(money + "원을 출금하였습니다. 현재 잔액:" + BALANCE);
        }
    }

}
