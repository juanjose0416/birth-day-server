package com.example.birthday.service;

import com.example.birthday.DTO.EmailBody;

public interface EmailPort {

    boolean sendEmail(EmailBody emailBody);

}
