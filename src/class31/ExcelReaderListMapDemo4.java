package class31;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ExcelReaderListMapDemo4 {
    public static void main(String[] args) throws IOException {

        FileInputStream fileInputStream = new FileInputStream("Files/Book1.xlsx");
        XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fileInputStream);
        Sheet sheet1 = xssfWorkbook.getSheet("Sheet1");

        //List<Map<String,String >> excelData=new ArrayList<>();
        var excelData=new ArrayList<>();
        for (int i = 1; i < sheet1.getPhysicalNumberOfRows(); i++) {
            Row row=sheet1.getRow(i);
            LinkedHashMap rowMap=new LinkedHashMap();
            rowMap.put("Name",row.getCell(0));
            rowMap.put("age",row.getCell(1));
            rowMap.put("City",row.getCell(2));
            rowMap.put("salary",row.getCell(3));
            excelData.add(rowMap);

        }
        System.out.println(excelData);

    }
}