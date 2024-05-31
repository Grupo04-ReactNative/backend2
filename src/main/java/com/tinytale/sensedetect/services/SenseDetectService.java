package com.tinytale.sensedetect.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tinytale.sensedetect.dtos.SenseDetectDTO;
import com.tinytale.sensedetect.services.gibberishdetectors.GibberishDetectorService;


@Service
public class SenseDetectService {

    @Autowired
    GibberishDetectorService gibberishDetectorService;

    public String verificarInteligibilidade(SenseDetectDTO senseDetectDTO) {
        if(senseDetectDTO.mensagem() == null || senseDetectDTO.idioma() == null) {
            throw new IllegalArgumentException("SenseDetectDTO com mensagem ou idioma nulo!");
        }
        String idioma = senseDetectDTO.idioma();
        
        if(!gibberishDetectorService.checkLanguageSupport(idioma)) {
            throw new IllegalArgumentException("Idioma não suportado: " + idioma);
        }
        String mensagem = senseDetectDTO.mensagem();
        if(gibberishDetectorService.detectGibberish(mensagem, idioma)) {
            return "not_allowed";
        } else {
            return "allowed";
        }
    }

}
