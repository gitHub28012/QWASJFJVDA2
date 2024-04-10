package DataDrivenFramework;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchingTheDataFromExcelFile {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		
		//create the object of FileInputStream class
		FileInputStream fis = new FileInputStream("./testData/testdata.xlsx");
		//open the workbook in a readable  mode
		Workbook book = WorkbookFactory.create(fis);
		//get the sheet
		Sheet sheet = book.getSheet("ValidData");
		//get the row
		Row row = sheet.getRow(1);
		//get the cell
		Cell cell = row.getCell(0);
		//convert into string
		String username = cell.getStringCellValue();
		System.out.println(username);	
		//get the password
		Cell password = row.getCell(1);
		System.out.println(password);
		
		
		

	}

}
