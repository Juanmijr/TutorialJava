package examen12018;

import javax.swing.JOptionPane;

public class Ejercicio4 {

	public static void main(String[] args) {
		//DECLARAMOS E INICIAMOS ARRAY
		int array[]=new int [100];
		int pedido=Integer.parseInt(JOptionPane.showInputDialog("INTRODUZCA EL NÚMERO POR EL QUE QUIERE TERMINAR"));
		int num=0;
		for (int i = 0; i<array.length;i++) {
			array[i]=(int)Math.round(Math.random()*1000);
			System.out.print(array[i]+ " ");
		//PEDIMOS EN QUE NÚMERO QUEREMOS QUE ACABE
					if (array[i]%10==pedido);{
					System.out.println(" ");
					System.out.println(array[i]);			
					}
		}
	}
		
	}

