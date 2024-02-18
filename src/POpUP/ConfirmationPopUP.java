package POpUP;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmationPopUP {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	//maximize the Browser
	driver.manage().window().maximize();
	//implicit wait
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	//enter into DWS page
	driver.navigate().to("https://demo.automationtesting.in/Alerts.html");
	driver.findElement(By.xpath("(//a[@class='analystic'])[2]")).click();
	driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
	Alert art = driver.switchTo().alert();
	System.out.println(art.getText());
	art.dismiss();
}
}
