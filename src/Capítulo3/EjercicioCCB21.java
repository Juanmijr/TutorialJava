package Cap�tulo3;

import javax.swing.JOptionPane;

public class EjercicioCCB21 {

	public static void main(String[] args) {
		int numero = 1, mayor = 0, menor=99999999, a=0;
			String mensaje = "Introduzca n�mero ";
			a = Integer.parseInt(JOptionPane.showInputDialog("�Cu�ntos n�meros quieres introducir?"));
			for (int i = 0; i<(a); i++) {
				if (i == 0) { // Primera iteraci�n
					mayor = Integer.parseInt(JOptionPane.showInputDialog(mensaje));
					numero = mayor;
				}
				else { // Resto de iteraciones
					numero = Integer.parseInt(JOptionPane.showInputDialog(mensaje));
					if (numero < mayor && numero != 0) {
						menor=numero;}
					if (numero > mayor && numero != 0) {
						mayor = numero;
						}
					
						}
						
			}
			
			JOptionPane.showMessageDialog(null, "Mayor: " + mayor + " Menor: " + menor );
		}

	}


