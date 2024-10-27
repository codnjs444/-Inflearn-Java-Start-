package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = 0;
        int sum = 0;

        while (true) {
            System.out.print("1 : 상품 입력 , 2 : 결제, 3: 프로그램 종료");
            input = scanner.nextInt();
            scanner.nextLine(); // 버퍼 비우기

            if (input == 1) {
                System.out.println("상품명을 입력하세요.");
                String name = scanner.nextLine();

                System.out.println("상품의 가격을 입력하세요.");
                int price = scanner.nextInt();

                System.out.println("구매 수량을 입력하세요.");
                int count = scanner.nextInt();
                scanner.nextLine(); // 버퍼 비우기

                int total = price * count;
                System.out.println("상품명 : " + name + ", 가격 : " + price + ", 수량 : " + count + ", 합계 : " + total);
                sum += total;

            } else if (input == 2) {
                System.out.println("총 비용 : " + sum);

            } else if (input == 3) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else {
                System.out.println("잘못된 입력입니다. 다시 입력하세요.");
            }
        }
        scanner.close();
    }
}
