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
		//参数化选择姓名
		webtest.click("xpath=//span[@id='div_custname']/table/tbody/tr/td[2]/a");
		webtest.click("xpath=//input[@value='"+nameValue+"']");
		webtest.click("xpath=//input[@value='确定']");
		//选择来源
		webtest.selectByIndex("name=laiyuan", Integer.parseInt(from));
		//参数化输入金额
		webtest.type("name=money", money);
		//参数化输入说明
		webtest.type("name=explain", explain);
		//点击保存
		webtest.click("id=AltS");
		//退出子页面
		webtest.leaveFrame();
		
	}
}



