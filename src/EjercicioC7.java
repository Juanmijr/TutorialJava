import javax.swing.JOptionPane;

public class EjercicioC7 {

	public static void main(String[] args) {
		
		int num = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número"));
		if ((num &1)==1) {
	System.out.println(num + " es número impar");		
		}
		else {
			System.out.println(num + " es número par");
		}

	}

}
