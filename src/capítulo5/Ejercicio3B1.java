package capítulo5;

import javax.swing.JOptionPane;

public class Ejercicio3B1 {

	public static void main(String[] args) {
		int array[]= new int [150];
		int busqueda=Integer.parseInt(JOptionPane.showInputDialog("¿Qué número deseas buscar?")); 
		int i=0;
		int bandera=0;

			for (i = 0 ; i<array.length ; i++) {
				array[i]= ((int)Math.round(Math.random()*(100)));
			}
			
				for (i = 0; i < array.length; i++) {
					System.out.println( array[i] + "| " + i);
					
					if ((busqueda/(array[i]))==0) {
						bandera=500;
					}	
	}
				if (bandera==500){
					System.out.println("El número " + busqueda + " está en la línea" + i);
				}
				else {
					System.out.println("El número " + busqueda + " no está en la lista");
				}

	}

}
