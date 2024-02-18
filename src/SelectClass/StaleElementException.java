package SelectClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaleElementException {
public static void main(String[] args) throws InterruptedException {
	//open the Browser
	WebDriver driver=new ChromeDriver();
	//maximize the  browser
	driver.manage().window().maximize();
	//enter into DWS page
	driver.get("https://demowebshop.tricentis.com/");
	//click the digital download section
	driver.findElement(By.xpath("//a[contains(text(),'Digital downloads')]")).click();
	WebElement sort_by = driver.findElement(By.id("products-orderby"));
	Select s1 = new Select(sort_by);
    List<WebElement> options = s1.getOptions();
    int i=0;
    for (WebElement web : options) {
    	sort_by = driver.findElement(By.id("products-orderby"));
    	s1 = new Select(sort_by);
    	System.out.println(web.getText());
		s1.selectByIndex(i++);
		Thread.sleep(2000);
	}
	
}
}
