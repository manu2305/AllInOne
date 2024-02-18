package SelectClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Day11SingleSelect {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.navigate().to("file:///C:/Users/QSP1/Downloads/demo.html");
	WebElement single_select = driver.findElement(By.id("standard_cars"));
	Select dropDown=new Select(single_select);
	Thread.sleep(2000);
	dropDown.selectByVisibleText("BMW");
	Thread.sleep(2000);
	dropDown.selectByValue("jgr");
	Thread.sleep(2000);
	dropDown.selectByIndex(7);
}
}
