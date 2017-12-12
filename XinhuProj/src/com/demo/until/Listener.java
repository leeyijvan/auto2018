package com.demo.until;


import javax.mail.MessagingException;
import org.testng.ITestContext;
import org.testng.TestListenerAdapter;

public class Listener extends TestListenerAdapter{
	@Override
	public void onFinish(ITestContext testContext){
		super.onFinish(testContext);
		Log.info("·¢ËÍÓÊ¼şÁË");
		Mail mail = new Mail();
		try{
			mail.sendMail();
		}catch(MessagingException e){
			e.printStackTrace();
		}
	}
}


//626231936