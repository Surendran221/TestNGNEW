package org.sample;

import java.awt.AWTException;
import java.io.IOException;
import java.util.Date;

import org.base.BaseClass;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class VinothDetails extends BaseClass {
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
		btnclick(r.getAcc());
		SearchCoursesPojo s= new SearchCoursesPojo();
	    fill(s.getSearchbox(), "Data Analyst");
		btnclick(s.getGo());
		stawait(3000);
		WebElement java = driver.findElement(By.xpath("(//span[text()='£297.60'])[1]"));
		createdata(3, 4, "Data Analyst");
        createdata(3, 6, java.getText());
		System.out.println("successfully write in xl");
	}
}
