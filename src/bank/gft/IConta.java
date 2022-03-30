package bank.gft;

public interface IConta {
	
	public boolean saca(double valor);
	
	public double deposita(double valor);
	
	public boolean transfere(double valor, Conta destino);

}
