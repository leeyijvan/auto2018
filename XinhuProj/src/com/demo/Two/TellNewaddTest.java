package com.demo.Two;

import static org.testng.Assert.assertTrue;
import org.testng.annotations.Test;
import com.demo.One.Login_Action;
import com.webtest.core.BaseTest;
import com.webtest.core.ElementFinder;

public class TellNewaddTest extends BaseTest{
	
	ElementFinder finder = null;
	//进入个人通讯录-新增页面
	@Test
	public void test7() throws InterruptedException{
		//调用构造方法
		Login_Action ab = new Login_Action(webtest);
		//调用loginxinhu方法
		ab.loginxinhu();
		ab.openMs();
		//点击新增
		webtest.click("xpath=//button[@click='adds']");
		//进入子页面
		webtest.enterFrame("openinputiframe");
		assertTrue(webtest.getHtmlSource().contains("个人通讯录"));
	}
	//输入姓名、性别点击保存
	@Test
	public void test8() throws InterruptedException {
		boolean flag = webtest.getHtmlSource().contains("个人通讯录");
		if(flag){
			//输入姓名
			webtest.type("name=name", "张三");
			//选择性别
			webtest.selectByIndex("name=sex", 1);
			//点击保存
			webtest.click("id=AltS");
		}		
		webtest.leaveFrame();		
		assertTrue(webtest.getHtmlSource().contains("新增保存成功"));
	}
	//姓名框为空点击保存
	@Test(priority=6)
	public void test9(){
		boolean flag = webtest.getHtmlSource().contains("新增");
		if(flag){
			//点击新增
			webtest.click("xpath=//button[@click='adds']");
			webtest.enterFrame("openinputiframe");
			//选择性别
			webtest.selectByIndex("name=sex", 1);
			//点击保存
			webtest.click("id=AltS");
		}
		assertTrue(webtest.getHtmlSource().contains("姓名不能为空"));
	}
	//性别为空点击保存
	@Test(priority=7)
	public void test10(){
		boolean flag = webtest.getHtmlSource().contains("保存(S)");
		if(flag){
			//输入姓名
			webtest.type("name=name", "张三");
			//选择性别
			webtest.selectByIndex("name=sex", 0);
			//点击保存
			webtest.click("id=AltS");
		}
		assertTrue(webtest.getHtmlSource().contains("性别不能为空"));	
	}
	//点击新增页面关闭按钮回到主页面
	@Test(priority=8)
	public void test11(){
		boolean flag = webtest.getHtmlSource().contains("保存(S)");
		if(flag){
			webtest.leaveFrame();
			//点击关闭按钮
			webtest.click("id=winiframe_spancancel");
		}		
		assertTrue(webtest.getHtmlSource().contains(" 新增"));
	}
}