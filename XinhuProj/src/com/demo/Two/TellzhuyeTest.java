package com.demo.Two;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;
import org.testng.annotations.Test;
import com.demo.One.Login_Action;
import com.webtest.core.BaseTest;

public class TellzhuyeTest extends BaseTest{
	//���������������
		@Test
		public void test12() throws InterruptedException{
			Login_Action bb = new Login_Action(webtest);
			bb.loginxinhu();
			bb.openMs();
			//�������磺����������
			webtest.type("xpath=//input[@placeholder='����']", "���");
			//�������
			webtest.click("xpath=//button[@click='search']");
			assertTrue(webtest.getHtmlSource().contains("121212�ɹ��ɹ���"));
		}
		//δ������Ϣ�������
		@Test
		public void test13() throws InterruptedException{
			Login_Action bb = new Login_Action(webtest);
			bb.loginxinhu();
			bb.openMs();
			//�������
			webtest.click("xpath=//button[@click='search']");
			assertFalse(webtest.getHtmlSource().contains("����� ������"));
		}
		//����ͨѶ��¼
		@Test
		public void test14() throws InterruptedException{
			Login_Action bb = new Login_Action(webtest);
			bb.loginxinhu();
			bb.openMs();
			//���������ť
			webtest.click("xpath=//button[@click='daochu']");
			assertTrue(webtest.getHtmlSource().contains("����ɹ�"));
		}
}
