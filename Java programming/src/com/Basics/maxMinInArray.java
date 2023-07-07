import java.util.Scanner;

public class maxMinInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        int n = sc.nextInt();
        System.out.print("Enter the number of coloum : ");
        int m = sc.nextInt();
        int[][] matrix = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        int max = matrix[0][0];
        int min = matrix[0][0];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if (matrix[i][j] > max){
                    max = matrix[i][j];
                }
                if (matrix[i][j] < min){
                    min = matrix[i][j];
                }
            }
        }
        System.out.println("MAximum element in the array is "+max);
        System.out.println("Minimum element in the array is "+min);
        sc.close();
    }
}
