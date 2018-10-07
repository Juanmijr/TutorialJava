package Capítulo3;
import javax.swing.JOptionPane;

public class EjercicioCCB12 {

	public static void main(String[] args) {
		int a = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántos números quieres introducir?"));  
		int i,acumuladordenum = 0;
		for (i = 1; i < (a+1); i++) {
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un número " + i));
		
		if (numero>10) {
			acumuladordenum += numero;
		}
			}
		JOptionPane.showMessageDialog(null,"Total acumulado " + acumuladordenum);
	}

	}

