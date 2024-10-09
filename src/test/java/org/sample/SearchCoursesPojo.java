package org.sample;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchCoursesPojo extends BaseClass {

	public SearchCoursesPojo() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="mainKeywordInput")
	private WebElement searchbox;
	@FindBy(xpath="//span[text()='Search courses']")
	private WebElement go;
	@FindBy(xpath="//a[text()='Subjects']")
	private WebElement subjects;
	@FindBy(xpath="(//a[@data-element='Business'])[1]")
	private WebElement buss;
	@FindBy(xpath="(//a[text()='All subjects'])[1]")
	private WebElement goback;
	@FindBy(xpath="(//a[@data-subject-id='134'])[1]")
	private WebElement daatanal;
	@FindBy(xpath="(//span[text()='Add to basket'])[1]")
	private WebElement addto;
	public WebElement getSearchbox() {
		return searchbox;
	}
	public WebElement getGo() {
		return go;
	}
	public WebElement getSubjects() {
		return subjects;
	}
	public WebElement getBuss() {
		return buss;
	}
	public WebElement getGoback() {
		return goback;
	}
	public WebElement getDaatanal() {
		return daatanal;
	}
	public WebElement getAddto() {
		return addto;
	}
	
	
	
	
	
}
