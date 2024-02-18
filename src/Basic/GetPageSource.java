package Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetPageSource {
public static void main(String[] args) {
	String given_url="https://www.amazon.in/";
	//open our Browser
	WebDriver driver=new ChromeDriver();
	//maximize the Browser
	driver.manage().window().maximize();
	//enter into the Amazon website
	driver.get("https://www.amazon.in/");
	String current_url = driver.getCurrentUrl();
	if(given_url.equals(current_url)) {
		System.out.println("you are in amazon page");
		System.out.println(driver.getPageSource());
		driver.close();
	}
	else
		System.out.println("you are not in amazon page");
	
}
}
