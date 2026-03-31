package com.tarvel1.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Course {
	public WebDriver driver;
	public  WebDriver  ldriver;
	public Course(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	@FindBy(xpath="//*[@id=\"menu-item-21\"]/a")WebElement action;

@FindBy(xpath="//*[@id=\"loop-container\"]/div/article/div[2]/div[2]/div/a")   WebElement Udemy;
@FindBy(xpath="//*[@id=\"loop-container\"]/div/article/div[2]/div[4]/div/a")  WebElement Course;
@FindBy(xpath="//*[@id=\"loop-container\"]/div/article/div[2]/div[6]/div/a") WebElement en1;
@FindBy(xpath="//a[@href='https://practicetestautomation.com/python-for-testers'][normalize-space()='Enroll in this course on Udemy']")  WebElement en2;
@FindBy(xpath="//a[@href='https://practicetestautomation.com/advanced-course-coupon'][normalize-space()='Enroll in this course on Udemy']") WebElement en3;
@FindBy(xpath="//a[@href='https://practicetestautomation.com/xpath-course-coupon'][normalize-space()='Enroll in this course on Udemy']")  WebElement en4;
@FindBy(xpath="//a[@href='https://practicetestautomation.com/rest-assured-course-coupon'][normalize-space()='Enroll in this course on Udemy']") WebElement en5;
@FindBy(xpath="//a[@href='https://practicetestautomation.com/selenium-grid'][normalize-space()='Enroll in this course on Udemy']") WebElement en6;
@FindBy(xpath="//a[@href='https://practicetestautomation.com/selenium-webdriver-test-framework-from-scratch-referralCode'][normalize-space()='Enroll in this course on Udemy']")  WebElement en7;
	
	
	
	
	public void getCow() {
		action.click();
	}
	public void getCox1() {
		Udemy.click();
		System.out.println(Udemy.isDisplayed());
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	   
		ldriver.navigate().back();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	}
	public void getCox2() {
		Course.click();
		driver.navigate().back();
	}
	public void getCox3() {

        en1.click();
        driver.navigate().back();
	}
	public void getCox4() {
		en2.click();
		driver.navigate().back();
	}
	public void getCox5() {
		en3.click();
		driver.navigate().back();
	}
	public void getCox6() {
		en4.click();
		driver.navigate().back();
	}
	public void getCox7() {
		en5.click();
		driver.navigate().back();
	}
	public void getCox8() {
		en6.click();
		driver.navigate().back();
	}
	public void getCox9() {
		en7.click();
		driver.navigate().back();
	}

}