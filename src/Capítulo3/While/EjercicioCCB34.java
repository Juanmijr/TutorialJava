package Capítulo3.While;

import javax.swing.JOptionPane;

public class EjercicioCCB34 {

	public static void main(String[] args) {
		int numero = 1, menor = 0;
		String mensaje = "Introduzca número (0 -> Terminar)";
		numero= Integer.parseInt(JOptionPane.showInputDialog(mensaje));
		menor=numero;
		while (numero != 0) {
				numero = Integer.parseInt(JOptionPane.showInputDialog(mensaje));
				numero = menor;
			if (menor>numero) {
				numero= menor;
			}
			else { // Resto de iteraciones
				numero = Integer.parseInt(JOptionPane.showInputDialog(mensaje));
				if (numero < menor && numero != 0) {
					menor = numero;
				}
			}	
		}
		
		JOptionPane.showMessageDialog(null, "Mayor: " + menor);


	}

}
