/**
 * Source code @
 * https://github.com/paypal/Gibberish-Detector-Java
 */
package com.tinytale.sensedetect.services.gibberishdetectors;

import java.util.List;

public class GibberishDetectorExtended extends GibberishDetector {
	public GibberishDetectorExtended(List<String> trainingLinesList, List<String> goodLinesList, List<String> badLinesList,String alphabet) {
		super(trainingLinesList, goodLinesList, badLinesList, alphabet);
	}
		
	@Override
	protected double getThreshold(double minGood, double maxBad) {
		return minGood;
	}
	
}
