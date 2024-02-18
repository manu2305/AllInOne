package Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day6NavigateMethod {
public static void main(String[] args) throws InterruptedException {
	String given_url="https://www.flipkart.com/";
	//open the browser
	WebDriver driver=new ChromeDriver();
	//maximize the Browser
	driver.manage().window().maximize();
	//enter into the webpage 
	driver.navigate().to("https://www.flipkart.com/");
	//find the Current url
	String current_url =driver.getCurrentUrl();
	if(given_url.equals(current_url)) {
		System.out.println("successfull");
		Thread.sleep(2000);
		driver.navigate().refresh();
	}
	else {
		System.out.println("unsuccessfull");
		driver.close();
		}
	
	
}
}
