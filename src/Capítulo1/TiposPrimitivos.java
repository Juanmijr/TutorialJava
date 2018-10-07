package Capítulo1;

public class TiposPrimitivos {
	
	public static void primerEjemplo () {
		int numEntero; //Declaración de una variable entera
		float numFlotante; //Declaración de una variable real o flotante
		double numDouble; //Declaración de una variable flotante larga
		
		numEntero = (int) 4.5; //Asignación de un valor a una variable
		numFlotante = (float) 4.5; //Casting de valor double a float
		numDouble = 4.8; //Asignación de valor doble a variable double
		//Impresión en la consola de salida de las variables
		System.out.println("El valor de la variable numEntero es: " + numEntero + 
				"\nEl valor de la variable numFlotante es: " + numFlotante + 
				"\nEl valor de la variable numDouble es:" + numDouble);
		
	}
	
/*Esta es la función resoluciónEcuacionSegundoGrado, que
 * resuelve la ecuación de segundo grado */
public static void resolucionEcuacionSegundoGrado () {
	int a=1, b=0, c=-1; 
	float x1, x2;
	float determinante;
	 
	determinante = (float) Math.sqrt(b*b-4*a*c);
	x1 = ((0-b) + determinante)/(2*a);
	x2 = ((0-b)- determinante)/(2*a);
	System.out.println("La ecuación es " + a +"x(2) + " + b + "x + " + c + " = 0");
	System.out.println("La solución x1 es " + x1 + " y la solución x2 es " + x2 );
}

}
