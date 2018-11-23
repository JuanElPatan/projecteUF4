package joc;

public class JocAbstracte {

	// Atributs
	private int numVidesActual, numVidesInicial, record;
	private String nom;

	// Constructor
	public JocAbstracte(int numVidesInicial, String nom) {
		super();
		this.numVidesInicial = numVidesInicial;
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

}