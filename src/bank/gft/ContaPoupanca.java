package bank.gft;


public class ContaPoupanca extends Conta {

	public ContaPoupanca(Cliente titular, Agencia agencia) {
		super(titular, agencia);
	}

	@Override
	public boolean transfere(double valor, Conta destino) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean saca(double valor) {
		// TODO Auto-generated method stub
		System.out.println("Não é possivel realizar um saque da Conta Poupança");
		return false;
	}


}
