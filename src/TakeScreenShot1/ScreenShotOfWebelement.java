package TakeScreenShot1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShotOfWebelement {
public static void main(String[] args) throws IOException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://www.dream11.com/");
	WebElement icon=driver.findElement(By.xpath("//div[@class='left_top_logo_inner']"));
	File from = icon.getScreenshotAs(OutputType.FILE);
	File to = new File("C:\\Users\\QSP1\\Pictures\\Screenshots\\dreamIcon.png");
	FileHandler.copy(from, to);
}
}
