
public class TeaParty {
	public static void main(String[] args) {
		
	

	}
	public String welcome (String name, boolean gender, boolean sir ){
		String thing = "Hello ";
		if(gender==false&&sir == true){   
			thing+="Sir ";   
		}
		else if(gender ==false){
			thing+="Mr. ";
		}
		else{
			thing+="Ms. ";
		}
		thing+= name;
		return thing;
	}
}
