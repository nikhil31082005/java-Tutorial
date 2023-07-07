

public class ArrayPassingInFunction {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        for(int a : nums){
            System.out.print(a+" ");
        }
        System.out.println();
        change(nums);
        for(int a : nums){
            System.out.print(a+" ");
        }
    }
    static void change(int[] arr){
            arr[0] = 99;
        }
}
