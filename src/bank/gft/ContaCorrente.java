package bank.gft;

import java.util.Scanner;

public class ContaCorrente extends Conta {
	private double limiteInicial = 100;
	private double limite = limiteInicial;
	private double limiteUtilizado;

	Scanner scan = new Scanner(System.in);

	public ContaCorrente(Cliente titular) {
		super(titular);

	}

	public double getLimite() {
		return limite;
		
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	@Override
	public boolean saca(double valor) {
		if (super.saca(valor)) {
			return true;
		} else if (super.getSaldo() < valor && super.getSaldo() + this.limite >= valor) {
			System.out.println("Utilizar limite em conta? [1] Sim  / [2] Não");
			int usarLimite = scan.nextInt();
				
				if (usarLimite == 1) {
						valor -= super.getSaldo();
						this.limite -= valor;
						this.limiteUtilizado += valor;
						super.saca(super.getSaldo());
						System.out.println("limite em conta utilizado.");
						return true;
					}else {
						throw new RuntimeException("Operação cancelada");
					}
		} else {
			throw new RuntimeException("Limite insuficiente");
		}

	}

	@Override
	public void extrato() {

		super.extrato();
		
		System.out.println("Limite diponivel em conta: R$ " + getLimite());
		System.out.println("Limite utlizado: R$ " + getLimiteUtilizado());
		System.out.println("Limite total: R$ " + getLimiteInicial());
	}

	@Override
	public boolean transfere(double valor, Conta destino) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public double deposita(double valor) {
	
		if (getLimiteUtilizado() > 0 && getLimiteUtilizado() == valor) {
			this.limite += valor;
			this.limiteUtilizado -= valor;
				
		}else if (getLimite() > 0 && getLimiteUtilizado() < valor){
			valor -= getLimiteUtilizado();
			limite+=getLimiteUtilizado();
			this.limiteUtilizado -= getLimiteUtilizado();
			super.deposita(valor);
			
		}else {
			super.deposita(valor);			
			}
			
		return 0;
		}
		

	
	public double getLimiteUtilizado() {
		return limiteUtilizado;
	}
	public double getLimiteInicial() {
		return limiteInicial;
	}
}
