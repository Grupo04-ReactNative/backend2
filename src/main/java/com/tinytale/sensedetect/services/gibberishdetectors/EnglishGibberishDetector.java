package com.tinytale.sensedetect.services.gibberishdetectors;

import org.springframework.stereotype.Component;

@Component
public class EnglishGibberishDetector {
    
    private static final String alphabet = "abcdefghijklmnopqrstuvwxyz ";

    private static GibberishDetectorFactory factory = 
            new GibberishDetectorFactory(GibberishDetectorExtended.class);

    private GibberishDetector gibberishDetector = 
    		factory.createGibberishDetectorFromLocalFile(
    				"bigEnglish.txt", "goodEnglish.txt", "badEnglish.txt", alphabet);
    
    public boolean isGibberishInEnglish(String tag) {
    	return gibberishDetector.isGibberish(tag);
    }
}

