package clientControllers;

import java.io.IOException;
import javafx.application.Application;
import javafx.stage.Stage;

public class ClientUI_test extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {

		

		SetSceneController scene = new SetSceneController();
		scene.setScreen(new Stage(), "/clientGUI/AreaManager_MainView.fxml");
	}

	@Override
	public void stop() throws IOException {
	}

}
