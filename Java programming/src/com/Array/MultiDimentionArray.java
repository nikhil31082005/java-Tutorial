
import java.util.Scanner;;
public class MultiDimentionArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 2D array is the array of arrays
        // 2D array declaration

        // int[][] nums = {
        //     {1, 2, 3},
        //     {4, 5, 6},
        //     {7, 8, 9}
        // };

        int [][] arr = new int[3][3]; // number of rows is mandatory but numbr of columns is optional

        //  input

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j] = sc.nextInt();
            }
        }

        // for(int i=0;i<arr.length;i++){
        //     for(int j=0;j<arr[i].length;j++){
        //         System.out.print(arr[i][j]+" ");
        //     }
        //     System.out.println();
        // }

        sc.close();
    }
}
