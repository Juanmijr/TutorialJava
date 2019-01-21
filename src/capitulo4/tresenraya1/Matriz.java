package capitulo4.tresenraya1;

import javax.swing.JOptionPane;

public class Matriz {

	private static Matriz instance = null;
	public static final int FILAS = 3;
	public static final int COLUMNAS = 3;

	int matriz[][] = new int[FILAS][COLUMNAS];
	
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
		for (int i = 0; i < FILAS; i++) {
			for (int j = 0; j < COLUMNAS; j++) {
				matriz[i][j] = 0;
			}
		}
	}
	
	
	/**
	 * 
	 */
	public void print () {
		for (int i = 0; i < FILAS; i++) {
			for (int j = 0; j < COLUMNAS; j++) {
				System.out.print(matriz[i][j] + "\t");
			}
			System.out.println();
		}
	}
	
	
	/**
	 * @return the matriz
	 */
	public int[][] getMatriz() {
		return matriz;
	}


	/**
	 * 
	 * @return
	 */
	public static Matriz getInstance () {
		if (instance == null) {
			instance = new Matriz();
		}
		return instance;
	}
	
	
	/**
	 * 
	 * @return
	 */
	public boolean isJuegoTerminado () {
		
		if (matriz[0][0] == matriz [0][1] && matriz[0][1] == matriz[0][2] && matriz[0][2] != 0) {
			if(matriz[0][0]==1) {
				JOptionPane.showMessageDialog(null, "Ha ganado el jugador Rafa ");
			}
			if(matriz[0][0]==2) {
				JOptionPane.showMessageDialog(null, "Ha ganado el jugador Juanmi");
			}
			return true;
		}
		if (matriz[1][0] == matriz [1][1] && matriz[1][1] == matriz[1][2] && matriz[1][2] != 0) {
			if(matriz[1][0]==1) {
				JOptionPane.showMessageDialog(null, "Ha ganado el jugador Rafa ");
			}
			if(matriz[1][0]==2) {
				JOptionPane.showMessageDialog(null, "Ha ganado el jugador Juanmi");
			}
			return true;
		}
		if (m(int) Math.round(Math.random()*100)atriz[2][0] == matriz [2][1] && matriz[2][1] == matriz[2][2] && matriz[2][2] != 0) {
			if(matriz[2][0]==1) {
				JOptionPane.showMessageDialog(null, "Ha ganado el jugador Rafa ");
			}
			if(matriz[2][0]==2) {
				JOptionPane.showMessageDialog(null, "Ha ganado el jugador Juanmi");
			}
			return true;
		}
		if (matriz[0][0] == matriz [1][0] && matriz[1][0] == matriz[2][0] && matriz[2][0] != 0) {
			if(matriz[0][0]==1) {
				JOptionPane.showMessageDialog(null, "Ha ganado el jugador Rafa ");
			}
			if(matriz[0][0]==2) {
				JOptionPane.showMessageDialog(null, "Ha ganado el jugador Juanmi");
			}
			return true;
		}
		if (matriz[0][1] == matriz [1][1] && matriz[1][1] == matriz[2][1] && matriz[2][1] != 0) {
			if(matriz[0][1]==1) {
				JOptionPane.showMessageDialog(null, "Ha ganado el jugador Rafa ");
			}
			if(matriz[0][1]==2) {
				JOptionPane.showMessageDialog(null, "Ha ganado el jugador Juanmi");
			}
			return true;
		}
		if (matriz[0][2] == matriz [1][2] && matriz[1][2] == matriz[2][2] && matriz[2][2] != 0) {
			if(matriz[0][2]==1) {
				JOptionPane.showMessageDialog(null, "Ha ganado el jugador Rafa ");
			}
			if(matriz[0][2]==2) {
				JOptionPane.showMessageDialog(null, "Ha ganado el jugador Juanmi");
			}
			return true;
		}
		if (matriz[0][0] == matriz [1][1] && matriz[1][1] == matriz[2][2] && matriz[2][2] != 0) {
			if(matriz[0][0]==1) {
				JOptionPane.showMessageDialog(null, "Ha ganado el jugador Rafa ");
			}
			if(matriz[0][0]==2) {
				JOptionPane.showMessageDialog(null, "Ha ganado el jugador Juanmi");
			}
			return true;
		}
		if (matriz[0][2] == matriz [1][1] && matriz[1][1] == matriz[2][0] && matriz[2][0] != 0) {
			if(matriz[0][2]==1) {
				JOptionPane.showMessageDialog(null, "Ha ganado el jugador Rafa ");
			}
			if(matriz[0][2]==2) {
				JOptionPane.showMessageDialog(null, "Ha ganado el jugador Juanmi");
			}
		return true;
			}		
		return false;
			
	}
	}


