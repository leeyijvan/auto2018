package com.demo.Three;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ObjectPage {
	WebDriver _driver = null;
	//登录网址
	String url = "http://localhost:8032/xinhu/?m=login";
	//输入用户名
	@FindBy(name="adminuser")
	public WebElement inputusername;
	//输入密码
	@FindBy(xpath="//input[@type='password']")
	public WebElement inputpassword;
	//点击登录
	@FindBy(tagName="button")
	public WebElement submitbut;
	//点击管理员
	@FindBy(id="indexuserl")
	public WebElement guanli;
	//点击退出
	@FindBy(xpath="//div[starts-with(@id,'rockmenuli')]/ul/li[6]")
	public WebElement quitbut;
	//点击确定
	@FindBy(id="confirm_btn1")
	public WebElement truebut;
	//初始化
	public ObjectPage(WebDriver driver){
		this._driver = driver;
		PageFactory.initElements(driver, this);
	}
	//打开浏览器登录页面
	public void open() throws InterruptedException{
		this._driver.get(url);
		Thread.sleep(2000);
	}
	//成功登录
	public void loginsuccessful(String uName,String pWord) throws InterruptedException{
		boolean flag = this._driver.getPageSource().contains("管理员");
		if(flag){
			this.guanli.click();
			this.quitbut.click();
			this.truebut.click();
			Thread.sleep(3000);
		}
		this.inputusername.sendKeys(uName);
		this.inputpassword.sendKeys(pWord);
		this.submitbut.click();
	}
	//失败登录
	public void loginfail() throws InterruptedException{
		boolean flag = this._driver.getPageSource().contains("管理员");
		if(flag){
			this.guanli.click();
			this.quitbut.click();
			this.truebut.click();
			Thread.sleep(3000);
		}
		this.inputusername.clear();
		this.inputusername.sendKeys("adminn");
		this.inputpassword.sendKeys("123456");
		this.submitbut.click();
	}
}
