package Basic;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetwindowHandle {
public static void main(String[] args) {
	//open the Browser
			WebDriver driver=new ChromeDriver();
			//maximize the Browser
			driver.manage().window().maximize();
			//implicit wait
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			//enter into DWS page
			driver.navigate().to("https://demowebshop.tricentis.com/");
			System.out.println(driver.getWindowHandle());
}
}
