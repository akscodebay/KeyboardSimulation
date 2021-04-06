import java.awt.Robot;
import java.awt.event.KeyEvent;


public class KeyboardSimulation {

	public static void main(String[] args) {
		
		try {
			Robot robot = new Robot();
			System.out.print("Simulation Started");
			while(true) {
				robot.keyPress('.');
				robot.keyRelease('.');
				Thread.sleep(5000);
				robot.keyPress(KeyEvent.VK_BACK_SPACE);
				robot.keyRelease(KeyEvent.VK_BACK_SPACE);
				Thread.sleep(5000);
			}
		} catch (Exception e) {
			System.err.println(e);
		}
		
		
	}

}
