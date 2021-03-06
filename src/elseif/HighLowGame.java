//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import java.util.Random;

import javax.swing.JOptionPane;

public class HighLowGame {

	public static void main(String[] args) {
		// 3. Change this line to give you a random number between 1 - 100.
		int random = new Random().nextInt((100 - 1) + 1) + 1;

		// 2. Print out the random variable above
		System.out.println(random);
		// 11. Repeat steps 1 to 10 ten times
		for (int i = 0; i < 11; i++) {

			// 1. Ask the user for a guess using a pop-up window, and save their response
			String guess = JOptionPane.showInputDialog("Pick a number between 1 and 100");
			// 4. Convert the users’ answer to an int (Integer.parseInt(string))
			int number = Integer.parseInt(guess);
			// 5. if the guess is correct
			// 6. Win
			if (number == random) {
				JOptionPane.showMessageDialog(null, "You win!");
				System.exit(0);
			}
			// 11. Use "System.exit(0);" to quit the game if the user guessed the right
			// answer.
			else if (number > random) {
				JOptionPane.showMessageDialog(null, "Your guess is to high");
			}
			// 7. if the guess is high
			// 8. Tell them it's too high
			// 9. if the guess is low
			else {
				JOptionPane.showMessageDialog(null, "Your guess is too low");
			}
			// 10. Tell them it's too low
		}
		// 12. Tell them they lose
		JOptionPane.showMessageDialog(null, "You lose");

	}

}
