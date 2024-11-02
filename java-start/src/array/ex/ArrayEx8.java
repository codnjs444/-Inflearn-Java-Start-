package array.ex;

import java.util.Scanner;

public class ArrayEx8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("입력하실 학생 수를 입력하세요.");
        int snum = scanner.nextInt();

        String [] subject = {"국어", "영어", "수학"};
        int [][] grade = new int[snum][subject.length];
        int [] result = new int[grade.length];

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
