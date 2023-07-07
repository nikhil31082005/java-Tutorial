public class substring {
    public static void main(String[] args) {
        String str = "Hello";

        // Method 1 -> substring(i,j)
        // System.out.println(str.substring(2,7));

        // Method 2 -> substring(i)
        // System.out.println(str.substring(5));

        // print all substring of given string
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<=str.length();j++){
                System.out.print(str.substring(i, j) + " ");
            }
        }
    }
}
