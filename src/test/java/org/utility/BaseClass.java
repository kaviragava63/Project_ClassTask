package org.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static  WebDriver driver;
	
	//All Browser Launch
	
	public static WebDriver browserLaunch(String browsername) {
		
		if(browsername.equalsIgnoreCase("chrome")) {
			
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		
        if(browsername.equalsIgnoreCase("firefox")) {
			
			WebDriverManager.chromedriver().setup();
			driver=new FirefoxDriver();
        }
        
        if(browsername.equalsIgnoreCase("edge")) {
			
			WebDriverManager.chromedriver().setup();
			driver=new EdgeDriver();
		
	}
		
	return driver;
	
	}
	
	
	public static WebDriver browserLaunch1(String browsername) {
		switch (browsername) {
		case"chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
			
		case "edge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;			
		}
		
		return driver;

	}
	

	// Chrome browser
	
	public static WebDriver chromeBrowser() {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		return driver;
		

	}
	
	//Firefox browser
	
	public static WebDriver firefoxBrowser() {
		
		WebDriverManager.chromedriver().setup();
		return driver = new FirefoxDriver();
	
	}
	
	//Edge browser
	
	public static WebDriver edgeBrowser() {
	
		WebDriverManager.chromedriver().setup();
		driver = new EdgeDriver();
		return driver;
		
	
  }
	
	//url
	
	public static void urlLaunch(String url) {
		driver.get(url);

	}
	
	
	//maximize
	
	public static void maximize() {
		driver.manage().window().maximize();

	}
	
	//time
	
	public static void implicitwait(long secs) {
		driver.manage().timeouts().implicitlyWait(secs, TimeUnit.SECONDS);

	}
	
	//send keys
	
	public static void sendkeys(WebElement e, String value ) {
		e.sendKeys(value);
		
	}
	
	//click
	
	public static void click(WebElement r) {
	 
		r.click();	
    }
	
	//quit
	
	public static void quit() {
		driver.quit();

	}
	
	//current url
	
	public static String currentUrl() {
		String url = driver.getCurrentUrl();
		return url;

	}
	
	//title
	
	public static String  title() {
		String title = driver.getTitle();
		return title;

	}
	
	//getAttribute
	
	public static String getAttribute(WebElement t) {
		String att = t.getAttribute("value");
		return att;
		
	}
	
	//gettext
	
	public static String getText(WebElement y) {
		String text = y.getText();
		return text;
	
	}
	
	//equal
	
	public static boolean equal() {
		boolean equals = driver.equals(driver);
		return equals;
	}
	
	//isdisplayed
	
	public static boolean isDisplayed(WebElement u) {
		boolean displayed = u.isDisplayed();
		return displayed;

	}
	
	//isenabled
	
	public static boolean isEnable(WebElement i) {
	    	boolean enabled = i.isEnabled();
			return enabled;

	}
	

	//isSelect
	
	public static boolean isSelect(WebElement o) {
		boolean select = o.isSelected();
		return select;
    		
	}
	
	//move to element
	
	public static void moveToElementl(WebElement target) {
	     Actions a = new Actions(driver);
	     a.moveToElement(target).perform();
	}
	
	//drag and drop
	
	public static void dragAndDrop(WebElement src, WebElement target) {
		Actions a = new Actions(driver);
        a.dragAndDrop(src, target).perform();
		
	}
	
	//contextclick
	
	public static  void contextClick(WebElement target ) {
		
		Actions a = new Actions(driver);

		a.contextClick(target).perform();
		
		
	}
	
	//dowbleclick
	
	public static void doubleClick(WebElement target ) {
		
		Actions a = new Actions(driver);
		
		a.doubleClick(target).perform();
		

	}
	
	
	
	//select by index
	
	public static void selectByIndex(WebElement e,int index) {
		Select a = new Select(e);
		a.selectByIndex(index);

	}
	
	//select by value
	
	public static void selectByValue(WebElement e, String value) {
		Select a = new Select(e);
		a.selectByValue(value);
	}

	//select by visible text
	
	public static void selecrByVisibleText(WebElement e, String value) {
		Select a = new Select(e);
		a.selectByVisibleText(value);
		
	}
	

	//isMultiple
	
	public static boolean isMultiple(WebElement e, String value) {
		
		Select a = new Select(e);
	
		boolean multiple = a.isMultiple();
		
		return multiple;
	}
	
	//navigate back
	
	public static  void back() {
	
		driver.navigate().back();

	}
	
	//navigate forward
	
		public static  void forward() {
		
			driver.navigate().forward();
	}
	

		//navigate refresh
		
			public static  void refresh() {
			
				driver.navigate().refresh();
			}
			
			
		public static String getExcel(String filename,String sheetname, int row,int c) throws IOException{
			
			File f = new File("C:\\Users\\ELCOT\\eclipse-workspace\\Maven-javamvn\\src\\test\\resources\\"+filename+".xlsx");
			
			FileInputStream fi = new FileInputStream(f);
			
			Workbook w = new XSSFWorkbook(fi);
			
			Sheet s = w.getSheet(sheetname);
			 
			Row r = s.getRow(row);
			
			Cell cell = r.getCell(c);
			
			//WebEment e=null;
			//e.sendkeys(value);
			
			int type = cell.getCellType();
			
			//type 1=====Name
			//type 0=====number,date
			
			String value=null;
			if (type==1) {
				 value = cell.getStringCellValue();
				
			}
			else {
				if(DateUtil.isCellDateFormatted(cell)){
					Date d = cell.getDateCellValue();
					SimpleDateFormat s1= new SimpleDateFormat("dd-mm-yyyy");
				    value = s1.format(d);
					
				}
				else {
					double d = cell.getNumericCellValue();
					long l = (long) d;
					 value = String.valueOf(2);
					
				
				}
			}
			return value;
			

		}		
			











}
	
	
