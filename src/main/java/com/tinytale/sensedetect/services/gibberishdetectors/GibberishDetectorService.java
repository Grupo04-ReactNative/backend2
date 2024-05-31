package com.tinytale.sensedetect.services.gibberishdetectors;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GibberishDetectorService {

    private static final List<String> SUPPORTED_LANGUAGES = Arrays.asList("english");

    @Autowired
    EnglishGibberishDetector englishGibberishDetector;

    public boolean detectGibberish(String message, String language) {
        switch(language.toLowerCase()) {
            case "english":
                return englishGibberishDetector.isGibberishInEnglish(message);
        }
        return false;

    }

    public boolean checkLanguageSupport(String language) {
        return SUPPORTED_LANGUAGES.contains(language.toLowerCase());
    }
}
