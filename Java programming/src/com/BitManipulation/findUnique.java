public class findUnique {
    public static void main(String[] args) {
        // only valid  for only any element occuring twice in array
        int[] arr = {1,2,3,4,3,2,1}; 
        int unique = 0;
        for(int num : arr){
            unique ^= num;
        }
        System.out.println(unique);
    }
}
