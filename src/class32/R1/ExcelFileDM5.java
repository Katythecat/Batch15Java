package class32.R1;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelFileDM5 {
    public static void main(String[] args) throws IOException {
        String path = "Files/Book1.xlsx";
        FileInputStream fileInputStream = new FileInputStream(path);
        XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fileInputStream);
        //xss coming from those jar that we has imported

        Sheet sheet2 = xssfWorkbook.getSheet("Sheet2");

       /* for (int i = 0; i < sheet2.getPhysicalNumberOfRows(); i++) {
            Row row = sheet2.getRow(i);//get all the rows one by one
            System.out.println(row.getCell(0) + " " + row.getCell(1));
            // you will see all the data even we don't use nested loop

        }*/


        for (int i = 0; i < sheet2.getPhysicalNumberOfRows(); i++) {
            Row row = sheet2.getRow(i);//get all the rows one by one
            for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
                /*Cell cell= row.getCell(j);
                System.out.print(cell+" ");*/
                System.out.print(row.getCell(j)+" ");
            }
            System.out.println();
        }
    }
}