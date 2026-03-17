package com.tarvel1.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	public WebDriver ldriver;
	public Homepage(WebDriver rdriver) {
		ldriver=rdriver;
    PageFactory.initElements(rdriver, this);
    
	}
	
	@FindBy(xpath="//*[@id=\"menu-item-43\"]/a") WebElement Home;

//@FindBy(xpath="//a[normalize-space()=Home]") WebElement home;
	//Action hello hii
	
@FindBy(xpath="//input[@id='form_first_name_7']")  WebElement name;
@FindBy(xpath="//input[@id='form_email_7']") WebElement emailAddress;
@FindBy(xpath="//input[@value='Get XPath cheat sheet']")  WebElement getXPathCheatSheet;
	public void getome() {
		Home.click();
	}
public void getname1(String nam1 ) {
	name.sendKeys(nam1);
}
public void getname2(String nam2 ) {
	emailAddress.sendKeys(nam2);
}
public void getname3(String nam3 ) {
	getXPathCheatSheet.sendKeys(nam3);
}



	
	
}
