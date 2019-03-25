package examenes.ExamenCaja_del_supermercado;

import javax.swing.JOptionPane;

public class SupervisorCajas implements CambioMenorListener {

	public SupervisorCajas() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void nuevoCambioMenor(CambioMenorEvent event) {
		JOptionPane.showMessageDialog(null, "Soy el supervisor y he sido avisado de que intentas pagar con menos del total");		
	}
	
	

}
