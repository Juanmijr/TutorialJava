package Capítulo3;
import javax.swing.JOptionPane;

public class EjercicioCCB13 {
	public static void main(String[] args) {
		int negativos=0;
		int positivos=0;
		int a = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántos números quieres introducir?"));  
		int i = 0;
		for (i = 0; i < (a+1); i++) {
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un número " + (i+1)));
		
		if (numero<0) {
			negativos++;}
			else;{
			positivos++;
			}
		}
			
		JOptionPane.showMessageDialog(null,"Números positivos " + positivos);
		JOptionPane.showMessageDialog(null, "Números negativos " + negativos);
	}
}


