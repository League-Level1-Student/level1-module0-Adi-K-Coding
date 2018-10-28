import javax.swing.JButton;
import javax.swing.JFrame;

public class JackInTheBox {

	public static void main(String[] args) {

	}

	public void jackInTheBox() {
		JFrame frame = new JFrame();
		frame.setVisible(true);
		JButton button = new JButton("Surprise!");
		frame.add(button);
		button.setVisible(true);

	}
}
