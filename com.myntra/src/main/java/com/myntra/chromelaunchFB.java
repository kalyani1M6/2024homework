 package com.myntra;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class chromelaunchFB {

	public static void main(String[] args) {
		// launchingChromedriver
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.myntra.com/login?referer=https://www.myntra.com/");
		driver.close();;

	}

}
