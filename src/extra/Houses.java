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
			String color = JOptionPane.showInputDialog("What color do you want the house to be?");
		//	String roof = JOptionPane.showInputDialog("Do you want the roof to be pointy or flat?");
			house(size, color);
		}
	}

	public static void house(String size, String color) {
		int height = 0;
		if (size.equalsIgnoreCase("small")) {
			height = 60;
		} else if (size.equalsIgnoreCase("medium")) {
			height = 120;
		} else if (size.equalsIgnoreCase("large")) {
			height = 180;
		}

		if (color.equalsIgnoreCase("Blue")) {
			bob.setPenColor(0, 0, 255);
		} else if (color.equalsIgnoreCase("Black")) {
			bob.setPenColor(0, 0, 0);
		} else if (color.equalsIgnoreCase("Green")) {
			bob.setPenColor(0, 255, 0);
		} else if (color.equalsIgnoreCase("White")) {
			bob.setPenColor(255, 255, 255);
		} else if (color.equalsIgnoreCase("Red")) {
			bob.setPenColor(255, 0, 0);
		}
		
		bob.penDown();
		bob.move(height);
		if (size.equalsIgnoreCase("large")) {
			drawFlatRoof();
		} else {
			drawPointyRoof();
		}
		bob.move(height);
		bob.turn(-90);
		bob.move(20);
		bob.turn(-90);

	}

	public static void drawPointyRoof() {
		bob.turn(45);
		bob.move(30);
		bob.turn(90);
		bob.move(30);
		bob.turn(45);
	}

	public static void drawFlatRoof() {
		bob.turn(90);
		bob.move(40);
		bob.turn(90);
	}
}
