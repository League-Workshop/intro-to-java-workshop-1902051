package section3;

import javax.swing.JOptionPane;
import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;

import sun.applet.Main;

public class StephenHawking {
	
	// 1. make a main method and put steps 2, 3 & 4 inside it
	public static void main(String[] args) {
		
	
	// 4. Use a for loop to repeat steps #2 and #3, a lot of times
	for (int i = 0; i < 5; i++) {
		
	}
	// 2. ask the user for a sentence
		String input = JOptionPane.showInputDialog("Enter a sentance");

	// 3. call the speak method below and send it the sentence
speak (input);
	}

	

	
	
	
	
	
	
	
	/* Don’t change this…. */
	static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		}
		 catch (Exception e) {
			 e.printStackTrace();
		 }
	}

}
