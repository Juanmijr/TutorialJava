package capítulo4.ejercicio03_Arbol;

public class PrincipalArbol {

	public static void main(String[] args) {
		// DESCRIPCIÓN DE ARBOL 
		Rama tronco = new Rama("Tronco");
		Rama rama01 = new Rama("Rama 1");
		tronco.setExtension1(rama01);
		tronco.setExtension2(new Fruto("Fruto 01"));
		tronco.setExtension3(new Hoja("Hoja 01"));
		
		rama01.setExtension1(new Fruto("Fruto 02"));
		rama01.setExtension2(new Rama("Rama 02"));
		rama01.setExtension3(null);
		recorreComponente(tronco);

	}
// MÉTODO QUE HACE QUE RECORRA AL ARBOL 
	private static void recorreComponente (ComponenteDeArbol componente) {
		if (componente instanceof Fruto) {
			System.out.println("Fruto: " + componente.getNombre());
		}
		if (componente instanceof Hoja) {
			System.out.println("Hoja: " + componente.getNombre());
		}
		if (componente instanceof Rama) {
			System.out.println("Rama: " + componente.getNombre());
			recorreComponente (((Rama) componente).getExtension1());
			recorreComponente (((Rama)componente).getExtension2());
			recorreComponente (((Rama)componente).getExtension3());
		}
	}
}
