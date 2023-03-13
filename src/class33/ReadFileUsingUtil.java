package class33;

import utils.ConfigReader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadFileUsingUtil {
    public static void main(String[] args) throws IOException {

        Properties properties= ConfigReader.read();
        System.out.println(properties.getProperty("user"));
        System.out.println(properties.getProperty("password"));


    }
}
