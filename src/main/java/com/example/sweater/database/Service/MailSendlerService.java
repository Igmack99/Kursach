package com.example.sweater.database.Service;
import org.springframework.stereotype.Service;


@Service
public interface MailSendlerService {
    public void send(String emailTo, String subject, String message);

}