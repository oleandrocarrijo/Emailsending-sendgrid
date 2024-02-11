package com.devsuperior.integrations.controllers;

import com.devsuperior.integrations.dto.EmailDTO;
import org.springframework.http.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/emails")
public class EmailController {

    @PostMapping
    public ResponseEntity<Void> send(@RequestBody EmailDTO dto) {
        return ResponseEntity.noContent().build();
    }

}
