
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {

		// 1. correct the birthdays for your family below
		String momsBirthday = "November 14th";
		String dadsBirthday = "January 24th";
		String myBirthday = "August 5th";

		// 2. Find out which birthday the user wants and and store their response in a
		// variable
		String Birthday = JOptionPane.showInputDialog("Who's Birthday?");
		// 3. Print out what the user typed
		System.out.println(Birthday);
		// 4. if user asked for "mom"
		if (Birthday.equalsIgnoreCase("mom")) {
			JOptionPane.showMessageDialog(null, momsBirthday);
		}
		// print mom's birthday
		// 5. if user asked for "dad"
		else if (Birthday.equalsIgnoreCase("dad")) {
			JOptionPane.showMessageDialog(null, dadsBirthday);
		}
		// print dad's birthday
		// 6. if user asked for your name
		else if (Birthday.equalsIgnoreCase("mine")) {
			JOptionPane.showMessageDialog(null, myBirthday);
		} else {
			JOptionPane.showMessageDialog(null, "Sorry, I don't remember that person's birthday!");
		}
		// print myBirthday
		// 7. otherwise print "Sorry, i don't remember that person's birthday!"

	}
}
