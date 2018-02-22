package section4;

import java.util.Random;

import javax.swing.JOptionPane;

public class AwesomeOrNot {

	// 1. Make a main method that includes all the steps below…
	public static void main(String[] args) {

		// 2. Make a variable that will hold a random number and put a random number
		// into this variable using "new Random().nextInt(4)"
		Random randy = new Random();
		int x = randy.nextInt(4);
		// 3. Print out this variable
		System.out.println(x);
		// 4. Get the user to enter something that they think is awesome
		String you = JOptionPane.showInputDialog("Enter what you think is awesome");

		// 5. If the random number is 0
		// -- tell the user whatever they entered is awesome!
		if (x == 0) {

		}
		JOptionPane.showMessageDialog(null, "DONALD TRUMP AND I AGREE! ");
		if (x == 1) {
			// 6. If the random number is 1
			// -- tell the user whatever they entered is ok.
			JOptionPane.showMessageDialog(null, "DONALD TRUMP AND I THINK IT IS OK NOT THE BEST! ");

			// 7. If the random number is 2
			// -- tell the user whatever they entered is boring.
			JOptionPane.showMessageDialog(null, "DONALD TRUMP AND I AGREE THAT IS BORING! ");
		}
		if (x == 2) {
			// 8. If the random number is 3
			JOptionPane.showMessageDialog(null,
					"DONALD TRUMP AND I AGREE THAT YOU SUCK AND YOU NEED TO TALK TO DAVE THE MASTER! ");
		}
		if (x == 3) {
			// -- write your own answer

		}

	}
}