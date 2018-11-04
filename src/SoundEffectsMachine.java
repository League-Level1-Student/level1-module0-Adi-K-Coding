import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SoundEffectsMachine {
	public static void main(String[] args) {
		SoundEffectsMachine SEM = new SoundEffectsMachine();
SoundEffectsMachine();
	}

	public static void SoundEffectsMachine() {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.add(panel);
		JButton button1 = new JButton("Sound One");
		JButton button2 = new JButton("Sound Two");
		JButton button3 = new JButton("Sound Three");
		JButton button4 = new JButton("Sound Four");
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		panel.add(button4);
	frame.pack();
	}
}
