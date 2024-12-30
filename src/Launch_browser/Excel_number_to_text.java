package Launch_browser;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;

public class Excel_number_to_text {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		  
		FileInputStream f1=new FileInputStream("C:\\Users\\sanja\\eclipse-workspace\\Selenium_Basic_Programs\\TestDATA\\test.xlsx");
		Workbook wb= WorkbookFactory.create(f1);
		//String MobileNo=   wb.getSheet("login").getRow(1).getCell(2).getStringCellValue();
		String MobileNo=NumberToTextConverter.toText(wb.getSheet("login").getRow(1).getCell(2).getNumericCellValue());
		System.out.println(MobileNo);

	}

}
