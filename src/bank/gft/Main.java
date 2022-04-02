package bank.gft;

public class Main {
	public static void main(String[] args) {
		Agencia agencia123 = new Agencia();
		System.out.println(agencia123.getNumero());
		Cliente c1 = new Cliente("Wender", "123");
		Cliente c2 = new Cliente("Izabela", "456");
		c1.setSenha(123);
		c2.setSenha(123);



		Conta cc1 = new ContaCorrente(c1, agencia123);
		Conta cc2 = new ContaCorrente(c2, agencia123);
		Conta cp1 = new ContaPoupanca(c1, agencia123);

		System.out.println(agencia123.getContas());

		cc2.deposita(10);
		cc1.deposita(100);
		cc1.transfere(50, cc2);
		cc1.transfere(20, cp1);

		Emprestimo e1 = new Emprestimo(cc1);
		cc1.extrato();
		cc2.extrato();
		cp1.extrato();







		
		
		
		
	}
	
	
	
}
