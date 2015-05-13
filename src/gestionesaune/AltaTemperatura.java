package gestionesaune;

public class AltaTemperatura extends Sauna{
	private double costoOrario;
	
	public AltaTemperatura(double costoOrario, int numeroUnivoco, int capienza){
		super(numeroUnivoco, capienza);
		costoOrario = this.costoOrario;
	}

	public double getCostoOrario() {
		return costoOrario;
	}	
}