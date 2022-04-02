package bank.gft;


public abstract class Conta implements IConta {

	private static int NUMERO_GERAL = 0;
	private int numero;
	private final Cliente TITULAR;
	private final Agencia AGENCIA;
	private double saldo;


	public Conta(Cliente titular, Agencia agencia) {
		this.TITULAR = titular;
		this.AGENCIA = agencia;
		Conta.NUMERO_GERAL++;
		this.numero += NUMERO_GERAL;
		System.out.println("Conta criada. \nTitular: " + titular.getNome() + "\nCPF: " + titular.getCpf()
				+ "\nAgencia: " + getAgencia() + "\nNumero: " + numero + "\n");
		agencia.getContas().add(this);



	}

	public Cliente getTITULAR() {
		return TITULAR;
	}



	public int getAgencia() {
		return this.AGENCIA.getNumero();
	}



	public int getNumero() {
		return numero;
	}

	public double deposita(double valor) {
		if (valor > 0){
			if (getTITULAR().autenticador()) {
				return this.saldo += valor;
			}

		}else{
			throw  new RuntimeException("O valor do deposito deve ser maior que R$ 0,00");
		} return 0;
	}



	public boolean saca(double valor) {
		if (getTITULAR().autenticador()) {
			if (saldo >= valor) {
				saldo -= valor;
				return true;
			} else{
				return false;
			}
		} throw new RuntimeException("Senha incorreta");
	}
	

	


	public boolean transfere(int valor, Conta destino) {

		if (this.saca(valor) && destino != this) {
			destino.deposita(valor);
			System.out.println("Transferencia realizada");
			return true;
		} else if (destino == this) {
			throw new RuntimeException("Não é possivel trasnferir para a mesma conta");
		}else{
			throw new RuntimeException("Saldo insuficiente");
		}
	}

	public double getSaldo() {
		return saldo;
		
	}
	
	public void extrato() {
		this.saca(0.25);
		System.out.println("\n***********EXTRATO**********" + "\nTitular: " + getTITULAR().getNome() + "\nConta: "
				+ getNumero() + "\nAgencia: " + getAgencia() + "\nSaldo em conta:" + getSaldo() );



		
	}
	


}
