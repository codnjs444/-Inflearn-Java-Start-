package array;

public class ArrayDi4 {
    public static void main(String[] args) {
        int[][] arr = new int[3][3];

        int i = 1;
        for (int row = 0; row < arr.length; row++) {
            for (int coloum = 0; coloum < arr[row].length; coloum++) {
                arr[row][coloum] = i++;
            }
        }

        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++) {
                System.out.print(arr[row][column] + " ");
            }
            System.out.println();
        }
    }
}
