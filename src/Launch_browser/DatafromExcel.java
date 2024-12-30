package Launch_browser;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DatafromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream f1=new FileInputStream("C:\\Users\\sanja\\eclipse-workspace\\Selenium_Basic_Programs\\TestDATA\\test.xlsx");
		Workbook wb= WorkbookFactory.create(f1);
		/*String username=   wb.getSheet("login").getRow(1).getCell(0).getStringCellValue();
		System.out.println(username);
		String password=   wb.getSheet("login").getRow(1).getCell(1).getStringCellValue();
		System.out.println(password);
		String username1=   wb.getSheet("login").getRow(2).getCell(0).getStringCellValue();
		System.out.println(username1);*/
		String password1=   wb.getSheet("login").getRow(2).getCell(1).getStringCellValue();
		System.out.println(password1);

	}

}
