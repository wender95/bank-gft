package bank.gft;

import javax.swing.JOptionPane;

public class Cliente implements Autenticador {
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
	public boolean autenticador(int senha) {
		if (senha == this.senha) {
			System.out.println("Senha autenticada");
			
			return true;
		}else {
			System.out.println("Senha invalida. Insira a senha novamente");
			
			return false;

	}
	
	

	}
}



