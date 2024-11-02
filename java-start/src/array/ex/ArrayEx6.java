package array.ex;

import java.util.Scanner;

public class ArrayEx6 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("입력받을 숫자의 개수를 입력하세요. :");

        int count = scanner.nextInt();

        int[] num = new int[count];

        System.out.println(count + "개의 정수를 입력하세요 :");

        for (int i = 0; i < num.length; i++) {
            num[i] = scanner.nextInt();
        }

        int max = num[0];
        int min = num[0];

        for (int j : num) {
            if (j > max) {
                max = j;
            }
            if (j < min) {
                min = j;
            }
        }

        System.out.println("가장 큰 정수 : " + max);
        System.out.println("가장 작은 정수 : " + min);
    }
}
