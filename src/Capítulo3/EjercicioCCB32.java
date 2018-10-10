package Capítulo3;

import javax.swing.JOptionPane;

public class EjercicioCCB32 {

	public static void main(String[] args) {
		int numero = 1, resultadosuma=0, acumulador=0;
		String mensaje = "Introduzca número (0 -> Terminar)";
		
		for (; numero != 0;) {
				numero = Integer.parseInt(JOptionPane.showInputDialog(mensaje));
				resultadosuma = resultadosuma + numero;
				acumulador++;
				
			}
			
		JOptionPane.showMessageDialog(null, "La media de tus números es: " + ((float)(resultadosuma) / (acumulador-1)));
	}
}
	
