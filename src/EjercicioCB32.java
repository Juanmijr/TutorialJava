import javax.swing.JOptionPane;

public class EjercicioCB32 {

	public static void main(String[] args) {
		String menu = "\t\tMENU\n"
				+ "1.- Ra�z de un n�meros\n"
				+ "2.- Potencia de dos n�meros"
				+ "3.- M�dulo de la divisi�n";
		int num1, num2; 	
		int opcion= Integer.parseInt(JOptionPane.showInputDialog(menu));
		

		switch (opcion) {
		case 1:
			num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese radicando"));
			num2 = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el indice"));
			JOptionPane.showMessageDialog(null, "Resultado: " + (Math.pow(num1, (1/num2))));
	break;
		case 2:
			num1 = Integer.parseInt(JOptionPane.showInputDialog("Introduzca la base"));
			num2 =  Integer.parseInt(JOptionPane.showInputDialog("Introduzca el exponente"));
			JOptionPane.showMessageDialog(null, "Resultado: " + (Math.pow(num1, num2)));
		break;
		case 3:
			num1 = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el primer n�mero"));
			num2 =  Integer.parseInt(JOptionPane.showInputDialog("Introduzca el segundo n�mero"));
			JOptionPane.showMessageDialog(null, "Resultado: " + (num1 % num2));
		break;
		

		}
	}

}
