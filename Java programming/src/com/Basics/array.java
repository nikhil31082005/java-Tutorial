import java.util.Scanner;
public class array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int marks[] = new int[n];
        for(int i=0;i<n;i++){
            marks[i]  = sc.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.print(marks[i]+" ");
        }
        sc.close();
    }
}
