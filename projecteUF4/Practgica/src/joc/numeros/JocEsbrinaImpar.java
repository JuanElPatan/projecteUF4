package joc.numeros;

public class JocEsbrinaImpar extends JocEsbrinaNumero {

	public JocEsbrinaImpar(int numVidesInicial, int numEncertar, String nom) {
		super(numVidesInicial, numEncertar, nom);
	}

	public boolean validaNumero(int numero) {
		if (numero > 0 && numero < 10 && numero % 2 != 0) {
			return true;
		} else {
			System.out.println("Numero introduit no és impar, torna a introduir un numero.");
			return false;
		}
	}

	public void mostraNombre() {
		System.out.println("Esbrina un número qualsevol que sigui impar.");
	}

	public void mostraInfo() {
		System.out.println("Esbrina un número entre el 0 i el 10 que sigui impar amb un màxim de " + super.getNumVidesActual() + " vides.");
	}

	public void juga() {
		super.juga();
	}
}
