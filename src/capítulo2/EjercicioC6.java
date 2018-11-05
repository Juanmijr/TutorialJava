package capítulo2;
import javax.swing.JOptionPane;

public class EjercicioC6 {

	public static void main(String[] args) {
		int num1 = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un número"));
		
	
	int resto = num1 % 2 ;
	if (resto == 0) {
		System.out.println(num1 + "ES PAR");}
	else {
		System.out.println(num1 + "ES IMPAR");}
	}

}

