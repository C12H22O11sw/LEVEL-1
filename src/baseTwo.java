import javax.swing.JOptionPane;
import javax.xml.crypto.dsig.Transform;

public class baseTwo {
	public static void main(String[] args) {
		baseTwo thing = new baseTwo();
		String startString = JOptionPane.showInputDialog("what word do you want to transform?");
		
		
		for(int i =0; i<startString.length(); i++ ){
			
			thing.transform(getNumberValue(startString,i));
		}
	}
	static int getNumberValue(String letterValue, int possition){
		
		char Char = letterValue.charAt(possition);
		System.out.println(Char);
		return (int)Char;
	}
	static void transform(int startNumber){
		System.out.println(startNumber);
		int finalNumber =0;
		int modifiedNumber=startNumber;
		for(int i = 9; i>=0; i--){
			if(Math.pow(2, i)<=modifiedNumber){
	
				finalNumber+=Math.pow(10, i);
				modifiedNumber-=Math.pow(2, i);
			}
			
		}
		System.out.println(finalNumber);
		
		
	}
}
