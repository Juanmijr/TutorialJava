package version1;

	public class Carrera {
		boolean isTerminado = false;
		// Necesito un array de elementos de tipo "Vehiculo", deben ser 5
		private Vehiculo vehiculos[] = new Vehiculo[5];
		private Pista pistas[]= new Pista[5];
		// Incorporación de un patrón Singleton a esta clase
		public static Carrera carrera = null;

	/**
	 * Constructor
	 */
	public Carrera() {
		super();
		inicializaVehiculos();
		asignaPista();
		sistemaTurnos();
		imprimeJugadores();
	}
	// Inicialización de los vehículos
	public void inicializaVehiculos() {
		vehiculos[0] = new Coche("Bertha Benz", "ff7c7c");
		vehiculos[1] = new Moto("Dani Pedrosa", "ffe97c");
		vehiculos[2] = new Coche("Fernando Alonso", "82ff7c");
		vehiculos[3] = new Coche("María de Villota", "8effd9");
		vehiculos[4] = new Moto("Ana Carrasco", "d18eff");
	}
	//Asignación pista
	public void asignaPista() {
		pistas[0]= new Pista (vehiculos[0]);
		pistas[1]= new Pista (vehiculos[1]);
		pistas[2]= new Pista (vehiculos[2]);
		pistas[3]= new Pista (vehiculos[3]);
		pistas[4]= new Pista (vehiculos[4]);
	}
	
	public void sistemaTurnos () {
		do {
			for (int i = 0; i<4; i++) {
				System.out.println("Vehículo " + vehiculos[i].nombre + " "+ vehiculos[i].color + ": ");
				System.out.println("Está en "+ vehiculos[i].x);
				vehiculos[i].avanza();
				System.out.println("Ha avanzado "+ vehiculos[i].avance);
				System.out.println("Acaba en " + vehiculos[i].x);
			
				if (vehiculos[i].x >= 500) {
				isTerminado = true;
			}
		}
		
		}while(isTerminado ==false);
	}
	
	

	/**
	 * 
	 * @return
	 */
	public int getMaximoValorEnPodium () {
		// Este método obtiene el máximo valor de podium del conjunto de jugadores.
		// Si ningún jugador ha llegado a la meta, todos los jugadores tendrán en su
		// "podium" el valor "0".
		int maxValor = 0;
		
		// Comprobamos que el array tenga al menos un elemento
		if (vehiculos.length > 0) {
			maxValor = vehiculos[0].getPodium(); // Asignamos el máximo valor de podium al que tenga el primer jugador
			// Recorremos todos los jugadores, buscando un valor de podium más alto,
			// comenzando por el segundo jugador y llegando hasta el último.
			for (int i = 1; i < vehiculos.length; i++) {
				if (vehiculos[i].getPodium() > maxValor) {
					maxValor = vehiculos[i].getPodium();
				}
			}
		}
		return maxValor;
	}
	
	

	/**
	 * 
	 * @param jugadores
	 */
	public void ordenaArrayJugadoresPorPodium () {
		// Ordenación por el método de la burbuja, para que los jugadores queden
		// ordenados por orden de llegada a la meta
		for (int i = vehiculos.length-1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (vehiculos[j].getPodium() > vehiculos[j+1].getPodium()) {
					Vehiculo aux = vehiculos[j];
					vehiculos[j] = vehiculos[j+1];
					vehiculos [j+1] = aux;
				}
			}
		}		
	}

	
	/**
	 * 
	 */
	public void imprimeJugadores () {
		// Imprimo array de jugadores
		System.out.println("\n\nPodium de jugadores");
		for (int i = 0; i < vehiculos.length; i++) {
			System.out.println(vehiculos[i].toString());
		}
	}


	/**
	 * Patrón Singleton
	 * @return
	 */
	public static Carrera getCarrera() {
		if (carrera == null) {
			carrera = new Carrera();
		}
		return carrera;
	}
	public Vehiculo[] getVehiculos() {
		return vehiculos;
	}
	public void setVehiculos(Vehiculo[] vehiculos) {
		this.vehiculos = vehiculos;
	}	
	
	

	
}
