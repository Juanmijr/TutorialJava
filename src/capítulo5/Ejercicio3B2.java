package capítulo5;

import javax.swing.JOptionPane;

public class Ejercicio3B2 {
	public static void main (String args []) {
		int array[]= new int [150];
		int i=0;
		int multiplicacion;
		int multiplicador= Integer.parseInt((JOptionPane.showInputDialog("NÚMERO QUE QUIERES MULTIPLICAR")));
		
		for (i =0; i < 100 ; i++);{
			array[i]=(int) Math.round(Math.random()*100);
			multiplicacion=array[i]*multiplicador;
			System.out.println(array[i]+ "* " + multiplicador + " = " + multiplicacion);		
		}
	}
}

