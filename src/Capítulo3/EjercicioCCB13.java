package Capítulo3;
import javax.swing.JOptionPane;

public class EjercicioCCB13 {
	public static void main(String[] args) {
		int negativos=0;
		int positivos=0;
	// PEDIMOS AL USUARIO LOS NÚMEROS QUE QUIERE
		int a = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántos números quieres introducir?"));  
		int i = 0;
		//Bucle para que se repita x veces
		for (i=0; i < (a+1); i++) {
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un número " + (i+1)));
		//Contador de numeros
		if (numero<0) {
			negativos++;
			}
			else;{
			positivos++;
			}
		}
			
		JOptionPane.showMessageDialog(null,"Números positivos " + positivos);
		JOptionPane.showMessageDialog(null, "Números negativos " + negativos);
	}
}


