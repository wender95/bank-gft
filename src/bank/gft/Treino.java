package bank.gft;

import javax.swing.JOptionPane;

public class Treino {
	public static void main(String[] args) {
		
		boolean continuaLooping = true;


		do {
			String a = JOptionPane.showInputDialog("Numerador: ");
			String b = JOptionPane.showInputDialog("Denominador");
			try {
				int resultado = dividir(Integer.parseInt(a), Integer.parseInt(b));
			
				System.out.println("resultado : " + resultado);
				continuaLooping = false;
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Entrada invilida" + e.getMessage());
				// e.printStackTrace();
			} catch (ArithmeticException e) {
				JOptionPane.showMessageDialog(null, "Não é pssivel dividir por 0");
			}
			
			finally {
				System.out.println("x");
			}
		}while(continuaLooping);

	}

	public static int dividir(int a, int b) {
		return a / b;
	}

}
