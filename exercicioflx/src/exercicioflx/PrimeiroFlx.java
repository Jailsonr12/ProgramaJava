package exercicioflx;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class PrimeiroFlx extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		
		Button botaoA = new Button("A");
		Button botaoB = new Button("B");
		Button botaoC = new Button("C");

		
		HBox box = new HBox();
		box.setSpacing(10);
		box.setAlignment(Pos.CENTER);
		box.getChildren().add(botaoA);
		box.getChildren().add(botaoB);
		box.getChildren().add(botaoC);

		
		botaoC.setOnAction(e -> {
			System.out.println("botao 3");
			System.exit(0);
		});
		
		Scene unicaCene = new Scene(box, 150, 100);
		
		
		primaryStage.setScene(unicaCene);
		primaryStage.show();
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
