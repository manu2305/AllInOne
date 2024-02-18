package TakeScreenShot1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TakeScreenShotWebPage {
public static void main(String[] args) throws IOException {
	LocalDateTime time = LocalDateTime.now();
	String updatetime = time.toString().replace(":", "-");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://www.dream11.com/");
	driver.get("https://demowebshop.tricentis.com/");
	TakesScreenshot ts=(TakesScreenshot) driver;
	File from = ts.getScreenshotAs(OutputType.FILE);
	File to = new File("C:\\Users\\QSP1\\Pictures\\Screenshots\\dream11"+updatetime+".png");
	FileHandler.copy(from, to);
	
}
}
