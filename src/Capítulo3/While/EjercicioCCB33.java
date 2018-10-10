package Capítulo3.While;

import javax.swing.JOptionPane;

public class EjercicioCCB33 {

	public static void main(String[] args) {
		int numero = 1, mayor = 0;
		String mensaje = "Introduzca número (0 -> Terminar)";
		numero= Integer.parseInt(JOptionPane.showInputDialog(mensaje));
		mayor=numero;
		while (numero != 0) {
				numero = Integer.parseInt(JOptionPane.showInputDialog(mensaje));
				numero = mayor;
			if (mayor>numero) {
				numero= mayor;
			}
			else { // Resto de iteraciones
				numero = Integer.parseInt(JOptionPane.showInputDialog(mensaje));
				if (numero < mayor && numero != 0) {
					mayor = numero;
				}
			}	
		}
		
		JOptionPane.showMessageDialog(null, "Mayor: " + mayor);

	}

}
