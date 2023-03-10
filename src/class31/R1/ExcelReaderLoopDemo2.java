package class31.R1;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelReaderLoopDemo2 {
    public static void main(String[] args) throws IOException {
        String path="Files/Pet.xlsx";
        FileInputStream fileInputStream=new FileInputStream(path);
        XSSFWorkbook xssfWorkbook=new XSSFWorkbook(fileInputStream);
        Sheet sheet1=xssfWorkbook.getSheet("Pet1");//specific name of the sheet that you want to read

        int noOfRows= sheet1.getPhysicalNumberOfRows();
        for (int i = 0; i <noOfRows ; i++) {// this loop will get all of the rows one by one
            Row row=sheet1.getRow(i);

            int NoOfCells=row.getPhysicalNumberOfCells();//Tells us how many cells contain the data
            for (int j = 0; j < NoOfCells; j++) {//to go througt the cell in each row
                Cell cell=row.getCell(j);
                System.out.print(cell+" ");
            }
            System.out.println();


        }



    }
}
