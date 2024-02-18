package SelectClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Deselect {
public static void main(String[] args) throws InterruptedException {
	//open the browser
	WebDriver driver=new ChromeDriver();
	//maximize 
	driver.manage().window().maximize();
	//enter into url
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.navigate().to("file:///C:/Users/QSP1/Downloads/demo.html");
	//find the drop down menu webelemnt
	WebElement multi_dropDown = driver.findElement(By.id("multiple_cars"));
	//object select class
	Select s = new Select(multi_dropDown);
	s.selectByIndex(1);
	Thread.sleep(1000);
	s.selectByValue("bmw");
	Thread.sleep(1000);
	s.selectByVisibleText("Ford");
	Thread.sleep(2000);
//	s.deselectByIndex(3);
//	Thread.sleep(1000);
//	s.deselectByValue("bmw");
//	Thread.sleep(1000);
//	s.deselectByVisibleText("Audi");
	s.deselectAll();
	
}
}
