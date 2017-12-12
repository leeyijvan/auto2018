package com.demo.One;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class RibaoTest extends BaseTest{
	//点击搜索中的高级搜索
		@Test
		public void test43() throws InterruptedException{
			//调用方法打开工作日报中的日报授权查看页面
			Login_Action bb = new Login_Action(webtest);
			bb.loginxinhu();
			bb.openRC();
			//点击搜索框的下拉列表
			webtest.click("xpath=//button[starts-with(@id,'downbtn')]");
			//点击高级搜索
			webtest.click("xpath=//li[@temp='0']");
//			assertTrue(webtest.getHtmlSource().contains(""));
		}
		//点击高级搜索弹出框内日报类型中的周报
		@Test(dependsOnMethods="test43")
		public void test44(){
			//点击日报类型点击周报
			webtest.selectByIndex("name=soufields_type", 2);
			//点击搜索
			webtest.click("id=searchhigh_btn0");
			assertTrue(webtest.getHtmlSource().contains("周报"));
		}
}
