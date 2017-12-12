package com.demo.until;

import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class Mail {
	
	public void sendMail() throws MessagingException  {
		Properties prop = new Properties();
		//设置里邮箱地址
		prop.setProperty("mail.host", "smtp.163.com");
		prop.setProperty("mail.transport.protocol", "smtp");
		prop.setProperty("mail.smtp.auth", "true");
		//使用JavaMail发送邮件
		//1、创建session
		Session session = Session.getInstance(prop);
		//2、开启session的debug模式，，查看程序发送Email时的运行状态
		session.setDebug(true);
		 //3、通过色session得到transport对象
		 Transport ts = session.getTransport("smtp");
		 //使用邮箱用户名和密码连上邮件服务器，发送邮件时，发送人需要提交邮箱的用户名和密码给smtp服务器
		 ts.connect("smtp.163.com", "15095271330@163.com", "yj961117");
		 //4、创建邮件
		 Message message = setMessage(session);
		 //5、发送邮件
		 ts.sendMessage(message, message.getAllRecipients());
		 
		 ts.close();
		 Log.info("E-mail send");
		
	}

	private Message setMessage(Session session) throws AddressException, MessagingException {
		//1、创建邮件对象
		MimeMessage message = new MimeMessage(session);
		//2、邮件的发送人
		message.setFrom(new InternetAddress("15095271330@163.com"));
		//3、邮件的接收人
		message.setRecipient(Message.RecipientType.TO, new InternetAddress("1806435675@qq.com"));
		//4、邮件的标题
		message.setSubject("测试");
		//5、邮件的文本内容，防止出现错误编码
		message.setContent("正文", "text/html;charset=UTf-8");
//		message.saveChanges();
		//6、返回创建好的邮件对象
		return message;
	}
	
	public static void main(String[] args) throws MessagingException{
		Mail mail = new Mail();
		mail.sendMail();
	} 
	
}