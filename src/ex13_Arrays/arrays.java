package ex13_Arrays;

public class arrays {
    public static void main(String[] args) {
        int[] marks = {3, 4, 6,7,8};
        int[] test = new int[3];
        for (int mark: marks){
            System.out.println(mark);
        }
        System.out.println("Test ===> "+test[0]);
    }
}
