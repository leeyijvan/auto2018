package com.demo.Three;

import static org.testng.Assert.assertTrue;
import org.testng.annotations.Test;

import com.demo.One.Login_Action;
import com.webtest.core.BaseTest;
import com.webtest.core.WebDriverEngine;

public class KhzhuyeTest extends BaseTest{
	
	//点击销售机会右侧更多
	@Test
	public void test34() throws InterruptedException{
		Login_Action aa = new Login_Action(webtest);
		aa.loginxinhu();
		Thread.sleep(3000);
		aa.openKZ();
		//点击销售机会右侧更多
		webtest.click("xpath=//a[@click='more,0']");
		assertTrue(webtest.getHtmlSource().contains("我所有销售机会"));
	}
	//点击代收款单右侧更多
	@Test
	public void test35() throws InterruptedException{
		Login_Action aa = new Login_Action(webtest);
		aa.loginxinhu();
		Thread.sleep(3000);
		aa.openKZ();
		//点击代收款单右侧更多
		webtest.click("xpath=//a[@click='more,2']");
		assertTrue(webtest.getHtmlSource().contains("未收款"));
	}
	//点击合同右侧更多
	@Test
	public void test36() throws InterruptedException{
		Login_Action aa = new Login_Action(webtest);
		aa.loginxinhu();
		Thread.sleep(3000);
		aa.openKZ();
		//点击合同右侧更多
		webtest.click("xpath=//a[@click='more,1']");
		assertTrue(webtest.getHtmlSource().contains("部分收/付款"));
	}
	//点击待付款单右侧更多
	@Test
	public void test37() throws InterruptedException{
		Login_Action aa = new Login_Action(webtest);
		aa.loginxinhu();
		Thread.sleep(3000);
		aa.openKZ();
		//点击待付款单右侧更多
		webtest.click("xpath=//a[@click='more,3']");
		assertTrue(webtest.getHtmlSource().contains("未付款"));
	}
	
	
	
}
