package array.ex;

import java.util.Scanner;

public class ProductAdminEx {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maxProducts = 10;
        int productCount = 0;
        String[] productNames = new String[maxProducts]; // 배열 크기 수정
        int[] productPrices = new int[maxProducts]; // 배열 크기 수정

        while (true) {
            System.out.println("1. 상품 등록 | 2. 상품 목록 | 3. 종료");
            System.out.print("메뉴를 선택하세요: ");
            int menuNum = scanner.nextInt();
            scanner.nextLine(); // 입력 버퍼 비우기

            if (menuNum == 1) {
                if (productCount >= maxProducts) {
                    System.out.println("더 이상 상품을 등록할 수 없습니다.");
                    continue;
                }

                System.out.println("상품 이름을 입력하세요:");
                productNames[productCount] = scanner.nextLine();
                System.out.println("상품 가격을 입력하세요:");
                productPrices[productCount] = scanner.nextInt();
                scanner.nextLine(); // 입력 버퍼 비우기

                productCount++;
                System.out.println("상품이 등록되었습니다.");
            } else if (menuNum == 2) {
                if (productCount == 0) {
                    System.out.println("현재 등록된 상품이 없습니다.");
                } else {
                    System.out.println("상품 목록:");
                    for (int i = 0; i < productCount; i++) { // 조건 수정
                        System.out.println(productNames[i] + ": " + productPrices[i]);
                    }
                }
            } else if (menuNum == 3) {
                System.out.println("프로그램이 종료됩니다.");
                break;
            } else {
                System.out.println("잘못된 입력입니다. 다시 시도하세요.");
            }
        }
    }
}
