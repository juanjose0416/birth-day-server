package com.example.birthday.service;

import javax.mail.MessagingException;

import com.example.birthday.DTO.EmailBody;

public interface EmailPort {

    boolean sendEmail(EmailBody emailBody) throws MessagingException;

}
