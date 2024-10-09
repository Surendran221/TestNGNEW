package org.sample;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Jobspojo extends BaseClass{
public Jobspojo() {
	PageFactory.initElements(driver, this);
}

@FindBy(xpath="(//a[text()='Jobs'])[2]")
private WebElement jobs;
@FindBy(xpath="//a[text()='Courses']")
private WebElement courses;
@FindBy(xpath="(//a[text()='Career advice'])[2]")
private WebElement career;
@FindBy(xpath="(//a[text()='Discount courses'])[2]")
private WebElement dis;
@FindBy(xpath="(//a[text()='Online courses'])[2]")
private WebElement online;
@FindBy(xpath="(//a[text()='On Demand courses'])[2]")
private WebElement demand;
@FindBy(xpath="(//a[text()='University courses'])[2]")
private WebElement uni;
@FindBy(css=("#searchIcon > svg"))
private WebElement search;
@FindBy(css=("#heartIcon > svg"))
private WebElement heart;
@FindBy(css=("#basketIcon > svg"))
private WebElement basket;
@FindBy(css=("#compareIcon > svg"))
private WebElement compare;
public WebElement getJobs() {
	return jobs;
}
public WebElement getCourses() {
	return courses;
}
public WebElement getCareer() {
	return career;
}
public WebElement getDis() {
	return dis;
}
public WebElement getOnline() {
	return online;
}
public WebElement getDemand() {
	return demand;
}
public WebElement getUni() {
	return uni;
}
public WebElement getSearch() {
	return search;
}
public WebElement getHeart() {
	return heart;
}
public WebElement getBasket() {
	return basket;
}
public WebElement getCompare() {
	return compare;
}




}
