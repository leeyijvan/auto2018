package com.demo.Three;

import static org.testng.Assert.assertTrue;
import org.testng.annotations.Test;

import com.demo.One.Login_Action;
import com.webtest.core.BaseTest;
import com.webtest.core.WebDriverEngine;

public class KhzhuyeTest extends BaseTest{
	
	//������ۻ����Ҳ����
	@Test
	public void test34() throws InterruptedException{
		Login_Action aa = new Login_Action(webtest);
		aa.loginxinhu();
		Thread.sleep(3000);
		aa.openKZ();
		//������ۻ����Ҳ����
		webtest.click("xpath=//a[@click='more,0']");
		assertTrue(webtest.getHtmlSource().contains("���������ۻ���"));
	}
	//������տ�Ҳ����
	@Test
	public void test35() throws InterruptedException{
		Login_Action aa = new Login_Action(webtest);
		aa.loginxinhu();
		Thread.sleep(3000);
		aa.openKZ();
		//������տ�Ҳ����
		webtest.click("xpath=//a[@click='more,2']");
		assertTrue(webtest.getHtmlSource().contains("δ�տ�"));
	}
	//�����ͬ�Ҳ����
	@Test
	public void test36() throws InterruptedException{
		Login_Action aa = new Login_Action(webtest);
		aa.loginxinhu();
		Thread.sleep(3000);
		aa.openKZ();
		//�����ͬ�Ҳ����
		webtest.click("xpath=//a[@click='more,1']");
		assertTrue(webtest.getHtmlSource().contains("������/����"));
	}
	//���������Ҳ����
	@Test
	public void test37() throws InterruptedException{
		Login_Action aa = new Login_Action(webtest);
		aa.loginxinhu();
		Thread.sleep(3000);
		aa.openKZ();
		//���������Ҳ����
		webtest.click("xpath=//a[@click='more,3']");
		assertTrue(webtest.getHtmlSource().contains("δ����"));
	}
	
	
	
}
