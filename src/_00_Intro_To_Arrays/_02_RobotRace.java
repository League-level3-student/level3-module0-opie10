package _00_Intro_To_Arrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _02_RobotRace {
    // 1. make a main method
public static void main(String[] args) {
	Robot[] garhy = new Robot[5];
int robx = 50;
        // 2. create an array of 5 robots.

        // 3. use a for loop to initialize the robots.
for (int i = 0; i < garhy.length; i++) {
	garhy[i] = new Robot();
	garhy[i].setX(robx);
	robx = robx+100;
	garhy[i].setY(520);
	garhy[i].setSpeed(150);
	
}
        // 4. make each robot start at the bottom of the screen, side by side, facing up
    
        // 5. use another for loop to iterate through the array and make each robot move
        // a random amount less than 50.
   int count = 0;
while(garhy[count].getY()>0) {
for (int i = 0; i < garhy.length; i++) {
    	Random r = new Random();
    
		garhy[i].move(r.nextInt(150));
		
	}
count +=1;
if (count>=5) {
	count = 0;
}
if (garhy[count].getY()>=0) {
	System.out.println("Winner is robot " +garhy[count]);
	break;
}
}

        // 6. use a while loop to repeat step 5 until a robot has reached the top of the
        // screen.

    
        // 7. declare that robot the winner and throw it a party!
    
        // 8. try different races with different amounts of robots.
    
        // 9. make the robots race around a circular track.
}
}
