package TestNg;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class Parameyerization extends Utility {
	@Parameters({"url"})
	@Test
public void launchTheBrowser(String Url) {
	preCondition();
	driver.get(Url);
	System.out.println("first one");
	driver.close();
}
	@Parameters({"url"})
	@Test
public void launchTheBrowser1(String Url) {
	preCondition();
	driver.get(Url);
	System.out.println("second One");
	driver.close();
}
}
