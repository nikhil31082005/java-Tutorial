public class stringwithoutchar {
    public static void main(String[] args) {
        String s = "baccad";
        char ch = 'c';
        skip("",s,ch);
        System.out.println(skip1(s,ch));
        System.out.println(skipstring(s, "acc"));

    }
    static void skip(String p,String up,char ch){
        if (up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch1 = up.charAt(0);
        if (ch1==ch){
            skip(p,up.substring(1),ch);
        }
        else{
            skip(p+ch1,up.substring(1),ch);
        }
    }

    static String skip1(String up,char ch){
        if (up.isEmpty()){
            return "";
        }
        char ch1 = up.charAt(0);
        if (ch1==ch){
            return skip1(up.substring(1),ch);
        }
        else{
            return ch1+skip1(up.substring(1),ch);
        }
    }

    static String skipstring(String up,String st){
        if (up.isEmpty()){
            return "";
        }
        if (up.startsWith(st)){
            return skipstring(up.substring(st.length()),st);
        }
        else{
            return up.charAt(0)+skipstring(up.substring(1),st);
        }
    }
    
}
