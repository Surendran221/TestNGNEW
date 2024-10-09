package org.sample;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReedPojo extends BaseClass {
	
public ReedPojo() {
	PageFactory.initElements(driver, this);
}
@FindBy(xpath="//button[text()='I Accept']")
private WebElement acc;
@FindBy(id="headerSignIn")
private WebElement sign;
@FindBy(id="signin_email")
private WebElement user;
@FindBy(id="signin_password")
private WebElement pass;
@FindBy(id="signin_button")
private WebElement button;
public WebElement getAcc() {
	return acc;
}
public WebElement getSign() {
	return sign;
}
public WebElement getUser() {
	return user;
}
public WebElement getPass() {
	return pass;
}
public WebElement getButton() {
	return button;
}

}
