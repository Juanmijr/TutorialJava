package cap�tulo1;

import javax.swing.JOptionPane;

public class KK1 {

	public static void main(String[] args) {
		String str = JOptionPane.showInputDialog("Introduzca nota");
		int nota = Integer.parseInt(str);
		
		switch (nota){
		case 1:
		case 2:
		case 3:
		case 4:
			System.out.println("SUSPENSO T�O");
			break;
		case 5:
			System.out.println("APROBADO T�O");
			break;
		case 6:
			System.out.println("BIEN T�O");
			break;
		case 7:
			System.out.println("BIEN T�O");
			break;
		case 8:
			System.out.println("NOTABLE T�O");
			break;
		case 9:
			System.out.println("NOTABLE T�O");
			break;
		case 10:
			System.out.println("SOBRESALIENTE, ENHORABUENA T�O");
			break;
		default:
			System.out.println("ERROR, EL N�MERO INTRODUCIDO NO ES RECONOCIDO COMO UNA NOTA");

		}
	}
}
