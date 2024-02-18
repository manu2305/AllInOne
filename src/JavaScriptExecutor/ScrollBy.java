package JavaScriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ScrollBy {
public static void main(String[] args) throws InterruptedException {
	ChromeOptions ch_options = new ChromeOptions();
	ch_options.addArguments("--disable-notifications");
	WebDriver driver=new ChromeDriver(ch_options);
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	JavascriptExecutor js=(JavascriptExecutor) driver;
	Thread.sleep(2000);
//	js.executeScript("window.scrollBy(0,1500);");
//	Thread.sleep(2000);
//	js.executeScript("window.scrollBy(0,-500);");
	js.executeScript("window.scrollTo(0,1500);");
	Thread.sleep(2000);
	js.executeScript("window.scrollTo(0,-500);");
}
}
