package Capítulo5;

public class Ejercicio2B2 {

	public static void main(String[] args) {
		int array[]= new int [150];
		int array1[]= new int [150];
		int array2[]= new int [150];
		int i = 0;
			for (i = 0 ; i<100 ; i++) {
				array[i]= ((int)Math.round(Math.random()*(100)));
				array1[i]= ((int)Math.round(Math.random()*(100)));
		
						if ((1 % 2) == 0) {
							array2[i]=array[i];
						}
						else {
							array2[i] = array[i];
						}
						System.out.println("[ " + i + " ] " + array2[i]);
					

			}
	}
}
