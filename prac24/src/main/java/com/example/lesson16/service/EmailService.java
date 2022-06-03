package com.example.lesson16.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

    @Value("Steel.Lizard@yandex.ru")
    public String EMAIL;

    @Autowired
    public JavaMailSender javaMailSender;


    @Async
    public void send(String text) throws MailException {
        SimpleMailMessage mail = new SimpleMailMessage();
        mail.setTo("Steel.Lizard@yandex.ru");
        mail.setFrom(EMAIL);
        mail.setText(text);
        javaMailSender.send(mail);
    }

}