public class flipImage {
    public static void main(String[] args) {
        int[][] arr = {
            {1,1,0},
            {0,1,0},
            {1,1,1}
        };
        int[][] ans = flipandInvertImage(arr);
        for(int i=0;i<ans.length;i++){
            for(int j=0;j<ans[i].length;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    static int[][] flipandInvertImage(int[][] arr){
        for(int[] row : arr){
            for(int i=0;i<(arr[0].length+1)/2;i++){
                int temp = row[i] ^ 1;
                row[i] = row[arr[0].length-i-1] ^ 1;
                row[arr[0].length-i-1] = temp;
            }
        }
        return arr;
    }
}
