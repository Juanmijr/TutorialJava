package Capítulo3;

import javax.swing.JOptionPane;

public class EjercicioCCB24 {

	public static void main(String[] args) {
		int hastanum = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el límite de los múltiplos: "));
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Introduzca número"));;
		
		for (int i = 1; (numero*i) < hastanum; i++) {
			
				System.out.println(numero + "x" + (i) + " = " + (numero*i));
		
		}
	}
}

	
