public class factorialRecursion {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(fact(n));

    }
    static int fact(int n){
        // Base condition : factorial of 0 is 1.
        if (n == 0){
            return 1;
        }
        // Recursive case : multiply n with factorial of (n-1)
        return n*fact(n-1);
    }
}
