package org.sample;

import java.awt.AWTException;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.Test;
import org.base.BaseClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class NxtGen extends BaseClass {
	@BeforeClass
	public void browserlau() throws AWTException {
		launchchrome();
		winMax();

	}
	@BeforeMethod
	public void ststtime() {
		loadurl("https://www.facebook.com");
        Date d= new Date();
        System.out.println("start time:"+d);
	}
	@AfterMethod
	public void endtime() {
		 Date d= new Date();
	        System.out.println("end time:"+d);
	}
	@Test
	public void tc1() {
		LogPojo l = new LogPojo();
		fill(l.getTxtuser(), "daniel");
		fill(l.getTxtpass(), "daniel2345");
		btnclick(l.getBtnlogin());
		dynwait(10, TimeUnit.SECONDS);
		System.out.println("success");

	}

}
