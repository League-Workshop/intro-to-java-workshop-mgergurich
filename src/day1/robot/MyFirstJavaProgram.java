package day1.robot;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	public static void main(String[] args) {

		// START HERE
		Robot Mily = new Robot();
		Mily.sparkle();
		Mily.penDown();
		Mily.setSpeed(10);
		Mily.setRandomPenColor();
		Mily.setPenWidth(100);
		for (int i = 0; i < 10; i++) {
			Mily.move(100);
			Mily.turn(360/10);
		}

	}
}
