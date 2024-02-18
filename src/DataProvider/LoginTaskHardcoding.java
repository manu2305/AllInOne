package DataProvider;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Basic.UtilityClass;

public class LoginTaskHardcoding extends UtilityClass {
@Test
public void login() {
	precondition();
	driver.get("https://demowebshop.tricentis.com/login");
	driver.findElement(By.id("Email")).sendKeys("admin01@gmail.com");
	driver.findElement(By.id("Password")).sendKeys("admin01");
	driver.findElement(By.xpath("//input[@value='Log in']")).click();
	postCondition1();
	
}
}
