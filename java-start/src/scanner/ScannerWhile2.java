package scanner;

import java.util.Scanner;

public class ScannerWhile2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("첫 숫자와 둘 숫자 모두 0 일 시 프로그램 종료");
        while (true) {
            System.out.print("첫 수 입력");
            int num1 = scanner.nextInt();

            System.out.print("두 수 입력");
            int num2 = scanner.nextInt();

            if (num1 == 0 && num2 == 0) {
                System.out.println("프로그램 종료");
                break;
            }
        }
    }
}
