package capítulo4.Ejercicio02;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		String menu = "Creación de datos de Antigüedades"
				+ "\n\n1.- Joya"
				+ "\n2.- Mueble";
		
		int opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));
		
		
		if (opcion > 0 && opcion < 3) {
			Antiguedad antiguedad = null;
			
			switch (opcion) {
			case 1: // Joya
				antiguedad = new Joya();
				Joya joya = (Joya) antiguedad;
				joya.setMaterial(JOptionPane.showInputDialog("Material de la antigüedad"));
				break;
			case 2:
				antiguedad = new Mueble();
				Mueble mueble = (Mueble) antiguedad;
				mueble.setEpoca(JOptionPane.showInputDialog("Época de la antigüedad"));
				System.out.println("Desc de mueble: " + mueble.toString());
				break;
			}
			
			// Pedir anyoFabricacion, origen y precio
			antiguedad.setOrigen(JOptionPane.showInputDialog("Origen de la antigüedad"));
			antiguedad.setAnyoFabricacion(Integer.parseInt(JOptionPane.showInputDialog("Año de fabricación de la antigüedad")));
			antiguedad.setPrecio(Float.parseFloat(JOptionPane.showInputDialog("Precio de la antigüedad")));
			System.out.println("Desc de joya: " + antiguedad.toString());

		}
		
		/*Joya joya = new Joya(1989, "Lucena", 100, "Plata");
		joya.getOrigen();*/
		
		Mueble mueble = new Mueble();
		System.out.println("Época del mueble " + mueble.getEpoca());

	}

}