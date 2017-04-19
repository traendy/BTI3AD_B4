package pascal;

import java.math.BigInteger;

public class Benchmark {
	private static Counter counter = null;
	private static final int MAX_EXPONENT = 10;

	public static void main(String[] args) {
		counter = new Counter();
		doBenchMarktestsF();

	}

	private static void doBenchMarktestsF() {

		
		PascalRekursiv pasr = new PascalRekursiv(counter);
		System.out.println("Rekursive Berechnung");
		for (int i = 0; i <= MAX_EXPONENT-5; i++) {
			pasr.pascalLoop(new BigInteger(String.valueOf((int) Math.pow(2, i))));
			System.out.println("2^" + i + "\t" + counter.getCounter());
		}

		counter.setCounter(0);
		PascalIterativ pasi = new PascalIterativ(counter);
		System.out.println("Iterative Berechnung");
		for (int i = 0; i <= MAX_EXPONENT; i++) {
			pasi.pascalBerechnungIterativ(new BigInteger(String.valueOf((int) Math.pow(2, i))));
			System.out.println("2^" + i + "\t" + counter.getCounter());
		}

		/**
		 * Calculation with binomial coefficient
		 */
		counter.setCounter(0);
		PascalBinomial binom = new PascalBinomial(counter);
		System.out.println("Berechnung mit Binomialkoeffizient");
		for (int i = 0; i <= MAX_EXPONENT; i++) {
			binom.dreieck(new BigInteger(String.valueOf((int) Math.pow(2, i))));
			System.out.println("2^" + i + "\t" + counter.getCounter());
		}

	}

}
