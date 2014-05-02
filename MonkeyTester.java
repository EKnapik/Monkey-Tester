
import java.awt.*;
import java.awt.event.*;
/**
 * @author EKnapik
 *
 */
public class MainBot {

	/**
	 * @param args
	 * @throws AWTException 
	 */
	public static void main(String[] args) throws AWTException{
		//constantPress();
		randomPress();
		//notepadType();
	}
	
	public static void randomPress() throws AWTException{
		Robot myRobot = new Robot();
		for(int i  = 0; i<100; i++){
	        myRobot.delay(100);
	        int xran = 0 + (int)(Math.random()*1000);
	        int yran = 0 + (int)(Math.random()*1000);
	        myRobot.mouseMove(xran, yran);
	        myRobot.mousePress(InputEvent.BUTTON1_MASK);
	        myRobot.mouseRelease(InputEvent.BUTTON1_MASK);
	    }
	}
	
	public static void constantPress() throws AWTException{
		
		Robot myRobot = new Robot();
		//Wait for 3 seconds before pressing
		myRobot.delay(3000);
		for(int i = 0; i < 3000; ++i){
			myRobot.mousePress(InputEvent.BUTTON1_MASK);
	        myRobot.mouseRelease(InputEvent.BUTTON1_MASK);
		}
	}
	
	public static void notepadType() throws AWTException{
		Robot robot = new Robot();
        // Creates the delay of 5 sec so that you can open notepad before
        // Robot start writting
        robot.delay(5000);
        robot.keyPress(KeyEvent.VK_H);
        robot.keyPress(KeyEvent.VK_I);
        robot.keyPress(KeyEvent.VK_SPACE);
        robot.keyPress(KeyEvent.VK_B);
        robot.keyPress(KeyEvent.VK_U);
        robot.keyPress(KeyEvent.VK_D);
        robot.keyPress(KeyEvent.VK_Y);
	}

}


/**
 * InputEvent.BUTTON1_MASK  //left button
 * InputEvent.BUTTON2_MASK  //middle button
 * InputEvent.BUTTON3_MASK  //right button
 * 
 **/ 
