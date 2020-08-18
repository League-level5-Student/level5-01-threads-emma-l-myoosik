package _02_Advanced_Robot_Race;

import org.jointheleague.graphical.robot.Robot;

public class AdvancedRobotRace extends Thread{
	// Re-do the robot race recipe from level 3 module 0. 
	// This time, use threads to make all of the robots go at the same time.
	Robot robo = new Robot();
	AdvancedRobotRace(int v){
		robo.setX(240 * (v + 1) - 40);
		robo.setY(800);
	}
	
	public void run() {
		boolean winner = false;
		while (!winner) {
			robo.move((int) (Math.random() * 50));
			
			if (robo.getY() <= 50) {
				winner = true;
			}
		}
	}
	
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			new AdvancedRobotRace(i).start();
		}
	}
}
