package org.sample;

import java.awt.AWTException;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.base.BaseClass;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SivaDetails extends BaseClass {
	@BeforeClass
	public static void browser() throws AWTException {
		launchchrome();
		winMax();

	}
	@Before
	public  void starttime() {
		loadurl("https://www.reed.co.uk/courses");
		Date  d = new Date();
		System.out.println("Start time:"+d);
	}
	@After
	public void Endtime() {
		Date d = new Date();
		System.out.println("End time:"+d);
	}
	@Test
	public void testCase() throws IOException, InterruptedException {
		ReedPojo r = new ReedPojo();
		dynwait(20, TimeUnit.SECONDS);
		btnclick(r.getAcc());
		SearchCoursesPojo s= new SearchCoursesPojo();
	    fill(s.getSearchbox(), "bank");
		btnclick(s.getGo());
		stawait(3000);
		WebElement java = driver.findElement(By.xpath("(//span[text()='£37.59'])[1]"));
		createdata(5, 5, java.getText());
		createdata(5, 6, "70%");
		System.out.println("successfully write in xl");
	}
}
