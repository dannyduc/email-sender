package com.ingenuity;

import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;

import java.io.UnsupportedEncodingException;
import java.util.Date;

public class MailSender {



    public static final String REGISTERED_SIGN = "\u00ae";              // ®
    public static final String TRADE_MARK = "\u2122";                   // ™
    public static final String LEFT_SINGLE_QUOTATION_MARK = "\u2018";   // ‘
    public static final String RIGHT_SINGLE_QUOTATION_MARK = "\u2019";  // ’

    public static void main(String[] args) throws UnsupportedEncodingException {
        JavaMailSenderImpl mailSender = new JavaMailSenderImpl();
        mailSender.setHost("mailhost.ingenuity.com");
        mailSender.setDefaultEncoding("UTF-8");

        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo("dnguyen@ingenuity.com");
        message.setFrom("dnguyen@ingenuity.com");
        message.setSubject("Ingenuity\u00ae iReport\u2122!");
        message.setText("Welcome to Ingenuity\u00ae iReport\u2122! Use \u2018Contact Support\u2019 link for help");
        message.setSentDate(new Date());

        System.out.println("sending message: " + message);
        mailSender.send(message);
    }
}
