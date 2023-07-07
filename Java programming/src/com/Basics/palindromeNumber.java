import java.util.Scanner;
public class palindromeNumber {
    public static void checkPalindrome(int num){
        int reverseNumber = 0;
        int originalNumber = num;
        while(num>0){
            int r = num % 10;
            reverseNumber = reverseNumber*10 +r;
            num = num / 10;
        }
        if (originalNumber==reverseNumber){
            System.out.println("Palindrome number.");
        }
        else{
            System.out.println("Not Palindrome number.");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        checkPalindrome(n);
        sc.close();
    }
}
