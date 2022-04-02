package bank.gft;

public class Main {
	public static void main(String[] args) {
		Agencia agencia123 = new Agencia();
		System.out.println(agencia123.getNumero());
		Cliente c1 = new Cliente("Wender", "123");
		c1.setSenha(123);

		Conta cc1 = new ContaCorrente(c1, agencia123);




		
		
		
		
	}
	
	
	
}
