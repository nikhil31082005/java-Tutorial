public class linearSearch {
    public static void main(String[] args) {
        int[] arr = {2,4,5,4,5,7,8};
        int target = 5;
        System.out.println(search(arr,target,0));
        System.out.println(search1(arr,target,0));
        System.out.println(searchfromlast(arr,target,arr.length-1));
    }

    static boolean search(int[] arr,int target,int index){
        if (index == arr.length){
            return false;
        }
        return (arr[index] == target || search(arr,target,index +1));
    }

    static int search1(int[] arr,int target,int index){
        if (index == arr.length){
            return -1;
        }
        if (arr[index] == target){
            return index;
        }
        else{
            return search1(arr,target,index +1);
        }
    }

    static int searchfromlast(int[] arr,int target,int index){ // initially index is arr.length
        if (index == -1){
            return -1;
        }
        if (arr[index] == target){
            return index;
        }
        else{
            return searchfromlast(arr,target,index - 1);
        }
    }
}
