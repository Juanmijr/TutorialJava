package Cap�tulo2;
import javax.swing.JOptionPane;

public class EjercicioCB33 {

	public static void main(String[] args) {
				//DECLARACI�N DE TODAS LAS VARIABLES
				String mensaje = "" ;
				int num1, num2, opcion;
				String menu = "\t\tMENU\n"
						+ "1.- Hipotenusa de tri�ngulo rect�ngulo\n"
						+ "2.- Superficie de una circunferencia\n"
						+ "3.- M�dulo de la divisi�n\n";
				 	
				
				opcion= Integer.parseInt(JOptionPane.showInputDialog(menu));
				//PETICI�N DE N�MEROS
				
				
				switch (opcion) {
				case 1://Hipotenusa de tri�ngulo rect�ngulo
					float num1 = Float.parseFloat(JOptionPane.showInputDialog("Introduzca el primer n�mero"));
					float num2 = Float.parseFloat(JOptionPane.showInputDialog("Introduzca el segundo n�mero"));
					mensaje = "Resultado: " + (Math.sqrt(Math.pow(num1,2) + Math.pow(num2, 2)));
			break;
				case 2:// Superficie de una circunferencia
					float num1= Float.parseFloat(JOptionPane.showInputDialog("Introduzca un n�mero")); 
					mensaje =  "Resultado: " + (Math.PI*Math.pow(num1, 2));
				break;
				case 3:// M�DULO DE UN N�MERO
					mensaje =  "Resultado: " + (cateto1 % cateto2);
					
				break;
				

				}
			}

		

	}


