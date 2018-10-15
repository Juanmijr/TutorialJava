package Capítulo3;

import javax.swing.JOptionPane;

public class Juegoparesynones {

	public static void main(String[] args) {
		int eleccion= Integer.parseInt(JOptionPane.showInputDialog("ELIJA PARES (0) o NONES (1)"));
		int numerohumano= Integer.parseInt(JOptionPane.showInputDialog("INTRODUZCA TU NÚMERO"));
		int numeromanoderecha = (int) (Math.random() * 5);
		int numeromanoizquierda = (int) (Math.random()* 5);
		int suma= (numeromanoderecha + numeromanoizquierda) + numerohumano;
		JOptionPane.showMessageDialog(null,"LA PC HA SACADO: " + (numeromanoizquierda+numeromanoderecha));
		if ((suma % 2) == 0 && eleccion==0){
			JOptionPane.showMessageDialog(null, "HAS GANADO");
		}
		if((suma % 2) !=0 && eleccion==0) {
			JOptionPane.showMessageDialog(null, "HAS PERDIDO");
		}
		
		if((suma % 2) ==0 && eleccion!=0) {
			JOptionPane.showMessageDialog(null, "HAS PERDIDO");
		}
		if((suma % 2) !=0 && eleccion !=0) {
			JOptionPane.showMessageDialog(null, "HAS GANADO");
		}

	}

}
