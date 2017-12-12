package com.demo.Two;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;
import org.testng.annotations.Test;
import com.demo.One.Login_Action;
import com.webtest.core.BaseTest;

public class TellcaozuoTest extends BaseTest{
	//���������ť
		@Test
		public void test15() throws InterruptedException{
			Login_Action bb = new Login_Action(webtest);
			bb.loginxinhu();
			bb.openMs();
			//�������
			webtest.click("xpath=//tbody[starts-with(@id,'tbody')]/tr[1]/td[12]/a");
			Thread.sleep(1000);
			assertTrue(webtest.getHtmlSource().contains("����"));
		}
		//�鿴����
		@Test
		public void test16(){
			//�������
			webtest.click("xpath=//div[starts-with(@id,'rockmenuli')]/ul/li[1]");
			//����رհ�ť
			webtest.click("id=winiframe_spancancel");
			assertTrue(webtest.getHtmlSource().contains("�������ͨѶ¼"));
		}
		//������ۣ�������Ϣ���磺lalala�����ȷ��
		@Test
		public void test17(){
			//�������
			webtest.click("xpath=//tbody[starts-with(@id,'tbody')]/tr[1]/td[12]/a");
			//�������
			webtest.click("xpath=//div[starts-with(@id,'rockmenuli')]/ul/li[3]");
			//������Ϣ
			webtest.type("xpath=//textarea[@id='confirm_input']", "lalala");
			//���ȷ��
			webtest.click("xpath=//button[@id='confirm_btn1']");
			assertTrue(webtest.getHtmlSource().contains("����ɹ�"));		
		}
		//������ۣ�������Ϣ���磺lalala�����ȡ��
		@Test
		public void test18(){
			//�������
			webtest.click("xpath=//tbody[starts-with(@id,'tbody')]/tr[1]/td[12]/a");
			//�������
			webtest.click("xpath=//div[starts-with(@id,'rockmenuli')]/ul/li[3]");
			//������Ϣ
			webtest.type("xpath=//textarea[@id='confirm_input']", "lalala");
			//���ȡ��
			webtest.click("xpath=//button[@id='confirm_btn']");
			assertTrue(webtest.getHtmlSource().contains("ϵͳ"));
		}
		//������ۣ�δ������Ϣ�����ȷ�������ȡ��
		@Test
		public void test19(){
			//�������
			webtest.click("xpath=//tbody[starts-with(@id,'tbody')]/tr[1]/td[12]/a");
			//�������
			webtest.click("xpath=//div[starts-with(@id,'rockmenuli')]/ul/li[3]");
			//���ȷ��
			webtest.click("xpath=//button[@id='confirm_btn1']");
			//���ȡ��
			webtest.click("xpath=//button[@id='confirm_btn']");
			assertFalse(webtest.getHtmlSource().contains("û����������˵��"));		
		}	
		//�����һ��ͨѶ��¼�ı༭ҳ�沢�˳�
		@Test
		public void test20(){
			//�������
			webtest.click("xpath=//tbody[starts-with(@id,'tbody')]/tr[1]/td[12]/a");
			//����༭
			webtest.click("xpath=//div[starts-with(@id,'rockmenuli')]/ul/li[5]");
			//����رհ�ť
			webtest.click("id=winiframe_spancancel");
			assertTrue(webtest.getHtmlSource().contains("�������ͨѶ¼"));
		}
		//������������ҳ�濪ʼʱ������ҳ��
		@Test
		public void test21() throws InterruptedException {
			//�������
			webtest.click("xpath=//tbody[starts-with(@id,'tbody')]/tr[1]/td[12]/a");
			//�������������ð�ť
			webtest.click("xpath=//div[starts-with(@id,'rockmenuli')]/ul/li[4]");
			Thread.sleep(1000);
			//������ҳ��
			webtest.enterFrame("openinputiframe");
			//�����ʼʱ���
			webtest.click("name=startdt");	
			assertTrue(webtest.getHtmlSource().contains("���"));
		}
		//��������ҳ�濪ʼʱ������Ϊ2017-11-22
//		@Test
//		public void test22() {
//			//�������22
//			webtest.click("xpath=//div[starts-with(@id,'rockdatepicker_table')]/table/tbody/tr[5]/td[4]");
//			//���ȷ��
//			webtest.click("xpath=//a[starts-with(@id,'rockdatepicker_queding')]");
//			assertTrue(webtest.getHtmlSource().contains("2017-11-22"));
//			
//		}
		
//		public static Date getLastDate(long day) {
//		    Date date = new Date(day);
//		    long date_3_hm = date.getTime() - 3600000 * 34 * day;
//		    Date date_3_hm_date = new Date(date_3_hm);
//		    return date_3_hm_date;
//		  }
		
		//��������ҳ�濪ʼʱ�����
		@Test
		public void test23() {
			//�����ʼʱ���
			webtest.click("name=startdt");	
			//������
			webtest.click("xpath=//a[starts-with(@id,'rockdatepicker_clear')]");
			assertTrue(webtest.getHtmlSource().contains("������������"));
		}
		//��������ҳ�濪ʼʱ�����ڰ�ť��֤
		@Test
		public void test24() {
			//�����ʼʱ���
			webtest.click("name=startdt");	
			//�������
			webtest.click("xpath=//a[starts-with(@id,'rockdatepicker_now')]");
			assertTrue(webtest.getHtmlSource().contains("������������"));
		}
		//�ر�ʱ�����ÿ�
		@Test
		public void test25() {
			//�����ʼʱ���
			webtest.click("name=startdt");	
			//����ر�
			webtest.click("xpath=//a[starts-with(@id,'rockdatepicker_close')]");
			assertTrue(webtest.getHtmlSource().contains("����ͨѶ¼��"));
		}
		//��������¸����ٵ������
		@Test
		public void test26() {			
			//�����ʼʱ���
			webtest.click("name=startdt");	
			//��������¸���
			webtest.click("xpath=//td[@title='�¸���']");
			webtest.click("xpath=//td[@title='�¸���']");
			//�������
			webtest.click("xpath=//td[@title='����']");
			assertTrue(webtest.getHtmlSource().contains("����"));
		}
		//��ʼʱ��Ϊ�յ������
		@Test
		public void test27() throws InterruptedException{
			//�����ʼʱ���
			webtest.click("name=startdt");	
			//������
			webtest.click("xpath=//a[starts-with(@id,'rockdatepicker_clear')]");
			//�������
			webtest.click("id=AltS");
			assertTrue(webtest.getHtmlSource().contains("��ʼʱ�䲻��Ϊ��"));
		}
		//��ѡ�������ҳ��
		@Test(priority=0)
		public void test28() throws InterruptedException {
			//���ѡ��ť
			webtest.click("id=btnchange_recename");
			assertTrue(webtest.getHtmlSource().contains("����"));
		}
		//��ѡ��ҳ�������Ա���磺����Ա
		@Test(priority=1)
		public void test29() {
			//�ڲ��ҿ�������Ϣ���磺����Ա
			webtest.type("xpath=//input[starts-with(@id,'changekey')]", "����Ա");
			//�������
			webtest.click("xpath=//input[starts-with(@id,'changesoubtn')]");
			//���ȷ��
			webtest.click("xpath=//input[starts-with(@id,'changeok')]");
			assertTrue(webtest.getHtmlSource().contains("����(S)"));	
		}
		//��ѡ��ĵ����ȡ��
		@Test(priority=2)
		public void test30() {
			//���ѡ��ť
			webtest.click("id=btnchange_recename");
			//�����ѡ�����磺�����
			webtest.click("xpath=//input[@value='5']");
			//�����ѡ�����磺������
			webtest.click("xpath=//input[@value='2']");
			//�����ѡ�����磺�����
			webtest.click("xpath=//input[@value='5']");
			//�����ѡ�����磺������
			webtest.click("xpath=//input[@value='2']");
		}
		//ѡ�������ҳ��ˢ�°�ť��ȡ����ť������֤
		@Test(priority=3)
		public void test31() {
			//���ˢ�����ݰ�ť
			webtest.click("xpath=//input[starts-with(@id,'changereload')]");
			//���ȡ��
			webtest.click("xpath=//input[starts-with(@id,'changecancl')]");
		}
		//ȷ������Ա���ŷ�Ϊ������
		@Test(priority=4)
		public void test32() {
			//���ѡ��ť
			webtest.click("id=btnchange_recename");
			//���������
			webtest.click("xpath=//td[@deptxu='2_1']");
			//ѡ�����Ա
			webtest.click("xpath=//input[@xname='����Ա']");
			//ѡ���ŷ�
			webtest.click("xpath=//input[@value='6']");
			//���ȷ��
			webtest.click("xpath=//input[@value='ȷ��']");
			assertFalse(webtest.getHtmlSource().contains("����Ա,�ŷ�"));
		}
		//ȥ��������
		@Test(priority=5)
		public void test33(){
			webtest.click("xpath=//a[@class='webbtn']");
			webtest.leaveFrame();
		}
	

}
