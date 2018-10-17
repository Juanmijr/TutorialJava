package Capítulo5;

public class Ejercicio1B2 {
	public static void main(String[] args) {
		int array[]= new int [150];
		int numerocambiado=0;
		
			for (int i = 0 ; i<array.length ; i++) {
				array[i]= ((int)Math.round(Math.random()*(100-(-100))+ (-100)));
			}
				for (int i = 0; i < array.length; i++) {
					if ((array[i] % 2)==0) {
						numerocambiado= array[i]*(-1);
						System.out.println(numerocambiado);
					}
					else {
						System.out.println(array[i]);
					}
			
				

	}
	}
	
}
