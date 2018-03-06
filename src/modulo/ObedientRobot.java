package modulo;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class ObedientRobot {
	static Robot r2d2 = new Robot("mini");

	public static void main(String[] args) {
		String shape = JOptionPane.showInputDialog(null, "Choose a shape");
	}

	static void drawSquare() {
		for (int i = 0; i < 4; i++) {
			r2d2.setSpeed(50);
			r2d2.penDown();
			r2d2.move(20);
			r2d2.turn(360 / 4);
		}

	}

	static void drawTriangle() {
		for (int i = 0; i < 3; i++) {
			r2d2.setSpeed(50);
			r2d2.penDown();
			r2d2.move(20);
			r2d2.turn(360 / 3);
		}
	}

	static void drawCircle() {
		for (int i = 0; i < 360; i++) {
			r2d2.setSpeed(50);
			r2d2.penDown();
			r2d2.move(20);
			r2d2.turn(360 / 360);
		}
	}

}
