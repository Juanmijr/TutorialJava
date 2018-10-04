import javax.swing.JOptionPane;

public class EjercicioCB32 {

	public static void main(String[] args) {
		//DECLARACIÓN DE TODAS LAS VARIABLES
		String mensaje = "" ;
		int num1, num2, opcion;
		String menu = "\t\tMENU\n"
				+ "1.- Raíz de un números\n"
				+ "2.- Potencia de dos números\n"
				+ "3.- Módulo de la división\n";
		 	
		
		opcion= Integer.parseInt(JOptionPane.showInputDialog(menu));
		//PETICIÓN DE NÚMEROS
		num1 = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el primer número"));
		num2 =  Integer.parseInt(JOptionPane.showInputDialog("Introduzca el segundo número"));
		
		switch (opcion) {
		case 1://RAÍZ DE UN NÚMERO
			mensaje = "Resultado: " + (Math.pow((num1), (float)(1/num2)));
	break;
		case 2:// POTENCIA DE UN NÚMERO
			mensaje =  "Resultado: " + (Math.pow(num1, num2));
		break;
		case 3:// MÓDULO DE UN NÚMERO
			mensaje =  "Resultado: " + (num1 % num2);
			
		break;
		

		}
	}

}
