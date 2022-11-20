public class FourthCase {
    public static void main(String[] args){
        int[][] arr = new int[8][];
        for (int i = 0; i < arr.length; i++){
            arr[i] = new int[i+1];
            for (int x = 0; x <= i; x++){
                arr[i][x] = 2;
            }
        }
        for (int[] i : arr){
            for (int x : i){
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}
