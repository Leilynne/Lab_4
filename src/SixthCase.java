import java.util.Random;

public class SixthCase {
    public static void main(String[] args){
        Random random = new Random();
        int[][] arr = new int[8][5];
        int[][] arr2 = new int[7][4];

        int column = random.nextInt(arr[0].length);
        int row = random.nextInt(arr.length);

        for (int i = 0; i < arr.length; i++){
            for (int x = 0; x < arr[i].length; x++){
                arr[i][x] = (i + 1) * 10 + x + 1;
            }
        }
        print(arr);

        for (int i = 0; i < arr2.length; i++){
            for (int x = 0; x < arr2[i].length; x++){
                if (x < column && i < row){
                    arr2[i][x] = arr[i][x];
                } else if (i >= row && x >= column) {
                    arr2[i][x] = arr[i+1][x+1];;
                } else if (i >= row){
                    arr2[i][x] = arr[i+1][x];
                } else {
                    arr2[i][x] = arr[i][x+1];
                }
            }
        }
        System.out.println();

        print(arr2);
    }

    private static void print(int[][] arr) {
        for (int[] i : arr) {
            for (int x : i) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}
