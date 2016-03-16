import java.awt.Component;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.net.URL;
import java.util.Date;
import java.util.HashMap;
import java.util.Random;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.io.IOException;
public class SimonSaysRecipe extends KeyAdapter {
 
 // Complete steps 1 - 7 before you test
 // 1. Make a JFrame variable 
	JFrame jframe;
 	HashMap<Integer,String> images = new HashMap<Integer, String>();
 	private int imageIndex;
 	private int tries = 0;
 	private int simonSays = 0;
 	Date timeAtStart;
 	private  void makeAlbum() {
 // 2. add 4 images which match keyboard keys like this: images.put(new Integer(KeyEvent.VK_UP), "image.jpg");
 	  	images.put(new Integer(KeyEvent.VK_A), "Akey.jpg");
 	  	images.put(new Integer(KeyEvent.VK_S), "Skey.jpg");
 	  	images.put(new Integer(KeyEvent.VK_D), "Dkey.jpg");
 	  	images.put(new Integer(KeyEvent.VK_F), "Fkey.jpg");
 	  	System.out.println(KeyEvent.VK_A);
 	  	System.out.println(KeyEvent.VK_S);
 	  	System.out.println(KeyEvent.VK_D);
 	  	System.out.println(KeyEvent.VK_F);
// 3. Tell the user to "Press the matching key when 'Simon says' otherwise press a different key"
 JOptionPane.showMessageDialog(jframe, "Press the matching key when 'Simon says' otherwise press a different key");
 // 4. call the method to show an image
 showImage();
 	}
 	int rand = new Random().nextInt(2);
	public void keyPressed(KeyEvent e) {
    	int keyCode = e.getKeyCode();
    	rand = new Random().nextInt(2);
    	// 16. make a points variable to track the score. tell the user their score at the end.
    	int points = 0;
    	//17. if the keyCode matches the imageIndex and "Simon says..."  increase their score
    	System.out.println(keyCode);
    	if(keyCode==imageIndex&&rand==1){
    		
    		speak("correct");
    		points++;
    	}
    	//18.   if the keyCode doesn't match the imageIndex and "Simon didn't say..."  increase their score	
    	else if(keyCode!=imageIndex&&rand==0){
    		speak("correct");
    		points ++;
    	}
    	else{
    		speak("incorrect");
    	}
    	//19. Use the speak method to tell the user if they were correct or not
    	
    	//13. increment tries by 1
    	tries++;
    	//14. if tries is greater than 9 (or however many you want)
    	if(tries>9){
    	//15.    	exit the program
    	System.exit(0);
    	}
    	
    	//11. dispose of the frame
    	jframe.dispose();
    	//12. call the method to show an image
    	showImage();
	}
	private void showImage() {
    	//5. initialize your frame to a new JFrame()
		jframe = new JFrame();
    	//6. set the frame to visible
		jframe.setVisible(true);
		
		jframe.add(getNextRandomImage()); //7. rename to the name of your frame
    	
    	// 8. set the size of the frame 
     	jframe.setSize(1000, 1000);
    	// 9. add a key listener to the frame
     	jframe.addKeyListener(this);
     	//10. Use the speak method to either say "Simon says press this key" or "Press this key"
    	//Hint: use the simonSays int and a random number
     	
     	if(rand == 1){
     		speak("simon says press this key");
     	}
     	else if(rand == 0){
     		speak("press this key");
     	}
     	else{}
	}
	int keyLable (int number){
		if(number == 0){
			return 65;
		}
		else if(number == 1){
			return 83;
		}
		else if(number == 2){
			return 68;
		}
		else if(number == 3){
			return 70;
		}
		else{
			return 0;
		}
		
	}

	private Component getNextRandomImage() {
    	this.imageIndex = keyLable(new Random().nextInt(4));
    	System.out.println(imageIndex);
    	return loadImage(images.get(imageIndex));
	}
	private JLabel loadImage(String fileName) {
    	URL imageURL = getClass().getResource(fileName);
    	Icon icon = new ImageIcon(imageURL);
    	return new JLabel(icon);
	}
  void speak(String words) {
  	  try {
  	   Runtime.getRuntime().exec("say " + words).waitFor();
  	  } catch (Exception e) {
  	   e.printStackTrace();
  	  }
   	}
	public static void main(String[] args) throws Exception {
	 new SimonSaysRecipe().makeAlbum();
	}
}

/* 
* 20. add a timer
* ~~~ where the code starts running ~~~
* timeAtStart = new Date();
*
* ~~~ where the code ends ~~~
* Date timeAtEnd = new Date();
* System.out.println((timeAtEnd.getTime()-timeAtStart.getTime())/1000);
* System.exit(0);
*/


