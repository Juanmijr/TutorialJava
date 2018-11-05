package capítulo1;

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
			System.out.println("SUSPENSO TÍO");
			break;
		case 5:
			System.out.println("APROBADO TÍO");
			break;
		case 6:
			System.out.println("BIEN TÍO");
			break;
		case 7:
			System.out.println("BIEN TÍO");
			break;
		case 8:
			System.out.println("NOTABLE TÍO");
			break;
		case 9:
			System.out.println("NOTABLE TÍO");
			break;
		case 10:
			System.out.println("SOBRESALIENTE, ENHORABUENA TÍO");
			break;
		default:
			System.out.println("ERROR, EL NÚMERO INTRODUCIDO NO ES RECONOCIDO COMO UNA NOTA");

		}
	}
}
