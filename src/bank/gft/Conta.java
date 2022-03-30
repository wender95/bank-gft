package bank.gft;

import java.util.Scanner;



public abstract class Conta implements IConta {

	private static final int AGENCIA = 123;
	private static int NUMERO_GERAL = 0;
	private int numero;
	private Cliente titular;
	private double saldo;


	public Conta(Cliente titular) {

		Conta.NUMERO_GERAL++;
		this.numero += NUMERO_GERAL;
		System.out.println("Conta criada. \nTitular: " + titular.getNome() + "\nCPF: " + titular.getCpf()
				+ "\nAgencia: " + AGENCIA + "\nNumero: " + numero + "\n");

	}
	
	
	
	public static int getAgencia() {
		return AGENCIA;
	}
	
	public int getNumero() {
		return numero;
	}

	public double deposita(double valor) {
		return this.saldo += valor;

	}

	public boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else  {
			System.out.println("\nSaldo insuficiente");
			return false;
		}
	}

	public boolean transfere(int valor, Conta destino) {

		if (this.saca(valor)) {
			destino.deposita(valor);
			System.out.println("Transferencia realizada");
			return true;
		} else {
			System.out.println("\nSaldo insuficiente");
			return false;
		}

	}
	public double getSaldo() {
		return saldo;
		
	}
	
	public void extrato() {
		this.saca(0.25);
		System.out.println("\n***********EXTRATO**********");
		System.out.println("Agencia: " + getAgencia());
		System.out.println("Conta: " + getNumero());
		System.out.println("Saldo em conta:" + getSaldo());
		
	}
	
	public boolean sacaAutenticado(double valor, int senha) throws Exception {
		if(this.titular.autenticador(senha)) {
			this.saca(valor);
			return true;
		}else {
			return false;
		}
	}
}
