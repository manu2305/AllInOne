package RobotClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PressRegisterDWS {
public static void main(String[] args) throws AWTException, InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://demowebshop.tricentis.com/");
	Robot rbt = new Robot();
	rbt.keyPress(KeyEvent.VK_TAB);
	Thread.sleep(1000);
	rbt.keyPress(KeyEvent.VK_TAB);
	Thread.sleep(1000);
	rbt.keyPress(KeyEvent.VK_TAB);
	Thread.sleep(1000);
	rbt.keyPress(KeyEvent.VK_TAB);
	Thread.sleep(1000);
	rbt.keyPress(KeyEvent.VK_TAB);
	Thread.sleep(1000);
	rbt.keyPress(KeyEvent.VK_TAB);
	Thread.sleep(1000);
	rbt.keyPress(KeyEvent.VK_M);
	Thread.sleep(1000);
	rbt.keyPress(KeyEvent.VK_O);
	Thread.sleep(1000);
	rbt.keyPress(KeyEvent.VK_B);
	Thread.sleep(1000);
	rbt.keyPress(KeyEvent.VK_I);
	Thread.sleep(1000);
	rbt.keyPress(KeyEvent.VK_L);
	Thread.sleep(1000);
	rbt.keyPress(KeyEvent.VK_E);
	Thread.sleep(1000);
	rbt.keyPress(KeyEvent.VK_ENTER);
	rbt.keyRelease(KeyEvent.VK_TAB);
	rbt.keyRelease(KeyEvent.VK_ENTER);
	rbt.keyRelease(KeyEvent.VK_M);
	rbt.keyRelease(KeyEvent.VK_O);
	rbt.keyRelease(KeyEvent.VK_B);
	rbt.keyRelease(KeyEvent.VK_I);
	rbt.keyRelease(KeyEvent.VK_L);
	rbt.keyRelease(KeyEvent.VK_E);
}
}
