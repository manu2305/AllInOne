package POpUP;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FileUploadPopUp {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	//maximize the Browser
	driver.manage().window().maximize();
	//implicit wait
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	//enter into DWS page
	driver.navigate().to("https://www.naukri.com/registration/createAccount?othersrcp=22636");
	Actions act = new Actions(driver);
	act.keyDown(Keys.PAGE_DOWN).build().perform();
	driver.findElement(By.xpath("//input[@id='resumeUpload']")).sendKeys("C:\\Users\\QSP1\\Documents\\XpathNotesPdf.pdf");
}
}
