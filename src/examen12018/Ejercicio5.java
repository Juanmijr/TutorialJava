package examen12018;

public class Ejercicio5 {

	public static void main(String[] args) {
		int array [] = new int [20];
		boolean iguales;
		int num=0;
		// Inicialización del array
		for (int i = 1; i < array.length; i++) {
			//CONDICIÓN PARA QUE COMPRUEBE SI SON IGUALES 
			do {
				array[i] = (int) Math.round(Math.random() * 40);
				iguales = false;
				for(int j = 0 ; i<j ; j++) {
					if (array[i] != array[j]) 
						iguales=true;
						num=array[i];
				}
			}while(iguales);
			// SI NO SON, LOS METEMOS EN LA VARIABLE
			array[i]=num;
			System.out.println(array[i]);
		}
	}
}



