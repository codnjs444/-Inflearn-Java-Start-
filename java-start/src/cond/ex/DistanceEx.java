package cond.ex;

public class DistanceEx {
    public static void main(String[] args) {
        int distance = 5;

        switch (distance){
            case 1 -> System.out.println("도보를 이용하세요.");
            case 5 -> System.out.println("자전거를 이용하세요.");
            case 25 -> System.out.println("자동차를 이용하세요.");
            case 150 -> System.out.println("비행기를 이용하세요.");
        }
    }
}
