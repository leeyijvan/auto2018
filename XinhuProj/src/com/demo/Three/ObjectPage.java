package com.demo.Three;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ObjectPage {
	WebDriver _driver = null;
	//��¼��ַ
	String url = "http://localhost:8032/xinhu/?m=login";
	//�����û���
	@FindBy(name="adminuser")
	public WebElement inputusername;
	//��������
	@FindBy(xpath="//input[@type='password']")
	public WebElement inputpassword;
	//�����¼
	@FindBy(tagName="button")
	public WebElement submitbut;
	//�������Ա
	@FindBy(id="indexuserl")
	public WebElement guanli;
	//����˳�
	@FindBy(xpath="//div[starts-with(@id,'rockmenuli')]/ul/li[6]")
	public WebElement quitbut;
	//���ȷ��
	@FindBy(id="confirm_btn1")
	public WebElement truebut;
	//��ʼ��
	public ObjectPage(WebDriver driver){
		this._driver = driver;
		PageFactory.initElements(driver, this);
	}
	//���������¼ҳ��
	public void open() throws InterruptedException{
		this._driver.get(url);
		Thread.sleep(2000);
	}
	//�ɹ���¼
	public void loginsuccessful(String uName,String pWord) throws InterruptedException{
		boolean flag = this._driver.getPageSource().contains("����Ա");
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
	//ʧ�ܵ�¼
	public void loginfail() throws InterruptedException{
		boolean flag = this._driver.getPageSource().contains("����Ա");
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
