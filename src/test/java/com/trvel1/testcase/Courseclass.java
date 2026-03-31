package com.trvel1.testcase;

import org.testng.annotations.Test;

import com.tarvel1.pageObject.Course;

public class Courseclass  extends Baseclass{
	@Test
	public void holo() {
		driver.get(url);
		Course w=new Course(driver);
		w.getCow();
		w.getCox1();
		w.getCox2();
		w.getCox3();
		w.getCox4();
		w.getCox5();
		w.getCox6();
		w.getCox7();
		w.getCox8();
		w.getCox9();
	
		
	}

}
