package com.devsuperior.integrations.controllers;

import com.devsuperior.integrations.dto.EmailDTO;
import com.devsuperior.integrations.services.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/emails")
public class EmailController {

    @Autowired
    private EmailService service;

    @PostMapping
    public ResponseEntity<Void> send(@RequestBody EmailDTO dto) {
        service.sendEmail(dto);
        return ResponseEntity.noContent().build();
    }

}
