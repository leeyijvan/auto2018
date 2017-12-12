package com.demo.Two;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;
import org.testng.annotations.Test;
import com.demo.One.Login_Action;
import com.webtest.core.BaseTest;

public class TellzhuyeTest extends BaseTest{
	//输入姓名点击搜索
		@Test
		public void test12() throws InterruptedException{
			Login_Action bb = new Login_Action(webtest);
			bb.loginxinhu();
			bb.openMs();
			//姓名例如：“啦啦啦”
			webtest.type("xpath=//input[@placeholder='标题']", "大大");
			//点击搜索
			webtest.click("xpath=//button[@click='search']");
			assertTrue(webtest.getHtmlSource().contains("121212成功成功成"));
		}
		//未输入信息点击搜索
		@Test
		public void test13() throws InterruptedException{
			Login_Action bb = new Login_Action(webtest);
			bb.loginxinhu();
			bb.openMs();
			//点击搜索
			webtest.click("xpath=//button[@click='search']");
			assertFalse(webtest.getHtmlSource().contains("诸葛亮 啦啦啦"));
		}
		//导出通讯记录
		@Test
		public void test14() throws InterruptedException{
			Login_Action bb = new Login_Action(webtest);
			bb.loginxinhu();
			bb.openMs();
			//点击导出按钮
			webtest.click("xpath=//button[@click='daochu']");
			assertTrue(webtest.getHtmlSource().contains("处理成功"));
		}
}
