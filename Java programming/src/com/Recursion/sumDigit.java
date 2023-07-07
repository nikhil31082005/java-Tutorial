public class sumDigit {
    public static void main(String[] args) {
        int n = 54123;
        System.out.println(sum(n));
        System.out.println(product(n));
    }
    static int sum(int n){
        if (n <= 0){
            return 0;
        }
        return n%10 + sum(n/10);
    }
    static int product(int n){
        if (n <= 0){
            return 1;
        }
        return n%10 * product(n/10);
    }
    
}
