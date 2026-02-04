package ex05_Type_Casting;

public class ternary {
    public static void main(String[] args) {
        int age = 21;
        String result = age > 18 ? (age>25 ? "you cannot drink" : "you can drink" ) : "you can go yo goa";
        System.out.println(result);

        int marks = 100;
        String result1 = (marks >=40) ?"Pass":"Fail";
        System.out.println(result1);

        int ageUser = 82;
        String ageResult = (ageUser < 18) ? "Minor" : (ageUser <= 60) ? "Adult" : "Sr. Citzen";

        System.out.println(ageResult);
        int n1 = 2;
        int n2 = 9;
        int n3 = -11;

        int max = (n1 > n2 && n1 > n3) ? n1 : (n2 > n1 && n2 > n3) ? n2 : n3;
        System.out.println(max);


    }
}
