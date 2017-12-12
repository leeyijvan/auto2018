package com.demo.Three;

import static org.testng.Assert.assertTrue;
import org.testng.annotations.Test;
import com.demo.One.Login_Action;
import com.webtest.core.BaseTest;

public class MineKhTest extends BaseTest{
	//进入客户子模块下的我的客户页面
		@Test
		public void test38() throws InterruptedException{
			Login_Action aa = new Login_Action(webtest);
			aa.loginxinhu();
			Thread.sleep(3000);
			//点击上方客户
			webtest.click("xpath=//span[@pmenuid='63']");
			//点击左侧客户
			webtest.click("id=menu_list_num64");
			//点击我的客户
			webtest.click("id=menu_list_num112");
			assertTrue(webtest.getHtmlSource().contains("我的客户"));
		}
		//点击我停用的客户
		@Test(dependsOnMethods="test38")
		public void test39(){
			//点击我停用客户
			webtest.click("xpath=//button[@click='changatype,my_ting']");
			assertTrue(webtest.getHtmlSource().contains("管理员"));
		}
		//点击我创建
		@Test(dependsOnMethods="test38")
		public void test40(){
			//点击我创建
			webtest.click("xpath=//button[@click='changatype,mycj']");
			assertTrue(webtest.getHtmlSource().contains("赵子龙"));
		}
		//点击重新统计金额
		@Test(dependsOnMethods="test38")
		public void test41(){
			//点击重新统计金额
			webtest.click("xpath=//button[@click='retotal']");
			assertTrue(webtest.getHtmlSource().contains("统计完成"));
		}
		//点击全选
		@Test(dependsOnMethods="test38")
		public void test42(){
			//点击全选
			webtest.click("xpath=//input[starts-with(@id,'seltablecheck')]");
		}
}
