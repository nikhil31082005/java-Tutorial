public class gcd_lcd {
    public static void main(String[] args) {
        int a = 4;
        int b = 10;
        System.out.println(hcf(a,b));
        System.out.println(lcm(a,b));
    }
    static int hcf(int a,int b){
        if (a == 0){
            return b;
        }
        return hcf(b%a,a);
    }
    static int lcm(int a,int b){
        return a*b/hcf(a,b);
    }
}
