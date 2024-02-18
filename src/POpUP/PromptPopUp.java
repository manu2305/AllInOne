package POpUP;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptPopUp {
public static void main(String[] args) {
	String name="Manikanda";
	WebDriver driver=new ChromeDriver();
	//maximize the Browser
	driver.manage().window().maximize();
	//implicit wait
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	//enter into DWS page
	driver.navigate().to("https://demo.automationtesting.in/Alerts.html");
	driver.findElement(By.xpath("(//a[@class='analystic'])[3]")).click();
	driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
	Alert art = driver.switchTo().alert();
	art.sendKeys(name);
	art.accept();
	WebElement text_displayed = driver.findElement(By.id("demo1"));
	String result = text_displayed.getText();
	if(result.contains(name)) {
		System.out.println("your script is successfull");
	}
	else 
		System.out.println("your script is unsuccessfull");
}
}
