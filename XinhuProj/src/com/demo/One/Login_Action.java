package com.demo.One;

import com.webtest.core.WebDriverEngine;

public class Login_Action {
	
	WebDriverEngine webtest = null;
	public  Login_Action(WebDriverEngine webtest){
		this.webtest = webtest;
	}
	//封装登录
	public void loginxinhu() throws InterruptedException{		
		//打开信呼系统登录页面
		webtest.open("http://localhost:8032/xinhu/?m=login");
		//判断是否登录
		if(webtest.getHtmlSource().contains("管理员")){
			//点击管理员头像
			webtest.click("id=indexuserl");
			//点击退出
			webtest.click("xpath=//div[starts-with(@id,'rockmenuli')]/ul/li[6]");
			//点击确定
			webtest.click("id=confirm_btn1");
		}
		webtest.typeAndClear("name=adminuser", "admin");
		webtest.type("xpath=//input[@type='password']", "123456");
		webtest.click("tag=button");
		Thread.sleep(3000);	
		
	}
	//封装打开提醒信息页面
	public void openMs() throws InterruptedException{
		//点击个人中心
		webtest.click("id=menu_list_num39");
		//点击个人通讯录
		webtest.click("id=menu_list_num168");
		Thread.sleep(2000);
	}
	//打开操作中的提醒设置页面
	public void openTX() throws InterruptedException{
		//点击添加提醒设置按钮
		webtest.click("xpath=//div[starts-with(@id,'rockmenuli')]/ul/li[4]");
		Thread.sleep(1000);
		webtest.enterFrame("openinputiframe");
		//点击开始时间框
		webtest.click("name=startdt");	
	}
	//封装接收人代码
	public void openIn() throws InterruptedException{
		//点击添加提醒设置按钮
		webtest.click("xpath=//div[starts-with(@id,'rockmenuli')]/ul/li[4]");
		Thread.sleep(1000);
		webtest.enterFrame("openinputiframe");
		//点击选择按钮
		webtest.click("id=btnchange_recename");
	}
	//进入客户主页
	public void openKZ(){
		//点击客户
		webtest.click("xpath=//span[@pmenuid='63']");
		//点击客户主页
		webtest.click("id=menu_list_crmindex");
	}
	//进入工作日报下的日报授权查看页面
	public void openRC(){
		//点击工作日报
		webtest.click("id=menu_list_num76");
		//点击日报授权查看
		webtest.click("id=menu_list_num231");
	}
	//进入客户下的客户查看-所有销售机会页面，并打开新增页面
	public void openshowADD(){
		//点击客户
		webtest.click("xpath=//span[@pmenuid='63']");
		//点击客户查看
		webtest.click("id=menu_list_num126");
		//点击所有销售机会
		webtest.click("id=menu_list_num177");
		//点击新增
		webtest.click("xpath=//button[starts-with(@id,'addbtn')]");
		//进入子页面
		webtest.enterFrame("openinputiframe");

	}
}
