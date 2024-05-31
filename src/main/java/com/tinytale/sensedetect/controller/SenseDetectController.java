package com.tinytale.sensedetect.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tinytale.sensedetect.dtos.SenseDetectDTO;
import com.tinytale.sensedetect.dtos.SenseDetectResponseDTO;
import com.tinytale.sensedetect.services.SenseDetectService;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/sensedetect")
public class SenseDetectController {
    @Autowired
    SenseDetectService service;

    @PostMapping

    public ResponseEntity<SenseDetectResponseDTO> verificarInteligibilidade(@RequestBody SenseDetectDTO senseDetectDTO) {

        return ResponseEntity.ok(new SenseDetectResponseDTO(service.verificarInteligibilidade(senseDetectDTO)));
    }

}
