package array.ex;

import java.util.Scanner;

public class ArrayEx3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("5개의 정수를 입력하세요 :");

        String[] text = new String[5];

        for (int i = 0; i < text.length; i++) {
            text[i] = scanner.nextLine();
        }


        System.out.println("출력");
        for (int i = text.length-1; i >= 0; i--) {
            if (i == 0){
                System.out.print(text[i]);
            } else {
                System.out.print(text[i] + ",");
            }
        }
    }
}
