package joc.numeros;

import joc.JocAbstracte;
import comu.Teclado;

public class JocEsbrinaNumero extends JocAbstracte {

	// Attributes
	private int numEncertar;

	// Constructor
	public JocEsbrinaNumero(int numVidesInicial, int numEncertar, String nom) {
		super(numVidesInicial, nom);
		this.numEncertar = numEncertar;
	}

	// Getters & Setters
	public void setNumEncertar(int numEncertar) {
		this.numEncertar = numEncertar;
	}

	// Methods
	public boolean validaNumero(int numero) {
		if (numero > 0 && numero < 10) {
			return true;
		} else {
			return false;
		}
	}

	public void mostraNombre() {
		System.out.println("Esbrina un número qualsevol ja sigui par o impar");
	}

	public void mostraInfo() {
		System.out.println("");
	}

	public void juga() {
		super.reiniciaPartida();
		int num;
		boolean continua = false;
		do {
			do {
				System.out.print("Esbrina un número entre 0 i 10: ");
				num = Teclado.llegeixEnter();
			} while (!validaNumero(num));
			if (num == this.numEncertar) {
				System.out.println("Encertaste!!");
				continua = true;
			} else {
				super.treureVida();
				if (super.treureVida()) {
					if (num < this.numEncertar) {
						System.out.println("El nombre a encertar és major al nombre introduït");
					} else {
						System.out.println("El nombre a encertar és menor al nombre introduït");
					}
				} else {
					System.out.println("GAME OVER");
					continua = false;
				}
			}
		} while (!continua);
	}
}