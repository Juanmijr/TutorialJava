package Cap�tulo2;
import javax.swing.JOptionPane;

public class Pruebacalculadora {
	
	public static void main(String[] args) {
		String menu = "\t\tMENU\n"
				+ "1.- Suma de dos n�meros\n"
				+ "2.- Resta de dos n�meros";
		int num1, num2; 	
		int opcion= Integer.parseInt(JOptionPane.showInputDialog(menu));
		

		switch (opcion) {
		case 1:
			num1 = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el primer n�mero"));
			num2 = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el segundo n�mero"));
	JOptionPane.showMessageDialog(null, "Resultado: " + (num1 + num2));	
	break;
		case 2:
			num1 = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el primer n�mero"));
			num2 =  Integer.parseInt(JOptionPane.showInputDialog("Introduzca el primer n�mero"));
		JOptionPane.showMessageDialog(null, "Resultado: " + (num1 - num2));
		break;
		case 3:
			
		}
		
		

	}


	}
