package org.sample;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogPojo  extends BaseClass{
	 public LogPojo() {
			PageFactory.initElements(driver, this);
		}
		   @FindBy(id="email")
		   private WebElement txtuser;
		   
		   @FindBy(id="pass")
		   private WebElement txtpass;
		   
		   @FindBy(name="login")
		   private WebElement btnlogin;

		public WebElement getTxtuser() {
			return txtuser;
		}
		public WebElement getTxtpass() {
			return txtpass;
		}

		public WebElement getBtnlogin() {
			return btnlogin;
		}

}
