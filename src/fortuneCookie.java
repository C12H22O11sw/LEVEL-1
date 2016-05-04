import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class fortuneCookie implements ActionListener {
	
	
	public static void main(String[] args) {
		fortuneCookie f = new fortuneCookie();
		f.thingOne();
		
	}
	void thingOne(){
		//add objects
		JFrame frame = new JFrame();
		JButton b = new JButton();
		frame.add(b);
		b.addActionListener(this);
		
		
		b.setText("press me");
		frame.setVisible(true);
		frame.pack();
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		int rand = new Random().nextInt(4);
		if(rand == 0){
			JOptionPane.showMessageDialog(null, "You will have good fortune.");
		}
		else if(rand == 1){
			JOptionPane.showMessageDialog(null, "You will have bad fortune.");
		}
		else if(rand == 2){
			JOptionPane.showMessageDialog(null, "I have no idea.");
		}
		else if(rand == 3){
			JOptionPane.showMessageDialog(null, "Ask google.");
		}
		
		else{
			JOptionPane.showMessageDialog(null, "Don't ask me, I am just a cookie.");
		}
		
	}
}
