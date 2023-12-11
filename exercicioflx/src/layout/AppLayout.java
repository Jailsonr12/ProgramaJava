package layout;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AppLayout extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {

		Parent raiz = null;
//		raiz = new TesteAnchorPane();
//		raiz = new TesteBordePane();
//		raiz = new TesteFlowPane();
//		raiz = new TesteGridPane();
//		raiz  = new TesteStackPane();
		raiz = new TesteTilepane();

		Scene principal = new Scene(raiz, 800, 600);

		primaryStage.setScene(principal);
		primaryStage.setTitle("Gerenciador de Layout");
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}