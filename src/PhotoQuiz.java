
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 1
 */

import java.awt.Component;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public static void main(String[] args) throws Exception {
		JFrame quizWindow = new JFrame();
		quizWindow.setVisible(true);
		quizWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // This will make sure the program exits when you
																	// close the window
int score= 0;
		// 1. find an image on the internet, and put its URL in a String variable (from
		// your browser, right click on the image, and select “Copy Image Address”)
		String imageS = "https://imagesvc.timeincapp.com/v3/fan/image?url=https%3A%2F%2Fthebaltimorewire.com%2Ffiles%2F2015%2F11%2Fmanny-machado-mlb-boston-red-sox-baltimore-orioles.jpg&w=850&h=560&c=sc";
		// 2. create a variable of type "Component" that will hold your image
		Component imageC;
//		// 3. use the "createImage()" method below to initialize your Component
		imageC = createImage(imageS);
		// 4. add the image to the quiz window
		quizWindow.add(imageC);
		// 5. call the pack() method on the quiz window
		quizWindow.pack();
		// 6. ask a question that relates to the image
		String q1 = JOptionPane.showInputDialog("Who is this person?");
		// 7. print "CORRECT" if the user gave the right answer
		System.out.println("Question One");
		if (q1.equalsIgnoreCase("Manny Machado") || q1.equalsIgnoreCase("Manny") || q1.equalsIgnoreCase("Machado")) {
			System.out.println("Correct");
		score = score+1;
		} else {
			System.out.println("Incorrect");
		}

		// 8. print "INCORRECT" if the answer is wrong

		// 9. remove the component from the quiz window (you may not see the effect of
		// this until step 12)
quizWindow.remove(imageC);
		// 10. find another image and create it (might take more than one line of code)
String imageS2 = "https://i.kinja-img.com/gawker-media/image/upload/s---6VrOddb--/c_scale,f_auto,fl_progressive,q_80,w_800/ejggtvjsqzm4x4xp4s6s.jpg";
Component imageC2;
imageC2 = createImage(imageS2);
quizWindow.add(imageC2);
quizWindow.pack();
String q2 = JOptionPane.showInputDialog("Who is this person?");
System.out.println("Question Two");
if (q2.equalsIgnoreCase("Cody Bellinger") || q2.equalsIgnoreCase("Cody") || q2.equalsIgnoreCase("Bellinger")) {
	System.out.println("Correct");
	score = score+1;
} else {
	System.out.println("Incorrect");
}
		// 11. add the second image to the quiz window
System.out.println("You got "+ score+" questions correct.");
		// 12. pack the quiz window

		// 13. ask another question

		// 14+ check answer, say if correct or incorrect, etc.

	}

	private static Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image
	// (imageComponent.addMouseMotionListener())
}
