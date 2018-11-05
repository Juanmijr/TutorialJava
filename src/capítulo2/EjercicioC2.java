package capítulo2;
import javax.swing.JOptionPane;

public class EjercicioC2 {

	public static void main(String[] args) {
		{
			String numero1 = JOptionPane.showInputDialog("Introduce un numero");//Pedimos al programa que le pida un número
			int num1 = Integer.parseInt (numero1);//Asignamos ese número
			String numero2 = JOptionPane.showInputDialog("Introduce un numero");//Pedimos otro número
			int num2 = Integer.parseInt(numero2);// Asignamos número
			
			if (num1<num2) {
				System.out.println("El número menor es " + num1);
			}
			else {
				if (num1==num2) {
					System.out.println("El número son iguales");
				}
				else {
				System.out.println("El número menor es " + num2);
				}
			}
			}

	}

}
