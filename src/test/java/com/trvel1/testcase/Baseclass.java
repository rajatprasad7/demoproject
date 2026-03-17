package com.trvel1.testcase;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeSuite;

import com.test1.utilits.ReadConfiguration;

public class Baseclass {
	public static WebDriver driver;
	ReadConfiguration r=new ReadConfiguration();
	String browser=r.getBrowser();
	String url=r.getUrl();
	@BeforeSuite
	public void browser() {
		switch(browser.toLowerCase()) {
		case "chrome":
			driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 break;
		case "edge":
			driver=new EdgeDriver();
			 driver.manage().window().maximize();
			 break;
		case "Firefox":
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		break;
		
		
			
		}
		
	}
	public void Screenshot() throws IOException {
		TakesScreenshot tc=( TakesScreenshot) driver;
		File f1=tc.getScreenshotAs(OutputType.FILE);
		File f2=new File(System.getProperty("user.dir") + "/Screenshot/j.png");
		FileUtils.copyFile(f1, f2);
		
	}
	

}
