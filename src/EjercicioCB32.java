import javax.swing.JOptionPane;

public class EjercicioCB32 {

	public static void main(String[] args) {
		String menu = "\t\tMENU\n"
				+ "1.- Raíz de un números\n"
				+ "2.- Potencia de dos números"
				+ "3.- Módulo de la división";
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
			num1 = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el primer número"));
			num2 =  Integer.parseInt(JOptionPane.showInputDialog("Introduzca el segundo número"));
			JOptionPane.showMessageDialog(null, "Resultado: " + (num1 % num2));
		break;
		

		}
	}

}
