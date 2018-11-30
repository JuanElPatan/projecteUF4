package joc;

public abstract class JocAbstracte {

	// Attributes
	private int numVidesActual, numVidesInicial, record;
	private String nom;

	// Constructor
	public JocAbstracte(int numVidesInicial, String nom) {
		this.numVidesInicial = numVidesInicial;
		this.numVidesActual = numVidesInicial;
		this.nom = nom;
	}

	// Getters i Setters
	public int getNumVidesActual() {
		return numVidesActual;
	}

	public void setNumVidesActual(int numVidesActual) {
		this.numVidesActual = numVidesActual;
	}		

	public void setNumVidesInicial(int numVidesInicial) {
		this.numVidesInicial = numVidesInicial;
	}

	// Methods
	public void mostraVidesRestants() {
		System.out.println("Numero de vides actual " + this.numVidesActual + " en el joc \"" + this.nom + "\"");
	}

	public boolean treureVida() {
		this.numVidesActual--;
		if (this.numVidesActual > 0) {
			return true;
		} else {
			return false;
		}
	}

	public void reiniciaPartida() {
		this.numVidesActual = this.numVidesInicial;
	}

	public void actualizaRecord() {
		if (this.record == this.numVidesActual) {
			System.out.println("S'ha assolit el record guardat actual!");
		} else if (this.record < this.numVidesActual) {
			this.record = this.numVidesActual;
			System.out.println("El record està batut amb el següent número de vides: " + this.numVidesActual);
		}
	}
}