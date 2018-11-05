package Simulacroexamen;

import java.util.Date;

import javax.swing.JOptionPane;

public class Ejercicio2 {

	public static void main(String[] args) {
	int num;
	
	do {
	num=Integer.parseInt(JOptionPane.showInputDialog("INTRODUZCA UN NÚMERO"));
	long millisAntes = new Date().getTime();
	for(int i=1;i<=num;i++) {
		
	}
	long millisDespues = new Date().getTime();
	System.out.println("Ha tardado: " + ((millisDespues - millisAntes)/100 + " "
			+ "segundos"));
		}while (num!=0);
	
	
	}
	

}
