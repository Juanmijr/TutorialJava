import javax.swing.JOptionPane;

public class EjercicioC4 {

	public static void main(String[] args) {
		String numero1 = JOptionPane.showInputDialog("Introduce un numero");//Pedimos al programa que le pida un n�mero
		int num1 = Integer.parseInt (numero1);//Asignamos ese n�mero
		String numero2 = JOptionPane.showInputDialog("Introduce un numero, no puede ser igual a los n�meros anteriores");//Pedimos otro n�mero
		int num2 = Integer.parseInt(numero2);// Asignamos n�meroString numero1 = JOptionPane.showInputDialog("Introduce un numero");//Pedimos al programa que le pida un n�mero
		String numero3 = JOptionPane.showInputDialog("Introduce un numero, no puede ser igual a los n�meros anteriores");
		int num3 = Integer.parseInt (numero3);//Asignamos ese n�mero
		String numero4 = JOptionPane.showInputDialog("Introduce un numero, no puede ser igual a los n�meros anteriores");//Pedimos otro n�mero
		int num4 = Integer.parseInt(numero4);// Asignamos n�mero
		String numero5 = JOptionPane.showInputDialog("Introduce un numero, no puede ser igual a los n�meros anteriores");
		int num5 = Integer.parseInt(numero5);
		{

			if (num1<=num2 && num1<=num3 && num1<=num4 && num1<=num5) {
				System.out.println("El n�mero menor es " + num1);}
			if (num2<=num1 && num2<=num3 && num2<=num4 && num2<=num5) {
				System.out.println("El n�mero menor es " + num2);}
			if (num3<=num1 && num3<=num2 && num3<=num4 && num3<=num5) {
				System.out.println("El n�mero menor es " + num3);}
			if (num4<=num1 && num4<=num2 && num4<=num3 && num4<=num5) {
				System.out.println("El n�mero menor es " + num4);}
			if (num5<=num1 && num5<=num2 && num5<=num3 && num5<=num4) {
				System.out.println("El n�mero menor es " + num5);
			}
			
				
			
		}
	
	}
	}

