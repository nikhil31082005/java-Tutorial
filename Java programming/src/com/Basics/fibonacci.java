import java.util.Scanner;
public class fibonacci {
    public static void fibonacciSeries(int n){
        int a = 0;
        int b = 1;
        System.out.print(a+" ");
        System.out.print(b+" ");
        for(int i=1;i<=n-2;i++){
            int c = a+b;
            System.out.print(c+" ");
            a = b;
            b = c;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        fibonacciSeries(n);
        sc.close();
    }
}
