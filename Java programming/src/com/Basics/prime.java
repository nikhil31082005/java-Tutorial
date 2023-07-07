import java.util.Scanner;
public class prime {
    public static void isPrime(int n){
        int count = 0;
        for(int i=2;i<n/2;i++){
            if (n%i==0){
                count += 1;
            }
        }
        if (count == 0){
            System.out.println("Prime Number");
        }
        else{
            System.out.println("Not Prime Number.");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        isPrime(n);
        sc.close();
    }
}
