package TestNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParaExecute {
	@Parameters("Url")
	@Test
public void m1(String durl) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get(durl);
	driver.close();
}
}
