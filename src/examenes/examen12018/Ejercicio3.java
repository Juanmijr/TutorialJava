package examen12018;


public class Ejercicio3 {

	public static void main(String[] args) {
		//DECLARAMOS ARRAY
		int array [] = new int [20];
		//CREAMOS EL ARRAY
		for (int i = 0; i<20 ; i++) {
			array[i]= (int) Math.round(Math.random()*100);
			System.out.println(array[i] + "\n");
		
			//SACAMOS SUS DIVISORES
			for (int j =1; j<=array[i]; j++) {
				if (array[i] % j == 0) {
					System.out.println(" ");
					System.out.print(j + " \n");
					System.out.println("----------------------------------------------------");
					}
				
			}
			
			}
		}
		

	}



