package bank.gft;

import java.util.Scanner;

public class Emprestimo {
	
	private double valor;
	private double entrada;
	
	private int parcelas;
	private double taxaDeJuros = 0.0299;
	
	
	Scanner scan = new Scanner (System.in);
	
	public Emprestimo() {
		simulaEmprestimo();
	}
	
	
	

	public void simulaEmprestimo() {
		System.out.println("Insira o valor do emprestimo");
		valor = scan.nextDouble();
		System.out.println("Insira o valor da entrada");
		entrada = scan.nextDouble();
		System.out.println("Insira o numero de parcelas");
		parcelas = scan.nextInt();
		
		
		if(entrada < valor*0.20) {
			throw new RuntimeException("Valor da entrada inferior ao minimo de 20%");
			
		}else if(parcelas < 2){
			throw new RuntimeException("Numero de parcelas inferior ao minimo de 2");
			
		}else {
			double valorEmprestado = valor - entrada;
			double jurosEmprestimo = (valorEmprestado) * (taxaDeJuros*parcelas);
			double totalAPagar = valorEmprestado + jurosEmprestimo;
			System.out.println("Valor do emprestimo: R$ " + valor +"\nValor da entrada: R$ " + entrada + 
					"\nNumero de parcelas: " + parcelas + "\nValor das parcelas: " + totalAPagar/parcelas +
					"\nValor total a pagar: R$ " + totalAPagar );
		}
		
		
	}

}
