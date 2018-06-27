/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chatbot;

/**
 *
 * @author USER
 */


import edu.cmu.sphinx.api.Configuration;
import edu.cmu.sphinx.api.LiveSpeechRecognizer;
import edu.cmu.sphinx.api.SpeechResult;
import java.io.IOException;

public class openApplication {       

    public static void main(String[] args) throws IOException {

        Configuration configuration = new Configuration();

        configuration.setAcousticModelPath("resource:/edu/cmu/sphinx/models/en-us/en-us");
        configuration.setDictionaryPath("file:E:\\4657.dic");
        configuration.setLanguageModelPath("file:E:\\4657.lm");

	 LiveSpeechRecognizer recognizer = new LiveSpeechRecognizer(configuration);
       recognizer.startRecognition(true);
	SpeechResult result;
        while ((result = recognizer.getResult()) != null) {
            String p=result.getHypothesis();
	    System.out.format("Hypothesis: %s\n", p);
	}
	recognizer.stopRecognition();
    }
}
	
    
    

