package com.example.birthday.controller;

import javax.mail.MessagingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.birthday.DTO.EmailBody;
import com.example.birthday.service.EmailPort;

@RestController
@RequestMapping("/send/email")
public class SendController {

    private final EmailPort emailPort;

    @Autowired
    public SendController(EmailPort emailPort) {
        this.emailPort = emailPort;
    }

    @PostMapping("")
    ResponseEntity<Boolean> newUser(@RequestBody EmailBody emailBody) throws MessagingException {
        return new ResponseEntity<Boolean>(emailPort.sendEmail(emailBody), HttpStatus.CREATED);
    }

}
