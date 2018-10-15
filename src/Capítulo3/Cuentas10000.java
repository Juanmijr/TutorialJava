package Capítulo3;

import javax.swing.JOptionPane;

public class Cuentas10000 {

	public static void main(String[] args) {
		int numeroPensado;
		int suma=0;
			for (int i = 0 ; i<=10000; i++) {
			numeroPensado=(int) Math.round(Math.random ()* 1000);
			suma=numeroPensado+suma;
		}
			
			
			JOptionPane.showMessageDialog(null,"La suma de todos los números es: " + suma + " y la media: " + ((float)suma/10000));
				
			
	
}
		
	

	}


