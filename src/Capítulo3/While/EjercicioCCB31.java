package Capítulo3.While;

import javax.swing.JOptionPane;

public class EjercicioCCB31 {

	public static void main(String[] args) {
		int numero = -1, acumuladorsuma = 0;
		String mensaje = "Introduzca número (0 -> Terminar)";
		
		while (numero != 0) {
			numero = Integer.parseInt(JOptionPane.showInputDialog(mensaje));
				acumuladorsuma=acumuladorsuma+numero;
			}
		JOptionPane.showMessageDialog(null, "La suma de tus números es igual: " + acumuladorsuma);

				}

		
		
	}


