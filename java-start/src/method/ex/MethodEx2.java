package method.ex;

public class MethodEx2 {
    public static void main(String[] args) {
        alarm(3,"집갈까");
        alarm(6,"언제 갈까");
    }

    public static void alarm(int count, String message) {
        for (int i = 0; i < count; i++) {
            System.out.println(message);
        }
    }
}
