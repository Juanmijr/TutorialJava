package Cap�tulo5;

import javax.swing.JOptionPane;

public class numAlAzarArray {

	public static void main(String[] args) {
		int limitearriba= Integer.parseInt(JOptionPane.showInputDialog("INTRODUZCA UN L�MITE M�XIMO"));
		int limiteabajo= Integer.parseInt(JOptionPane.showInputDialog("INTRODUZCA UN L�MITE M�NIMO"));
		int array[]= new int [150];
		int num = 0; 
		
			for (int i = 0 ; i<150 ; i++) {
				num*=0;
			
		while(num<limiteabajo){
		num= (int) Math.round(Math.random()*limitearriba);
		}
		array[i] = num;
		}
			System.out.println(num);
	}
}