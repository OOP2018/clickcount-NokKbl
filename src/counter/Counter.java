package counter;

/**
 * A simple counter.
 * @author Kunyaruk Katebunlu
 */
public class Counter extends java.util.Observable {
	private int count;
	
	/**
	 * Counter's constructor
	 */
	public Counter() {
		this.count = 0;
	}
	
	/**
	 * Count clicked number, set changed and notify all of its observers.
	 * @param howmuch is the value that will change.
	 */
	public void add(int howmuch) {
		count += howmuch;
		setChanged();
		notifyObservers();
	}
	
	/**
	 * Get the counter value.
	 * @return counter value
	 */
	public int getCount() {
		return count;
	}
}
