package com.ingenuity;

import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Date;
import java.util.Properties;

public class SendEmail2 {

    public static void main(String[] args) throws  Exception {
        Properties props = System.getProperties();
        props.put("mail.smtp.host", "mailhost.ingenuity.com");
        props.put("mail.smtp.timeout", "10000");    // timeout in 10 sec if no response from mail server

        Session session = Session.getDefaultInstance(props, null);

        MimeMessage msg = new MimeMessage(session);
        msg.setFrom(new InternetAddress("dnguyen@ingenuity.com"));
        msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse("dnguyen@ingenuity.com", false));

        String subject = "Ingenuity® iReport™!";
        String message = "Welcome to Ingenuity® iReport™! Use ‘Contact Support’ link for help";

        msg.setSubject(subject, "UTF-8");
        msg.setText(message, "UTF-8");

        msg.setHeader("X-Mailer", "LOTONtechEmail");
        msg.setSentDate(new Date());

        Transport.send(msg);
        System.out.println("Message sent OK.");
    }
}
