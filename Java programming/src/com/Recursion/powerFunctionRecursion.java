public class powerFunctionRecursion {
    public static void main(String[] args) {
        int a = 2;
        int b = 5;
        System.out.println(power(a,b));
    }
    static int power(int a,int b){
        // base condition : any number raised to the power 0  is 1.
        if (b == 0){
            return 1;
        }
        // recursive case : multipy base with power(base,exponential-1)
        return a*power(a,b-1);
    }
}
