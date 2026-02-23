package ex25_Maps;

import java.util.HashMap;
import java.util.Map;

public class Demo {
    public static void main(String[] args) {
        Map<String, Integer> aditi = new HashMap<>();
        aditi.put("A", 10);
        aditi.put("B", 20);
        aditi.put("a", 20);

        System.out.println(aditi);
        System.out.println(aditi.get("A"));
        System.out.println(aditi.size());

    }
}
