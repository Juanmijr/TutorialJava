package Cap�tulo3;

import javax.swing.JOptionPane;

public class EjercicioCCB23 {

	public static void main(String[] args) {
	int numero = Integer.parseInt(JOptionPane.showInputDialog("Introduzca n�mero"));;
		
		for (int i = 1; (numero*i) < 101; i++) {
			
				System.out.println(numero + "x" + (i) + " = " + (numero*i));
		
		}
	}
}

	


