import javax.swing.JOptionPane;

public class EjercicioCB34 {

	public static void main(String[] args) {
		int numeroimporte= Integer.parseInt(JOptionPane.showInputDialog("Introduce el importe: ")) ;
		int numerorecibido= Integer.parseInt(JOptionPane.showInputDialog("Introduzca la cantidad recibida: "));
		int devuelta = numerorecibido-numeroimporte ;
		int monedas100 = devuelta/100;
		int modulo100= (monedas100 % 100);
		int monedas50= modulo100/50;
		int modulo50= (monedas50 % 50);
		int monedas20= modulo50/20;
		int modulo20= (monedas20 % 20);
		int monedas10= modulo20/10;
		int modulo10= (monedas10 % 10);
		int monedas5= modulo10/5;
		int modulo5= (monedas5 % 5);
		int monedas1= modulo5/1;
		System.out.println("La vuelta son "
				+ monedas100 + " monedas de 100, "
				+ monedas50 + " monedas de 50, "
 				+ monedas20 + " monedas de 20 "
				+ monedas10 + " monedas de 10 "
				+ monedas5 + " monedas de 5 "
				+ monedas1 + " monedas de 1 ");
		
		

	}

}
