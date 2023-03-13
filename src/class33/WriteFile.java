package class33;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WriteFile {
    public static void main(String[] args) throws IOException {
        FileOutputStream file=new FileOutputStream("Files/table.properties");
        Properties properties=new Properties();
        properties.setProperty("Monday","Java");
        properties.setProperty("Tuesday","Selenium");
        properties.setProperty("Wednesday","Git");
        properties.setProperty("Thrusday","Java");
        properties.setProperty("Friday","Java");

        properties.store(file,"New schedule has been added");
    }
}
