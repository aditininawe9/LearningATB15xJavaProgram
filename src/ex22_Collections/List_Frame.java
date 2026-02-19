package ex22_Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class List_Frame {
    public static void main(String[] args) {
        List fruits = List.of("orange", "apple", "guava");
        System.out.println(fruits);

//        List list2 = new List();
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Aditi");
//        arrayList.add(9);
        arrayList.add("@");
        System.out.println(arrayList);

        List list = new ArrayList();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add(4);
        list.add("Adot");
        System.out.println(list.size());

        for (int i = 0; i < list.size(); i++) {
            System.out.println(i);
        }
        List<String> arrayList2 = new ArrayList<>(5);

        List marks = new ArrayList();
        marks.add(98);
        marks.add(94);
        marks.add(100);
        System.out.println(marks);
        Collections.sort(marks);
        System.out.println(marks);

    }
}
