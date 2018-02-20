//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
		// 1. Create a new Robot
		Robot rob = new Robot();
		{

			rob.setSpeed(25);
			rob.penDown();
			for (int i = 0; i < 4; i++) {

				// 3. Ask the user what color they would like the robot to draw
				String color = JOptionPane.showInputDialog("Choose a color");
				// 4. Use an if/else statement to set the pen color that the user requested
				if (color.equalsIgnoreCase("red")) {
					rob.setPenColor(Color.red);
				} else if (color.equalsIgnoreCase("blue")) {
					rob.setPenColor(Color.blue);
				} else if (color.equalsIgnoreCase("green")) {
					rob.setPenColor(Color.green);
				} else {
					rob.setRandomPenColor();
				}
				// 5. If the user doesn’t enter anything, choose a random color

				// 6. Put a loop around your code so that you keep asking the user for more
				// colors & drawing them

				// 4. Set the pen width to 10
				rob.setPenWidth(10);
				// 2. Make the robot draw a shape (this will take more than one line of code)
				for (int x = 0; x < 4; x++) {

					rob.move(150);
					rob.turn(360 / 4); 
				}
			}
		}
	}
}
