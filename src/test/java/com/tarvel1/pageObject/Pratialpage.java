package com.tarvel1.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pratialpage {
	public WebDriver ldriver;
	public Pratialpage(WebDriver rdriver) {
		ldriver=rdriver;
    PageFactory.initElements(rdriver, this);
    
	
	}

@FindBy(xpath="//*[@id=\"menu-item-20\"]/a")  WebElement Pratcal;
@FindBy(xpath="//*[@id=\"loop-container\"]/div/article/div[2]/div[1]/div[1]/p/a")  WebElement testLoginPage;
@FindBy(xpath="//*[@id=\"menu-item-20\"]/a")  WebElement practice;
@FindBy(xpath="//*[@id=\"loop-container\"]/div/article/div[2]/div[2]/div[1]/p/a")  WebElement testExceptions;
@FindBy(xpath="//*[@id=\"edit_btn\"]")  WebElement edit;
@FindBy(xpath="//*[@id=\"add_btn\"]")  WebElement add;

@FindBy(xpath="//*[@id=\"row2\"]/input")  WebElement row2;
@FindBy(xpath="//*[@id=\"save_btn\"]")  WebElement save;

public void getpratical() {
	Pratcal.click();	
}
public void getpratical1() {
	testLoginPage.click();	
}
public void getpratical2() {
	practice.click();	
}
public void getpratical3() {
	testExceptions.click();	
}
public void getpratical4() {
	edit.click();	
}
public void getpratical5() {
	add.click();	
}
public void getpratical6(String name) {
	row2.sendKeys(name);
}
public void getpratical7() {
	save.click();	
}
}
