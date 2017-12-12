package com.demo.One;

import static org.testng.Assert.assertTrue;
import org.testng.annotations.Test;
import com.webtest.core.BaseTest;

public class LoginTest extends BaseTest{	
	//进入首页单据异常监控页面
	@Test
	public void test50() throws InterruptedException{
		//登录系统
		Login_Action aa = new Login_Action(webtest);
		aa.loginxinhu();
		//点击单据异常监控
		webtest.click("xpath=//div[@id='kuailistdonw']/table/tbody/tr[4]/td[2]/a");
		assertTrue(webtest.getHtmlSource().contains("重新匹配流程"));
		
	}
	//进入个人中心-提醒信息页面
	@Test
	public void test2() throws InterruptedException{
		//登录信呼系统
		Login_Action aa = new Login_Action(webtest);
		aa.loginxinhu();
		//点击个人中心
		webtest.click("id=menu_list_num39");
		//点击提醒信息
		webtest.click("id=menu_list_todo");
		//断言
		assertTrue(webtest.getHtmlSource().contains("标为已读"));
	}
	
	//选择信息标记已读
	@Test(dependsOnMethods="test2")
	public void test3(){
		webtest.click("xpath=//tbody[starts-with(@id,'tbody')]/tr[1]/td[2]/input");
		webtest.click("xpath=//tbody[starts-with(@id,'tbody')]/tr[2]/td[2]/input");
		webtest.click("xpath=//div[starts-with(@id,'content_todo')]/div[1]/ul/li[1]/button");
		assertTrue(webtest.getHtmlSource().contains("处理成功"));
	}
	
	//未选中记录点击标为已读
	@Test(dependsOnMethods="test2")
	public void test4(){
		webtest.click("xpath=//div[starts-with(@id,'content_todo')]/div[1]/ul/li[1]/button");
		assertTrue(webtest.getHtmlSource().contains("没有选中行"));
	}
	//选择复选框点击删除
	@Test(dependsOnMethods="test2")
	public void test5() throws InterruptedException{
		//选择复选框
		webtest.click("xpath=//tbody[starts-with(@id,'tbody')]/tr[1]/td[2]/input");
		webtest.click("xpath=//tbody[starts-with(@id,'tbody')]/tr[2]/td[2]/input");
		//消除提醒框
		webtest.click("xpath=//*[@id='notify_show_systodo_td']/div[2]");
		//点击删除按钮
		webtest.click("xpath=//button[@click='del']");
		Thread.sleep(5000);
		//点击确定
		webtest.click("id=confirm_btn1");
		assertTrue(webtest.getHtmlSource().contains("删除成功"));		
	}
	
	//未选择复选框点击删除
	@Test(dependsOnMethods="test2")
	public void test6(){
		webtest.click("xpath=//*[@id='notify_show_systodo_td']/div[1]");
		webtest.click("xpath=//button[@click='del']");
		assertTrue(webtest.getHtmlSource().contains("没有选中记录"));
	}
	
}
