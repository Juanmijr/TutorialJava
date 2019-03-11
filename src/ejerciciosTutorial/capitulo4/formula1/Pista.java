package capitulo4.formula1;

public class Pista {
	Obstaculo[] obstaculos = new Obstaculo [4];
	int contadorarray = 0;
	static int y;
	
	Vehiculo vehiculos; 
	public Pista(Vehiculo vehiculos) {
		super();
		vehiculos = this.vehiculos;
		getObstaculos();
	}
	@Override
	public String toString() {
		return "Pista [vehiculos=" + vehiculos + "]";
	}
	
	void getObstaculos() {
		do{		
			int o = (int) Math.round(Math.random());
				 if (o==0){
					 obstaculos[contadorarray]= new Rampa();
				 }
				 else {
					 obstaculos[contadorarray]=new ManchaAceite();
				 }
				 
				 contadorarray++;
				
		}while(obstaculos[contadorarray]==null && contadorarray<=4);
	}
	
	public boolean colisiona (int xPosibleColision) {
		if (xPosibleColision)
	}

	private void posicionaObtaculo (Obstaculo obstaculoAPosicionar) {
		int xCandidata;
		boolean obstaculoColisiona;
		do {
		xCandidata = (int) Math.round(Math.random()*(500-20)+ 20);
		
		obstaculoColisiona=false;
		for(Obstaculo obs : this.obstaculos) {
			if(obs!=null; && obs.colisiona(xCandidata)) {
				obstaculoColisiona=true;
			}
		}
	}while(obstaculoColisiona);
		
		obstaculoAPosicionar.setX(xCandidata);
	}
	
}
