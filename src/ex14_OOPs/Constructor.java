package ex14_OOPs;

public class Constructor {
    public static void main(String[] args) {
        Animal dog = new Animal();
        MySQL a = new MySQL();
        ReadExcelFile r = new ReadExcelFile();
    }

}

//class Animal {
//
//}
//
class MySQL {
    MySQL() {
        System.out.println("Sql Connectee");
    }
}

class ReadExcelFile {
    ReadExcelFile() {
        System.out.println("Excel file loaded");
    }
}