package Tasks;

public class secondHighest {
    public static void main(String[] args) {
        int [] numbers = {12, 45, 67, 23, 89, 45, 89};
        int highest = 0;
        int secHighest = 0;
        for(int num: numbers) {
            if(num > highest) {
                secHighest = highest;
                highest = num;
            } else if (num > secHighest && num != highest) {
                secHighest = num;
            }
        }
        System.out.println(secHighest);
    }
}
