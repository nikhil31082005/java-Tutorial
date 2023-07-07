public class reverseWord {
    public static void main(String[] args) {
        String str = "This is Agra";
        String ans = "";
        StringBuilder sb = new StringBuilder("");

        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if (ch != ' '){
                sb.append(ch);
            }
            else{
                sb.reverse();
                ans += sb;
                ans += " ";
                // sb.delete(0, sb.length());   // delete from first index to last
                sb = new StringBuilder("");   // reinitialise StringBuilder
            }
        }
        sb.reverse();
        ans += sb;
        System.out.println(ans);
    }
}
