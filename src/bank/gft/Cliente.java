package bank.gft;

import java.util.Scanner;

public class Cliente  implements Autenticador {
	private String nome;
	private String cpf;
	private int senha;
	
	
	public Cliente(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
		System.out.println("Cliente cadastrado. Nome: " + nome + ", CPF: " + cpf + "\n");
		
		
	}
	

	public String getNome() {
		return nome;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setSenha(int senha) {
		this.senha = senha;
	}

	@Override
	public boolean autenticador() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Insira a senha: ");
		int senha = scan.nextInt();
		if (senha == this.senha) {
			System.out.println("Senha correta");
			
			return true;
		}else {
			System.out.println("Senha invalida. Insira a senha novamente");
			
			return false;

	}
	
	

	}
}



