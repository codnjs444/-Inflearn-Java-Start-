package casting;

public class Casting2 {
    public static void main(String[] args) {
        double doubleValue = 1.8;
        int intValue = 0;

//        intValue = doubleValue;
        intValue = (int) doubleValue;
        System.out.println(intValue);

        System.out.println((int) 10.5);
    }
}
