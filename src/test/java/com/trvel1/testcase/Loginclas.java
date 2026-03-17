package com.trvel1.testcase;


import org.testng.annotations.Test;

import com.tarvel1.pageObject.Loginpage;
import com.tarvel1.pageObject.Logout;

public class Loginclas extends  Baseclass{
	

	
	@Test
	public void login() {
		driver.get(url);
		Loginpage l=new Loginpage(driver);
		l.getusername("student");
		l.getPassword("Password123");
	    l.getsubmit();
	}
	
	@Test
	public void out() {
		Logout k=new Logout(driver);
		k.logout();
		
	}

}
 