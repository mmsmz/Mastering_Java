package B33_WritingdataToFile;

public class Main {

    public static void main(String[] args) {
        CreateFile cf = new CreateFile();
        cf.openFile();
        cf.addRecords();
        cf.closeFile();


    }
}
