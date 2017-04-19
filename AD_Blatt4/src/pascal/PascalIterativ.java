package pascal;

import java.math.BigInteger;

public class PascalIterativ {

	private Counter counter = null;

	public PascalIterativ() {
		super();
	}

	public PascalIterativ(Counter c) {
		this();
		this.counter = c;
	}

	private void count() {
		if (counter != null) {
			counter.counterUp(1);
		}
	}

	public void pascalBerechnungIterativ(BigInteger N) {
		BigInteger[] vorherigeZeile;
		BigInteger[] zeile = { BigInteger.ONE };

		if (1 == N.intValue()) {
			count();
		}
		vorherigeZeile = zeile;
		for (int i = 2; i <= N.intValue(); i++) {
			zeile = new BigInteger[i];
			zeile[0] = BigInteger.ONE;

			count();

			zeile[i - 1] = BigInteger.ONE;
			for (int j = 0; j <= i - 3; j++) {
				zeile[j + 1] = vorherigeZeile[j].add(vorherigeZeile[j + 1]);
				count();
			}
			vorherigeZeile = zeile;
		}
	}
}
