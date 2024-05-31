package com.tinytale.sensedetect.dtos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record SenseDetectDTO(
    String mensagem,
    String idioma
) {

}
