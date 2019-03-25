package ejerciciosTutorial.capitulo8;

import javax.swing.JFrame;

public class Ventanita02 extends JFrame {
	
	public Ventanita02 () {
		//MEDIDAS DE VENTANA
		this.setBounds(0,0,800,600);
		//COMO QUEREMOS QUE SALGA EN PANTALLA
		this.setExtendedState(JFrame.NORMAL);
		//SI QUEREMOS QUE EL PROCESO SE CIERRE
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	

	public static void main(String[] args) {
	
	}

}
