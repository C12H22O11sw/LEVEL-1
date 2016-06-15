import java.util.Random;

public class Vault {
	int seceretCode = new Random().nextInt(1000000);

	boolean tryCode(int attemptCode){
		if(attemptCode == seceretCode){
			System.out.println("true");
			return true;
		}
		else{
			System.out.println("false");

			return false;
		}
	}
	Vault (){}
	Vault (boolean isUncrackable){
		if(isUncrackable){
			seceretCode *= -1;
		}
	}
	public static void main(String[] args) {
		Vault vault = new Vault();
		vault.tryCode(1000);
	}
}


