package com.demo.Three;

import static org.testng.Assert.assertTrue;
import org.testng.annotations.Test;
import com.demo.One.Login_Action;
import com.webtest.core.BaseTest;

public class MineKhTest extends BaseTest{
	//����ͻ���ģ���µ��ҵĿͻ�ҳ��
		@Test
		public void test38() throws InterruptedException{
			Login_Action aa = new Login_Action(webtest);
			aa.loginxinhu();
			Thread.sleep(3000);
			//����Ϸ��ͻ�
			webtest.click("xpath=//span[@pmenuid='63']");
			//������ͻ�
			webtest.click("id=menu_list_num64");
			//����ҵĿͻ�
			webtest.click("id=menu_list_num112");
			assertTrue(webtest.getHtmlSource().contains("�ҵĿͻ�"));
		}
		//�����ͣ�õĿͻ�
		@Test(dependsOnMethods="test38")
		public void test39(){
			//�����ͣ�ÿͻ�
			webtest.click("xpath=//button[@click='changatype,my_ting']");
			assertTrue(webtest.getHtmlSource().contains("����Ա"));
		}
		//����Ҵ���
		@Test(dependsOnMethods="test38")
		public void test40(){
			//����Ҵ���
			webtest.click("xpath=//button[@click='changatype,mycj']");
			assertTrue(webtest.getHtmlSource().contains("������"));
		}
		//�������ͳ�ƽ��
		@Test(dependsOnMethods="test38")
		public void test41(){
			//�������ͳ�ƽ��
			webtest.click("xpath=//button[@click='retotal']");
			assertTrue(webtest.getHtmlSource().contains("ͳ�����"));
		}
		//���ȫѡ
		@Test(dependsOnMethods="test38")
		public void test42(){
			//���ȫѡ
			webtest.click("xpath=//input[starts-with(@id,'seltablecheck')]");
		}
}
