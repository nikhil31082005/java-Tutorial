import java.util.Scanner;
public class createString {
    public static void main(String[] args) {
        // method 1 -> direct method
        // String str = "Hello World";
        // System.out.println(str);

        // method 2 -> Input by user
        Scanner sc = new Scanner(System.in);
        // String str = sc.next();   // input string till white space
        String str = sc.nextLine();  // for entire input
        System.out.println(str);
        sc.close();
    }
}
