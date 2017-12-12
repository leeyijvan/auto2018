package com.demo.Two;

import static org.testng.Assert.assertTrue;
import org.testng.annotations.Test;
import com.demo.One.Login_Action;
import com.webtest.core.BaseTest;
import com.webtest.core.ElementFinder;

public class TellNewaddTest extends BaseTest{
	
	ElementFinder finder = null;
	//�������ͨѶ¼-����ҳ��
	@Test
	public void test7() throws InterruptedException{
		//���ù��췽��
		Login_Action ab = new Login_Action(webtest);
		//����loginxinhu����
		ab.loginxinhu();
		ab.openMs();
		//�������
		webtest.click("xpath=//button[@click='adds']");
		//������ҳ��
		webtest.enterFrame("openinputiframe");
		assertTrue(webtest.getHtmlSource().contains("����ͨѶ¼"));
	}
	//�����������Ա�������
	@Test
	public void test8() throws InterruptedException {
		boolean flag = webtest.getHtmlSource().contains("����ͨѶ¼");
		if(flag){
			//��������
			webtest.type("name=name", "����");
			//ѡ���Ա�
			webtest.selectByIndex("name=sex", 1);
			//�������
			webtest.click("id=AltS");
		}		
		webtest.leaveFrame();		
		assertTrue(webtest.getHtmlSource().contains("��������ɹ�"));
	}
	//������Ϊ�յ������
	@Test(priority=6)
	public void test9(){
		boolean flag = webtest.getHtmlSource().contains("����");
		if(flag){
			//�������
			webtest.click("xpath=//button[@click='adds']");
			webtest.enterFrame("openinputiframe");
			//ѡ���Ա�
			webtest.selectByIndex("name=sex", 1);
			//�������
			webtest.click("id=AltS");
		}
		assertTrue(webtest.getHtmlSource().contains("��������Ϊ��"));
	}
	//�Ա�Ϊ�յ������
	@Test(priority=7)
	public void test10(){
		boolean flag = webtest.getHtmlSource().contains("����(S)");
		if(flag){
			//��������
			webtest.type("name=name", "����");
			//ѡ���Ա�
			webtest.selectByIndex("name=sex", 0);
			//�������
			webtest.click("id=AltS");
		}
		assertTrue(webtest.getHtmlSource().contains("�Ա���Ϊ��"));	
	}
	//�������ҳ��رհ�ť�ص���ҳ��
	@Test(priority=8)
	public void test11(){
		boolean flag = webtest.getHtmlSource().contains("����(S)");
		if(flag){
			webtest.leaveFrame();
			//����رհ�ť
			webtest.click("id=winiframe_spancancel");
		}		
		assertTrue(webtest.getHtmlSource().contains(" ����"));
	}
}