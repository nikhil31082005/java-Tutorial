public class countZeros {
    public static void main(String[] args) {
        long n = 1000000005;
        long ans = 0;
        System.out.println(count(n, ans));

    }
    static long count(long n,long count){
        if (n <= 0){
            return count;
        }
        if (n % 10 == 0){
            count++;
        }
        return count(n/10,count);
    }
}
