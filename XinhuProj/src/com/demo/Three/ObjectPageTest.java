package com.demo.Three;

import static org.testng.Assert.assertTrue;
import org.testng.annotations.Test;
import com.webtest.core.BaseTest;

public class ObjectPageTest extends BaseTest{

	@Test
	public void test() throws InterruptedException{
		
		ObjectPage op = new ObjectPage(this.driver);
		op.open();
		op.loginsuccessful("admin", "123456");
		assertTrue(webtest.getHtmlSource().contains("管理员"));
	}
	@Test
	public void test1() throws InterruptedException{
		ObjectPage op = new ObjectPage(this.driver);
		op.open();
		op.loginfail();
		assertTrue(webtest.getHtmlSource().contains("用户不存在"));
	}
}
