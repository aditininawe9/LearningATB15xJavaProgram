package ex11_StringBuilder;

public class stringBuikder {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("Aditi");
        System.out.println(stringBuilder);

        stringBuilder.reverse();
        System.out.println(stringBuilder);

        StringBuilder sb = new StringBuilder("Adi");
        System.out.println(sb.toString());

    }
}
