package Capítulo2;
import javax.swing.JOptionPane;

public class EjercicioCB33 {

	public static void main(String[] args) {
				//DECLARACIÓN DE TODAS LAS VARIABLES
				String mensaje = "" ;
				int num1, num2, opcion;
				String menu = "\t\tMENU\n"
						+ "1.- Hipotenusa de triángulo rectángulo\n"
						+ "2.- Superficie de una circunferencia\n"
						+ "3.- Módulo de la división\n";
				 	
				
				opcion= Integer.parseInt(JOptionPane.showInputDialog(menu));
				//PETICIÓN DE NÚMEROS
				
				
				switch (opcion) {
				case 1://Hipotenusa de triángulo rectángulo
					float num1 = Float.parseFloat(JOptionPane.showInputDialog("Introduzca el primer número"));
					float num2 = Float.parseFloat(JOptionPane.showInputDialog("Introduzca el segundo número"));
					mensaje = "Resultado: " + (Math.sqrt(Math.pow(num1,2) + Math.pow(num2, 2)));
			break;
				case 2:// Superficie de una circunferencia
					float num1= Float.parseFloat(JOptionPane.showInputDialog("Introduzca un número")); 
					mensaje =  "Resultado: " + (Math.PI*Math.pow(num1, 2));
				break;
				case 3:// MÓDULO DE UN NÚMERO
					mensaje =  "Resultado: " + (cateto1 % cateto2);
					
				break;
				

				}
			}

		

	}


