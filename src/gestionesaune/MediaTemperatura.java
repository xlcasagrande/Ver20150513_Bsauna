package gestionesaune;

public class MediaTemperatura extends Sauna{
	private double costoOrario;
	
	public MediaTemperatura(double costoOrario, int numeroUnivoco, int capienza){
		super(numeroUnivoco, capienza);
		costoOrario = this.costoOrario;
	}

	public double getCostoOrario() {
		return costoOrario;
	}	
}