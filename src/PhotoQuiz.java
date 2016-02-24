 // Copyright Wintriss Technical Schools 2013
import java.awt.Component;
import java.awt.Frame;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public static void main(String[] args) throws Exception {
		Frame quizWindow = new Frame();
		quizWindow.setVisible(true);

		
		String building = "https://upload.wikimedia.org/wikipedia/commons/thumb/c/c7/Empire_State_Building_by_David_Shankbone_crop.jpg/800px-Empire_State_Building_by_David_Shankbone_crop.jpg";

		Component Building;
		Building = createImage(building);
		quizWindow.add(Building);
		quizWindow.pack();
		int points = 0;
		String anser=JOptionPane.showInputDialog("what building is this? it is worth 1 point");
		if(anser.equalsIgnoreCase("Empire state building")){
			JOptionPane.showMessageDialog(null, "well duw");
			points = 1;
		}
		else{
			JOptionPane.showMessageDialog(null, "incorrect");
		}
		quizWindow.remove(Building);
		String willis = "https://upload.wikimedia.org/wikipedia/commons/b/ba/Sears_Tower_ss.jpg";
		Component Willis;
	
		Willis = createImage(willis);

		quizWindow.add(Willis);

		quizWindow.pack();

		String anserWillis=JOptionPane.showInputDialog("what building is this? it is worth 2 point");
		if(anserWillis.equalsIgnoreCase("willis tower")||anserWillis.equalsIgnoreCase("sears tower")){
			JOptionPane.showMessageDialog(null, "correct");
			points+=2;
		}
		else{
			JOptionPane.showMessageDialog(null, "incorrect");
		}
		quizWindow.remove(Willis);
		JOptionPane.showMessageDialog(null, "your score: "+points);

	}

	private static Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}
}

