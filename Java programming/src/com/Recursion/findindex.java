import java.util.ArrayList;
public class findindex {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,7,6,4,3};
        int target = 3;
        System.out.println(findAllindex(arr,target,0,new ArrayList<>()));
        System.out.println(findAllindex2(arr,target,0));
    }

    static ArrayList<Integer> findAllindex(int[] arr,int target,int index,ArrayList<Integer> list){
        if (index == arr.length){
            return list;
        }
        if (arr[index] == target){
            list.add(index);
        }
        return findAllindex(arr, target, index+1, list);
    }

    static ArrayList<Integer> findAllindex2(int[] arr,int target,int index){
        ArrayList<Integer> list = new ArrayList<>();
        if (index == arr.length){
            return list;
        }
        if (arr[index] == target){
            list.add(index);
        }
        ArrayList<Integer> frombelowcalls = findAllindex2(arr, target, index+1);
        list.addAll(frombelowcalls);
        return list;
    }
}
