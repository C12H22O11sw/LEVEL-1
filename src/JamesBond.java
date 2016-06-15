
public class JamesBond {
	int returnNumber;

	int findCode(Vault thisVault) {

		for (int i = 0; i < 1000000; i++) {
			System.out.println(i);
			if (thisVault.tryCode(i) == true) {
				returnNumber = i;
				i = 10000000;
			} else if (i == 999999) {
				returnNumber = -1;
			}

		}
		System.out.println(returnNumber);
		return returnNumber;

	}

	public static void main(String[] args) {
		Vault vault = new Vault(true);
		JamesBond jamesBond = new JamesBond();
		System.out.println(jamesBond.findCode(vault));
	}

}
