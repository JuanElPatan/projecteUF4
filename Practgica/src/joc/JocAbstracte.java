package joc;

public class JocAbstracte {

	// Atributs
	private int numVidesActual, numVidesInicial, record;
	private String nom;

	// Constructor
	public JocAbstracte(int numVidesInicial, String nom) {
		super();
		this.setNumVidesInicial(numVidesInicial);
		this.nom = nom;
	}

	// Getters i Setters
	public int getNumVidesActual() {
		return numVidesActual;
	}

	public void setNumVidesActual(int numVidesActual) {
		this.numVidesActual = numVidesActual;
	}

	// Mètodes
	public void mostraVidesRestants() {
		System.out.println("Numero de vides actual "+this.numVidesActual+" en el joc \""+this.nom+"\"");
	}

	public int getNumVidesInicial() {
		return numVidesInicial;
	}

	public void setNumVidesInicial(int numVidesInicial) {
		this.numVidesInicial = numVidesInicial;
	}

	public int getRecord() {
		return record;
	}

	public void setRecord(int record) {
		this.record = record;
	}

}