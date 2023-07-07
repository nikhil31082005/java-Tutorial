public class bubblesort {
    public static void main(String[] args) {
        int[] arr = {2,3,1,5,4};
        int r = arr.length -1;
        bubble(arr,r,0);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }

    static void bubble(int[] arr,int r,int c){
        if (r==0){
            return;
        }
        if (c < r){
            if (arr[c] > arr[c+1]){
                int temp = arr[c];
                arr[c] = arr[c+1];
                arr[c+1] = temp;
            }
            bubble(arr,r,c+1);
        }
        else{
            bubble(arr,r-1,c);
        }
    }
}
