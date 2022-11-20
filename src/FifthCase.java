import java.util.Random;

public class FifthCase {
    public static void main(String[] args){
        int[][] arr = new int[5][3];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++){
            for (int x = 0; x < arr[i].length; x++){
                arr[i][x] = random.nextInt();
            }
        }
        for (int[] i : arr) {
            for (int x : i) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
       int[][] arr2 = new int[3][5];
        for (int i = 0; i < arr.length; i++) {
            for (int x = 0; x < arr[i].length; x++){
                arr2[x][i] = arr[i][x];
           }
        }
        System.out.println();
        for (int[] i : arr2) {
            for (int x : i) {
               System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}
