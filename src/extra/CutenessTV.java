package extra;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CutenessTV implements ActionListener{
	JButton button1 = new JButton("Ducks");
	JButton button2 = new JButton("Frogs");
	JButton button3 = new JButton("Fluffy Unicorns");
	public static void main(String[] args) {
		CutenessTV CTV = new CutenessTV();
	CTV.runFrame();
		
	}
	public void runFrame () {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.add(panel);
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
	button1.addActionListener(this);
	button2.addActionListener(this);
	button3.addActionListener(this);
	frame.pack();
	}
	
	void showDucks() {
	     playVideo("https://www.youtube.com/watch?v=MtN1YnoL46Q");
	}

	void showFrog() {
	     playVideo("https://www.youtube.com/watch?v=cBkWhkAZ9ds");
	}

	void showFluffyUnicorns() {
	     playVideo("https://www.youtube.com/watch?v=a-xWhG4UU_Y");
	}

	void playVideo(String videoID) {
	     try {
	          URI uri = new URI(videoID);
	          java.awt.Desktop.getDesktop().browse(uri);
	     } catch (Exception e) {
	          e.printStackTrace();
	     }
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton buttonPressed = (JButton) e.getSource();
	if(buttonPressed == button1)	{
		showDucks();
	}else if(buttonPressed == button2) {
		showFrog();
	}else if(buttonPressed == button3) {
		showFluffyUnicorns();
	}
	
	}

}
