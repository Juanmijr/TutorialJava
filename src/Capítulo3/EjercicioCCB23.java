package Cap�tulo3;

import javax.swing.JOptionPane;

public class EjercicioCCB23 {

	public static void main(String[] args) {
	int numero = Integer.parseInt(JOptionPane.showInputDialog("Introduzca n�mero"));;
		
		for (int i = 0; i < 101; i++) {
			if ((numero% i)=0){
				System.out.println("El n�mero " + (i) + " es m�ltiplo de " + numero);
				}
			else{
					System.out.println("El n�mero " + (i) + " no es m�ltiplo de " + numero);
				}
			}
		}
	}


	


