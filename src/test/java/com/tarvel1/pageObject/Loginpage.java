package com.tarvel1.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	public WebDriver ldriver;
	public Loginpage(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);		
	}
	
	@FindBy(id="username") WebElement username;
	@FindBy(id="password") WebElement password;
	@FindBy(id="submit") WebElement submit;
    @FindBy(xpath="//*[@id=\"menu-item-43\"]/a") WebElement logout;
  
	
	public void getusername(String user) {
		username.sendKeys(user);
	}
	public void getPassword(String pass) {
		password.sendKeys(pass);
	}
	public void getsubmit() {
		submit.click();
	}
	public void getlogout() {
		logout.click();
	}


}
