package ex10_Strings;

public class strings {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";

        String s3 = new String("Hello");
        String s4 = new String("Hello");

        // check string ref
        System.out.println(s1 == s2);
        System.out.println(s1 == s4);
        System.out.println(s3 == s4);

        // check string value
        System.out.println(s1.equals(s4));
        System.out.println(s3.equals(s4));

        //compareTo
        int result = "ABC".compareTo("ABC");
        int result2 = "abc".compareTo("ABC");
        int result3 = "a".compareTo("A");

        System.out.println(result);
        System.out.println(result2);

        int idx = "Java".indexOf("a"); //1
        System.out.println(idx);

        int idx2 = "Java".lastIndexOf("a");
        System.out.println(idx2);

        boolean b = "".isEmpty();
        System.out.println(b);

        String s11 = String.join("*","Java","Python");
        System.out.println(s11);

        String s12 = "Java".replace('a','o');
        System.out.println(s12);

        boolean b1 = "Java".startsWith("Ja");
        System.out.println(b1);

        CharSequence s = "Mayank";
        System.out.println(s);
        System.out.println(s.subSequence(1, 4)); //aya

        String t = "JAva".substring(2);
        System.out.println(t);

        char[] arr = "Java".toCharArray();
        System.out.println("==>"+arr);

        boolean ab = " ".isBlank();
        System.out.println(ab);

        String ij = "ij".repeat(3);
        System.out.println(ij);
    }

}
