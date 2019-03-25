package examenes.ExamenCaja_del_supermercado;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;

import javax.swing.JOptionPane;

public class Caja {
	private static Properties propiedades = null;
	private float cuenta=0;
	Cliente juanmi = new Cliente ();
	private HashMap<String, Articulo> listaArticulos = new HashMap<String, Articulo>();
	private static List<CambioMenorListener> listeners = new ArrayList <CambioMenorListener>();
	
	// Instancia Singleton
			private static Caja instancia= null;
			
			
			/**
			 * Getter Singleton
			 * @return
			 */
			public static Caja getInstancia () {
				if (instancia == null) {
					instancia = new Caja();
				}
				return instancia;
			}
		
	/**
	 * 
	 */
	private void eliminarFicheroEnHashMap (String ID) {
		this.listaArticulos.remove(ID);
	}
	
	public static void addCambioMenorListener (CambioMenorListener newListener) {
		listeners.add(newListener);
	}
	
	
	public static void removeCambioMenorListener (CambioMenorListener listener) {
		for (int i = 0; i < listeners.size(); i++) {
			if (listeners.get(i).equals(listener)) {
				listeners.remove(i);
			}
		}
	}
	
	
	public static void fireCambioMenorListeners (float numero) {
		for (int i = 0; i < listeners.size(); i++) {
			listeners.get(i).nuevoCambioMenor(new CambioMenorEvent(numero));
		}		
	}
	
	
	/**
	 * 
	 */
	/**
	 * 
	 * @param string 
	 * @return
	 */
	private static Properties getPropiedades() {
		if (propiedades == null) {
			propiedades = new Properties();
		    
			try {

				File file = new File("./src/examenes/ExamenCaja_del_supermercado/nombre.properties");

				propiedades.load(new FileReader(file));
			
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 
		}
		return propiedades;
	}
	
	/**
	 * 
	 * @param nombrePropiedad
	 * @return
	 */
	public static String getProperty(String nombrePropiedad) {
		return getPropiedades().getProperty(nombrePropiedad);
	}

	
	private  void cargarListaAHashMap () {
		for(int i = 0 ; i< juanmi.carro.size();i++) {
			this.listaArticulos.put(juanmi.carro.get(i).ID, juanmi.carro.get(i));
			juanmi.carro.remove(i);
		}
		
	}
	private float getCuenta() {
					
			// Recorro todos los objetos del almacen
			Iterator<Articulo> articulos = this.listaArticulos.values().iterator();
			while (articulos.hasNext()) {
				Articulo art = articulos.next();
				cuenta += art.precio * art.CantArticulos;
		}
			return cuenta;
	}
	
	
	private void eliminador() {
		
		// Recorro todos los objetos del almacen
					Iterator<Articulo> keys = this.listaArticulos.values().iterator();
					while (keys.hasNext()) {
						Articulo art =keys.next();
						int num = JOptionPane.showConfirmDialog(null, "¿Quiere devolver el articulo"+ (art.Nombre) +"?"
								+ "\n 0 = Si - 1=No");
						
						if (num == 0) {
							JOptionPane.showMessageDialog(null,art.Nombre + " ha sido eliminado");
							SimpleDateFormat sdf = new SimpleDateFormat ("EEE, MMM d, ''yy 'at' hh:mm:ss a z");
							 Date fechaDevuelta = null;
							 try {
									fechaDevuelta = sdf.parse("horaActual");
								} catch (ParseException e) {
									System.out.println ("Error en el parseo de la fecha");
									e.printStackTrace();
								}
							Caja.getInstancia().eliminarFicheroEnHashMap(art.ID);
						}
						
						
				}
		
	}

	
	public static void main(String[] args) {
		String nombreSuper = Caja.getProperty("NOMBRE");
		JOptionPane.showMessageDialog(null, "Bienvenido a: " + nombreSuper);
		
		Caja.getInstancia().cargarListaAHashMap();
		float cuenta = Caja.getInstancia().getCuenta();
		JOptionPane.showMessageDialog(null, "Su compra son: " + cuenta );
		SupervisorCajas supervisor = new SupervisorCajas();
		cuenta = Caja.getInstancia().getCuenta();
		Caja.getInstancia().eliminador();
		
		JOptionPane.showMessageDialog(null, "Su compra final son: " + cuenta );
		float total = Float.parseFloat(JOptionPane.showInputDialog("¿Cuánto va a pagar?"));
		
		addCambioMenorListener(supervisor);
		
		
		if (cuenta == total) {
			JOptionPane.showMessageDialog(null, "Compra finalizada");			
		}
		else {
			if(total>cuenta) {
				JOptionPane.showMessageDialog(null, "Se te devuelve: " + (total-cuenta));
			}
			else {
				fireCambioMenorListeners(total);
			}
		}
		
	}

}
