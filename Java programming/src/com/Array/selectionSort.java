public class selectionSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        selection(arr);
        for(int num : arr){
            System.out.print(num + " ");
        }
    }

    static void selection(int[] arr){
        for(int i = 0 ; i < arr.length ; i++){
            int last = arr.length - i - 1;
            int maxIndex = getmaxindex(arr , 0 , last);
            swap(arr , maxIndex , last);

        }
    }

    static void swap(int[] arr , int maxIndex , int last){
        int temp = arr[maxIndex];
        arr[maxIndex] = arr[last];
        arr[last] = temp;
    }
    
    static int getmaxindex(int[] arr , int start , int end){
        int max = start;
        for(int i = start ; i <= end ; i++){
            if (arr[max] < arr[i]){
                max = i;
            }
        }
        return max;
    }
}
