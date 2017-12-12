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
		//�����������ַ
		prop.setProperty("mail.host", "smtp.163.com");
		prop.setProperty("mail.transport.protocol", "smtp");
		prop.setProperty("mail.smtp.auth", "true");
		//ʹ��JavaMail�����ʼ�
		//1������session
		Session session = Session.getInstance(prop);
		//2������session��debugģʽ�����鿴������Emailʱ������״̬
		session.setDebug(true);
		 //3��ͨ��ɫsession�õ�transport����
		 Transport ts = session.getTransport("smtp");
		 //ʹ�������û��������������ʼ��������������ʼ�ʱ����������Ҫ�ύ������û����������smtp������
		 ts.connect("smtp.163.com", "15095271330@163.com", "yj961117");
		 //4�������ʼ�
		 Message message = setMessage(session);
		 //5�������ʼ�
		 ts.sendMessage(message, message.getAllRecipients());
		 
		 ts.close();
		 Log.info("E-mail send");
		
	}

	private Message setMessage(Session session) throws AddressException, MessagingException {
		//1�������ʼ�����
		MimeMessage message = new MimeMessage(session);
		//2���ʼ��ķ�����
		message.setFrom(new InternetAddress("15095271330@163.com"));
		//3���ʼ��Ľ�����
		message.setRecipient(Message.RecipientType.TO, new InternetAddress("1806435675@qq.com"));
		//4���ʼ��ı���
		message.setSubject("����");
		//5���ʼ����ı����ݣ���ֹ���ִ������
		message.setContent("����", "text/html;charset=UTf-8");
//		message.saveChanges();
		//6�����ش����õ��ʼ�����
		return message;
	}
	
	public static void main(String[] args) throws MessagingException{
		Mail mail = new Mail();
		mail.sendMail();
	} 
	
}