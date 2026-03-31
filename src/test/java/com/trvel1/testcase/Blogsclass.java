package com.trvel1.testcase;

import org.testng.annotations.Test;

import com.tarvel1.pageObject.Blogs;

public class Blogsclass extends Baseclass{
	@Test
	public void JI() {
		driver.get(url);
		Blogs oo=new Blogs(driver);
		oo.ko();
		oo.komla1();
	}

}
