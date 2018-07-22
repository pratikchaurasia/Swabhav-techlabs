package com.techlabs.mail;


import java.util.Date;
import java.util.Properties;
import java.util.UUID;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class Mailer {
	private static String subject="Verify your account";
	String messsage="Please click on the link to validate your account";
	public static Boolean send(String to,UUID id) {
		String messsage="Please click on the below link to validate your account http://localhost:8080/banking-application/verify?id="+id;
		final String user = "pratikchaurasia632@gmail.com";// change accordingly
		final String pass = "pratik007";
		final String SSL_FACTORY = "javax.net.ssl.SSLSocketFactory";
		

		Properties props = System.getProperties();
		props.setProperty("mail.smtp.host", "smtp.gmail.com");
		props.setProperty("mail.smtp.socketFactory.class", SSL_FACTORY);
		props.setProperty("mail.smtp.socketFactory.fallback", "false");
		props.setProperty("mail.smtp.port", "465");
		props.setProperty("mail.smtp.socketFactory.port", "465");
		props.put("mail.smtp.auth", "true");
		props.put("mail.debug", "true");
		props.put("mail.store.protocol", "pop3");
		props.put("mail.transport.protocol", "smtp");

		try {
			Session session = Session.getDefaultInstance(props,
					new Authenticator() {
						protected PasswordAuthentication getPasswordAuthentication() {
							return new PasswordAuthentication(user, pass);
						}
					});

			Message mesage = new MimeMessage(session);

			mesage.setFrom(new InternetAddress(user));
			mesage.setRecipients(Message.RecipientType.TO,
					InternetAddress.parse(to, false));
			mesage.setSubject(subject);
			mesage.setText(messsage);
			mesage.setSentDate(new Date());
			Transport.send(mesage);
			System.out.println("Message sent.");
			return true;
		} catch (Exception exp) {
			exp.printStackTrace();
		}
		return false;

	}
}