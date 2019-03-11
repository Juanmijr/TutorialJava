package Capítulo3;

import javax.swing.JOptionPane;

public class Juegodeazar {

	public static void main(String[] args) {
	int numeroPensado = (int) Math.round(Math.random ()* 100);
	int tirada;
	
	do {
		//PEDIMOS NÚMERO
		tirada= Integer.parseInt(JOptionPane.showInputDialog("Busca el número pensado (0-100)"));
		//INTERACTUAMOS CON EL USUARIO
		if (tirada>numeroPensado) {
			JOptionPane.showMessageDialog(null,"Te has pasado, inténtelo de nuevo");
		}
			else {
				if (tirada<numeroPensado) {
					JOptionPane.showMessageDialog(null,"Te has quedado corto, inténtelo de nuevo"); 
				}
				else {
				JOptionPane.showMessageDialog(null,"ENHORABUENA LO HAS ACERTADO");
				}
		}
	
	} while (tirada != numeroPensado);
 
	}

}
