package section3;

import javax.swing.JOptionPane;

public class MadlibsOfTheAmazon {
	
	public static void main(String[] args) {
		// Put this sentence in a pop up:
		// If you find yourself having to cross a piranha-infested river, here's how to do it...
		
		// Get the user to enter an adjective
		String input = JOptionPane.showInputDialog("Enter an adjective");
		// Get the user to enter a type of liquid
		String you = JOptionPane.showInputDialog("Enter a type of liquid");

		// Get the user to enter a body part
		String hii = JOptionPane.showInputDialog("Enter a body part");

		// Get the user to enter a verb
		String twr = JOptionPane.showInputDialog("Enter a verb");

		// Get the user to enter a place
		String	 turd = JOptionPane.showInputDialog("Enter a place");

		// Fit the user's words into this sentence, and save it in a String:
		// Piranhas are more [adjective] during the day, so cross the river at
		// night. Piranhas are attracted to fresh [type of liquid] and will most
		// likely take a bite out of your [body part] if you [verb]. Whatever
		// you do, if you have an open wound, try to find another way to get
		// back to the [place]. Good luck!
		
		// Make a pop-up for the final story. You can use \n to go to the next line
			
			 JOptionPane.showMessageDialog(null, "Piranhas are more, " + input);
			 JOptionPane.showMessageDialog(null, " \n during the day, " + you);
			 JOptionPane.showMessageDialog(null, " \n so cross the river at night, " + hii);
			 JOptionPane.showMessageDialog(null, " \n Piranhas are attracted to fresh, " + twr);
			 JOptionPane.showMessageDialog(null, " \n and will most likely take a bite out of your , " + turd);
			 JOptionPane.showMessageDialog(null, " \n if you, " + input);
			 JOptionPane.showMessageDialog(null, " \n whatever you whatever you do, if you have an open wound, try to find another way to get back to , " + input);



	}
}

