package ejerciciosTutorial.capitulo8;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;


public class VentanaPrincipal extends JFrame {

	public VentanaPrincipal() {
		//MEDIDAS DE VENTANA
		this.setBounds(0,0,800,600);
		//SI QUIERES QUE LA VENTANA NO SEA AJUSTABLE
		//this.setResizable(false);
		//COMO QUEREMOS QUE SALGA EN PANTALLA
		this.setExtendedState(JFrame.NORMAL);
		//SI QUEREMOS QUE EL PROCESO SE CIERRE
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JTabbedPane tabbedPanel = new JTabbedPane();
		
		tabbedPanel.add("Tab01", getPanelTab01());
		
		
		this.setContentPane(tabbedPanel);
		
		
		
	}
	
	private static char digitosHexadecimales[] = new char[] {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
	
	/**
	 * 
	 * @return
	 */
	private static String getColorAzar () {
		StringBuffer sb = new StringBuffer ("#");
		for (int i = 0; i < 6; i++) {
			sb.append(digitosHexadecimales[Utils.obtenerNumeroAzar(0, digitosHexadecimales.length-1)]);
		}
		return sb.toString();
	}
	
	
	private JPanel getPanelTab01 () {
	
	
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout());
		JLabel jbl = new JLabel("Neneee") ;
		panel.add(jbl);
		JTextField jtf = new JTextField("Hola");
		panel.add(jtf);
		JPasswordField jpf = new JPasswordField(15);
		panel.add(jpf);
		
		String opciones[] = new String [10];
		for (int i = 0 ; i < opciones.length; i++) {
			opciones[i] = "JComboBox Option " + i;
		}
		
		JComboBox jcb = new JComboBox(opciones);
		jcb.setSelectedItem(0);
		panel.add(jcb);
		
		
		
		JList jl = new JList(opciones);
		jl.setSelectionMode(0);
		panel.add(jl);
		JButton jb = new JButton("NEW COLOR");
		
		
		jb.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				panel.setBackground(Color.decode(getColorAzar()));
				
			}
		});
		
		
		panel.add(jb);
		
		panel.repaint();
		
		return panel;
	}
	
	
	
	public static void main (String args[]) {
		VentanaPrincipal ventana = new VentanaPrincipal();
		ventana.setVisible(true);
	}
}
