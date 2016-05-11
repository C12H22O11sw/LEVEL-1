
public class baseTwo {
	public static void main(String[] args) {
		baseTwo thing = new baseTwo();
		thing.transform(100);
	}
	void transform(int startNumber){
		int transformedNumber = startNumber;
		int highestByte = 0;
		for(int I = 0; Math.pow(2,I) <startNumber; I++){
		highestByte = I+1;
		System.out.println(I+1);
		}
		for(intI=;I){
			if(transformedNumber>Math.pow(2,highestByte)){
				System.out.print("1");
			}
			else{
				System.out.print("0");
			}
			highestByte--;
			transformedNumber-=Math.pow(2,highestByte);
			
		}
		
	}
}
