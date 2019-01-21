package bloque04;

import javax.swing.JOptionPane;

public class ejercicio3 {
	static boolean esmenorque50 = false;
	public static void main(String[] args) {

		float[] Array1 =hazArray();
		
		imprimeArray(Array1);
		
	}
	
	
	private static int getParteentera() {
		int parteEntera=(int)Math.round(Math.random()*100);
		return parteEntera;
	}
	private static int getPartedecimal() {
		int parteDecimal=(int)Math.round(Math.random()*100);
		return parteDecimal;
	}
		
	
	
	private static float[] hazArray () {
		float Array1[] = new float[5];
		
		
		for(int i = 0; i<Array1.length;i++) {
			int parteentera = getParteentera();
			int partedecimal = getPartedecimal();
			Array1[i]= (float) (parteentera + (partedecimal*0.01));
			if (partedecimal < 50) {
				System.out.println("La parte decimal de: " + Array1[i] + " está entre 00 y 49");
			}
			
		}
		return Array1;
	}
	private static void imprimeArray(float Array1[]) {
		for(int i = 0; i<Array1.length;i++) {
			System.out.print(Array1[i]+ " ");
		}
	
	}
	
}
