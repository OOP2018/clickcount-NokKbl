package counter;

import java.util.Scanner;

/**
 * Test the Observer-Observable behavior for Counter object.
 * @author Kunyaruk Katebunlu
 */
public class ObserverTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 1. create the subject (Observable)
		Counter counter = new Counter();
		// 2. create the observer with reference to subject
		ConsoleView view = new ConsoleView(counter);
		// 3. add observer to subject
		counter.addObserver(view);
		// 4. run the app
		while(true) {
			System.out.print("how much? ");
			int howmuch = sc.nextInt();
			counter.add(howmuch);
		}
	}
}
