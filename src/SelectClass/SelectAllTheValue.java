package SelectClass;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectAllTheValue {
public static void main(String[] args) {
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
		List<WebElement> options = s.getOptions();
		int i=0;
		for (WebElement web : options) {
			//web.click();
			s.selectByIndex(i++);
		}
}
}
