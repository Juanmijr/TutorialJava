package Capítulo3;

import javax.swing.JOptionPane;

public class EjercicioCCB36 {

	public static void main(String[] args) {
		int num=-1;
		String tablaMultiplicar= "";
		for (i=0; num !=0;) {
			num=Integer.parseInt(JOptionPane.showInputDialog("INTRODUZCA UN NÚMPERO (0-> SALIR)"));
			if (num !=0) {
				tablaMultiplicar = "";
			for (int j=1; j<11; j++) {
				tablaMultiplicar+= num + " x " + j + " = " + (num * j) + "\n";
			}
			}
		}
		JOptionPane.showMessageDialog(null, tablaMultiplicar);
	}

}
