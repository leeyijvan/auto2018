package com.demo.Three;

import org.testng.annotations.Test;
import com.demo.One.Login_Action;
import com.webtest.core.BaseTest;

public class DataProviderTest extends BaseTest {
	@Test(dataProvider = "TD1",dataProviderClass=DataDriver.class)
	public void test45(String nameValue,String from,String money,String explain ) throws InterruptedException{
		Login_Action dd = new Login_Action(webtest);
		dd.loginxinhu();
		dd.openshowADD();
		//������ѡ������
		webtest.click("xpath=//span[@id='div_custname']/table/tbody/tr/td[2]/a");
		webtest.click("xpath=//input[@value='"+nameValue+"']");
		webtest.click("xpath=//input[@value='ȷ��']");
		//ѡ����Դ
		webtest.selectByIndex("name=laiyuan", Integer.parseInt(from));
		//������������
		webtest.type("name=money", money);
		//����������˵��
		webtest.type("name=explain", explain);
		//�������
		webtest.click("id=AltS");
		//�˳���ҳ��
		webtest.leaveFrame();
		
	}
}



