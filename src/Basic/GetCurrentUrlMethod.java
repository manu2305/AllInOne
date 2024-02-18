package Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentUrlMethod {
public static void main(String[] args) {
	String given_Url="https://qspiders.com/";
	//open the browser
	WebDriver driver=new ChromeDriver();
	//maximize my Browser
	driver.manage().window().maximize();
	//enter into the Qspiders WebSite
	driver.get("https://qspiders.com/");
	//fetch Current Url of Qspiders WebSites 
	String Current_url=driver.getCurrentUrl();
	//verifying the Given_Url and Current_url
	if(given_Url.equals(Current_url)) {
		System.out.println(" iam in Qspiders WebSite");
	}
	else {
		System.out.println("iam not in Qspiders WebSite");
		}
	//close the Browser
	driver.close();
	
}
}
