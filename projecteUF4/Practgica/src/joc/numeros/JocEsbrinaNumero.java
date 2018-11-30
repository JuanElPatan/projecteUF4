package joc.numeros;

import joc.JocAbstracte;
import joc.interfaz.Jugable;
import comu.Teclado;

public class JocEsbrinaNumero extends JocAbstracte implements Jugable {

	// Attributes
	private int numEncertar;

	// Constructor
	public JocEsbrinaNumero(int numVidesInicial, int numEncertar, String nom) {
		super(numVidesInicial, nom);
		this.numEncertar = numEncertar;
	}

	// Setters
	public void setNumEncertar(int numEncertar) {
		this.numEncertar = numEncertar;
	}

	// Methods
	public boolean validaNumero(int numero) {
		if (numero > 0 && numero < 10) {
			return true;
		} else {
			System.out.println("Numero no es entre el 0 o el 10, torna a probar.");
			return false;
		}
	}

	public void mostraNombre() {
		System.out.println("Esbrina un número qualsevol ja sigui par o impar.");
	}

	public void mostraInfo() {
		System.out.println("Esbrina un número entre el 0 i el 10 ja sigui par o impar amb un màxim de "
				+ super.getNumVidesActual() + " vides.");
	}

	public void juga() {
		super.reiniciaPartida();
		int num;
		boolean continua = true;
		do {
			do {
				System.out.print("Introdueix número: ");
				num = Teclado.llegeixEnter();
			} while (!validaNumero(num));
			if (num == this.numEncertar) {
				System.out.println("Encertaste!!");
				Teclado.pulsarTecla();
				Teclado.llegeixCadena();
				super.actualizaRecord();
				continua = false;
			} else {
				boolean vides = super.treureVida();
				if (vides) {
					super.mostraVidesRestants();
					
					if (num < this.numEncertar) {
						System.out.println("El nombre a encertar és major al nombre introduït");
					} else {
						System.out.println("El nombre a encertar és menor al nombre introduït");
					}
				} else {
					System.out.println("GAME OVER");
					Teclado.llegeixCadena();
					continua = false;
				}
			}
		} while (continua);
		if (super.getNumVidesActual() > 0) {
			super.setNumVidesInicial(super.getNumVidesActual());
			this.numEncertar = (int) (Math.random() * 10 + 1);
			juga();
		}
	}
}