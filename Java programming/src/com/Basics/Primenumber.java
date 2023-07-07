public class Primenumber {
    public static void main(String[] args) {
        int n = 20;
        for (int i=1;i<=n;i++){
            System.out.println(i + " " + isprime(i));
        }
    }
    static boolean isprime(int n){
        if (n <= 1){
            return false;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }
}
