package examenes.ExamenCaja_del_supermercado;

import java.util.ArrayList;
import java.util.List;


public class Cliente {

	//Singleton
	private static Cliente instancia= null;
	
	
	/**
	 * Getter Singleton
	 * @return
	 */
	public static Cliente getInstancia () {
		if (instancia == null) {
			instancia = new Cliente();
		}
		return instancia;
	}
	/**
	 * 
	 */
	public List <Articulo> carro = new ArrayList<Articulo>();
	
	public void creadorArticulos () {
		Lacteos yogurt = new Lacteos ("1892B", "Yogurt", 3, 1.55f, "Yogurt");
		Bolleria dulce = new Bolleria ("1981D", "Filipinos", 1, 2.33f, "Nestle");
		Carniceria pollo = new Carniceria ("1475E", "Pollo", 1, 3.99f, 6.99f);
		Pescaderia lubina = new Pescaderia ("1466I", "Lubina", 2, 4.02f, 4.55f);
		LimpiezaYHogar limpiaCristales = new LimpiezaYHogar("14475E", "Limpiacristales", 5, 2.9f, "Las tres brujas");
	
		carro.add(yogurt);
		carro.add(dulce);
		carro.add(pollo);
		carro.add(lubina);
		carro.add(limpiaCristales);
	
		
	}
	

	public Cliente() {
		super();
		creadorArticulos();
		
	}
	
}
