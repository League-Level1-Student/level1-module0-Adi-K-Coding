
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 1
 */

import java.applet.AudioClip;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class DrumKit implements MouseListener {

	JLabel drumLabelWithImage;

	public static void main(String[] args) throws Exception {
		new DrumKit().getGoing();
	}

	private void getGoing() throws MalformedURLException {
		// 1. Make a JFrame variable and initialize it using "new JFrame()"
		JFrame yeet = new JFrame();
		// 2. Make the frame visible and
		// set its default close operation to JFrame.EXIT_ON_CLOSE
		yeet.setVisible(true);
		yeet.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		;
		// 3. Set the size of the frame
		yeet.setSize(800, 600);
		// 4. Set the title of the frame
		yeet.setTitle("Drums to Click On");
		// 5. Make a JPanel variable and initialize it using "new JPanel().
		JPanel yeetspanel = new JPanel();
		// 6. Add the panel to the frame. (The panel is invisible.)
		yeet.add(yeetspanel);
		yeetspanel.setVisible(true);
		// 7. Download an image of a drum from the Internet. Drop it into your Eclipse
		// project under "default package".
		// 8. Put the name of your image in a String variable.
		String drumimage = "Drumthingy.jpg";
		// 9. Edit the next line to use your String variable
		drumLabelWithImage = createLabelImage(drumimage);

		// 10. Add the image to the panel
		yeetspanel.add(drumLabelWithImage);
		// 11. Set the layout of the panel to "new GridLayout()"
		yeet.setLayout(new GridLayout());
		// 12. call the pack() method on the frame. Run your program. Do you see your
		// drum image?
		yeet.pack();
		// 13. add this mouse listener to drumLabelWithImage

		drumLabelWithImage.addMouseListener(this);
		// 18. Add more images to make a drumkit. Remember to add this mouse listener to
		// each one.
	
		String drumimage2 = "Cymbalthingy.jpeg";
		// 9. Edit the next line to use your String variable
		JLabel drumLabelWithImage2;
		drumLabelWithImage2 = createLabelImage(drumimage2);

		// 10. Add the image to the panel
		yeetspanel.add(drumLabelWithImage2);
		
		// 12. call the pack() method on the frame. Run your program. Do you see your
		// drum image?
		yeet.pack();
		// 13. add this mouse listener to drumLabelWithImage

		drumLabelWithImage2.addMouseListener(this);
	}

	public void mouseClicked(MouseEvent e) {
		// 14. Print "mouse clicked" to the console. Run your program and watch the
		// console to see when this is printed.
System.out.println("Mous Cliked");
		JLabel drumClicked = (JLabel) e.getSource(); // This line gets the label that the mouse clicked on
if(drumClicked==drumLabelWithImage) {
	playSound("DrumSound1.wav");
}else {
	playSound("cymbal.wav");
}
		// 15. Download a drum sound and drop it into your "default package". You can
		// find it on freesound.org. To download it, log in as
		// leagueofamazing/code4life.
		// 16. If they clicked on the drumImage...

		// 17. ...use the playSound method to play a drum sound. Test to see if it works

	}

	private JLabel createLabelImage(String fileName) throws MalformedURLException {
		URL imageURL = getClass().getResource(fileName);
		if (imageURL == null) {
			System.err.println("Could not find image " + fileName);
			return new JLabel();
		}
		Icon icon = new ImageIcon(imageURL);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	private void playSound(String fileName) {
		AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
		sound.play();
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

}
