package examenpoker;

import java.util.Arrays;

public class Baraja {
	private Carta cartas[];


	
	public Baraja() {
		super();
		empiezaBaraja();	
	}
	
	
	public Baraja(Carta[] cartas) {
		super();
		this.cartas = cartas;
	}
	

	

	
	//Método de bajar la última
	public void bajaCarta() {
			Carta aux = cartas[0];
		for (int j = 0; j < cartas.length-1; j++) {
				cartas[j] = cartas[j+1];
			}
			cartas[cartas.length-1] = aux;
	}
	
	//Método de subir la última
	public void arribaCarta() {
		Carta aux = cartas[cartas.length-1];
		for (int i = (cartas.length - 1); i > 0; i--) {
			cartas[i] = cartas[i-1];
		}
		cartas[0] = aux;
	}

	//Creación de la baraja 
	public void empiezaBaraja() {
			cartas = new Carta[52];
			
			int indiceArray = 0;
			for (int i = 0; i < 4; i++) {
				if (i==0) {
					for (int j = 2; j <= 14; j++) {
						Carta carta = new Carta(j, "PICAS", indiceArray);
						cartas[indiceArray] = carta;
						indiceArray++;
					}
					
				}
				if (i==1) {
					for (int j = 2; j <= 14; j++) {
						Carta carta = new Carta(j, "DIAMANTES", indiceArray);
						cartas[indiceArray] = carta;
						indiceArray++;
					}
			}
				if (i==2) {
					for (int j = 2; j <= 14; j++) {
						Carta carta = new Carta(j, "TRÉBOLES", indiceArray);
						cartas[indiceArray] = carta;
						indiceArray++;
					}
				}
				if (i==3) {
					for (int j = 2; j <= 14; j++) {
						Carta carta = new Carta(j, "CORAZONES", indiceArray);
						cartas[indiceArray] = carta;
						indiceArray++;
					}
				}
			}
	}
	
	//Método para mezclar
	public void mezclar () {
		
		for (int i = 0; i < 100; i++) {
			int indiceAzar1 = (int) Math.round(Math.random() * (cartas.length-1));
			int indiceAzar2 = (int) Math.round(Math.random() * (cartas.length-1));
			
			Carta aux = cartas[indiceAzar1];
			cartas[indiceAzar1] = cartas[indiceAzar2];
			cartas[indiceAzar2] = aux;
		}
	}
	
	


	//toString
	@Override
	public String toString() {
		return "Baraja [cartas=\n" + Arrays.toString(cartas)  + "]";
	}


	
	
	
	

}



			
	
		
	
	
