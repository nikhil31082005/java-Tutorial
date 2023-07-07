import java.util.Scanner;
public class greatestCommonFactor {
    public static int gcd(int a,int b){
        int result = 1;
        for(int i=1;i<=a;i++){
            if ((a%i==0) && (b%i==0)){
                result *= i;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result = gcd(a,b);
        System.out.println("The gcd of "+a+" and "+b+" is "+result);
        sc.close();
    }
}
