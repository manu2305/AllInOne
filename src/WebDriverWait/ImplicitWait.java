package WebDriverWait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {
public static void main(String[] args) {
	//open the browser
	WebDriver driver =new ChromeDriver();
	//maximize the browser
	driver.manage().window().maximize();
	//enter into shopperStack
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://www.shoppersstack.com/");
	//locate the login Element
	WebElement login = driver.findElement(By.id("loginBtn"));
	if(login.isDisplayed()) {
		System.out.println("login button is displayed");
		login.click();
	}
	else {
		System.out.println("login button is not displayed");
		driver.close();
	}
	
}
}
