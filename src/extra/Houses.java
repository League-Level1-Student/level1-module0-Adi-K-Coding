package extra;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	static Robot bob = new Robot();

	public static void main(String[] args) {

		bob.hide();
		bob.setSpeed(1000);
		bob.setX(100);
		bob.setY(500);

		// for (int i = 0; i < 10; i++) {
		// String house = JOptionPane.showInputDialog("How tall do you want the house to
		// be?");
		// int houseint = Integer.parseInt(house);
		// house(houseint);
		// }
		for (int i = 0; i < 10; i++) {
			String size = JOptionPane
					.showInputDialog("What size do you want the house to be(small, medium, or large)?");
house(size);
		}
	}

	public static void house(String size) {
		int height = 0;
		if (size.equalsIgnoreCase("small")) {
			height = 60;
		}else if (size.equalsIgnoreCase("medium")) {
			height = 120;
		}else if(size.equalsIgnoreCase("large")) {
			height = 180;
		}
		bob.penDown();
		bob.move(height);
		bob.turn(45);
		bob.move(30);
		bob.turn(90);
		bob.move(30);
		bob.turn(45);
		bob.move(height);
		bob.turn(-90);
		bob.move(20);
		bob.turn(-90);
	}
}
