import javax.swing.JOptionPane;

public class EjercicioCB32 {

	public static void main(String[] args) {
		//DECLARACI�N DE TODAS LAS VARIABLES
		String mensaje = "" ;
		int num1, num2, opcion;
		String menu = "\t\tMENU\n"
				+ "1.- Ra�z de un n�meros\n"
				+ "2.- Potencia de dos n�meros\n"
				+ "3.- M�dulo de la divisi�n\n";
		 	
		
		opcion= Integer.parseInt(JOptionPane.showInputDialog(menu));
		//PETICI�N DE N�MEROS
		num1 = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el primer n�mero"));
		num2 =  Integer.parseInt(JOptionPane.showInputDialog("Introduzca el segundo n�mero"));
		
		switch (opcion) {
		case 1://RA�Z DE UN N�MERO
			mensaje = "Resultado: " + (Math.pow((num1), (float)(1/num2)));
	break;
		case 2:// POTENCIA DE UN N�MERO
			mensaje =  "Resultado: " + (Math.pow(num1, num2));
		break;
		case 3:// M�DULO DE UN N�MERO
			mensaje =  "Resultado: " + (num1 % num2);
			
		break;
		

		}
	}

}
