package bloque04;

public class ejercicio2 {

	public static void main(String[] args) {
		float Array1[]= hazArray();
		imprimeArray(Array1);
		recorreArray(Array1);

	}
	private static float[] hazArray () {
		float Array1[] = new float [200];
		
		for(int i = 0; i<Array1.length;i++) {
			Array1[i]= (float) (Math.random()*10);
			
		}
		return Array1;
	}
	
	private static void imprimeArray(float Array1[]) {
		for(int i = 0; i<Array1.length;i++) {
			System.out.print(Array1[i]+ " ");
		}
		
	}
	
	private static void recorreArray(float Array1[]) {
		float sumasuspenso = 0;
		float sumaaprobado = 0;
		for (int i = 0; i<Array1.length;i++) {
			if (Array1[i]<5) {
			sumasuspenso++;
				
			}
			else {
				sumaaprobado++;
			}
		}
		System.out.println("\nEl porcentaje de suspensos es: " + ((sumasuspenso*100)/Array1.length) + " %");
		System.out.println("El porcentaje de aprobados es: " + ((sumaaprobado*100)/Array1.length) + " %"); 
	}
	
}
