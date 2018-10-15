package Capítulo3;

import javax.swing.JOptionPane;

public class Cartamasalta {

	public static void main(String[] args) {
		int cartaMaquina= (int)(Math.random()*14) ;
		int miCarta= (int)(Math.random()*14);
		int valordelpaloPC= (int)(Math.random()*4);
		int valordelpaloHum= (int)(Math.random()*4);
		
		do {
		if (cartaMaquina>miCarta) {
			JOptionPane.showMessageDialog(null, "HA GANADO LA PC");
		}
		if (cartaMaquina<miCarta) {
			JOptionPane.showMessageDialog(null, "HAS GANADO TÚ");
		}
		if (cartaMaquina==miCarta && valordelpaloPC > valordelpaloHum) {
		}
		}while ( valordelpaloPC > valordelpaloHum);
		
		
		

	}

}
