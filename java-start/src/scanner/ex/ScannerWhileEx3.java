package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int count = 0;
        int input = 0;

        System.out.print("숫자를 입력하세요. (-1 입력 시 종료) :");

        while (true) {
            input = scanner.nextInt();

            if(input == -1){
                System.out.println("프로그램 종료");
                break;
            }

            sum += input;
            count ++;
        }
        double average = (double) sum / count;
        System.out.println("총 합 : " + sum);
        System.out.println("평균 : " + average);
    }
}
