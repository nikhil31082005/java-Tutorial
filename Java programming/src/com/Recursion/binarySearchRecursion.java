public class binarySearchRecursion {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int target = 5;
        int start = 0;
        int end = arr.length - 1;
        int ans = search(arr,target,start,end);
        System.out.println(ans);

    }

    static int search(int[] arr,int target,int start, int end){
        if (start > end){
            return -1;
        }
        int mid = start + (end - start) / 2;
        if (arr[mid] == target){
            return mid;
        }
        if (arr[mid] > target){
            return search(arr,target,start,mid-1);
        }
        return search(arr,target,mid+1,end);
    }
}
