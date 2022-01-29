package utils;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ExcelReading {
    //we stroing workbook book and sheet so we can able to use it everywhere
    static Workbook book;
    static Sheet sheet;

    public static void openExcel(String filePath) {
        try {
            FileInputStream file = new FileInputStream(filePath);
            book = new XSSFWorkbook(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //we use string sheet name so we can use different sheet when ever we have different sheet we can just send sheet name
    public static void getSheet(String sheetName) {
        sheet = book.getSheet(sheetName);
    }

    //getting all the rows and rows are integer format this why we are using intger
    public static int getRowCount() {
        //this funcction returns numbers of rows in particular sheet
        return sheet.getPhysicalNumberOfRows();
    }

    //this funcction will returns numbers of columns in particular sheet i have
    public static int getColsCount(int rowIndex) {
        return sheet.getRow(rowIndex).getPhysicalNumberOfCells();
    }
    //this function is read the data since i have data is store in string format like fastname i am using string it will depends on file

    public static String getCellData(int rowIndex, int colIndex) {
        //when we want to combine anything into string we use tostring method
        return sheet.getRow(rowIndex).getCell(colIndex).toString();
    }

    // this function returns listofmap key and value
    public static List<Map<String, String>> excelIntoListMap(String filePath, String sheetName) {

        //this function identify the exicel file
        openExcel(filePath);
        // function for sheet name
        getSheet(sheetName);

        //we are declearning this function because we need every sheet as map then add map as list
        List<Map<String, String>> ListData = new ArrayList<>();

        //outer loop

        // we put index = 1 because our index 0 is headder
        for (int row = 1; row < getRowCount(); row++) {

            // creating a map for every row
            //currently my key and value is in string format this why i am using string format
            // i am using linked has map to get eveything in seration order
            Map<String, String> map = new LinkedHashMap<>();

            //looping through the value of all cell
            //coloum is always start with 0 index
            for (int col = 0; col < getColsCount(row); col++) {
                //this function is getting key and value
                map.put(getCellData(0, col), getCellData(row, col));
            }
            // top nasted for loop only return one map and and if we have to return more then we have to do this other wise it will overwright it
            //this map will save first map
            ListData.add(map);
        }
        //when i add all the map  this function will return me all the list data
        return ListData;
        // All this function we use on our feature file
    }
}




