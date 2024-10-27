package loop.ex;

public class For_WhileEx3 {
    public static void main(String[] args) {
        int max = 100;

        // while 사용 버전
        System.out.println("-----while-----");

        int sum1 = 0;
        int i = 0;

        while (i <= max) {
            sum1 += i;
            i++;
        }
        System.out.println("총 합은 : "  + sum1 + " 입니다.");

        // for 사용 버전
        System.out.println("-----for-----");

        int sum2 = 0;
        for (int j = 0; j <= max; j++) {
            sum2 += j;
        }

        System.out.println("총 합은 : "  + sum2 + " 입니다.");
    }
}
