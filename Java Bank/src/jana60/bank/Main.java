package jana60.bank;

public class Main {

	public static void main(String[] args) {

		Conto user1 = new Conto(1234, "Vincenzo Cafasso");
		
		System.out.println(user1);
		
		System.out.println("\n----------\n");
		
		user1.addMoney(50);
		user1.setNomeProprietario("Paolo Bitta");
		System.out.println(user1);
		
		System.out.println("\n----------\n");
		
		user1.getMoney(30);
		
		System.out.println("\n----------\n");
		
		System.out.println(user1);
		
	}

}
