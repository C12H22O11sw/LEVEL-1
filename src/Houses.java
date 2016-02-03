import java.util.Random;

import org.approvaltests.reporters.windows.TortoiseDiffReporter;
import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;

public class Houses {
	static void drawPointyRoof(){
		Tortoise.turn(45);
		Tortoise.move(22);
		Tortoise.turn(90);
		Tortoise.move(22);
		Tortoise.turn(45);
	}
	static void drawFlatRoof(){
		Tortoise.turn(90);
		Tortoise.move(30);
		Tortoise.turn(90);
	}
	static void drawHouse (String heightString,String color){
		int height = 0;
		int rand = new Random().nextInt(2);
		if(heightString.equals("small")){height=60;}
		else if(heightString.equals("medium")){height=120;}
		else if(heightString.equals("large")){height=250;}
		else{}
		if(color.equals("red")){Tortoise.setPenColor(Colors.Reds.Red);}
		else if(color.equals("orange")){Tortoise.setPenColor(Colors.Oranges.Orange);}
		else if(color.equals("yellow")){Tortoise.setPenColor(Colors.Yellows.Yellow);}
		else if(color.equals("green")){Tortoise.setPenColor(Colors.Greens.Green);}
		else if(color.equals("blue")){Tortoise.setPenColor(Colors.Blues.Blue);}
		else if(color.equals("purple")){Tortoise.setPenColor(Colors.Purples.MediumPurple);}
		else{}
		Tortoise.move(height);
		
		if(rand==0){
			drawPointyRoof();
		}
		else{drawFlatRoof();}
		Tortoise.move(height);
		Tortoise.turn(-90);
		Tortoise.setPenColor(Colors.Greens.DarkGreen);
		Tortoise.move(15);
		Tortoise.turn(-90);
		}
	public static void main(String[] args) {
		Tortoise.setSpeed(10);
		Tortoise.turn(90);
		
			Tortoise.setPenColor(Colors.Grays.Black);
			Tortoise.setX(0);
			Tortoise.setY(200);
			Tortoise.setPenWidth(1000);
			Tortoise.move(1000);
			
			
		
		
		Tortoise.setX(30);
		Tortoise.setY(410);
		Tortoise.turn(-90);
		Tortoise.setPenWidth(2);
	
		drawHouse("large","red");
		drawHouse("medium","green");
		drawHouse("small","blue");
		drawHouse("large","orange");
		drawHouse("medium","yellow");
		drawHouse("small","blue");
		drawHouse("large","yellow");
		drawHouse("medium","purple");
		drawHouse("small","blue");
		int bla = 0;
		while(bla<500){
			
			bla++;
			int randomX = new Random().nextInt(600);
			int randomY = new Random().nextInt(400);
			Tortoise.setPenColor(Colors.Whites.White);
			Tortoise.setX(randomX);
			Tortoise.setY(randomY);
			Tortoise.move(1);
		}


		
	}


}
