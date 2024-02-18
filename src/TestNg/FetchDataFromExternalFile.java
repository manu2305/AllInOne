package TestNg;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchDataFromExternalFile {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	File file=new File("D:\\Selenium\\loginFile.xlsx");
	FileInputStream fis=new FileInputStream(file);
	Workbook wbf = WorkbookFactory.create(fis);
	Sheet sheet = wbf.getSheet("Sheet1");
	String email1 = sheet.getRow(0).getCell(0).toString();
	String password1 = sheet.getRow(0).getCell(1).toString();
	System.out.println(email1);
	System.out.println(password1);
}
}
