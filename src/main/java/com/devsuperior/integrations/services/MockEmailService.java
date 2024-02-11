package com.devsuperior.integrations.services;

import com.devsuperior.integrations.dto.EmailDTO;
import com.sendgrid.SendGrid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MockEmailService implements EmailService{

    private static Logger LOG = LoggerFactory.getLogger(MockEmailService.class);

    private SendGrid sendGrid;

    public void sendEmail(EmailDTO emailDTO) {

            LOG.info("Sending email to: " + emailDTO.getTo());
            LOG.info("Email sent!");
    }
}
