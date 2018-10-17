package Capítulo5;

import javax.swing.JOptionPane;

public class Ejercicio1B1 {

	public static void main(String[] args) {
		int array[]= new int [150];
		int limitearriba= Integer.parseInt(JOptionPane.showInputDialog("INTRODUZCA UN LÍMITE MÁXIMO"));
		int limiteabajo= Integer.parseInt(JOptionPane.showInputDialog("INTRODUZCA UN LÍMITE MÍNIMO"));

			for (int i = 0 ; i<array.length ; i++) {
				array[i]= ((int)Math.round(Math.random()*(limitearriba-limiteabajo)+ limiteabajo));
			}
				for (int i = 0; i < array.length; i++) {
					System.out.print(array[i] + "  ");
				

	}
			}
}