package cap�tulo2;
import javax.swing.JOptionPane;

public class EjercicioC2 {

	public static void main(String[] args) {
		{
			String numero1 = JOptionPane.showInputDialog("Introduce un numero");//Pedimos al programa que le pida un n�mero
			int num1 = Integer.parseInt (numero1);//Asignamos ese n�mero
			String numero2 = JOptionPane.showInputDialog("Introduce un numero");//Pedimos otro n�mero
			int num2 = Integer.parseInt(numero2);// Asignamos n�mero
			
			if (num1<num2) {
				System.out.println("El n�mero menor es " + num1);
			}
			else {
				if (num1==num2) {
					System.out.println("El n�mero son iguales");
				}
				else {
				System.out.println("El n�mero menor es " + num2);
				}
			}
			}

	}

}
