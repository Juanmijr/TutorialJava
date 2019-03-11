package ejerciciosTutorial.capítulo6.wrappersTipoPrimitivo;

public class ejercicio1 {
	
	public static void main (String[] args) {
		maximos();
		System.out.println("<-------------------------------------------------------->");
		minimos();
		
	}

	private static void maximos() {

		System.out.println("Byte: " + Byte.MAX_VALUE + "| en bytes: " + Byte.MAX_VALUE * Byte.BYTES);
		System.out.println("Int: " + Integer.MAX_VALUE + "| en bytes: " + Integer.MAX_VALUE * Integer.BYTES );
		System.out.println("Short: " + Short.MAX_VALUE + "| en bytes: " + Short.MAX_VALUE * Short.BYTES);
		System.out.println("Long: " + Long.MAX_VALUE  + "| en bytes: " + Long.MAX_VALUE * Long.BYTES);
		System.out.println("Float: " + Float.MAX_VALUE + "| en bytes: " + Float.MAX_VALUE * Float.BYTES);
		System.out.println("Double: " + Double.MAX_VALUE + "| en bytes: " + Double.MAX_VALUE * Double.BYTES);


	}

	private static void minimos() {

		System.out.println("Byte: " + Byte.MIN_VALUE + "| en bytes: " + Byte.MIN_VALUE * Byte.BYTES);
		System.out.println("Int: " + Integer.MIN_VALUE + "| en bytes: " + Integer.MIN_VALUE * Integer.BYTES);
		System.out.println("Short: " + Short.MIN_VALUE + "| en bytes: " + Short.MIN_VALUE * Short.BYTES);
		System.out.println("Long: " + Long.MIN_VALUE + "| en bytes: " + Long.MIN_VALUE * Long.BYTES);
		System.out.println("Float: " + Float.MIN_VALUE + "| en bytes: " + Float.MIN_VALUE * Float.BYTES);
		System.out.println("Double: " + Double.MIN_VALUE + "| en bytes: " + Double.MIN_VALUE * Double.BYTES);
	}
	

}
