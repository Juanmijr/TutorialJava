package Capítulo3;

import javax.swing.JOptionPane;

public class Juegocaraocruz {

	public static void main(String[] args) {
		int numeroPensado;
		int numeroPedido;
		int contadorVICTORIAS=0;
		int contadorDERROTAS=0;
		do {
			numeroPensado = (int) Math.round(Math.random ());
			//PEDIMOS NÚMERO
			numeroPedido= Integer.parseInt(JOptionPane.showInputDialog("ELIJA CARA (1) - CRUZ (0)"));
			//INTERACTUAMOS CON EL USUARIO
			if (numeroPedido!=numeroPensado) {
				JOptionPane.showMessageDialog(null,"OH NO, HAS PERDIDO"); 
				contadorDERROTAS++;
			}
				else {
					JOptionPane.showMessageDialog(null,"ENHORABUENA, HAS ACERTADO");
					contadorVICTORIAS++;
					}
			JOptionPane.showMessageDialog(null, "VICTORIAS DEL USUARIO: " + contadorVICTORIAS + 
					" VICTORIAS DEL PC: " + contadorDERROTAS);
			
				} while (contadorVICTORIAS !=3 && contadorDERROTAS!=3);
		if (contadorVICTORIAS == 3){
			
			 JOptionPane.showMessageDialog(null, "HAS GANADO A LA MÁQUINA");
			}
			else{
				JOptionPane.showMessageDialog(null,"LO SIENTO, HAS PERDIDO" );
			}
		
	
		}

	}