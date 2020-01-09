package com.scodeen.util;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class EmailUtil {

	public static void main(String[] args) {
		sendMail("ksbhanegaonkar@gmail.com", "This is test mail", "This is test mail sending");
	}
	
	public static void sendMail(String to,String subject, String mailBody) {
		try {

			final String username = "tussharak";
			final String password = "Godisbest@22";


		        Properties prop = new Properties();
				prop.put("mail.smtp.host", "smtp.gmail.com");
		        prop.put("mail.smtp.port", "587");
		        prop.put("mail.smtp.auth", "true");
		        prop.put("mail.smtp.starttls.enable", "true"); //TLS
		        
		        Session session = Session.getInstance(prop,
		                new javax.mail.Authenticator() {
		                    protected PasswordAuthentication getPasswordAuthentication() {
		                        return new PasswordAuthentication(username, password);
		                    }
		                });

		        try {

		            Message message = new MimeMessage(session);
		            message.setFrom(new InternetAddress("tussharak@gmail.com"));
		            message.setRecipients(
		                    Message.RecipientType.TO,
		                    InternetAddress.parse(to)
		            );
		            message.setSubject(subject);
		            message.setText(mailBody);

		            Transport.send(message);

		            System.out.println("Done");

		        } catch (MessagingException e) {
		            e.printStackTrace();
		        }
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
