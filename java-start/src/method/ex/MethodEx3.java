package method.ex;

public class MethodEx3 {
    static int balance = 10000;

    public static void main(String[] args) {
        payMoney("deposit", 3000);
        payMoney("deposit", 7000);
        payMoney("withdraw", 3000);
        payMoney("deposit", 3000);
    }

    public static void payMoney(String type, int money) {
        if (type.equals("deposit")) {
            balance += money;
            System.out.println(money + "원을 입금하였습니다. 현재 잔액:" + balance);
        } else if (type.equals("withdraw")) {
            balance -= money;
            System.out.println(money + "원을 출금하였습니다. 현재 잔액:" + balance);
        }
    }

}
