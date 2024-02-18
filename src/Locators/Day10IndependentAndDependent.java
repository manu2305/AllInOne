package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day10IndependentAndDependent {
public static void main(String[] args) {
	//open the browser
	WebDriver driver=new ChromeDriver();
	//maximize the Browser
	driver.manage().window().maximize();
	//enter into the Dws page
	driver.navigate().to("https://demowebshop.tricentis.com/digital-downloads");
	//find the element for music
	WebElement music = driver.findElement(By.xpath("(//a[text()='Music 2'])[1]/../../div[3]/div/span"));
	System.out.println(music.getText());
}
}
