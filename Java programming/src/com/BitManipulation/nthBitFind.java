public class nthBitFind {
    public static void main(String[] args) {
        int n = 15;
        int i = 3;
        System.out.println(Integer.toBinaryString(n));

        int ans = (n >> i-1) & 1;

        System.out.println(ans);
    }
}
