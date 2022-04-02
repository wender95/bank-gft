package bank.gft;

public class Main {
	public static void main(String[] args) {
		Agencia agencia123 = new Agencia();
		System.out.println(agencia123.getNumero());
		Cliente c1 = new Cliente("Wender", "123");
		Cliente c2 = new Cliente("Izabela", "456");
		c1.setSenha(123);

		Conta cc1 = new ContaCorrente(c1, agencia123);
		Conta cc2 = new ContaCorrente(c2, agencia123);
		cc2.deposita(10);
		cc1.deposita(40);
		cc1.transfere(50, cc2);








		
		
		
		
	}
	
	
	
}
