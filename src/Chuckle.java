import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Chuckle implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button1 = new JButton();
	JButton button2 = new JButton();
	public static void main(String[] args) {
		Chuckle chuck = new Chuckle();
		chuck.makeButtons();
	}
	void makeButtons(){

		frame.setVisible(true);
		button1.setText("joke");
		button2.setText("punchline");
		frame.add(panel);
		panel.add(button1);
		panel.add(button2);
		button1.addActionListener(this);
		button2.addActionListener(this);
		frame.pack();
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == button1){
			JOptionPane.showMessageDialog(null, "why did the chicken cross the road?");
		}
		else{
			JOptionPane.showMessageDialog(null, "to get to the other side.");

		}
		//JOptionPane.showMessageDialog(null, "hi");
		
	}
}
