package array;

public class Array1Ref2 {
    public static void main(String[] args) {

        int[] students;
        students = new int[5];

        System.out.println(students);
        System.out.println(students.length);

        // 변수 값 대입
        students[0] = 90;
        students[1] = 80;
        students[2] = 70;
        students[3] = 60;
        students[4] = 50;
        // 오류
//        students[5] = 50;

        for (int i = 0; i < students.length; i++) {
            System.out.println("학생" + (i+1) + "점수" + students[i]);
        }

    }
}
