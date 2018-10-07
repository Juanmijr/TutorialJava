package Cap�tulo1;

public class TiposPrimitivos {
	
	public static void primerEjemplo () {
		int numEntero; //Declaraci�n de una variable entera
		float numFlotante; //Declaraci�n de una variable real o flotante
		double numDouble; //Declaraci�n de una variable flotante larga
		
		numEntero = (int) 4.5; //Asignaci�n de un valor a una variable
		numFlotante = (float) 4.5; //Casting de valor double a float
		numDouble = 4.8; //Asignaci�n de valor doble a variable double
		//Impresi�n en la consola de salida de las variables
		System.out.println("El valor de la variable numEntero es: " + numEntero + 
				"\nEl valor de la variable numFlotante es: " + numFlotante + 
				"\nEl valor de la variable numDouble es:" + numDouble);
		
	}
	
/*Esta es la funci�n resoluci�nEcuacionSegundoGrado, que
 * resuelve la ecuaci�n de segundo grado */
public static void resolucionEcuacionSegundoGrado () {
	int a=1, b=0, c=-1; 
	float x1, x2;
	float determinante;
	 
	determinante = (float) Math.sqrt(b*b-4*a*c);
	x1 = ((0-b) + determinante)/(2*a);
	x2 = ((0-b)- determinante)/(2*a);
	System.out.println("La ecuaci�n es " + a +"x(2) + " + b + "x + " + c + " = 0");
	System.out.println("La soluci�n x1 es " + x1 + " y la soluci�n x2 es " + x2 );
}

}
