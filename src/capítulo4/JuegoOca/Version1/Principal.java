package capítulo4.JuegoOca.Version1;

public class Principal {
	
	public static Casilla tablero [] = new Casilla [63];
	public static String msjOca = "De oca a oca y tiro porque me toca";
	public static String msjPuente = "De puente a puente y tiro porque me toca la corriente";
	public static String msjDado = "De dado a dado y tiro porque me ha tocado";
	/**
	 * 
	 */
	public static void main (String args []) {	
		//ESTRUCTURA BÁSICA DEL TABLERO
		
		tablero[1] = new Casilla (1, "Inicio");
		tablero[2] = new Casilla (2, "Caballo");
		tablero[3] = new Casilla (3, "Pez");
		tablero[4] = new Casilla (4, "Payaso");
		tablero[5] = new Casilla (5, "Oca", null, 1, msjOca);
		tablero[6] = new Casilla (6, "Puente", null, 1, msjPuente);
		tablero[7] = new Casilla (7, "Tortuga");
		tablero[8] = new Casilla (8, "Banco");
		tablero[9] = new Casilla (9, "Oca", null, 1, msjOca);
		tablero[10] = new Casilla (10, "Ratón");
		tablero[11] = new Casilla (11, "Rana");
		tablero[12] = new Casilla (12, "Puente", null, 1, msjPuente);
		tablero[13] = new Casilla (13, "Pollo");
		tablero[14] = new Casilla (14, "Oca", null, 1, msjOca);
		tablero[15] = new Casilla (15, "Helado");
		tablero[16] = new Casilla (16, "Oso");
		tablero[17] = new Casilla (17, "Bebesito");
		tablero[18] = new Casilla (18, "Oca", null, 1, msjOca);
		tablero[19] = new Casilla (19, "Posada", null, -1, "");
		tablero[20] = new Casilla (20, "Cohete");
		tablero[21] = new Casilla (21, "Tarta");
		tablero[22] = new Casilla (22, "Casita");
		tablero[23] = new Casilla (23, "Oca", null, 1, msjOca);
		tablero[24] = new Casilla (24, "Ramo");
		tablero[25] = new Casilla (25, "León");
		tablero[26] = new Casilla (26, "Dados", null, 1, msjDado);
		tablero[27] = new Casilla (27, "Oca", null, 1, msjOca);
		tablero[28] = new Casilla (28, "Bicicleta");
		tablero[29] = new Casilla (29, "Delfín");
		tablero[30] = new Casilla (30, "Dinosaurio");
		tablero[31] = new Casilla (31, "Pozo", null, -3, "Te has caido en el pozo");
		tablero[32] = new Casilla (32, "Oca", null, 1, msjOca);
		tablero[33] = new Casilla (33, "Mariposa");
		tablero[34] = new Casilla (34, "Moto");
		tablero[35] = new Casilla (35, "Osito");
		tablero[36] = new Casilla (36, "Oca", null, 1, msjOca);
		tablero[37] = new Casilla (37, "Elefante");
		tablero[38] = new Casilla (38, "Ciervo");
		tablero[39] = new Casilla (39, "Conejo");
		tablero[40] = new Casilla (40, "Fresas");
		tablero[41] = new Casilla (41, "Oca", null, 1, msjOca);
		tablero[42] = new Casilla (42, "Laberinto", null, 0,"Te has perdido, vuelves a 30");
		tablero[43] = new Casilla (43, "Caballo disfrazado");
		tablero[44] = new Casilla (44, "Paragüas");
		tablero[45] = new Casilla (45, "Oca", null, 1, msjOca);
		tablero[46] = new Casilla (46, "Conejito");
		tablero[47] = new Casilla (47, "Muñeco de nieve");
		tablero[48] = new Casilla (48, "Mariposa");
		tablero[49] = new Casilla (49, "Tren");
		tablero[50] = new Casilla (50, "Oca", null, 1, msjOca);
		tablero[51] = new Casilla (51, "Mono");
		tablero[52] = new Casilla (52, "Carcel", null, -2, "");
		tablero[53] = new Casilla (53, "Dados", null, 1, msjDado);
		tablero[54] = new Casilla (54, "Oca", null, 1, msjOca);
		tablero[55] = new Casilla (55, "Buho");
		tablero[56] = new Casilla (56, "Tiburón");
		tablero[57] = new Casilla (57, "Perro");
		tablero[58] = new Casilla (58, "Muerte", null, 0, "Has muerto");
		tablero[59] = new Casilla (59, "Oca", null, 1, msjOca);
		tablero[60] = new Casilla (60, "Mariposa");
		tablero[61] = new Casilla (61, "Gato");
		tablero[62] = new Casilla (62, "Regadera");
		tablero[63] = new Casilla (63, "Meta");

		
		//DESTINOS DE CASILLAS ESPECIALES
		tablero[5].setDestino(tablero[9]); //Oca
		tablero[6].setDestino(tablero[12]);//Puente
		tablero[9].setDestino(tablero[14]);//Oca
		tablero[14].setDestino(tablero[18]);//Oca
		tablero[18].setDestino(tablero[23]);//Oca
		tablero[23].setDestino(tablero[27]);//Oca
		tablero[26].setDestino(tablero[53]);//Dados
		tablero[53].setDestino(tablero[26]);//Dados
		tablero[27].setDestino(tablero[32]);//Oca
		tablero[32].setDestino(tablero[36]);//Oca
		tablero[36].setDestino(tablero[41]);//Oca
		tablero[41].setDestino(tablero[45]);//Oca
		tablero[42].setDestino(tablero[30]);//Laberinto
		tablero[45].setDestino(tablero[50]);//Oca
		tablero[50].setDestino(tablero[54]);//Oca
		tablero[54].setDestino(tablero[59]);//Oca
		tablero[58].setDestino(tablero[1]);//Muerte
		tablero[59].setDestino(tablero[63]);//Oca
		
		for (int i=1; i < tablero.length; i++) {
			System.out.println(tablero[i].getOrden() + " - " + tablero[i].getNombre());
			
		}
	}
}





