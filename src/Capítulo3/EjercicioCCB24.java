package Cap�tulo3;

import javax.swing.JOptionPane;

public class EjercicioCCB24 {

	public static void main(String[] args) {
		int s = Integer.parseInt(JOptionPane.showInputDialog("�Cu�ntos n�meros quieres introducir?"));
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Introduzca n�mero"));;
		
		for (int i = 0; i < (s+1); i++) {
			if ((numero % i)=0){
				System.out.println("El n�mero " + (i) + " es m�ltiplo de " + numero);
				}
			else{
					System.out.println("El n�mero " + (i) + " no es m�ltiplo de " + numero);
				}
			}
		}

	}

