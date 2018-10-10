package Capítulo3;

import javax.swing.JOptionPane;

public class EjercicioCCB22 {

	public static void main(String[] args) {
		int numero = 1, mayor = 0, menor=0, a=0;
			String mensaje = "Introduzca número ";
			a = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántos números quieres introducir?"));
			if (a > 0) {
				numero = Integer.parseInt(JOptionPane.showInputDialog(mensaje));
				mayor= numero;
				menor= numero;
			for (int i = 1; i<(a); i++) {
				numero = Integer.parseInt(JOptionPane.showInputDialog(mensaje));
				if(numero>mayor) {
					mayor=numero;
				}
				if (numero < menor) {
					menor = numero;
				}	
				}			
			}
			
			JOptionPane.showMessageDialog(null, "Mayor: " + mayor + " Menor: " + menor );
		}

	}


