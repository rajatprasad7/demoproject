package com.test1.utilits;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadConfiguration{
	String path= "C:\\Users\\rajat\\eclipse-workspace\\travel\\configuration\\config.properties";
	Properties pro;
	
	public ReadConfiguration()  {
		FileInputStream fn = null;
		try {
			fn = new FileInputStream(path);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		pro=new Properties();
		try {
			pro.load(fn);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public String getUrl() {
		String  url=pro.getProperty("url");
		if(url!=null) {
		return url;
		}
		else {
			throw new  RuntimeException("url was nnot found ");
		}
	}
	public String getBrowser() {
		String bro=pro.getProperty("browser");
		if(bro!=null) {
			return bro;
			
		}
		else {
			throw new RuntimeException("url was nnot found ");	
		}
		
	}
}
