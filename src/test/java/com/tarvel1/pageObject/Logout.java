package com.tarvel1.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout {
	public static WebDriver ldriver;
	public Logout( WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
		
	}
	
	
	
	
	  @FindBy(xpath="//*[@id=\"loop-container\"]/div/article/div[2]/div/div/div/a") WebElement logout;
	  public void logout() {
		  logout.click();
	  }

}
