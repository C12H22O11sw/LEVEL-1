
public class runnerSmurf {
public static void main(String[] args) {
	Smurf handy= new Smurf("handy");
	handy.eat();
	System.out.println(handy.getName()); 
	
	Smurf Papa=new Smurf("Papa");
	Papa.eat();
	System.out.println( Papa.getName());
	System.out.println(Papa.getHatColor());
	System.out.println(Papa.isGirlOrBoy());
	
	Smurf Smurfette=new Smurf("Smurfette");
	Papa.eat();
	System.out.println( Smurfette.getName());
	System.out.println(Smurfette.getHatColor());
	System.out.println(Smurfette.isGirlOrBoy());
}
}
