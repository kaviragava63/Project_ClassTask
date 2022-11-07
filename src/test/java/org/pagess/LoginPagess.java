package org.pagess;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.PageFactory;
import org.utility.BaseClass;

public class LoginPagess extends BaseClass {
	
	
	
	
	public LoginPagess() {
		
		PageFactory.initElements(driver, this);
	
	}

	
	//with page factory
	
	
	
	
	@CacheLookup
    @FindBys({@FindBy(id="email"),@FindBy(xpath="//input[@id='email']")})
	private List <WebElement> txtusername;
	
	@FindAll({@FindBy(id="pass"),@FindBy(xpath="//input[@id='test']")})
	private WebElement txtpass;
	
	@FindBy(name="login")
	private WebElement btnlogin;

	
	//Getters
	
	public List <WebElement> getTxtusername() {
		return txtusername;
	}

	public WebElement getTxtpass() {
		return txtpass;
	}

	public WebElement getBtnlogin() {
		return btnlogin;
	}

	public void login(String user, String pass) {
		
		sendkeys(getTxtusername().get(0),user);
		
		sendkeys(getTxtpass(),pass);
		
		click(getBtnlogin());
	}
	
}
