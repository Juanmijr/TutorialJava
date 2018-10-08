package Capítulo3;

import javax.swing.JOptionPane;

public class EjercicioCCB24 {

	public static void main(String[] args) {
		int s = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántos números quieres introducir?"));
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Introduzca número"));;
		
		for (int i = 0; i < (s+1); i++) {
			if ((numero % i)=0){
				System.out.println("El número " + (i) + " es múltiplo de " + numero);
				}
			else{
					System.out.println("El número " + (i) + " no es múltiplo de " + numero);
				}
			}
		}

	}

