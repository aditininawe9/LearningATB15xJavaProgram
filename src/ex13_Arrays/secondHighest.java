package ex13_Arrays;

//Find the 2nd Highest in Array(no in built function)
public class secondHighest {
    public static void main(String[] args) {
        int[] numbers = {12, 34, 10, 1, 100, 3, 4, 32};
        int[] sortNum = new int[8];
        int max = numbers[0];
        int sec = 0;
        for (int i = 0; i < numbers.length; i++){
            if(max < numbers[i]) {
                max = numbers[i];
            }
        }
        System.out.println(max);

        for (int i = 0; i < numbers.length; i++) {
            if (sec < numbers[i]){
                if(numbers[i] != max){
                    sec = numbers[i];
                }
            }
        }
        System.out.println(sec);
    }
}
