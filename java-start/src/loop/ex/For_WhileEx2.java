package loop.ex;

public class For_WhileEx2 {
    public static void main(String[] args) {

        // while 사용하여 풀기
        int count1 = 1;
        int num1 = 1;

        while (count1 <= 10) {
            if(num1 % 2 == 0){
                System.out.println(num1);
                count1++;
            }
            num1++;
        }

        // for 사용하여 풀기
        int count = 1;
        for (int num = 1; count <= 10; num++) {
            if(num % 2 == 0){
                System.out.println(num);
                count++;
            }
        }
    }
}
