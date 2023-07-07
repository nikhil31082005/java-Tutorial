import java.util.Scanner;
public class armstrong {
    public static void checkArmstrong(int n){
        int sum = 0;
        int originalNumber = n;
        while(n>0){
            int r = n%10;
            sum = sum + (r*r*r);
            n = n/10;
        }
        if (originalNumber == sum){
            System.out.println("Armstrong Number.");
        }
        else{
            System.out.println("Not Armstrong Number.");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        checkArmstrong(n);
        sc.close();
    }
}
