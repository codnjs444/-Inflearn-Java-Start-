package scope;

public class Scope1 {
    public static void main(String[] args) {
        int m = 10;
        if (true) {
            int x = 29;
            System.out.println("if m = " + m);
            System.out.println("if x = " + x);
        } // x 생존 종료
        System.out.println("main m = " + m);
//        System.out.println("main x = " + x);
    }
}
