package array;

public class EnhancedFor1 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        for (int i = 0; i < numbers.length; i++) {
            int number = numbers[i];
            System.out.println(number);
        }

        for (int number : numbers) {

        }

        //iter 단축키임
        // 오른 쪽 배열 길이 만큼 자동적으로 읽고 그 값들을 왼쪽의 변수에 넣음
        for (int number : numbers) {
            System.out.println(number);
        }

        //for-each를 사용할 수 없는 경우, 증가하는 index 필요
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("number" + i + "번 째 결과는" + numbers[i] + "임다");
        }
    }
}
