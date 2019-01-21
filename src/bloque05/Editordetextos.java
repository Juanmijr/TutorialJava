package bloque05;


import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Editordetextos {
	public static void main(String[] args) {
		boolean exit = false;
		do {
			menu();
		}while(exit = false);
		
	}
	public static void menu () {
		int opcion;

		String menu = "MENU\n"
				+ "1.- Añadir una línea al texto\n"
				+ "2.- Insertar una línea en cualquier posición del texto\n"
				+ "3.- Editar una línea (reescribir su contenido)\n"
				+ "4.- Borrar una línea\n"
				+ "5.- Cortar un conjunto de líneas, (marcadas por su posición inicial y final)\n"
				+ "6.- Pegar un conjunto de líneas cortadas en una determinada posición\n"
				+ "7.- Imprimir el texto. Cada línea aparecerá numerada\n"
				+ "8.- Salir";
		
		opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));
		List<String>editorTextos = new ArrayList<String>(); 
	
		switch(opcion){
		
		case 1: 
		editorTextos.add(JOptionPane.showInputDialog("Introduzca el texto"));
		for (int i = 0; i < editorTextos.size(); i++) {
			System.out.println(editorTextos.get(i).toString());
		}
		break;
		case 2: 
		editorTextos.add(Integer.parseInt(JOptionPane.showInputDialog("Introduzca en que línea quiere introducirlo")), 
				JOptionPane.showInputDialog("Introduzca el texto"));
		for (int i = 0; i < editorTextos.size(); i++) {
			System.out.println(editorTextos.get(i).toString());
		}
		break;
		case 3:
			int case3 = Integer.parseInt(JOptionPane.showInputDialog("Introduzca en que línea quiere introducirlo"));
		editorTextos.set(case3, JOptionPane.showInputDialog("Introduzca el texto"));
				for (int i = 0; i < editorTextos.size(); i++) {
					System.out.println(editorTextos.get(i).toString());
					}
				break;
		case 4: 
			editorTextos.remove(Integer.parseInt(JOptionPane.showInputDialog("Introduzca  que línea quiere borrarlo")));
			for (int i = 0; i < editorTextos.size(); i++) {
				System.out.println(editorTextos.get(i).toString());
				}
			break;
			
		case 5:
			int posicionInicial = Integer.parseInt(JOptionPane.showInputDialog("Introduzca desde que línea quiere cortarlo"));
			int posicionFinal = Integer.parseInt(JOptionPane.showInputDialog("Introduzca hasta que línea quiere cortarlo"));
			
			List<String> list = editorTextos.subList(posicionInicial, posicionFinal);
			for (int i = 0; i < list.size(); i++) {
				System.out.println(list.get(i).toString());
				}
			break;
		case 6: 
			editorTextos.add(list.get(index))
			
		}
	}
	

}
