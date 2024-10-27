package loop;

public class DoWhile1 {
    public static void main(String[] args) {
        int i = 1;

        // 최초 한 번만 실행함
        do{
            System.out.println("현재 숫자는 ; " + i);
            i++;
        } while (i<3);

    }
}
