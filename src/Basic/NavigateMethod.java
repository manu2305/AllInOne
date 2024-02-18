package Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethod {
public static void main(String[] args) {
	String given_url="https://www.instagram.com/";
	//open our Browser
	WebDriver driver=new ChromeDriver();
	//maximize our browser
	driver.manage().window().maximize();
	//enter into instagram webSite
	driver.navigate().to("https://www.instagram.com/");
	String current_url = driver.getCurrentUrl();
	if(given_url.equals(current_url)) {
		System.out.println("you are in instagram");
	}
	else
		System.out.println("you are not in instagram");
	

}
}
