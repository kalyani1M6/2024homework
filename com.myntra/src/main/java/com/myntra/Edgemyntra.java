package com.myntra;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Edgemyntra {

	public static void main(String[] args) {
		//Edge
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.myntra.com/login?referer=https://www.myntra.com/");
		
		driver.close();

	}

}
