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
			System.out.println("non ci sono abbastanza soldi sul conto, saldo attuale: " + getSaldo() + "$");
		else 
			saldo -= money;
	}
	
	@Override
	public String toString() {
		return "nome proprietario: " + getNomeProprietario() 
				+ "\nnumero conto: " + getNumeroConto() 
				+ "\nsaldo: " + getSaldo() + "$";
	}
}
