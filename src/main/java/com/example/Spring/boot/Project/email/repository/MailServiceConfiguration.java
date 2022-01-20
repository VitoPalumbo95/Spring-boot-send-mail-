package com.example.Spring.boot.Project.email.repository;

import com.example.Spring.boot.Project.email.service.EmailSenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.EventListener;

@Configuration
public class MailServiceConfiguration {

    @Autowired
    EmailSenderService senderService;

    @EventListener(ApplicationReadyEvent.class)
    public void sendMail() {
        senderService.sendEmail("insert mail",
                "this is the object",
                "this is the body");
    }
}
