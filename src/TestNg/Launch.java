package TestNg;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Launch {
@Test(priority = 0,invocationCount = 2,threadPoolSize = 3)
public void dws() {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://demowebshop.tricentis.com/");
	driver.close();
	System.out.println("iam from Syso");
	Reporter.log("hi hello to testNg",true);
}
@Test(priority = 1,enabled = true)
public void bata() {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://www.bata.com/");
	driver.close();
	System.out.println("iam from Syso");
	Reporter.log("hi hello to testNg",true);
}
@Test(priority = 2)
public void campus() {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://www.campusshoes.com/");
	driver.close();
	System.out.println("iam from Syso");
	Reporter.log("hi hello to testNg",true);
}

}
