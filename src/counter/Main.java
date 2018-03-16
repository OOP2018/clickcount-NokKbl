package counter;
	
import java.net.URL;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.fxml.FXMLLoader;

/**
 * Create a JavaFX user interface with 1 input view
 * and 2 observers that show the counter value, so that all
 * the views refer to the same Counter object.
 * @author Kunyaruk Katebunlu
 */
public class Main extends Application {
	
	/**
	 * The start method is called after the init method has returned, and after the system is ready for the application to begin running.
	 * @param primaryStage the primary stage for this application, onto which the application scene can be set.
	 */
	@Override
	public void start(Stage primaryStage) {
		Counter counter = new Counter();
		
		try {
			URL url = getClass().getResource("ClickUI.fxml");
			if (url == null) {
				System.out.println("Couldn't find file: ClickUI.fxml");
				Platform.exit();
			}
			FXMLLoader loader = new FXMLLoader(url);
			Parent root = loader.load();
			ClickController controller = loader.getController();
			
			// Dependency Injection:
			controller.setCounter(counter);
			Scene scene = new Scene(root);
			primaryStage.setScene(scene);
			primaryStage.sizeToScene();
			primaryStage.setTitle("Click Counter");
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
			return;
		}
		
		ConsoleView view = new ConsoleView(counter);
		counter.addObserver(view);
		
		CounterView view2 = new CounterView(counter);
		view2.centerOnScreen();
		counter.addObserver(view2);
		view2.run();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
