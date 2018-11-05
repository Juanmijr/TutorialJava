package examen12018;

import javax.swing.JOptionPane;

public class Ejercicio1 {

	public static void main(String[] args) {
		//DECLARACION DE VARIABLES
		int array[]= new int [100];
		int suma=0; 
		int mayor=0;
		int menor=0;
		// CREACION DE ARRAY
			for (int i = 0 ; i<array.length ; i++) {
				array[i]= ((int)Math.round(Math.random()*(1000)));
				System.out.print( array [i] + "  ");
				mayor = array[0];
				menor = array[0];
				//EJECUTAMOS LA SUMA
				suma = array[0];
				suma+=array[i];
				//OBTENEMOS EL MAYOR Y EL MENOR
				//SI NUMERO ES MENOR QUE MAYOR, DECLARAMOS EL MAYOR EN EL ARRAY
			for(i = 1; i < array.length;i++) {
				mayor = (array[i] > mayor)? array[i] : mayor;
				menor = (array[i]< menor)? array[i]:mayor;
			
					}
					
	}
			//IMPRIMIMOS LOS RESULTADOS
				JOptionPane.showMessageDialog(null, "La suma de los números es = " + suma);
				JOptionPane.showMessageDialog(null,"La media de los números es: " + ((float) suma/100));
				JOptionPane.showMessageDialog(null, "El número mayor es: " + mayor);
				JOptionPane.showMessageDialog(null, "El número menor es: " + menor);
	}
}

