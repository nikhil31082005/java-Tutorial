public class stringMethods {
    public static void main(String[] args) {
        String str = "Hello";
        String gtr = "Cello";

        // method 1 -> charAt(index)
        System.out.println(str.charAt(4));

        // method 2 -> length()
        System.out.println(str.length());

        // method 3 -> indexOf(character)
        System.out.println(str.indexOf('o'));

        // method 4 -> compareTo()
        System.out.println(str.compareTo(gtr));
        System.out.println(gtr.compareTo(str));

        // method 5 -> contains()
        System.out.println(str.contains("ell"));

        // method 6 -> startsWith(str)
        System.out.println(str.startsWith("Hel"));

        // method 7 -> endsWith(str)
        System.out.println(str.endsWith("jfkdg"));

        // method 8 -> toLowerCase()
        System.out.println(str.toLowerCase());

        // method 9 -> ToUpperCase()
        System.out.println(str.toUpperCase());

        // method 10 -> concat() only concatenate strings
        System.out.println(str.concat(gtr));
        System.out.println(str.concat("e"));

    }
}
