public class compressedString {
    public static void main(String[] args) {
        String str = "aaabbbbccdde";
        String ans = "" + str.charAt(0);
        int c = 1;
        for(int i=1;i<str.length();i++){
            char ch = str.charAt(i);
            char ch1 = str.charAt(i-1);
            
            if (ch == ch1){
                c += 1;
            }
            else{
                if (c>1) ans += c;
                c = 1;
                ans += ch;
            }
        }
        if (c > 1) ans += c;
        System.out.println(ans);
    }
}
