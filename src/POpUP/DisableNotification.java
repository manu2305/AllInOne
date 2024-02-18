package POpUP;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DisableNotification {
public static void main(String[] args) {
	ChromeOptions ch_options=new ChromeOptions();
	ch_options.addArguments("--disable-notifications");
	ChromeDriver driver = new ChromeDriver(ch_options);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://www.redbus.com/");
}
}
