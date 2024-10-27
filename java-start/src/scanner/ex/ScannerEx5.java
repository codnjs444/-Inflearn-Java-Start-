package scanner.ex;

import java.util.Scanner;

public class ScannerEx5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("첫 수를 입력해주세요 :");
        int num = scanner.nextInt();

        System.out.print("두 수를 입력해주세요 :");
        int num2 = scanner.nextInt();

        if(num > num2){
            int temp = num2;
            num2 = num;
            num = temp;
        }

        System.out.println("두 숫자 사이의 모든 정수 : ");

        for (int i = num; i < num2 -1; i++) {
            System.out.print(i + 1);
        }
    }
}
