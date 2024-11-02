package array.ex;

import java.util.Scanner;

public class ArrayEx5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int count = 0;

        System.out.println("입력받을 숫자의 개수를 입력하세요. :");
        count = scanner.nextInt();
        int []num = new int[count];

        System.out.println(count + "개의 정수를 입력하세요 :");

        int sum = 0;

        for (int i : num) {
            num[i] = scanner.nextInt();
            sum += num[i];
        }

        System.out.println("입력한 정수의 합계 : " + sum);
        System.out.println("입력한 정수의 평균 : " + sum/ num.length);

    }
}
