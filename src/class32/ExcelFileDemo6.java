package class32;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class ExcelFileDemo6 {
    public static void main(String[] args) throws IOException {
        String path="Files/Book1.xlsx";
        FileInputStream fileInputStream=new FileInputStream(path);
        //this xssf we import form jar that we import and installl
       /*
       A class that we can use to read and writh the data easily from excel files
        */
        XSSFWorkbook xssfWorkbook=new XSSFWorkbook(fileInputStream);
        Sheet sheet2=xssfWorkbook.getSheet("Sheet2");

        int numOfRows=sheet2.getPhysicalNumberOfRows();
        System.out.println(numOfRows);
        for (int i = 0; i < numOfRows ; i++) {
            Row row=sheet2.getRow(i);
            int noOfCells=row.getPhysicalNumberOfCells();
            for (int j = 0; j <noOfCells ; j++) {
                Cell cell=row.getCell(j);
                System.out.print(cell+" \t ");
            }
            System.out.println();
        }
    }
}
