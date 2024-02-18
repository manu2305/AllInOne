package DataProvider;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class FetchTheDataFromXlFile {
@Test
public void sample() throws EncryptedDocumentException, IOException {
	File file=new File("D:\\Selenium\\loginFile.xlsx");
	FileInputStream fis=new FileInputStream(file);
	Workbook wbf = WorkbookFactory.create(fis);
	Sheet sheet = wbf.getSheet("Sheet1");
	String email = sheet.getRow(0).getCell(0).toString();
	String password = sheet.getRow(0).getCell(1).toString();
	System.out.println(email);
	System.out.println(password);
}
}
