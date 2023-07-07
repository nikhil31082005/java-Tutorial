public class interningString {
    public static void main(String[] args) {
        String str = "Hello";
        String gtr = "Hello"; // str ang gtr have same id address
        String ptr = new String("Hello");  // str and ptr do not have same id address 
        System.out.println(str + " " + gtr + " " + ptr);
    }
}
