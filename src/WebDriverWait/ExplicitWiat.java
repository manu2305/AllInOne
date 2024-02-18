package WebDriverWait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWiat {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	driver.get("https://www.shoppersstack.com/");
	//WebElement login = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='loginBtn']")));
	WebElement login = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='loginBtn']")));
	login.click();
}
}
