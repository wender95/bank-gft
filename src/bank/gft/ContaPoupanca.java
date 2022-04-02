package bank.gft;


public class ContaPoupanca extends Conta {

	public ContaPoupanca(Cliente titular, Agencia agencia) {
		super(titular, agencia);
	}

	@Override
	public boolean transfere(double valor, Conta destino) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean saca(double valor) {
		// TODO Auto-generated method stub
		throw new RuntimeException ("Não é possivel realizar um saque da Conta Poupança");
	}


	@Override
	public void extrato() {
		System.out.println("\n***********EXTRATO**********" + "\nTitular: " + getTITULAR().getNome() + "\nConta: "
				+ getNumero() + "\nAgencia: " + getAgencia() + "\nSaldo em conta:" + getSaldo() );
	}
}
