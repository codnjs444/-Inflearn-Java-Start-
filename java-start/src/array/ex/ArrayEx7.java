package array.ex;

import java.util.Scanner;

public class ArrayEx7 {

    public static void main(String[] args) {
        int [][] grade = new int[4][3];
        String [] subject = {"국어", "영어", "수학"};
        int [] result = new int[grade.length];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < grade.length; i++) {
            System.out.println(i+1 + "번 학생의 성적을 입력하세요.");
            for (int j = 0; j < subject.length; j++) {
                System.out.print(subject[j] + " 점수 :");
                grade [i][j] = scanner.nextInt();
                result[i] += grade[i][j];
            }
        }

        for (int i = 0; i < result.length; i++) {
            System.out.println(i+1 + "번 학생의 총 점 : " + result[i] + " ," + "평균 : " + result[i] / subject.length );
        }


    }
}
