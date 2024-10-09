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

public class BrowserLaunch extends BaseClass {

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
		btnclick(r.getSign());
		fill(r.getUser(), getdata(1, 0));
		fill(r.getPass(), getdata(1, 1));
		btnclick(r.getButton());
		stawait(5000);
		SearchCoursesPojo s= new SearchCoursesPojo();
	    fill(s.getSearchbox(), "JAVA");
		btnclick(s.getGo());
		stawait(3000);
		WebElement java = driver.findElement(By.xpath("(//span[text()='£12'])[1]"));
		createdata(1, 4, "JAVA");
        createdata(1, 5, java.getText());
		System.out.println("successfully write in xl");
		
		

	}
	
	}
	
	
	
	
	 
	


