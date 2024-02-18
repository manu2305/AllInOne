package Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day6Assigment {
public static void main(String[] args) {
	String given_QspiderUrl="https://qspiders.com/";
	String given_AmazonUrl="https://www.amazon.in/";
	//open the Browser
	WebDriver driver=new ChromeDriver();
	//maximize the Browser
	driver.manage().window().maximize();
	//enter into Qspiders page
	driver.get("https://qspiders.com/");
	//get the current url of the Qspiders WebPage
	String current_Qspiderurl = driver.getCurrentUrl();
	//verify the Qspiders WebPage by Url
	if(given_QspiderUrl.equals(current_Qspiderurl)) {
		System.out.println("iam in qspiders");
		//enter into the Amazon WebPage 
		driver.navigate().to("https://www.amazon.in/");
		String current_AmazonUrl = driver.getCurrentUrl();
		if(given_AmazonUrl.equals(current_AmazonUrl)) {
			System.out.println("you are in a Amazon page");
			//enter into the Qspiders Page
			driver.navigate().back();
			String current_Qspiders_Url1 = driver.getCurrentUrl();
			if(given_QspiderUrl.equals(current_Qspiders_Url1)) {
				System.out.println("you are in qspiders page and\n you can process your further steps");
				driver.navigate().refresh();
				System.out.println("your test Script is Successfull");
			}
			else {
				System.out.println("you are not in qspiders verifycation 2 procedure");
			}
			
		}
		else {
			System.out.println("you are not in Amazon Page");
			driver.close();
			}
		
	}
	else {
		System.out.println("your test script is Unsuccessfull");
		driver.close();
	}
}
}
