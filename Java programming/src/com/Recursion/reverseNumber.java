public class reverseNumber {
    public static void main(String[] args) {
        long n = 12345;
        System.out.println(reverse(n));
    }
    
    static long reverse(long n) {
        if (n < 10) {
            return n;
        }
        
        int lastDigit = (int)(n % 10);
        int digitCount = countDigit(n);
        long reverseNum = lastDigit * (long)Math.pow(10, digitCount - 1) + reverse(n / 10);
        return reverseNum;
    }
    
    static int countDigit(long n) {
        int count = (int)(Math.log10(n)) + 1;
        return count;
    }
}
