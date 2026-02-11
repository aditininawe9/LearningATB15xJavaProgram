package ex13_Arrays;

public class max_min {
    public static void main(String[] args) {
        int[] num = {50, 10, 20, 40, 40};

        int max = num[0];
        for(int i = 0; i < num.length; i++) {
            if(num[i] > max){
                max = num[i];
            }
        }
        System.out.println(max);
    }
}
