public class BinarySearch2D {
    public static void main(String[] args) {
        int[][] arr = {
            {10,20,30,40},
            {15,25,35,45},
            {28,29,37,49},
            {33,34,38,50}
        };
        int target = 37;
        int row = 0;
        int col = arr[1].length-1;

        while (row <= arr.length || col >=0 ){
            if (target == arr[row][col]){
                System.out.println("Elelment found at index ["+row+","+col+"]");
                break;
            }
            if (target < arr[row][col]){
                col--;
            }
            if (target > arr[row][col]){
                row++;
            }
        }
    }
    
}
