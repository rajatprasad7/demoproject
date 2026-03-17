package com.trvel1.testcase;

import org.testng.annotations.Test;

import com.tarvel1.pageObject.Homepage;

public class Homeclass extends Baseclass{
	@Test
	public void Home() {
		driver.get(url);
		

		Homepage A=new Homepage(driver);
		A.getome();
		A.getname1("Action");
		A.getname2("Actionnnn");
         A.getname3("Action.3");		
		
	}

}
