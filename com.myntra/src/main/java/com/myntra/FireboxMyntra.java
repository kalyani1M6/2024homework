package com.myntra;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class FireboxMyntra {

	public static void main(String[] args) {
		// Firefox
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.myntra.com/login?referer=https://www.myntra.com/");
		driver.close();
		
		

	}

}
