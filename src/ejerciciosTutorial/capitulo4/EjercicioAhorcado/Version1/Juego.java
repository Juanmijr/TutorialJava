package capitulo4.EjercicioAhorcado.Version1;

import javax.swing.JOptionPane;

public class Juego {

	
	static String palabras[] = new String[] {"aburrido", "acido", "alegre", "alto", "amargo", "ancho", "atrevido", "azul", "bajo", "blanco", "blando", "bonito", "buen", "caliente", "capaz", "central", "chungo", "comun", "conocido", "contento", "corto", "debil", "delgado", "derecho", "diferente", "dificil", "dulce", "duro", "enfermo", "estrecho", "exterior", "facil", "falso", "famoso", "feo", "final", "fresco", "fr�o", "fuerte", "gordo", "grande", "guay", "guapo", "h�medo", "igual", "imposible", "interesante", "interior", "inutil", "izquierdo", "joven", "largo", "lento", "listo", "malo", "masivo", "mayor", "mejor", "menor", "mucho", "muerto", "musical", "nacional", "natural", "negro", "nuevo", "peor", "peque�o", "perfecto", "pobre", "poco", "popular", "posible", "primero", "principal", "proximo", "rapido", "raro", "real", "recto", "rico", "rojo", "salado", "sano", "seco", "segundo", "simple", "sinverguenza", "social", "solo", "soso", "temido", "tonto", "triste", "�til", "verdadero", "verde", "viejo", "vivo", "crema", "explosi�n", "navaja", "universidad", "llaves", "papa", "catre", "escuela", "codo", "mapa", "lima", "edificio", "hojas", "granizo", "mano", "musica", "habitacion", "abuelo", "templo", "plato", "botella", "casa", "planeta", "metal", "mono", "petroleo", "debate", "ruido", "herramienta", "anteojos", "zapato", "ojo", "ciente", "diente", "buzo", "puerta", "ensalada", "candidato", "diario", "hierro", "barco", "tecla", "departamento", "hipop�tamo", "�rbol", "discurso", "rucula", "lentejas", "reloj", "desodorante", "monta�as", "moño", "partido", "fiesta", "cafe", "guitarra", "martillo", "lapicera", "letra", "libreria", "rueda", "camisa", "sillon", "teclado", "pantalla", "tenedor", "pantalla", "tenedor", "agua", "cohete", "cesped", "parlante", "pestaña", "monitor", "hombre", "velero", "palo", "lentes", "nube", "castillo", "libro", "televisor", "telefono", "percha", "anillo", "pared", "cartas", "impresora", "luces", "bomba", "boligrafo", "gobierno", "enano", "persona", "guantes", "proyector", "muela", "remate", "cuaderno", "taladro", "chocolate", "caramelos", "angustia", "lluvia", "corbata", "periodico", "planta", "chupete", "oficina", "persiana", "silla", "pradera", "zoologico", "deporte", "recipiente", "fotografia", "ave", "refugio", "pantalon", "carne", "nieve", "humedad", "pistola", "tristeza", "sofa", "cama", "campera", "coche", "cinturon", "famoso", "madera", "piso", "malet�n", "diputado", "cuchillo", "candado", "luz", "ordenador", "radio", "cuadro", "calor", "teatro", "bala", "auriculares", "plastico", "libro", "aluminio", "agujeta", "sonido", "perro", "pelo", "felicidad", "servilleta", "sol", "estadistica", "mensaje", "rey", "presidencia", "colegio", "lampara", "flor", "tornillo", "abuela", "satelite"}; 
	static String fallo [] = new String [100];
	static String palabra= palabras [((int)Math.round(Math.random()*(palabras.length -1)))];
	static int contIndice = 0;
	static int contFallos=0;
	public static Juego juego = null;
	static boolean existeLetra=false;
	static int numintentos=palabra.length();
	static String respuesta;
	static char[] coincidencias= new char [palabra.length()];
	static boolean juegoTerminado = false;
	static boolean bandera;
	static boolean navidad;
	static String palabrasNavidad[]= new String []{"reno","comida","familia", "velas", "pascua" };
		
		
	public static void comienzajuego() {

		System.out.println("\n" + palabra);
		for (int i=0;i<fallo.length;i++) {
		if (fallo[i]==null) {
			fallo[i] = " ";
		}
		}
	for(int i = 0; i<palabra.length();i++) {
		coincidencias[i]= '_';		
	}
		do {
			
	
			
			existeLetra=false;
			//Petici�n de respuestas
			respuesta = JOptionPane.showInputDialog("Introduzca la letra o palabra de la palabra");
			//Cheat 1 - Modo inmortal
			if (respuesta.equalsIgnoreCase("inmortal")) {
				contFallos=0;
				bandera=true;
			}
			//Cheat 2 - pista
			if (respuesta.equalsIgnoreCase("hint")) {
				//Letra random
				char letra= palabra.charAt((int) Math.round(Math.random()*(palabra.length()-1)));
				//Creamos número random
				int i=(int) Math.round(Math.random()*(palabra.length()-1));
					//Creamos char de la palabra
					char pista = palabra.charAt(i);
					//Comparamos si la letra está ya 
					coincidencias[i]=pista;
					//Si letra es igual a pista
					if(letra==pista) {
						//Imprimimos la letra
						coincidencias[i]=letra;
						Ventana.getventana().repaint();
						
					}
				}
			//Cheat 3 - navidad
			if (respuesta.equalsIgnoreCase("navidad")) {
				navidad=true;
				palabra=palabrasNavidad [((int)Math.round(Math.random()*(palabrasNavidad.length -1)))];
				contFallos=0;
				Ventana.getventana().repaint();
				comienzajuego();

			}
			
			
			//Si respuesta es igual a palabra
			if (respuesta.equalsIgnoreCase(palabra)) {
				for(int i = 0 ; i<palabra.length();i++) {
					//Decimos que imprima la palabra
					coincidencias[i]= palabra.charAt(i);
				}
				//Repinta la ventana
				Ventana.getventana().repaint();
			}
			
			// Si la respuesta no es igual que la palabra y mas de un caracter
			if (respuesta.length()>1 && !respuesta.equalsIgnoreCase(palabra)&& bandera==false) {
				//Sumamos el contador de fallos
				contFallos++;
				//le decimos que metemos los fallos
				fallo[contIndice]=respuesta;
				//Sacamos los errores
				System.out.println("\n Errores: ");
				for(int i=0;i<fallo.length;i++) {
					//Si no hay fallo queremos que no salga
					if(fallo[i]==null) {
						fallo[i]=" ";
					}
					System.out.print(" " + fallo[i]+ " ");
					Ventana.getventana().repaint();
				}
				contIndice++;
			}
			//Si la respuesta es un caracter	
			if (respuesta.length()==1) {
					System.out.println();
					for (int i = 0; i<palabra.length();i++) {
						char decision = respuesta.charAt(0);
						char letraPalabra = palabra.charAt(i);
						//Si la palabra es la misma
						if (letraPalabra==decision) {
							coincidencias[i]=decision;
							numintentos--;
							existeLetra=true;
						}
						System.out.print(" " + coincidencias[i] + " ");
						Ventana.getventana().repaint();
					
					}	
				//Errores
					if(existeLetra==false && bandera==false) {
						//Sumamos uno al contandor
						contFallos++;
						//Metemos la respuesta como fallo
						fallo[contIndice]=respuesta;
						System.out.println("\n Errores: ");
						for(int i=0;i<fallo.length;i++) {
							//Si no hay fallo no salga nada
							if(fallo[i]==null) {
								fallo[i]="";
							}
							//Imprimimos fallos
							System.out.print(fallo[i]+ " ");
							Ventana.getventana().repaint();
						}
						//Sumamos uno al contador de indice
						contIndice++;
						}
				}
					
			
			
			
			
				//IMPRESIÓN EN PANTALLA 
				if (respuesta.equalsIgnoreCase(palabra)|| numintentos==0) {
					System.out.println("\nEnhorabuena, has acertado!!");
					JOptionPane.showMessageDialog(null, "Enhorabuena, has acertado la palabra: " + palabra);
				}
				if(contFallos==6) {
					System.out.println("\nHas perdido");
					JOptionPane.showMessageDialog(null, "Has sobrepasado el n�mero de fallos, la palabra correcta es: " + palabra);
				}
			

		}while (!(respuesta.equalsIgnoreCase(palabra)||(contFallos==6)||(numintentos==0||respuesta=="inmortal")));
		juegoTerminado = true;
		

	}
	//Singleton
	public static Juego getJuego() {
		if (juego==null) {
			juego=new Juego();
		}
		return juego;
	}


}



