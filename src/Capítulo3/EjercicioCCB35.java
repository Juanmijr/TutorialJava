
package Capítulo3;

import javax.swing.JOptionPane;

public class EjercicioCCB35 {

	public static void main(String[] args) {

		int numero = 1, mayor = 0, menor=0;
		String mensaje = "Introduzca número 0->TERMINAR";	
		for (; numero != 0;){
			numero = Integer.parseInt(JOptionPane.showInputDialog(mensaje));
			mayor= numero;
			menor= numero;
			if(numero>mayor) {
				mayor=numero;
			}
			if (numero < menor) {
				menor = numero;
			}	
		}	
		JOptionPane.showMessageDialog(null, "Mayor: " + mayor + " Menor: " + menor );
	}
}



