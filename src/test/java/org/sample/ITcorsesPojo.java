package org.sample;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ITcorsesPojo extends BaseClass {
	public ITcorsesPojo() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="(//a[text()='IT courses'])[1]")
	private WebElement IT;
	@FindBy(xpath="(//a[@data-element='IT'])[1]")
	private WebElement ITsub;
	@FindBy(css=("#subNavDropdownMenus > div > ul > li:nth-child(3) > a"))
	private WebElement codes;
	@FindBy(css=("#subNavDropdownMenus > div > ul > li:nth-child(4) > a"))
	private WebElement devlopment;
	@FindBy(css=("#subNavDropdownMenus > div > ul > li:nth-child(20) > a"))
	private WebElement java;
	@FindBy(css=("#subNavDropdownMenus > div > ul > li:nth-child(14) > a"))
	private WebElement oracle;
	@FindBy(css=("#subNavDropdownMenus > div > ul > li:nth-child(15) > a"))
	private WebElement micro;
	@FindBy(css=("#subNavDropdownMenus > div > ul > li:nth-child(10) > a"))
	private WebElement  webdesign;
	@FindBy(css=("#subNavDropdownMenus > div > ul > li:nth-child(9) > a"))
	private WebElement techsupport;
	@FindBy(css=("#subNavDropdownMenus > div > ul > li:nth-child(8) > a"))
	private WebElement networking;
	public WebElement getIT() {
		return IT;
	}
	public WebElement getITsub() {
		return ITsub;
	}
	public WebElement getCodes() {
		return codes;
	}
	public WebElement getDevlopment() {
		return devlopment;
	}
	public WebElement getJava() {
		return java;
	}
	public WebElement getOracle() {
		return oracle;
	}
	public WebElement getMicro() {
		return micro;
	}
	public WebElement getWebdesign() {
		return webdesign;
	}
	public WebElement getTechsupport() {
		return techsupport;
	}
	public WebElement getNetworking() {
		return networking;
	}
}
