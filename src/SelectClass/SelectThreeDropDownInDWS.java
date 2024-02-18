package SelectClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectThreeDropDownInDWS {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://demowebshop.tricentis.com/digital-downloads");
	WebElement oderBy = driver.findElement(By.id("products-orderby"));
	Select s1 = new Select(oderBy);
	s1.selectByIndex(2);
	Thread.sleep(2000);
	WebElement display = driver.findElement(By.id("products-pagesize"));
	Select s2 = new Select(display);
	s2.selectByIndex(2);
	Thread.sleep(2000);
	WebElement view = driver.findElement(By.id("products-viewmode"));
	Select s3 = new Select(view);	
	s3.selectByIndex(1);
	
}
}
