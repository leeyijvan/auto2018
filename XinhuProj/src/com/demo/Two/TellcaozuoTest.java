package com.demo.Two;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;
import org.testng.annotations.Test;
import com.demo.One.Login_Action;
import com.webtest.core.BaseTest;

public class TellcaozuoTest extends BaseTest{
	//点击操作按钮
		@Test
		public void test15() throws InterruptedException{
			Login_Action bb = new Login_Action(webtest);
			bb.loginxinhu();
			bb.openMs();
			//点击操作
			webtest.click("xpath=//tbody[starts-with(@id,'tbody')]/tr[1]/td[12]/a");
			Thread.sleep(1000);
			assertTrue(webtest.getHtmlSource().contains("详情"));
		}
		//查看详情
		@Test
		public void test16(){
			//点击详情
			webtest.click("xpath=//div[starts-with(@id,'rockmenuli')]/ul/li[1]");
			//点击关闭按钮
			webtest.click("id=winiframe_spancancel");
			assertTrue(webtest.getHtmlSource().contains("导入个人通讯录"));
		}
		//点击评论，输入信息例如：lalala，点击确定
		@Test
		public void test17(){
			//点击操作
			webtest.click("xpath=//tbody[starts-with(@id,'tbody')]/tr[1]/td[12]/a");
			//点击评论
			webtest.click("xpath=//div[starts-with(@id,'rockmenuli')]/ul/li[3]");
			//输入信息
			webtest.type("xpath=//textarea[@id='confirm_input']", "lalala");
			//点击确定
			webtest.click("xpath=//button[@id='confirm_btn1']");
			assertTrue(webtest.getHtmlSource().contains("处理成功"));		
		}
		//点击评论，输入信息例如：lalala，点击取消
		@Test
		public void test18(){
			//点击操作
			webtest.click("xpath=//tbody[starts-with(@id,'tbody')]/tr[1]/td[12]/a");
			//点击评论
			webtest.click("xpath=//div[starts-with(@id,'rockmenuli')]/ul/li[3]");
			//输入信息
			webtest.type("xpath=//textarea[@id='confirm_input']", "lalala");
			//点击取消
			webtest.click("xpath=//button[@id='confirm_btn']");
			assertTrue(webtest.getHtmlSource().contains("系统"));
		}
		//点击评论，未输入信息，点击确定，点击取消
		@Test
		public void test19(){
			//点击操作
			webtest.click("xpath=//tbody[starts-with(@id,'tbody')]/tr[1]/td[12]/a");
			//点击评论
			webtest.click("xpath=//div[starts-with(@id,'rockmenuli')]/ul/li[3]");
			//点击确定
			webtest.click("xpath=//button[@id='confirm_btn1']");
			//点击取消
			webtest.click("xpath=//button[@id='confirm_btn']");
			assertFalse(webtest.getHtmlSource().contains("没有输入评论说明"));		
		}	
		//进入第一条通讯记录的编辑页面并退出
		@Test
		public void test20(){
			//点击操作
			webtest.click("xpath=//tbody[starts-with(@id,'tbody')]/tr[1]/td[12]/a");
			//点击编辑
			webtest.click("xpath=//div[starts-with(@id,'rockmenuli')]/ul/li[5]");
			//点击关闭按钮
			webtest.click("id=winiframe_spancancel");
			assertTrue(webtest.getHtmlSource().contains("导入个人通讯录"));
		}
		//进入提醒设置页面开始时间设置页面
		@Test
		public void test21() throws InterruptedException {
			//点击操作
			webtest.click("xpath=//tbody[starts-with(@id,'tbody')]/tr[1]/td[12]/a");
			//点击添加提醒设置按钮
			webtest.click("xpath=//div[starts-with(@id,'rockmenuli')]/ul/li[4]");
			Thread.sleep(1000);
			//进入子页面
			webtest.enterFrame("openinputiframe");
			//点击开始时间框
			webtest.click("name=startdt");	
			assertTrue(webtest.getHtmlSource().contains("清空"));
		}
		//单据提醒页面开始时间设置为2017-11-22
//		@Test
//		public void test22() {
//			//点击日期22
//			webtest.click("xpath=//div[starts-with(@id,'rockdatepicker_table')]/table/tbody/tr[5]/td[4]");
//			//点击确定
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
		
		//单据提醒页面开始时间清空
		@Test
		public void test23() {
			//点击开始时间框
			webtest.click("name=startdt");	
			//点击清空
			webtest.click("xpath=//a[starts-with(@id,'rockdatepicker_clear')]");
			assertTrue(webtest.getHtmlSource().contains("单据提醒设置"));
		}
		//单据提醒页面开始时间现在按钮验证
		@Test
		public void test24() {
			//点击开始时间框
			webtest.click("name=startdt");	
			//点击现在
			webtest.click("xpath=//a[starts-with(@id,'rockdatepicker_now')]");
			assertTrue(webtest.getHtmlSource().contains("单据提醒设置"));
		}
		//关闭时间设置框
		@Test
		public void test25() {
			//点击开始时间框
			webtest.click("name=startdt");	
			//点击关闭
			webtest.click("xpath=//a[starts-with(@id,'rockdatepicker_close')]");
			assertTrue(webtest.getHtmlSource().contains("个人通讯录："));
		}
		//点击两次下个月再点击当月
		@Test
		public void test26() {			
			//点击开始时间框
			webtest.click("name=startdt");	
			//点击两次下个月
			webtest.click("xpath=//td[@title='下个月']");
			webtest.click("xpath=//td[@title='下个月']");
			//点击当月
			webtest.click("xpath=//td[@title='当月']");
			assertTrue(webtest.getHtmlSource().contains("当月"));
		}
		//开始时间为空点击保存
		@Test
		public void test27() throws InterruptedException{
			//点击开始时间框
			webtest.click("name=startdt");	
			//点击清空
			webtest.click("xpath=//a[starts-with(@id,'rockdatepicker_clear')]");
			//点击保存
			webtest.click("id=AltS");
			assertTrue(webtest.getHtmlSource().contains("开始时间不能为空"));
		}
		//打开选择接受人页面
		@Test(priority=0)
		public void test28() throws InterruptedException {
			//点击选择按钮
			webtest.click("id=btnchange_recename");
			assertTrue(webtest.getHtmlSource().contains("查找"));
		}
		//在选择页面查找人员例如：管理员
		@Test(priority=1)
		public void test29() {
			//在查找框输入信息例如：管理员
			webtest.type("xpath=//input[starts-with(@id,'changekey')]", "管理员");
			//点击查找
			webtest.click("xpath=//input[starts-with(@id,'changesoubtn')]");
			//点击确定
			webtest.click("xpath=//input[starts-with(@id,'changeok')]");
			assertTrue(webtest.getHtmlSource().contains("保存(S)"));	
		}
		//复选框的点击与取消
		@Test(priority=2)
		public void test30() {
			//点击选择按钮
			webtest.click("id=btnchange_recename");
			//点击复选框例如：管理层
			webtest.click("xpath=//input[@value='5']");
			//点击复选框例如：开发部
			webtest.click("xpath=//input[@value='2']");
			//点击复选框例如：管理层
			webtest.click("xpath=//input[@value='5']");
			//点击复选框例如：开发部
			webtest.click("xpath=//input[@value='2']");
		}
		//选择接收人页面刷新按钮、取消按钮功能验证
		@Test(priority=3)
		public void test31() {
			//点击刷新数据按钮
			webtest.click("xpath=//input[starts-with(@id,'changereload')]");
			//点击取消
			webtest.click("xpath=//input[starts-with(@id,'changecancl')]");
		}
		//确定管理员、张飞为接收人
		@Test(priority=4)
		public void test32() {
			//点击选择按钮
			webtest.click("id=btnchange_recename");
			//点击开发部
			webtest.click("xpath=//td[@deptxu='2_1']");
			//选择管理员
			webtest.click("xpath=//input[@xname='管理员']");
			//选择张飞
			webtest.click("xpath=//input[@value='6']");
			//点击确定
			webtest.click("xpath=//input[@value='确定']");
			assertFalse(webtest.getHtmlSource().contains("管理员,张飞"));
		}
		//去掉接收人
		@Test(priority=5)
		public void test33(){
			webtest.click("xpath=//a[@class='webbtn']");
			webtest.leaveFrame();
		}
	

}
