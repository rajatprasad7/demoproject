package com.trvel1.testcase;

import org.testng.annotations.Test;

import com.tarvel1.pageObject.Pratialpage;

public class Praticalclass  extends Baseclass{
@Test
	public  void pratice() {
	driver.get(url);
	Pratialpage o=new Pratialpage(driver);
	o.getpratical();
	o.getpratical1();
	o.getpratical2();
	o.getpratical3();
	o.getpratical4();
	o.getpratical5();
	o.getpratical6("Action");
	
	o.getremove();
		
	}
}
