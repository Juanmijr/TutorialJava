package Capítulo5;

public class Ejercicio4B2 {

	public static void main(String[] args) {
		int array[]= new int [5];
		int i=5;
		int guardar=0;
		
		for (i =0; i>5 ; i++) {
			array[i]= (int) Math.round(Math.random()*100);
		}
		for (i =4; i >0 ; i--);{
			array[1]=array[4];		
			System.out.println(array[i]);
			
			
		}
		
	}

}
