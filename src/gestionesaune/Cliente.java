package gestionesaune;

public class Cliente {
	private String nome;
	private String cognome;
	private String email;
	private String codice;
	
	public Cliente(String nome, String cognome, String email, String codice){
		nome = this.nome;
		cognome = this.cognome;
		email = this.email;
		codice = this.codice;
	}

	public String getNome() {
		return nome;
	}

	public String getCognome() {
		return cognome;
	}

	public String getEmail() {
		return email;
	}

	public String getCodice() {
		return codice;
	}
	
	public int getNumeroOre(){
		return ;
	}
	
	public double getRicavoComplessivo(){
		return;
	}
}
