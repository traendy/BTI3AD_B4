package pascal;

import java.math.BigInteger;

// TODO: Auto-generated Javadoc
/**
 * The Class Counter.
 *
 * @author Nils Eggebrecht
 * @class der Counter ist für die Aufwandsanalyse.
 */
public class Counter {

	/** counter ist der Zaehlwert fuer den Counter. */
	private BigInteger counter;

	/**
	 * Instantiates a new counter.
	 */
	// construtor
	public Counter() {
		counter = BigInteger.ZERO;
	}

	/**
	 * Gets the counter.
	 *
	 * @return the counter
	 */
	public long getCounter() {
		return counter.longValue();
	}

	/**
	 * Sets the counter.
	 *
	 * @param counter
	 *            the new counter
	 */
	public void setCounter(BigInteger counter) {
		this.counter = counter;
	}

	/**
	 * Counter up.
	 *
	 * @param add
	 *            gibt die Zahl an, um wie viel hochgezaehlt werden soll.
	 */
	public void counterUp(BigInteger add) {
		this.counter = counter.add(add);
	}

}
