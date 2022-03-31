package bank.gft;

public class Main {
	public static void main(String[] args) {
		
		Cliente c1 = new Cliente("Wender", "123");
		c1.setSenha(123);
		
		Conta cc1 = new ContaCorrente(c1);
		cc1.deposita(100);
		cc1.saca(110);
		
		
		
		
		
		
	}
	
	
	
}
