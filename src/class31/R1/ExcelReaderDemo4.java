package class31.R1;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.*;

public class ExcelReaderDemo4 {
    public static void main(String[] args) throws IOException {
            String path="Files/Pet.xlsx";
            FileInputStream fileInputStream=new FileInputStream(path);
            XSSFWorkbook xssfWorkbook=new XSSFWorkbook(fileInputStream);
            Sheet sheet1=xssfWorkbook.getSheet("Pet1");
            int noOfRows= sheet1.getPhysicalNumberOfRows();

            List<Map<String,String>> excelData=new ArrayList<>();
            for (int i = 1; i <noOfRows ; i++) {//we start from 1 bc we don't want to header part
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
