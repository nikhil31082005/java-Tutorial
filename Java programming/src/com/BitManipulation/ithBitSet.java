public class ithBitSet {
    public static void main(String[] args) {
        int n = 23;
        int i = 4;
        System.out.println(Integer.toBinaryString(n));

        int ans = n | (1 << i-1);
        System.out.println(Integer.toBinaryString(ans));
    }
}
