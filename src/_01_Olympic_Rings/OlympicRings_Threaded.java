package _01_Olympic_Rings;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class OlympicRings_Threaded extends Thread {
	// Make A Program that uses Threads and robots to draw the Olympic rings. One robot should draw one ring simultaneously with the other 4 robots.
	Robot robo = new Robot();
	OlympicRings_Threaded(int v){
		switch(v) {
		case 0:
			robo.setPenColor(Color.blue);
			robo.setX(240 * (v + 1));
			robo.setY(400);
			break;
		case 1:
			robo.setPenColor(Color.black);
			robo.setX(240 * (v + 1));
			robo.setY(400);
			break;
		case 2:
			robo.setPenColor(Color.red);
			robo.setX(240 * (v + 1));
			robo.setY(400);
			break;
		case 3: 
			robo.setPenColor(Color.yellow);
			robo.setX(75 * (v + 1));
			robo.setY(450);
			break;
		case 4:
			robo.setPenColor(Color.green);
			robo.setX(125 * (v + 1));
			robo.setY(450);
			break;
		}
		
		robo.penDown();
		robo.setSpeed(10);
	}
	public void run() {
		int degree = 0;
		while (degree <= 360) {
			robo.move(1);
			robo.turn(1);
			degree++;
		}
		
	}
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			new OlympicRings_Threaded(i).start();
		}
	}
}

