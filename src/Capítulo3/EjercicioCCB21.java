package Cap�tulo3;
import javax.swing.JOptionPane;

public class EjercicioCCB21 {

	public static void main(String[] args) {
		int a = Integer.parseInt(JOptionPane.showInputDialog("�Cu�ntos n�meros quieres introducir?"));  
		int i,acumuladordenum = 0;
		for (i = 1; i < (a+1); i++) {
			int numero = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un n�mero " + i));
			acumuladordenum = acumuladordenum + numero;
			}
		JOptionPane.showMessageDialog(null,"La media es " +  ((float)acumuladordenum/a));
	}

	}


