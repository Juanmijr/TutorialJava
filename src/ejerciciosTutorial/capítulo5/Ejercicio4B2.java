package capítulo5;

public class Ejercicio4B2 {

	public static void main(String[] args) {
		int array[]= new int [5];
		int i=5;
		int guardar= array[0];
		
		for (i =0; i<5 ; i++) {
			array[i]= (int) Math.round(Math.random()*100);
			array[i]=array[i+1];
			array[i]=guardar;
			System.out.println(array[i]);
			
			
		}
		
	}

}
