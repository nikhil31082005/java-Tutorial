import java.util.Scanner;

public class leastCommonFactor {
    public static int lcm(int a,int b){
        int result = 1;
        int k = a>b?a:b;
        for(int i=k;;i++){
            if ((i%a==0) && (i%b==0)){
                result *= i;
                break;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result = lcm(a,b);
        System.out.println("The lcm of "+a+" and "+b+" is "+result);
        sc.close();
    }
}