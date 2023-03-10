package class31.R1;


import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelReaderDemoK1 {
    public static void main(String[] args) throws IOException {
        String path="Files/Pet.xlsx";
        //fileInput for read the data
        //Navigating to the file
        FileInputStream fileInputStream=new FileInputStream(path);
        //why we don't SetProties here bc the file is different we read excel

        /*
        It's a class that know how to read and write data in Excel file
         */
        XSSFWorkbook xssfWorkbook=new XSSFWorkbook(fileInputStream);
        //from the excel file we need to get the sheet first using below mehtod
        Sheet sheet1=xssfWorkbook.getSheet("Pet1");//specific name of the sheet that you want to read
        /*
        as we are interested in the row1 we pass 1 inside the getRow method
        rows and columns are indexed based just like arrays
         */
        Row row=sheet1.getRow(1);//specific row you want to read
        Cell cell=row.getCell(2);//specific column you want to read

        /*
        All the numbers are treated as doubles in Excel
         */
        System.out.println(cell);//but when print we call cell  // 8.0








    }
}
