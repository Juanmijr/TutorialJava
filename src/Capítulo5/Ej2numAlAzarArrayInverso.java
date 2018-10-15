package Capítulo5;

import javax.swing.JOptionPane;

public class Ej2numAlAzarArrayInverso {

	public static void main(String[] args) {
		int array[]= new int [150];
		int limitearriba= Integer.parseInt(JOptionPane.showInputDialog("INTRODUZCA UN LÍMITE MÁXIMO"));
		int limiteabajo= Integer.parseInt(JOptionPane.showInputDialog("INTRODUZCA UN LÍMITE MÍNIMO"));

			for (int i = 0 ; i<array.length ; i++) {
				array[i]= ((int)Math.round(Math.random()*(limitearriba-limiteabajo)));
			}
				for (int i = 0; i < array.length; i++) {
					System.out.print(array[i] + "  ");
	}
				System.out.println("---------------------------------------------------------------------");
				for (int i = 149; i > array.length; i--) {
					System.out.print(array[i] + "  ");
	}
	}
}
