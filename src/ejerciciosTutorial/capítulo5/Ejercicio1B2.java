package capítulo5;

public class Ejercicio1B2 {
	public static void main(String[] args) {
		int array[]= new int [150];
		
			for (int i = 0 ; i<array.length ; i++) {
				array[i]= ((int)Math.round(Math.random()*100));
				System.out.println(array[i]);
			}
			System.out.println("ARRAY EN SENTIDO CONTRARIO");
				for (int i = 0; i < (array.length-1); i++) {
						System.out.println(array[i] + "  ");
	}
	}
}
