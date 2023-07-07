public class stringConcatenate {
    public static void main(String[] args) {
        String str = "Hello";

        System.out.println(str+10+20); // Hello1020
        System.out.println(str+'e');  // Helle
        System.out.println(str+10);  // hello10
        System.out.println(10+str);  // 10Hello
        System.out.println(10+20+str);  // 30Hello
        System.out.println(10+str+20);  //10Hello20
    }
}
