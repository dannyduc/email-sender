package com.ingenuity;

import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;

import java.util.Date;

public class MailSender {

    public static void main(String[] args) {
        JavaMailSenderImpl mailSender = new JavaMailSenderImpl();
        mailSender.setHost("mailhost.ingenuity.com");
        mailSender.setDefaultEncoding("UTF-8");

        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo("dnguyen@ingenuity.com");
        message.setFrom("dnguyen@ingenuity.com");
        message.setSubject("Ingenuity® iReport™!");
        message.setText("Welcome to Ingenuity® iReport™! Use ‘Contact Support’ link for help");
        message.setSentDate(new Date());

        System.out.println("sending message: " + message);
        mailSender.send(message);
    }
}
