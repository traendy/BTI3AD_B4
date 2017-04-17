package pascal;

import java.math.BigInteger;

public class Benchmark {
	private static Counter counter = null;
	private static final int MAX_EXPONENT = 6;

	public static void main(String[] args) {
		counter = new Counter();
		doBenchMarktestsF();

	}

	private static void doBenchMarktestsF() {

		// TODO ADD Rekursiv
		PascalRekursiv pasr = new PascalRekursiv(counter);
		System.out.println("Rekursive Berechnung");
		for (int i = 0; i <= MAX_EXPONENT; i++) {
			pasr.pascalLoop(new BigInteger(String.valueOf((int) Math.pow(2, i))));
			System.out.println("10^" + i + "\t" + counter.getCounter());
		}

		counter.setCounter(BigInteger.ZERO);
		// TODO ADD Iterative
		PascalIterativ pasi = new PascalIterativ(counter);
		System.out.println("Iterative Berechnung");
		for (int i = 0; i <= MAX_EXPONENT; i++) {
			pasi.pascalBerechnungIterativ(new BigInteger(String.valueOf((int) Math.pow(2, i))));
			System.out.println("10^" + i + "\t" + counter.getCounter());
		}

		/**
		 * Calculation with binomial coefficient
		 */
		counter.setCounter(BigInteger.ZERO);
		PascalBinomial binom = new PascalBinomial(counter);
		System.out.println("Berechnung mit Binomialkoeffizient");
		for (int i = 0; i <= MAX_EXPONENT; i++) {
			binom.dreieck(new BigInteger(String.valueOf((int) Math.pow(2, i))));
			System.out.println("10^" + i + "\t" + counter.getCounter());
		}

	}

}
