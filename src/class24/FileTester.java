package class24;
public class FileTester {
    public static void main(String[] args) {
        File[] files={new JavaFile(150), new PdfFile(100), new WordFile(120)};
        for (int i = 0; i < files.length; i++) {
            File f=files[i];
            f.open();
            f.edit();
            f.close();


        }
    }
}
