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
	
	public static int getFilas() {
		return FILAS;
	}

	public static int getColumnas() {
		return COLUMNAS;
	}

	public int[][] getMatriz() {
		return matriz;
	}

	public void setMatriz(int[][] matriz) {
		this.matriz = matriz;
	}

	// SINGLETON
	public static Matriz getInstance() {
		if (instance == null) {
			instance = new Matriz();
		}
		return instance;
	}

	public boolean isJuegoTerminado () {
		if(matriz[0][0]==matriz[0][1]&& matriz[0][1]==matriz[0][2]&& matriz[0][2]!=0) {
			return true;
		}
		if(matriz[1][0]==matriz[1][1]&& matriz[1][1]==matriz[1][2] && matriz[1][2]!=0) {
			return true;
		}
		if(matriz[2][0]==matriz[2][1]&& matriz[2][1]==matriz[2][2]&& matriz[2][2]!=0) {
			return true;
		}
		if(matriz[0][0]==matriz[1][0]&& matriz[1][0]==matriz[2][0]&& matriz[2][0]!=0) {
			return true;
		}
		if(matriz[0][1]==matriz[1][1]&& matriz[1][1]==matriz[2][1]&& matriz[2][1]!=0) {
			return true;
		}
		if(matriz[0][2]==matriz[1][2]&& matriz[1][2]==matriz[2][2]&& matriz[2][2]!=0) {
			return true;
		}
		if(matriz[0][0]==matriz[1][1]&& matriz[1][1]==matriz[2][2] && matriz[2][2]!=0) {
			return true;
		}
		if(matriz[0][2]==matriz[1][1]&& matriz[1][1]==matriz[2][0] && matriz[2][0]!=0) {
			return true;
		}
		return false;
	}

}
