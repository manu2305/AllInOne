package TestNg;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Basic.UtilityClass;

public class DataProvider extends Utility {
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

@org.testng.annotations.DataProvider(name = "test")
public Object[][] sender(){
	Object[][]obj=new Object[2][2];
	obj[0][0]="admin01@gmail.com";
	obj[0][1]="admin01";
	obj[1][0]="admin02@gmail.com";
	obj[1][1]="Admin02";
	return obj;
}
}
