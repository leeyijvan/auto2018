package com.demo.One;

import static org.testng.Assert.assertTrue;
import org.testng.annotations.Test;
import com.webtest.core.BaseTest;

public class LoginTest extends BaseTest{	
	//������ҳ�����쳣���ҳ��
	@Test
	public void test50() throws InterruptedException{
		//��¼ϵͳ
		Login_Action aa = new Login_Action(webtest);
		aa.loginxinhu();
		//��������쳣���
		webtest.click("xpath=//div[@id='kuailistdonw']/table/tbody/tr[4]/td[2]/a");
		assertTrue(webtest.getHtmlSource().contains("����ƥ������"));
		
	}
	//�����������-������Ϣҳ��
	@Test
	public void test2() throws InterruptedException{
		//��¼�ź�ϵͳ
		Login_Action aa = new Login_Action(webtest);
		aa.loginxinhu();
		//�����������
		webtest.click("id=menu_list_num39");
		//���������Ϣ
		webtest.click("id=menu_list_todo");
		//����
		assertTrue(webtest.getHtmlSource().contains("��Ϊ�Ѷ�"));
	}
	
	//ѡ����Ϣ����Ѷ�
	@Test(dependsOnMethods="test2")
	public void test3(){
		webtest.click("xpath=//tbody[starts-with(@id,'tbody')]/tr[1]/td[2]/input");
		webtest.click("xpath=//tbody[starts-with(@id,'tbody')]/tr[2]/td[2]/input");
		webtest.click("xpath=//div[starts-with(@id,'content_todo')]/div[1]/ul/li[1]/button");
		assertTrue(webtest.getHtmlSource().contains("����ɹ�"));
	}
	
	//δѡ�м�¼�����Ϊ�Ѷ�
	@Test(dependsOnMethods="test2")
	public void test4(){
		webtest.click("xpath=//div[starts-with(@id,'content_todo')]/div[1]/ul/li[1]/button");
		assertTrue(webtest.getHtmlSource().contains("û��ѡ����"));
	}
	//ѡ��ѡ����ɾ��
	@Test(dependsOnMethods="test2")
	public void test5() throws InterruptedException{
		//ѡ��ѡ��
		webtest.click("xpath=//tbody[starts-with(@id,'tbody')]/tr[1]/td[2]/input");
		webtest.click("xpath=//tbody[starts-with(@id,'tbody')]/tr[2]/td[2]/input");
		//�������ѿ�
		webtest.click("xpath=//*[@id='notify_show_systodo_td']/div[2]");
		//���ɾ����ť
		webtest.click("xpath=//button[@click='del']");
		Thread.sleep(5000);
		//���ȷ��
		webtest.click("id=confirm_btn1");
		assertTrue(webtest.getHtmlSource().contains("ɾ���ɹ�"));		
	}
	
	//δѡ��ѡ����ɾ��
	@Test(dependsOnMethods="test2")
	public void test6(){
		webtest.click("xpath=//*[@id='notify_show_systodo_td']/div[1]");
		webtest.click("xpath=//button[@click='del']");
		assertTrue(webtest.getHtmlSource().contains("û��ѡ�м�¼"));
	}
	
}
