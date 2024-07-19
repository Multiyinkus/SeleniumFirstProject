package exceloperations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;


public class ReadingExcel {

	public static void main(String[] args) throws FileNotFoundException {

		String excelFilePath = ".doubt\\Ade.xlsx";
		
		FileInputStream inputStream = new FileInputStream(excelFilePath);
		
		//XSSFWorkbook workbook = new XSSFWorkbook(inputStream);

	}

}
