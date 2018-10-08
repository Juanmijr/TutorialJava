package Capítulo3;

import javax.swing.JOptionPane;

public class EjercicioCCB23 {

	public static void main(String[] args) {
	int numero = Integer.parseInt(JOptionPane.showInputDialog("Introduzca número"));;
		
		for (int i = 0; i < 101; i++) {
			if ((numero% i)=0){
				System.out.println("El número " + (i) + " es múltiplo de " + numero);
				}
			else{
					System.out.println("El número " + (i) + " no es múltiplo de " + numero);
				}
			}
		}
	}


	


