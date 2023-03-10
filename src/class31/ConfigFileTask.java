package class31;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileTask {
    public static void main(String[] args) throws IOException {
        /*
        Path we want to create the new file and the name of the file whith its extension
         */
        String path="Files/tour.properties";
        /*
        We use FileOutputStream when we have to write the data to file
         */
        FileOutputStream fileOutputStream=new FileOutputStream(path);

        Properties properties=new Properties();
        /*
        We use the setProperty method to store data inside a properties files
         */
        properties.setProperty("Day 1","Seattle Downtown");
        /*
        Mathod to write the data to the disk
         */
        properties.store(fileOutputStream,"Day 1 has created");
    }
}
