
public class Minion {
	String Name;
	int Eyes;
	String Color;
	String Master;
	
	Minion(String name, int eyes, String color, String master){
		this.Eyes = eyes;
		this.Name = name;
		this.Color = color;
		this.Master = master;
		
	}

	public String getName(){	
		return Name;
	}
	public int getEyes(){
		return Eyes;
	}
	public String getColor(){
		return Color;
	}
	public void setMaster(String master){
		
		Master = master;
	}
	public String getMaster(){
		return Master;
	}

}
