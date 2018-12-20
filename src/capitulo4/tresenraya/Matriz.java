package capitulo4.tresenraya;

public class Matriz {

	//Variable SINGLETON 
	private static Matriz instance = null;
	public static final int FILAS = 3;
	public static final int COLUMNAS =3;
	
	int matriz[][]= new int [FILAS][COLUMNAS];
	/**
	 * 
	 */
	public Matriz () {
		init();
	}
	
	/**
	 * 
	 */
	private void init () {
		for(int i = 0 ; i<FILAS; i++) {
			for (int j=0; j<COLUMNAS; j++) {
				matriz [i][j]=0;				
			}
		}
	}
	
	// SINGLETON
	public static Matriz getInstance() {
		if (instance == null) {
			instance = new Matriz();
		}
		return instance;
	}

	
	}
}
