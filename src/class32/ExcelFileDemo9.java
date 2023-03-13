package class32;

import utils.ExcelReader;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class ExcelFileDemo9 {
    public static void main(String[] args) throws IOException {


        List<Map<String,String>> excelData= ExcelReader.read();
        System.out.println(excelData); //we can get all data from just print like this



        //if we want to get the specific cell
        List<Map<String,String>> excelData1=ExcelReader.read();
        Map<String,String> firstRow=excelData1.get(0);
        System.out.println(firstRow.get("Name"));//Hamid
        Map<String,String> secondRow=excelData1.get(1);
        System.out.println(secondRow.get("Name"));//Sam
        // we use the method in Utils so the first row consider to the starting data
        // not the header
        Map<String,String> secondRow1=excelData1.get(1);
        System.out.println(secondRow1.get("salary"));//125000


        //use the loop to get the data in excel format
        for (Map<String,String> row:excelData){
            for (Map.Entry<String,String> entry:row.entrySet()){
                System.out.println(entry.getKey()+" "+entry.getValue());
            }
            System.out.println("**********");
        }
    }
}