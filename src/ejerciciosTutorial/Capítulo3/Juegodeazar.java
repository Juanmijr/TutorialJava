package Cap�tulo3;

import javax.swing.JOptionPane;

public class Juegodeazar {

	public static void main(String[] args) {
	int numeroPensado = (int) Math.round(Math.random ()* 100);
	int tirada;
	
	do {
		//PEDIMOS N�MERO
		tirada= Integer.parseInt(JOptionPane.showInputDialog("Busca el n�mero pensado (0-100)"));
		//INTERACTUAMOS CON EL USUARIO
		if (tirada>numeroPensado) {
			JOptionPane.showMessageDialog(null,"Te has pasado, int�ntelo de nuevo");
		}
			else {
				if (tirada<numeroPensado) {
					JOptionPane.showMessageDialog(null,"Te has quedado corto, int�ntelo de nuevo"); 
				}
				else {
				JOptionPane.showMessageDialog(null,"ENHORABUENA LO HAS ACERTADO");
				}
		}
	
	} while (tirada != numeroPensado);
 
	}

}
