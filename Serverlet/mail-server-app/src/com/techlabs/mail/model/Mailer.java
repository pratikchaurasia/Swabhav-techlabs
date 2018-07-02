package com.techlabs.mail.model;

import java.util.Date;
import java.util.Properties;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class Mailer {
	public static Boolean send(String to, String subject, String msg) {

		final String user = "pratikchaurasia632@gmail.com";// change accordingly
		final String pass = "";
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

			// -- Set the FROM and TO fields --
			mesage.setFrom(new InternetAddress(user));
			mesage.setRecipients(Message.RecipientType.TO,
					InternetAddress.parse(to, false));
			mesage.setSubject(subject);
			mesage.setText(msg);
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