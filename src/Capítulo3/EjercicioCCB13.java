package Cap�tulo3;
import javax.swing.JOptionPane;

public class EjercicioCCB13 {
	public static void main(String[] args) {
		int negativos=0;
		int positivos=0;
		int a = Integer.parseInt(JOptionPane.showInputDialog("�Cu�ntos n�meros quieres introducir?"));  
		int i = 0;
		for (i = 0; i < (a+1); i++) {
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un n�mero " + (i+1)));
		
		if (numero<0) {
			negativos++;}
			else;{
			positivos++;
			}
		}
			
		JOptionPane.showMessageDialog(null,"N�meros positivos " + positivos);
		JOptionPane.showMessageDialog(null, "N�meros negativos " + negativos);
	}
}


