package com.tarvel1.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Blogs {

	public WebDriver ldriver;
	public Blogs(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	@FindBy(xpath="//*[@id=\"menu-item-19\"]/a") WebElement Action;
	@FindBy(xpath="//*[@id=\"loop-container\"]/div[10]/article/div[2]/div/a") WebElement komla;
	public void ko() {
		Action.click();
	}
	public void komla1() {
		komla.click();
	}
	
	
}
