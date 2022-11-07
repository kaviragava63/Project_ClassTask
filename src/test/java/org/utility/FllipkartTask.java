package org.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.server.handler.SendKeys;
import org.pagess.LoginPagess;
import org.testng.annotations.Test;

public class FllipkartTask extends BaseClass  {
	
	@Test
	
	private void browserLaunch() {
		
		browserLaunch("chrome");
		urlLaunch("https://www.flipkart.com/");
		maximize();
		implicitwait(10);
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		WebElement findElement = driver.findElement(By.name("q"));
		sendkeys(findElement, "iphone");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
		
		
		
		
		
		
		 
		
		
		
		
	}
	
	
	

}
