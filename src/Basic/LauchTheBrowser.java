package Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LauchTheBrowser {
public static void main(String[] args) {
	//open The Browser
	WebDriver driver=new ChromeDriver();
	//maximize the browser
	driver.manage().window().maximize();
	//enter into Youtube WebSite
	driver.get("https://www.youtube.com/");
	//close the browser
	driver.close();

}
}
