package capitulo4.Ejercicioprueba;

public class Convertidor {

	public static void main(String[] args) {
		int array[] = {1,2,3,4,5,6,7,8,9};
		int aux=0;
		
		int longitud = array.length;
		
		for (int i = 0; i<longitud; i++)
		 System.out.print(array[i] + " ");
		
		for(int i=0;i<=longitud/2; i++){
		 aux = array[longitud-i -1];
		 array[longitud-i-1] = array[i];
		 array[i] = aux;
		 }
		
		System.out.println();
		for (int i= 0; i < longitud; i++) {
		 System.out.print(array[i] + " ");
		}

	}

}
