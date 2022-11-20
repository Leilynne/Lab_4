public class SeventhCase {
    public static void main(String[] args){
        int[][] arr = new int[10][10];
        int counter = 100;
        for (int i = 0; i < arr.length; i++) {
            for (int x = 0; x < arr[i].length - i; x++) {
                arr[i][x] = counter++;
            }
            for (int y = arr.length - 1; y > i; y--) {
                arr[y][arr[i].length - i - 1] = counter++;
            }
        }
        print(arr);
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
