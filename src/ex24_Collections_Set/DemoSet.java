package ex24_Collections_Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class DemoSet {
    public static void main(String[] args) {
        Set hs = new HashSet();
        hs.add("aditi");
        hs.add("aditi");
        hs.add("soni");
        hs.add("null");
        hs.add("null");

        System.out.println(hs);

        Set lHs = new LinkedHashSet();
        lHs.add("apple");
        lHs.add("apple");
        lHs.add("orange");
        lHs.add("null");

        System.out.println(lHs);
        System.out.println(lHs.isEmpty());
        System.out.println(lHs.contains("Apple"));

        Set ts = new TreeSet();
        ts.add("kiwi");
        ts.add("pineapple");
        ts.add("chikoo");
        ts.add("123");
//        ts.add(null);
        System.out.println(ts);
    }
}
