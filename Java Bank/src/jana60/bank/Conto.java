package jana60.bank;

public class Conto {
	private int numeroConto;
	private String nomeProprietario;
	private int saldo;
	
	public Conto(int numeroConto, String nomeProprietario ) {
		this.numeroConto = numeroConto;
		this.nomeProprietario = nomeProprietario;
		saldo = 0;
	}
	
	public int getNumeroConto() {
		return numeroConto;
	}
	
	public int getSaldo() {
		return saldo;
	}
	
	public String getNomeProprietario() {
		return nomeProprietario;
	}
	
	public void setNomeProprietario(String nomeProprietario) {
		this.nomeProprietario = nomeProprietario;
	}

	public void addMoney(int money) {
		saldo += money;
	}
	
	public void getMoney(int money) {
		if ((saldo - money) < 0) 
			System.out.println("Quantità richiesta superiore al proprio saldo, saldo attuale: " + getSaldo() + "$");
		else 
			System.out.println("Prelevati dal conto di " + getNomeProprietario() + ": " + (saldo -= money) + "€");
	}
	
	@Override
	public String toString() {
		return "Nome proprietario: " + getNomeProprietario() 
				+ "\nNumero conto: " + getNumeroConto() 
				+ "\nSaldo: " + getSaldo() + "€";
	}
}
