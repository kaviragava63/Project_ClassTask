package org.pagess;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.utility.BaseClass;

public class Source extends BaseClass  {
	
	public Source() {
		
		PageFactory.initElements(driver, this);
	}

	//xpath="//input[@type='submit']"

	@CacheLookup
    @FindBys({@FindBy(name="q")})
	private List <WebElement> txtproduct;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement btnsearch;

	public List<WebElement> getTxtproduct() {
		return txtproduct;
	}

	public WebElement getBtnsearch() {
		return btnsearch;
	}
	
	public void search(String txt) {
	
	

	
	}
	
	
}
