package SelectClass;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IsMultiple {
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
		WebElement single_dropDown = driver.findElement(By.id("standard_cars"));
		Select s1 = new Select(single_dropDown);
		Select s2 = new Select(multi_dropDown);
		if(s1.isMultiple()) {
			System.out.println("you are performing in single Select");
			List<WebElement> opt1 = s1.getOptions();
			for (WebElement web : opt1) {
				web.click();
				Thread.sleep(1000);
			}
		}
		else {
			System.out.println("you are performing in a multi select");
			List<WebElement> opt2 = s2.getOptions();
			for (WebElement web : opt2) {
				web.click();
				Thread.sleep(1000);
			}
		}
		
}
}
