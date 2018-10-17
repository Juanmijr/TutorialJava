package Capítulo5;

public class Ejercicio4B1 {

	public static void main(String[] args) {
		int array[]= new int [150]; 
		int i;
		int sumapar=0;
		int sumaimpar=0;
			for (i = 0 ; i<array.length ; i++) {
				array[i]= ((int)Math.round(Math.random()*(100)));
			}
			
				for (i = 0; i < array.length; i++) {
					System.out.println( array[i] + "| " + i);
					
					if (((array[i] % 2))==0) {
						sumapar= sumapar + array[i];
					}	
					else {
						sumaimpar= sumaimpar + array[i];
					}
						
					
				}

				System.out.println("La suma impar es " + sumaimpar);
				System.out.println("La suma par es  " + sumapar);
	}

}
