public class printNumber {
    public static void main(String[] args) {
        int n = 5;
        // int a = 1;
        // print(n);
        print3(n);
    }
    static void print(int n){
        if (n==0){
            return;
        }
        System.out.println(n + " ");
        print(n-1);
    }
    static void print1(int a,int n){
        if (a==n+1){
            return;
        }
        System.out.println(a+ " ");
        print1(a+1,n);
    }
    static void print3(int n){
        if (n==0){
            return;
        }
        print(n-1);
        System.out.println(n + " ");
    }
}
