package org.sample;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReedRegisterPojo extends BaseClass{
public ReedRegisterPojo() {
	PageFactory.initElements(driver, this);
}
@FindBy(xpath="//button[text()='I Accept']")
private WebElement acc;
@FindBy(xpath="//a[text()='Register']")
private WebElement register;
@FindBy(id="signup_email")
private WebElement reguser;
@FindBy(id="signup_password")
private WebElement regpass;
@FindBy(id="signup_button")
private WebElement regnew;
@FindBy(id="FirstName")
private WebElement frst;
@FindBy(id="LastName")
private WebElement last;
@FindBy(xpath="//input[@value='Create account']")
private WebElement create;
public WebElement getAcc() {
	return acc;
}
public WebElement getRegister() {
	return register;
}
public WebElement getReguser() {
	return reguser;
}
public WebElement getRegpass() {
	return regpass;
}
public WebElement getRegnew() {
	return regnew;
}
public WebElement getFrst() {
	return frst;
}
public WebElement getLast() {
	return last;
}
public WebElement getCreate() {
	return create;
}







}
