package capítulo6.bloque1;

import javax.swing.JOptionPane;

public class Ejercicio1 {

	public static void main(String[] args) {
		int a = Integer.parseInt(JOptionPane.showInputDialog("Introduzca la incógnita a"));
		int b = Integer.parseInt(JOptionPane.showInputDialog("Introduzca la incógnita b"));
		int c = Integer.parseInt(JOptionPane.showInputDialog("Introduzca la incógnita c"));
		float[] resultado = ecuacionSegundoGrado(a,b,c);
		System.out.println("El resultado es: " + resultado[1]+ ", " + resultado[2]);
	}
	
	public static float[] ecuacionSegundoGrado (float a, float b, float c) {
		float[] resultado = new float [2];
		resultado [1] = (float)((-b + Math.sqrt((b*b)-4*a*c))/(float)(2*a));
		resultado [2] = (float)((-b - Math.sqrt((b*b)-4*a*c))/(float)(2*a));
		
		return resultado;
	}

}
