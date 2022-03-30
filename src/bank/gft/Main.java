package bank.gft;

public class Main {
	public static void main(String[] args) {
		Cliente c1 = new Cliente("Wender", "090.250.839-35");
		c1.setSenha(123);
		Conta cc1 = new ContaCorrente(c1);
		Conta cc2 = new ContaCorrente(c1);
		c1.autenticador(123);
		
		
		
	
		
		
		
		
		
	}
	
	
	
}
