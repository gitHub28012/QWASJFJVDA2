package DataDrivenFramework;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteDataIntoExcelFile {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		FileInputStream fis = new FileInputStream("./src/test/resources/IPL.xlsx");
		Workbook book = WorkbookFactory.create(fis);
		Sheet sheet = book.getSheet("IPL");
		Row row = sheet.getRow(1);
		//create the cell
		Cell cell = row.createCell(2);
		//pass the cell value
		cell.setCellValue("pass");
		//open the workbook in a writeable mode
		FileOutputStream fos = new FileOutputStream("./src/test/resources/IPL.xlsx");
		//write the data into excel file
		book.write(fos);
		System.out.println("data sent successfully");
		
		
		
		
	}
}
