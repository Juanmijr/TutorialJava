package Cap�tulo3;

import javax.swing.JOptionPane;

public class EjercicioCCB31 {

	public static void main(String[] args) {
		int numero = -1, acumuladorsuma = 0, resultadosuma=0;
		String mensaje = "Introduzca n�mero (0 -> Terminar)";
		
		for (int i = 0; numero != 0; i++) {
			if (i == 0) { // Primera iteraci�n
				numero = Integer.parseInt(JOptionPane.showInputDialog(mensaje));
				acumuladorsuma= numero;
			}
			else { // Resto de iteraciones
				numero = Integer.parseInt(JOptionPane.showInputDialog(mensaje));
				if (numero != 0) {
					resultadosuma= numero + acumuladorsuma;
				}
			}	
		}
		
		JOptionPane.showMessageDialog(null, "La suma de tus n�meros es igual: " + resultadosuma);
	}
}