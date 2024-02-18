package Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyByTitle {
public static void main(String[] args) {
	String given_Title="Demo Web Shop";
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.navigate().to("https://demowebshop.tricentis.com/books");
	String current_Title = driver.getTitle();
	if(given_Title.contains(current_Title)) {
		System.out.println("you are successfully entered into the Book Page");
	}
	else
		System.out.println("entering into the Book page is unsuccessfull");
	
}
}
