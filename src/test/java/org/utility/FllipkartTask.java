package org.utility;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.server.handler.SendKeys;
import org.pagess.LoginPagess;
import org.testng.annotations.Test;

public class FllipkartTask extends BaseClass  {
	
	@Test
	
	private void flipkartProducts() {
		
		browserLaunch("chrome");
		urlLaunch("https://www.flipkart.com/");
		maximize();
		implicitwait(10);
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		WebElement findElement = driver.findElement(By.name("q"));
		sendkeys(findElement, "iphone");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		////div[@class='_4rR01T'] ₹40,990
		
		
		List<WebElement> product = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
		WebElement n;
		for (int i=0;i<product.size();i++) {
			n = product.get(i);
			System.out.println(n.getText());
		}
		
		System.out.println("....price....");
		
		List<WebElement> price = driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));
		List<Integer> li = new LinkedList<>();
		String rp="";
		
		for (int j=0;j<price.size();j++) {
		     String tx = price.get(j).getText();
		     tx.contains("₹");
		     rp = tx.replace("₹", "");
		     //tx.contains(",");
		     //rp = tx.replace(",", "");
		     
		   
		     
		    
		     System.out.println(rp);
			    /*Integer min = Collections.min(li);
				Integer max = Collections.max(li);
				System.out.println(min);
				System.out.println(max);*/
		    
			}
		
	
		
		
		
		
		
	      /*  Collections.sort(li);
		    Integer min = Collections.min(li);
			Integer max = Collections.max(li);
			System.out.println(min);
			System.out.println(max);
			*/
			
			
			
			
			
			
		}
		
		

		 
		
	
	
		
		
		
	}
	
	
	


