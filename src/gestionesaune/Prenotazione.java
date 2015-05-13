package gestionesaune;

import java.time.LocalDateTime;

public class Prenotazione {
	private int posti;
	private LocalDateTime oraDiArrivo;
	private LocalDateTime oraDiUscita;
	
	public Prenotazione(int posto, LocalDateTime oraDiArrivo, LocalDateTime oraDiUscita){
		posto = this.posti;
		oraDiArrivo = this.oraDiArrivo;
		oraDiUscita = this.oraDiUscita;
	}

	public int getPosti() {
		return posti;
	}

	public LocalDateTime getOraDiArrivo() {
		return oraDiArrivo;
	}

	public LocalDateTime getOraDiUscita() {
		return oraDiUscita;
	}
	
	public int getNumeroOre(){
		return ;
	}
	
	public double getRicavoComplessivo(){
		return ;
	}
}