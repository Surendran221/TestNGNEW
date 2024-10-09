package org.sample;

import java.awt.AWTException;
import java.io.IOException;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;

public class face extends BaseClass {
	public static void main(String[] args) throws AWTException, InterruptedException, IOException {
		launchchrome();
		loadurl("https://www.facebook.com");
		winMax();
		LogPojo l = new LogPojo();
		WebElement txtuser = l.getTxtuser();
		String gdata = getdata(3, 0);
		fill(txtuser, gdata);
		WebElement txtpass2 = l.getTxtpass();
		String get1 = getdata(3, 2);
		fill(txtpass2, get1);
		WebElement btnlogin = l.getBtnlogin();
		btnclick(btnlogin);
		
		
}
}
