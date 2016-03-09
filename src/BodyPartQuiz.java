import java.awt.Frame;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class BodyPartQuiz {

	// Get 3 celebrity photos from the internet, save them to your computer, and fill
	// in their paths here. To get the path, right click on the image, and copy its Location.
	String firstImage = "/Users/league/Desktop/Donald_Trump.jpg";
	String secondImage = "/Users/league/Desktop/Einstein.jpg";
	String thirdImage = "/Users/league/Desktop/Philip_Johnson.jpg";

	Frame window = new Frame();
	
	private void startQuiz() {
		// Set the size of the window so that you can only see part of the image.
		window.setSize(1000, 1000);
		//window.add( firstImage);
		 //showNextImage();
		window.pack();
		// Make an int variable to hold the score.
		int score = 0;
		// Ask the user who this person is and store their answer
		String person= JOptionPane.showInputDialog(window,"Who is this? (He is running for president)");
		
		// If they got the answer right:
		if(person.equals("Donald Trump")){ JOptionPane.showMessageDialog(null, "correct"); score++;}

		else{ JOptionPane.showMessageDialog(null, "Wrong");}
		
		
		
		
		
		showNextImage();
		String personTwo= JOptionPane.showInputDialog("Who is this? (E = mc2)");
		if(personTwo.equals("Albert Einstein")){ JOptionPane.showMessageDialog(null, "correct"); score++;}

		else{ JOptionPane.showMessageDialog(null, "Wrong");}
		
		
		
		
		
		
		showNextImage();
		String personThree= JOptionPane.showInputDialog("Who is this? (this is very very hard)");
		if(personThree.equals("Philip Johnson")){ JOptionPane.showMessageDialog(null, "correct"); score++;}
		
		else{JOptionPane.showMessageDialog(null, "Wrong");}
		JOptionPane.showMessageDialog(null, "your score is "+ score);
		// Otherwise:
		// -- Tell them they are wrong
		
		// Use the method below to show the next image
		// Show the score
		// .... repeat for all your images.....
	}

	public void showNextImage() {
		window.removeAll();
		window.add(getNextImage());
		window.pack();
	}

	public static void main(String[] args) {
		BodyPartQuiz quiz = new BodyPartQuiz();
		quiz.initializeGui();
		quiz.startQuiz();
	}

	private void initializeGui() {
		initializeImageList();
		imageIterator = imageList.iterator();
		window.setVisible(true);
		showNextImage();
	}

	private JLabel loadImage(String fileName) {
		Icon icon = new ImageIcon(fileName);
		JLabel image = new JLabel(icon);
		return image;
	}

	ArrayList<JLabel> imageList = new ArrayList<JLabel>();
	Iterator<JLabel> imageIterator;

	private void initializeImageList() {
		JLabel imageLabel = loadImage(firstImage);
		imageList.add(imageLabel);
		imageLabel = loadImage(secondImage);
		imageList.add(imageLabel);
		imageLabel = loadImage(thirdImage);
		imageList.add(imageLabel);
	}

	private JLabel getNextImage() {
		if (imageIterator.hasNext())
			return imageIterator.next();
		window.dispose();
		return new JLabel();
	}
}


