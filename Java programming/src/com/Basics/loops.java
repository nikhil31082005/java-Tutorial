import java.util.Scanner;
public class loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // for(int i=0;i<=n;i++){
        //     System.out.println(i);
        // }
        // while loop
        // int i=1;
        // while(i<n){
        //     System.out.println(i);
        //     i++;
        // }
        // do while loop
        int i=1;
        do{
            System.out.println(i);
            i++;
        }while(i<=n);
        sc.close();
    }
}
