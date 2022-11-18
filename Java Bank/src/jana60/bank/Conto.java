package jana60.bank;

public class Conto {
	private int numeroConto;
	private String nomeProprietario;
	private int saldo;
	
	public Conto(int numeroConto, String nomeProprietario ) {
		this.numeroConto = numeroConto;
		this.nomeProprietario = nomeProprietario;
		this.saldo = 0;
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
	
	public boolean getMoney(int money) {
		if (saldo < money) {
			return false;
		}
		
		saldo -= money;
		return true;
	}
	
	@Override
	public String toString() {
		return "Nome proprietario: " + getNomeProprietario() 
				+ "\nNumero conto: " + getNumeroConto() 
				+ "\nSaldo: " + getSaldo() + "€";
	}
}
