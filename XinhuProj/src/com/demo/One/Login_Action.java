package com.demo.One;

import com.webtest.core.WebDriverEngine;

public class Login_Action {
	
	WebDriverEngine webtest = null;
	public  Login_Action(WebDriverEngine webtest){
		this.webtest = webtest;
	}
	//��װ��¼
	public void loginxinhu() throws InterruptedException{		
		//���ź�ϵͳ��¼ҳ��
		webtest.open("http://localhost:8032/xinhu/?m=login");
		//�ж��Ƿ��¼
		if(webtest.getHtmlSource().contains("����Ա")){
			//�������Աͷ��
			webtest.click("id=indexuserl");
			//����˳�
			webtest.click("xpath=//div[starts-with(@id,'rockmenuli')]/ul/li[6]");
			//���ȷ��
			webtest.click("id=confirm_btn1");
		}
		webtest.typeAndClear("name=adminuser", "admin");
		webtest.type("xpath=//input[@type='password']", "123456");
		webtest.click("tag=button");
		Thread.sleep(3000);	
		
	}
	//��װ��������Ϣҳ��
	public void openMs() throws InterruptedException{
		//�����������
		webtest.click("id=menu_list_num39");
		//�������ͨѶ¼
		webtest.click("id=menu_list_num168");
		Thread.sleep(2000);
	}
	//�򿪲����е���������ҳ��
	public void openTX() throws InterruptedException{
		//�������������ð�ť
		webtest.click("xpath=//div[starts-with(@id,'rockmenuli')]/ul/li[4]");
		Thread.sleep(1000);
		webtest.enterFrame("openinputiframe");
		//�����ʼʱ���
		webtest.click("name=startdt");	
	}
	//��װ�����˴���
	public void openIn() throws InterruptedException{
		//�������������ð�ť
		webtest.click("xpath=//div[starts-with(@id,'rockmenuli')]/ul/li[4]");
		Thread.sleep(1000);
		webtest.enterFrame("openinputiframe");
		//���ѡ��ť
		webtest.click("id=btnchange_recename");
	}
	//����ͻ���ҳ
	public void openKZ(){
		//����ͻ�
		webtest.click("xpath=//span[@pmenuid='63']");
		//����ͻ���ҳ
		webtest.click("id=menu_list_crmindex");
	}
	//���빤���ձ��µ��ձ���Ȩ�鿴ҳ��
	public void openRC(){
		//��������ձ�
		webtest.click("id=menu_list_num76");
		//����ձ���Ȩ�鿴
		webtest.click("id=menu_list_num231");
	}
	//����ͻ��µĿͻ��鿴-�������ۻ���ҳ�棬��������ҳ��
	public void openshowADD(){
		//����ͻ�
		webtest.click("xpath=//span[@pmenuid='63']");
		//����ͻ��鿴
		webtest.click("id=menu_list_num126");
		//����������ۻ���
		webtest.click("id=menu_list_num177");
		//�������
		webtest.click("xpath=//button[starts-with(@id,'addbtn')]");
		//������ҳ��
		webtest.enterFrame("openinputiframe");

	}
}
