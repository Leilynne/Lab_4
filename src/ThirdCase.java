public class ThirdCase {
    public static void main(String[] args) {
        int[][] arr = new int[5][3];
        for (int i = 0; i < arr.length; i++){
            for (int x = 0; x < arr[i].length; x++){
                arr[i][x] = 2;
            }
        }
        for (int[] ints : arr) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }

    }
}


