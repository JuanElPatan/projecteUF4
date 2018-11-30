package joc.numeros;

public class Generador {

	public int GenerarPar() {
		int nombre = (int) (Math.random() * 10 + 1);
		
		if (nombre % 2 != 0) {
			if (nombre != 9) {
				nombre++;
			} else {
				if (!(nombre == 1)) {
					nombre--;
				}
			}
		}
		return nombre;
	}

	public int GenerarInpar() {
		int nombre = (int) (Math.random() * 10 + 1);

		if (nombre % 2 == 0) {
			if (nombre != 9) {
				nombre++;
			} else {
				if (!(nombre == 1)) {
					nombre--;
				}
			}
		}
		return nombre;
	}
}
