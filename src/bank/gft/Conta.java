package bank.gft;

import java.util.Scanner;



public abstract class Conta implements IConta {

	private static int NUMERO_GERAL = 0;
	private int numero;
	private Cliente titular;
	private Agencia agencia;
	private int agenciaNumero = agencia.getNumero();
	private double saldo;


	public Conta(Cliente titular, Agencia agencia) {
		this.titular = titular;
		this.agencia = agencia;
		Conta.NUMERO_GERAL++;
		this.numero += NUMERO_GERAL;
		System.out.println("Conta criada. \nTitular: " + titular.getNome() + "\nCPF: " + titular.getCpf()
				+ "\nAgencia: " + agenciaNumero + "\nNumero: " + numero + "\n");



	}
	
	
	
	public  int getAgencia() {
		return this.agenciaNumero;
	}



	public int getNumero() {
		return numero;
	}

	public double deposita(double valor) {
		return this.saldo += valor;

	}

	public boolean saca(double valor) {
		if(saldo >= valor) {
			saldo -= valor;
			return true;
		}else {
			return false;
		}
		
	}
	
		public boolean validaSaque(double valor) {
			if(valor > saldo) {
				throw new RuntimeException("Saldo insuficiente");
				
			}if(valor <= 0) {
				throw new RuntimeException("O valor do saque deve ser maior que R$ 0.00");
			}else {
				return true;
			}
	}
	


	public boolean transfere(int valor, Conta destino) {

		if (this.saca(valor)) {
			destino.deposita(valor);
			System.out.println("Transferencia realizada");
			return true;
		} else {
			throw new RuntimeException("Saldo insuficiente");
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
	
	public boolean sacaAutenticado(double valor, int senha) {
		
			if(this.titular.autenticador(senha)) {
				this.saca(valor);
				return true;
			}else {
				throw new RuntimeException("Senha incorreta");
			}
		
		
		
	}
}
