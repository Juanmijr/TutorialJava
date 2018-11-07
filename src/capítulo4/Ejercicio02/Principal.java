package capítulo4.Ejercicio02;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		String menu = "Creación de datos de Antiguedades"
				+ "\n\n1.- Joya"
				+ "|n2.- Mueble";
	
		
		int opcion= Integer.parseInt(JOptionPane.showInputDialog(menu));
			
		
		String origenAux;
		int anyofabricacionAux;
		float precioAux;
		
		if (opcion > 0 && opcion <3) {
			Antiguedad antiguedad;
			
			switch(opcion) {
			case 1: //Joya
			antiguedad = new Joya();
			((Joya)antiguedad).setMaterial(JOptionPane.showInputDialog("Material de la antiguedad: "));
			System.out.println("época de la joya" + joya.toString());
			break;
			case 2://Mueble
			antiguedad = new Mueble();
			((Mueble)antiguedad).setMaterial(JOptionPane.showInputDialog("Material de la antiguedad: "));
			System.out.println("época de la joya" + mueble.toString());
		}
			
			//Pedir anyofabricacion, origen y precio
			origenAux= JOptionPane.showInputDialog("Origen de la antiguedad: ");
			anyofabricacionAux= Integer.parseInt(JOptionPane.showInputDialog("Año de la antiguedad: "));
			precioAux= Integer.parseInt(JOptionPane.showInputDialog("Precio de la antiguedad: "));
		}
				
		
}
}
