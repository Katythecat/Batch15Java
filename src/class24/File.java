package class24;

public abstract class File {
    /*
    Create a class File that will have the following behaviors:
     open, edit, close. Edit and close are implemented method while open is an abstract.
      Create 3 subclasses: JavaFile, WordFile,
      PdfFile that will provide specific implementation of open behaviour:
       Example: to open .java file we need notepad++ or sublime text,
        to open .doc file we need Microsoft Word to be installed etc
     */
    int size;
    File(int size){
        this.size=size;
    }
    abstract void open();

    void edit(){
        System.out.println("File can edit");
    }
    void close(){
        System.out.println("File close");
    }
}
class JavaFile extends File{
    JavaFile(int size) {
        super(size);
    }

    void open(){
        System.out.println("Java open file");
    }
    @Override
    void edit() {
        System.out.println("JavaFile edit");
    }
    @Override
    void close() {
        System.out.println("Java file close");
    }
}
class WordFile extends File{
    WordFile(int size) {
        super(size);
    }

    void open(){
        System.out.println("WordFile open");
    }
    @Override
    void edit() {
        System.out.println("WordFile edit");
    }
    @Override
    void close() {
        System.out.println("WordFile close");
    }
}
class PdfFile extends File {
    PdfFile(int size) {
        super(size);
    }

    void open() {
        System.out.println("PdfFile open");
    }
    @Override
    void edit() {
        System.out.println("PdfFile edit");
    }
    @Override
    void close() {
        System.out.println("PdfFile close");
    }

    public static void main(String[] args) {
        File[] files={new JavaFile(100),new WordFile(120), new PdfFile(150)};
        for (File f:files) {
            f.open();
            f.edit();
            f.close();

        }

    }
}