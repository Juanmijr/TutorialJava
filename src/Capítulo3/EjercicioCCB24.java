package Cap�tulo3;

import javax.swing.JOptionPane;

public class EjercicioCCB24 {

	public static void main(String[] args) {
		int hastanum = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el l�mite de los m�ltiplos: "));
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Introduzca n�mero"));;
		
		for (int i = 1; (numero*i) < hastanum; i++) {
			
				System.out.println(numero + "x" + (i) + " = " + (numero*i));
		
		}
	}
}

	
