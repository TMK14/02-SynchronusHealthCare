package com.synchronus.demo;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import com.synchronus.dao.VaccineDetails;

public class mailDemo {
	VaccineDetails vaccineDetails = new VaccineDetails();
	ArrayList<String> aList = new ArrayList<String>();

	public void sendEmailnotification(String userName ,String vaccineName ,String date , String address) throws ClassNotFoundException, SQLException, Exception{
		System.out.println("Sending email");
		aList= vaccineDetails.userDeatils(userName);
		String messageString = "Dear , "+aList.get(0)+", you have successfully booked the slot in Synchronus Vaccine Program.\nYou have selected "+vaccineName+".Your appointment is "
				+ "				scheduled on "+date+" at "+address+"."+"Please check the date and take the Vaccine!!!";
		String subjectString = "VaccineManagement : Confirmation";
		String tO = "tusharkompa@gmail.com";
		String from = "Synchronus <synchronushealthcare@gmail.com>";
		
//		new email host
		String host = "smtp.gmail.com";
		
		// get the system properties
		Properties properties = System.getProperties();
		
		System.out.println("Properties : "+properties);
		
		properties.put("mail.smtp.host",host);
		properties.put("mail.smtp.port", "465");
		properties.put("mail.smtp.ssl.enable", "true");
		properties.put("mail.smtp.auth", "true");
		
		//to get seesion object
		
		Session session = Session.getInstance(properties, new Authenticator() {
			@Override
			protected PasswordAuthentication getPasswordAuthentication() {
				return new  PasswordAuthentication("synchronushealthcare@gmail.com", "sgthpwrbpgomnwjy");
			}
			
			
		});
		
		//compose the message
		session.setDebug(true);
		
		MimeMessage message2  = new MimeMessage(session);
		
		try {
			message2.setFrom(from);
			message2.addRecipient(Message.RecipientType.TO, new InternetAddress(userName));
			message2.setSubject(subjectString);
			message2.setText(messageString);
			
			Transport.send(message2);
			System.out.println("Message sent sucessfully");
			
		} catch (MessagingException e) {
			e.printStackTrace();
		}
		
	}
}
