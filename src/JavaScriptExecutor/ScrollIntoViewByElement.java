package JavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ScrollIntoViewByElement {
public static void main(String[] args) throws InterruptedException {
	ChromeOptions ch_options = new ChromeOptions();
	ch_options.addArguments("--disable-notifications");
	WebDriver driver=new ChromeDriver(ch_options);
	driver.manage().window().maximize();
	driver.get("https://www.redbus.in/");
	JavascriptExecutor js=(JavascriptExecutor) driver;
	Thread.sleep(2000);
	WebElement Book_train = driver.findElement(By.xpath("//a[@class='AboutUs__BookOption-w9osof-13 cNxDQy']"));
	js.executeScript("arguments[0].scrollIntoView(true);",Book_train);
}
}
