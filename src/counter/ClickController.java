package counter;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

/**
 * Controller for the Counter buttons user interface.
 * @author Kunyaruk Katebunlu
 *
 */
public class ClickController {
	@FXML
	private Button plusbutton;
	@FXML
	private Button minusbutton;
	/** The counter that records button clicks. */
	private Counter counter;

	/**
	 * Set the counter.
	 * @param counter is the counter to set
	 */
	public void setCounter(Counter counter) {
		this.counter = counter;
	}
	
	/**
	 * Add 1 to the counter.
	 */
	public void plusButtonHandler(ActionEvent event) {
		counter.add(1);
	}
	
	/**
	 * Add -1 to the counter.
	 */
	public void minusButtonHandler(ActionEvent event) {
		counter.add(-1);
	}
}
