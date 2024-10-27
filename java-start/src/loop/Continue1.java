package loop;

public class Continue1 {
    public static void main(String[] args) {
        int i = 1;
         while(i <=5){
             if(i==3){
                 System.out.println("i 의 값이 : " + i + "입니다.");
                 i++;
                 continue;
             }
             System.out.println(i);
             i++;
         }
    }
}
