package TestNg;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class DataProviderCombineWithDataDriven extends Utility {
	@org.testng.annotations.DataProvider(name = "test")
	public Object[][] sender() throws EncryptedDocumentException, IOException{
		Object[][]obj=new Object[2][2];
		File file=new File("D:\\Selenium\\loginFile.xlsx");
		FileInputStream fis=new FileInputStream(file);
		Workbook wbf = WorkbookFactory.create(fis);
		Sheet sheet = wbf.getSheet("Sheet1");
		for (int i = 0; i < obj.length; i++) {
			for (int j = 0; j < obj.length; j++) {
				obj[i][j]=sheet.getRow(i).getCell(j).toString();
			}
		}
		return obj;
	}
	@Test(dataProvider = "test")
	public void reciever(String email,String password) {
		//preCondition();
		preCondition1();
		driver.get("https://demowebshop.tricentis.com/login");
		driver.findElement(By.id("Email")).sendKeys(email);
		driver.findElement(By.id("Password")).sendKeys(password);
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		postCondition();
	}
}
