package com.demo.One;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class RibaoTest extends BaseTest{
	//��������еĸ߼�����
		@Test
		public void test43() throws InterruptedException{
			//���÷����򿪹����ձ��е��ձ���Ȩ�鿴ҳ��
			Login_Action bb = new Login_Action(webtest);
			bb.loginxinhu();
			bb.openRC();
			//���������������б�
			webtest.click("xpath=//button[starts-with(@id,'downbtn')]");
			//����߼�����
			webtest.click("xpath=//li[@temp='0']");
//			assertTrue(webtest.getHtmlSource().contains(""));
		}
		//����߼��������������ձ������е��ܱ�
		@Test(dependsOnMethods="test43")
		public void test44(){
			//����ձ����͵���ܱ�
			webtest.selectByIndex("name=soufields_type", 2);
			//�������
			webtest.click("id=searchhigh_btn0");
			assertTrue(webtest.getHtmlSource().contains("�ܱ�"));
		}
}
