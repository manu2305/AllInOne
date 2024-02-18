package JavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ClickDisableElement {
public static void main(String[] args) throws InterruptedException {
	ChromeOptions ch_options = new ChromeOptions();
	ch_options.addArguments("--disable-notifications");
	WebDriver driver=new ChromeDriver(ch_options);
	driver.manage().window().maximize();
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
	driver.get("https://www.oracle.com/in/java/technologies/javase/jdk11-archive-downloads.html");
	JavascriptExecutor js=(JavascriptExecutor) driver;
	WebElement intial_download = driver.findElement(By.linkText("jdk-11.0.19_windows-x64_bin.exe"));
	js.executeScript("arguments[0].scrollIntoView(false);",intial_download);
	intial_download.click();
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Download jdk-11.0.19_windows-x64_bin.exe")));
	WebElement disabled_button = driver.findElement(By.linkText("Download jdk-11.0.19_windows-x64_bin.exe"));
	js.executeScript("arguments[0].click();",disabled_button);
	Thread.sleep(2000);
}
}
