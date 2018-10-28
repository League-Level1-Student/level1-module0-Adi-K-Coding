import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FortuneCookie implements ActionListener {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FortuneCookie fc = new FortuneCookie();
		fc.showButton();

	}

	public void showButton() {
		System.out.println("Button CLicked");
		JFrame frame = new JFrame();
		frame.setVisible(true);
		JButton button = new JButton("Click here for your fortune.");
		frame.add(button);
		button.addActionListener(this);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setSize(300, 300);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// JOptionPane.showMessageDialog(null, "Woohoo");
		Random numbergen = new Random();
		int num = numbergen.nextInt(5);
		if (num == 0) {
			System.out.println("You will read this and say \"Geez! I could come up with better fortunes than this.\"");
		} else if (num == 1) {
			System.out.println("Error 404, fortune not found");
		} else if (num == 2) {
			System.out.println("When you squeeze an orange, orange juice comes out-because that's what's in an orange.");
		}else if (num == 3) {
			System.out.println("You should probably stop procrastinating, starting tomorrow.");
		}else if (num == 4) {
			System.out.println("You are about to finish reading this fortune...\n\n\n\nSee I told you.");
		}
	}
}
