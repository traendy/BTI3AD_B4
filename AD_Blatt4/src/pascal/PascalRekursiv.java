package pascal;

import java.math.BigInteger;

public class PascalRekursiv {

	private Counter counter = null;

	public PascalRekursiv() {
		super();
	}

	public PascalRekursiv(Counter c) {
		this();
		this.counter = c;
	}

	private void count() {
		if (counter != null) {
			counter.counterUp(BigInteger.ONE);
		}
	}

	public BigInteger pascalBerechnungRekursiv(BigInteger zeile, BigInteger spalte) {
		if (spalte.compareTo(BigInteger.ONE) == 0 || spalte.compareTo(zeile) == 0) {
			count();
			return BigInteger.ONE;
		}
		count();
		return pascalBerechnungRekursiv(zeile = zeile.subtract(BigInteger.ONE), spalte).add(pascalBerechnungRekursiv(zeile = zeile.subtract(BigInteger.ONE), spalte = spalte.subtract(BigInteger.ONE))) ;
	}

	public BigInteger pascalLoop(BigInteger gesuchteZeile) {
		BigInteger zeile = (gesuchteZeile.subtract(BigInteger.ONE));
		BigInteger ergebnis = null;

		for (BigInteger spalte = BigInteger.ZERO; spalte.compareTo(zeile) <= 0; spalte = spalte.add(BigInteger.ONE)) {
			// System.out.print(pascalBerechnungRekursiv(zeile, spalte) + " ");
			ergebnis = pascalBerechnungRekursiv(zeile, spalte);
		}
		return ergebnis;
		
	}

	// public static void main(String[] args) {
	//
	// for (int index = 1; index <= 32; index++) {
	// pascalLoop(index);
	// System.out.println("\nAufwand: " + aufwand + "\n");
	//
	// }
	// }

}