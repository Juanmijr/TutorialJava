package capítulo6.BloqueHashMap;


import java.util.HashMap;
import java.util.Map.Entry;

import javax.swing.JOptionPane;


public class Main {

	String codBarrasElegido;
	String estanteElegido;
	String descripcionElegida;
	
	// Instancia Singleton
		private static Main instancia= null;
		
		
		/**
		 * Getter Singleton
		 * @return
		 */
		public static Main getInstancia () {
			if (instancia == null) {
				instancia = new Main();
			}
			return instancia;
		}
	
	private HashMap<String, Articulo> listaArticulos = new HashMap<String, Articulo>();
	
	/**
	 * 
	 * @param nombreFichero
	 */
	private void cargarFicheroEnHashMap (String codBarras, String estante, String descripcion) {
			
		this.listaArticulos.put(codBarras, new Articulo (codBarras, estante, descripcion) );
		
	}
	
	/**
	 * 
	 * @param args
	 */
	
	private void recorreHashMap () {
		String key="";
		for (Entry<String, Articulo> lista : listaArticulos.entrySet()) {
		    String cod  = lista.getKey();

		    String loco = listaArticulos.get(cod).toString();
		    
		    key += loco;
		    
		    }
		  JOptionPane.showMessageDialog(null, key);
		   
		}
		

	public static void main(String[] args) {
int opcion;
		do {
		String menu = "\t\tMENU\n"
				+ "0.- Abandona el programa\n"
				+ "1.- Inserta elemento\n"
				+ "2.- Elimina elemento\n"
				+ "3.- Actualiza elemento\n";
		opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));
		switch (opcion) {
		case 1:
			String codBarras = JOptionPane.showInputDialog("Introduzca el codBarras");
			String estante = JOptionPane.showInputDialog("Introduzca estante donde está");
			String descripcion = JOptionPane.showInputDialog("Introduce una pequeña descripción");
			Main.getInstancia().cargarFicheroEnHashMap(codBarras, estante, descripcion);
			Main.getInstancia().recorreHashMap();
	break;
		
	case 2:
		String codBarras1 = JOptionPane.showInputDialog("Introduzca el codBarras");
		Main.getInstancia().listaArticulos.remove(codBarras1);
		Main.getInstancia().recorreHashMap();
	break;
//	case 3:
//		String codBarras2 = JOptionPane.showInputDialog("Introduzca el codBarras");
//		String estante2 = JOptionPane.showInputDialog("Introduzca estante donde está");
//		String descripcion2 = JOptionPane.showInputDialog("Introduce una pequeña descripción");
//		
//		Main.getInstancia().listaArticulos.
//		break;
		}	
	}while (opcion!=0);
	}

}
