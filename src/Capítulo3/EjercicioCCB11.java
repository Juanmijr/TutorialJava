package Cap�tulo3;
import javax.swing.JOptionPane;

public class EjercicioCCB11 {

	public static void main(String[] args) {
	
		int i,acumuladordenum = 0;
		for (i = 1; i < 5; i++) {
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un n�mero " + i));
		
		if (numero>10) {
			acumuladordenum += numero;
		}
			}
		JOptionPane.showMessageDialog(null,"Total acumulado " + acumuladordenum);
	}

}
