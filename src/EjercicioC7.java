import javax.swing.JOptionPane;

public class EjercicioC7 {

	public static void main(String[] args) {
		
		int num = Integer.parseInt(JOptionPane.showInputDialog("Introduce un n�mero"));
		if ((num &1)==1) {
	System.out.println(num + " es n�mero impar");		
		}
		else {
			System.out.println(num + " es n�mero par");
		}

	}

}
