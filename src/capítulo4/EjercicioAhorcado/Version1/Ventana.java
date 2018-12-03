package capítulo4.EjercicioAhorcado.Version1;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

//La clase extiende de Canvas, se trata de un lienzo sobre el cual podemos pintar
//libremente.
public class Ventana extends Canvas {


		// Declaraci�n de variables que nos permitir�n introducir el ancho y el alto
		// de la ventana
		public static final int WIDTH = 640;
		public static final int HEIGHT = 480;

		
		public Ventana () {
			// La clase JFrame nos permite mostrar una ventana en pantalla
			JFrame ventana = new JFrame("El juego del ahorcado");
			// Establecemos las dimensiones que queremos que tenga
			ventana.setBounds(0,0,WIDTH,HEIGHT);
			
			// Obtengo una referencia al panel principal de la ventana.
			// Todas las ventanas tienen un panel principal	
			JPanel panel = (JPanel)ventana.getContentPane();

			// Al panel principal de la ventana le a�adimos el objeto this, un Canvas
			panel.add(this);

			// Establezco el tama�o del canvas (this) para que ocupe todo el tama�o de la ventana
			this.setBounds(0,0,WIDTH,HEIGHT);
			
			// Provocamos que el programa se acabe cuando cerramos la ventana 
			ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			// Hacemos visible la ventana.
			ventana.setVisible(true);
			// Evitamos que la ventana pueda redimensionarse.
			ventana.setResizable(false);
		}
		
		
		
		/**
		 * Sobrescribimos el m�todo "paint" que tienen todos los componentes gr�ficos en AWT-SWING
		 */
		@Override
		public void paint(Graphics g) {
			//Primer bloque
			g.setColor(Color.black);
			g.fillRect(100, 350, 150, 35);
			//Segundo bloque
			g.setColor(Color.black);
			g.fillRect(125, 300, 100, 85);
			//Línea vertical - bloques
			g.setColor(Color.black);
			g.fillRect(170, 50, 15, 270);
			//Línea horizontal- línea
			g.setColor(Color.black);
			g.fillRect(170, 37, 275, 15);
			//Línea vertical - cabeza
			g.setColor(Color.black);
			g.fillRect(435, 37, 15, 85);
			//Cabeza
			g.setColor(Color.decode("#ff9966"));
			g.fillOval(416, 100, 50, 50);
			//Cuerpo
			g.setColor(Color.decode("#ff9966"));
			g.fillRect(417, 150, 50, 110);
			//Brazo izq
			g.setColor(Color.decode("#ff9966"));
			g.fillRect(390, 150, 25, 70);
			//Brazo derecho
			g.setColor(Color.decode("#ff9966"));
			g.fillRect(469, 150, 25, 70);
			//Pierna izquierda
			g.setColor(Color.decode("#ff9966"));
			g.fillRect(417, 260, 23, 70);
			//Pierna derecha
			g.setColor(Color.decode("#ff9966"));
			g.fillRect(444, 260, 23, 70);
			//ahorcado
			g.setColor(Color.RED);
			g.fillRect(412, 150, 60, 3);
			

		}

	}
